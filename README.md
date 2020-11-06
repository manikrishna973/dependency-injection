# dependency-injection
*DI is used to delegate the object creation to the DI Frameworks like spring ,Dagger etc.

*By Default a singleton scope object will be created for all the classes which are annotated as spring components

*Using IOC objects creation can be outsourced and DI autowires the dependeny if its dependent bean is available as a spring bean

*DI which also provides loose coupling

*Implementations can be switched very easily

*As the defalut scope is singleton for the spring bean the same object will be autowired  wherever there is dependeny ,so there is no need to create a same class object Multiple times in different dependent classes. 
