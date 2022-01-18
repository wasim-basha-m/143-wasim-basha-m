import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';

class Calculator extends React.Component
{
  constructor(props)
  {
    super(props);
    this.state = {
      a : parseInt(props.a),
      b : parseInt(props.b),
      result:0,
      msg:""
    };
    this.AddHandler = this.AddHandler.bind(this);
    this.SubHandler = this.SubHandler.bind(this);
    this.MulHandler = this.MulHandler.bind(this);
    this.divHandler = this.divHandler.bind(this);
  }

  AddHandler()
  {

    this.setState(i =>(
      {result:i.a+i.b,
       msg: "ADD = "}
    ));
    

  }
  SubHandler()
  {
    this.setState(i =>(
      {result : i.a-i.b,
        msg: "SUB = "}
    ));

    
  }

  MulHandler()
  {
    this.setState(i=>(
      {result : i.a*i.b,
        msg: "MUL = "}
    ));
   
  }

  divHandler()
  {
    this.setState(i=>(
      {result : i.a/i.b,
        msg: "DIV = "}
    ));
    
  }

  render()
  {
    return(<>
     <h1>{this.state.msg}={this.state.result}</h1>
      <button onClick={this.AddHandler}>Add</button>
    <button onClick={this.SubHandler}>Sub</button> 
   <button onClick={this.MulHandler}>Mul</button>
    <button onClick={this.divHandler}>Div</button>
    
    </>
    );
  }
}

ReactDOM.render(
  <Calculator a="40" b="70"/>,
  document.getElementById("root")
);
reportWebVitals();
