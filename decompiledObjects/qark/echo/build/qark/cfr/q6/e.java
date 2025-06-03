/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.view.Choreographer
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 */
package q6;

import V5.n;
import V5.o;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import q6.c;
import q6.d;

public abstract class e {
    public static final d a;
    private static volatile Choreographer choreographer;

    static {
        Object object;
        Object var1 = null;
        try {
            object = n.o;
            object = n.a(new c(e.a(Looper.getMainLooper(), true), null, 2, null));
        }
        catch (Throwable throwable) {
            n.a a8 = n.o;
            object = n.a(o.a(throwable));
        }
        if (n.c(object)) {
            object = var1;
        }
        a = (d)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Handler a(Looper object, boolean bl) {
        Constructor constructor;
        if (!bl) return new Handler((Looper)object);
        if (Build.VERSION.SDK_INT >= 28) {
            object = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object)null, new Object[]{object});
            Intrinsics.c(object, "null cannot be cast to non-null type android.os.Handler");
            do {
                return (Handler)object;
                break;
            } while (true);
        }
        try {
            constructor = Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return new Handler((Looper)object);
        }
        object = constructor.newInstance(new Object[]{object, null, Boolean.TRUE});
        return (Handler)object;
    }
}

