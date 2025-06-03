/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.ThreadLocal
 */
package o6;

public abstract class b {
    public static final boolean a = false;
    public static final ThreadLocal[] b;

    static {
        ThreadLocal[] arrthreadLocal = new ThreadLocal[4];
        for (int i8 = 0; i8 < 4; ++i8) {
            arrthreadLocal[i8] = new ThreadLocal();
        }
        b = arrthreadLocal;
    }

    public static final boolean a() {
        return a;
    }
}

