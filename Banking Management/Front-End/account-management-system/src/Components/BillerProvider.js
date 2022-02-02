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




function BillerProvider() {
    const [consumerNumberFk, setConsumerNumberFk] = useState('')
    const [accNumber, setAccNumber] = useState('')
    const [amount, setAmount] = useState('')
    const [provider]=useState('')

    const handleClick = (e)=>{
        e.preventDefault()
        const customer = {consumerNumberFk,accNumber,amount}
        console.log(provider)
        fetch("http://localhost:8080/registry/provider/",{
            method: "POST",
            headers: {"Content-Type":"application/json"},
            body:JSON.stringify(customer)
        }).then (() => {
            alert("go to payment page...")
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
  <Box id="cons-number">
      <TextField
        required
        label="ConsumerNumber"
        defaultValue=""
        placeholder='mob or cons number'
        value={consumerNumberFk} 
        onChange={(e)=>setConsumerNumberFk(e.target.value)}
      />
    </Box>
    <Box id="biller-Select">
    <FormControl variant="filled" sx={{ m: 1, minWidth: 120 }}>
        <InputLabel >Acc Number</InputLabel>
        <Select
          labelId="demo-simple-select-filled-label"
          id="demo-simple-select-filled"
          fullWidth value={accNumber} onChange={(e)=>setAccNumber(e.target.value)}
        >
          <MenuItem value="">
            <em>None</em>
          </MenuItem>
          <MenuItem value="101">101</MenuItem>
          <MenuItem value="102">102</MenuItem>
        </Select>
      </FormControl>
    </Box>
    <Box id="cons-number">
      <TextField
        required
        label="Amount"
        defaultValue=""
        placeholder='1000'
        value={amount} 
        onChange={(e)=>setAmount(e.target.value)}
      />
    </Box><br></br>
      <Button variant="contained" onClick={handleClick} className="btn">Pay</Button>
      <br></br>
      </div>
      </Container>
      </div>
  )
    }

export default BillerProvider;