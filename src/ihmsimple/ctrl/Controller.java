package ihmsimple.ctrl;
 
import static ihmsimple.services.ServiceDevine.NOMBRE_INVALIDE;
 
import java.awt.Color;
 
import ihmsimple.services.ServiceDevine;
import ihmsimple.views.View;
 
/**
 * Classe représentant le contrôleur de l'application MVC "IhmSimple".
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 29.10.2023
 * @version 1.0.0
 */
public class Controller {
    /**
     * Le nombre courrant de l'utilisateur.
     */
    // VOTRE CODE ICI...
    private int nombre;
 
    /**
     * Référence à la vue de l'application.
     */
    // VOTRE CODE ICI...
    private View refView;
 
    /**
     * Référence au serviceDevine de l'application.
     */
    // VOTRE CODE ICI...
    private ServiceDevine refServiceDevine;
 
    /**
     * Constructeur du contrôleur. Comme toujours, le travail N°1 consiste à
     * initialiser TOUS nos attributs :-).
     * Pour les références aux serviceDevine et view, vous devez à présent savoir
     * qu’elles valeurs initiales donner. Pour la valeur initiale de l’attribut
     * nombre, utilisez NOMBRE_INVALIDE.
     */
    public Controller() {
        // VOTRE CODE ICI...
        this.refServiceDevine = null;
        this.refView = null;
        this.nombre = NOMBRE_INVALIDE;
 
    }
 
    /**
     * Méthode permettant de démarrer un nouveau jeu.
     * Voir le diagramme de séquence pour l'implémentation de cette méthode.
     */
    public void actionDemarrerNouveauJeu() {
        // VOTRE CODE ICI...
        refServiceDevine.penserAUnNombre();
        nombre = refServiceDevine.penserAUnNombre();
        refView.afficherStatus("Deviner !", Color.YELLOW);
    }
 
    /**
     * Méthode permettant de deviner le nombre pensé par l'utilisateur.
     * Voir le diagramme de séquence pour l'implémentation de cette méthode.
     */
    public void actionDeviner() {
        // VOTRE CODE ICI...
        if (nombre != NOMBRE_INVALIDE) {
            refView.lireValeurProposee();
            int valeurProposee = refView.lireValeurProposee();
            if (valeurProposee != NOMBRE_INVALIDE) {
                refView.afficherStatus("Entrez un nombre !", Color.YELLOW);
                if (valeurProposee < nombre) {
                    refView.afficherStatus("Trop petit !", Color.YELLOW);
                } else if (valeurProposee > nombre) {
                    refView.afficherStatus("Trop grand !", Color.RED);
                } else {
                    refView.afficherStatus("Trouvé !!!", Color.GREEN);
                }
            }
        }
 
    }
 
    /**
     * Méthode permettant de démarrer l'application.
     * Voir le diagramme de séquence pour l'implémentation de cette méthode.
     */
    public void start() {
        // VOTRE CODE ICI...
        refView.ihmStart();
        refView.afficherStatus("Jeu terminé !", Color.LIGHT_GRAY);
    }
 
    /**
     * Setter de la référence à la vue de l'application.
     *
     * @param refView la nouvelle référence à la vue de l'application
     */
    public void setRefView(View refView) {
        // VOTRE CODE ICI...
        this.refView = refView;
    }
 
    /**
     * Setter de la référence au serviceDevine de l'application.
     *
     * @param refServiceDevine la nouvelle référence au serviceDevine de
     *                         l'application
     */
    public void setRefServiceDevine(ServiceDevine refServiceDevine) {
        // VOTRE CODE ICI...
        this.refServiceDevine = refServiceDevine;
    }
 
    /**
     * Getter de la référence à la vue de l'application.
     *
     * @return la référence à la vue de l'application
     */
    public View getRefView() {
        // VOTRE CODE ICI...
        return this.refView;
    }
 
    /**
     * Getter de la référence au serviceDevine de l'application.
     *
     * @return la référence au serviceDevine de l'application
     */
    public ServiceDevine getRefServiceDevine() {
        // VOTRE CODE ICI...
        return this.refServiceDevine;
    }
 
}