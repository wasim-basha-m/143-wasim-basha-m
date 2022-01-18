import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class Calculator extends React.Component
{
  constructor()
  {
    super();
    this.handlerC = this.handlerC.bind(this);
    
    this.state={
      a:"",
      b:"",
      cal:'',
      ans:"",
    }
  }
  handlerC(cal)
  {
    var ans;
    var a= document.getElementById("a").value;
    var b=document.getElementById("b").value;
    a=parseInt(a);
    b=parseInt(b);
    switch(cal)
    {
      case "+":ans=a+b;
              break;
      case "-":ans=a-b;
              break;
      case "*":ans=a*b;
                break;
      case "/":ans=a/b;
                break;
      default :
      break;
    }
   this.setState(({
      a:a,
      b:b,
      ans:ans,
      cal:cal
   }));
  }  

  render()
  {
    return(
    <>
   <table>
     <tr>
   <h2>{this.state.a} {this.state.orp} {this.state.b} = {this.state.ans} </h2>
   </tr>
   <tr> <input  id="a" type="text" defaultValue={this.state.a}/></tr>
   <tr> <input  id="b" type="text" defaultValue={this.state.b}/></tr>
   </table>
   <button id="inr" onClick={()=>this.handlerC("+")} >+</button>
   </>
   );
}}

ReactDOM.render(  
  <Calculator /> ,
document.getElementById('root')
);