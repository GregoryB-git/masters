// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q6;

import android.os.Build$VERSION;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import X5.g;
import p6.G;
import X5.a;

public final class b extends a implements G
{
    private volatile Object _preHandler;
    
    public b() {
        super(G.m);
        this._preHandler = this;
    }
    
    public final Method E() {
        final Object preHandler = this._preHandler;
        if (preHandler != this) {
            return (Method)preHandler;
        }
        final Object o = null;
        try {
            final Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", (Class<?>[])new Class[0]);
            Object o2 = o;
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                final boolean static1 = Modifier.isStatic(declaredMethod.getModifiers());
                o2 = o;
                if (static1) {
                    o2 = declaredMethod;
                }
            }
            return (Method)(this._preHandler = o2);
        }
        finally {
            final Object o2 = o;
            return (Method)(this._preHandler = o2);
        }
    }
    
    @Override
    public void h(final g g, final Throwable t) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (26 <= sdk_INT && sdk_INT < 28) {
            final Method e = this.E();
            Object o = null;
            Object invoke;
            if (e != null) {
                invoke = e.invoke(null, new Object[0]);
            }
            else {
                invoke = null;
            }
            if (invoke instanceof Thread.UncaughtExceptionHandler) {
                o = invoke;
            }
            if (o != null) {
                ((Thread.UncaughtExceptionHandler)o).uncaughtException(Thread.currentThread(), t);
            }
        }
    }
}
