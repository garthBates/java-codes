import { useState, useEffect } from 'react';
import axios from 'axios';
import { SoftwareDeveloper } from './SoftwareDeveloper';

export const SoftwareDeveloperList = () => {
    const [devs, setDevs] = useState([]);

    useEffect(() => {
        axios.get('https://my-json-server.typicode.com/skillstorm-walsh/employees-v1/employees')
            .then(res => setDevs(res.data)); // sets my devs state to be that array of devs
    }, []); // Be sure this is an empty array
    
    return (
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Title</th>
                    <th>Salary</th>
                </tr>
            </thead>
            <tbody>
                {/* I want to dynamically render all of those devs that I received */}
                {/* <tr> This is the HTML way. Manual typing
                    <td>Dan Pickles</td>
                    <td>Senior Technical Architect</td>
                    <td>100000</td>
                </tr> */}

                {/* Use the built in array method, map() to create an array of JSX elements */}
                {devs.map((dev) => {
                    // Map constructs a new array based off what we return
                    return (
                        // Always use the primary id from the database since it's unique
                        <SoftwareDeveloper key={dev.id} dev={dev} />
                    );
                })}
            </tbody>
        </table>
    );
}