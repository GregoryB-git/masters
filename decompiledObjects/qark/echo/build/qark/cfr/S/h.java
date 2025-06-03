/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package S;

import P.k;
import R.d;
import R.f;
import R.g;
import R.h;
import S.d;
import S.e;
import S.f;
import V5.l;
import V5.t;
import W5.m;
import androidx.datastore.preferences.protobuf.w;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class h
implements k {
    public static final h a = new h();
    public static final String b = "preferences_pb";

    @Override
    public Object b(InputStream object, X5.d object2) {
        object2 = R.d.a.a((InputStream)object);
        object = e.b(new d.b[0]);
        object2 = object2.K();
        Intrinsics.checkNotNullExpressionValue(object2, "preferencesProto.preferencesMap");
        object2 = object2.entrySet().iterator();
        while (object2.hasNext()) {
            Object object3 = (Map.Entry)object2.next();
            String string2 = (String)object3.getKey();
            object3 = (R.h)object3.getValue();
            h h8 = a;
            Intrinsics.checkNotNullExpressionValue(string2, "name");
            Intrinsics.checkNotNullExpressionValue(object3, "value");
            h8.d(string2, (R.h)object3, (S.a)object);
        }
        return object.d();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void d(String var1_1, R.h var2_2, S.a var3_3) {
        var5_4 = var2_2.X();
        var4_5 = var5_4 == null ? -1 : a.a[var5_4.ordinal()];
        switch (var4_5) {
            default: {
                throw new l();
            }
            case 8: {
                throw new P.a("Value not set.", null, 2, null);
            }
            case 7: {
                var1_1 = f.g((String)var1_1);
                var2_2 = var2_2.W().M();
                Intrinsics.checkNotNullExpressionValue(var2_2, "value.stringSet.stringsList");
                var2_2 = m.J((Iterable)var2_2);
                ** GOTO lbl38
            }
            case 6: {
                var1_1 = f.f((String)var1_1);
                var2_2 = var2_2.V();
                Intrinsics.checkNotNullExpressionValue(var2_2, "value.string");
                ** GOTO lbl38
            }
            case 5: {
                var1_1 = f.e((String)var1_1);
                var2_2 = var2_2.U();
                ** GOTO lbl38
            }
            case 4: {
                var1_1 = f.d((String)var1_1);
                var2_2 = var2_2.T();
                ** GOTO lbl38
            }
            case 3: {
                var1_1 = f.b((String)var1_1);
                var2_2 = var2_2.R();
                ** GOTO lbl38
            }
            case 2: {
                var1_1 = f.c((String)var1_1);
                var2_2 = Float.valueOf((float)var2_2.S());
                ** GOTO lbl38
            }
            case 1: {
                var1_1 = f.a((String)var1_1);
                var2_2 = var2_2.P();
lbl38: // 7 sources:
                var3_3.i((d.a)var1_1, var2_2);
                return;
            }
            case -1: 
        }
        throw new P.a("Value case is null.", null, 2, null);
    }

    public d e() {
        return e.a();
    }

    public final String f() {
        return b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final R.h g(Object object) {
        w w8;
        if (object instanceof Boolean) {
            w8 = R.h.Y().A((Boolean)object).s();
            object = "newBuilder().setBoolean(value).build()";
        } else if (object instanceof Float) {
            w8 = R.h.Y().C(((Number)object).floatValue()).s();
            object = "newBuilder().setFloat(value).build()";
        } else if (object instanceof Double) {
            w8 = R.h.Y().B(((Number)object).doubleValue()).s();
            object = "newBuilder().setDouble(value).build()";
        } else if (object instanceof Integer) {
            w8 = R.h.Y().D(((Number)object).intValue()).s();
            object = "newBuilder().setInteger(value).build()";
        } else if (object instanceof Long) {
            w8 = R.h.Y().E(((Number)object).longValue()).s();
            object = "newBuilder().setLong(value).build()";
        } else if (object instanceof String) {
            w8 = R.h.Y().F((String)object).s();
            object = "newBuilder().setString(value).build()";
        } else {
            if (!(object instanceof Set)) {
                throw new IllegalStateException(Intrinsics.i("PreferencesSerializer does not support type: ", object.getClass().getName()));
            }
            w8 = R.h.Y().G(g.N().A((Iterable)((Set)object))).s();
            object = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        }
        Intrinsics.checkNotNullExpressionValue(w8, (String)object);
        return (R.h)w8;
    }

    public Object h(d object, OutputStream outputStream, X5.d d8) {
        d8 = object.a();
        object = R.f.N();
        d8 = d8.entrySet().iterator();
        while (d8.hasNext()) {
            Object object2 = (Map.Entry)d8.next();
            d.a a8 = (d.a)object2.getKey();
            object2 = object2.getValue();
            object.A(a8.a(), this.g(object2));
        }
        ((R.f)object.s()).m(outputStream);
        return t.a;
    }

    public abstract class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] arrn = new int[h.b.values().length];
            arrn[h.b.p.ordinal()] = 1;
            arrn[h.b.q.ordinal()] = 2;
            arrn[h.b.v.ordinal()] = 3;
            arrn[h.b.r.ordinal()] = 4;
            arrn[h.b.s.ordinal()] = 5;
            arrn[h.b.t.ordinal()] = 6;
            arrn[h.b.u.ordinal()] = 7;
            arrn[h.b.w.ordinal()] = 8;
            a = arrn;
        }
    }

}

