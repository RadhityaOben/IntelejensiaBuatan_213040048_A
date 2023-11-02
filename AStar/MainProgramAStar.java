package Tugas.AStar;

class MainProgramAstar {
    public static void main(String[] args) {
        // Membuat objek Node yang mewakili kota-kota
        Node btc = new Node("Bandung Trade Center", 6, 7);
        Node kings = new Node("Kings Shopping Center", 2, 6);
        Node ip = new Node("Istana Plaza", 9, 5);
        Node ciwalk = new Node("Cihampelas Walk", 12, 10);
        Node pvj = new Node("Paris Van Java", 5, 4);
        Node tsm = new Node("Trans Studio Mall", 6, 3);
        Node fcl = new Node("Festival City Link", 5, 8);

        btc.addTetangga(kings);
        btc.addTetangga(tsm);
        kings.addTetangga(btc);
        kings.addTetangga(tsm);
        kings.addTetangga(pvj);
        tsm.addTetangga(btc);
        tsm.addTetangga(kings);
        ip.addTetangga(pvj);
        ip.addTetangga(tsm);
        pvj.addTetangga(ciwalk);
        pvj.addTetangga(ip);
        pvj.addTetangga(kings);
        ciwalk.addTetangga(fcl);

        // Membuat objek AStarSearch
        AStarSearch astar = new AStarSearch();

        // Menjalankan algoritma A* untuk mencari rute dari bandung ke Medan
        astar.search(btc, ciwalk);
    }
}

