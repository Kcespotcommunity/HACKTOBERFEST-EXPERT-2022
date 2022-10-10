<template>
    <div>
        <div class="row"> 
            <h3>Contact Us</h3>
            <hr>
        </div>
        <div class="row">
            <div class="col-3 mx-auto">
                <h3>LET'S GET TOGETHER</h3> 
            </div>
        </div>
        <div class="row">
  <div class="col-4 mx-auto">
    <input type="text" class="form-control" placeholder="First name" aria-label="First name">
  </div>
  <div class="col-4 mx-auto">
    <input type="text" class="form-control" placeholder="Last name" aria-label="Last name">
  </div>
</div><br>
<div class="row">
    <div class="col-4 mx-auto">
        <input type="text" class="form-control" placeholder="Email id" aria-label="Email id">
    </div>
    <div class="col-4 mx-auto">
  </div>
</div><br>
<div class="row">
    <div class="col-1 mx-auto">
    <button type="button" class="btn btn-outline-success">Submit</button>
    </div>
</div>
    </div>
</template>

<style scoped>
.row{
    text-align: left;
    margin-left: 10px;
}
hr{
    border-top: 2px solid #000000;
}
.btn{
    width: max-content;
}
</style>

<script>
export default {
    name: "ContactPage",
}
</script>