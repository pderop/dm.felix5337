This project is used to reproduce the issue reported at https://issues.apache.org/jira/browse/FELIX-5337.

Basically, two versions of the same service are registered in the osgi registry: 

service.Service (version v1)
service.Service (version v2)

now, a catchall.withapi bundle tries to lookup all services, using filter "(objectClass=*)": this works.
but the catchall.withannotation bundle is not able to lookup all services, using @ServiceDependency(filter"=(objectClass=*).
