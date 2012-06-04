package sample;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class WorldWideFood {

    public WorldFoods Food;

    public void foodSet() throws IOException{
        Food.food();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException{
        //seasar2Ç≈ÇÃåƒÇ—èoÇµ
        SingletonS2ContainerFactory.init();
        WorldWideFood world = SingletonS2Container.getComponent("WorldWideFood");
        world.foodSet();
        SingletonS2ContainerFactory.destroy();

    }
}
