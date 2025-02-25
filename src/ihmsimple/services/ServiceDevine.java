package ihmsimple.services;
 
import ihmsimple.ctrl.*;
/**
 * Classe représentant le service de l'application MVC "IhmSimple".
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 29.10.2023
 * @version 1.0.0
 */
public class ServiceDevine {
    /**
     * Nombre maximum que l'utilisateur peut proposer.
     */
     // VOTRE CODE ICI...
     public static int MAX_NOMBRE = 100;
   
    /**
     * Nombre minimum que l'utilisateur peut proposer.
     */
     // VOTRE CODE ICI...
     public static int MIN_NOMBRE = 1;
 
    /**
     * Valeur retournée par la méthode lireValeurProposee() si ce qui a été saisi
     * par l'utilisateur n'est pas convertible
     * en un entier.
     */
     // VOTRE CODE ICI...
     public static int NOMBRE_INVALIDE = -1;
 
    /**
     * Référence au contrôleur de l'application.
     */
    // VOTRE CODE ICI...
    Controller refCtrl;
 
    /**
     * Constructeur du service.
     * Comme toujours, le travail N°1 consiste à initialiser TOUS nos attributs :-).
     * Pour la référence au contrôleur, vous devez à présent savoir quelle valeur
     * initiale donner.
     */
    public ServiceDevine() {
        // VOTRE CODE ICI...
        this.refCtrl = new Controller();
    }
 
    /**
     * Invente et retourne un nouveau nombre à deviner aléatoirement choisi entre
     * les limites tolérées pour ce jeu.
     *
     * @return le nombre à deviner aléatoirement choisi
     */
    public int penserAUnNombre() {
        // VOTRE CODE ICI...
        return (int) (Math.random() * (MAX_NOMBRE - MIN_NOMBRE + 1)) + MIN_NOMBRE;
    }
 
    /**
     * Retourne la référence au contrôleur de l'application.
     *
     * @param refCtrl la référence au contrôleur de l'application
     */
    public void setRefCtrl(Controller refCtrl) {
        // VOTRE CODE ICI...
        this.refCtrl = refCtrl;
    }
 
    /**
     * Retourne la référence au contrôleur de l'application.
     *
     * @return la référence au contrôleur de l'application
     */
    public Controller getRefCtrl() {
        // VOTRE CODE ICI...
        return refCtrl;
    }
 
}