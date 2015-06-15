# InterceptorExampleCDISpring
Implementation of CDI and Spring working together. Based on http://niklasschlimm.blogspot.com.es/2011/08/jsr-299-cdi-interceptors-for-spring.html

Example using interceptors with CDI integrated in a Spring context. This is just a very simple example showing how to intercept a method in JavaEE and, in this case, interrupt the method if needed.

Although it's quite stupid I hope it helps somebody. I created this example as a Prove of Concept for one of my projects in which in test scope I had to steal a message from a flow and prevent it from continuing its normal path.

To test it just run the JUnit test.
