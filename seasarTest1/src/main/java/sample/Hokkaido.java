package sample;

public class Hokkaido implements WorldFoods {

    /* (�� Javadoc)
     * @see sample.WorldFoods#food()
     */
    @Override
    public void food() {
        System.out.println("�k�C���̓W���M�X�J��");

    }

    public void sightseeing(){
        System.out.println("��i�͌ܗŊs");
    }

    public String kencho(){
        String kencho = "�D�y";
        return kencho;
    }
}
