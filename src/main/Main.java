package main;

import algorithms.DeadLock;
import algorithms.Shuffle;
import models.Media;
import models.Pokemon;
import models.Session;
import ui.view.game.Game;
import ui.view.play.PokemonView;

import java.util.ArrayList;

public class Main {
    public static int map[][] = Shuffle.init();
    public static ArrayList<ArrayList<DeadLock.pokemon>> listStateMapPokemon ;
    public static  Media media = new Media();
    public static Session session = new Session();
//    public static PokemonView pokemonView = new PokemonView();
    public static int[][] updateMap(int x1, int y1, int x2, int y2){
        int level = session.getLastPlay().getLevel();
        listStateMapPokemon = DeadLock.updateStatusMap(listStateMapPokemon, map[x1][y1], x1, y1, x2, y2);
        map[x1][y1] = 0;
        map[x2][y2] = 0;
        if ( level == 1){
        }
        if (level == 2){
            map = Shuffle.changeStateMapLV2( map, x1, y1, x2, y2);
            listStateMapPokemon = DeadLock.initStatusMap(map);

        }
        if (level ==3){
            map = Shuffle.changeStateMapLV3(map, x1, y1, x2, y2);
            listStateMapPokemon = DeadLock.initStatusMap(map);

        }
        return map;
    }


    public static void main(String[] args) {
        Game.init(args);
    }
}
