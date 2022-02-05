import axios from "axios";

export default function request(id) {
  axios
    .get("https://jsonplaceholder.typicode.com/users/" + id)
    .then(function (response) {
      console.log(response.data);
    })
    .catch(function (error) {
      console.log(error);
    });
};

