import Vue from "vue";
import Router from "vue-router";

import HomePage from "../pages/HomePage.vue";
import DashBoardPage from "../pages/DashBoardPage.vue";
import PageNotFound from "../pages/PageNotFound.vue";
import LoginPage from "../pages/LoginPage.vue";
import RegisterPage from "../pages/RegisterPage.vue";
Vue.use(Router);

const router = new Router({
  mode: "history",
  routes: [
    {
      path: "",
      name: "HomePage",
      component: HomePage,
    },
    {
      path: "/dashboard",
      name: "DashBoardPage",
      component: DashBoardPage,
    },
    {
      path: "/login",
      name: "LoginPage",
      component: LoginPage,
    },
    {
      path: "/register",
      name: "RegisterPage",
      component: RegisterPage,
    },
    {
      path: "/*",
      name: "PageNotFound",
      component: PageNotFound,
    },
  ],
});

export default router;
