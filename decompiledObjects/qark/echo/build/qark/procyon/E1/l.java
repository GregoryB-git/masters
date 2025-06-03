// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E1;

import java.util.List;
import T1.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l
{
    public static final a g;
    public static l h;
    public static final AtomicBoolean i;
    public final Class a;
    public final Class b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;
    
    static {
        g = new a(null);
        i = new AtomicBoolean(false);
    }
    
    public l(final Class a, final Class b, final Method c, final Method d, final Method e, final Method f) {
        Intrinsics.checkNotNullParameter(a, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(b, "builderClazz");
        Intrinsics.checkNotNullParameter(c, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(d, "setTypeMethod");
        Intrinsics.checkNotNullParameter(e, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(f, "buildMethod");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static final /* synthetic */ AtomicBoolean a() {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            return l.i;
        }
        finally {
            final Throwable t;
            T1.a.b(t, l.class);
            return null;
        }
    }
    
    public static final /* synthetic */ l b() {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            return l.h;
        }
        finally {
            final Throwable t;
            T1.a.b(t, l.class);
            return null;
        }
    }
    
    public static final /* synthetic */ void c(final l h) {
        if (T1.a.d(l.class)) {
            return;
        }
        try {
            l.h = h;
        }
        finally {
            final Throwable t;
            T1.a.b(t, l.class);
        }
    }
    
    public final Object d(final String s, final List list) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            final m a = m.a;
            final Object e = m.e(this.a, this.c, null, new Object[0]);
            if (e == null) {
                return null;
            }
            final Object e2 = m.e(this.b, this.d, e, s);
            if (e2 == null) {
                return null;
            }
            final Object e3 = m.e(this.b, this.e, e2, list);
            if (e3 == null) {
                return null;
            }
            return m.e(this.b, this.f, e3, new Object[0]);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final Class e() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return this.a;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public static final class a
    {
        public final void a() {
            final Class a = m.a("com.android.billingclient.api.SkuDetailsParams");
            final Class a2 = m.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a != null) {
                if (a2 == null) {
                    return;
                }
                final Method d = m.d(a, "newBuilder", new Class[0]);
                final Method d2 = m.d(a2, "setType", String.class);
                final Method d3 = m.d(a2, "setSkusList", List.class);
                final Method d4 = m.d(a2, "build", new Class[0]);
                if (d != null && d2 != null && d3 != null) {
                    if (d4 == null) {
                        return;
                    }
                    l.c(new l(a, a2, d, d2, d3, d4));
                }
            }
        }
        
        public final l b() {
            if (l.a().get()) {
                return l.b();
            }
            this.a();
            l.a().set(true);
            return l.b();
        }
    }
}
