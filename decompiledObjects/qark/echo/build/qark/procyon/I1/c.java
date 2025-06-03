// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I1;

import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import W5.m;
import kotlin.jvm.internal.Intrinsics;
import O1.P;
import x1.B;
import T1.a;
import android.content.Context;
import y1.e;
import W5.I;
import java.util.Set;

public final class c
{
    public static final c a;
    public static final Set b;
    
    static {
        a = new c();
        b = I.f("fb_mobile_purchase", "StartTrial", "Subscribe");
    }
    
    public static final boolean d() {
        if (T1.a.d(c.class)) {
            return false;
        }
        Label_0041: {
            try {
                if (!B.z(B.l()) && !P.Z() && I1.e.b()) {
                    return true;
                }
            }
            finally {
                break Label_0041;
            }
            return false;
        }
        final Throwable t;
        T1.a.b(t, c.class);
        return false;
    }
    
    public static final void e(final String s, final e e) {
        if (T1.a.d(c.class)) {
            return;
        }
        Label_0054: {
            try {
                Intrinsics.checkNotNullParameter(s, "applicationId");
                Intrinsics.checkNotNullParameter(e, "event");
                if (c.a.c(e)) {
                    B.t().execute(new I1.a(s, e));
                    return;
                }
            }
            finally {
                break Label_0054;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, c.class);
    }
    
    public static final void f(final String s, final e e) {
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(s, "$applicationId");
            Intrinsics.checkNotNullParameter(e, "$event");
            final I1.e a = e.a;
            e.c(s, m.b(e));
        }
        finally {
            final Throwable t;
            T1.a.b(t, c.class);
        }
    }
    
    public static final void g(final String s, final String s2) {
        if (T1.a.d(c.class)) {
            return;
        }
        Label_0049: {
            try {
                final Context l = B.l();
                if (l != null && s != null && s2 != null) {
                    B.t().execute(new b(l, s2, s));
                    return;
                }
            }
            finally {
                break Label_0049;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, c.class);
    }
    
    public static final void h(final Context context, final String s, final String s2) {
        if (T1.a.d(c.class)) {
            return;
        }
        Label_0077: {
            try {
                Intrinsics.checkNotNullParameter(context, "$context");
                final SharedPreferences sharedPreferences = context.getSharedPreferences(s, 0);
                final String i = Intrinsics.i(s2, "pingForOnDevice");
                if (sharedPreferences.getLong(i, 0L) == 0L) {
                    I1.e.e(s2);
                    final SharedPreferences$Editor edit = sharedPreferences.edit();
                    edit.putLong(i, System.currentTimeMillis());
                    edit.apply();
                    return;
                }
            }
            finally {
                break Label_0077;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, c.class);
    }
    
    public final boolean c(final e e) {
        final boolean d = T1.a.d(this);
        boolean b = false;
        if (d) {
            return false;
        }
        while (true) {
            while (true) {
                Label_0074: {
                    while (true) {
                        try {
                            if (e.h() && c.b.contains(e.f())) {
                                final int n = 1;
                                if ((e.h() ^ true) || n != 0) {
                                    b = true;
                                }
                                return b;
                            }
                            break Label_0074;
                            T1.a.b((Throwable)e, this);
                            return false;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final int n = 0;
                continue;
            }
        }
    }
}
