

This is a simple application using spring-boot, vue.js and websockets.
It displays random real-time data on a table every second.
 


## Run with docker 🏃🐳
1. Build docker image

```sh
cd spring-boot-vuejs-websockets
docker build -t spring-boot-vuejs-websockets .
```
2. Run 

```sh
docker run -p 8080:8080 -it spring-boot-vuejs-websockets
```
3. Visit `http://localhost:8080` 🙏

