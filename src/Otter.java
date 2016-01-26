/**
 * Created by User on 26.01.2016.
 */
public interface Animal{public default String getName(){return null;}}
interface Mammal{public default String getName(){return null;}}
abstract class Otter implements  Mammal, Animal{
}
