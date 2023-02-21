# Cloudformation yml's for create:

- A VPC to contain the resources
- An Application load balancer
- An AutoScalingGroup 
- EC2's for the autoscaling group

### Formating
Cloud formation accepts json and yml, this repo contains yml files

### Resources
[AWS Template basics](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/gettingstarted.templatebasics.html)

[Template anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html)

[Cloudformation stack](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html)

[AWS Cloudformation templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/sample-templates-services-us-east-1.html#w2ab1c35c52c13c41)

[VPC Single instance in subnet](https://s3.amazonaws.com/cloudformation-templates-us-east-1/VPC_Single_Instance_In_Subnet.template)

[VPC autoscaling with load balancer](https://s3.amazonaws.com/cloudformation-templates-us-east-1/VPC_AutoScaling_and_ElasticLoadBalancer.template)
## Commands used in this folder

To validate the template
```
aws cloudformation validate-template --template-body file://stack.yml 

# needs the next policy added to the user

{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "Stmt1449904348000",
            "Effect": "Allow",
            "Action": [
                "cloudformation:CreateStack"
            ],
            "Resource": [
                "*"
            ]
        }
    ]
}
```
To check the cost of the template
```
aws cloudformation estimate-template-cost --template-body file://stack.yml --parameters ParameterKey=KeyName,ParameterValue=newcluster ParameterKey=InstanceType, ParameterValue= t2.micro
```
To create the stack
```
aws cloudformation create-stack --template-body file://stack.yml --stack-name testvpc
```

To delete the stack
```
aws cloudformation delete-stack --stack-name stack-name
```

To package the template
```
aws cloudformation package --template-file stack.yml --s3-bucket mlgr-templates --output-template-file stack-template.yml
```

To deploy
```
aws cloudformation deploy --template-file /Users/myara.garcia/Documents/repos/DevopsTraining/AWS-CloudFormation/stack-template.yml --stack-name <YOUR STACK NAME>
```

To run the linter
```
cfn-lint vpc.yml    
```
[See more](https://github.com/aws-cloudformation/cfn-lint)