package setting;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SettingCode {

    public Properties settingProperties() throws IOException{
        //prppertiesからメッセージの取得
        final InputStream inputStream = this.getClass().getClassLoader()
                .getResourceAsStream("Messages_ja.properties");
        Properties props = new Properties();
        props.load(inputStream);
        return props;
    }
}
