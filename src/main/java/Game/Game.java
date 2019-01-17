package Game;

import Interfaces.IAttack;
import Players.Player;
import Room.Room;

public class Game {

    private Player player;
    private Room room;
    private Boolean isPlayerTurn, battleOver;

    public Game(Player player, Room room) {
        this.player = player;
        this.room = room;
        this.isPlayerTurn = true;
        this.battleOver = false;
    }

    public IAttack battle(){
        IAttack winner, enemy;

        enemy = this.room.getEnemy();

        while (!this.battleOver) {
            if (this.isPlayerTurn) {
                turn(this.player, enemy);
            } else {
                turn(enemy, this.player);
            }
        }

        if (this.isPlayerTurn) {
            winner = this.player;
        } else {
            winner = enemy;
        }

        return winner;
    }

    private void turn(IAttack attacker, IAttack attackee){
        attacker.attack(attackee);
        if (attackee.getHP() == 0) {
            this.battleOver = true;
        } else {
            this.isPlayerTurn = !this.isPlayerTurn;
        }
    }

    public Player getPlayer() {
        return player;
    }

    public Room getRoom() {
        return room;
    }

    public Boolean getPlayerTurn() {
        return isPlayerTurn;
    }

    public Boolean getBattleOver() {
        return battleOver;
    }
}
