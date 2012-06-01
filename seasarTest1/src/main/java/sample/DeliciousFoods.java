package sample;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

public class DeliciousFoods extends AbstractInterceptor {
    private String FIRST_MESSAGE = "さてさて今日紹介するのは";
    private String LAST_MESSAGE = "どうでしたか。";
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println(FIRST_MESSAGE);
        Object ret = invocation.proceed();
        System.out.println(LAST_MESSAGE);
        return ret;

    }

}
