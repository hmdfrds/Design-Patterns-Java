import java.util.List;

class InternetProxy implements Internet {
    private RealInternet realInternet;
    private String website;
    List<String> bannedSiteList = List.of("ban1.com", "ban2.com");

    public InternetProxy(String website) {
        this.website = website;
    }

    @Override
    public void connectToInternet() {
        if (realInternet == null) {
            realInternet = new RealInternet(website);
        }
        realInternet.connectToInternet();
        if (!bannedSiteList.contains(website)) {
            System.out.println("AccessApproved");
        } else {
            System.out.println("AccessDenied");
        }

    }

}