package sample;

import java.io.IOException;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class WorldWideFood {
    public WorldFoods kyoto;

    public void foodSet(){
        kyoto.food();
    }

    public static void main(String[] args){
        SingletonS2ContainerFactory.init();
        WorldWideFood world = SingletonS2Container.getComponent("WorldWideFood");
        System.out.println("Ç®Ç¢ÇµÇ¢Ç‡ÇÃÇè–âÓ!!");
        world.foodSet();
        SingletonS2ContainerFactory.destroy();

    }
}
