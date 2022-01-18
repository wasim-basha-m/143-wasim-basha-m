import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';


function Addition(props){
  let result = parseInt (props.a) + parseInt (props.b);
  let result1= props.a - props.b;
  let result2= props.a * props.b;
  let result3= props.a / props.b;
  return <h1> calculation {props.a} and {props.b} add = {result} sub ={result1} mul = {result2} div = {result3}</h1>
  
}

ReactDOM.render(  
    <Addition a='10' b='20'/>,

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
