package sample;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;

public class DeliciousFoods extends AbstractInterceptor {
    private String FIRST_MESSAGE = "���Ă��č����Љ��̂�";
    private String LAST_MESSAGE = "�ǂ��ł������B";
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
