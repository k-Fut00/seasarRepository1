package sample;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import setting.SettingCode;

public class Hokkaido implements WorldFoods {
    SettingCode setCode = new SettingCode();
        /* (�� Javadoc)
     * @see sample.WorldFoods#food()
     */
    @Override
    public void food() throws IOException {
            //propeties�t�@�C���Ăяo��
            Properties props = setCode.settingProperties();
            System.out.println(props.getProperty("HOKKAIDO_FOOD"));

    }

}
