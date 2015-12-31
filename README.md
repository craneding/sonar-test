#### Maven集成Sonar
修改maven的主配置文件（${MAVEN_HOME}/conf/settings.xml文件或者 ~/.m2/settings.xml文件），在其中增加访问Sonar数据库及Sonar服务地址，添加如下配置：
```
<profile>

<id>sonar</id>

<properties>

    <sonar.jdbc.url>jdbc:mysql://localhost:3306/sonar</sonar.jdbc.url>

    <sonar.jdbc.driver>com.mysql.jdbc.Driver</sonar.jdbc.driver>

    <sonar.jdbc.username>sonar</sonar.jdbc.username>

    <sonar.jdbc.password>sonar</sonar.jdbc.password>

    <sonar.host.url>http://localhost:9000</sonar.host.url> <!-- Sonar服务器访问地址 -->

</properties>

</profile>

<activeProfiles>

  <activeProfile>sonar</activeProfile>

</activeProfiles>
```

#### Maven运行
```
mvn clean verify sonar:sonar
```