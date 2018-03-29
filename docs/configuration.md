# EnvContext Guide

## Summary

This SDK uses a structure called "EnvContext" to store and manage configuration.

Except for AccessKeyID and SecretAccessKey, you can also configure the API servers for private cloud usage scenario. All available configureable items are list in default configuration file.

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

Change API server

```
EnvContext  moreEnv = new EnvContext("ACCESS_KEY_ID", "SECRET_ACCESS_KEY");

moreEnv.setProtocol("https");
moreEnv.setHost("api.private.com");
moreEnv.setPort(443);
moreEnv.setUri("/iaas");
```
