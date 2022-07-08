import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Day1, Day2, Home } from "./pages";

// React believes that a function should determine the UI output

// "named" export
// Named exports are all exported in a singular object
export const App = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/day1" element={<Day1 />} />
                <Route path="/day2" element={<Day2 />} />
            </Routes>
        </BrowserRouter>
    );
}

export const two = 2;

// { App: App, two: two }

// I need to export App

// 2 ways to export

// default export
// You may only have 1 default export per file
export default App;

