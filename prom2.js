const prom5 =new Promise(function(resolve,reject){
    setTimeout(function(){
        console.log("-Hey Async w/o Variable - Prom2 After setTimeout");
        let error = true;
        if(!error){
                resolve({username:'Javascript',pass:'1234'});
                console.log("In Log - Prom5");
        } else{
            reject("Error: JS not found - Prom5");
        }
    },2000);
})

prom5.then(function(user){
    console.log("--",user);
}).catch(function(error){
    console.log("--",error);
}).finally(function(){
    console.log("In finally");
})

// async function consumeProm5(){
//     const response=  await prom5;
//     console.log("## Response - Async",response);
// }
// consumeProm5();

async function cosumeProm5A(){
    
    try{const response=  await prom5;
        console.log("@@-- Try Response - Async",response);

    }catch(err){
        console.log('@@-- Try',err);
    }
}

cosumeProm5A()