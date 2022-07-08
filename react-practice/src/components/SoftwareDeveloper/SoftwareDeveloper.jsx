// props is an object containing all of the properties passed down by the parent
// Because it's an object, I can destructure out what I want
export const SoftwareDeveloper = ({dev, color}) => {
    return (
        // Give the text the color of blue
        // inline styles
        <tr style={{color: dev.salary < 100000 ? 'red' : 'blue' }}>
            <td>{dev.name}</td>
            <td>{dev.title}</td>
            <td>{dev.salary}</td>
        </tr>
    );
}
// npm i styled-components