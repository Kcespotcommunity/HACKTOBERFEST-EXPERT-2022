<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p>
      Thanks for joining the open source community! (KCEspot), For more information, <br />
      check out the
      <a href="https://github.com/Kcespotcommunity/HACKTOBERFEST-EXPERT-2022" target="_blank" rel="noopener">
        Github Readme of this project</a
      >.
    </p>
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    msg: String,
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}

a {
  color: #42b983;
}
</style>
