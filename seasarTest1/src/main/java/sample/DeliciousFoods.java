package sample;

import java.io.InputStream;
import java.util.Properties;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

import setting.SettingCode;

public class DeliciousFoods extends AbstractInterceptor {
    SettingCode setCode = new SettingCode();
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //propetiesファイル呼び出し
        Properties props = setCode.settingProperties();
        System.out.println(props.getProperty("FIRST_MESSAGE"));
        Object ret = invocation.proceed();
        System.out.println(props.getProperty("LAST_MESSAGE"));
        return ret;

    }

}
