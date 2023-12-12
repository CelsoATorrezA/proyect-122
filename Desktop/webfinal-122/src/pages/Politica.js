
import React from "react";
import poli1 from '../components/poli1.jpg';
import poli2 from '../components/poli2.jpeg';
import poli3 from '../components/poli3.png';

const Politica = () => {
  return (
    <div className="intro2">
      <section className="policlas1">
      <h1>Política y Condiciones </h1>

        <div> <h3> En [Mundo Tec], nos esforzamos por ofrecer no solo productos tecnológicos de vanguardia, sino también una experiencia de compra transparente y satisfactoria. Nuestras políticas y condiciones están diseñadas para protegerte a ti, nuestro valioso cliente, y garantizar que disfrutes de la mejor experiencia posible al explorar y adquirir nuestros productos. </h3>  </div>
        <img className="imgpoli" src={poli1}/>
        <div> <h3>Política de Privacidad
En [Mundo Tec], la privacidad y seguridad de tus datos personales son nuestras principales prioridades. Nuestra Política de Privacidad detalla cómo recopilamos, utilizamos y protegemos la información que compartes con nosotros durante tu visita y compra en nuestra tienda. Puedes estar seguro de que tus datos están en buenas manos.</h3></div>
        <img className="imgpoli" src={poli2}/>
        <div> <h3> Términos y Condiciones de Uso
Al utilizar nuestro sitio web y realizar compras en [Mundo Tec], aceptas nuestros Términos y Condiciones de Uso. Estos términos establecen las reglas y regulaciones que rigen tu interacción con nuestra tienda en línea. Te recomendamos revisar detenidamente estos términos para comprender completamente tus derechos y responsabilidades.</h3></div>
        <img className="imgpoli" src={poli3}/>

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

export default Politica ;