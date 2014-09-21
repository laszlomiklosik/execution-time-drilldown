The purpose of this mini-project is to gather method execution times from Java applications in a crosscutting way (without modifying each method that needs to be profiled).
A complementary idea is to drill down the method execution times to the methods called (directly or indirectly) by the profiled method.

Motivation:
- While there are multiple profiler tools which allow getting insight into method execution times via CPU profiling and sampling, but they do not provide history and cannot be easily integrated in a Continuous Integration environment.
- Most off-the-shelf APM (Application Performance Management / Monitoring) tools currently available were designed for web applications (Business Transaction = a web request), and are not open source / free.
- Off-the-shelf solutions are not customizable enough.
- It's interesting to find out how these products work :)
- The end goals is to create awareness of the method execution times and their trend in development teams using the usual Continuous Integration environment.
 (For example answer questions like: is my application significantly slower then yesterday? If yes, which profiled method is slower, how much slower it is and where is the bottleneck).

Main ideas:
- Separate as much as possible the "data gathering" and "data visualization" steps so that they can be reused separately.
- Use method interceptors (which is easy if the application can use Spring AOP / Guice AOP or iPojo dependecy injection).
- (Asynchronuously) log the method durations and method call traces to a log file (or a NoSQL database if logging becomes too heavy).
- Import the data in ElasticSearch / Kibana for visualization.

Possible future evolutions:
- Usage of a Java agent (together Javaassist or ASM bytecode manipulation) instead of AOP which might have higher impact on performance than acceptable.
- More details on the possible usage of a Java agent are very well explained in this presentation from New Relic: http://www.slideshare.net/InfoQ/living-in-the-matrix-with-bytecode-manipulation
