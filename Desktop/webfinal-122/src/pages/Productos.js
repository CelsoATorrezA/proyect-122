// En Productos.js
import React from 'react';
import m1 from '../components/m1.avif';
import m2 from'../components/m2.avif';
import m3 from'../components/m3.webp';
import audifonos from '../components/audifonos.jpg';
import fuente from '../components/fuente.jpg';
import mause from '../components/mause.jpg';
import impresora from '../components/impresora.jpg';
import vr from '../components/vr.jpg';
import monitor from '../components/monitor.jpg';
import disco from '../components/disco.webp';
import microfono from '../components/microfono.jpg';
import lector from '../components/lector.jpg';




const Productos = () => {
  return (
    <div className='intro2'>
       <section className='titulo'>
        <header><h2>Todos estos productos en Stock Disponibles Ahora Mismo!</h2></header>
       </section>

  <section className='productos-grid'>
        <div className='producto-item'>
          
          <h3>Telefono inteligente</h3>
          <img  className='imgpro' src={m1} alt='Producto 1' />
          <p>Desde 40$</p>
        </div>

        <div className='producto-item'>
          
          <h3>Portail Marca HP</h3>
          <img className='imgpro' src={m2} alt='Producto 2' />
          <p>Core i5 de Novena Genracion</p>
          <p>Grafica integrada</p>
          <p>12Gb de ram</p>
          <p> 1 Tera de Almacenamiento</p>
        </div>
        <div className='producto-item'>
          
          <h3>Teclado Gaming</h3>
          <img className='imgpro' src={m3} alt='Producto 2' />
          <p>Teclado Mecanico</p>
          <p>COn RGB</p>
          <p>DESDE 80$</p>
        </div>
        <div className='producto-item'>
          
          <h3>audifonos Inlambricos</h3>
          <img className='imgpro' src={audifonos} alt='Producto 2' />
          <p>Marca Corsair</p>
          <p>Anulacion de Ruido</p>
          <p>Desde 50$</p>
        </div>
        <div className='producto-item'>
          
          <h3>fuente De Poder</h3>
          <img className='imgpro' src={fuente} alt='Producto 2' />
          <p>Fuente Corsair </p>
          <p> 700 W </p>
          <p>Desde 100$</p>
        </div>
        <div className='producto-item'>
          
          <h3>Mause Garmer</h3>
          <img className='imgpro' src={mause} alt='Producto 2' />
          <p>Marca Corsair </p>
          <p>RGB Incluido</p>
          <p>Desde 60$</p>
        </div>
        <div className='producto-item'>
          
          <h3>Impresora</h3>
          <img className='imgpro' src={impresora} alt='Producto 2' />
          <p>Marca Epson</p>
          <p>Cartuchos Remplables</p>
          <p>Desde 50$</p>
        </div>
        <div className='producto-item'>
          
          <h3>Gafas de Realida Virtual</h3>
          <img className='imgpro' src={vr} alt='Producto 2' />
          <p>Marca Vive</p>
          <p>Incluye Programs</p>
          <p>Desde 100$</p>
        </div>
        <div className='producto-item'>
          
          <h3>Montior LG</h3>
          <img  className='imgpro' src={monitor} alt='Producto 1' />
          <p>de 21 .5"</p>
          <p>Desde 120$</p>
         
        </div>
        <div className='producto-item'>
          
          <h3>Disco Duro</h3>
          <img  className='imgpro' src={disco} alt='Producto 1' />
          <p>Almacenamiento De 1Tera , 2Teras</p>
          <p>Desde 30$</p>
        </div>
        <div className='producto-item'>
          
          <h3>Microfono</h3>
          <img  className='imgpro' src={microfono} alt='Producto 1' />
          <p>RGB Incluido.</p>
          <p>Mute Mediante Touch</p>
          <p>Desde 50$</p>
        </div>
        <div className='producto-item'>
          
          <h3>Lector DE CD</h3>
          <img  className='imgpro' src={lector} alt='Producto 1' />
          <p>Alta Calidad</p>
          <p>Desde 20$</p>
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

export default Productos;
