<template>
  <div>
    <div class="row">
      <div class="col-4 mx-auto">
        <div class="card">
          <div class="card-header">
            <h4 style="text-align: left">Register here</h4>
          </div>
          <div class="card-body">
            <form>
              <div class="mb-3">
                <label for="exampleInputText" class="form-label">Name</label>
                <input
                  type="text"
                  class="form-control"
                  id="exampleInputText"
                  aria-describedby="Text"
                />
              </div>
              <div class="mb-3">
                <label for="exampleInputEmail" class="form-label"
                  >Email id</label
                >
                <input
                  type="email"
                  class="form-control"
                  id="exampleInputEmail"
                  aria-describedby="email"
                />
              </div>
              <div class="dropdown">
                <a
                  class="btn btn-secondary dropdown-toggle"
                  href="#"
                  role="button"
                  data-bs-toggle="dropdown"
                  aria-expanded="false"
                >
                  Select your subscription
                </a>

                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">6 months</a></li>
                  <li><a class="dropdown-item" href="#">12 months</a></li>
                </ul>
              </div>
              <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label"
                  >Password</label
                >
                <input
                  type="password"
                  class="form-control"
                  id="exampleInputPassword1"
                />
              </div>
              <div class="mb-3">
                <label for="exampleInputConfirmPassword1" class="form-label"
                  >Confirm Password</label
                >
                <input
                  type="password"
                  class="form-control"
                  id="exampleInputConfirmPassword1"
                />
              </div>
              <button type="submit" class="btn btn-primary">Submit</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "RegisterPage",
};
</script>

<style></style>
