import React from "react";
import './NavigationBar.css';

const NavigationBar = () => {
  return (
    <header>
      <ul className="nav-container">
        <li>Why Github?</li>
        <li>Team</li>
        <li>Enterprise</li>
        <li>Explore</li>
        <li>Marketplace</li>
        <li>Pricing</li>
      </ul>
    </header>
  )
};

export default NavigationBar;