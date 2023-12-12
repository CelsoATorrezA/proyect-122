import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Inicio from './pages/Inicio';
import Productos from './pages/Productos';
import Registrate from './pages/Registrate';
import Novedades from './pages/Novedades';
import Nosotros from './pages/Nosotros';
import Politica from './pages/Politica';
import Creditos from './pages/Creditos';
import './App.css';
import Ofertas from './pages/Ofertas';
import Contactanos from './pages/Contactanos';
import Soporte from './pages/Soporte';

function NavBar() {
  return (
    
    <nav className='nav1'>
      <ul>
        <li>
          <Link to="/">Inicio</Link>
        </li>
        <li>
          <Link to="/productos">Productos</Link>
        </li>
        <li>
          <Link to="/registrate">Registrate</Link>
        </li>
        <li>
          <Link to="/novedades">Novedades</Link>
        </li>
        <li>
          <Link to="/nosotros">Nosotros</Link>
        </li>
        <li>
          <Link to="/politica">Politica</Link>
        </li>
        
        <li>
          <Link to="/ofertas">Ofertas</Link>
        </li>
        <li>
          <Link to="/contacto">Contactanos</Link>
        </li>
        <li>
          <Link to="/soporte">Soporte</Link>
        </li>
        <li>
          <Link to="/creditos">Creditos</Link>
        </li>
      </ul>
    </nav>
  );
}

function App() {
  return (
    <Router>
      <NavBar />
      <Routes>
        <Route path="/" element={<Inicio />} />
        <Route path="/productos" element={<Productos />} />
        <Route path="/registrate" element={<Registrate />} />
        <Route path="/novedades" element={<Novedades />} />
        <Route path="/nosotros" element={<Nosotros />} />
        <Route path="/politica" element={<Politica />} />
        <Route path="/creditos" element={<Creditos />} />
        <Route path="/ofertas" element={<Ofertas />} />
        <Route path="/contacto" element={<Contactanos/>} />
        <Route path="/soporte" element={<Soporte/>} />
        <Route path="*" element={<Inicio />} />
      </Routes>
    </Router>
  );
}

export default App;
