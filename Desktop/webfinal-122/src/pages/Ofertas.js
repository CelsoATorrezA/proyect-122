import React from "react";
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
import { Carousel } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';


const Ofertas  = () => {
  return (
    <div className="intro2">
      <section className='titulo'>
        <header><h1>Novedades Tecnológicas Llegaron Aprovecha el momento!</h1></header>
       </section>
      

<section className="novedades-grid">
  <div className="novedad-item">
    
    <h3>Nueva Generación de Smartphones</h3>
    <img className='imgpro' src={m1} alt="Novedad 1" />
    <p>Descubre los últimos modelos de smartphones con características avanzadas y rendimiento excepcional.</p>
    <p className="p1">En rebaja de 260$ a 185$</p>
  </div>

  <div className="novedad-item">
    
    <h3>Lanzamiento de Portátiles Ultraligeros</h3>
    <img className='imgpro' src={m2} alt="Novedad 2" />
    <p>Explora la comodidad y potencia de los nuevos portátiles ultraligeros diseñados para la movilidad moderna.</p>
    <p className="p1">En rebaja de 240$ a 135$</p>
  </div>
  <div className="novedad-item">
    
    <h3>Teclado Gaming Con rgb</h3>
    <img className='imgpro' src={m3} alt="Novedad 2" />
    <p>Mecanicos  De Menbrana  diferentes precios.</p>
    <p className="p1">En rebaja de 50$ a 35$</p>
  </div>
  <div className="novedad-item">
    
    <h3>Microfonos </h3>
    <img className='imgpro' src={microfono} alt="Novedad 2" />
    <p>Calidad de entrada de audio alta y con rgb</p>
    <p className="p1">En rebaja de 160$ a 130$</p>
  </div>
  <div className="novedad-item">
    
    <h3>audifonos marca Corsair</h3>
    <img className='imgpro' src={audifonos} alt="Novedad 2" />
    <p>Con anulacion de ruido y salid de audio alta y RGB</p>
    <p className="p1">En rebaja de 120$ a 90$</p>
  </div>
  <div className="novedad-item">
    
    <h3>Fuentes de poder</h3>
    <img className='imgpro' src={fuente} alt="Novedad 2" />
    <p>Marca Corsair de 750W </p>
    <p className="p1">En rebaja de 90$ a 70$</p>
  </div>
  <div className="novedad-item">
    
    <h3>Mauses</h3>
    <img className='imgpro' src={mause} alt="Novedad 2" />
    <p>Marca Corsair con opcion de cambiar el peso a tu preferencia</p>
    <p className="p1">En rebaja de 50$ a 25$</p>
  </div>
  <div className="novedad-item">
    
    <h3>Monitores</h3>
    <img className='imgpro' src={monitor} alt="Novedad 2" />
    <p>Marca LG de 21.5"  144HZ</p>
    <p className="p1">En rebaja de 100$ a 65$</p>
  </div>
  <div className="novedad-item">
    
    <h3>Impresoras</h3>
    <img className='imgpro' src={impresora} alt="Novedad 2" />
    <p>Marca  Epson con scanner Incluido y Cartuchos Remplazables</p>
    <p className="p1">En rebaja de 140$ a 70$</p>
  </div>
  <div className="novedad-item">
    
    <h3>Dispositivos de Almacenamiento</h3>
    <img className='imgpro' src={disco} alt="Novedad 2" />
    <p>Discos duros externos y o internos de varias capacidades  y marcas</p>
    <p className="p1">En rebaja de 50$ a 35$</p>
  </div>

  
</section>

<section className="caru1">
<Carousel className="carousel-container">
        <Carousel.Item>
          <img
            className="d-block w-100"
            src={audifonos}
            alt="First slide"
          />
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src={m2}
            alt="Second slide"
          />
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src={m3}
            alt="Third slide"
          />
        </Carousel.Item>
        
      </Carousel>
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
      
</footer>   </div>
  );
};

export default Ofertas;