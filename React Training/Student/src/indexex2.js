import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';

function Calc(props){
  let x=parseInt(props.a);
  let y=parseInt(props.b);
  let z=parseInt(props.c);
  let result = (x + y + z)/3;
  if (result>90){
  return <h1> A+ grade </h1>
} else if (result>80){
  return <h1> B+ grade </h1>
} else if (result>70){
  return <h1> c+ grade </h1>
} else{ 
  return <h1> Fail </h1> }
}


ReactDOM.render(  
  <Calc a="87" b="73" c="64"/>  , 
  document.getElementById('root')
);


// ReactDOM.render(
//   <React.StrictMode>
//     <App />
//   </React.StrictMode>,
//   document.getElementById('root')
// );

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
