


# Admin-System built with Java Spring Boot

打小热爱编程，大学初接触web开发，了解到了现在最为流行，强大的web框架Spring Boot，于是便开始了学习之旅。这个项目是我在学习Spring Boot过程中的一个练手项目，主要是一个后台管理系统，包括用户管理、角色管理、权限管理、菜单管理、日志管理等模块。一路走来开源社区给予了我很多帮助，我也希朝着开源的方向发展，将自己的项目开源出来，希望能够帮助到更多的人。

<!-- PROJECT LOGO -->
<br />

<p align="center">
  <a href="https://github.com/devinlovekoala/admin-system-demo-by-springboot">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>
<p align="center">
	<img src="https://img.shields.io/badge/JDK-1.8+-orange">
	<img src="https://img.shields.io/badge/SpringBoot-3.3.2.RELEASE-brightgreen">
	<img src="https://img.shields.io/badge/license-MIT-blue"> 
</p>

<h3 align="center">"优雅的SpringBoot后台管理系统样例"</h3>

## 目录

- [上手指南](#上手指南)
    - [开发前的配置要求](#开发前的配置要求)
    - [运行demo步骤](#运行demo步骤)
- [文件目录说明](#文件目录说明)
- [开发的架构](#开发的架构)
- [部署](#部署)
- [使用到的框架](#使用到的框架)
- [版本控制](#版本控制)
- [作者](#作者)
- [版权说明](#版权说明)
- [特别鸣谢](#特别鸣谢)

### 上手指南



###### 开发前的配置要求

1. JDK1.8版本及以上，最好为JDK17，参考安装路径：[https://www.oracle.com/java/technologies/javase-jdk17-downloads.html](https://www.oracle.com/java/technologies/downloads/#java17)
2. 推荐使用IDEA智能IDE，参考安装路径：[https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
3. Maven3.6.3版本及以上，参考安装路径：[https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

###### **运行demo步骤**

从远程github仓库克隆项目到本地:

```sh
git clone https://github.com/devinlovekoala/admin-system-demo-by-springboot.git
```

使用IDEA打开项目，等待maven依赖下载完成，运行项目，访问[http://localhost:8080](http://localhost:8080)即可看到项目首页

```sh


### 文件目录说明
#### (可以参考学习MVC模式的文件目录结构)

MVC模式学习参考：https://www.runoob.com/design-pattern/mvc-pattern.html

```
src
└── main
    ├── java
    │   └── com
    │       └── example
    │           └── admin
    │               └── controller
    │                   └── IndexController.java
    │                   └── LoginController.java
    │                   └── EmployeeController.java
    │                   └── LoginHandlerInterceptor.java
    │               └── dao
    │                   └── DepartmentDao.java
    │                   └── EmployeeDao.java
    │               └── pojo
    │                   └── Department.java
    │                   └── Employee.java
    └── resources
        ├── application.properties
        └── templates
            └── index.html
            └── dashboard.html
            └── emp
                └── list.html
                └── add.html
                └── update.html
            └── error
                └── 404.html

```

### 开发的架构

Java SpringBoot开源架构

请阅读开源代码仓库
[https://github.com/spring-projects/spring-boot](https://github.com/spring-projects/spring-boot)

### 部署

暂无

### 感谢以下所有开源资源和框架服务对本项目的支持

- [SpringBoot](https://spring.io/projects/spring-boot)
- [MVN依赖管理仓库](https://mvnrepository.com/)
- [前端BootStrap开源免费模板](https://mb.bootcss.com/)
- [狂神说SpringBoot系列学习](https://www.cnblogs.com/hellokuangshen/tag/SpringBoot%E7%B3%BB%E5%88%97/)



### 版本控制

该项目使用Git进行版本管理。您可以在repository参看当前可用版本。

### 作者

BUPT Devin

邮箱：buptdevin@gmail.com

*欢迎联系我提出建议意见，共同维护admin后台管理框架*

### 版权说明

该项目签署了MIT 授权许可，详情请参阅 [LICENSE.txt](https://github.com/shaojintian/Best_README_template/blob/master/LICENSE.txt)

### 特别鸣谢

感谢 [JetBrains](https://www.jetbrains.com/) 提供的 Student Pack License，本项目主要使用IDEA进行开发和版本控制

感谢上面提到的每个开源项目
