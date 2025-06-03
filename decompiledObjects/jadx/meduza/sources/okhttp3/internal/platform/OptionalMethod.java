package okhttp3.internal.platform;

import defpackage.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class OptionalMethod<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f12666a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12667b;

    /* renamed from: c, reason: collision with root package name */
    public final Class[] f12668c;

    public OptionalMethod(Class<?> cls, String str, Class... clsArr) {
        this.f12666a = cls;
        this.f12667b = str;
        this.f12668c = clsArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if ((r4.getModifiers() & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.reflect.Method a(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f12667b
            r1 = 0
            if (r0 == 0) goto L26
            java.lang.Class[] r2 = r3.f12668c
            java.lang.reflect.Method r4 = r4.getMethod(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L13
            int r0 = r4.getModifiers()     // Catch: java.lang.NoSuchMethodException -> L14
            r0 = r0 & 1
            if (r0 != 0) goto L14
        L13:
            r4 = r1
        L14:
            if (r4 == 0) goto L25
            java.lang.Class<?> r0 = r3.f12666a
            if (r0 == 0) goto L25
            java.lang.Class r2 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L25
            goto L26
        L25:
            r1 = r4
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.OptionalMethod.a(java.lang.Class):java.lang.reflect.Method");
    }

    public final Object b(T t, Object... objArr) {
        Method a10 = a(t.getClass());
        if (a10 == null) {
            StringBuilder l10 = f.l("Method ");
            l10.append(this.f12667b);
            l10.append(" not supported for object ");
            l10.append(t);
            throw new AssertionError(l10.toString());
        }
        try {
            return a10.invoke(t, objArr);
        } catch (IllegalAccessException e10) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a10);
            assertionError.initCause(e10);
            throw assertionError;
        }
    }

    public final void c(Object obj, Object... objArr) {
        try {
            Method a10 = a(obj.getClass());
            if (a10 == null) {
                return;
            }
            try {
                a10.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
