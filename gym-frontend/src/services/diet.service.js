import { baseUserUrl } from "@/contants/urls";
import axios from "axios";
import { getToken } from "@/utils/storage.js";

// axios.defaults.headers.common["Authorization"] = getToken();

let axiosInstance = axios.create({});

axiosInstance.interceptors.request.use(function (config) {
  const token = getToken();
  config.headers.Authorization = token;
  return config;
});
