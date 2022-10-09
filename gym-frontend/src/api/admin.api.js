export default {
  getAdmins: () => {
    return axios.get("/admin");
  },
};
