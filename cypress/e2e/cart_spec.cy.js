describe("Cart Test", () => {
  beforeEach(() => {
    cy.visit("https://www.saucedemo.com");
    cy.get("#user-name").type("standard_user");
    cy.get("#password").type("secret_sauce");
    cy.get("#login-button").click();
    cy.url().should("include", "/inventory.html");
  });

  it("Should add a product to the cart", () => {
    cy.get(".inventory_item").first().find(".btn_inventory").click();
    cy.get(".shopping_cart_badge").should("have.text", "1");
  });

  it("Should sort products by price low to high", () => {
    cy.get(".product_sort_container").select("lohi");
    cy.get(".inventory_item_price").first().should("have.text", "$7.99");
  });

  it("Should remove a product from the cart", () => {
    // Add sản phẩm
    cy.get(".inventory_item").first().find(".btn_inventory").click();
    cy.get(".shopping_cart_badge").should("have.text", "1");

    // Click lại nút (lúc này là Remove)
    cy.get(".inventory_item").first().find(".btn_inventory").click();

    // Badge biến mất
    cy.get(".shopping_cart_badge").should("not.exist");
  });

  it("Should proceed to checkout step two after filling information", () => {
    // Add sản phẩm
    cy.get(".inventory_item").first().find(".btn_inventory").click();
    cy.get(".shopping_cart_badge").should("have.text", "1");

    // Vào giỏ
    cy.get(".shopping_cart_link").click();
    cy.url().should("include", "/cart.html");

    // Checkout
    cy.get('[data-test="checkout"]').click();
    cy.url().should("include", "/checkout-step-one.html");

    // Nhập thông tin
    cy.get('[data-test="firstName"]').type("John");
    cy.get('[data-test="lastName"]').type("Doe");
    cy.get('[data-test="postalCode"]').type("12345");

    // Continue
    cy.get('[data-test="continue"]').click();

    // Sang bước 2
    cy.url().should("include", "/checkout-step-two.html");
  });
});
