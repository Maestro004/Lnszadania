/***Срок сдачи : 23.02.2024 / 17:00
Animal деген класс тузунуз жана бир метод кошунуз.
Анын 3 наследнигин тузунуз.

Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
чыгарыныз.
Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.




Создайте класс Animal с одним методом которые есть 3 наследника такие как

Shark, с методом attack(), Turtle с методом swim(), Eagle с методом fly().

Создайте массив используя Animal и положите туда всех наследников.

Используя instanceOf и getClass() вызовите свои методы животных из массива Animal.

Для каждого объекта по отдельности создайте массив и разделите животных из Animal massiva и положите в свои массивы.
 */
public class Main {
    public static void main(String[] args) {

        Animal shark = new Shark();
        Animal turtle = new Turtle();
        Animal eagle = new Eagle();


        Animal[] animals = {shark,turtle,eagle};
        for (Animal animal : animals){
           if(animal instanceof Shark){
               ((Shark)animal).attack();
           }if (animal instanceof Turtle){
                ((Turtle)animal).swim();
            }if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            }




        }







    }
}