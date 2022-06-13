import React from "react";
import './SearchBar.css';

const SearchBar = () => {
  return (
    <header>
      <ul className="search-bar">
        <li><input type="text" placeholder="Search Github" /></li>
        <li>Sign In</li>
        <li className="signup">Sign Up</li>
      </ul>
    </header>
  )
};

export default SearchBar;