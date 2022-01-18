import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//function based component and class based component difference is -->state
//function based component are stateles
//class based component are stateful

//React Hooks
// technique to use stateful behaviour in function based components
//useState Hook
//Returns a stateful value, and a function to update it.

function MyCalculatorWithHook(props){

  const[first] = useState(props.a);
  const[second] = useState(props.b);
  const[resultadd,setResultadd] = useState(0);
  const[resultsub,setResultsub] = useState(0);
  const[resultmul,setResultmul] = useState(0);
  const[resultdiv,setResultdiv] = useState(0);
  

  const handleResultadd = () =>{
    setResultadd(parseInt(first)+parseInt(second));
  }
  const handleResultsub = () =>{
    setResultsub(parseInt(first)-parseInt(second));
  } 
  const handleResultmul = () =>{
    setResultmul(parseInt(first)*parseInt(second));
  }
  const handleResultdiv = () =>{
    setResultdiv(parseInt(first)/parseInt(second));
  }
  return(
    <div>
      <form>
      <input type="text" value={this.state.first} onChange={this.handleChange}/>
      <input type="text" value={this.state.second} onChange={this.handleChange}/>
      <p>Addition of {first} and {second} is {resultadd}</p>
      <button onClick={handleResultadd}>Add</button>
      <p>Subtraction of {first} and {second} is {resultsub}</p>
      <button onClick={handleResultsub}>Subtract</button>
      <p>Multiplication of {first} and {second} is {resultmul}</p>
      <button onClick={handleResultmul}>Multiply</button>
      <p>Division of {first} and {second} is {resultdiv}</p>
      <button onClick={handleResultdiv}>Divide</button>
      </form>
    </div>
  );

}

ReactDOM.render(  
  <MyCalculatorWithHook a="10" b="20" /> ,
document.getElementById('root')
);