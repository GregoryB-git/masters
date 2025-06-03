// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q6;

import android.os.Handler$Callback;
import kotlin.jvm.internal.Intrinsics;
import android.os.Build$VERSION;
import android.os.Handler;
import V5.o;
import kotlin.jvm.internal.g;
import android.os.Looper;
import V5.n;
import android.view.Choreographer;

public abstract class e
{
    public static final d a;
    private static volatile Choreographer choreographer;
    
    static {
        final d d = null;
        Object a2 = null;
        try {
            final n.a o = n.o;
            n.a(new c(a(Looper.getMainLooper(), true), null, 2, null));
        }
        finally {
            final n.a o2 = n.o;
            final Throwable t;
            a2 = n.a(o.a(t));
        }
        if (n.c(a2)) {
            a2 = d;
        }
        a = (d)a2;
    }
    
    public static final Handler a(Looper o, final boolean b) {
        Label_0113: {
            if (!b) {
                break Label_0113;
            }
            if (Build$VERSION.SDK_INT >= 28) {
                o = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, o);
                Intrinsics.c(o, "null cannot be cast to non-null type android.os.Handler");
                return (Handler)o;
            }
            while (true) {
                while (true) {
                    try {
                        o = Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(o, null, Boolean.TRUE);
                        break;
                        return new Handler((Looper)o);
                        return new Handler((Looper)o);
                    }
                    catch (NoSuchMethodException ex) {}
                    continue;
                }
            }
        }
        return (Handler)o;
    }
}
