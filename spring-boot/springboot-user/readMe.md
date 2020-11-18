spring-boot/images/springboot初始化步骤.PNG
### 一. spring initializer 加载顺序
```$xslt
thirdInitializer
firstInitializer
secondInitializer
```
从日志中的打印顺序来看：
application.yml配置文件中的加载优先级>META-INF/spring-factories>SpringbootUserApplication

### 二，SpringFactoriesLoader spring工厂加载器
1. 是框架内部使用的通用工厂加载机制
2. 从classpath下多个jar包特定的位置读取文件
3. 文件内容必须是kv形式，即properties类型
4. key是全限定名（抽象类|接口）、value是实现类，多个实现类，用,分开
