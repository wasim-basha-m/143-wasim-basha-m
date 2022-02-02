import React,{useState} from 'react';
// import ReactDOM from 'react-dom';
import "../Components/Registry.css"
import Button from '@mui/material/Button';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import MenuItem from '@mui/material/MenuItem';
import InputLabel from '@mui/material/InputLabel';
import Select from '@mui/material/Select';
import Container from '@mui/material/Container';
import FormControl from '@mui/material/FormControl';
import {Navbar,Nav} from "react-bootstrap";




function BillerRegister() {
    const [billerName, setBillerName] = useState('')
    const [consumerNumber, setConsumerNumber] = useState('')
    const [registry]=useState('')

    const handleClick = (e)=>{
        e.preventDefault()
        const customer = {billerName,consumerNumber}
        console.log(registry)
        fetch("http://localhost:8080/registry/register/",{
            method: "POST",
            headers: {"Content-Type":"application/json"},
            body:JSON.stringify(customer)
        }).then (() => {
            alert("Biller Registered Succesfully. go to Biller Provider Page...")
        })
    }
  
  return (
    <div className='biller-registry-body'>
    <Container className="registry">
    <Navbar bg="dark" variant="dark">
    <Container>
    <Navbar.Brand href="#">ACCOUNT MANAGEMENT SYSTEM</Navbar.Brand><br></br> 
      <Nav>
          <Nav.Link href="/" >Biller Register</Nav.Link>
          <Nav.Link href="/Provider">Biller Provider</Nav.Link>
          <Nav.Link href="/Statement">Biller Statement</Nav.Link>
      </Nav>
    </Container>
  </Navbar>
  <div className="registry-field">
    <Box id="biller-Select">
    <FormControl variant="filled" sx={{ m: 1, minWidth: 120 }}>
        <InputLabel >Billers</InputLabel>
        <Select
          labelId="demo-simple-select-filled-label"
          id="demo-simple-select-filled"
          fullWidth value={billerName} onChange={(e)=>setBillerName(e.target.value)}
        >
          <MenuItem value="">
            <em>None</em>
          </MenuItem>
          <MenuItem value={"Airtel"}>Airtel</MenuItem>
          <MenuItem value={"Jio"}>Jio</MenuItem>
          <MenuItem value={"Vi"}>Vi</MenuItem>
        </Select>
      </FormControl>
    </Box>
    <Box id="cons-number">
      <TextField
        required
        label="Consumer Number"
        defaultValue=""
        placeholder='mob or cons number'
        value={consumerNumber} 
        onChange={(e)=>setConsumerNumber(e.target.value)}
      />
    </Box><br></br>
      <Button variant="contained" onClick={handleClick} className="btn">Register</Button>
      <br></br>
      </div>
      </Container>
      </div>
  )
    }

export default BillerRegister;