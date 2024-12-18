// async function getAllUsers(){
//      try {
//  const response = await fetch('https://reqres.in/api/users?page=2')
//      const data = await response.json()
//      console.log(data);
//     // console.log(response)
//      } catch (error) {
//          console.log("Error : ", error);
//      }
// }
// getAllUsers();

fetch('https://reqres.in/api/users?page=2')
.then((response)=>{
    return response.json()
}).then((data)=>{
    console.log(data);
})
.catch((error)=> console.log(error));



fetch('https://randomuser.me/api/')
.then((response)=>{
    return response.json()
}).then((data)=>{
    console.log(data);
})
.catch((error)=> console.log(error));