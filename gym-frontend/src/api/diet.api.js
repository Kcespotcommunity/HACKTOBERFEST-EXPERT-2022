export default {
  getDiets: () => {
    return axios.get("/diet");
  },
};
