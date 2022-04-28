# 将 java app 构建成 docker 镜像的方式
###### 作者:welldo2017

### 1.spotify 公司出品
1. docker-maven
>Spotify官方已经不再推荐使用该插件  
此插件，不需要写 Dockerfile，而是将DF中的配置写到插件中，较麻烦。

2.dockerfile-maven
>git地址：  
https://github.com/spotify/dockerfile-maven  
此插件，需要写 Dockerfile，和依赖服务器端的docker daemon


### 2.Google公司出品
jib
>git地址  
https://github.com/GoogleContainerTools/jib  
>
>简介  
Jib为您的Java应用程序构建优化的Docker和OCI镜像  
而无需依赖Docker daemon，也无需深入掌握Docker。 
> 
>（注：OCI，Open Container Initiative即开放容器计划，是一个规范。  
Docker使用OCI规范，但它只涵盖了该规范大约5%的内容，Docker是OCI的创始成员，贡献了初始代码库
）
