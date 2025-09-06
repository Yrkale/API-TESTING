import React, {useEffect, useState} from "react";

 

function App() {

  const [message, setMessage] = useState({});

  useEffect(() =>{
    fetch("http://localhost:8081/hello")
    .then((Response) => Response.json())
    .then((data) => setMessage(data))
    .catch((error) => console.error("Error:", error));

  },[]);

  return (
    <div  style={{textAlign: "center", marginTop: "50px"}}>

      <h1>React + Spring Boot</h1>
      <p>Text: {message.text}</p>
      <p>Status: {message.status}</p>
       
    </div>
  );
}

export default App;
