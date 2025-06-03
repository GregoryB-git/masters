// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T1;

import android.os.Handler;
import android.os.Looper;
import Q1.c;
import Q1.b;
import x1.B;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

public final class a
{
    public static final a a;
    public static final Set b;
    public static boolean c;
    
    static {
        a = new a();
        b = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public static final void a() {
        T1.a.c = true;
    }
    
    public static final void b(final Throwable t, final Object o) {
        Intrinsics.checkNotNullParameter(o, "o");
        if (!T1.a.c) {
            return;
        }
        T1.a.b.add(o);
        if (B.p()) {
            Q1.b.c(t);
            final c.a a = Q1.c.a.a;
            Q1.c.a.b(t, Q1.c.c.s).g();
        }
        e(t);
    }
    
    public static final boolean c() {
        return false;
    }
    
    public static final boolean d(final Object o) {
        Intrinsics.checkNotNullParameter(o, "o");
        return T1.a.b.contains(o);
    }
    
    public static final void e(final Throwable t) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post((Runnable)new Runnable() {
                @Override
                public void run() {
                    throw new RuntimeException(t);
                }
            });
        }
    }
}
