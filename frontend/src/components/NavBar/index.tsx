import {ReactComponent as Icon} from "assets/img/Vector.svg";
import './styles.css';

function NavBar(){
    return (
        <header>
        <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>DSMovie</h1>
          <a href="https://github.com/weslyramalho">
            <div className="dsmovie-contact-container">
              <Icon />
              <p className="dsmovie-contact-link">/weslyramalho</p>
        </div>
        </a>
        </div>
      </nav>
    </header>
    )
}
export default NavBar;