import React from 'react';
import "../Components/Registry.css"
import Container from '@mui/material/Container';
import Statemntapi from "../Components/StatementService";
import {Navbar,Nav} from "react-bootstrap";


class BillerStatement extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            biller_statement:[]
        }
    }

    componentDidMount(){
      Statemntapi.getStatement().then((response) => {
            this.setState({ biller_statement: response.data})
        });
    }

    render (){
        return (
            <div className='biller-registry-body'>
            <Container className="registry">
    <div className="registry-statement">
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
            <div>
                <h1 className = "text-center"> Biller Statement</h1>
                <table class="table table-bordered table-dark">
                    <thead class="thead-dark">
                        <tr>

                            <td> Account No</td>
                            <td> Amount</td>
                            <td> Type</td>
                            <td> Transaction Id</td>
                            <td> Time Stamp</td>
                            <td> Select</td>
                        </tr>

                    </thead>
                    <tbody>
                        {
                            this.state.biller_statement.map(
                                BillerStatement => 
                                <tr key = {BillerStatement.id}>
                                     <td> {BillerStatement.accNumber}</td>
                                     <td> {BillerStatement.amount}</td>   
                                     <td> {BillerStatement.type}</td>   
                                     <td> {BillerStatement.transIdFk}</td>   
                                     <td> {BillerStatement.timeStamp}</td>
                                     <td><input type="checkbox" /></td>    
                                </tr>
                            )
                        }

                    </tbody>
                </table>

            </div>
            </div>
            </Container>
            </div>

        )
    }
}

export default BillerStatement;