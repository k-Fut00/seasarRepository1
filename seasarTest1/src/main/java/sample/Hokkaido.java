package sample;

public class Hokkaido implements WorldFoods {

    private String HOKKAIDOFOOD = "�k�C���̓W���M�X�J��";
    /* (�� Javadoc)
     * @see sample.WorldFoods#food()
     */
    @Override
    public void food() {
        System.out.println(HOKKAIDOFOOD);

    }

}
