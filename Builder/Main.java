public class Main {

    public static void main(String[] args) {
        Product p = new ProductBuilder()
                .setCode(1)
                .setName("Test")
                .setDescription("Test description")
                .setPrice(10D)
                .setCategory(Category.KITCHEN)
                .build();

        System.out.print(p.getCode() +
                         p.getName() +
                         p.getDescription() +
                         p.getPrice() +
                         p.getCategory());
    }
}
