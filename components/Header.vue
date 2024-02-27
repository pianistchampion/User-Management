
<template>

  <div style="font-size: 12px;line-height: 60px; display: flex;">
  <div style="flex: 1;">
    <span :class="collapseBtnClass" style="cursor: pointer; font-size:18px" @click="collapse"></span>

      <el-breadcrumb separator="/" style="display: inline-block;margin-left: 15px">
        <el-breadcrumb-item :to="{ path:'/'}" >首页</el-breadcrumb-item>
        <el-breadcrumb-item>{{ currentPathName }}</el-breadcrumb-item>
      </el-breadcrumb>

  </div>
  <el-dropdown style="width: 70px;cursor: pointer">
    <div>
      <img :src="user.avatarUrl" alt=""
      style="width: 30px; border-radius: 50%;position: relative;top:10px;right: 5px;">
    <span>{{ user.nickname }}</span><i class="el-icon-arrow-down" style="margin-left: 5px"></i>
    </div>
    <el-dropdown-menu slot="dropdown" style="width: 100px;text-align: center">
      <el-dropdown-item style="font-size: 14px;padding: 5px 0">个人信息</el-dropdown-item>
      <el-dropdown-item  style="font-size: 14px;padding: 5px 0">
        <router-link to="/login" style="text-decoration: none">退出</router-link>
      </el-dropdown-item>
    </el-dropdown-menu>
  </el-dropdown>
  </div>
</template>
<script>
import {defineComponent} from 'vue'
import user from "../views/User.vue";

export default defineComponent({
  name: "Header",
  props:{
    collapseBtnClass:String,
    collapse:"",
  },
  computed:{
    // user() {
    //   return user
    // },
    currentPathName(){
      return this.$store.state.currentPathName;//需要监听的数据
    }
  },
  data(){
    return{
      user:localStorage.getItem("user")? JSON.parse(localStorage.getItem("user")):{}
    }
  },
  methods:{
    collapse(){
      this.$emit("asideCollapse")
    }
  },
  // watch:{
  //   currentPathName (newVal,oldVal){
  //     console.log(newVal)
  //   }
  // },
})
</script>
