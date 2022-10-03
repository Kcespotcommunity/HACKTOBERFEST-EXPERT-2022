import Vue from 'vue'
import Router from 'vue-router'

import HomePage from "../pages/HomePage.vue"
import DashBoardPage from "../pages/DashBoardPage.vue"
import PageNotFound from "../pages/PageNotFound.vue"
Vue.use(Router)

const router = new Router({
    mode: "history",
    routes:[
        {
          path:"",
          name:"HomePage",
          component:HomePage
        },
        {
            path:"/dashboard",
            name:"DashBoardPage",
            component:DashBoardPage
        },
        {
            path:"/*",
            name:"PageNotFound",
            component:PageNotFound
        }
    ]
})

export default router