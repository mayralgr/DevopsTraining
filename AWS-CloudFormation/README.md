# Cloudformation yaml's for create:

- A VPC to contain the resources
- An Application load balancer
- An AutoScalingGroup 
- EC2's for the autoscaling group

### Formating
Cloud formation accepts json and yaml, this repo contains yaml files

### Resources
[AWS Template basics](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/gettingstarted.templatebasics.html)
[Template anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html)
[Cloudformation stack](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stack.html)


## Commands used in this folder

To validate the template
```
aws cloudformation validate-template --template-body file 
```
To check the cost of the template
```
aws cloudformation estimate-template-cost --template-body file --parameters ParameterKey=KeyName,ParameterValue=newcluster ParameterKey=InstanceType, ParameterValue= t2.micro
```
To create the stack
```
aws cloudformation create-stack --template-body file
```

To delete the stack
```
aws cloudformation delete-stack --stack-name stack-name
```