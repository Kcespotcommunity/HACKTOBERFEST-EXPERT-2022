<template>
  <div id="app">
    <img alt="Vue logo" width="80" src="https://avatars.githubusercontent.com/u/91677148?v=4" />
    <HelloWorld msg="Welcome to Hacktoberfest 2023 x KCEspot Community" />
  </div>
</template>

<script>
import HelloWorld from "./components/HelloWorld.vue";

export default {
  name: "App",
  components: {
    HelloWorld,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
