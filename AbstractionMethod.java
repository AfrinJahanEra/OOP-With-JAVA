// abstract class Programming {
    // public abstract void Developer();
// }
// 
// class HTML extends Programming {
    // @Override
    // public void Developer() {
        // System.out.println("Tim Berners Lee");
    // }
// }
// 
// class Java extends Programming {
    // @Override
    // public void Developer() {
        // System.out.println("James Gosling");
    // }
// }
// 
// class AbstractionMethod {
    // public static void main(String[] args) {
        // HTML h = new HTML();
        // h.Developer();  // Outputs: Tim Berners Lee
// 
        // Java j = new Java();
        // j.Developer();  // Outputs: James Gosling
    // }
// }
// 


abstract class Programming {
    public abstract void Developer();
    public abstract void Rank();
}

class HTML extends Programming {
    @Override
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }
    @Override
    public void Rank() {
        System.out.println("3rd");
    }
}

abstract class Java extends Programming {
    @Override
    public void Developer() {
        System.out.println("James Gosling");
    }
}

class AbstractionMethod {
    public static void main(String[] args) {
        HTML h = new HTML();
        h.Developer(); h.Rank(); // Outputs: Tim Berners Lee
    }
}
