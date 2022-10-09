export default {
  getUsers: () => {
    return axios.get("/user");
  },
};
