import {BrowserRouter,Routes,Route} from "react-router-dom";
import Layout from './layouts/Layout';
import Main from './pages/Main';
import About from './pages/About';
import Post from './pages/Post';
import Login from './pages/Login'


function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Layout/>}>
      <Route index element={<Main/>}/>
      <Route path="main" element={<Main/>}/>
      <Route path="about" element={<About/>}/>
      <Route path="post" element={<Post/>}/>
      <Route path="login" element={<Login/>}/>
      </Route>
    </Routes>
    </BrowserRouter>
  );
}

export default App;