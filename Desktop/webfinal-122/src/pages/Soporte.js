import React from "react";
import { FaPhone, FaEnvelope, FaMapMarkerAlt } from "react-icons/fa";
const Soporte  = () => {
  return (
    <div className='intro2'>


    <div className="so1">
    <header>

<h1>Soporte Técnico</h1>
</header>
    <section className="informacion-contacto">
        <h2>Información de Contacto</h2>
        <div className="contacto-item">
          <FaPhone className="icono-contacto" />
          <p>Teléfono: (123) 456-7890</p>
        </div>
        <div className="contacto-item">
          <FaEnvelope className="icono-contacto" />
          <p>Correo Electrónico: soporte@tutienda.com</p>
        </div>
        <div className="contacto-item">
          <FaMapMarkerAlt className="icono-contacto" />
          <p>Dirección: Calle Principal, Ciudad, País</p>
        </div>
      </section>
      <div className="so1"> <section className="formulario-soporte">
        <h2>Envíanos tu Consulta</h2>
        <form >
          <label htmlFor="nombre">Nombre:</label>
          <input type="text" id="nombre" name="nombre" required />

          <label htmlFor="correo">Correo Electrónico:</label>
          <input type="email" id="correo" name="correo" required />

          <label htmlFor="telefono">Teléfono:</label>
          <input type="tel" id="telefono" name="telefono" />

          <label htmlFor="mensaje">Mensaje:</label>
          <textarea id="mensaje" name="mensaje" rows="4" required></textarea>

          <button type="submit">Enviar Consulta</button>
        </form>
      </section>

      <section className="horario-atencion">
        <h2>Horario de Atención</h2>
        <p>Lunes a Viernes: 9:00 AM - 6:00 PM</p>
        <p>Sábados y Domingos: Cerrado</p>
      </section> </div>
     

    </div>
     



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

export default Soporte;