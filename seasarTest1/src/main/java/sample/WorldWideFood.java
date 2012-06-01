package sample;

import java.io.IOException;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class WorldWideFood {
    private static String DELICIOUS_FOOD = "Ç®Ç¢ÇµÇ¢Ç‡ÇÃÇè–âÓ!!";
    public WorldFoods Food;

    public void foodSet(){
        Food.food();
    }

    public static void main(String[] args){
        SingletonS2ContainerFactory.init();
        WorldWideFood world = SingletonS2Container.getComponent("WorldWideFood");
        System.out.println(DELICIOUS_FOOD);
        world.foodSet();
        SingletonS2ContainerFactory.destroy();

    }
}
