/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ServiceInfo
 *  android.content.pm.Signature
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 *  java.math.BigInteger
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.security.SecureRandom
 *  java.security.cert.Certificate
 *  java.security.cert.CertificateException
 *  java.security.cert.CertificateFactory
 *  java.security.cert.X509Certificate
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Random
 *  java.util.Set
 *  java.util.TreeSet
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 *  java.util.concurrent.atomic.AtomicLong
 *  javax.security.auth.x500.X500Principal
 */
package R2;

import A2.n;
import E.a;
import G2.d;
import R2.C;
import R2.D;
import R2.D4;
import R2.G2;
import R2.I;
import R2.K;
import R2.N2;
import R2.P1;
import R2.R5;
import R2.S1;
import R2.U5;
import R2.V5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.c2;
import R2.e;
import R2.f;
import R2.g;
import R2.l2;
import R2.l3;
import R2.m3;
import R2.n3;
import R2.r3;
import R2.s3;
import R2.t3;
import R2.w4;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
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
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.S6;
import com.google.android.gms.internal.measurement.y0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import x2.k;

public final class S5
extends l3 {
    public static final String[] i = new String[]{"firebase_", "google_", "ga_"};
    public static final String[] j = new String[]{"_err"};
    public SecureRandom c;
    public final AtomicLong d = new AtomicLong(0L);
    public int e;
    public q1.a f;
    public Boolean g;
    public Integer h = null;

    public S5(N2 n22) {
        super(n22);
    }

    public static long B(byte[] arrby) {
        n.i(arrby);
        int n8 = arrby.length;
        int n9 = 0;
        boolean bl = n8 > 0;
        n.l(bl);
        long l8 = 0L;
        for (n8 = arrby.length - 1; n8 >= 0 && n8 >= arrby.length - 8; --n8) {
            l8 += ((long)arrby[n8] & 255L) << n9;
            n9 += 8;
        }
        return l8;
    }

    public static boolean B0(Context context, String string2) {
        block5 : {
            PackageManager packageManager;
            block4 : {
                try {
                    packageManager = context.getPackageManager();
                    if (packageManager != null) break block4;
                    return false;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return false;
                }
            }
            context = packageManager.getServiceInfo(new ComponentName(context, string2), 0);
            if (context == null) break block5;
            boolean bl = context.enabled;
            if (!bl) break block5;
            return true;
        }
        return false;
    }

    public static boolean D0(String string2) {
        String string3 = (String)K.b0.a(null);
        if (!string3.equals((Object)"*") && !Arrays.asList((Object[])string3.split(",")).contains((Object)string2)) {
            return false;
        }
        return true;
    }

    public static Bundle E(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        bundle = new Bundle(bundle);
        Iterator iterator = bundle.keySet().iterator();
        while (iterator.hasNext()) {
            int n8;
            List list = (List)iterator.next();
            Object object = bundle.get((String)list);
            if (object instanceof Bundle) {
                bundle.putBundle((String)list, new Bundle((Bundle)object));
                continue;
            }
            boolean bl = object instanceof Parcelable[];
            int n9 = 0;
            if (bl) {
                list = (List)object;
                for (n8 = 0; n8 < list.length; ++n8) {
                    if (!(list[n8] instanceof Bundle)) continue;
                    list[n8] = new Bundle((Bundle)list[n8]);
                }
                continue;
            }
            if (!(object instanceof List)) continue;
            list = (List)object;
            for (n8 = n9; n8 < list.size(); ++n8) {
                object = list.get(n8);
                if (!(object instanceof Bundle)) continue;
                list.set(n8, (Object)new Bundle((Bundle)object));
            }
        }
        return bundle;
    }

    public static Bundle G(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (R5 r52 : list) {
            String string2 = r52.t;
            if (string2 != null) {
                bundle.putString(r52.p, string2);
                continue;
            }
            string2 = r52.r;
            if (string2 != null) {
                bundle.putLong(r52.p, string2.longValue());
                continue;
            }
            string2 = r52.v;
            if (string2 == null) continue;
            bundle.putDouble(r52.p, string2.doubleValue());
        }
        return bundle;
    }

    public static boolean H0(String string2) {
        if (!TextUtils.isEmpty((CharSequence)string2) && string2.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static String I(String string2, int n8, boolean bl) {
        if (string2 == null) {
            return null;
        }
        if (string2.codePointCount(0, string2.length()) > n8) {
            if (bl) {
                string2 = string2.substring(0, string2.offsetByCodePoints(0, n8));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("...");
                return stringBuilder.toString();
            }
            return null;
        }
        return string2;
    }

    public static boolean J0(String string2) {
        n.e(string2);
        if (string2.charAt(0) == '_' && !string2.equals((Object)"_ep")) {
            return false;
        }
        return true;
    }

    public static void L(w4 w42, Bundle bundle, boolean bl) {
        if (bundle != null && w42 != null && (!bundle.containsKey("_sc") || bl)) {
            String string2 = w42.a;
            if (string2 != null) {
                bundle.putString("_sn", string2);
            } else {
                bundle.remove("_sn");
            }
            string2 = w42.b;
            if (string2 != null) {
                bundle.putString("_sc", string2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", w42.c);
            return;
        }
        if (bundle != null && w42 == null && bl) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean L0(String string2) {
        String[] arrstring = j;
        int n8 = arrstring.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!arrstring[i8].equals((Object)string2)) continue;
            return false;
        }
        return true;
    }

    public static void M(U5 u52, int n8, String string2, String string3, int n9) {
        S5.N(u52, null, n8, string2, string3, n9);
    }

    public static void N(U5 u52, String string2, int n8, String string3, String string4, int n9) {
        Bundle bundle = new Bundle();
        S5.v0(bundle, n8);
        if (!TextUtils.isEmpty((CharSequence)string3) && !TextUtils.isEmpty((CharSequence)string4)) {
            bundle.putString(string3, string4);
        }
        if (n8 == 6 || n8 == 7 || n8 == 2) {
            bundle.putLong("_el", (long)n9);
        }
        u52.r(string2, "_err", bundle);
    }

    public static void O(Bundle bundle, int n8, String string2, String string3, Object object) {
        if (S5.v0(bundle, n8)) {
            bundle.putString("_ev", S5.I(string2, 40, true));
            if (object != null) {
                n.i((Object)bundle);
                if (object instanceof String || object instanceof CharSequence) {
                    bundle.putLong("_el", (long)String.valueOf((Object)object).length());
                }
            }
        }
    }

    public static int O0(String string2) {
        if ("_ldl".equals((Object)string2)) {
            return 2048;
        }
        if ("_id".equals((Object)string2)) {
            return 256;
        }
        if ("_lgclid".equals((Object)string2)) {
            return 100;
        }
        if ("_gbraid".equals((Object)string2)) {
            return 100;
        }
        return 36;
    }

    private static boolean R0(String string2) {
        n.i(string2);
        return string2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MessageDigest T0() {
        int n8 = 0;
        while (n8 < 2) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
            ++n8;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private final boolean X0() {
        block12 : {
            block13 : {
                if (this.g != null) return this.g;
                var3_1 = this.Q0();
                var2_11 = false;
                if (var3_1 == null) {
                    return false;
                }
                var3_1 = var3_1.b();
                var5_12 = null;
                var4_13 = (Integer)var3_1.get(10000L, TimeUnit.MILLISECONDS);
                var1_14 = var2_11;
                if (var4_13 == null) ** GOTO lbl16
                var1_14 = var2_11;
                if (var4_13 == 1) {
                    var1_14 = true;
                }
lbl16: // 4 sources:
                this.g = var1_14;
                break block12;
                catch (TimeoutException var3_2) {
                    var4_13 = var5_12;
                }
                catch (InterruptedException var3_3) {
                    var4_13 = var5_12;
                }
                catch (ExecutionException var3_4) {
                    var4_13 = var5_12;
                }
                catch (CancellationException var3_5) {
                    var4_13 = var5_12;
                }
                break block13;
                catch (TimeoutException var3_7) {
                    break block13;
                }
                catch (InterruptedException var3_8) {
                    break block13;
                }
                catch (ExecutionException var3_9) {
                    break block13;
                }
                catch (CancellationException var3_10) {}
            }
            this.j().L().b("Measurement manager api exception", var3_6);
            this.g = Boolean.FALSE;
        }
        this.j().K().b("Measurement manager api status result", (Object)var4_13);
        return this.g;
    }

    public static boolean c0(Context context) {
        block5 : {
            PackageManager packageManager;
            block4 : {
                n.i((Object)context);
                try {
                    packageManager = context.getPackageManager();
                    if (packageManager != null) break block4;
                    return false;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return false;
                }
            }
            context = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (context == null) break block5;
            boolean bl = context.enabled;
            if (!bl) break block5;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d0(Context context, boolean bl) {
        String string2;
        n.i((Object)context);
        if (Build.VERSION.SDK_INT >= 24) {
            string2 = "com.google.android.gms.measurement.AppMeasurementJobService";
            do {
                return S5.B0(context, string2);
                break;
            } while (true);
        }
        string2 = "com.google.android.gms.measurement.AppMeasurementService";
        return S5.B0(context, string2);
    }

    public static boolean e0(Intent object) {
        if (!("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(object = object.getStringExtra("android.intent.extra.REFERRER_NAME")) || "https://www.google.com".equals(object) || "android-app://com.google.appcrawler".equals(object))) {
            return false;
        }
        return true;
    }

    public static boolean f0(Bundle bundle, int n8) {
        int n9 = bundle.size();
        int n10 = 0;
        if (n9 <= n8) {
            return false;
        }
        for (String string2 : new TreeSet((Collection)bundle.keySet())) {
            n10 = n9 = n10 + 1;
            if (n9 <= n8) continue;
            bundle.remove(string2);
            n10 = n9;
        }
        return true;
    }

    public static boolean g0(Object object) {
        if (!(object instanceof Parcelable[] || object instanceof ArrayList || object instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static boolean l0(String string2, String string3, String string4, String string5) {
        boolean bl = TextUtils.isEmpty((CharSequence)string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl && !bl2) {
            n.i(string2);
            if (!string2.equals((Object)string3)) {
                return true;
            }
            return false;
        }
        if (bl && bl2) {
            if (!TextUtils.isEmpty((CharSequence)string4) && !TextUtils.isEmpty((CharSequence)string5)) {
                if (!string4.equals((Object)string5)) {
                    return true;
                }
                return false;
            }
            if (!TextUtils.isEmpty((CharSequence)string5)) {
                return true;
            }
            return false;
        }
        if (!bl && bl2) {
            if (TextUtils.isEmpty((CharSequence)string5)) {
                return false;
            }
            if (!TextUtils.isEmpty((CharSequence)string4)) {
                if (!string4.equals((Object)string5)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty((CharSequence)string4)) {
            if (!string4.equals((Object)string5)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean m0(String string2, String[] arrstring) {
        n.i(arrstring);
        int n8 = arrstring.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!V5.a(string2, arrstring[i8])) continue;
            return true;
        }
        return false;
    }

    public static byte[] p0(Parcelable arrby) {
        if (arrby == null) {
            return null;
        }
        Parcel parcel = Parcel.obtain();
        try {
            arrby.writeToParcel(parcel, 0);
            arrby = parcel.marshall();
            return arrby;
        }
        finally {
            parcel.recycle();
        }
    }

    public static ArrayList t0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        list = list.iterator();
        while (list.hasNext()) {
            B2.a a8 = (e)list.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", a8.o);
            bundle.putString("origin", a8.p);
            bundle.putLong("creation_timestamp", a8.r);
            bundle.putString("name", a8.q.p);
            n3.b(bundle, n.i(a8.q.a()));
            bundle.putBoolean("active", a8.s);
            Object object = a8.t;
            if (object != null) {
                bundle.putString("trigger_event_name", (String)object);
            }
            if ((object = a8.u) != null) {
                bundle.putString("timed_out_event_name", object.o);
                object = object.p;
                if (object != null) {
                    bundle.putBundle("timed_out_event_params", object.g());
                }
            }
            bundle.putLong("trigger_timeout", a8.v);
            object = a8.w;
            if (object != null) {
                bundle.putString("triggered_event_name", object.o);
                object = object.p;
                if (object != null) {
                    bundle.putBundle("triggered_event_params", object.g());
                }
            }
            bundle.putLong("triggered_timestamp", a8.q.q);
            bundle.putLong("time_to_live", a8.x);
            a8 = a8.y;
            if (a8 != null) {
                bundle.putString("expired_event_name", a8.o);
                a8 = a8.p;
                if (a8 != null) {
                    bundle.putBundle("expired_event_params", a8.g());
                }
            }
            arrayList.add((Object)bundle);
        }
        return arrayList;
    }

    public static boolean v0(Bundle bundle, int n8) {
        if (bundle == null) {
            return false;
        }
        if (bundle.getLong("_err") == 0L) {
            bundle.putLong("_err", (long)n8);
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Bundle[] x0(Object arrobject) {
        if (arrobject instanceof Bundle) {
            return new Bundle[]{(Bundle)arrobject};
        }
        if (arrobject instanceof Parcelable[]) {
            arrobject = (Parcelable[])arrobject;
            arrobject = Arrays.copyOf((Object[])arrobject, (int)arrobject.length, Bundle[].class);
            do {
                return (Bundle[])arrobject;
                break;
            } while (true);
        }
        if (!(arrobject instanceof ArrayList)) return null;
        arrobject = arrobject;
        arrobject = arrobject.toArray((Object[])new Bundle[arrobject.size()]);
        return (Bundle[])arrobject;
    }

    public static long y(long l8, long l9) {
        return (l8 + l9 * 60000L) / 86400000L;
    }

    public static int y0() {
        if (Build.VERSION.SDK_INT >= 30 && a.a(30) > 3) {
            return a.a(1000000);
        }
        return 0;
    }

    public static long z(D d8) {
        long l8 = 0L;
        if (d8 == null) {
            return 0L;
        }
        Iterator iterator = d8.iterator();
        while (iterator.hasNext()) {
            Object object = d8.k((String)iterator.next());
            if (!(object instanceof Parcelable[])) continue;
            l8 += (long)((Parcelable[])object).length;
        }
        return l8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long A(Context arrsignature, String string2) {
        this.n();
        n.i(arrsignature);
        n.e(string2);
        PackageManager packageManager = arrsignature.getPackageManager();
        MessageDigest messageDigest = S5.T0();
        if (messageDigest == null) {
            this.j().G().a("Could not get MD5 instance");
            return -1L;
        }
        if (packageManager == null) return 0L;
        {
            try {
                if (this.u0((Context)arrsignature, string2)) return 0L;
                {
                    arrsignature = d.a((Context)arrsignature).e((String)this.a().getPackageName(), (int)64).signatures;
                    if (arrsignature != null && arrsignature.length > 0) {
                        return S5.B(messageDigest.digest(arrsignature[0].toByteArray()));
                    }
                    this.j().L().a("Could not get signatures");
                    return -1L;
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            this.j().G().b("Package name not found", (Object)nameNotFoundException);
        }
        return 0L;
    }

    public final Object A0(String string2, Object object) {
        boolean bl = "_ldl".equals((Object)string2);
        int n8 = S5.O0(string2);
        if (bl) {
            return this.H(n8, object, true, false);
        }
        return this.H(n8, object, false, false);
    }

    public final I C(String string2, String string3, Bundle bundle, String string4, long l8, boolean bl, boolean bl2) {
        if (TextUtils.isEmpty((CharSequence)string3)) {
            return null;
        }
        if (this.v(string3) == 0) {
            bundle = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle.putString("_o", string4);
            bundle = this.F(string2, string3, bundle, E2.f.b("_o"), true);
            string2 = bundle;
            if (bl) {
                string2 = this.r0(bundle);
            }
            n.i(string2);
            return new I(string3, new D((Bundle)string2), string4, l8);
        }
        this.j().G().b("Invalid conditional property event name", this.h().g(string3));
        throw new IllegalArgumentException();
    }

    public final boolean C0(String string2, String string3) {
        int n8;
        if (string3 == null) {
            this.j().H().b("Name is required and can't be null. Type", string2);
            return false;
        }
        if (string3.length() == 0) {
            this.j().H().b("Name is required and can't be empty. Type", string2);
            return false;
        }
        int n9 = string3.codePointAt(0);
        if (!Character.isLetter((int)n9)) {
            this.j().H().c("Name must start with a letter. Type, name", string2, string3);
            return false;
        }
        int n10 = string3.length();
        for (n9 = Character.charCount((int)n9); n9 < n10; n9 += Character.charCount((int)n8)) {
            n8 = string3.codePointAt(n9);
            if (n8 == 95 || Character.isLetterOrDigit((int)n8)) continue;
            this.j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", string2, string3);
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle D(Uri object, boolean bl, boolean bl2) {
        String string2;
        Object object2;
        String string3;
        String string4;
        String string5;
        String string6;
        Object object3;
        String string7;
        String string8;
        UnsupportedOperationException unsupportedOperationException2;
        String string9;
        block24 : {
            if (object == null) {
                return null;
            }
            try {
                boolean bl3 = object.isHierarchical();
                if (bl3) {
                    string2 = object.getQueryParameter("utm_campaign");
                    string8 = object.getQueryParameter("utm_source");
                    string5 = object.getQueryParameter("utm_medium");
                    string4 = object.getQueryParameter("gclid");
                    object3 = bl2 ? object.getQueryParameter("gbraid") : null;
                    string6 = object.getQueryParameter("utm_id");
                    string7 = object.getQueryParameter("dclid");
                    string3 = object.getQueryParameter("srsltid");
                    if (bl) {
                        object2 = object.getQueryParameter("sfmc_id");
                        string9 = object3;
                        object3 = object2;
                    } else {
                        object2 = null;
                        string9 = object3;
                        object3 = object2;
                    }
                    break block24;
                }
                object2 = null;
                string3 = string7 = (string6 = (string4 = (string5 = (string8 = (string2 = object2)))));
                object3 = string3;
                string9 = string4;
                string4 = string5;
                string5 = string8;
                string8 = string2;
                string2 = object2;
            }
            catch (UnsupportedOperationException unsupportedOperationException2) {}
        }
        if (TextUtils.isEmpty((CharSequence)string2) && TextUtils.isEmpty((CharSequence)string8) && TextUtils.isEmpty((CharSequence)string5) && TextUtils.isEmpty((CharSequence)string4) && (!bl2 || TextUtils.isEmpty((CharSequence)string9)) && TextUtils.isEmpty((CharSequence)string6) && TextUtils.isEmpty((CharSequence)string7) && TextUtils.isEmpty((CharSequence)string3) && (!bl || TextUtils.isEmpty((CharSequence)object3))) {
            return null;
        }
        object2 = new Bundle();
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            object2.putString("campaign", string2);
        }
        if (!TextUtils.isEmpty((CharSequence)string8)) {
            object2.putString("source", string8);
        }
        if (!TextUtils.isEmpty((CharSequence)string5)) {
            object2.putString("medium", string5);
        }
        if (!TextUtils.isEmpty((CharSequence)string4)) {
            object2.putString("gclid", string4);
        }
        if (bl2 && !TextUtils.isEmpty((CharSequence)string9)) {
            object2.putString("gbraid", string9);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = object.getQueryParameter("utm_term")))) {
            object2.putString("term", string2);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = object.getQueryParameter("utm_content")))) {
            object2.putString("content", string2);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = object.getQueryParameter("aclid")))) {
            object2.putString("aclid", string2);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = object.getQueryParameter("cp1")))) {
            object2.putString("cp1", string2);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = object.getQueryParameter("anid")))) {
            object2.putString("anid", string2);
        }
        if (!TextUtils.isEmpty((CharSequence)string6)) {
            object2.putString("campaign_id", string6);
        }
        if (!TextUtils.isEmpty((CharSequence)string7)) {
            object2.putString("dclid", string7);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = object.getQueryParameter("utm_source_platform")))) {
            object2.putString("source_platform", string2);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = object.getQueryParameter("utm_creative_format")))) {
            object2.putString("creative_format", string2);
        }
        if (!TextUtils.isEmpty((CharSequence)(object = object.getQueryParameter("utm_marketing_tactic")))) {
            object2.putString("marketing_tactic", (String)object);
        }
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            object2.putString("srsltid", string3);
        }
        if (bl && !TextUtils.isEmpty((CharSequence)object3)) {
            object2.putString("sfmc_id", (String)object3);
        }
        return object2;
        this.j().L().b("Install referrer url isn't a hierarchical URI", (Object)unsupportedOperationException2);
        return null;
    }

    public final boolean E0(String string2) {
        this.n();
        if (d.a(this.a()).a(string2) == 0) {
            return true;
        }
        this.j().F().b("Permission not granted", string2);
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final Bundle F(String var1_1, String var2_2, Bundle var3_3, List var4_4, boolean var5_5) {
        var10_6 = S5.m0(var2_2, r3.d);
        if (var3_3 == null) return null;
        var13_7 = new Bundle(var3_3);
        var6_8 = this.f().E();
        var14_9 = new TreeSet((Collection)var3_3.keySet()).iterator();
        var9_10 = 0;
        do {
            block8 : {
                block9 : {
                    block7 : {
                        var12_14 = this;
                        if (var14_9.hasNext() == false) return var13_7;
                        var11_13 = (String)var14_9.next();
                        if (var4_4 != null && var4_4.contains((Object)var11_13)) {
                            var8_12 = 0;
                        } else {
                            var7_11 = var5_5 == false ? var12_14.N0(var11_13) : 0;
                            var8_12 = var7_11;
                            if (var7_11 == 0) {
                                var8_12 = var12_14.M0(var11_13);
                            }
                        }
                        if (var8_12 == 0) break block7;
                        var12_14 = var8_12 == 3 ? var11_13 : null;
                        S5.O(var13_7, var8_12, var11_13, var11_13, var12_14);
                        var13_7.remove(var11_13);
                        var7_11 = var9_10;
                        break block8;
                    }
                    var12_14 = var3_3.get(var11_13);
                    var8_12 = var6_8;
                    var7_11 = this.x(var1_1, var2_2, var11_13, var12_14, var13_7, var4_4, var5_5, var10_6);
                    if (var7_11 != 17) break block9;
                    S5.O(var13_7, var7_11, var11_13, var11_13, (Object)Boolean.FALSE);
                    ** GOTO lbl-1000
                }
                if (var7_11 != 0 && !"_ev".equals((Object)var11_13)) {
                    var12_14 = var7_11 == 21 ? var2_2 : var11_13;
                    S5.O(var13_7, var7_11, (String)var12_14, var11_13, var3_3.get(var11_13));
                    var13_7.remove(var11_13);
                    var7_11 = var9_10;
                } else lbl-1000: // 2 sources:
                {
                    var7_11 = var9_10;
                    if (S5.J0(var11_13) && (var7_11 = var9_10 + 1) > var8_12) {
                        var12_14 = new StringBuilder("Event can't contain more than ");
                        var12_14.append(var8_12);
                        var12_14.append(" params");
                        var12_14 = var12_14.toString();
                        this.j().H().c((String)var12_14, this.h().c(var2_2), this.h().b(var3_3));
                        S5.v0(var13_7, 5);
                        var13_7.remove(var11_13);
                    }
                }
            }
            var9_10 = var7_11;
        } while (true);
    }

    public final boolean F0(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return false;
        }
        return this.f().N().equals((Object)string2);
    }

    public final int G0() {
        if (this.h == null) {
            this.h = k.f().a(this.a()) / 1000;
        }
        return this.h;
    }

    public final Object H(int n8, Object arrparcelable, boolean bl, boolean bl2) {
        if (arrparcelable == null) {
            return null;
        }
        if (!(arrparcelable instanceof Long)) {
            if (arrparcelable instanceof Double) {
                return arrparcelable;
            }
            if (arrparcelable instanceof Integer) {
                return (long)((Integer)arrparcelable);
            }
            if (arrparcelable instanceof Byte) {
                return (long)((Byte)arrparcelable);
            }
            if (arrparcelable instanceof Short) {
                return (long)((Short)arrparcelable);
            }
            if (arrparcelable instanceof Boolean) {
                long l8 = (Boolean)arrparcelable != false ? 1L : 0L;
                return l8;
            }
            if (arrparcelable instanceof Float) {
                return ((Float)arrparcelable).doubleValue();
            }
            if (!(arrparcelable instanceof String || arrparcelable instanceof Character || arrparcelable instanceof CharSequence)) {
                if (bl2 && (arrparcelable instanceof Bundle[] || arrparcelable instanceof Parcelable[])) {
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[])arrparcelable) {
                        if (!(parcelable instanceof Bundle) || (parcelable = this.r0((Bundle)parcelable)) == null || parcelable.isEmpty()) continue;
                        arrayList.add((Object)parcelable);
                    }
                    return arrayList.toArray((Object[])new Bundle[arrayList.size()]);
                }
                return null;
            }
            return S5.I(String.valueOf((Object)arrparcelable), n8, bl);
        }
        return arrparcelable;
    }

    public final long I0() {
        this.n();
        if (!S5.D0(this.a.B().F())) {
            return 0L;
        }
        long l8 = Build.VERSION.SDK_INT < 30 ? 4L : (a.a(30) < 4 ? 8L : (S5.y0() < (Integer)K.X.a(null) ? 16L : 0L));
        long l9 = l8;
        if (!this.E0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            l9 = l8 | 2L;
        }
        l8 = l9;
        if (l9 == 0L) {
            l8 = l9;
            if (!this.X0()) {
                l8 = l9 | 64L;
            }
        }
        if (l8 == 0L) {
            return 1L;
        }
        return l8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final URL J(long l8, String string2, String string3, long l9, String string4) {
        void var3_3;
        try {
            String string5;
            n.e(string3);
            n.e(string2);
            string3 = string5 = String.format((String)"https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", (Object[])new Object[]{String.format((String)"v%s.%s", (Object[])new Object[]{l8, this.G0()}), string3, string2, l9});
            if (string2.equals((Object)this.f().O())) {
                string3 = string5.concat("&ddl_test=1");
            }
            string2 = string3;
            if (string4.isEmpty()) return new URL(string2);
            string2 = string3;
            if (string4.charAt(0) != '&') {
                string2 = string3.concat("&");
            }
            string2 = string2.concat(string4);
            return new URL(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (MalformedURLException malformedURLException) {}
        this.j().G().b("Failed to create BOW URL for Deferred Deep Link. exception", var3_3.getMessage());
        return null;
    }

    public final void K(c2 c22, int n8) {
        Iterator iterator = new TreeSet((Collection)c22.d.keySet()).iterator();
        int n9 = 0;
        while (iterator.hasNext()) {
            int n10;
            String string2 = (String)iterator.next();
            if (!S5.J0(string2)) continue;
            n9 = n10 = n9 + 1;
            if (n10 <= n8) continue;
            Object object = new StringBuilder("Event can't contain more than ");
            object.append(n8);
            object.append(" params");
            object = object.toString();
            this.j().H().c((String)object, this.h().c(c22.a), this.h().b(c22.d));
            S5.v0(c22.d, 5);
            c22.d.remove(string2);
            n9 = n10;
        }
    }

    public final boolean K0(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return false;
        }
        string2 = this.a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse((String)string2)), 0);
        if (string2 != null && !string2.isEmpty()) {
            return true;
        }
        return false;
    }

    public final int M0(String string2) {
        if (!this.w0("event param", string2)) {
            return 3;
        }
        if (!this.n0("event param", null, string2)) {
            return 14;
        }
        if (!this.i0("event param", 40, string2)) {
            return 3;
        }
        return 0;
    }

    public final int N0(String string2) {
        if (!this.C0("event param", string2)) {
            return 3;
        }
        if (!this.n0("event param", null, string2)) {
            return 14;
        }
        if (!this.i0("event param", 40, string2)) {
            return 3;
        }
        return 0;
    }

    public final void P(Bundle bundle, long l8) {
        long l9 = bundle.getLong("_et");
        if (l9 != 0L) {
            this.j().L().b("Params already contained engagement", l9);
        }
        bundle.putLong("_et", l8 + l9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long P0() {
        if (this.d.get() == 0L) {
            AtomicLong atomicLong = this.d;
            synchronized (atomicLong) {
                int n8;
                long l8 = new Random(System.nanoTime() ^ this.b().a()).nextLong();
                this.e = n8 = this.e + 1;
                long l9 = n8;
                return l8 + l9;
            }
        }
        AtomicLong atomicLong = this.d;
        synchronized (atomicLong) {
            this.d.compareAndSet(-1L, 1L);
            return this.d.getAndIncrement();
        }
    }

    public final void Q(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String string2 : bundle2.keySet()) {
            if (bundle.containsKey(string2)) continue;
            this.k().R(bundle, string2, bundle2.get(string2));
        }
    }

    public final q1.a Q0() {
        if (this.f == null) {
            this.f = q1.a.a(this.a());
        }
        return this.f;
    }

    public final void R(Bundle object, String string2, Object object2) {
        if (object == null) {
            return;
        }
        if (object2 instanceof Long) {
            object.putLong(string2, ((Long)object2).longValue());
            return;
        }
        if (object2 instanceof String) {
            object.putString(string2, String.valueOf((Object)object2));
            return;
        }
        if (object2 instanceof Double) {
            object.putDouble(string2, ((Double)object2).doubleValue());
            return;
        }
        if (object2 instanceof Bundle[]) {
            object.putParcelableArray(string2, (Parcelable[])((Bundle[])object2));
            return;
        }
        if (string2 != null) {
            object = object2 != null ? object2.getClass().getSimpleName() : null;
            this.j().M().c("Not putting event parameter. Invalid value type. name, type", this.h().f(string2), object);
        }
    }

    public final void S(y0 y02, int n8) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", n8);
        try {
            y02.l(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.j().L().b("Error returning int value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final String S0() {
        byte[] arrby = new byte[16];
        this.U0().nextBytes(arrby);
        return String.format((Locale)Locale.US, (String)"%032x", (Object[])new Object[]{new BigInteger(1, arrby)});
    }

    public final void T(y0 y02, long l8) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", l8);
        try {
            y02.l(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.j().L().b("Error returning long value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void U(y0 y02, Bundle bundle) {
        try {
            y02.l(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.j().L().b("Error returning bundle value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final SecureRandom U0() {
        this.n();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final void V(y0 y02, String string2) {
        Bundle bundle = new Bundle();
        bundle.putString("r", string2);
        try {
            y02.l(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.j().L().b("Error returning string value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final boolean V0() {
        this.n();
        if (this.I0() == 1L) {
            return true;
        }
        return false;
    }

    public final void W(y0 y02, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            y02.l(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.j().L().b("Error returning bundle list to wrapper", (Object)remoteException);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean W0() {
        try {
            this.a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    public final void X(y0 y02, boolean bl) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", bl);
        try {
            y02.l(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.j().L().b("Error returning boolean value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void Y(y0 y02, byte[] arrby) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", arrby);
        try {
            y02.l(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.j().L().b("Error returning byte array to wrapper", (Object)remoteException);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void Z(String var1_1, String var2_2, String var3_3, Bundle var4_4, List var5_5, boolean var6_6) {
        if (var4_4 == null) {
            return;
        }
        var10_7 = this.f().v();
        var16_8 = new TreeSet((Collection)var4_4.keySet()).iterator();
        var9_9 = 0;
        while (var16_8.hasNext() != false) {
            block11 : {
                var11_12 = (String)var16_8.next();
                if (var5_5 != null && var5_5.contains(var11_12)) {
                    var8_11 = 0;
                } else {
                    var7_10 = var6_6 == false ? this.N0((String)var11_12) : 0;
                    var8_11 = var7_10;
                    if (var7_10 == 0) {
                        var8_11 = this.M0((String)var11_12);
                    }
                }
                if (var8_11 != 0) {
                    var12_13 = var8_11 == 3 ? var11_12 : null;
                    S5.O(var4_4, var8_11, (String)var11_12, (String)var11_12, var12_13);
                    var4_4.remove((String)var11_12);
                    continue;
                }
                if (S5.g0(var4_4.get((String)var11_12))) {
                    this.j().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", var2_2, var3_3, var11_12);
                    var7_10 = 22;
                } else {
                    var7_10 = this.x(var1_1, var2_2, (String)var11_12, var4_4.get((String)var11_12), var4_4, var5_5, var6_6, false);
                }
                var15_16 = var11_12;
                if (var7_10 != 0 && !"_ev".equals((Object)var15_16)) {
                    S5.O(var4_4, var7_10, var15_16, var15_16, var4_4.get(var15_16));
                    var4_4.remove(var15_16);
                    continue;
                }
                if (!S5.J0(var15_16) || S5.m0(var15_16, t3.d)) continue;
                ++var9_9;
                if (this.b0(231100000, true)) break block11;
                var11_12 = this.j().H();
                var12_13 = this.h().c(var2_2);
                var13_14 = this.h().b(var4_4);
                var14_15 = "Item array not supported on client's version of Google Play Services (Android Only)";
                ** GOTO lbl52
            }
            if (var9_9 <= var10_7) continue;
            if (S6.a() && this.f().s(K.I0)) {
                var11_12 = this.j().H();
                var12_13 = new StringBuilder("Item can't contain more than ");
                var12_13.append(var10_7);
                var12_13.append(" item-scoped custom params");
                var11_12.c(var12_13.toString(), this.h().c(var2_2), this.h().b(var4_4));
                S5.v0(var4_4, 28);
            } else {
                var11_12 = this.j().H();
                var12_13 = this.h().c(var2_2);
                var13_14 = this.h().b(var4_4);
                var14_15 = "Item cannot contain custom parameters";
lbl52: // 2 sources:
                var11_12.c(var14_15, var12_13, var13_14);
                S5.v0(var4_4, 23);
            }
            var4_4.remove(var15_16);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a0(Parcelable[] arrparcelable, int n8, boolean bl) {
        n.i(arrparcelable);
        int n9 = arrparcelable.length;
        int n10 = 0;
        while (n10 < n9) {
            Bundle bundle = (Bundle)arrparcelable[n10];
            Iterator iterator = new TreeSet((Collection)bundle.keySet()).iterator();
            int n11 = 0;
            while (iterator.hasNext()) {
                int n12;
                String string2 = (String)iterator.next();
                if (!S5.J0(string2) || S5.m0(string2, t3.d)) continue;
                n11 = n12 = n11 + 1;
                if (n12 <= n8) continue;
                a2 a22 = this.j().H();
                if (bl) {
                    StringBuilder stringBuilder = new StringBuilder("Param can't contain more than ");
                    stringBuilder.append(n8);
                    stringBuilder.append(" item-scoped custom parameters");
                    a22.c(stringBuilder.toString(), this.h().f(string2), this.h().b(bundle));
                    n11 = 28;
                } else {
                    a22.c("Param cannot contain item-scoped custom parameters", this.h().f(string2), this.h().b(bundle));
                    n11 = 23;
                }
                S5.v0(bundle, n11);
                bundle.remove(string2);
                n11 = n12;
            }
            ++n10;
        }
    }

    public final boolean b0(int n8, boolean bl) {
        Boolean bl2 = this.a.J().W();
        if (this.G0() < n8 / 1000 && (bl2 == null || bl2.booleanValue())) {
            return false;
        }
        return true;
    }

    public final boolean h0(String string2, double d8) {
        try {
            SharedPreferences.Editor editor = this.a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editor.putString("deeplink", string2);
            editor.putLong("timestamp", Double.doubleToRawLongBits((double)d8));
            boolean bl = editor.commit();
            return bl;
        }
        catch (RuntimeException runtimeException) {
            this.j().G().b("Failed to persist Deferred Deep Link. exception", (Object)runtimeException);
            return false;
        }
    }

    public final boolean i0(String string2, int n8, String string3) {
        if (string3 == null) {
            this.j().H().b("Name is required and can't be null. Type", string2);
            return false;
        }
        if (string3.codePointCount(0, string3.length()) > n8) {
            this.j().H().d("Name is too long. Type, maximum supported length, name", string2, n8, string3);
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean j0(String string2, String string3) {
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            if (S5.R0(string2)) return true;
            if (!this.a.r()) return false;
            this.j().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", Y1.v(string2));
            return false;
        }
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            if (S5.R0(string3)) return true;
            this.j().H().b("Invalid admob_app_id. Analytics disabled.", Y1.v(string3));
            return false;
        }
        if (!this.a.r()) return false;
        this.j().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        return false;
    }

    public final boolean k0(String string2, String string3, int n8, Object object) {
        if (object == null) {
            return true;
        }
        if (!(object instanceof Long || object instanceof Float || object instanceof Integer || object instanceof Byte || object instanceof Short || object instanceof Boolean)) {
            if (object instanceof Double) {
                return true;
            }
            if (!(object instanceof String || object instanceof Character || object instanceof CharSequence)) {
                return false;
            }
            if ((object = String.valueOf((Object)object)).codePointCount(0, object.length()) > n8) {
                this.j().M().d("Value is too long; discarded. Value kind, name, value length", string2, string3, object.length());
                return false;
            }
        }
        return true;
    }

    public final boolean n0(String string2, String[] arrstring, String string3) {
        return this.o0(string2, arrstring, null, string3);
    }

    public final boolean o0(String string2, String[] arrstring, String[] arrstring2, String string3) {
        if (string3 == null) {
            this.j().H().b("Name is required and can't be null. Type", string2);
            return false;
        }
        n.i(string3);
        String[] arrstring3 = i;
        int n8 = arrstring3.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!string3.startsWith(arrstring3[i8])) continue;
            this.j().H().c("Name starts with reserved prefix. Type, name", string2, string3);
            return false;
        }
        if (arrstring != null && S5.m0(string3, arrstring) && (arrstring2 == null || !S5.m0(string3, arrstring2))) {
            this.j().H().c("Name is reserved. Type, name", string2, string3);
            return false;
        }
        return true;
    }

    public final int q0(String string2) {
        if (!this.w0("user property", string2)) {
            return 6;
        }
        if (!this.n0("user property", s3.a, string2)) {
            return 15;
        }
        if (!this.i0("user property", 24, string2)) {
            return 6;
        }
        return 0;
    }

    public final Bundle r0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String string2 : bundle.keySet()) {
                Object object = this.s0(string2, bundle.get(string2));
                if (object == null) {
                    this.j().M().b("Param value can't be null", this.h().f(string2));
                    continue;
                }
                this.R(bundle2, string2, object);
            }
        }
        return bundle2;
    }

    @Override
    public final boolean s() {
        return true;
    }

    public final Object s0(String string2, Object object) {
        if ("_ev".equals((Object)string2)) {
            return this.H(this.f().w(this.a.B().F()), object, true, true);
        }
        int n8 = S5.H0(string2) ? this.f().w(this.a.B().F()) : this.f().t(this.a.B().F());
        return this.H(n8, object, false, true);
    }

    @Override
    public final void t() {
        long l8;
        this.n();
        SecureRandom secureRandom = new SecureRandom();
        long l9 = l8 = secureRandom.nextLong();
        if (l8 == 0L) {
            l9 = l8 = secureRandom.nextLong();
            if (l8 == 0L) {
                this.j().L().a("Utils falling back to Random for random id");
                l9 = l8;
            }
        }
        this.d.set(l9);
    }

    public final int u(int n8) {
        return k.f().h(this.a(), 12451000);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean u0(Context signature, String string2) {
        void var2_5;
        Object object;
        block6 : {
            block5 : {
                object = new X500Principal("CN=Android Debug,O=Android,C=US");
                signature = d.a((Context)signature).e(string2, 64);
                if (signature == null) return true;
                signature = signature.signatures;
                if (signature == null) return true;
                if (signature.length <= 0) return true;
                signature = signature[0];
                try {
                    return ((X509Certificate)CertificateFactory.getInstance((String)"X.509").generateCertificate((InputStream)new ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(object);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                }
                catch (CertificateException certificateException) {
                    break block5;
                }
                object = this.j().G();
                signature = "Package name not found";
                break block6;
            }
            object = this.j().G();
            signature = "Error obtaining certificate";
        }
        object.b((String)signature, var2_5);
        return true;
    }

    public final int v(String string2) {
        if (!this.w0("event", string2)) {
            return 2;
        }
        if (!this.o0("event", r3.a, r3.b, string2)) {
            return 13;
        }
        if (!this.i0("event", 40, string2)) {
            return 2;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int w(String string2, Object object) {
        String string3 = "_ldl".equals((Object)string2) ? "user property referrer" : "user property";
        boolean bl = this.k0(string3, string2, S5.O0(string2), object);
        if (!bl) {
            return 7;
        }
        return 0;
    }

    public final boolean w0(String string2, String string3) {
        int n8;
        if (string3 == null) {
            this.j().H().b("Name is required and can't be null. Type", string2);
            return false;
        }
        if (string3.length() == 0) {
            this.j().H().b("Name is required and can't be empty. Type", string2);
            return false;
        }
        int n9 = string3.codePointAt(0);
        if (!Character.isLetter((int)n9) && n9 != 95) {
            this.j().H().c("Name must start with a letter or _ (underscore). Type, name", string2, string3);
            return false;
        }
        int n10 = string3.length();
        for (n9 = Character.charCount((int)n9); n9 < n10; n9 += Character.charCount((int)n8)) {
            n8 = string3.codePointAt(n9);
            if (n8 == 95 || Character.isLetterOrDigit((int)n8)) continue;
            this.j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", string2, string3);
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int x(String var1_1, String var2_2, String var3_3, Object var4_4, Bundle var5_5, List var6_6, boolean var7_7, boolean var8_8) {
        block18 : {
            block17 : {
                this.n();
                var13_9 = S5.g0(var4_4);
                var11_10 = 0;
                if (!var13_9) ** GOTO lbl-1000
                if (var8_8 == false) return 21;
                if (!S5.m0(var3_3, t3.c)) {
                    return 20;
                }
                if (!this.a.J().d0()) {
                    return 25;
                }
                var13_9 = var4_4 instanceof Parcelable[];
                if (!var13_9) break block17;
                var9_11 = ((Parcelable[])var4_4).length;
                break block18;
            }
            if (!(var4_4 instanceof ArrayList)) ** GOTO lbl-1000
            var9_11 = ((ArrayList)var4_4).size();
        }
        if (var9_11 > 200) {
            this.j().M().d("Parameter array is too long; discarded. Value kind, name, array length", "param", var3_3, var9_11);
            if (var13_9) {
                var14_12 = (ArrayList)var4_4;
                if (var14_12.length > 200) {
                    var5_5.putParcelableArray(var3_3, (Parcelable[])Arrays.copyOf((Object[])var14_12, (int)200));
                }
            } else if (var4_4 instanceof ArrayList && (var14_12 = (ArrayList)var4_4).size() > 200) {
                var5_5.putParcelableArrayList(var3_3, new ArrayList((Collection)var14_12.subList(0, 200)));
            }
            var9_11 = 17;
        } else lbl-1000: // 3 sources:
        {
            var9_11 = 0;
        }
        var10_13 = !S5.H0((String)var2_2) && !S5.H0(var3_3) ? this.f().t(this.a.B().F()) : this.f().w(this.a.B().F());
        if (this.k0("param", var3_3, var10_13, var4_4)) {
            return var9_11;
        }
        if (var8_8 == false) return 4;
        if (var4_4 instanceof Bundle) {
            this.Z(var1_1, (String)var2_2, var3_3, (Bundle)var4_4, var6_6, var7_7);
            return var9_11;
        }
        if (var4_4 instanceof Parcelable[]) {
            block16 : {
                var5_5 = (ArrayList)var4_4;
                var11_10 = var5_5.length;
                var10_13 = 0;
                while (var10_13 < var11_10) {
                    var4_4 = var5_5[var10_13];
                    if (!(var4_4 instanceof Bundle)) {
                        var2_2 = this.j().M();
                        var1_1 = var4_4.getClass();
                        var4_4 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                        break block16;
                    }
                    this.Z(var1_1, (String)var2_2, var3_3, (Bundle)var4_4, var6_6, var7_7);
                    ++var10_13;
                }
                return var9_11;
            }
lbl53: // 2 sources:
            do {
                var2_2.c((String)var4_4, var1_1, var3_3);
                return 4;
                break;
            } while (true);
        }
        if (var4_4 instanceof ArrayList == false) return 4;
        var5_5 = (ArrayList)var4_4;
        var12_14 = var5_5.size();
        var10_13 = var11_10;
        while (var10_13 < var12_14) {
            var4_4 = var5_5.get(var10_13);
            if (!(var4_4 instanceof Bundle)) {
                var2_2 = this.j().M();
                var1_1 = var4_4 != null ? var4_4.getClass() : "null";
                var4_4 = "All ArrayList elements must be of type Bundle. Value type, name";
                ** continue;
            }
            this.Z(var1_1, (String)var2_2, var3_3, (Bundle)var4_4, var6_6, var7_7);
            ++var10_13;
        }
        return var9_11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long z0(String string2) {
        int n8;
        if (this.a().getPackageManager() == null) {
            return 0L;
        }
        int n9 = 0;
        try {
            ApplicationInfo applicationInfo = d.a(this.a()).c(string2, 0);
            n8 = n9;
            if (applicationInfo == null) return n8;
            n8 = applicationInfo.targetSdkVersion;
            return n8;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        this.j().J().b("PackageManager failed to find running app: app_id", string2);
        n8 = n9;
        return n8;
    }
}

