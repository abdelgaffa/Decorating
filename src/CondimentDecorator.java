public class CondimentDecorator extends Beverage{
    Beverage beverage = new Beverage() {
        @Override
        public String getDescription() {
            return super.getDescription();
        }
    };
}
