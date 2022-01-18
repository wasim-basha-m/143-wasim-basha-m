import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Form() {
// States for registration
const [name, setName] = useState('');
const [email, setEmail] = useState('');
const [password, setPassword] = useState('');
const [cpassword,setCpassword] = useState('');
// States for checking the errors
const [submitted, setSubmitted] = useState(false);
const [error, setError] = useState(false);
// Handling the name change
const handleName = (e) => {
	setName(e.target.value);
	setSubmitted(false);
};
// Handling the email change
const handleEmail = (e) => {
	setEmail(e.target.value);
	setSubmitted(false);
};
// Handling the password change
const handlePassword = (e) => {
	setPassword(e.target.value);
	setSubmitted(false);
};
// Handling the password change
const handleCpassword = (e) => {
	setCpassword(e.target.value);
	setSubmitted(false);
};
// Handling the form submission
const handleSubmit = (e) => {
	e.preventDefault();
	if (password!==cpassword) {
	setError(true);
	} else {
	setSubmitted(true);
	setError(false);
	}
};
// Showing success message
const successMessage = () => {
	return (
	<div
		className="success"
		style={{
		display: submitted ? '' : 'none',
		}}>
		<h1>User {name} successfully registered!!</h1>
	</div>
	);
};
// Showing error message if error is true
const errorMessage = () => {
	return (
	<div
		className="error"
		style={{
		display: error ? '' : 'none',
		}}>
		<h1>Password do not match please enter correct Password</h1>
	</div>
	);
};
return (
	<div className="form" id="log">
	<div>
		<h1>Login</h1>
	</div>
	{/* Calling to the methods */}
	<div className="messages">
		{errorMessage()}
		{successMessage()}
	</div>
	<form>
    <br></br>
    <br></br>
		<label className="label">Name</label>
		<input onChange={handleName} className="input"
		value={name} type="text" required/>
		<label className="label">Email</label>
		<input onChange={handleEmail} className="input"
		value={email} type="email" required/>
		<label className="label">Password</label>
		<input onChange={handlePassword} className="input"
		value={password} type="password" required/>
    <label className="label">Confirm Password</label>
		<input onChange={handleCpassword} className="input"
		value={cpassword} type="password" required/>
		<button onClick={handleSubmit} className="btn" type="submit">
		Submit
		</button>
	</form>
	</div>
);
}
ReactDOM.render(  
  <Form /> ,
document.getElementById('root')
);