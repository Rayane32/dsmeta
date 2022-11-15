import icon from '../../assets/img/notification-icon.svg'

import './styles.css'
//aqui é para pegar a imagem da pasta, o ../ é para voltar uma pasta anteriror. lembrando que em import o nom "icon" pose ser trocado por qualquer nome para colocar na div (apenas serve para referenciamento)

function NotificationButton() {
    return(
        <div className="dsmeta-red-btn">
          <img src= {icon} alt="Notificar" />
        
        </div>
    )
   }
   
   export default NotificationButton
   