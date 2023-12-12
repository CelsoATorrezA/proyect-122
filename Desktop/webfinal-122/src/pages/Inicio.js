// En Inicio.js
import React from 'react';
import m1 from '../components/m1.avif';
import m2 from'../components/m2.avif';
import m3 from'../components/m3.webp';
import Slider from 'react-slick';

const Inicio = () => {
  
  return (
    <div className='intro2'>
      <section className='intro0'>
        <header className='intro1'>
          <h2>Bienvenido a [Mundo Tec]
En [Mundo Tec], nos enorgullece ofrecer lo último y lo mejor en tecnología para satisfacer tus necesidades digitales. Estamos comprometidos a proporcionar a nuestros clientes una experiencia de compra excepcional, donde la innovación y la calidad convergen para mejorar tu estilo de vida.
Explora la Vanguardia Tecnológica
Sumérgete en un mundo de dispositivos y gadgets que marcan tendencia. Desde potentes ordenadores portátiles hasta smartphones de última generación, nuestra selección cuidadosamente curada presenta lo más avanzado en tecnología para mantenerlo conectado, entretenido y productivo.

Expertos en Tecnología, a Tu Servicio
Nuestro equipo de expertos en tecnología está aquí para ayudarte a tomar decisiones informadas. Ya sea que estés buscando el equipo perfecto para el trabajo, la escuela o el entretenimiento, te proporcionaremos asesoramiento personalizado para garantizar que encuentres la solución ideal.

Calidad y Confianza
En [Mundo Tec], la calidad es nuestra prioridad. Colaboramos con las principales marcas del mercado para ofrecerte productos de confianza que cumplen con los más altos estándares. Comprar con nosotros significa invertir en durabilidad, rendimiento y satisfacción a largo plazo.

Ofertas Exclusivas
Mantente atento a nuestras ofertas exclusivas y promociones especiales. En [Mundo Tec], creemos que la tecnología de vanguardia debería ser accesible para todos, y trabajamos arduamente para brindarte precios competitivos y ofertas irresistibles.

Tu Destino Tecnológico
Ya seas un entusiasta de la tecnología o estés buscando el regalo perfecto, [Mundo Tec] es tu destino tecnológico. Únete a nosotros en este emocionante viaje hacia el futuro digital y descubre cómo la tecnología puede mejorar tu vida cotidiana.
Bienvenido a [Mundo Tec] - donde la innovación se encuentra con la comodidad. </h2>
        </header>
      </section> 
    <div className='divcont'>
      <div> <img className='imgi' src={m1}/> </div>
      <div> <img className='imgi' src={m2}/> </div>
      <div> <img className='imgi' src={m3}/> </div>
    </div>

    <div className='divcont'>
      <iframe width="560" height="315" src="https://www.youtube.com/embed/bAF4ZGZPz8Q?si=g1vJBS4MQi1BkKQk" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
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

export default Inicio;


