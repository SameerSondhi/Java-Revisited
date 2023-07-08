public class BlackJack {
    public static void main(String[] args) {
        String card = "king";
        int currentTotalValue = 15;
        int currentValue = switch(card) {
            case "king", "queen", "jack" -> 10;
            case "ace" -> {
                if (currentTotalValue <= 10) {
                    yield 11;
                } else {
                    yield 1;
                }
            }
            default -> Integer.parseInt(card);
        };
        int total = currentTotalValue + currentValue;
        System.out.printf("Current card value: %d%n",currentValue);
        System.out.printf("Total value: %d%n", total);
    }
}
