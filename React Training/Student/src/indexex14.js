import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class StudentForm extends React.Component{
  constructor(props){
    super(props);
    this.state = {uname:'',Email:'', Password:'',cPassword:''};
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event){
    //this.setState({value: event.target.value});
    const target = event.target;
    const value = target.name === "isPass" ? target.checked: target.value;
    const name = target.name;

    console.log(name +" "+ value);
    this.setState({[name]:value});
  }

  handleSubmit(event){
    alert('You have signed up successfully...!!! '+this.state.uname);
    event.preventDefault();
  }


  render(){
    return(
      <body id="body">
      <div id="forms">
      <center>
        <h1>Signup page</h1> 
      <form onSubmit={this.handleSubmit}>
        <table>
        <label>
         <tr> UserName:</tr>
        <td>
          <input name="uname" type="uname" value={this.state.uname} onChange={this.handleChange} required />
        </td>
        </label>
        <br></br>
        <label>
         <tr> Email:</tr>
         <td><input name="Email" type="email" value={this.state.Email} onCh ange={this.handleChange} required />
          </td>
        </label>
        <br></br>
        <label>
          <tr>
          Password:
          </tr>
          <td>
          <input type="password" name="Password" value={this.state.Password} onChange={this.handleChange} required />
          </td>
          </label>
          <br></br>
          <label>
          <tr>
          Confirm Password:
          </tr>
          <td>
          <input type="password" name="cPassword" value={this.state.cPassword} onChange={this.handleChange} required />
          </td>
          </label>
          <br></br>
          <label>
            <tr>
          <input type="checkbox"  name="remember"/> Remember me
          </tr></label>
          <br></br>
          <br></br>
        <center> <input id="reg" type="submit" value="Register" /></center>
        <br></br>
      </table>
      </form>
      </center>
      </div>
      </body>
    );
  }
}

ReactDOM.render(  
  <StudentForm /> ,
document.getElementById('root')
);