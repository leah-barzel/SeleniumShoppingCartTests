# Atid Store Automation Testing

## Project Overview
This project is designed to automate the testing of the Atid online store located at [https://atid.store](https://atid.store). The test scenario involves navigating to the store, selecting two random products from the accessories category, adding them to the cart, and completing the purchase.

## Technologies Used
- **Java**: The programming language used for automation.
- **Selenium WebDriver**: For automating web browser interactions.
- **JUnit 5**: For structuring the test cases and assertions.
- **Page Object Model (POM)**: For creating an abstraction layer between the test code and web elements.

## Test Scenario
1. **Navigate to the Store**: Open the Atid online store.
2. **Select Two Products**: Dynamically choose two products from the "Accessories" category.
3. **Access Product Pages**: Enter the product pages for both selected products.
4. **Add Products to Cart**: Add both products to the shopping cart.
5. **Navigate to Cart**: Access the cart and proceed to checkout.

## Implementation Details

### Dynamic Product Selection
The products are selected dynamically during runtime to ensure flexibility and randomness in testing. The `ChooseProductPage` class contains the logic to choose products from the accessories category.

### Page Objects
The following page object classes were implemented:
- `WebsiteNavigatorPage`: Handles navigation to different sections of the site.
- `ChooseProductPage`: Contains methods for selecting products.
- `AddingProdToCart`: Manages adding products to the shopping cart.
- `ViewCart`: Facilitates interactions with the shopping cart.
- `Checkout`: Manages the checkout process.

### Clean Code Principles
- **Single Responsibility Principle**: Each class has a single responsibility, managing specific actions related to a page or a functionality.
- **Open/Closed Principle**: The code is open for extension but closed for modification, allowing for easy addition of new test cases without altering existing code.
- **Liskov Substitution Principle**: Subtypes can be substituted for their base types without affecting the functionality, ensuring flexibility and reusability.
- **Interface Segregation Principle**: Interfaces are small and focused, ensuring that classes implement only the methods that are relevant to them.
- **Dependency Inversion Principle**: High-level modules do not depend on low-level modules but rather on abstractions, promoting loose coupling.

### Example Code Snippet
Here is a brief example of how the product selection is implemented:

```java
public List<WebElement> chooseUniqueProducts(int numProducts) {
    List<WebElement> selectedProducts = new ArrayList<>();
    Random rand = new Random();

    while (selectedProducts.size() < numProducts) {
        WebElement selectedProd = prodList.get(rand.nextInt(prodList.size()));
        if (!selectedProducts.contains(selectedProd)) {
            selectedProducts.add(selectedProd);
        }
    }
    return selectedProducts;
}
