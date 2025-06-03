// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E1;

import kotlin.jvm.internal.Intrinsics;
import T1.a;
import android.content.Context;

public final class f
{
    public static final f a;
    
    static {
        a = new f();
    }
    
    public static final void d(final Context context) {
        if (T1.a.d(f.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                if (m.a("com.android.billingclient.api.Purchase") == null) {
                    return;
                }
                final h.b s = h.s;
                final h c = s.c(context);
                if (c == null) {
                    return;
                }
                if (s.f().get()) {
                    if (j.d()) {
                        c.p("inapp", new d());
                        return;
                    }
                    c.o("inapp", new e());
                }
                return;
                final Throwable t;
                T1.a.b(t, f.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void e() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            f.a.c();
        }
        finally {
            final Throwable t;
            T1.a.b(t, f.class);
        }
    }
    
    public static final void f() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            f.a.c();
        }
        finally {
            final Throwable t;
            T1.a.b(t, f.class);
        }
    }
    
    public final void c() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final j a = j.a;
            final h.b s = h.s;
            j.e(s.d(), s.e());
            s.d().clear();
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
}
