abstract class AbstractClassProgram {
    public abstract void sound();

}
class Dog extends AbstractClassProgram
{
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }
}
class Lion extends AbstractClassProgram
{
    @Override
    public void sound() {
        System.out.println("Lion Roars");
    }
}
class Test
{
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion();
        d.sound(); l.sound();
    }
}
