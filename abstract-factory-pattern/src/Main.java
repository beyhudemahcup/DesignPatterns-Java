public class Main {
    public static void main(String[] args) {

        AbstractGame normalGame = createAbstractGame(new NormalGameFactory());
        normalGame.startGame();

        AbstractGame magicalGame = createAbstractGame(new MagicalGameFactory());
        magicalGame.startGame();


    }

    public static AbstractGame createAbstractGame(GameFactory gameFactory) {
        //game object is created
        AbstractGame abstractGame = gameFactory.newGame();

        //abstract rooms are created
        AbstractRoom room1 = gameFactory.createRoom();
        AbstractRoom room2 = gameFactory.createRoom();

        //abstract doors are created
        AbstractDoor door1 = gameFactory.createDoor();
        AbstractDoor door2 = gameFactory.createDoor();

        //room1 gets door2, room2 gets door1
        room1.createDoor(door2);
        room2.createDoor(door1);

        //rooms are added
        abstractGame.addRoom(room1);
        abstractGame.addRoom(room2);

        return abstractGame;
    }
}