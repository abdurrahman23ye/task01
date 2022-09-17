package pages;

public class AllPages {

    private DizAltiCorapResultsPage dizAltiCorapResultsPage;
    private MainPage mainPage;
    private ProductAddingCartPage productAddingCartPage;
    private CartPage cartPage;
    private OrderPage orderPage;
    private AddingAdressPage addingAdressPage;

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

    public CartPage cartPage(){
        if (cartPage == null) {
            cartPage = new CartPage();
        }

        return cartPage;
    }

    public OrderPage orderPage(){
        if (orderPage == null) {
            orderPage = new OrderPage();
        }

        return orderPage;
    }

    public AddingAdressPage addingAdressPage(){
        if (addingAdressPage == null) {
            addingAdressPage = new AddingAdressPage();
        }

        return addingAdressPage;
    }
}