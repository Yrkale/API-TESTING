import React, {useEffect, useState} from "react";

 

function App() {

  const [message, setMessage] = useState({}); // get api

  const [postResponse, setPostResponse]= useState({});

  // get api data
  useEffect(() =>{
    fetch("http://localhost:8081/hello")
    .then((Response) => Response.json())
    .then((data) => setMessage(data))
    .catch((error) => console.error("Error:", error));

  },[]);


 // post api data
 const sendPostRequest = () => {

  fetch("http://localhost:8081/hello",{
    method: "POST",
    headers: {"Content-Type": "application/json"},
    body: JSON.stringify({ text: "Learing React + Spring Boot", status: "Excited"})
  })
  .then((Response) => Response.json())
  .then((data) => setPostResponse(data))
  .catch((error) => console.error("Error: ", error));

 }; 



  return (
    <div  style={{textAlign: "center", marginTop: "50px"}}>

      <h1>React + Spring Boot</h1>


      <h2>Get Response</h2>
      <p>Text: {message.text}</p>
      <p>Status: {message.status}</p>

      <button onClick={sendPostRequest}> send post request</button>

      <h2>POST Response</h2>
      <p>Text: {postResponse.text}</p>
      <p>Status: {postResponse.status}</p>
       
    </div>
  );
}

export default App;
