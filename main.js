import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import './assets/gloable.css'
import request from "@/utils/request";
import axios from "axios";
import store from "@/store";

Vue.config.productionTip = false
Vue.use(ElementUI,{size:"mini"});
Vue.prototype.request=request
// /a/b : /api/a/b => /a/b
// axios.defaults.baseURL = '/api';


new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')