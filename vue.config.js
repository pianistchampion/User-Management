const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  devServer:{
    host:'localhost', //域名
    port:8080, //端口
    proxy:{ //进行代理转发
      '/api':{
        //要解决跨域的接口的域名
        target:' http://localhost:8080/',
        // 是否开启本地代理 默认true; 如果接口跨域，需要进行此参数配置
        changeOrigin:true,
        //如果是https接口，需要配置这个参数
        secure:false,
        pathRewrite:{
          '/api':'' //重写地址
        }
      }
    }
  },
})




