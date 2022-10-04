import Vue from "vue";
import App from "./App.vue";

import store from "./store/index.js";
import router from "./router/index";

Vue.config.productionTip = false;

new Vue({
  store,
  router,
  render: (h) => h(App),
}).$mount("#app");
