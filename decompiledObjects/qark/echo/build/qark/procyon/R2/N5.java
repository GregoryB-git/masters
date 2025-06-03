// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.nio.charset.Charset;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;
import android.content.Context;
import com.google.android.gms.internal.measurement.B1;
import java.util.HashMap;
import java.util.Collection;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.W1;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.c2;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.Y3;
import B2.b;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.util.Map;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.h2;
import java.util.Collections;
import java.util.HashSet;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.e;
import java.security.MessageDigest;
import com.google.android.gms.internal.measurement.d2;
import android.os.BaseBundle;
import A2.n;
import com.google.android.gms.internal.measurement.g2;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.z1;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Set;
import android.net.Uri$Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.BitSet;
import com.google.android.gms.internal.measurement.M3;
import com.google.android.gms.internal.measurement.L4;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.a2;
import com.google.android.gms.internal.measurement.Y1;

public final class N5 extends C5
{
    public N5(final D5 d5) {
        super(d5);
    }
    
    public static a2 G(final Y1 y1, final String anObject) {
        for (final a2 a2 : y1.c0()) {
            if (a2.c0().equals(anObject)) {
                return a2;
            }
        }
        return null;
    }
    
    public static L4 H(final L4 l4, final byte[] array) {
        final M3 a = M3.a();
        if (a != null) {
            return l4.r(array, a);
        }
        return l4.m(array);
    }
    
