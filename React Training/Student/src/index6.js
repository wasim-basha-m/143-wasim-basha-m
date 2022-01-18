import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';


function iphone13mini() {
  <div>
<img src="../iphone13mini.jpeg" alt="iphone13mini" onClick={iphone13promax}/>
  </div>
}

const iphone13promax = (
  <div>
<img src="../iphone13promax.jpeg" alt="iphone13promax" onClick={iphone13mini}/>   
  </div>
);

ReactDOM.render(iphone13promax, document.getElementById('root'));
 
