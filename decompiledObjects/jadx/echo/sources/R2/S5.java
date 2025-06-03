package R2;

import A2.AbstractC0328n;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
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
import com.google.android.gms.internal.measurement.InterfaceC1071y0;
import com.google.android.gms.internal.measurement.S6;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import q1.AbstractC1883a;
import x2.AbstractC2200n;
import x2.C2197k;

/* loaded from: classes.dex */
public final class S5 extends AbstractC0550l3 {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f5022i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f5023j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f5024c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f5025d;

    /* renamed from: e, reason: collision with root package name */
    public int f5026e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1883a f5027f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f5028g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f5029h;

    public S5(N2 n22) {
        super(n22);
        this.f5029h = null;
        this.f5025d = new AtomicLong(0L);
    }

    public static long B(byte[] bArr) {
        AbstractC0328n.i(bArr);
        int i7 = 0;
        AbstractC0328n.l(bArr.length > 0);
        long j7 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j7 += (bArr[length] & 255) << i7;
            i7 += 8;
        }
        return j7;
    }

    public static boolean B0(Context context, String str) {
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

    public static boolean D0(String str) {
        String str2 = (String) K.f4822b0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static Bundle E(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i7 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i7 < parcelableArr.length) {
                        if (parcelableArr[i7] instanceof Bundle) {
                            parcelableArr[i7] = new Bundle((Bundle) parcelableArr[i7]);
                        }
                        i7++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i7 < list.size()) {
                        Object obj2 = list.get(i7);
                        if (obj2 instanceof Bundle) {
                            list.set(i7, new Bundle((Bundle) obj2));
                        }
                        i7++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static Bundle G(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            R5 r52 = (R5) it.next();
            String str = r52.f4995t;
            if (str != null) {
                bundle.putString(r52.f4991p, str);
            } else {
                Long l7 = r52.f4993r;
                if (l7 != null) {
                    bundle.putLong(r52.f4991p, l7.longValue());
                } else {
                    Double d7 = r52.f4997v;
                    if (d7 != null) {
                        bundle.putDouble(r52.f4991p, d7.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static boolean H0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static String I(String str, int i7, boolean z7) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i7) {
            return str;
        }
        if (!z7) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i7)) + "...";
    }

    public static boolean J0(String str) {
        AbstractC0328n.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static void L(C0627w4 c0627w4, Bundle bundle, boolean z7) {
        if (bundle == null || c0627w4 == null || (bundle.containsKey("_sc") && !z7)) {
            if (bundle != null && c0627w4 == null && z7) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c0627w4.f5574a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c0627w4.f5575b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c0627w4.f5576c);
    }

    public static boolean L0(String str) {
        for (String str2 : f5023j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static void M(U5 u52, int i7, String str, String str2, int i8) {
        N(u52, null, i7, str, str2, i8);
    }

    public static void N(U5 u52, String str, int i7, String str2, String str3, int i8) {
        Bundle bundle = new Bundle();
        v0(bundle, i7);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i7 == 6 || i7 == 7 || i7 == 2) {
            bundle.putLong("_el", i8);
        }
        u52.r(str, "_err", bundle);
    }

    public static void O(Bundle bundle, int i7, String str, String str2, Object obj) {
        if (v0(bundle, i7)) {
            bundle.putString("_ev", I(str, 40, true));
            if (obj != null) {
                AbstractC0328n.i(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static int O0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return ("_lgclid".equals(str) || "_gbraid".equals(str)) ? 100 : 36;
    }

    private static boolean R0(String str) {
        AbstractC0328n.i(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static MessageDigest T0() {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
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

    private final boolean X0() {
        Integer num;
        if (this.f5028g == null) {
            AbstractC1883a Q02 = Q0();
            boolean z7 = false;
            if (Q02 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) Q02.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z7 = true;
                        }
                    } catch (InterruptedException e7) {
                        e = e7;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.f5028g = Boolean.FALSE;
                        num = num2;
                        j().K().b("Measurement manager api status result", num);
                        return this.f5028g.booleanValue();
                    } catch (CancellationException e8) {
                        e = e8;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.f5028g = Boolean.FALSE;
                        num = num2;
                        j().K().b("Measurement manager api status result", num);
                        return this.f5028g.booleanValue();
                    } catch (ExecutionException e9) {
                        e = e9;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.f5028g = Boolean.FALSE;
                        num = num2;
                        j().K().b("Measurement manager api status result", num);
                        return this.f5028g.booleanValue();
                    } catch (TimeoutException e10) {
                        e = e10;
                        num2 = num;
                        j().L().b("Measurement manager api exception", e);
                        this.f5028g = Boolean.FALSE;
                        num = num2;
                        j().K().b("Measurement manager api status result", num);
                        return this.f5028g.booleanValue();
                    }
                }
                this.f5028g = Boolean.valueOf(z7);
            } catch (InterruptedException e11) {
                e = e11;
            } catch (CancellationException e12) {
                e = e12;
            } catch (ExecutionException e13) {
                e = e13;
            } catch (TimeoutException e14) {
                e = e14;
            }
            j().K().b("Measurement manager api status result", num);
        }
        return this.f5028g.booleanValue();
    }

    public static boolean c0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC0328n.i(context);
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

    public static boolean d0(Context context, boolean z7) {
        AbstractC0328n.i(context);
        return B0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean e0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean f0(Bundle bundle, int i7) {
        int i8 = 0;
        if (bundle.size() <= i7) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i8++;
            if (i8 > i7) {
                bundle.remove(str);
            }
        }
        return true;
    }

    public static boolean g0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean l0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            AbstractC0328n.i(str);
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

    public static boolean m0(String str, String[] strArr) {
        AbstractC0328n.i(strArr);
        for (String str2 : strArr) {
            if (V5.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] p0(Parcelable parcelable) {
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

    public static ArrayList t0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0497e c0497e = (C0497e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c0497e.f5263o);
            bundle.putString("origin", c0497e.f5264p);
            bundle.putLong("creation_timestamp", c0497e.f5266r);
            bundle.putString("name", c0497e.f5265q.f4991p);
            AbstractC0564n3.b(bundle, AbstractC0328n.i(c0497e.f5265q.a()));
            bundle.putBoolean("active", c0497e.f5267s);
            String str = c0497e.f5268t;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            I i7 = c0497e.f5269u;
            if (i7 != null) {
                bundle.putString("timed_out_event_name", i7.f4704o);
                D d7 = i7.f4705p;
                if (d7 != null) {
                    bundle.putBundle("timed_out_event_params", d7.g());
                }
            }
            bundle.putLong("trigger_timeout", c0497e.f5270v);
            I i8 = c0497e.f5271w;
            if (i8 != null) {
                bundle.putString("triggered_event_name", i8.f4704o);
                D d8 = i8.f4705p;
                if (d8 != null) {
                    bundle.putBundle("triggered_event_params", d8.g());
                }
            }
            bundle.putLong("triggered_timestamp", c0497e.f5265q.f4992q);
            bundle.putLong("time_to_live", c0497e.f5272x);
            I i9 = c0497e.f5273y;
            if (i9 != null) {
                bundle.putString("expired_event_name", i9.f4704o);
                D d9 = i9.f4705p;
                if (d9 != null) {
                    bundle.putBundle("expired_event_params", d9.g());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean v0(Bundle bundle, int i7) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i7);
        return true;
    }

    public static Bundle[] x0(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else {
            if (!(obj instanceof ArrayList)) {
                return null;
            }
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    public static long y(long j7, long j8) {
        return (j7 + (j8 * 60000)) / 86400000;
    }

    public static int y0() {
        int extensionVersion;
        int extensionVersion2;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        if (extensionVersion <= 3) {
            return 0;
        }
        extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
        return extensionVersion2;
    }

    public static long z(D d7) {
        long j7 = 0;
        if (d7 == null) {
            return 0L;
        }
        Iterator it = d7.iterator();
        while (it.hasNext()) {
            if (d7.k((String) it.next()) instanceof Parcelable[]) {
                j7 += ((Parcelable[]) r3).length;
            }
        }
        return j7;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0066 -> B:8:0x0073). Please report as a decompilation issue!!! */
    public final long A(Context context, String str) {
        n();
        AbstractC0328n.i(context);
        AbstractC0328n.e(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest T02 = T0();
        long j7 = -1;
        if (T02 == null) {
            j().G().a("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e7) {
                    j().G().b("Package name not found", e7);
                }
                if (!u0(context, str)) {
                    Signature[] signatureArr = G2.d.a(context).e(a().getPackageName(), 64).signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        j().L().a("Could not get signatures");
                    } else {
                        j7 = B(T02.digest(signatureArr[0].toByteArray()));
                    }
                }
            }
            j7 = 0;
        }
        return j7;
    }

    public final Object A0(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int O02 = O0(str);
        return equals ? H(O02, obj, true, false) : H(O02, obj, false, false);
    }

    public final I C(String str, String str2, Bundle bundle, String str3, long j7, boolean z7, boolean z8) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (v(str2) != 0) {
            j().G().b("Invalid conditional property event name", h().g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle F6 = F(str, str2, bundle2, E2.f.b("_o"), true);
        if (z7) {
            F6 = r0(F6);
        }
        AbstractC0328n.i(F6);
        return new I(str2, new D(F6), str3, j7);
    }

    public final boolean C0(String str, String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            j().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            j().H().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final Bundle D(Uri uri, boolean z7, boolean z8) {
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
                str5 = z8 ? uri.getQueryParameter("gbraid") : null;
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = z7 ? uri.getQueryParameter("sfmc_id") : null;
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
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z8 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && (!z7 || TextUtils.isEmpty(str9)))) {
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
            if (z8 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (z7 && !TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e7) {
            j().L().b("Install referrer url isn't a hierarchical URI", e7);
            return null;
        }
    }

    public final boolean E0(String str) {
        n();
        if (G2.d.a(a()).a(str) == 0) {
            return true;
        }
        j().F().b("Permission not granted", str);
        return false;
    }

    public final Bundle F(String str, String str2, Bundle bundle, List list, boolean z7) {
        int N02;
        int i7;
        S5 s52 = this;
        boolean m02 = m0(str2, AbstractC0591r3.f5515d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int E6 = f().E();
        int i8 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                N02 = !z7 ? s52.N0(str3) : 0;
                if (N02 == 0) {
                    N02 = s52.M0(str3);
                }
            } else {
                N02 = 0;
            }
            if (N02 != 0) {
                O(bundle2, N02, str3, str3, N02 == 3 ? str3 : null);
                bundle2.remove(str3);
                i7 = E6;
            } else {
                i7 = E6;
                int x7 = x(str, str2, str3, bundle.get(str3), bundle2, list, z7, m02);
                if (x7 == 17) {
                    O(bundle2, x7, str3, str3, Boolean.FALSE);
                } else if (x7 != 0 && !"_ev".equals(str3)) {
                    O(bundle2, x7, x7 == 21 ? str2 : str3, str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (J0(str3)) {
                    int i9 = i8 + 1;
                    if (i9 > i7) {
                        j().H().c("Event can't contain more than " + i7 + " params", h().c(str2), h().b(bundle));
                        v0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i8 = i9;
                }
            }
            E6 = i7;
            s52 = this;
        }
        return bundle2;
    }

    public final boolean F0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f().N().equals(str);
    }

    public final int G0() {
        if (this.f5029h == null) {
            this.f5029h = Integer.valueOf(C2197k.f().a(a()) / 1000);
        }
        return this.f5029h.intValue();
    }

    public final Object H(int i7, Object obj, boolean z7, boolean z8) {
        Bundle r02;
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
            return I(String.valueOf(obj), i7, z7);
        }
        if (!z8 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (r02 = r0((Bundle) parcelable)) != null && !r02.isEmpty()) {
                arrayList.add(r02);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final long I0() {
        int extensionVersion;
        long j7;
        n();
        if (!D0(this.f5424a.B().F())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j7 = 4;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            j7 = extensionVersion < 4 ? 8L : y0() < ((Integer) K.f4812X.a(null)).intValue() ? 16L : 0L;
        }
        if (!E0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j7 |= 2;
        }
        if (j7 == 0 && !X0()) {
            j7 |= 64;
        }
        if (j7 == 0) {
            return 1L;
        }
        return j7;
    }

    public final URL J(long j7, String str, String str2, long j8, String str3) {
        try {
            AbstractC0328n.e(str2);
            AbstractC0328n.e(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j7), Integer.valueOf(G0())), str2, str, Long.valueOf(j8));
            if (str.equals(f().O())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e7) {
            e = e7;
            j().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e8) {
            e = e8;
            j().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final void K(C0486c2 c0486c2, int i7) {
        int i8 = 0;
        for (String str : new TreeSet(c0486c2.f5233d.keySet())) {
            if (J0(str) && (i8 = i8 + 1) > i7) {
                j().H().c("Event can't contain more than " + i7 + " params", h().c(c0486c2.f5230a), h().b(c0486c2.f5233d));
                v0(c0486c2.f5233d, 5);
                c0486c2.f5233d.remove(str);
            }
        }
    }

    public final boolean K0(String str) {
        List<ResolveInfo> queryIntentActivities;
        return (TextUtils.isEmpty(str) || (queryIntentActivities = a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    public final int M0(String str) {
        if (!w0("event param", str)) {
            return 3;
        }
        if (n0("event param", null, str)) {
            return !i0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    public final int N0(String str) {
        if (!C0("event param", str)) {
            return 3;
        }
        if (n0("event param", null, str)) {
            return !i0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    public final void P(Bundle bundle, long j7) {
        long j8 = bundle.getLong("_et");
        if (j8 != 0) {
            j().L().b("Params already contained engagement", Long.valueOf(j8));
        }
        bundle.putLong("_et", j7 + j8);
    }

    public final long P0() {
        long andIncrement;
        long j7;
        if (this.f5025d.get() != 0) {
            synchronized (this.f5025d) {
                this.f5025d.compareAndSet(-1L, 1L);
                andIncrement = this.f5025d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f5025d) {
            long nextLong = new Random(System.nanoTime() ^ b().a()).nextLong();
            int i7 = this.f5026e + 1;
            this.f5026e = i7;
            j7 = nextLong + i7;
        }
        return j7;
    }

    public final void Q(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                k().R(bundle, str, bundle2.get(str));
            }
        }
    }

    public final AbstractC1883a Q0() {
        if (this.f5027f == null) {
            this.f5027f = AbstractC1883a.a(a());
        }
        return this.f5027f;
    }

    public final void R(Bundle bundle, String str, Object obj) {
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
            j().M().c("Not putting event parameter. Invalid value type. name, type", h().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void S(InterfaceC1071y0 interfaceC1071y0, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i7);
        try {
            interfaceC1071y0.l(bundle);
        } catch (RemoteException e7) {
            this.f5424a.j().L().b("Error returning int value to wrapper", e7);
        }
    }

    public final String S0() {
        byte[] bArr = new byte[16];
        U0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void T(InterfaceC1071y0 interfaceC1071y0, long j7) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j7);
        try {
            interfaceC1071y0.l(bundle);
        } catch (RemoteException e7) {
            this.f5424a.j().L().b("Error returning long value to wrapper", e7);
        }
    }

    public final void U(InterfaceC1071y0 interfaceC1071y0, Bundle bundle) {
        try {
            interfaceC1071y0.l(bundle);
        } catch (RemoteException e7) {
            this.f5424a.j().L().b("Error returning bundle value to wrapper", e7);
        }
    }

    public final SecureRandom U0() {
        n();
        if (this.f5024c == null) {
            this.f5024c = new SecureRandom();
        }
        return this.f5024c;
    }

    public final void V(InterfaceC1071y0 interfaceC1071y0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC1071y0.l(bundle);
        } catch (RemoteException e7) {
            this.f5424a.j().L().b("Error returning string value to wrapper", e7);
        }
    }

    public final boolean V0() {
        n();
        return I0() == 1;
    }

    public final void W(InterfaceC1071y0 interfaceC1071y0, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC1071y0.l(bundle);
        } catch (RemoteException e7) {
            this.f5424a.j().L().b("Error returning bundle list to wrapper", e7);
        }
    }

    public final boolean W0() {
        try {
            a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void X(InterfaceC1071y0 interfaceC1071y0, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z7);
        try {
            interfaceC1071y0.l(bundle);
        } catch (RemoteException e7) {
            this.f5424a.j().L().b("Error returning boolean value to wrapper", e7);
        }
    }

    public final void Y(InterfaceC1071y0 interfaceC1071y0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC1071y0.l(bundle);
        } catch (RemoteException e7) {
            this.f5424a.j().L().b("Error returning byte array to wrapper", e7);
        }
    }

    public final void Z(String str, String str2, String str3, Bundle bundle, List list, boolean z7) {
        int N02;
        String str4;
        int x7;
        C0472a2 H6;
        String c7;
        String b7;
        String str5;
        if (bundle == null) {
            return;
        }
        int v7 = f().v();
        int i7 = 0;
        for (String str6 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str6)) {
                N02 = !z7 ? N0(str6) : 0;
                if (N02 == 0) {
                    N02 = M0(str6);
                }
            } else {
                N02 = 0;
            }
            if (N02 != 0) {
                O(bundle, N02, str6, str6, N02 == 3 ? str6 : null);
                bundle.remove(str6);
            } else {
                if (g0(bundle.get(str6))) {
                    j().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                    x7 = 22;
                    str4 = str6;
                } else {
                    str4 = str6;
                    x7 = x(str, str2, str6, bundle.get(str6), bundle, list, z7, false);
                }
                if (x7 != 0 && !"_ev".equals(str4)) {
                    O(bundle, x7, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (J0(str4) && !m0(str4, AbstractC0605t3.f5543d)) {
                    int i8 = i7 + 1;
                    if (b0(231100000, true)) {
                        if (i8 > v7) {
                            if (S6.a() && f().s(K.f4783I0)) {
                                j().H().c("Item can't contain more than " + v7 + " item-scoped custom params", h().c(str2), h().b(bundle));
                                v0(bundle, 28);
                                bundle.remove(str4);
                            } else {
                                H6 = j().H();
                                c7 = h().c(str2);
                                b7 = h().b(bundle);
                                str5 = "Item cannot contain custom parameters";
                            }
                        }
                        i7 = i8;
                    } else {
                        H6 = j().H();
                        c7 = h().c(str2);
                        b7 = h().b(bundle);
                        str5 = "Item array not supported on client's version of Google Play Services (Android Only)";
                    }
                    H6.c(str5, c7, b7);
                    v0(bundle, 23);
                    bundle.remove(str4);
                    i7 = i8;
                }
            }
        }
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0(Parcelable[] parcelableArr, int i7, boolean z7) {
        int i8;
        AbstractC0328n.i(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i9 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (J0(str) && !m0(str, AbstractC0605t3.f5543d) && (i9 = i9 + 1) > i7) {
                    C0472a2 H6 = j().H();
                    if (z7) {
                        H6.c("Param can't contain more than " + i7 + " item-scoped custom parameters", h().f(str), h().b(bundle));
                        i8 = 28;
                    } else {
                        H6.c("Param cannot contain item-scoped custom parameters", h().f(str), h().b(bundle));
                        i8 = 23;
                    }
                    v0(bundle, i8);
                    bundle.remove(str);
                }
            }
        }
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    public final boolean b0(int i7, boolean z7) {
        Boolean W6 = this.f5424a.J().W();
        if (G0() < i7 / 1000) {
            return (W6 == null || W6.booleanValue()) ? false : true;
        }
        return true;
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

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    public final boolean h0(String str, double d7) {
        try {
            SharedPreferences.Editor edit = a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d7));
            return edit.commit();
        } catch (RuntimeException e7) {
            j().G().b("Failed to persist Deferred Deep Link. exception", e7);
            return false;
        }
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    public final boolean i0(String str, int i7, String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i7) {
            return true;
        }
        j().H().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i7), str2);
        return false;
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    public final boolean j0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (R0(str)) {
                return true;
            }
            if (this.f5424a.r()) {
                j().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", Y1.v(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f5424a.r()) {
                j().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (R0(str2)) {
            return true;
        }
        j().H().b("Invalid admob_app_id. Analytics disabled.", Y1.v(str2));
        return false;
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    public final boolean k0(String str, String str2, int i7, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i7) {
                j().M().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
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

    public final boolean n0(String str, String[] strArr, String str2) {
        return o0(str, strArr, null, str2);
    }

    public final boolean o0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC0328n.i(str2);
        for (String str3 : f5022i) {
            if (str2.startsWith(str3)) {
                j().H().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m0(str2, strArr2)) {
            return true;
        }
        j().H().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final int q0(String str) {
        if (!w0("user property", str)) {
            return 6;
        }
        if (n0("user property", AbstractC0598s3.f5527a, str)) {
            return !i0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    public final Bundle r0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object s02 = s0(str, bundle.get(str));
                if (s02 == null) {
                    j().M().b("Param value can't be null", h().f(str));
                } else {
                    R(bundle2, str, s02);
                }
            }
        }
        return bundle2;
    }

    @Override // R2.AbstractC0550l3
    public final boolean s() {
        return true;
    }

    public final Object s0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return H(f().w(this.f5424a.B().F()), obj, true, true);
        }
        return H(H0(str) ? f().w(this.f5424a.B().F()) : f().t(this.f5424a.B().F()), obj, false, true);
    }

    @Override // R2.AbstractC0550l3
    public final void t() {
        n();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                j().L().a("Utils falling back to Random for random id");
            }
        }
        this.f5025d.set(nextLong);
    }

    public final int u(int i7) {
        return C2197k.f().h(a(), AbstractC2200n.f21186a);
    }

    public final boolean u0(Context context, String str) {
        C0472a2 G6;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e7 = G2.d.a(context).e(str, 64);
            if (e7 == null || (signatureArr = e7.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e8) {
            e = e8;
            G6 = j().G();
            str2 = "Package name not found";
            G6.b(str2, e);
            return true;
        } catch (CertificateException e9) {
            e = e9;
            G6 = j().G();
            str2 = "Error obtaining certificate";
            G6.b(str2, e);
            return true;
        }
    }

    public final int v(String str) {
        if (!w0("event", str)) {
            return 2;
        }
        if (o0("event", AbstractC0591r3.f5512a, AbstractC0591r3.f5513b, str)) {
            return !i0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    public final int w(String str, Object obj) {
        return k0("_ldl".equals(str) ? "user property referrer" : "user property", str, O0(str), obj) ? 0 : 7;
    }

    public final boolean w0(String str, String str2) {
        if (str2 == null) {
            j().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            j().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            j().H().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int x(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.S5.x(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final long z0(String str) {
        if (a().getPackageManager() == null) {
            return 0L;
        }
        int i7 = 0;
        try {
            ApplicationInfo c7 = G2.d.a(a()).c(str, 0);
            if (c7 != null) {
                i7 = c7.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            j().J().b("PackageManager failed to find running app: app_id", str);
        }
        return i7;
    }
}
