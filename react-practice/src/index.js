import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App, { App as App2 } from './App';

// Gets the root element from the HTML page
// The empty div with an id of root
const root = ReactDOM.createRoot(document.getElementById('root'));

// Takes that element and renders our entire Virtual DOM to it
root.render(
  // Strict mode is dev only
  // <React.StrictMode>
    <App2 />
  // </React.StrictMode>
);