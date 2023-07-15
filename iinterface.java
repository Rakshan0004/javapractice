public class iinterface {
    public static void main(String args[]) {
        queen q = new queen();
        q.moves();
    }
}

interface chessplayer {
    void moves(); // by defaulhis function is public ,abstract and we cannot implement this in
                  // chessplayer
} // bcz we r implementing abstraction

class queen implements chessplayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (int all 4 directions)");
    }
}

class rook implements chessplayer {
    public void moves() {
        System.out.println("up, down, right, left");
    }
}

class king implements chessplayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal (by 1 step)");
    }
}
