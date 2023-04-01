package learning.com.serializable;

public class Person {
    private String name;
    private int height;
    private int weight;
    private transient String nickname;

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
//сделать несколько персон под разные сейвы
//чтобы сохранялась сериализация