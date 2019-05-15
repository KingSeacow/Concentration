/**
 * The game of Concentration (also called Memory or Match Match)
 * 
 * Create a gameboard of tiles. Each tile contains a card that has exactly
 * one match on the board. Cards are originally show "face down" on the board.
 * 
 * Player chooses two random cards from the board. The chosen cards
 * are temporarily shown face up. If the cards match, they are removed from board.
 * 
 * Play continues, matching two cards at a time, until all cards have been matched.
 */
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Concentration extends Board
{
    // create the game board
    private Tile[][] gameboard = makeBoard();
    //public String[] cards = new String[] {"dog", "dog", "cat", "cat",
      //      "mouse", "mouse","wolf", "wolf",
    //        "monkey", "monkey", "bird", "bird"}; 
    private String[] CardS = getCards();
    /** 
     * The constructor for the game. Creates the 2-dim gameboard
     * by populating it with tiles.
     */
    public Concentration() { 
        int h = 0;     
        /**
        System.out.println("");
        //System.out.print('\u000C');
        for(int i=0; i < gameboard.length; i++) {
            for(int j = 0; j < gameboard[0].length; j++)
            {
                gameboard[i][j] = new Tile(cards[h]);
                h++;
                System.out.print(gameboard[i][j].getFace());
                //System.out.print(gameboard[i[j]]);
            }
            System.out.println("@");
        }
        //  to do
        System.out.println(""); 
        */
       
         int q = 0;
        for (int i = 0; i < gameboard.length; i ++)
        {
            for (int j = 0; j < gameboard[0].length; j ++)
            {
                gameboard[i][j] = new Tile(CardS[q]);
                q++;
            }
        }
        for (int i = 0; i < gameboard.length; i++)
        {
            for (int j = 0; j < gameboard[0].length; j ++)
            {
                if (gameboard[i][j].isFaceUp())
                {
                    System.out.print(gameboard[i][j].getFace() + "|");
                }
                else 
                {                  
                    System.out.print("down" + "|");
                }
            }
            System.out.println("\n");
        }
    }

    /**
     * Determine if the board is full of cards that have all been matched,
     * indicating the game is over
     * 
     * Precondition: gameboard is populated with tiles
     * 
     * @return true if all pairs of cards have been matched, false otherwse
     */
    public boolean allTilesMatch() {

        // to do
        int t = 0;
        for (int i = 0; i < gameboard.length; i++)
        {
            for (int j = 0; j < gameboard[0].length; j ++)
            {
                if (gameboard[i][j].isFaceUp())
                {
                    t++;
                }
            }
        }
        if (t == 12)
        {
            return true;
        }
        else 
        {
            return false;
        }

           
    }

    /**
     * Check for a match between the cards in the two tile locations.
     * For matched cards, remove from the board. For unmatched cares, them face down again.
     * 
     * Precondition: gameboard is populated with tiles,
     * row values (i values) must be in the range of 0 to gameboard.length,
     * column values (j values) must be in the range of 0 to gameboard[0].length
     * 
     * @param row1 the row value of Tile 1
     * @param column1 the column value of Tile 1
     * @param row2 the row value of Tile 2
     * @param column2 the column vlue of Tile 2
     * @return a message indicating whether or not a match occured
     */
    public String checkForMatch(int row1, int column1, int row2, int column2) {

        if (gameboard[row1][column1].getFace().equals(gameboard[row2][column2].getFace()))
        {
            return "that's a match";
        }
        else
        {
            //gameboard[row2][column2].foundMatch();
            gameboard[row1][column1].faceUp(false);
            gameboard[row2][column2].faceUp(false);
            return "those don't match";
        }

        
    }

    /**
     * Set  tile to show its card in the face up state
     * 
     * Precondition: gameboard is populated with tiles,
     * row values (i values) must be in the range of 0 to gameboard.length,
     * column values (j values) must be in the range of 0 to gameboard[0].length
     * 
     * @param row the row value of Tile
     * @param column the column value of Tile
     */
    public void showFaceUp (int row, int column) {
        gameboard[row][column].faceUp(true);
        for (int i = 0; i < gameboard.length; i++)
        {
            for (int j = 0; j < gameboard[0].length; j ++)
            {
                if (gameboard[i][j].isFaceUp())
                {
                    System.out.print(gameboard[i][j].getFace() + "|");
                }
                else 
                {
                    System.out.print("down" + "|");
                }
            }
            System.out.println("\n");
        }

        
        
        // to do 
    }

    /**
     * Returns a string representation of the board. A tab is placed between tiles,
     * and a newline is placed at the end of a row
     * 
     * Precondition: gameboard is populated with tiles
     * 
     * @return a string represetation of the board
     */
    public String toString() {

        // to do

        return "";
    }

}

