import React from "react";
import './App.css';
import Routing from "./Components/Routes/Routes";
// import BillerRegister from "./Components/BillerRegister";
// import BillerProvider from "./Components/BillerProvider";
// import BillerStatement from "./Components/BillerStatement";
import 'bootstrap/dist/css/bootstrap.min.css';



const App = () => {
  return (
    <div>
  
        {/* <BillerRegister/> */}
        {/* <BillerProvider/> */}
        {/* <BillerStatement/> */}
        <Routing/>
     
    </div>
  );
}

export default App;
