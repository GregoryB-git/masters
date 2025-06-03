package R2;

import A2.AbstractC0328n;
import B2.b;
import R2.C0585q3;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0858a2;
import com.google.android.gms.internal.measurement.C0876c2;
import com.google.android.gms.internal.measurement.C0885d2;
import com.google.android.gms.internal.measurement.C0891e;
import com.google.android.gms.internal.measurement.C0903f2;
import com.google.android.gms.internal.measurement.C0912g2;
import com.google.android.gms.internal.measurement.C0917g7;
import com.google.android.gms.internal.measurement.C0921h2;
import com.google.android.gms.internal.measurement.C0979n6;
import com.google.android.gms.internal.measurement.C1024s7;
import com.google.android.gms.internal.measurement.C1063x1;
import com.google.android.gms.internal.measurement.C1072y1;
import com.google.android.gms.internal.measurement.C1080z1;
import com.google.android.gms.internal.measurement.Y1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class N5 extends C5 {
    public N5(D5 d52) {
        super(d52);
    }

    public static C0858a2 G(com.google.android.gms.internal.measurement.Y1 y12, String str) {
        for (C0858a2 c0858a2 : y12.c0()) {
            if (c0858a2.c0().equals(str)) {
                return c0858a2;
            }
        }
        return null;
    }

    public static com.google.android.gms.internal.measurement.L4 H(com.google.android.gms.internal.measurement.L4 l42, byte[] bArr) {
        com.google.android.gms.internal.measurement.M3 a7 = com.google.android.gms.internal.measurement.M3.a();
        return a7 != null ? l42.r(bArr, a7) : l42.m(bArr);
    }

    public static String L(boolean z7, boolean z8, boolean z9) {
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append("Dynamic ");
        }
        if (z8) {
            sb.append("Sequence ");
        }
        if (z9) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static List M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            long j7 = 0;
            for (int i8 = 0; i8 < 64; i8++) {
                int i9 = (i7 << 6) + i8;
                if (i9 < bitSet.length()) {
                    if (bitSet.get(i9)) {
                        j7 |= 1 << i8;
                    }
                }
            }
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    public static void P(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void Q(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                P(builder, str3, string, set);
            }
        }
    }

    public static void R(Y1.a aVar, String str, Object obj) {
        List L6 = aVar.L();
        int i7 = 0;
        while (true) {
            if (i7 >= L6.size()) {
                i7 = -1;
                break;
            } else if (str.equals(((C0858a2) L6.get(i7)).c0())) {
                break;
            } else {
                i7++;
            }
        }
        C0858a2.a B7 = C0858a2.Z().B(str);
        if (obj instanceof Long) {
            B7.y(((Long) obj).longValue());
        } else if (obj instanceof String) {
            B7.D((String) obj);
        } else if (obj instanceof Double) {
            B7.x(((Double) obj).doubleValue());
        }
        if (i7 >= 0) {
            aVar.y(i7, B7);
        } else {
            aVar.B(B7);
        }
    }

    public static void V(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("  ");
        }
    }

    public static void X(StringBuilder sb, int i7, String str, C1080z1 c1080z1) {
        if (c1080z1 == null) {
            return;
        }
        V(sb, i7);
        sb.append(str);
        sb.append(" {\n");
        if (c1080z1.N()) {
            Z(sb, i7, "comparison_type", c1080z1.G().name());
        }
        if (c1080z1.P()) {
            Z(sb, i7, "match_as_float", Boolean.valueOf(c1080z1.M()));
        }
        if (c1080z1.O()) {
            Z(sb, i7, "comparison_value", c1080z1.J());
        }
        if (c1080z1.R()) {
            Z(sb, i7, "min_comparison_value", c1080z1.L());
        }
        if (c1080z1.Q()) {
            Z(sb, i7, "max_comparison_value", c1080z1.K());
        }
        V(sb, i7);
        sb.append("}\n");
    }

    public static void Y(StringBuilder sb, int i7, String str, C0903f2 c0903f2) {
        if (c0903f2 == null) {
            return;
        }
        V(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c0903f2.J() != 0) {
            V(sb, 4);
            sb.append("results: ");
            int i8 = 0;
            for (Long l7 : c0903f2.Z()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(l7);
                i8 = i9;
            }
            sb.append('\n');
        }
        if (c0903f2.R() != 0) {
            V(sb, 4);
            sb.append("status: ");
            int i10 = 0;
            for (Long l8 : c0903f2.b0()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb.append(", ");
                }
                sb.append(l8);
                i10 = i11;
            }
            sb.append('\n');
        }
        if (c0903f2.k() != 0) {
            V(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i12 = 0;
            for (com.google.android.gms.internal.measurement.X1 x12 : c0903f2.Y()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb.append(", ");
                }
                sb.append(x12.O() ? Integer.valueOf(x12.k()) : null);
                sb.append(":");
                sb.append(x12.N() ? Long.valueOf(x12.K()) : null);
                i12 = i13;
            }
            sb.append("}\n");
        }
        if (c0903f2.N() != 0) {
            V(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i14 = 0;
            for (C0912g2 c0912g2 : c0903f2.a0()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb.append(", ");
                }
                sb.append(c0912g2.P() ? Integer.valueOf(c0912g2.K()) : null);
                sb.append(": [");
                Iterator it = c0912g2.O().iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i16 = i17;
                }
                sb.append("]");
                i14 = i15;
            }
            sb.append("}\n");
        }
        V(sb, 3);
        sb.append("}\n");
    }

    public static void Z(StringBuilder sb, int i7, String str, Object obj) {
        if (obj == null) {
            return;
        }
        V(sb, i7 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static boolean c0(I i7, W5 w52) {
        AbstractC0328n.i(i7);
        AbstractC0328n.i(w52);
        return (TextUtils.isEmpty(w52.f5116p) && TextUtils.isEmpty(w52.f5101E)) ? false : true;
    }

    public static boolean d0(List list, int i7) {
        if (i7 < (list.size() << 6)) {
            return ((1 << (i7 % 64)) & ((Long) list.get(i7 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static Object e0(com.google.android.gms.internal.measurement.Y1 y12, String str) {
        C0858a2 G6 = G(y12, str);
        if (G6 == null) {
            return null;
        }
        if (G6.j0()) {
            return G6.d0();
        }
        if (G6.h0()) {
            return Long.valueOf(G6.X());
        }
        if (G6.f0()) {
            return Double.valueOf(G6.G());
        }
        if (G6.V() <= 0) {
            return null;
        }
        List<C0858a2> e02 = G6.e0();
        ArrayList arrayList = new ArrayList();
        for (C0858a2 c0858a2 : e02) {
            if (c0858a2 != null) {
                Bundle bundle = new Bundle();
                for (C0858a2 c0858a22 : c0858a2.e0()) {
                    if (c0858a22.j0()) {
                        bundle.putString(c0858a22.c0(), c0858a22.d0());
                    } else if (c0858a22.h0()) {
                        bundle.putLong(c0858a22.c0(), c0858a22.X());
                    } else if (c0858a22.f0()) {
                        bundle.putDouble(c0858a22.c0(), c0858a22.G());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean f0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static int y(C0885d2.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i7 = 0; i7 < aVar.K(); i7++) {
            if (str.equals(aVar.A0(i7).Z())) {
                return i7;
            }
        }
        return -1;
    }

    public final long A(byte[] bArr) {
        AbstractC0328n.i(bArr);
        k().n();
        MessageDigest T02 = S5.T0();
        if (T02 != null) {
            return S5.B(T02.digest(bArr));
        }
        j().G().a("Failed to get MD5");
        return 0L;
    }

    public final I B(C0891e c0891e) {
        Object obj;
        Bundle D7 = D(c0891e.g(), true);
        String obj2 = (!D7.containsKey("_o") || (obj = D7.get("_o")) == null) ? "app" : obj.toString();
        String b7 = AbstractC0591r3.b(c0891e.e());
        if (b7 == null) {
            b7 = c0891e.e();
        }
        return new I(b7, new D(D7), obj2, c0891e.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final R2.C0621v5 C(java.lang.String r12, com.google.android.gms.internal.measurement.C0885d2 r13, com.google.android.gms.internal.measurement.Y1.a r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.N5.C(java.lang.String, com.google.android.gms.internal.measurement.d2, com.google.android.gms.internal.measurement.Y1$a, java.lang.String):R2.v5");
    }

    public final Bundle D(Map map, boolean z7) {
        String str;
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                str = obj.toString();
            } else if (z7) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    arrayList2.add(D((Map) obj2, false));
                }
                bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    public final Parcelable E(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (b.a unused) {
            j().G().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final com.google.android.gms.internal.measurement.Y1 F(A a7) {
        Y1.a A7 = com.google.android.gms.internal.measurement.Y1.Z().A(a7.f4539e);
        Iterator it = a7.f4540f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C0858a2.a B7 = C0858a2.Z().B(str);
            Object k7 = a7.f4540f.k(str);
            AbstractC0328n.i(k7);
            S(B7, k7);
            A7.B(B7);
        }
        return (com.google.android.gms.internal.measurement.Y1) ((com.google.android.gms.internal.measurement.Y3) A7.p());
    }

    public final String I(C1063x1 c1063x1) {
        if (c1063x1 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (c1063x1.V()) {
            Z(sb, 0, "filter_id", Integer.valueOf(c1063x1.L()));
        }
        Z(sb, 0, "event_name", h().c(c1063x1.P()));
        String L6 = L(c1063x1.R(), c1063x1.S(), c1063x1.T());
        if (!L6.isEmpty()) {
            Z(sb, 0, "filter_type", L6);
        }
        if (c1063x1.U()) {
            X(sb, 1, "event_count_filter", c1063x1.O());
        }
        if (c1063x1.k() > 0) {
            sb.append("  filters {\n");
            Iterator it = c1063x1.Q().iterator();
            while (it.hasNext()) {
                W(sb, 2, (C1072y1) it.next());
            }
        }
        V(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String J(com.google.android.gms.internal.measurement.A1 a12) {
        if (a12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (a12.P()) {
            Z(sb, 0, "filter_id", Integer.valueOf(a12.k()));
        }
        Z(sb, 0, "property_name", h().g(a12.L()));
        String L6 = L(a12.M(), a12.N(), a12.O());
        if (!L6.isEmpty()) {
            Z(sb, 0, "filter_type", L6);
        }
        W(sb, 1, a12.I());
        sb.append("}\n");
        return sb.toString();
    }

    public final String K(C0876c2 c0876c2) {
        com.google.android.gms.internal.measurement.V1 z32;
        if (c0876c2 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C0885d2 c0885d2 : c0876c2.L()) {
            if (c0885d2 != null) {
                V(sb, 1);
                sb.append("bundle {\n");
                if (c0885d2.Z0()) {
                    Z(sb, 1, "protocol_version", Integer.valueOf(c0885d2.U1()));
                }
                if (C1024s7.a() && f().B(c0885d2.D3(), K.f4869y0) && c0885d2.c1()) {
                    Z(sb, 1, "session_stitching_token", c0885d2.p0());
                }
                Z(sb, 1, "platform", c0885d2.n0());
                if (c0885d2.U0()) {
                    Z(sb, 1, "gmp_version", Long.valueOf(c0885d2.d3()));
                }
                if (c0885d2.h1()) {
                    Z(sb, 1, "uploading_gmp_version", Long.valueOf(c0885d2.w3()));
                }
                if (c0885d2.S0()) {
                    Z(sb, 1, "dynamite_version", Long.valueOf(c0885d2.Q2()));
                }
                if (c0885d2.B0()) {
                    Z(sb, 1, "config_version", Long.valueOf(c0885d2.C2()));
                }
                Z(sb, 1, "gmp_app_id", c0885d2.k0());
                Z(sb, 1, "admob_app_id", c0885d2.C3());
                Z(sb, 1, "app_id", c0885d2.D3());
                Z(sb, 1, "app_version", c0885d2.d0());
                if (c0885d2.y0()) {
                    Z(sb, 1, "app_version_major", Integer.valueOf(c0885d2.D0()));
                }
                Z(sb, 1, "firebase_instance_id", c0885d2.j0());
                if (c0885d2.R0()) {
                    Z(sb, 1, "dev_cert_hash", Long.valueOf(c0885d2.J2()));
                }
                Z(sb, 1, "app_store", c0885d2.F3());
                if (c0885d2.g1()) {
                    Z(sb, 1, "upload_timestamp_millis", Long.valueOf(c0885d2.t3()));
                }
                if (c0885d2.d1()) {
                    Z(sb, 1, "start_timestamp_millis", Long.valueOf(c0885d2.n3()));
                }
                if (c0885d2.T0()) {
                    Z(sb, 1, "end_timestamp_millis", Long.valueOf(c0885d2.X2()));
                }
                if (c0885d2.Y0()) {
                    Z(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c0885d2.k3()));
                }
                if (c0885d2.X0()) {
                    Z(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c0885d2.h3()));
                }
                Z(sb, 1, "app_instance_id", c0885d2.E3());
                Z(sb, 1, "resettable_device_id", c0885d2.o0());
                Z(sb, 1, "ds_id", c0885d2.i0());
                if (c0885d2.W0()) {
                    Z(sb, 1, "limited_ad_tracking", Boolean.valueOf(c0885d2.w0()));
                }
                Z(sb, 1, "os_version", c0885d2.m0());
                Z(sb, 1, "device_model", c0885d2.h0());
                Z(sb, 1, "user_default_language", c0885d2.q0());
                if (c0885d2.f1()) {
                    Z(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c0885d2.m2()));
                }
                if (c0885d2.A0()) {
                    Z(sb, 1, "bundle_sequential_index", Integer.valueOf(c0885d2.i1()));
                }
                if (c0885d2.b1()) {
                    Z(sb, 1, "service_upload", Boolean.valueOf(c0885d2.x0()));
                }
                Z(sb, 1, "health_monitor", c0885d2.l0());
                if (c0885d2.a1()) {
                    Z(sb, 1, "retry_counter", Integer.valueOf(c0885d2.e2()));
                }
                if (c0885d2.P0()) {
                    Z(sb, 1, "consent_signals", c0885d2.f0());
                }
                if (c0885d2.V0()) {
                    Z(sb, 1, "is_dma_region", Boolean.valueOf(c0885d2.v0()));
                }
                if (c0885d2.Q0()) {
                    Z(sb, 1, "core_platform_services", c0885d2.g0());
                }
                if (c0885d2.C0()) {
                    Z(sb, 1, "consent_diagnostics", c0885d2.e0());
                }
                if (c0885d2.e1()) {
                    Z(sb, 1, "target_os_version", Long.valueOf(c0885d2.q3()));
                }
                if (C0917g7.a() && f().B(c0885d2.D3(), K.f4789L0)) {
                    Z(sb, 1, "ad_services_version", Integer.valueOf(c0885d2.k()));
                    if (c0885d2.z0() && (z32 = c0885d2.z3()) != null) {
                        V(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        Z(sb, 2, "eligible", Boolean.valueOf(z32.X()));
                        Z(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(z32.b0()));
                        Z(sb, 2, "pre_r", Boolean.valueOf(z32.c0()));
                        Z(sb, 2, "r_extensions_too_old", Boolean.valueOf(z32.d0()));
                        Z(sb, 2, "adservices_extension_too_old", Boolean.valueOf(z32.U()));
                        Z(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(z32.R()));
                        Z(sb, 2, "measurement_manager_disabled", Boolean.valueOf(z32.a0()));
                        V(sb, 2);
                        sb.append("}\n");
                    }
                }
                List<C0921h2> t02 = c0885d2.t0();
                if (t02 != null) {
                    for (C0921h2 c0921h2 : t02) {
                        if (c0921h2 != null) {
                            V(sb, 2);
                            sb.append("user_property {\n");
                            Z(sb, 2, "set_timestamp_millis", c0921h2.e0() ? Long.valueOf(c0921h2.W()) : null);
                            Z(sb, 2, "name", h().g(c0921h2.Z()));
                            Z(sb, 2, "string_value", c0921h2.a0());
                            Z(sb, 2, "int_value", c0921h2.d0() ? Long.valueOf(c0921h2.U()) : null);
                            Z(sb, 2, "double_value", c0921h2.b0() ? Double.valueOf(c0921h2.G()) : null);
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.W1> r02 = c0885d2.r0();
                c0885d2.D3();
                if (r02 != null) {
                    for (com.google.android.gms.internal.measurement.W1 w12 : r02) {
                        if (w12 != null) {
                            V(sb, 2);
                            sb.append("audience_membership {\n");
                            if (w12.T()) {
                                Z(sb, 2, "audience_id", Integer.valueOf(w12.k()));
                            }
                            if (w12.U()) {
                                Z(sb, 2, "new_audience", Boolean.valueOf(w12.S()));
                            }
                            Y(sb, 2, "current_data", w12.Q());
                            if (w12.V()) {
                                Y(sb, 2, "previous_data", w12.R());
                            }
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.Y1> s02 = c0885d2.s0();
                if (s02 != null) {
                    for (com.google.android.gms.internal.measurement.Y1 y12 : s02) {
                        if (y12 != null) {
                            V(sb, 2);
                            sb.append("event {\n");
                            Z(sb, 2, "name", h().c(y12.b0()));
                            if (y12.f0()) {
                                Z(sb, 2, "timestamp_millis", Long.valueOf(y12.Y()));
                            }
                            if (y12.e0()) {
                                Z(sb, 2, "previous_timestamp_millis", Long.valueOf(y12.X()));
                            }
                            if (y12.d0()) {
                                Z(sb, 2, "count", Integer.valueOf(y12.k()));
                            }
                            if (y12.T() != 0) {
                                a0(sb, 2, y12.c0());
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

    public final List N(List list, List list2) {
        int i7;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                j().L().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    j().L().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i8 = size2;
            i7 = size;
            size = i8;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(O((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r5.add(O((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r5.add(O((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map O(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.O(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            int r7 = r7 + 1
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L5d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.O(r8, r6)
            r5.add(r8)
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.O(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.N5.O(android.os.Bundle, boolean):java.util.Map");
    }

    public final void S(C0858a2.a aVar, Object obj) {
        AbstractC0328n.i(obj);
        aVar.G().E().C().F();
        if (obj instanceof String) {
            aVar.D((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.y(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.x(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            j().G().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C0858a2.a Z6 = C0858a2.Z();
                for (String str : bundle.keySet()) {
                    C0858a2.a B7 = C0858a2.Z().B(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        B7.y(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        B7.D((String) obj2);
                    } else if (obj2 instanceof Double) {
                        B7.x(((Double) obj2).doubleValue());
                    }
                    Z6.z(B7);
                }
                if (Z6.w() > 0) {
                    arrayList.add((C0858a2) ((com.google.android.gms.internal.measurement.Y3) Z6.p()));
                }
            }
        }
        aVar.A(arrayList);
    }

    public final void T(C0885d2.a aVar) {
        j().K().a("Checking account type status for ad personalization signals");
        if (h0(aVar.S0())) {
            j().F().a("Turning off ad personalization due to account type");
            C0921h2 c0921h2 = (C0921h2) ((com.google.android.gms.internal.measurement.Y3) C0921h2.X().z("_npa").B(g().u()).y(1L).p());
            int i7 = 0;
            while (true) {
                if (i7 >= aVar.K()) {
                    aVar.G(c0921h2);
                    break;
                } else {
                    if ("_npa".equals(aVar.A0(i7).Z())) {
                        aVar.A(i7, c0921h2);
                        break;
                    }
                    i7++;
                }
            }
            if (C0979n6.a() && f().s(K.f4805T0)) {
                C0546l b7 = C0546l.b(aVar.U0());
                b7.d(C0585q3.a.AD_PERSONALIZATION, EnumC0539k.CHILD_ACCOUNT);
                aVar.k0(b7.toString());
            }
        }
    }

    public final void U(C0921h2.a aVar, Object obj) {
        AbstractC0328n.i(obj);
        aVar.D().A().w();
        if (obj instanceof String) {
            aVar.C((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.x(((Double) obj).doubleValue());
        } else {
            j().G().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void W(StringBuilder sb, int i7, C1072y1 c1072y1) {
        if (c1072y1 == null) {
            return;
        }
        V(sb, i7);
        sb.append("filter {\n");
        if (c1072y1.O()) {
            Z(sb, i7, "complement", Boolean.valueOf(c1072y1.N()));
        }
        if (c1072y1.Q()) {
            Z(sb, i7, "param_name", h().f(c1072y1.M()));
        }
        if (c1072y1.R()) {
            int i8 = i7 + 1;
            com.google.android.gms.internal.measurement.B1 L6 = c1072y1.L();
            if (L6 != null) {
                V(sb, i8);
                sb.append("string_filter");
                sb.append(" {\n");
                if (L6.O()) {
                    Z(sb, i8, "match_type", L6.G().name());
                }
                if (L6.N()) {
                    Z(sb, i8, "expression", L6.J());
                }
                if (L6.M()) {
                    Z(sb, i8, "case_sensitive", Boolean.valueOf(L6.L()));
                }
                if (L6.k() > 0) {
                    V(sb, i7 + 2);
                    sb.append("expression_list {\n");
                    for (String str : L6.K()) {
                        V(sb, i7 + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                V(sb, i8);
                sb.append("}\n");
            }
        }
        if (c1072y1.P()) {
            X(sb, i7 + 1, "number_filter", c1072y1.K());
        }
        V(sb, i7);
        sb.append("}\n");
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0(StringBuilder sb, int i7, List list) {
        if (list == null) {
            return;
        }
        int i8 = i7 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0858a2 c0858a2 = (C0858a2) it.next();
            if (c0858a2 != null) {
                V(sb, i8);
                sb.append("param {\n");
                Z(sb, i8, "name", c0858a2.i0() ? h().f(c0858a2.c0()) : null);
                Z(sb, i8, "string_value", c0858a2.j0() ? c0858a2.d0() : null);
                Z(sb, i8, "int_value", c0858a2.h0() ? Long.valueOf(c0858a2.X()) : null);
                Z(sb, i8, "double_value", c0858a2.f0() ? Double.valueOf(c0858a2.G()) : null);
                if (c0858a2.V() > 0) {
                    a0(sb, i8, c0858a2.e0());
                }
                V(sb, i8);
                sb.append("}\n");
            }
        }
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    public final boolean b0(long j7, long j8) {
        return j7 == 0 || j8 <= 0 || Math.abs(b().a() - j7) > j8;
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    public final byte[] g0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            j().G().b("Failed to gzip content", e7);
            throw e7;
        }
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    public final boolean h0(String str) {
        AbstractC0328n.i(str);
        I2 D02 = q().D0(str);
        return D02 != null && g().y() && D02.q() && r().V(str);
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    public final byte[] i0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e7) {
            j().G().b("Failed to ungzip content", e7);
            throw e7;
        }
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    public final List j0() {
        Map c7 = K.c(this.f5633b.a());
        if (c7 == null || c7.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) K.f4800R.a(null)).intValue();
        for (Map.Entry entry : c7.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            j().L().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e7) {
                    j().L().b("Experiment ID NumberFormatException", e7);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ N5 o() {
        return super.o();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ b6 p() {
        return super.p();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0574p q() {
        return super.q();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0632x2 r() {
        return super.r();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ C0517g5 s() {
        return super.s();
    }

    @Override // R2.AbstractC0649z5
    public final /* bridge */ /* synthetic */ B5 t() {
        return super.t();
    }

    @Override // R2.C5
    public final boolean x() {
        return false;
    }

    public final long z(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return A(str.getBytes(Charset.forName("UTF-8")));
    }
}
