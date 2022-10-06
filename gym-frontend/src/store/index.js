import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

import user from "./modules/user.store.js";
import admin from "./modules/admin.store.js";

export default new Vuex.Store({
  modules: {
    user,
    admin,
  },
});
