import { Form, Button } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import login from '../components/login.png'

const Registrate= () => {
  return (
    <div className='intro2'>
      <section>  
        <header className='head1'>  
          <h1>Registrate en Nuestro Sitio Web Ahora !</h1>
        </header>
      </section>
      <section className='reg2'>
        <div className='REG1'>
          <img className='imglog' src={login}/>


        <Form onSubmit={(e) => e.preventDefault()}>
        <Form.Group controlId="formNombre">
          <Form.Label>Nombre:</Form.Label>
          <Form.Control type="text" name="nombre" value={''} onChange={() => {}} />
        </Form.Group>

        <Form.Group controlId="formApellido">
          <Form.Label>Apellido:</Form.Label>
          <Form.Control type="text" name="apellido" value={''} onChange={() => {}} />
        </Form.Group>

        <Form.Group controlId="formCorreo">
          <Form.Label>Correo:</Form.Label>
          <Form.Control type="email" name="correo" value={''} onChange={() => {}} />
        </Form.Group>

        <Form.Group controlId="formFechaNacimiento">
          <Form.Label>Fecha de Nacimiento:</Form.Label>
          <Form.Control type="date" name="fechaNacimiento" value={''} onChange={() => {}} />
        </Form.Group>

        <Form.Group controlId="formUsuario">
          <Form.Label>Usuario:</Form.Label>
          <Form.Control type="text" name="usuario" value={''} onChange={() => {}} />
        </Form.Group>

        <Form.Group controlId="formContraseña">
          <Form.Label>Contraseña:</Form.Label>
          <Form.Control type="password" name="contraseña" value={''} onChange={() => {}} />
        </Form.Group>

        <Button variant="primary" type="submit">
          Registrarse
        </Button>
      </Form>

        </div>

      </section>
      <footer >
  <div className='footer22'>
  <section className='fo2'>
      <h2> Desarrollado por el estudiante:</h2>
    <h3> Celso Alexander Torrez Apaza</h3>
    <h3> Ci:8778072</h3>
    <h3> RU:1778585</h3>
      </section>
      <section className='fo2'>
      <h2> Contactos</h2>
    <h3> Torrezzeus670@gmail.com</h3>
    <h3> telf: 63118715</h3>
    <h3> </h3>
      </section>

  </div>
      
</footer>
    </div>
  );
};

export default Registrate;