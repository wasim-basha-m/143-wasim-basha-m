import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//working with style

function MyBorder(props){
  return(
    
    <div className={'MyBorder MyBorder-'+ props.color}>
      {props.children} 
    </div>  
 );
}

 function MouseOver(event) {
   event.target.style.borderColor="black";
 }
function MouseOut(event){
   event.target.style.borderColor="";
 }


function MyDialogBox(){
  return(
    <div  onMouseOver={MouseOver} onMouseOut={MouseOut}>
      <MyBorder color="green" >
        <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
        <p className='MyDialog-message'>This content is from First Dialog Box.</p>
      </MyBorder>
      <MyBorder color="red">
        <h1 className='MyDialog-title'>Welcome to Second Dialog Box.</h1>
        <p className='MyDialog-message'>This content is from Second Dialog Box.</p>
      </MyBorder>
      <MyBorder color="blue">
        <h1 className='MyDialog-title'>Welcome to Third Dialog Box.</h1>
        <p className='MyDialog-message'>This content is from Third Dialog Box.</p>
      </MyBorder>
    </div>    
  );
}

ReactDOM.render(  
  <MyDialogBox /> ,
document.getElementById('root')
);