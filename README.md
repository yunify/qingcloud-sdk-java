# QingCloud SDK for Java



The official QingCloud SDK for the Java programming language.

## Getting Started

### Preparation

Before your start, please login to [QingCloud Console](https://console.qingcloud.com/access_keys/) to create a pair of QingCloud API AccessKey.

___API AccessKey Example:___

``` yaml
qy_access_key_id: QYACCESSKEYIDEXAMPLE
qy_secret_access_key: SECRETACCESSKEY
```

### Installation

Add below dependency in your pom file

```xml
<dependency>
    <groupId>com.qingcloud</groupId>
    <artifactId>qingcloud-sdk-java</artifactId>
    <version>1.2.0</version>
</dependency>
```

For more information, please refer to [maven page](https://search.maven.org/#artifactdetails%7Ccom.qingcloud%7Cqingcloud-sdk-java%7C1.0.0%7Cjar)

### Usage

Now you are ready to code. You can read the detailed guides in the list below to have a clear understanding.

*Quick start code example*

```java
public class InstanceTest {
    private static Logger logger = LoggerFactory.getLogger(InstanceTest.class);

    @Test
    public void testDescribeInstances() {
        EnvContext context = new EnvContext("ACCESS_KEY_ID_EXAMPLE", "SECRET_ACCESS_KEY_EXAMPLE");
        context.setProtocol("https");
        context.setHost("api.qingcloud.com");
        context.setPort("443");
        context.setZone("pek3b");
        context.setApiLang("zh-cn"); // optional, set return message i18n, default to us-en
        InstanceService service = new InstanceService(context);

        InstanceService.DescribeInstancesInput input = new InstanceService.DescribeInstancesInput();
        input.setLimit(1);

        try {
            InstanceService.DescribeInstancesOutput output = service.describeInstances(input);
            for (Types.InstanceModel model : output.getInstanceSet()) {
                System.out.println("==================");
                System.out.println(model.getInstanceID());
                System.out.println(model.getInstanceName());
                System.out.println(model.getImage().getImageID());
                for (Types.NICVxNetModel vxNetModel : model.getVxNets()) {
                    System.out.println("==================");
                    System.out.println(vxNetModel.getVxNetID());
                    System.out.println(vxNetModel.getVxNetType());
                }
            }
        } catch (QCException e) {
            e.printStackTrace();
        }
    }
}
```


- [Configuration Guide](docs/configuration.md)
- [QingCloud Service Usage Guide](docs/qingcloud_service_usage.md)

Checkout our [releases](https://github.com/yunify/qingcloud-sdk-java/releases) and [change logs](https://github.com/yunify/qingcloud-sdk-java/blob/master/CHANGELOGS) for information about the latest features, bug fixes and new ideas.

## Reference Documentations

- [QingCloud Documentation Overview](https://docs.qingcloud.com)
- [QingCloud IaaS APIs](https://docs.qingcloud.com/product/api/)

## Contributing

This repository was automatically generated, please contribute to [`Snips`](https://github.com/yunify/snips) instead.

## LICENSE

The Apache License (Version 2.0, January 2004).
