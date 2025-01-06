import axios from 'axios';
import React, { useState } from 'react';

const App = () => {
  const url = 'http://localhost:8080/user';
  const [data, setData] = useState();

  async function fetchUsers() {
    return await axios.get(`${url}/getAll`);
  }

  const getUsers = async () => {
    try {
      const response = await fetchUsers(); 
      setData(response.data); 
    } catch (error) {
      console.error("Error fetching users", error);
    }
  };

  return (
    <div>
      <button onClick={getUsers}>Click</button>
      <p>{data ? JSON.stringify(data) : 'No data available'}</p>
    </div>
  );
};

export default App;
