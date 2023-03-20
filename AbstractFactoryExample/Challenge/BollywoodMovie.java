
interface BollywoodMovie {
    void getMovieName();
}

class BollywoodActionMovie implements BollywoodMovie {
    @Override
    public void getMovieName() {
        System.out.println("wednesday is bollywood action movie");
    }
}

class BollyWoodComedyMovie implements BollywoodMovie {
    @Override
    public void getMovieName() {
        System.out.println("renaisance is a bollywood comedy movie");
    }
}