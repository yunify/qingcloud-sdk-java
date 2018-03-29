# QingCloud IaaS Service Usage Guide

Import and initialize QingCloud service with a context, and you are ready to use the initialized service.

Each API function take a Input struct and return an Output struct. The Input struct consists of request params, request headers and request elements, and the Output holds the HTTP status code, response headers, response elements and error message (if error occurred).

```
import com.qingcloud.sdk.common.config.EvnContext;
import com.qingcloud.sdk.request.iaas.*;
```

### Code Snippet

Initialize the QingCloud service with an envContext

```
String zone = "pek1";
QingCloud qcService = new QingCloud(envContext,zone)
```

Initialize the Instance sub service

```java
Instance instanceService = qcService.getSubServiceInstance();
```

DescribeInstances

```

Instance.DescribeInstancesInput input = new Instance.DescribeInstancesInput();

List ids = new ArrayList<>();
ids.add("i-wfwqn8id");
input.setInstances(ids);


DescribeInstancesOutput output = instanceService.DescribeInstances(input);


// Print HTTP ret code.
System.out.println(iOutput.getRetCode());

// Print the first instance ID.
System.out.println(getInstanceSet().get(0).getInstanceID());



```

DescribeInstances  make network requests through sub threads



```

AbstractResponseCallBack callback = new AbstractResponseCallBack() {
    @Override
    public void onAPIResponse(CallbackModel callbackModel) throws QcSdkException {
        DescribeInstancesOutput output = (DescribeInstancesOutput)callbackModel;
        // Print HTTP ret code.
        System.out.println(iOutput.getRetCode());

        // Print the first instance ID.
        System.out.println(getInstanceSet().get(0).getInstanceID());
        
    }
};

Instance.DescribeInstancesInput input = new Instance.DescribeInstancesInput();

List ids = new ArrayList<>();
ids.add("i-wfwqn8id");
input.setInstances(ids);


instanceService.DescribeInstances(input, callback);



