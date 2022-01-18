import React from "react";
import { Link } from "react-router-dom";
import "./header.css";


const Header = ({cartItems}) => {

    return(
        <header className="header">
            <div>
                <h1>
                    <Link to="/" className="logo">
                        Apple Store
                    </Link>
                </h1>
            </div>
            <div className="header-links">
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                </ul>
                <ul>
                    <li>
                        <Link to="/signup">SignUp</Link>
                    </li>
                </ul>
                <ul>
                    <li>
                        <Link to="/cart" className="cart">
                            <i className="fas fa-shopping-cart" />
                            <span className="cart-length">
                                {cartItems.length === 0 ? "" : cartItems.length}
                            </span>
                        </Link>
                    </li>
                </ul>
            </div>
        </header>
       
    );
};
export default Header;