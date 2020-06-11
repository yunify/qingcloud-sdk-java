# EnvContext Guide

## Summary

This SDK uses a structure called "EnvContext" to store and manage configuration.

Except for AccessKeyID and SecretAccessKey, you can also configure the API servers for private cloud usage scenario. All available configurable items are list in default configuration file.

___Default EnvContext File:___

``` yaml
# QingCloud services configuration

access_key: 'ACCESS_KEY_ID'
access_secret: 'SECRET_ACCESS_KEY'

host: 'api.qingcloud.com'
port: 443
protocol: 'https'
uri: '/iaas'
connection_retries: 3

# Valid log levels are "debug", "info", "warn", "error", and "fatal".
log_level: 'warn'
```

## Usage

Just create a config structure instance with your API AccessKey, and initialize services that you need using getSubServiceXXX() function of target service.

### Code Snippet

Create default EnvContext

```
EnvContext evn = EnvContext.loadFromFile("path to yaml");
```

Create EnvContext from AccessKey

```
EnvContext  evn = new EnvContext("ACCESS_KEY_ID", "SECRET_ACCESS_KEY");
```

Create EnvContext without AccessKey and SecretAccessKey:
- First, you need to go to our IAM service, create an instance role and attach it to your instance.
- Then create EnvContext without AccessKey and SecretAccessKey either by

```
EnvContext  evn = new EnvContext("", "");
```
or **NOT** including access_key and access_secret fields in EnvContext file and create EnvContext from yaml file.

Note that you can configure your own credential proxy url (where you retrieve token) in yaml file like this: 

```yaml
credential_proxy_protocol: http
credential_proxy_host: 169.254.169.254
credential_proxy_port: 80
credential_proxy_uri: /latest/meta-data/security-credentials
```

Change API server

```
EnvContext  moreEnv = new EnvContext("ACCESS_KEY_ID", "SECRET_ACCESS_KEY");

moreEnv.setProtocol("https");
moreEnv.setHost("api.private.com");
moreEnv.setPort(443);
moreEnv.setUri("/iaas");
```
