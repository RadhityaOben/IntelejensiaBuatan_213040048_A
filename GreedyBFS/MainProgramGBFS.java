package Tugas.GreedyBFS;

public class MainProgramGBFS {

    public static void main(String[] args) {
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

        GreedyBestFirstSearch gbfs = new GreedyBestFirstSearch();
        gbfs.search(btc, ciwalk);
    }
}
