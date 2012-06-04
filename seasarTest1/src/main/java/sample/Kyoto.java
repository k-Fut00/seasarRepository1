package sample;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import setting.SettingCode;

public class Kyoto implements WorldFoods {
    SettingCode setCode = new SettingCode();


    @Override
    public void food() throws IOException {
        //propetiesファイル呼び出し
        Properties props = setCode.settingProperties();
            System.out.println(props.getProperty("KYOTO_FOOD"));

   }

}
