
public abstract class AbstractFactory {
    public abstract BollywoodMovie getBollywoodMovie(String movieType);

    public abstract HollywoodMovie getHollywoodMovie(String movieType);
}

class BollywoodMovieFactory extends AbstractFactory {
    @Override
    public BollywoodMovie getBollywoodMovie(String movieType) {
        switch (movieType.toLowerCase()) {
            case "action":
                return new BollywoodActionMovie();
            case "comedy":
                return new BollyWoodComedyMovie();
            default:
                return null;
        }
    }

    @Override
    public HollywoodMovie getHollywoodMovie(String movieType) {
        return null;
    }
}

class HollywoodMovieFactory extends AbstractFactory {

    @Override
    public HollywoodMovie getHollywoodMovie(String movieType) {
        switch (movieType.toLowerCase()) {
            case "action":
                return new HollywoodActionMovie();
            case "comedy":
                return new HollywoodComedyMovie();
            default:
                return null;
        }
    }

    @Override
    public BollywoodMovie getBollywoodMovie(String movieType) {
        return null;
    }
}
