package pages;

public class AllPages {

    private DizAltiCorapResultsPage dizAltiCorapResultsPage;
    private MainPage mainPage;
    private ProductAddingCartPage productAddingCartPage;

    public ProductAddingCartPage productAddingCartPage() {
        if (productAddingCartPage == null) {
            productAddingCartPage = new ProductAddingCartPage();
        }
        return productAddingCartPage;
    }

    public DizAltiCorapResultsPage dizAltiCorapResultsPage() {
        if (dizAltiCorapResultsPage == null) {
            dizAltiCorapResultsPage = new DizAltiCorapResultsPage();
        }

        return dizAltiCorapResultsPage;
    }

    public MainPage mainPage(){
        if (mainPage == null) {
            mainPage = new MainPage();
        }

        return mainPage;
    }
}