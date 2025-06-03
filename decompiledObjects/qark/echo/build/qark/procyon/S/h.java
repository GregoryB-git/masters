// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S;

import V5.t;
import androidx.datastore.preferences.protobuf.w;
import java.util.Set;
import W5.m;
import java.util.List;
import kotlin.jvm.internal.g;
import V5.l;
import java.io.OutputStream;
import java.util.Iterator;
import R.f;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import X5.d;
import java.io.InputStream;
import P.k;

public final class h implements k
{
    public static final h a;
    public static final String b;
    
    static {
        a = new h();
        b = "preferences_pb";
    }
    
    @Override
    public Object b(final InputStream inputStream, final d d) {
        final f a = R.d.a.a(inputStream);
        final S.a b = e.b(new S.d.b[0]);
        final Map k = a.K();
        Intrinsics.checkNotNullExpressionValue(k, "preferencesProto.preferencesMap");
        for (final Map.Entry<String, V> entry : k.entrySet()) {
            final String s = entry.getKey();
            final R.h h = (R.h)entry.getValue();
            final h a2 = S.h.a;
            Intrinsics.checkNotNullExpressionValue(s, "name");
            Intrinsics.checkNotNullExpressionValue(h, "value");
            a2.d(s, h, b);
        }
        return b.d();
    }
    
    public final void d(final String s, final R.h h, final S.a a) {
        final R.h.b x = h.X();
        int n;
        if (x == null) {
            n = -1;
        }
        else {
            n = a.a[x.ordinal()];
        }
        S.d.a a2 = null;
        Object o = null;
        switch (n) {
            default: {
                throw new l();
            }
            case 8: {
                throw new P.a("Value not set.", null, 2, null);
            }
            case 7: {
                a2 = S.f.g(s);
                final List m = h.W().M();
                Intrinsics.checkNotNullExpressionValue(m, "value.stringSet.stringsList");
                o = W5.m.J(m);
                break;
            }
            case 6: {
                a2 = S.f.f(s);
                o = h.V();
                Intrinsics.checkNotNullExpressionValue(o, "value.string");
                break;
            }
            case 5: {
                a2 = S.f.e(s);
                o = h.U();
                break;
            }
            case 4: {
                a2 = S.f.d(s);
                o = h.T();
                break;
            }
            case 3: {
                a2 = S.f.b(s);
                o = h.R();
                break;
            }
            case 2: {
                a2 = S.f.c(s);
                o = h.S();
                break;
            }
            case 1: {
                a2 = S.f.a(s);
                o = h.P();
                break;
            }
            case -1: {
                throw new P.a("Value case is null.", null, 2, null);
            }
        }
        a.i(a2, o);
    }
    
    public S.d e() {
        return e.a();
    }
    
    public final String f() {
        return h.b;
    }
    
    public final R.h g(final Object o) {
        w w;
        String s;
        if (o instanceof Boolean) {
            w = ((w.a)R.h.Y().A((boolean)o)).s();
            s = "newBuilder().setBoolean(value).build()";
        }
        else if (o instanceof Float) {
            w = ((w.a)R.h.Y().C(((Number)o).floatValue())).s();
            s = "newBuilder().setFloat(value).build()";
        }
        else if (o instanceof Double) {
            w = ((w.a)R.h.Y().B(((Number)o).doubleValue())).s();
            s = "newBuilder().setDouble(value).build()";
        }
        else if (o instanceof Integer) {
            w = ((w.a)R.h.Y().D(((Number)o).intValue())).s();
            s = "newBuilder().setInteger(value).build()";
        }
        else if (o instanceof Long) {
            w = ((w.a)R.h.Y().E(((Number)o).longValue())).s();
            s = "newBuilder().setLong(value).build()";
        }
        else if (o instanceof String) {
            w = ((w.a)R.h.Y().F((String)o)).s();
            s = "newBuilder().setString(value).build()";
        }
        else {
            if (!(o instanceof Set)) {
                throw new IllegalStateException(Intrinsics.i("PreferencesSerializer does not support type: ", o.getClass().getName()));
            }
            w = ((w.a)R.h.Y().G(R.g.N().A((Iterable)o))).s();
            s = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        }
        Intrinsics.checkNotNullExpressionValue(w, s);
        return (R.h)w;
    }
    
    public Object h(final S.d d, final OutputStream outputStream, final d d2) {
        final Map a = d.a();
        final f.a n = f.N();
        for (final Map.Entry<S.d.a, V> entry : a.entrySet()) {
            n.A(entry.getKey().a(), this.g(entry.getValue()));
        }
        ((f)((w.a)n).s()).m(outputStream);
        return t.a;
    }
}
