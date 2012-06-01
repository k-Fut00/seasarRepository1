package sample;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

public class DeliciousFoods extends AbstractInterceptor {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Ç≥ÇƒÇ≥Çƒç°ì˙è–âÓÇ∑ÇÈÇÃÇÕ");
        Object ret = invocation.proceed();
        System.out.println("Ç«Ç§Ç≈ÇµÇΩÇ©ÅB");
        return ret;

    }

}
