/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.lang.reflect.Modifier
 */
package q6;

import X5.a;
import X5.g;
import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p6.G;

public final class b
extends a
implements G {
    private volatile Object _preHandler;

    public b() {
        super(G.m);
        this._preHandler = this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Method E() {
        Object object = this._preHandler;
        if (object != this) {
            return (Method)object;
        }
        Object var3_3 = null;
        try {
            Method method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            object = var3_3;
            if (Modifier.isPublic((int)method.getModifiers())) {
                boolean bl = Modifier.isStatic((int)method.getModifiers());
                object = var3_3;
                if (bl) {
                    object = method;
                }
            }
        }
        catch (Throwable throwable) {
            object = var3_3;
        }
        this._preHandler = object;
        return object;
    }

    @Override
    public void h(g object, Throwable throwable) {
        int n8 = Build.VERSION.SDK_INT;
        if (26 <= n8 && n8 < 28) {
            object = this.E();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            object = object != null ? object.invoke((Object)null, new Object[0]) : null;
            if (object instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler)object;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), throwable);
            }
        }
    }
}

