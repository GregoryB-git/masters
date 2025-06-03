/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 *  java.util.ArrayList
 *  java.util.BitSet
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.zip.GZIPInputStream
 *  java.util.zip.GZIPOutputStream
 */
package R2;

import A2.n;
import B2.b;
import R2.A;
import R2.B5;
import R2.C;
import R2.C5;
import R2.D;
import R2.D5;
import R2.G2;
import R2.I;
import R2.I2;
import R2.K;
import R2.P1;
import R2.S5;
import R2.W5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.b6;
import R2.f;
import R2.g;
import R2.g5;
import R2.k;
import R2.l;
import R2.l2;
import R2.m3;
import R2.p;
import R2.q3;
import R2.r3;
import R2.v5;
import R2.x2;
import R2.z5;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.W1;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.a2;
import com.google.android.gms.internal.measurement.c2;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.g2;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.gms.internal.measurement.z1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class N5
extends C5 {
    public N5(D5 d52) {
        super(d52);
    }

    public static com.google.android.gms.internal.measurement.a2 G(com.google.android.gms.internal.measurement.Y1 y12, String string2) {
        for (com.google.android.gms.internal.measurement.a2 a22 : y12.c0()) {
            if (!a22.c0().equals((Object)string2)) continue;
            return a22;
        }
        return null;
    }

    public static L4 H(L4 l42, byte[] arrby) {
        M3 m32 = M3.a();
        if (m32 != null) {
            return l42.r(arrby, m32);
        }
        return l42.m(arrby);
    }

    public static String L(boolean bl, boolean bl2, boolean bl3) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            stringBuilder.append("Dynamic ");
        }
        if (bl2) {
            stringBuilder.append("Sequence ");
        }
        if (bl3) {
            stringBuilder.append("Session-Scoped ");
        }
        return stringBuilder.toString();
    }

    public static List M(BitSet bitSet) {
        int n8 = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9;
            long l8 = 0L;
            for (int i9 = 0; i9 < 64 && (n9 = (i8 << 6) + i9) < bitSet.length(); ++i9) {
                long l9 = l8;
                if (bitSet.get(n9)) {
                    l9 = l8 | 1L << i9;
                }
                l8 = l9;
            }
            arrayList.add((Object)l8);
        }
        return arrayList;
    }

    public static void P(Uri.Builder builder, String string2, String string3, Set set) {
        if (!set.contains((Object)string2)) {
            if (TextUtils.isEmpty((CharSequence)string3)) {
                return;
            }
            builder.appendQueryParameter(string2, string3);
        }
    }

    public static void Q(Uri.Builder builder, String[] arrstring, Bundle bundle, Set set) {
        for (int i8 = 0; i8 < arrstring.length; ++i8) {
            Object object = arrstring[i8].split(",");
            String string2 = object[0];
            object = object[object.length - 1];
            if ((string2 = bundle.getString(string2)) == null) continue;
            N5.P(builder, (String)object, string2, set);
        }
    }

    public static void R(Y1.a a8, String object, Object object2) {
        int n8;
        block8 : {
            List list = a8.L();
            for (n8 = 0; n8 < list.size(); ++n8) {
                if (!object.equals((Object)((com.google.android.gms.internal.measurement.a2)list.get(n8)).c0())) {
                    continue;
                }
                break block8;
            }
            n8 = -1;
        }
        object = com.google.android.gms.internal.measurement.a2.Z().B((String)object);
        if (object2 instanceof Long) {
            object.y((Long)object2);
        } else if (object2 instanceof String) {
            object.D((String)object2);
        } else if (object2 instanceof Double) {
            object.x((Double)object2);
        }
        if (n8 >= 0) {
            a8.y(n8, (a2.a)object);
            return;
        }
        a8.B((a2.a)object);
    }

    public static void V(StringBuilder stringBuilder, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            stringBuilder.append("  ");
        }
    }

    public static void X(StringBuilder stringBuilder, int n8, String string2, z1 z12) {
        if (z12 == null) {
            return;
        }
        N5.V(stringBuilder, n8);
        stringBuilder.append(string2);
        stringBuilder.append(" {\n");
        if (z12.N()) {
            N5.Z(stringBuilder, n8, "comparison_type", z12.G().name());
        }
        if (z12.P()) {
            N5.Z(stringBuilder, n8, "match_as_float", z12.M());
        }
        if (z12.O()) {
            N5.Z(stringBuilder, n8, "comparison_value", z12.J());
        }
        if (z12.R()) {
            N5.Z(stringBuilder, n8, "min_comparison_value", z12.L());
        }
        if (z12.Q()) {
            N5.Z(stringBuilder, n8, "max_comparison_value", z12.K());
        }
        N5.V(stringBuilder, n8);
        stringBuilder.append("}\n");
    }

    public static void Y(StringBuilder stringBuilder, int n8, String string2, f2 f22) {
        Object object;
        if (f22 == null) {
            return;
        }
        N5.V(stringBuilder, 3);
        stringBuilder.append(string2);
        stringBuilder.append(" {\n");
        if (f22.J() != 0) {
            N5.V(stringBuilder, 4);
            stringBuilder.append("results: ");
            string2 = f22.Z().iterator();
            n8 = 0;
            while (string2.hasNext()) {
                object = (Long)string2.next();
                if (n8 != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(object);
                ++n8;
            }
            stringBuilder.append('\n');
        }
        if (f22.R() != 0) {
            N5.V(stringBuilder, 4);
            stringBuilder.append("status: ");
            string2 = f22.b0().iterator();
            n8 = 0;
            while (string2.hasNext()) {
                object = (Long)string2.next();
                if (n8 != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(object);
                ++n8;
            }
            stringBuilder.append('\n');
        }
        if (f22.k() != 0) {
            N5.V(stringBuilder, 4);
            stringBuilder.append("dynamic_filter_timestamps: {");
            object = f22.Y().iterator();
            n8 = 0;
            while (object.hasNext()) {
                com.google.android.gms.internal.measurement.X1 x12 = (com.google.android.gms.internal.measurement.X1)object.next();
                if (n8 != 0) {
                    stringBuilder.append(", ");
                }
                string2 = x12.O() ? Integer.valueOf((int)x12.k()) : null;
                stringBuilder.append((Object)string2);
                stringBuilder.append(":");
                string2 = x12.N() ? Long.valueOf((long)x12.K()) : null;
                stringBuilder.append((Object)string2);
                ++n8;
            }
            stringBuilder.append("}\n");
        }
        if (f22.N() != 0) {
            N5.V(stringBuilder, 4);
            stringBuilder.append("sequence_filter_timestamps: {");
            f22 = f22.a0().iterator();
            n8 = 0;
            while (f22.hasNext()) {
                object = (g2)f22.next();
                if (n8 != 0) {
                    stringBuilder.append(", ");
                }
                string2 = object.P() ? Integer.valueOf((int)object.K()) : null;
                stringBuilder.append((Object)string2);
                stringBuilder.append(": [");
                string2 = object.O().iterator();
                int n9 = 0;
                while (string2.hasNext()) {
                    long l8 = (Long)string2.next();
                    if (n9 != 0) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(l8);
                    ++n9;
                }
                stringBuilder.append("]");
                ++n8;
            }
            stringBuilder.append("}\n");
        }
        N5.V(stringBuilder, 3);
        stringBuilder.append("}\n");
    }

    public static void Z(StringBuilder stringBuilder, int n8, String string2, Object object) {
        if (object == null) {
            return;
        }
        N5.V(stringBuilder, n8 + 1);
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append(object);
        stringBuilder.append('\n');
    }

    public static boolean c0(I i8, W5 w52) {
        n.i(i8);
        n.i(w52);
        if (TextUtils.isEmpty((CharSequence)w52.p) && TextUtils.isEmpty((CharSequence)w52.E)) {
            return false;
        }
        return true;
    }

    public static boolean d0(List list, int n8) {
        if (n8 < list.size() << 6 && (1L << n8 % 64 & (Long)list.get(n8 / 64)) != 0L) {
            return true;
        }
        return false;
    }

    public static Object e0(com.google.android.gms.internal.measurement.Y1 y32, String string2) {
        if ((y32 = N5.G(y32, string2)) != null) {
            if (y32.j0()) {
                return y32.d0();
            }
            if (y32.h0()) {
                return y32.X();
            }
            if (y32.f0()) {
                return y32.G();
            }
            if (y32.V() > 0) {
                string2 = y32.e0();
                y32 = new ArrayList();
                string2 = string2.iterator();
                while (string2.hasNext()) {
                    com.google.android.gms.internal.measurement.a2 a22 = (com.google.android.gms.internal.measurement.a2)string2.next();
                    if (a22 == null) continue;
                    Bundle bundle = new Bundle();
                    for (com.google.android.gms.internal.measurement.a2 a23 : a22.e0()) {
                        if (a23.j0()) {
                            bundle.putString(a23.c0(), a23.d0());
                            continue;
                        }
                        if (a23.h0()) {
                            bundle.putLong(a23.c0(), a23.X());
                            continue;
                        }
                        if (!a23.f0()) continue;
                        bundle.putDouble(a23.c0(), a23.G());
                    }
                    if (bundle.isEmpty()) continue;
                    y32.add((Object)bundle);
                }
                return (Bundle[])y32.toArray((Object[])new Bundle[y32.size()]);
            }
        }
        return null;
    }

    public static boolean f0(String string2) {
        if (string2 != null && string2.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && string2.length() <= 310) {
            return true;
        }
        return false;
    }

    public static int y(d2.a a8, String string2) {
        if (a8 == null) {
            return -1;
        }
        for (int i8 = 0; i8 < a8.K(); ++i8) {
            if (!string2.equals((Object)a8.A0(i8).Z())) continue;
            return i8;
        }
        return -1;
    }

    public final long A(byte[] arrby) {
        n.i(arrby);
        this.k().n();
        MessageDigest messageDigest = S5.T0();
        if (messageDigest == null) {
            this.j().G().a("Failed to get MD5");
            return 0L;
        }
        return S5.B(messageDigest.digest(arrby));
    }

    public final I B(e e8) {
        String string2;
        Object object;
        Bundle bundle = this.D(e8.g(), true);
        object = bundle.containsKey("_o") && (object = bundle.get("_o")) != null ? object.toString() : "app";
        String string3 = string2 = r3.b(e8.e());
        if (string2 == null) {
            string3 = e8.e();
        }
        return new I(string3, new D(bundle), (String)object, e8.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    public final v5 C(String object, d2 d22, Y1.a object2, String string2) {
        Object object32;
        Object object4;
        if (!g7.a()) return null;
        if (!this.f().B((String)object, K.L0)) {
            return null;
        }
        long l8 = this.b().a();
        Object object5 = this.f().z((String)object, K.e0).split(",");
        Object object6 = new HashSet(object5.length);
        for (Object object32 : object5) {
            object32.getClass();
            if (object6.add(object32)) continue;
            object = new StringBuilder("duplicate element: ");
            object.append(object32);
            throw new IllegalArgumentException(object.toString());
        }
        Set set = Collections.unmodifiableSet((Set)object6);
        object5 = this.t();
        object32 = object5.r().Q((String)object);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(object5.f().z((String)object, K.Y));
        if (!TextUtils.isEmpty((CharSequence)object32)) {
            object6 = object5.f().z((String)object, K.Z);
            object4 = new StringBuilder();
            object4.append((String)object32);
            object4.append(".");
            object4.append((String)object6);
            object32 = object4.toString();
        } else {
            object32 = object5.f().z((String)object, K.Z);
        }
        builder.authority((String)object32);
        builder.path(object5.f().z((String)object, K.a0));
        N5.P(builder, "gmp_app_id", d22.k0(), set);
        N5.P(builder, "gmp_version", "82001", set);
        object6 = d22.E3();
        object32 = this.f();
        object4 = K.O0;
        boolean bl = object32.B((String)object, (P1)object4);
        object5 = "";
        object32 = object6;
        if (bl) {
            object32 = object6;
            if (this.r().a0((String)object)) {
                object32 = "";
            }
        }
        N5.P(builder, "app_instance_id", (String)object32, set);
        N5.P(builder, "rdid", d22.o0(), set);
        N5.P(builder, "bundle_id", d22.D3(), set);
        object32 = object2.K();
        object6 = r3.a((String)object32);
        if (!TextUtils.isEmpty((CharSequence)object6)) {
            object32 = object6;
        }
        N5.P(builder, "app_event_name", (String)object32, set);
        N5.P(builder, "app_version", String.valueOf((int)d22.D0()), set);
        object32 = object6 = d22.m0();
        if (this.f().B((String)object, (P1)object4)) {
            object32 = object6;
            if (this.r().e0((String)object)) {
                object32 = object5;
                if (this.f().B((String)object, K.B0)) {
                    object32 = object6;
                    if (!TextUtils.isEmpty((CharSequence)object6)) {
                        int n8 = object6.indexOf(".");
                        object32 = object6;
                        if (n8 != -1) {
                            object32 = object6.substring(0, n8);
                        }
                    }
                }
            }
        }
        N5.P(builder, "os_version", (String)object32, set);
        N5.P(builder, "timestamp", String.valueOf((long)object2.I()), set);
        bl = d22.w0();
        object32 = "1";
        if (bl) {
            N5.P(builder, "lat", "1", set);
        }
        N5.P(builder, "privacy_sandbox_version", String.valueOf((int)d22.k()), set);
        N5.P(builder, "trigger_uri_source", "1", set);
        N5.P(builder, "trigger_uri_timestamp", String.valueOf((long)l8), set);
        if (string2 != null) {
            N5.P(builder, "request_uuid", string2, set);
        }
        object2 = object2.L();
        string2 = new Bundle();
        object5 = object2.iterator();
        while (object5.hasNext()) {
            object2 = (com.google.android.gms.internal.measurement.a2)object5.next();
            object6 = object2.c0();
            if (object2.f0()) {
                object2 = String.valueOf((double)object2.G());
            } else if (object2.g0()) {
                object2 = String.valueOf((float)object2.R());
            } else if (object2.j0()) {
                object2 = object2.d0();
            } else {
                if (!object2.h0()) continue;
                object2 = String.valueOf((long)object2.X());
            }
            string2.putString((String)object6, (String)object2);
        }
        N5.Q(builder, this.f().z((String)object, K.d0).split("\\|"), (Bundle)string2, set);
        object2 = d22.t0();
        string2 = new Bundle();
        object5 = object2.iterator();
        while (object5.hasNext()) {
            object2 = (h2)object5.next();
            object6 = object2.Z();
            if (object2.b0()) {
                object2 = String.valueOf((double)object2.G());
            } else if (object2.c0()) {
                object2 = String.valueOf((float)object2.O());
            } else if (object2.f0()) {
                object2 = object2.a0();
            } else {
                if (!object2.d0()) continue;
                object2 = String.valueOf((long)object2.U());
            }
            string2.putString((String)object6, (String)object2);
        }
        N5.Q(builder, this.f().z((String)object, K.c0).split("\\|"), (Bundle)string2, set);
        if (!n6.a()) return new v5(builder.build().toString(), l8, 1);
        if (!this.f().s(K.T0)) return new v5(builder.build().toString(), l8, 1);
        object = d22.v0() ? object32 : "0";
        N5.P(builder, "dma", (String)object, set);
        if (d22.g0().isEmpty()) return new v5(builder.build().toString(), l8, 1);
        N5.P(builder, "dma_cps", d22.g0(), set);
        return new v5(builder.build().toString(), l8, 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Bundle D(Map map, boolean bl) {
        Bundle bundle = new Bundle();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = map.get((Object)string2);
            if (object == null) {
                object = null;
            } else {
                if (object instanceof Long) {
                    bundle.putLong(string2, ((Long)object).longValue());
                    continue;
                }
                if (object instanceof Double) {
                    bundle.putDouble(string2, ((Double)object).doubleValue());
                    continue;
                }
                if (object instanceof ArrayList) {
                    if (!bl) continue;
                    object = (ArrayList)object;
                    ArrayList arrayList = new ArrayList();
                    int n8 = object.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        Object object2 = object.get(i8);
                        arrayList.add((Object)this.D((Map)object2, false));
                    }
                    bundle.putParcelableArray(string2, (Parcelable[])arrayList.toArray((Object[])new Parcelable[0]));
                    continue;
                }
                object = object.toString();
            }
            bundle.putString(string2, (String)object);
        }
        return bundle;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Parcelable E(byte[] parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcel = Parcel.obtain();
        try {
            parcel.unmarshall((byte[])parcelable, 0, parcelable.length);
            parcel.setDataPosition(0);
            parcelable = (Parcelable)creator.createFromParcel(parcel);
        }
        catch (Throwable throwable) {}
        parcel.recycle();
        return parcelable;
        parcel.recycle();
        throw throwable;
        catch (b.a a8) {}
        {
            this.j().G().a("Failed to load parcelable from buffer");
        }
        parcel.recycle();
        return null;
    }

    public final com.google.android.gms.internal.measurement.Y1 F(A a8) {
        Y1.a a9 = com.google.android.gms.internal.measurement.Y1.Z().A(a8.e);
        Iterator iterator = a8.f.iterator();
        while (iterator.hasNext()) {
            Object object = (String)iterator.next();
            a2.a a10 = com.google.android.gms.internal.measurement.a2.Z().B((String)object);
            object = a8.f.k((String)object);
            n.i(object);
            this.S(a10, object);
            a9.B(a10);
        }
        return (com.google.android.gms.internal.measurement.Y1)((Y3)a9.p());
    }

    public final String I(x1 x12) {
        if (x12 == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nevent_filter {\n");
        if (x12.V()) {
            N5.Z(stringBuilder, 0, "filter_id", x12.L());
        }
        N5.Z(stringBuilder, 0, "event_name", this.h().c(x12.P()));
        String string2 = N5.L(x12.R(), x12.S(), x12.T());
        if (!string2.isEmpty()) {
            N5.Z(stringBuilder, 0, "filter_type", string2);
        }
        if (x12.U()) {
            N5.X(stringBuilder, 1, "event_count_filter", x12.O());
        }
        if (x12.k() > 0) {
            stringBuilder.append("  filters {\n");
            x12 = x12.Q().iterator();
            while (x12.hasNext()) {
                this.W(stringBuilder, 2, (y1)x12.next());
            }
        }
        N5.V(stringBuilder, 1);
        stringBuilder.append("}\n}\n");
        return stringBuilder.toString();
    }

    public final String J(A1 a12) {
        if (a12 == null) {
            return "null";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nproperty_filter {\n");
        if (a12.P()) {
            N5.Z(stringBuilder, 0, "filter_id", a12.k());
        }
        N5.Z(stringBuilder, 0, "property_name", this.h().g(a12.L()));
        String string2 = N5.L(a12.M(), a12.N(), a12.O());
        if (!string2.isEmpty()) {
            N5.Z(stringBuilder, 0, "filter_type", string2);
        }
        this.W(stringBuilder, 1, a12.I());
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    public final String K(c2 y32) {
        if (y32 == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nbatch {\n");
        for (d2 d22 : y32.L()) {
            if (d22 == null) continue;
            N5.V(stringBuilder, 1);
            stringBuilder.append("bundle {\n");
            if (d22.Z0()) {
                N5.Z(stringBuilder, 1, "protocol_version", d22.U1());
            }
            if (s7.a() && this.f().B(d22.D3(), K.y0) && d22.c1()) {
                N5.Z(stringBuilder, 1, "session_stitching_token", d22.p0());
            }
            N5.Z(stringBuilder, 1, "platform", d22.n0());
            if (d22.U0()) {
                N5.Z(stringBuilder, 1, "gmp_version", d22.d3());
            }
            if (d22.h1()) {
                N5.Z(stringBuilder, 1, "uploading_gmp_version", d22.w3());
            }
            if (d22.S0()) {
                N5.Z(stringBuilder, 1, "dynamite_version", d22.Q2());
            }
            if (d22.B0()) {
                N5.Z(stringBuilder, 1, "config_version", d22.C2());
            }
            N5.Z(stringBuilder, 1, "gmp_app_id", d22.k0());
            N5.Z(stringBuilder, 1, "admob_app_id", d22.C3());
            N5.Z(stringBuilder, 1, "app_id", d22.D3());
            N5.Z(stringBuilder, 1, "app_version", d22.d0());
            if (d22.y0()) {
                N5.Z(stringBuilder, 1, "app_version_major", d22.D0());
            }
            N5.Z(stringBuilder, 1, "firebase_instance_id", d22.j0());
            if (d22.R0()) {
                N5.Z(stringBuilder, 1, "dev_cert_hash", d22.J2());
            }
            N5.Z(stringBuilder, 1, "app_store", d22.F3());
            if (d22.g1()) {
                N5.Z(stringBuilder, 1, "upload_timestamp_millis", d22.t3());
            }
            if (d22.d1()) {
                N5.Z(stringBuilder, 1, "start_timestamp_millis", d22.n3());
            }
            if (d22.T0()) {
                N5.Z(stringBuilder, 1, "end_timestamp_millis", d22.X2());
            }
            if (d22.Y0()) {
                N5.Z(stringBuilder, 1, "previous_bundle_start_timestamp_millis", d22.k3());
            }
            if (d22.X0()) {
                N5.Z(stringBuilder, 1, "previous_bundle_end_timestamp_millis", d22.h3());
            }
            N5.Z(stringBuilder, 1, "app_instance_id", d22.E3());
            N5.Z(stringBuilder, 1, "resettable_device_id", d22.o0());
            N5.Z(stringBuilder, 1, "ds_id", d22.i0());
            if (d22.W0()) {
                N5.Z(stringBuilder, 1, "limited_ad_tracking", d22.w0());
            }
            N5.Z(stringBuilder, 1, "os_version", d22.m0());
            N5.Z(stringBuilder, 1, "device_model", d22.h0());
            N5.Z(stringBuilder, 1, "user_default_language", d22.q0());
            if (d22.f1()) {
                N5.Z(stringBuilder, 1, "time_zone_offset_minutes", d22.m2());
            }
            if (d22.A0()) {
                N5.Z(stringBuilder, 1, "bundle_sequential_index", d22.i1());
            }
            if (d22.b1()) {
                N5.Z(stringBuilder, 1, "service_upload", d22.x0());
            }
            N5.Z(stringBuilder, 1, "health_monitor", d22.l0());
            if (d22.a1()) {
                N5.Z(stringBuilder, 1, "retry_counter", d22.e2());
            }
            if (d22.P0()) {
                N5.Z(stringBuilder, 1, "consent_signals", d22.f0());
            }
            if (d22.V0()) {
                N5.Z(stringBuilder, 1, "is_dma_region", d22.v0());
            }
            if (d22.Q0()) {
                N5.Z(stringBuilder, 1, "core_platform_services", d22.g0());
            }
            if (d22.C0()) {
                N5.Z(stringBuilder, 1, "consent_diagnostics", d22.e0());
            }
            if (d22.e1()) {
                N5.Z(stringBuilder, 1, "target_os_version", d22.q3());
            }
            if (g7.a() && this.f().B(d22.D3(), K.L0)) {
                N5.Z(stringBuilder, 1, "ad_services_version", d22.k());
                if (d22.z0() && (y32 = d22.z3()) != null) {
                    N5.V(stringBuilder, 2);
                    stringBuilder.append("attribution_eligibility_status {\n");
                    N5.Z(stringBuilder, 2, "eligible", y32.X());
                    N5.Z(stringBuilder, 2, "no_access_adservices_attribution_permission", y32.b0());
                    N5.Z(stringBuilder, 2, "pre_r", y32.c0());
                    N5.Z(stringBuilder, 2, "r_extensions_too_old", y32.d0());
                    N5.Z(stringBuilder, 2, "adservices_extension_too_old", y32.U());
                    N5.Z(stringBuilder, 2, "ad_storage_not_allowed", y32.R());
                    N5.Z(stringBuilder, 2, "measurement_manager_disabled", y32.a0());
                    N5.V(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            if ((y32 = d22.t0()) != null) {
                Iterator iterator = y32.iterator();
                while (iterator.hasNext()) {
                    h2 h22 = (h2)iterator.next();
                    if (h22 == null) continue;
                    N5.V(stringBuilder, 2);
                    stringBuilder.append("user_property {\n");
                    boolean bl = h22.e0();
                    Object var3_6 = null;
                    y32 = bl ? Long.valueOf((long)h22.W()) : null;
                    N5.Z(stringBuilder, 2, "set_timestamp_millis", y32);
                    N5.Z(stringBuilder, 2, "name", this.h().g(h22.Z()));
                    N5.Z(stringBuilder, 2, "string_value", h22.a0());
                    y32 = h22.d0() ? Long.valueOf((long)h22.U()) : null;
                    N5.Z(stringBuilder, 2, "int_value", y32);
                    y32 = var3_6;
                    if (h22.b0()) {
                        y32 = Double.valueOf((double)h22.G());
                    }
                    N5.Z(stringBuilder, 2, "double_value", y32);
                    N5.V(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            y32 = d22.r0();
            d22.D3();
            if (y32 != null) {
                y32 = y32.iterator();
                while (y32.hasNext()) {
                    W1 w12 = (W1)y32.next();
                    if (w12 == null) continue;
                    N5.V(stringBuilder, 2);
                    stringBuilder.append("audience_membership {\n");
                    if (w12.T()) {
                        N5.Z(stringBuilder, 2, "audience_id", w12.k());
                    }
                    if (w12.U()) {
                        N5.Z(stringBuilder, 2, "new_audience", w12.S());
                    }
                    N5.Y(stringBuilder, 2, "current_data", w12.Q());
                    if (w12.V()) {
                        N5.Y(stringBuilder, 2, "previous_data", w12.R());
                    }
                    N5.V(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            if ((y32 = d22.s0()) != null) {
                y32 = y32.iterator();
                while (y32.hasNext()) {
                    com.google.android.gms.internal.measurement.Y1 y12 = (com.google.android.gms.internal.measurement.Y1)y32.next();
                    if (y12 == null) continue;
                    N5.V(stringBuilder, 2);
                    stringBuilder.append("event {\n");
                    N5.Z(stringBuilder, 2, "name", this.h().c(y12.b0()));
                    if (y12.f0()) {
                        N5.Z(stringBuilder, 2, "timestamp_millis", y12.Y());
                    }
                    if (y12.e0()) {
                        N5.Z(stringBuilder, 2, "previous_timestamp_millis", y12.X());
                    }
                    if (y12.d0()) {
                        N5.Z(stringBuilder, 2, "count", y12.k());
                    }
                    if (y12.T() != 0) {
                        this.a0(stringBuilder, 2, y12.c0());
                    }
                    N5.V(stringBuilder, 2);
                    stringBuilder.append("}\n");
                }
            }
            N5.V(stringBuilder, 1);
            stringBuilder.append("}\n");
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }

    public final List N(List list, List list2) {
        int n8;
        list = new ArrayList((Collection)list);
        for (Integer n9 : list2) {
            if (n9 < 0) {
                this.j().L().b("Ignoring negative bit index to be cleared", (Object)n9);
                continue;
            }
            n8 = n9 / 64;
            if (n8 >= list.size()) {
                this.j().L().c("Ignoring bit index greater than bitSet size", (Object)n9, list.size());
                continue;
            }
            list.set(n8, (Object)((Long)list.get(n8) & 1L << n9 % 64));
        }
        int n10 = list.size();
        n8 = list.size() - 1;
        while (n8 >= 0 && (Long)list.get(n8) == 0L) {
            int n11 = n8 - 1;
            n10 = n8;
            n8 = n11;
        }
        return list.subList(0, n10);
    }

    public final Map O(Bundle bundle, boolean bl) {
        HashMap hashMap = new HashMap();
        for (String string2 : bundle.keySet()) {
            ArrayList arrayList = bundle.get(string2);
            boolean bl2 = arrayList instanceof Parcelable[];
            if (!(bl2 || arrayList instanceof ArrayList || arrayList instanceof Bundle)) {
                if (arrayList == null) continue;
                hashMap.put((Object)string2, (Object)arrayList);
                continue;
            }
            if (!bl) continue;
            ArrayList arrayList2 = new ArrayList();
            if (bl2) {
                for (Object object : (ArrayList)arrayList) {
                    if (!(object instanceof Bundle)) continue;
                    arrayList2.add((Object)this.O((Bundle)object, false));
                }
            } else if (arrayList instanceof ArrayList) {
                arrayList = arrayList;
                int n8 = arrayList.size();
                int n9 = 0;
                while (n9 < n8) {
                    Object object;
                    int n10;
                    object = arrayList.get(n9);
                    n9 = n10 = n9 + 1;
                    if (!(object instanceof Bundle)) continue;
                    arrayList2.add((Object)this.O((Bundle)object, false));
                    n9 = n10;
                }
            } else if (arrayList instanceof Bundle) {
                arrayList2.add((Object)this.O((Bundle)arrayList, false));
            }
            hashMap.put((Object)string2, (Object)arrayList2);
        }
        return hashMap;
    }

    public final void S(a2.a a8, Object arrbundle) {
        n.i(arrbundle);
        a8.G().E().C().F();
        if (arrbundle instanceof String) {
            a8.D((String)arrbundle);
            return;
        }
        if (arrbundle instanceof Long) {
            a8.y((Long)arrbundle);
            return;
        }
        if (arrbundle instanceof Double) {
            a8.x((Double)arrbundle);
            return;
        }
        if (arrbundle instanceof Bundle[]) {
            arrbundle = arrbundle;
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : arrbundle) {
                if (bundle == null) continue;
                a2.a a9 = com.google.android.gms.internal.measurement.a2.Z();
                for (Object object : bundle.keySet()) {
                    a2.a a10 = com.google.android.gms.internal.measurement.a2.Z().B((String)object);
                    if ((object = bundle.get((String)object)) instanceof Long) {
                        a10.y((Long)object);
                    } else if (object instanceof String) {
                        a10.D((String)object);
                    } else {
                        if (!(object instanceof Double)) continue;
                        a10.x((Double)object);
                    }
                    a9.z(a10);
                }
                if (a9.w() <= 0) continue;
                arrayList.add((Object)((com.google.android.gms.internal.measurement.a2)((Y3)a9.p())));
            }
            a8.A((Iterable)arrayList);
            return;
        }
        this.j().G().b("Ignoring invalid (type) event param value", arrbundle);
    }

    public final void T(d2.a a8) {
        this.j().K().a("Checking account type status for ad personalization signals");
        if (this.h0(a8.S0())) {
            Object object;
            block3 : {
                this.j().F().a("Turning off ad personalization due to account type");
                object = (h2)((Y3)h2.X().z("_npa").B(this.g().u()).y(1L).p());
                for (int i8 = 0; i8 < a8.K(); ++i8) {
                    if (!"_npa".equals((Object)a8.A0(i8).Z())) continue;
                    a8.A(i8, (h2)object);
                    break block3;
                }
                a8.G((h2)object);
            }
            if (n6.a() && this.f().s(K.T0)) {
                object = l.b(a8.U0());
                object.d(q3.a.s, k.v);
                a8.k0(object.toString());
            }
        }
    }

    public final void U(h2.a a8, Object object) {
        n.i(object);
        a8.D().A().w();
        if (object instanceof String) {
            a8.C((String)object);
            return;
        }
        if (object instanceof Long) {
            a8.y((Long)object);
            return;
        }
        if (object instanceof Double) {
            a8.x((Double)object);
            return;
        }
        this.j().G().b("Ignoring invalid (type) user attribute value", object);
    }

    public final void W(StringBuilder stringBuilder, int n8, y1 y12) {
        if (y12 == null) {
            return;
        }
        N5.V(stringBuilder, n8);
        stringBuilder.append("filter {\n");
        if (y12.O()) {
            N5.Z(stringBuilder, n8, "complement", y12.N());
        }
        if (y12.Q()) {
            N5.Z(stringBuilder, n8, "param_name", this.h().f(y12.M()));
        }
        if (y12.R()) {
            int n9 = n8 + 1;
            B1 b12 = y12.L();
            if (b12 != null) {
                N5.V(stringBuilder, n9);
                stringBuilder.append("string_filter");
                stringBuilder.append(" {\n");
                if (b12.O()) {
                    N5.Z(stringBuilder, n9, "match_type", b12.G().name());
                }
                if (b12.N()) {
                    N5.Z(stringBuilder, n9, "expression", b12.J());
                }
                if (b12.M()) {
                    N5.Z(stringBuilder, n9, "case_sensitive", b12.L());
                }
                if (b12.k() > 0) {
                    N5.V(stringBuilder, n8 + 2);
                    stringBuilder.append("expression_list {\n");
                    for (String string2 : b12.K()) {
                        N5.V(stringBuilder, n8 + 3);
                        stringBuilder.append(string2);
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append("}\n");
                }
                N5.V(stringBuilder, n9);
                stringBuilder.append("}\n");
            }
        }
        if (y12.P()) {
            N5.X(stringBuilder, n8 + 1, "number_filter", y12.K());
        }
        N5.V(stringBuilder, n8);
        stringBuilder.append("}\n");
    }

    public final void a0(StringBuilder stringBuilder, int n8, List object) {
        if (object == null) {
            return;
        }
        ++n8;
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            com.google.android.gms.internal.measurement.a2 a22 = (com.google.android.gms.internal.measurement.a2)iterator.next();
            if (a22 == null) continue;
            N5.V(stringBuilder, n8);
            stringBuilder.append("param {\n");
            boolean bl = a22.i0();
            Object var5_6 = null;
            object = bl ? this.h().f(a22.c0()) : null;
            N5.Z(stringBuilder, n8, "name", object);
            object = a22.j0() ? a22.d0() : null;
            N5.Z(stringBuilder, n8, "string_value", object);
            object = a22.h0() ? Long.valueOf((long)a22.X()) : null;
            N5.Z(stringBuilder, n8, "int_value", object);
            object = var5_6;
            if (a22.f0()) {
                object = a22.G();
            }
            N5.Z(stringBuilder, n8, "double_value", object);
            if (a22.V() > 0) {
                this.a0(stringBuilder, n8, a22.e0());
            }
            N5.V(stringBuilder, n8);
            stringBuilder.append("}\n");
        }
    }

    public final boolean b0(long l8, long l9) {
        if (l8 != 0L && l9 > 0L && Math.abs((long)(this.b().a() - l8)) <= l9) {
            return false;
        }
        return true;
    }

    public final byte[] g0(byte[] arrby) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream((OutputStream)byteArrayOutputStream);
            gZIPOutputStream.write(arrby);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            arrby = byteArrayOutputStream.toByteArray();
            return arrby;
        }
        catch (IOException iOException) {
            this.j().G().b("Failed to gzip content", (Object)iOException);
            throw iOException;
        }
    }

    public final boolean h0(String string2) {
        n.i(string2);
        I2 i22 = this.q().D0(string2);
        if (i22 == null) {
            return false;
        }
        if (this.g().y() && i22.q() && this.r().V(string2)) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] i0(byte[] arrby) {
        try {
            arrby = new byte[](arrby);
            GZIPInputStream gZIPInputStream = new GZIPInputStream((InputStream)arrby);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] arrby2 = new byte[1024];
            do {
                int n8;
                if ((n8 = gZIPInputStream.read(arrby2)) <= 0) {
                    gZIPInputStream.close();
                    arrby.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(arrby2, 0, n8);
            } while (true);
        }
        catch (IOException iOException) {}
        this.j().G().b("Failed to ungzip content", (Object)iOException);
        throw iOException;
    }

    public final List j0() {
        Map map = K.c(this.b.a());
        if (map != null) {
            if (map.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int n8 = (Integer)K.R.a(null);
            for (Map.Entry entry : map.entrySet()) {
                int n9;
                if (!((String)entry.getKey()).startsWith("measurement.id.")) continue;
                try {
                    n9 = Integer.parseInt((String)((String)entry.getValue()));
                    if (n9 == 0) continue;
                }
                catch (NumberFormatException numberFormatException) {
                    this.j().L().b("Experiment ID NumberFormatException", (Object)numberFormatException);
                    continue;
                }
                arrayList.add((Object)n9);
                if (arrayList.size() < n8) continue;
                this.j().L().b("Too many experiment IDs. Number of IDs", arrayList.size());
                break;
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return null;
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final long z(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return 0L;
        }
        return this.A(string2.getBytes(Charset.forName((String)"UTF-8")));
    }
}