    public static String L(final boolean b, final boolean b2, final boolean b3) {
        final StringBuilder sb = new StringBuilder();
        if (b) {
            sb.append("Dynamic ");
        }
        if (b2) {
            sb.append("Sequence ");
        }
        if (b3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }
    
    public static List M(final BitSet set) {
        final int initialCapacity = (set.length() + 63) / 64;
        final ArrayList list = new ArrayList<Long>(initialCapacity);
        for (int i = 0; i < initialCapacity; ++i) {
            long l = 0L;
            long n;
            for (int j = 0; j < 64; ++j, l = n) {
                final int bitIndex = (i << 6) + j;
                if (bitIndex >= set.length()) {
                    break;
                }
                n = l;
                if (set.get(bitIndex)) {
                    n = (l | 1L << j);
                }
            }
            list.add(l);
        }
        return list;
    }
    
    public static void P(final Uri$Builder uri$Builder, final String s, final String s2, final Set set) {
        if (!set.contains(s)) {
            if (TextUtils.isEmpty((CharSequence)s2)) {
                return;
            }
            uri$Builder.appendQueryParameter(s, s2);
        }
    }
    
    public static void Q(final Uri$Builder uri$Builder, final String[] array, final Bundle bundle, final Set set) {
        for (int i = 0; i < array.length; ++i) {
            final String[] split = array[i].split(",");
            final String s = split[0];
            final String s2 = split[split.length - 1];
            final String string = ((BaseBundle)bundle).getString(s);
            if (string != null) {
                P(uri$Builder, s2, string, set);
            }
        }
    }
    
    public static void R(final Y1.a a, final String s, final Object o) {
        final List l = a.L();
        int i = 0;
        while (true) {
            while (i < l.size()) {
                if (s.equals(l.get(i).c0())) {
                    final a2.a b = a2.Z().B(s);
                    if (o instanceof Long) {
                        b.y((long)o);
                    }
                    else if (o instanceof String) {
                        b.D((String)o);
                    }
                    else if (o instanceof Double) {
                        b.x((double)o);
                    }
                    if (i >= 0) {
                        a.y(i, b);
                        return;
                    }
                    a.B(b);
                    return;
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    public static void V(final StringBuilder sb, final int n) {
        for (int i = 0; i < n; ++i) {
            sb.append("  ");
        }
    }
    
    public static void X(final StringBuilder sb, final int n, final String str, final z1 z1) {
        if (z1 == null) {
            return;
        }
        V(sb, n);
        sb.append(str);
        sb.append(" {\n");
        if (z1.N()) {
            Z(sb, n, "comparison_type", z1.G().name());
        }
        if (z1.P()) {
            Z(sb, n, "match_as_float", z1.M());
        }
        if (z1.O()) {
            Z(sb, n, "comparison_value", z1.J());
        }
        if (z1.R()) {
            Z(sb, n, "min_comparison_value", z1.L());
        }
        if (z1.Q()) {
            Z(sb, n, "max_comparison_value", z1.K());
        }
        V(sb, n);
        sb.append("}\n");
    }
    
    public static void Y(final StringBuilder sb, int n, final String str, final f2 f2) {
        if (f2 == null) {
            return;
        }
        V(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (f2.J() != 0) {
            V(sb, 4);
            sb.append("results: ");
            final Iterator<Long> iterator = (Iterator<Long>)f2.Z().iterator();
            n = 0;
            while (iterator.hasNext()) {
                final Long obj = iterator.next();
                if (n != 0) {
                    sb.append(", ");
                }
                sb.append(obj);
                ++n;
            }
            sb.append('\n');
        }
        if (f2.R() != 0) {
            V(sb, 4);
            sb.append("status: ");
            final Iterator<Long> iterator2 = (Iterator<Long>)f2.b0().iterator();
            n = 0;
            while (iterator2.hasNext()) {
                final Long obj2 = iterator2.next();
                if (n != 0) {
                    sb.append(", ");
                }
                sb.append(obj2);
                ++n;
            }
            sb.append('\n');
        }
        if (f2.k() != 0) {
            V(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            final Iterator<X1> iterator3 = (Iterator<X1>)f2.Y().iterator();
            n = 0;
            while (iterator3.hasNext()) {
                final X1 x1 = iterator3.next();
                if (n != 0) {
                    sb.append(", ");
                }
                Integer value;
                if (x1.O()) {
                    value = x1.k();
                }
                else {
                    value = null;
                }
                sb.append(value);
                sb.append(":");
                Long value2;
                if (x1.N()) {
                    value2 = x1.K();
                }
                else {
                    value2 = null;
                }
                sb.append(value2);
                ++n;
            }
            sb.append("}\n");
        }
        if (f2.N() != 0) {
            V(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            final Iterator<g2> iterator4 = (Iterator<g2>)f2.a0().iterator();
            n = 0;
            while (iterator4.hasNext()) {
                final g2 g2 = iterator4.next();
                if (n != 0) {
                    sb.append(", ");
                }
                Integer value3;
                if (g2.P()) {
                    value3 = g2.K();
                }
                else {
                    value3 = null;
                }
                sb.append(value3);
                sb.append(": [");
                final Iterator iterator5 = g2.O().iterator();
                int n2 = 0;
                while (iterator5.hasNext()) {
                    final long longValue = iterator5.next();
                    if (n2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    ++n2;
                }
                sb.append("]");
                ++n;
            }
            sb.append("}\n");
        }
        V(sb, 3);
        sb.append("}\n");
    }
    
    public static void Z(final StringBuilder sb, final int n, final String str, final Object obj) {
        if (obj == null) {
            return;
        }
        V(sb, n + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }
    
    public static boolean c0(final I i, final W5 w5) {
        n.i(i);
        n.i(w5);
        return !TextUtils.isEmpty((CharSequence)w5.p) || !TextUtils.isEmpty((CharSequence)w5.E);
    }
    
    public static boolean d0(final List list, final int n) {
        return n < list.size() << 6 && (1L << n % 64 & (long)list.get(n / 64)) != 0x0L;
    }
    
    public static Object e0(final Y1 y1, final String s) {
        final a2 g = G(y1, s);
        if (g != null) {
            if (g.j0()) {
                return g.d0();
            }
            if (g.h0()) {
                return g.X();
            }
            if (g.f0()) {
                return g.G();
            }
            if (g.V() > 0) {
                final List e0 = g.e0();
                final ArrayList<BaseBundle> list = new ArrayList<BaseBundle>();
                for (final a2 a2 : e0) {
                    if (a2 != null) {
                        final Bundle bundle = new Bundle();
                        for (final a2 a3 : a2.e0()) {
                            if (a3.j0()) {
                                ((BaseBundle)bundle).putString(a3.c0(), a3.d0());
                            }
                            else if (a3.h0()) {
                                ((BaseBundle)bundle).putLong(a3.c0(), a3.X());
                            }
                            else {
                                if (!a3.f0()) {
                                    continue;
                                }
                                ((BaseBundle)bundle).putDouble(a3.c0(), a3.G());
                            }
                        }
                        if (((BaseBundle)bundle).isEmpty()) {
                            continue;
                        }
                        list.add((BaseBundle)bundle);
                    }
                }
                return list.toArray(new Bundle[list.size()]);
            }
        }
        return null;
    }
    
    public static boolean f0(final String s) {
        return s != null && s.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && s.length() <= 310;
    }
    
    public static int y(final d2.a a, final String s) {
        if (a == null) {
            return -1;
        }
        for (int i = 0; i < a.K(); ++i) {
            if (s.equals(a.A0(i).Z())) {
                return i;
            }
        }
        return -1;
    }
    
    public final long A(final byte[] input) {
        n.i(input);
        this.k().n();
        final MessageDigest t0 = S5.T0();
        if (t0 == null) {
            this.j().G().a("Failed to get MD5");
            return 0L;
        }
        return S5.B(t0.digest(input));
    }
    
    public final I B(final e e) {
        final Bundle d = this.D(e.g(), true);
        while (true) {
            Label_0043: {
                if (!((BaseBundle)d).containsKey("_o")) {
                    break Label_0043;
                }
                final Object value = ((BaseBundle)d).get("_o");
                if (value == null) {
                    break Label_0043;
                }
                final String string = value.toString();
                String s;
                if ((s = r3.b(e.e())) == null) {
                    s = e.e();
                }
                return new I(s, new D(d), string, e.a());
            }
            final String string = "app";
            continue;
        }
    }
    
    public final v5 C(String s, final d2 d2, final Y1.a a, final String s2) {
        if (g7.a() && this.f().B(s, K.L0)) {
            final long a2 = this.b().a();
            final String[] split = this.f().z(s, K.e0).split(",");
            final HashSet s3 = new HashSet<Object>(split.length);
            for (int length = split.length, i = 0; i < length; ++i) {
                final String s4 = split[i];
                s4.getClass();
                if (!s3.add(s4)) {
                    final StringBuilder sb = new StringBuilder("duplicate element: ");
                    sb.append((Object)s4);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)s3);
            final B5 t = this.t();
            final String q = t.r().Q(s);
            final Uri$Builder uri$Builder = new Uri$Builder();
            uri$Builder.scheme(t.f().z(s, K.Y));
            String s5;
            if (!TextUtils.isEmpty((CharSequence)q)) {
                final String z = t.f().z(s, K.Z);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(q);
                sb2.append(".");
                sb2.append(z);
                s5 = sb2.toString();
            }
            else {
                s5 = t.f().z(s, K.Z);
            }
            uri$Builder.authority(s5);
            uri$Builder.path(t.f().z(s, K.a0));
            P(uri$Builder, "gmp_app_id", d2.k0(), unmodifiableSet);
            P(uri$Builder, "gmp_version", "82001", unmodifiableSet);
            final String e3 = d2.E3();
            final g f = this.f();
            final P1 o0 = K.O0;
            final boolean b = f.B(s, o0);
            final String s6 = "";
            String s7 = e3;
            if (b) {
                s7 = e3;
                if (this.r().a0(s)) {
                    s7 = "";
                }
            }
            P(uri$Builder, "app_instance_id", s7, unmodifiableSet);
            P(uri$Builder, "rdid", d2.o0(), unmodifiableSet);
            P(uri$Builder, "bundle_id", d2.D3(), unmodifiableSet);
            String k = a.K();
            final String a3 = r3.a(k);
            if (!TextUtils.isEmpty((CharSequence)a3)) {
                k = a3;
            }
            P(uri$Builder, "app_event_name", k, unmodifiableSet);
            P(uri$Builder, "app_version", String.valueOf(d2.D0()), unmodifiableSet);
            String s9;
            final String s8 = s9 = d2.m0();
            if (this.f().B(s, o0)) {
                s9 = s8;
                if (this.r().e0(s)) {
                    s9 = s6;
                    if (this.f().B(s, K.B0)) {
                        s9 = s8;
                        if (!TextUtils.isEmpty((CharSequence)s8)) {
                            final int index = s8.indexOf(".");
                            s9 = s8;
                            if (index != -1) {
                                s9 = s8.substring(0, index);
                            }
                        }
                    }
                }
            }
            P(uri$Builder, "os_version", s9, unmodifiableSet);
            P(uri$Builder, "timestamp", String.valueOf(a.I()), unmodifiableSet);
            final boolean w0 = d2.w0();
            final String s10 = "1";
            if (w0) {
                P(uri$Builder, "lat", "1", unmodifiableSet);
            }
            P(uri$Builder, "privacy_sandbox_version", String.valueOf(d2.k()), unmodifiableSet);
            P(uri$Builder, "trigger_uri_source", "1", unmodifiableSet);
            P(uri$Builder, "trigger_uri_timestamp", String.valueOf(a2), unmodifiableSet);
            if (s2 != null) {
                P(uri$Builder, "request_uuid", s2, unmodifiableSet);
            }
            final List l = a.L();
            final Bundle bundle = new Bundle();
            for (final a2 a4 : l) {
                final String c0 = a4.c0();
                String s11;
                if (a4.f0()) {
                    s11 = String.valueOf(a4.G());
                }
                else if (a4.g0()) {
                    s11 = String.valueOf(a4.R());
                }
                else if (a4.j0()) {
                    s11 = a4.d0();
                }
                else {
                    if (!a4.h0()) {
                        continue;
                    }
                    s11 = String.valueOf(a4.X());
                }
                ((BaseBundle)bundle).putString(c0, s11);
            }
            Q(uri$Builder, this.f().z(s, K.d0).split("\\|"), bundle, unmodifiableSet);
            final List t2 = d2.t0();
            final Bundle bundle2 = new Bundle();
            for (final h2 h2 : t2) {
                final String z2 = h2.Z();
                String s12;
                if (h2.b0()) {
                    s12 = String.valueOf(h2.G());
                }
                else if (h2.c0()) {
                    s12 = String.valueOf(h2.O());
                }
                else if (h2.f0()) {
                    s12 = h2.a0();
                }
                else {
                    if (!h2.d0()) {
                        continue;
                    }
                    s12 = String.valueOf(h2.U());
                }
                ((BaseBundle)bundle2).putString(z2, s12);
            }
            Q(uri$Builder, this.f().z(s, K.c0).split("\\|"), bundle2, unmodifiableSet);
            if (n6.a() && this.f().s(K.T0)) {
                if (d2.v0()) {
                    s = s10;
                }
                else {
                    s = "0";
                }
                P(uri$Builder, "dma", s, unmodifiableSet);
                if (!d2.g0().isEmpty()) {
                    P(uri$Builder, "dma_cps", d2.g0(), unmodifiableSet);
                }
            }
            return new v5(uri$Builder.build().toString(), a2, 1);
        }
        return null;
    }
    
    public final Bundle D(final Map map, final boolean b) {
        final Bundle bundle = new Bundle();
        for (final String s : map.keySet()) {
            final V value = map.get(s);
            String string;
            if (value == null) {
                string = null;
            }
            else {
                if (value instanceof Long) {
                    ((BaseBundle)bundle).putLong(s, (long)value);
                    continue;
                }
                if (value instanceof Double) {
                    ((BaseBundle)bundle).putDouble(s, (double)value);
                    continue;
                }
                if (value instanceof ArrayList) {
                    if (b) {
                        final ArrayList<Map> list = (ArrayList<Map>)value;
                        final ArrayList<Bundle> list2 = new ArrayList<Bundle>();
                        final int size = list.size();
                        int i = 0;
                        while (i < size) {
                            final Map value2 = list.get(i);
                            ++i;
                            list2.add(this.D(value2, false));
                        }
                        bundle.putParcelableArray(s, (Parcelable[])list2.toArray(new Parcelable[0]));
                        continue;
                    }
                    continue;
                }
                else {
                    string = value.toString();
                }
            }
            ((BaseBundle)bundle).putString(s, string);
        }
        return bundle;
    }
    
    public final Parcelable E(final byte[] array, final Parcelable$Creator parcelable$Creator) {
        if (array == null) {
            return null;
        }
        final Parcel obtain = Parcel.obtain();
        while (true) {
            try {
                Label_0063: {
                    try {
                        obtain.unmarshall(array, 0, array.length);
                        obtain.setDataPosition(0);
                        final Parcelable parcelable = (Parcelable)parcelable$Creator.createFromParcel(obtain);
                        obtain.recycle();
                        return parcelable;
                    }
                    finally {
                        break Label_0063;
                    }
                    this.j().G().a("Failed to load parcelable from buffer");
                    obtain.recycle();
                    return null;
                }
                obtain.recycle();
                throw;
            }
            catch (b.a a) {}
            continue;
        }
    }
    
    public final Y1 F(final A a) {
        final Y1.a a2 = Y1.Z().A(a.e);
        for (final String s : a.f) {
            final a2.a b = com.google.android.gms.internal.measurement.a2.Z().B(s);
            final Object k = a.f.k(s);
            n.i(k);
            this.S(b, k);
            a2.B(b);
        }
        return (Y1)((Y3.b)a2).p();
    }
    
    public final String I(final x1 x1) {
        if (x1 == null) {
            return "null";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (x1.V()) {
            Z(sb, 0, "filter_id", x1.L());
        }
        Z(sb, 0, "event_name", this.h().c(x1.P()));
        final String l = L(x1.R(), x1.S(), x1.T());
        if (!l.isEmpty()) {
            Z(sb, 0, "filter_type", l);
        }
        if (x1.U()) {
            X(sb, 1, "event_count_filter", x1.O());
        }
        if (x1.k() > 0) {
            sb.append("  filters {\n");
            final Iterator<y1> iterator = x1.Q().iterator();
            while (iterator.hasNext()) {
                this.W(sb, 2, iterator.next());
            }
        }
        V(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }
    
    public final String J(final A1 a1) {
        if (a1 == null) {
            return "null";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (a1.P()) {
            Z(sb, 0, "filter_id", a1.k());
        }
        Z(sb, 0, "property_name", this.h().g(a1.L()));
        final String l = L(a1.M(), a1.N(), a1.O());
        if (!l.isEmpty()) {
            Z(sb, 0, "filter_type", l);
        }
        this.W(sb, 1, a1.I());
        sb.append("}\n");
        return sb.toString();
    }
    
    public final String K(final c2 c2) {
        if (c2 == null) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (final d2 d2 : c2.L()) {
            if (d2 != null) {
                V(sb, 1);
                sb.append("bundle {\n");
                if (d2.Z0()) {
                    Z(sb, 1, "protocol_version", d2.U1());
                }
                if (s7.a() && this.f().B(d2.D3(), K.y0) && d2.c1()) {
                    Z(sb, 1, "session_stitching_token", d2.p0());
                }
                Z(sb, 1, "platform", d2.n0());
                if (d2.U0()) {
                    Z(sb, 1, "gmp_version", d2.d3());
                }
                if (d2.h1()) {
                    Z(sb, 1, "uploading_gmp_version", d2.w3());
                }
                if (d2.S0()) {
                    Z(sb, 1, "dynamite_version", d2.Q2());
                }
                if (d2.B0()) {
                    Z(sb, 1, "config_version", d2.C2());
                }
                Z(sb, 1, "gmp_app_id", d2.k0());
                Z(sb, 1, "admob_app_id", d2.C3());
                Z(sb, 1, "app_id", d2.D3());
                Z(sb, 1, "app_version", d2.d0());
                if (d2.y0()) {
                    Z(sb, 1, "app_version_major", d2.D0());
                }
                Z(sb, 1, "firebase_instance_id", d2.j0());
                if (d2.R0()) {
                    Z(sb, 1, "dev_cert_hash", d2.J2());
                }
                Z(sb, 1, "app_store", d2.F3());
                if (d2.g1()) {
                    Z(sb, 1, "upload_timestamp_millis", d2.t3());
                }
                if (d2.d1()) {
                    Z(sb, 1, "start_timestamp_millis", d2.n3());
                }
                if (d2.T0()) {
                    Z(sb, 1, "end_timestamp_millis", d2.X2());
                }
                if (d2.Y0()) {
                    Z(sb, 1, "previous_bundle_start_timestamp_millis", d2.k3());
                }
                if (d2.X0()) {
                    Z(sb, 1, "previous_bundle_end_timestamp_millis", d2.h3());
                }
                Z(sb, 1, "app_instance_id", d2.E3());
                Z(sb, 1, "resettable_device_id", d2.o0());
                Z(sb, 1, "ds_id", d2.i0());
                if (d2.W0()) {
                    Z(sb, 1, "limited_ad_tracking", d2.w0());
                }
                Z(sb, 1, "os_version", d2.m0());
                Z(sb, 1, "device_model", d2.h0());
                Z(sb, 1, "user_default_language", d2.q0());
                if (d2.f1()) {
                    Z(sb, 1, "time_zone_offset_minutes", d2.m2());
                }
                if (d2.A0()) {
                    Z(sb, 1, "bundle_sequential_index", d2.i1());
                }
                if (d2.b1()) {
                    Z(sb, 1, "service_upload", d2.x0());
                }
                Z(sb, 1, "health_monitor", d2.l0());
                if (d2.a1()) {
                    Z(sb, 1, "retry_counter", d2.e2());
                }
                if (d2.P0()) {
                    Z(sb, 1, "consent_signals", d2.f0());
                }
                if (d2.V0()) {
                    Z(sb, 1, "is_dma_region", d2.v0());
                }
                if (d2.Q0()) {
                    Z(sb, 1, "core_platform_services", d2.g0());
                }
                if (d2.C0()) {
                    Z(sb, 1, "consent_diagnostics", d2.e0());
                }
                if (d2.e1()) {
                    Z(sb, 1, "target_os_version", d2.q3());
                }
                if (g7.a() && this.f().B(d2.D3(), K.L0)) {
                    Z(sb, 1, "ad_services_version", d2.k());
                    if (d2.z0()) {
                        final V1 z3 = d2.z3();
                        if (z3 != null) {
                            V(sb, 2);
                            sb.append("attribution_eligibility_status {\n");
                            Z(sb, 2, "eligible", z3.X());
                            Z(sb, 2, "no_access_adservices_attribution_permission", z3.b0());
                            Z(sb, 2, "pre_r", z3.c0());
                            Z(sb, 2, "r_extensions_too_old", z3.d0());
                            Z(sb, 2, "adservices_extension_too_old", z3.U());
                            Z(sb, 2, "ad_storage_not_allowed", z3.R());
                            Z(sb, 2, "measurement_manager_disabled", z3.a0());
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                final List t0 = d2.t0();
                if (t0 != null) {
                    for (final h2 h2 : t0) {
                        if (h2 != null) {
                            V(sb, 2);
                            sb.append("user_property {\n");
                            final boolean e0 = h2.e0();
                            final Object o = null;
                            Long value;
                            if (e0) {
                                value = h2.W();
                            }
                            else {
                                value = null;
                            }
                            Z(sb, 2, "set_timestamp_millis", value);
                            Z(sb, 2, "name", this.h().g(h2.Z()));
                            Z(sb, 2, "string_value", h2.a0());
                            Long value2;
                            if (h2.d0()) {
                                value2 = h2.U();
                            }
                            else {
                                value2 = null;
                            }
                            Z(sb, 2, "int_value", value2);
                            Object value3 = o;
                            if (h2.b0()) {
                                value3 = h2.G();
                            }
                            Z(sb, 2, "double_value", value3);
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                final List r0 = d2.r0();
                d2.D3();
                if (r0 != null) {
                    for (final W1 w1 : r0) {
                        if (w1 != null) {
                            V(sb, 2);
                            sb.append("audience_membership {\n");
                            if (w1.T()) {
                                Z(sb, 2, "audience_id", w1.k());
                            }
                            if (w1.U()) {
                                Z(sb, 2, "new_audience", w1.S());
                            }
                            Y(sb, 2, "current_data", w1.Q());
                            if (w1.V()) {
                                Y(sb, 2, "previous_data", w1.R());
                            }
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                final List s0 = d2.s0();
                if (s0 != null) {
                    for (final Y1 y1 : s0) {
                        if (y1 != null) {
                            V(sb, 2);
                            sb.append("event {\n");
                            Z(sb, 2, "name", this.h().c(y1.b0()));
                            if (y1.f0()) {
                                Z(sb, 2, "timestamp_millis", y1.Y());
                            }
                            if (y1.e0()) {
                                Z(sb, 2, "previous_timestamp_millis", y1.X());
                            }
                            if (y1.d0()) {
                                Z(sb, 2, "count", y1.k());
                            }
                            if (y1.T() != 0) {
                                this.a0(sb, 2, y1.c0());
                            }
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                V(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }
    
    public final List N(final List c, final List list) {
        final ArrayList<Long> list2 = new ArrayList<Long>(c);
        for (final Integer n : list) {
            if (n < 0) {
                this.j().L().b("Ignoring negative bit index to be cleared", n);
            }
            else {
                final int n2 = n / 64;
                if (n2 >= list2.size()) {
                    this.j().L().c("Ignoring bit index greater than bitSet size", n, list2.size());
                }
                else {
                    list2.set(n2, (long)list2.get(n2) & 1L << n % 64);
                }
            }
        }
        int size = list2.size();
        int n3;
        for (int index = list2.size() - 1; index >= 0 && list2.get(index) == 0L; index = n3) {
            n3 = index - 1;
            size = index;
        }
        return list2.subList(0, size);
    }
    
    public final Map O(final Bundle bundle, final boolean b) {
        final HashMap<String, Parcelable[]> hashMap = new HashMap<String, Parcelable[]>();
        for (final String s : ((BaseBundle)bundle).keySet()) {
            final Object value = ((BaseBundle)bundle).get(s);
            final boolean b2 = value instanceof Parcelable[];
            if (!b2 && !(value instanceof ArrayList) && !(value instanceof Bundle)) {
                if (value == null) {
                    continue;
                }
                hashMap.put(s, (Parcelable[])value);
            }
            else {
                if (!b) {
                    continue;
                }
                final ArrayList<Map> list = new ArrayList<Map>();
                if (b2) {
                    final Parcelable[] array = (Parcelable[])value;
                    for (int length = array.length, i = 0; i < length; ++i) {
                        final Parcelable parcelable = array[i];
                        if (parcelable instanceof Bundle) {
                            list.add(this.O((Bundle)parcelable, false));
                        }
                    }
                }
                else if (value instanceof ArrayList) {
                    final ArrayList<Bundle> list2 = (ArrayList<Bundle>)value;
                    int n;
                    for (int size = list2.size(), j = 0; j < size; j = n) {
                        final Bundle value2 = list2.get(j);
                        n = ++j;
                        if (value2 instanceof Bundle) {
                            list.add(this.O(value2, false));
                        }
                    }
                }
                else if (value instanceof Bundle) {
                    list.add(this.O((Bundle)value, false));
                }
                hashMap.put(s, (Parcelable[])(Object)list);
            }
        }
        return hashMap;
    }
    
    public final void S(final a2.a a, final Object o) {
        n.i(o);
        a.G().E().C().F();
        if (o instanceof String) {
            a.D((String)o);
            return;
        }
        if (o instanceof Long) {
            a.y((long)o);
            return;
        }
        if (o instanceof Double) {
            a.x((double)o);
            return;
        }
        if (o instanceof Bundle[]) {
            final Bundle[] array = (Bundle[])o;
            final ArrayList<a2> list = new ArrayList<a2>();
            for (int length = array.length, i = 0; i < length; ++i) {
                final Bundle bundle = array[i];
                if (bundle != null) {
                    final a2.a z = a2.Z();
                    for (final String s : ((BaseBundle)bundle).keySet()) {
                        final a2.a b = a2.Z().B(s);
                        final Object value = ((BaseBundle)bundle).get(s);
                        if (value instanceof Long) {
                            b.y((long)value);
                        }
                        else if (value instanceof String) {
                            b.D((String)value);
                        }
                        else {
                            if (!(value instanceof Double)) {
                                continue;
                            }
                            b.x((double)value);
                        }
                        z.z(b);
                    }
                    if (z.w() > 0) {
                        list.add((a2)((Y3.b)z).p());
                    }
                }
            }
            a.A(list);
            return;
        }
        this.j().G().b("Ignoring invalid (type) event param value", o);
    }
    
    public final void T(final d2.a a) {
        this.j().K().a("Checking account type status for ad personalization signals");
        if (this.h0(a.S0())) {
            this.j().F().a("Turning off ad personalization due to account type");
            final h2 h2 = (h2)((Y3.b)com.google.android.gms.internal.measurement.h2.X().z("_npa").B(this.g().u()).y(1L)).p();
            int i = 0;
            while (true) {
                while (i < a.K()) {
                    if ("_npa".equals(a.A0(i).Z())) {
                        a.A(i, h2);
                        if (n6.a() && this.f().s(K.T0)) {
                            final l b = l.b(a.U0());
                            b.d(q3.a.s, k.v);
                            a.k0(b.toString());
                        }
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                a.G(h2);
                continue;
            }
        }
    }
    
    public final void U(final h2.a a, final Object o) {
        n.i(o);
        a.D().A().w();
        if (o instanceof String) {
            a.C((String)o);
            return;
        }
        if (o instanceof Long) {
            a.y((long)o);
            return;
        }
        if (o instanceof Double) {
            a.x((double)o);
            return;
        }
        this.j().G().b("Ignoring invalid (type) user attribute value", o);
    }
    
    public final void W(final StringBuilder sb, final int n, final y1 y1) {
        if (y1 == null) {
            return;
        }
        V(sb, n);
        sb.append("filter {\n");
        if (y1.O()) {
            Z(sb, n, "complement", y1.N());
        }
        if (y1.Q()) {
            Z(sb, n, "param_name", this.h().f(y1.M()));
        }
        if (y1.R()) {
            final int n2 = n + 1;
            final B1 l = y1.L();
            if (l != null) {
                V(sb, n2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (l.O()) {
                    Z(sb, n2, "match_type", l.G().name());
                }
                if (l.N()) {
                    Z(sb, n2, "expression", l.J());
                }
                if (l.M()) {
                    Z(sb, n2, "case_sensitive", l.L());
                }
                if (l.k() > 0) {
                    V(sb, n + 2);
                    sb.append("expression_list {\n");
                    for (final String str : l.K()) {
                        V(sb, n + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                V(sb, n2);
                sb.append("}\n");
            }
        }
        if (y1.P()) {
            X(sb, n + 1, "number_filter", y1.K());
        }
        V(sb, n);
        sb.append("}\n");
    }
    
    public final void a0(final StringBuilder sb, int n, final List list) {
        if (list == null) {
            return;
        }
        ++n;
        for (final a2 a2 : list) {
            if (a2 != null) {
                V(sb, n);
                sb.append("param {\n");
                final boolean i0 = a2.i0();
                final Object o = null;
                String f;
                if (i0) {
                    f = this.h().f(a2.c0());
                }
                else {
                    f = null;
                }
                Z(sb, n, "name", f);
                String d0;
                if (a2.j0()) {
                    d0 = a2.d0();
                }
                else {
                    d0 = null;
                }
                Z(sb, n, "string_value", d0);
                Long value;
                if (a2.h0()) {
                    value = a2.X();
                }
                else {
                    value = null;
                }
                Z(sb, n, "int_value", value);
                Object value2 = o;
                if (a2.f0()) {
                    value2 = a2.G();
                }
                Z(sb, n, "double_value", value2);
                if (a2.V() > 0) {
                    this.a0(sb, n, a2.e0());
                }
                V(sb, n);
                sb.append("}\n");
            }
        }
    }
    
    public final boolean b0(final long n, final long n2) {
        return n == 0L || n2 <= 0L || Math.abs(this.b().a() - n) > n2;
    }
    
    public final byte[] g0(byte[] byteArray) {
        try {
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(out);
            gzipOutputStream.write(byteArray);
            gzipOutputStream.close();
            out.close();
            byteArray = out.toByteArray();
            return byteArray;
        }
        catch (IOException ex) {
            this.j().G().b("Failed to gzip content", ex);
            throw ex;
        }
    }
    
    public final boolean h0(final String s) {
        n.i(s);
        final I2 d0 = this.q().D0(s);
        return d0 != null && (this.g().y() && d0.q() && this.r().V(s));
    }
    
    public final byte[] i0(byte[] byteArray) {
        while (true) {
            try {
                final ByteArrayInputStream in = new ByteArrayInputStream(byteArray);
                final GZIPInputStream gzipInputStream = new GZIPInputStream(in);
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                final byte[] array = new byte[1024];
                while (true) {
                    final int read = gzipInputStream.read(array);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(array, 0, read);
                }
                gzipInputStream.close();
                in.close();
                byteArray = byteArrayOutputStream.toByteArray();
                return byteArray;
                final IOException ex;
                this.j().G().b("Failed to ungzip content", ex);
                throw ex;
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public final List j0() {
        final Map c = K.c(super.b.a());
        if (c == null) {
            return null;
        }
        if (c.isEmpty()) {
            return null;
        }
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final int intValue = (int)K.R.a(null);
        for (final Map.Entry<String, V> entry : c.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    final int int1 = Integer.parseInt((String)entry.getValue());
                    if (int1 == 0) {
                        continue;
                    }
                    list.add(int1);
                    if (list.size() < intValue) {
                        continue;
                    }
                    this.j().L().b("Too many experiment IDs. Number of IDs", list.size());
                }
                catch (NumberFormatException ex) {
                    this.j().L().b("Experiment ID NumberFormatException", ex);
                    continue;
                }
                break;
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }
    
    @Override
    public final boolean x() {
        return false;
    }
    
    public final long z(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return 0L;
        }
        return this.A(s.getBytes(Charset.forName("UTF-8")));
    }
}
