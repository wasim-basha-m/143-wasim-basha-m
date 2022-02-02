import React from "react";
import BillerRegister from "../BillerRegister";
import BillerProvider from "../BillerProvider";
import BillerStatement from "../BillerStatement";
import {BrowserRouter,Switch, Route} from "react-router-dom";

function Routing(){

return(
    <div>
        <BrowserRouter>
        <Switch>
            <Route exact path="/" component={BillerRegister}/>
            <Route exact path="/Provider" component={BillerProvider}/>
            <Route exact path="/Statement" component={BillerStatement}/>               
        </Switch>
        </BrowserRouter>
    </div>
)
};

export default Routing;