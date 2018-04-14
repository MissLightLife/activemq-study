## JMS 模型
Java 消息服务应用程序结构支持两种模型：点对点或队列模型与发布/订阅模型。Apache ActiveMQ 是一个开源的 JMS 提供者，用来管理会话和队列。

### 点对点或队列模型

在点对点或队列模型下，一个生产者向一个特定的队列发布消息，一个消费者从该队列中读取消息。
<img src="https://img-blog.csdn.net/20180414160428907?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NvZGVqYXM=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70">

 - <font size=3>只有一个消费者将获得消息。

 - <font size=3>生产者不需要在接收者消费该消息期间处于运行状态，接收者也同样不需要在消息发送时处于运行状态。

 - <font size=3>每一个成功处理的消息都由接收者签收。
 
 ### 发布者／订阅者模型
 
 发布者／订阅者模型支持向一个特定的消息主题发布消息。
<img src="https://img-blog.csdn.net/20180414160436368?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NvZGVqYXM=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70">

 - <font size=3>多个消费者可以获得消息。

 - <font size=3>在发布者和订阅者之间存在时间依赖性。发布者需要建立一个订阅（subscription），以便客户能够购订阅。订阅者必须保持持续的活动状态以接收消息，除非订阅者建立了持久的订阅。在那种情况下，在订阅者未连接时发布的消息将在订阅者重新连接时重新发布。

## activemq-study

### activemq-test-demo
使用 ActiveMQ 与 JMS 原生 API 简单实现了点对点或队列模型与发布者／订阅者模型。

### activemq-spring-demo
Spring 与 ActiveMQ 的集成，实现了点对点或队列模型与发布者／订阅者模型的简单 demo。

## other

视频教程地址：<br>
imooc：<a href="https://www.imooc.com/learn/856" target="_blank">https://www.imooc.com/learn/856</a><br>
可参考博文：<br>
什么是消息队列：<a href="https://blog.csdn.net/codejas/article/details/79930909" target="_blank">https://blog.csdn.net/codejas/article/details/79930909</a><br>
ActiveMQ简单集成Spring：<a href="https://blog.csdn.net/codejas/article/details/79940261" target="_blank">https://blog.csdn.net/codejas/article/details/79940261</a>
