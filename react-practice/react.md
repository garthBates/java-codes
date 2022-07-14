## React

React is a UI Rendering Library (Nothing else)
If you want other features (internationalization, styling support, api call frameworks) you must go use other solutions. React does not provide one

React is "unopinionated"
- React's job is just UI rendering
  - Project structure is up to you
  - How you write code is up to you (so long as it follows JS and React rules)
  - Styling is up to you

Component based system
- Components are a way to wrap similar features on a website into one reusable function/piece
- Components encourage code reuse by wrapping the specific data/state behind a resusable component
- Allows separation of concerns (Instead of one giant HTML page, we break logic into components (just like functions))

React believes that the View should be a function of the application's state
V = F(state)
- Whenever the state changes for a component, the UI will automatically update to reflect those changes

# Virtual DOM

- Virtual DOM is an in-memory, JavaScript representation of the actual DOM
- React will use it to interface with the actual DOM
  - Developers will communicate with the Virtual DOM and React handles the rest
  - In doing so, we can use all of the DOM optimization the React core has assembled
- Virtual DOM keeps track of component state and only re-renders components when that state changes
  - This is done to prevent unnecessary re-renders as those are costly (in terms of time)
  - When the state changes, React takes a look at the previous VDom and the new VDom and only updates where changes occurred

# JSX

- "JavaScript and XML"
  - It is NOT XML, it is simply an abstraction over low level DOM manipulation
  - It looks like HTML, but is actually React.createElement() which calls document.createElement()
- Browsers do NOT understand JSX, they do understand JavaScript
  - JSX needs to be converted into raw JS
    - We do so with Babel

# Babel
- Babel allows us to "transpile" a given version of JS to another
- It also performs some optimizations by removing redundant (unused) code and also reduce whitespace
  - This allows our JS bundle sizes to be smaller
- For JSX, it will convert all JSX code to React.createElement()
  - <div id="box"></div> -> React.createElement("div", {id: 'box'}, null);

# Webpack
- Webpack is a JS build tool that will bundle our JS and automatically call Babel when the project
- Webpack also supports something known as "tree shaking"
  - Webpack is smart and will remove any unused dependencies from the final build (for smaller bundles)