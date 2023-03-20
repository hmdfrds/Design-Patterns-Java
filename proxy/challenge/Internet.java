interface Internet {
    void connectToInternet();
}

class RealInternet implements Internet {
    private String website;

    public RealInternet(String website) {
        this.website = website;
        System.out.println("Configurating.... Internet");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Connecting to " + website);
    }
}