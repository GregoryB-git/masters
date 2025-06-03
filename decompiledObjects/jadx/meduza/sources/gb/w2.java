package gb;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class w2 implements q1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f6882b = Logger.getLogger(w2.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor<?> f6883c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f6884d;

    /* renamed from: e, reason: collision with root package name */
    public static final RuntimeException f6885e;
    public static final Object[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6886a;

    static {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        RuntimeException runtimeException = null;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
        } catch (Throwable th) {
            th = th;
            method = null;
        }
        try {
            cls.getMethod("sum", new Class[0]);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i10];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i10++;
                }
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            f6882b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
            if (th == null) {
            }
            f6883c = null;
            f6884d = null;
            runtimeException = new RuntimeException(th);
            f6885e = runtimeException;
            f = new Object[]{1L};
        }
        if (th == null || constructor == null) {
            f6883c = null;
            f6884d = null;
            runtimeException = new RuntimeException(th);
        } else {
            f6883c = constructor;
            f6884d = method;
        }
        f6885e = runtimeException;
        f = new Object[]{1L};
    }

    public w2() {
        RuntimeException runtimeException = f6885e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f6886a = f6883c.newInstance(new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // gb.q1
    public final void b() {
        try {
            f6884d.invoke(this.f6886a, f);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
