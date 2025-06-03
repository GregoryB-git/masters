package e7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzdq;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import l1.a;
import m1.d;

/* loaded from: classes.dex */
public final class r6 extends d3 {

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f4624r = {"firebase_", "google_", "ga_"};

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f4625s = {"_err"};

    /* renamed from: d, reason: collision with root package name */
    public SecureRandom f4626d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f4627e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public a.C0141a f4628o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f4629p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f4630q;

    public r6(j2 j2Var) {
        super(j2Var);
        this.f4630q = null;
        this.f4627e = new AtomicLong(0L);
    }

    public static String A(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return defpackage.g.d(str.substring(0, str.offsetByCodePoints(0, i10)), "...");
        }
        return null;
    }

    public static void B(Bundle bundle, int i10, String str, Object obj) {
        if (h0(i10, bundle)) {
            bundle.putString("_ev", A(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static MessageDigest B0() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void L(q4 q4Var, Bundle bundle, boolean z10) {
        if (bundle == null || q4Var == null || (bundle.containsKey("_sc") && !z10)) {
            if (bundle != null && q4Var == null && z10) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = q4Var.f4589a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = q4Var.f4590b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", q4Var.f4591c);
    }

    public static void M(t6 t6Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        h0(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        t6Var.a(str, "_err", bundle);
    }

    public static boolean R(Context context) {
        ActivityInfo receiverInfo;
        m6.j.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean S(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean T(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean X(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            m6.j.i(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean Y(String str, String[] strArr) {
        m6.j.i(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] a0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static boolean c0(Context context) {
        m6.j.i(context);
        return i0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static ArrayList<Bundle> g0(List<f> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (f fVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", fVar.f4182a);
            bundle.putString("origin", fVar.f4183b);
            bundle.putLong("creation_timestamp", fVar.f4185d);
            bundle.putString("name", fVar.f4184c.f4599b);
            Object D = fVar.f4184c.D();
            m6.j.i(D);
            p2.m0.j0(bundle, D);
            bundle.putBoolean("active", fVar.f4186e);
            String str = fVar.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            f0 f0Var = fVar.f4187o;
            if (f0Var != null) {
                bundle.putString("timed_out_event_name", f0Var.f4192a);
                a0 a0Var = f0Var.f4193b;
                if (a0Var != null) {
                    bundle.putBundle("timed_out_event_params", a0Var.E());
                }
            }
            bundle.putLong("trigger_timeout", fVar.f4188p);
            f0 f0Var2 = fVar.f4189q;
            if (f0Var2 != null) {
                bundle.putString("triggered_event_name", f0Var2.f4192a);
                a0 a0Var2 = f0Var2.f4193b;
                if (a0Var2 != null) {
                    bundle.putBundle("triggered_event_params", a0Var2.E());
                }
            }
            bundle.putLong("triggered_timestamp", fVar.f4184c.f4600c);
            bundle.putLong("time_to_live", fVar.f4190r);
            f0 f0Var3 = fVar.f4191s;
            if (f0Var3 != null) {
                bundle.putString("expired_event_name", f0Var3.f4192a);
                a0 a0Var3 = f0Var3.f4193b;
                if (a0Var3 != null) {
                    bundle.putBundle("expired_event_params", a0Var3.E());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean h0(int i10, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static int k0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static boolean o0(String str) {
        String a10 = h0.f4260m0.a(null);
        return a10.equals("*") || Arrays.asList(a10.split(",")).contains(str);
    }

    public static boolean r0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static long s(a0 a0Var) {
        long j10 = 0;
        if (a0Var == null) {
            return 0L;
        }
        Iterator<String> it = a0Var.f4057a.keySet().iterator();
        while (it.hasNext()) {
            if (a0Var.f4057a.get(it.next()) instanceof Parcelable[]) {
                j10 += ((Parcelable[]) r3).length;
            }
        }
        return j10;
    }

    public static long t(byte[] bArr) {
        m6.j.i(bArr);
        int i10 = 0;
        if (!(bArr.length > 0)) {
            throw new IllegalStateException();
        }
        long j10 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j10 += (bArr[length] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public static boolean t0(String str) {
        m6.j.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static int w0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    public static Bundle x(List<q6> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (q6 q6Var : list) {
            String str = q6Var.f4602e;
            if (str != null) {
                bundle.putString(q6Var.f4599b, str);
            } else {
                Long l10 = q6Var.f4601d;
                if (l10 != null) {
                    bundle.putLong(q6Var.f4599b, l10.longValue());
                } else {
                    Double d10 = q6Var.f4603o;
                    if (d10 != null) {
                        bundle.putDouble(q6Var.f4599b, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public final String A0() {
        byte[] bArr = new byte[16];
        C0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void C(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            zzj().f4063r.c("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final SecureRandom C0() {
        l();
        if (this.f4626d == null) {
            this.f4626d = new SecureRandom();
        }
        return this.f4626d;
    }

    public final void D(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                k().E(bundle, str, bundle2.get(str));
            }
        }
    }

    public final boolean D0() {
        l();
        return x0() == 1;
    }

    public final void E(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            zzj().t.d("Not putting event parameter. Invalid value type. name, type", i().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void F(zzdq zzdqVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzdqVar.zza(bundle);
        } catch (RemoteException e10) {
            ((j2) this.f3407b).zzj().f4063r.c("Error returning int value to wrapper", e10);
        }
    }

    public final void G(zzdq zzdqVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzdqVar.zza(bundle);
        } catch (RemoteException e10) {
            ((j2) this.f3407b).zzj().f4063r.c("Error returning long value to wrapper", e10);
        }
    }

    public final void H(zzdq zzdqVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzdqVar.zza(bundle);
        } catch (RemoteException e10) {
            ((j2) this.f3407b).zzj().f4063r.c("Error returning bundle list to wrapper", e10);
        }
    }

    public final void I(zzdq zzdqVar, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzdqVar.zza(bundle);
        } catch (RemoteException e10) {
            ((j2) this.f3407b).zzj().f4063r.c("Error returning boolean value to wrapper", e10);
        }
    }

    public final void J(zzdq zzdqVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzdqVar.zza(bundle);
        } catch (RemoteException e10) {
            ((j2) this.f3407b).zzj().f4063r.c("Error returning byte array to wrapper", e10);
        }
    }

    public final void K(d1 d1Var, int i10) {
        Iterator it = new TreeSet(d1Var.f4145d.keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (t0(str) && (i11 = i11 + 1) > i10) {
                zzj().f4062q.d("Event can't contain more than " + i10 + " params", i().c(d1Var.f4142a), i().a(d1Var.f4145d));
                h0(5, d1Var.f4145d);
                d1Var.f4145d.remove(str);
            }
        }
    }

    public final void N(String str, zzdq zzdqVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzdqVar.zza(bundle);
        } catch (RemoteException e10) {
            ((j2) this.f3407b).zzj().f4063r.c("Error returning string value to wrapper", e10);
        }
    }

    public final void O(String str, String str2, Bundle bundle, List list, boolean z10) {
        int v02;
        String str3;
        int r10;
        int i10;
        if (bundle == null) {
            return;
        }
        int i11 = h().k().b0(231100000) ? 35 : 0;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i12 = 0;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list == null || !list.contains(str4)) {
                v02 = !z10 ? v0(str4) : 0;
                if (v02 == 0) {
                    v02 = u0(str4);
                }
            } else {
                v02 = 0;
            }
            if (v02 != 0) {
                B(bundle, v02, str4, v02 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (T(bundle.get(str4))) {
                    zzj().t.a(str, str2, str4, "Nested Bundle parameters are not allowed; discarded. event name, param name, child param name");
                    r10 = 22;
                    str3 = str4;
                } else {
                    str3 = str4;
                    r10 = r(str, str4, bundle.get(str4), bundle, list, z10, false);
                }
                if (r10 != 0 && !"_ev".equals(str3)) {
                    B(bundle, r10, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (t0(str3) && !Y(str3, b.z.f1659d)) {
                    int i13 = i12 + 1;
                    if (b0(231100000)) {
                        if (i13 > i11) {
                            zzj().f4062q.d("Item can't contain more than " + i11 + " item-scoped custom params", i().c(str), i().a(bundle));
                            i10 = 28;
                        }
                        i12 = i13;
                    } else {
                        zzj().f4062q.d("Item array not supported on client's version of Google Play Services (Android Only)", i().c(str), i().a(bundle));
                        i10 = 23;
                    }
                    h0(i10, bundle);
                    bundle.remove(str3);
                    i12 = i13;
                }
            }
        }
    }

    public final void P(Parcelable[] parcelableArr, int i10) {
        m6.j.i(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i11 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (t0(str) && !Y(str, b.z.f1659d) && (i11 = i11 + 1) > i10) {
                    zzj().f4062q.d("Param can't contain more than " + i10 + " item-scoped custom parameters", i().f(str), i().a(bundle));
                    h0(28, bundle);
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean Q(int i10, String str, String str2) {
        if (str2 == null) {
            zzj().f4062q.c("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        zzj().f4062q.a(str, Integer.valueOf(i10), str2, "Name is too long. Type, maximum supported length, name");
        return false;
    }

    public final boolean U(String str, double d10) {
        try {
            SharedPreferences.Editor edit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong(Constants.TIMESTAMP, Double.doubleToRawLongBits(d10));
            return edit.commit();
        } catch (RuntimeException e10) {
            zzj().f4060o.c("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    public final boolean V(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            m6.j.i(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(((j2) this.f3407b).f4361b)) {
                zzj().f4062q.c("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", a1.p(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(((j2) this.f3407b).f4361b)) {
                zzj().f4062q.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        m6.j.i(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        zzj().f4062q.c("Invalid admob_app_id. Analytics disabled.", a1.p(str2));
        return false;
    }

    public final boolean W(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i10) {
                zzj().t.a(str, str2, Integer.valueOf(valueOf.length()), "Value is too long; discarded. Value kind, name, value length");
                return false;
            }
        }
        return true;
    }

    public final boolean Z(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z10;
        if (str2 == null) {
            zzj().f4062q.c("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = f4624r;
        int i10 = 0;
        while (true) {
            if (i10 >= 3) {
                z10 = false;
                break;
            }
            if (str2.startsWith(strArr3[i10])) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            zzj().f4062q.d("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !Y(str2, strArr) || (strArr2 != null && Y(str2, strArr2))) {
            return true;
        }
        zzj().f4062q.d("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean b0(int i10) {
        Boolean bool = ((j2) this.f3407b).l().f;
        if (s0() < i10 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final void d0() {
        l();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzj().f4063r.b("Utils falling back to Random for random id");
            }
        }
        this.f4627e.set(nextLong);
    }

    public final int e0(String str) {
        if (!j0("user property", str)) {
            return 6;
        }
        if (Z("user property", p2.m0.f12889a, null, str)) {
            return !Q(24, "user property", str) ? 6 : 0;
        }
        return 15;
    }

    public final Object f0(Object obj, String str) {
        if ("_ev".equals(str)) {
            return z(h().r(null, false), obj, true, true);
        }
        return z(r0(str) ? h().r(null, false) : h().n(null, false), obj, false, true);
    }

    public final boolean j0(String str, String str2) {
        if (str2 == null) {
            zzj().f4062q.c("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().f4062q.c("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            zzj().f4062q.d("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().f4062q.d("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final Object l0(Object obj, String str) {
        boolean equals = "_ldl".equals(str);
        int w0 = w0(str);
        return equals ? z(w0, obj, true, false) : z(w0, obj, false, false);
    }

    public final boolean m0(Context context, String str) {
        b1 b1Var;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b10 = x6.d.a(context).b(64, str);
            if (b10 == null || (signatureArr = b10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            b1Var = zzj().f4060o;
            str2 = "Package name not found";
            b1Var.c(str2, e);
            return true;
        } catch (CertificateException e11) {
            e = e11;
            b1Var = zzj().f4060o;
            str2 = "Error obtaining certificate";
            b1Var.c(str2, e);
            return true;
        }
    }

    public final boolean n0(String str, String str2) {
        if (str2 == null) {
            zzj().f4062q.c("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().f4062q.c("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzj().f4062q.d("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().f4062q.d("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    @Override // e7.d3
    public final boolean o() {
        return true;
    }

    public final int p(Object obj, String str) {
        int w0;
        String str2;
        if ("_ldl".equals(str)) {
            w0 = w0(str);
            str2 = "user property referrer";
        } else {
            w0 = w0(str);
            str2 = "user property";
        }
        return W(str2, str, w0, obj) ? 0 : 7;
    }

    public final boolean p0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return h().b("debug.firebase.analytics.app", "").equals(str);
    }

    public final int q(String str) {
        if (!j0("event", str)) {
            return 2;
        }
        if (Z("event", b.a0.f1561b, b.a0.f1563c, str)) {
            return !Q(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    public final boolean q0(String str) {
        l();
        if (x6.d.a(zza()).f17198a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzj().f4066v.c("Permission not granted", str);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r(java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.r6.r(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int s0() {
        if (this.f4630q == null) {
            j6.f fVar = j6.f.f8490b;
            Context zza = zza();
            fVar.getClass();
            AtomicBoolean atomicBoolean = j6.j.f8500a;
            int i10 = 0;
            try {
                i10 = zza.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f4630q = Integer.valueOf(i10 / 1000);
        }
        return this.f4630q.intValue();
    }

    public final Bundle u(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            zzj().f4063r.c("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    public final int u0(String str) {
        if (!j0("event param", str)) {
            return 3;
        }
        if (Z("event param", null, null, str)) {
            return !Q(40, "event param", str) ? 3 : 0;
        }
        return 14;
    }

    public final Bundle v(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object f02 = f0(bundle.get(str), str);
                if (f02 == null) {
                    zzj().t.c("Param value can't be null", i().f(str));
                } else {
                    E(bundle2, str, f02);
                }
            }
        }
        return bundle2;
    }

    public final int v0(String str) {
        if (!n0("event param", str)) {
            return 3;
        }
        if (Z("event param", null, null, str)) {
            return !Q(40, "event param", str) ? 3 : 0;
        }
        return 14;
    }

    public final Bundle w(String str, Bundle bundle, List list, boolean z10) {
        int v02;
        boolean Y = Y(str, b.a0.f1567e);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int i10 = h().k().b0(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list == null || !list.contains(str2)) {
                v02 = !z10 ? v0(str2) : 0;
                if (v02 == 0) {
                    v02 = u0(str2);
                }
            } else {
                v02 = 0;
            }
            if (v02 != 0) {
                B(bundle2, v02, str2, v02 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int r10 = r(str, str2, bundle.get(str2), bundle2, list, z10, Y);
                if (r10 == 17) {
                    B(bundle2, r10, str2, Boolean.FALSE);
                } else if (r10 != 0 && !"_ev".equals(str2)) {
                    B(bundle2, r10, r10 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (t0(str2)) {
                    int i12 = i11 + 1;
                    if (i12 > i10) {
                        zzj().f4062q.d("Event can't contain more than " + i10 + " params", i().c(str), i().a(bundle));
                        h0(5, bundle2);
                        bundle2.remove(str2);
                    }
                    i11 = i12;
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long x0() {
        /*
            r11 = this;
            r11.l()
            java.lang.Object r0 = r11.f3407b
            e7.j2 r0 = (e7.j2) r0
            e7.t0 r0 = r0.h()
            java.lang.String r0 = r0.v()
            boolean r0 = o0(r0)
            r1 = 0
            if (r0 != 0) goto L18
            return r1
        L18:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r4 = 30
            if (r0 >= r4) goto L22
            r4 = 4
            goto L42
        L22:
            int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r4)
            r4 = 4
            if (r0 >= r4) goto L2c
            r4 = 8
            goto L42
        L2c:
            int r0 = k0()
            e7.m0<java.lang.Integer> r4 = e7.h0.f4248g0
            java.lang.Object r4 = r4.a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r0 >= r4) goto L41
            r4 = 16
            goto L42
        L41:
            r4 = r1
        L42:
            java.lang.String r0 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r0 = r11.q0(r0)
            if (r0 != 0) goto L4d
            r6 = 2
            long r4 = r4 | r6
        L4d:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto Lb3
            java.lang.Boolean r0 = r11.f4629p
            if (r0 != 0) goto La8
            l1.a r0 = r11.z0()
            r6 = 0
            if (r0 != 0) goto L5d
            goto Lae
        L5d:
            s7.e r0 = r0.a()
            r7 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L84 java.lang.InterruptedException -> L86 java.util.concurrent.ExecutionException -> L88 java.util.concurrent.CancellationException -> L8a
            java.lang.Object r0 = r0.get(r7, r9)     // Catch: java.util.concurrent.TimeoutException -> L84 java.lang.InterruptedException -> L86 java.util.concurrent.ExecutionException -> L88 java.util.concurrent.CancellationException -> L8a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.util.concurrent.TimeoutException -> L84 java.lang.InterruptedException -> L86 java.util.concurrent.ExecutionException -> L88 java.util.concurrent.CancellationException -> L8a
            r3 = 1
            if (r0 == 0) goto L75
            int r7 = r0.intValue()     // Catch: java.util.concurrent.TimeoutException -> L7c java.lang.InterruptedException -> L7e java.util.concurrent.ExecutionException -> L80 java.util.concurrent.CancellationException -> L82
            if (r7 != r3) goto L75
            r6 = r3
        L75:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)     // Catch: java.util.concurrent.TimeoutException -> L7c java.lang.InterruptedException -> L7e java.util.concurrent.ExecutionException -> L80 java.util.concurrent.CancellationException -> L82
            r11.f4629p = r3     // Catch: java.util.concurrent.TimeoutException -> L7c java.lang.InterruptedException -> L7e java.util.concurrent.ExecutionException -> L80 java.util.concurrent.CancellationException -> L82
            goto L9d
        L7c:
            r3 = move-exception
            goto L8e
        L7e:
            r3 = move-exception
            goto L8e
        L80:
            r3 = move-exception
            goto L8e
        L82:
            r3 = move-exception
            goto L8e
        L84:
            r0 = move-exception
            goto L8b
        L86:
            r0 = move-exception
            goto L8b
        L88:
            r0 = move-exception
            goto L8b
        L8a:
            r0 = move-exception
        L8b:
            r10 = r3
            r3 = r0
            r0 = r10
        L8e:
            e7.a1 r6 = r11.zzj()
            e7.b1 r6 = r6.f4063r
            java.lang.String r7 = "Measurement manager api exception"
            r6.c(r7, r3)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r11.f4629p = r3
        L9d:
            e7.a1 r3 = r11.zzj()
            e7.b1 r3 = r3.f4067w
            java.lang.String r6 = "Measurement manager api status result"
            r3.c(r6, r0)
        La8:
            java.lang.Boolean r0 = r11.f4629p
            boolean r6 = r0.booleanValue()
        Lae:
            if (r6 != 0) goto Lb3
            r6 = 64
            long r4 = r4 | r6
        Lb3:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto Lba
            r0 = 1
            return r0
        Lba:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.r6.x0():long");
    }

    public final f0 y(String str, Bundle bundle, String str2, long j10, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (q(str) != 0) {
            zzj().f4060o.c("Invalid conditional property event name", i().g(str));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle w10 = w(str, bundle2, Collections.singletonList("_o"), true);
        if (z10) {
            w10 = v(w10);
        }
        m6.j.i(w10);
        return new f0(str, new a0(w10), str2, j10);
    }

    public final long y0() {
        long andIncrement;
        long j10;
        if (this.f4627e.get() != 0) {
            synchronized (this.f4627e) {
                this.f4627e.compareAndSet(-1L, 1L);
                andIncrement = this.f4627e.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f4627e) {
            long nanoTime = System.nanoTime();
            ((b.z) zzb()).getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f + 1;
            this.f = i10;
            j10 = nextLong + i10;
        }
        return j10;
    }

    public final Object z(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return A(String.valueOf(obj), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle v10 = v((Bundle) parcelable);
                if (!v10.isEmpty()) {
                    arrayList.add(v10);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final l1.a z0() {
        if (this.f4628o == null) {
            Context zza = zza();
            ec.i.e(zza, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(i10 >= 30 ? j1.a.f8280a.a() : 0);
            Log.d("MeasurementManager", sb2.toString());
            d.a aVar = (i10 >= 30 ? j1.a.f8280a.a() : 0) >= 5 ? new d.a(zza) : null;
            this.f4628o = aVar != null ? new a.C0141a(aVar) : null;
        }
        return this.f4628o;
    }
}
