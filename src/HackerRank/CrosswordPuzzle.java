package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class CrosswordPuzzle {
    public static void main(String[] args) {
        List<String> maze = new ArrayList<>(10);
        maze.add("++++++++++");
        maze.add("+------++");
        maze.add("+++-++++++");
        maze.add("+++-++++++");
        maze.add("+++-----++");
        maze.add("+++-++-+++");
        maze.add("++++++-+++");
        maze.add("++++++-+++");
        maze.add("++++++-+++");
        maze.add("++++++++++");
        String words = "POLAND;LHASA;SPAIN;INDIA";
        List<String> ans = crosswordPuzzle(maze,words,0,0);
    }
    public static List<String> crosswordPuzzle(List<String> crossword, String words, int r, int c) {
        if(crossword.get(r).contains("-")){

        }
        return null;
    }
}
