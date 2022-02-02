import React, { useState, useEffect } from "react";
import "../Components/Registry.css";
import Container from "@mui/material/Container";
import Statemntapi from "../Components/StatementService";
import { Navbar, Nav } from "react-bootstrap";
import ReactHTMLTableToExcel from "react-html-table-to-excel";
// import { DataGrid } from '@mui/x-data-grid';
// import ReactToPrint from 'react-to-print';

// class BillerStatement extends React.Component {

//     constructor(props){
//         super(props)
//         this.state = {
//             biller_statement:[]
//         }
//     }

//     componentDidMount(){
//       Statemntapi.getStatement().then((response) => {
//             this.setState({ biller_statement: response.data})
//         });
//     }

//     render (){
//         return (
//             <div className='biller-registry-body'>
//             <Container className="registry">
//     <div className="registry-statement">
//     <Navbar bg="dark" variant="dark">
//     <Container>
//     <Navbar.Brand href="#">ACCOUNT MANAGEMENT SYSTEM</Navbar.Brand><br></br>
//       <Nav>
//           <Nav.Link href="/" >Biller Register</Nav.Link>
//           <Nav.Link href="/Provider">Biller Provider</Nav.Link>
//           <Nav.Link href="/Statement">Biller Statement</Nav.Link>
//       </Nav>
//     </Container>
//   </Navbar>
//             <div>
//                 <h1 className = "text-center"> Biller Statement</h1>
//                 <table id="statement" class="table table-bordered table-dark">
//                     <thead class="thead-dark">
//                         <tr>

//                             <td> Account No</td>
//                             <td> Amount</td>
//                             <td> Type</td>
//                             <td> Transaction Id</td>
//                             <td> Time Stamp</td>
//                             <td> Select</td>
//                         </tr>

//                     </thead>
//                     <tbody>
//                         {
//                             this.state.biller_statement.map(
//                                 BillerStatement =>
//                                 <tr key = {BillerStatement.id}>
//                                      <td> {BillerStatement.accNumber}</td>
//                                      <td> {BillerStatement.amount}</td>
//                                      <td> {BillerStatement.type}</td>
//                                      <td> {BillerStatement.transIdFk}</td>
//                                      <td> {BillerStatement.timeStamp}</td>
//                                      <td><input type="checkbox" /></td>
//                                 </tr>
//                             )
//                         }

//                     </tbody>
//                 </table>
//             </div>
//             <div>
//                     <ReactHTMLTableToExcel
//                             className="btn btn-info"
//                             table="statement"
//                             filename="ReportExcel"
//                             sheet="Sheet"
//                             buttonText="Export excel" />
//             </div>
//             <div>

//         </div>
//             </div>
//             </Container>
//             </div>

//         )
//     }
// }

// export default BillerStatement;

const BillerStatement = () => {
  const [biller_statement, setBiller_statement] = useState([]);

  const handleClick = (e) => {
    e.preventDefault();
  };

  useEffect(() => {
    const customer = { biller_statement };
    fetch("http://localhost:8080/registry/statement/", {
      method: "GET",
      headers: { "Content-Type": "application/json" },
    })
      .then((response) => response.json())
      .then((body) => {
        setBiller_statement(body);
      });
  }, []);

  return (
    <div className="biller-registry-body">
      <Container className="registry">
        <div className="registry-statement">
          <Navbar bg="dark" variant="dark">
            <Container>
              <Navbar.Brand href="#">ACCOUNT MANAGEMENT SYSTEM</Navbar.Brand>
              <br></br>
              <Nav>
                <Nav.Link href="/">Biller Register</Nav.Link>
                <Nav.Link href="/Provider">Biller Provider</Nav.Link>
                <Nav.Link href="/Statement" onClick={handleClick}>
                  Biller Statement
                </Nav.Link>
              </Nav>
            </Container>
          </Navbar>
          <div>
            <h1 className="text-center"> Biller Statement</h1>
            <table id="statement" className="table table-bordered table-dark">
              <thead className="thead-dark">
                <tr>
                  <td>Id</td>
                  <td> Account No</td>
                  <td> Amount</td>
                  <td> Type</td>
                  <td> Transaction Id</td>
                  <td> Time Stamp</td>
                  <td> Select</td>
                </tr>
              </thead>

              <tbody>
                {biller_statement.length > 0 ? (
                  biller_statement.map((lst) => (
                    <>
                      <tr key={lst.id}>
                        <td>{lst.id}</td>
                        <td> {lst.accNumber}</td>
                        <td> {lst.amount}</td>
                        <td> {lst.type}</td>
                        <td> {lst.transIdFk}</td>
                        <td> {lst.timeStamp}</td>
                        <td>
                          <input type="checkbox" />
                        </td>
                      </tr>
                    </>
                  ))
                ) : (
                  <></>
                )}
              </tbody>
            </table>
          </div>
          <div>
            <ReactHTMLTableToExcel
              className="btn btn-info"
              table="statement"
              filename="ReportExcel"
              sheet="Sheet"
              buttonText="Export excel"
            />
          </div>
          <div></div>
        </div>
      </Container>
    </div>
  );
};
export default BillerStatement;
