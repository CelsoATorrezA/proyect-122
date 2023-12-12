import React from "react";
import { Form, Button } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

const Contactanos = () => {
  return (
    <div className="intro2">
      <header className="he1">
        <h1>MUNDO TEC-Puedes Contactarnos para soporte tecnico o varias visitas de repaciones a hogar si deseas</h1>
      </header>
    <div className="nm1">
    <section className="secc1">
        <h2>Contacto</h2>
        <p>Ponte en contacto con nosotros para cualquier consulta o comentario.</p>

        <div className="contact-info">
          <div>
            <h3>Ubicación</h3>
            <p>Dirección: Cales Calatayud, La paz , Bolivia</p>
          </div>
          <div>
            <h3>Horario de Atención</h3>
            <p>Lunes a Viernes: 9:00 AM - 6:00 PM</p>
          </div>
        </div>

        <h3>Redes Sociales</h3>
        <div className="social-icons">
          <a href="https://www.tiktok.com/@mel0dyyyy_02/video/7309899131789626657?q=chipi%20chipi%20chapa%20chapa&t=1702372243805" target="_blank">Facebook</a>
          <a href="https://www.tiktok.com/@fuzzychunk598/video/7036605525953449221?q=rick%20troleo&t=1702372657638" target="_blank">Twitter</a>
          <a href="#" target="_blank">Instagram</a>
        </div>

        <h3>Formulario de Contacto</h3>
        <Form className="from1">
          <Form.Group controlId="nombre">
            <Form.Label>Nombre:</Form.Label>
            <Form.Control type="text" required />
          </Form.Group>

          <Form.Group controlId="correo">
            <Form.Label>Correo Electrónico:</Form.Label>
            <Form.Control type="email" required />
          </Form.Group>

          <Form.Group controlId="mensaje">
            <Form.Label>Mensaje:</Form.Label>
            <Form.Control as="textarea" rows={4} required />
          </Form.Group>

          <Button type="submit">Enviar Mensaje</Button>
        </Form>
      </section>

    </div>
     
      <footer>
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

export default Contactanos;
