# spring-cloud-function-demo
spring-cloud-function-demo


## 测试

```shell script

## 测试失败
curl -H "Content-Type:text/plain" http://127.0.0.1:8080/add -d 20

## 测试失败
curl -H "Content-Type:text/plain" http://127.0.0.1:8080/uppercase -d '1fff'

## 测试成功
curl -H "Content-Type:text/plain" http://127.0.0.1:8080/greeter -d 'sss'
```


## 参考
- https://blog.csdn.net/zhulier1124/article/details/100133932