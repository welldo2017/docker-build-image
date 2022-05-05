# 将 java app 构建成 docker 镜像的方式
###### 作者:welldo2017

### 1.spotify 公司的产品
1. docker-maven
>Spotify官方已经不再推荐使用该插件  
此插件，不需要写 Dockerfile，而是将Dockerfile中的配置写到pom文件的插件中，  
较麻烦。

2.dockerfile-maven（推荐）
>git地址：  
https://github.com/spotify/dockerfile-maven  
>
>使用的前置条件  
>+ 编写 Dockerfile 文件
>+  docker daemon（本地/服务器端 都可）  
>
>详细使用方式，请参考 本工程的spotify子工程的pom文件，和Dockerfile文件。  
<a href="https://github.com/welldo2017/docker-build-image/blob/master/spotify/%E4%BD%BF%E7%94%A8%E6%96%B9%E5%BC%8F.txt" >使用方式</a>


### 2.Google 公司的产品
* jib（推荐）
>git地址  
https://github.com/GoogleContainerTools/jib  
>
>使用方式:  
请参考 本工程的 google 子工程的pom文件.  
<a href="https://github.com/welldo2017/docker-build-image/blob/master/google/%E4%BD%BF%E7%94%A8%E6%96%B9%E5%BC%8F.txt" >使用方式</a>
>
>简介  
Jib为您的Java应用程序构建优化的Docker和OCI镜像  
而无需依赖Docker daemon，也无需深入掌握Docker。 
> 
>（注：OCI，Open Container Initiative即开放容器计划，是一个规范。  
Docker使用OCI规范，但它只涵盖了该规范大约5%的内容，Docker是OCI的创始成员，贡献了初始代码库
）

### 3.spring 的产品
+ spring-boot-maven-plugin  
>官网地址  
https://docs.spring.io/spring-boot/docs/2.4.0/maven-plugin/reference/htmlsingle/#build-image  
>
>使用 build-image 的前置条件  
>+ 私服 
>+  docker daemon（本地/服务器端 都可）默认为本地；  
  
方式
    
    <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <executions>
            <execution>
                <goals>
                    <goal>build-image</goal>
                </goals>
            </execution>
        </executions>
    </plugin>
> 本工程不做演示。
