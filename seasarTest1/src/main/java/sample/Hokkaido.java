package sample;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import setting.SettingCode;

public class Hokkaido implements WorldFoods {
    SettingCode setCode = new SettingCode();
        /* (非 Javadoc)
     * @see sample.WorldFoods#food()
     */
    @Override
    public void food() throws IOException {
            //propetiesファイル呼び出し
            Properties props = setCode.settingProperties();
            System.out.println(props.getProperty("HOKKAIDO_FOOD"));

    }

}
