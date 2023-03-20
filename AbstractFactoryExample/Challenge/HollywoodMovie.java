
interface HollywoodMovie {
    void getMovieName();
}

class HollywoodComedyMovie implements HollywoodMovie {
    @Override
    public void getMovieName() {
        System.out.println("naruto is hollywood comedy movie");
    }
}

class HollywoodActionMovie implements HollywoodMovie {
    @Override
    public void getMovieName() {
        System.out.println("ninja saga is hollywoof action movie.");
    }
}