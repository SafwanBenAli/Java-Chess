/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.jeu;

import java.util.ArrayList;
import modele.plateau.*;


public class Roi extends Piece
{
    public Roi(Plateau _plateau, boolean _couleur) {
        super(_plateau, _couleur);
        casesAccessibles = new DecorateurCasesEnLigne(new DecorateurCasesEnDiagonale(null,
                                                                                    _plateau, this),_plateau, this);

        // le décorateur récupère les cases en diagonale et en ligne
        ArrayList<Case> lst = new ArrayList<>();
        lst = casesAccessibles.getCasesAccessibles();
    }


}
