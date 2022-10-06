package Week3Day4.Set;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int create(int num){
        int randomNum = (int)(Math.random() * num);
        return randomNum;
    }
}
