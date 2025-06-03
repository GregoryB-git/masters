// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.security.cert.CertificateException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import android.content.SharedPreferences$Editor;
import com.google.android.gms.internal.measurement.S6;
import java.math.BigInteger;
import java.util.Locale;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.y0;
import java.util.Random;
import java.net.MalformedURLException;
import java.net.URL;
import android.os.BaseBundle;
import x2.k;
import android.net.Uri;
import E2.f;
import android.content.pm.Signature;
import G2.d;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import android.content.Intent;
import android.os.Build$VERSION;
import android.content.pm.ActivityInfo;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.Arrays;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import A2.n;
import q1.a;
import java.util.concurrent.atomic.AtomicLong;
import java.security.SecureRandom;

public final class S5 extends l3
{
    public static final String[] i;
    public static final String[] j;
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public a f;
    public Boolean g;
    public Integer h;
    
    static {
        i = new String[] { "firebase_", "google_", "ga_" };
        j = new String[] { "_err" };
    }
    
    public S5(final N2 n2) {
        super(n2);
        this.h = null;
        this.d = new AtomicLong(0L);
    }
    
    public static long B(final byte[] array) {
        n.i(array);
        final int length = array.length;
        int n = 0;
        A2.n.l(length > 0);
        int n2 = array.length - 1;
        long n3 = 0L;
        while (n2 >= 0 && n2 >= array.length - 8) {
            n3 += ((long)array[n2] & 0xFFL) << n;
            n += 8;
            --n2;
        }
        return n3;
    }
    
    public static boolean B0(final Context context, final String s) {
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            final ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, s), 0);
            return serviceInfo != null && serviceInfo.enabled;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public static boolean D0(final String s) {
        final String s2 = (String)K.b0.a(null);
        return s2.equals("*") || Arrays.asList(s2.split(",")).contains(s);
    }
    
    public static Bundle E(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        bundle = new Bundle(bundle);
        for (final String s : ((BaseBundle)bundle).keySet()) {
            final Object value = ((BaseBundle)bundle).get(s);
            if (value instanceof Bundle) {
                bundle.putBundle(s, new Bundle((Bundle)value));
            }
            else {
                final boolean b = value instanceof Parcelable[];
                final int n = 0;
                int i = 0;
                if (b) {
                    for (Parcelable[] array = (Parcelable[])value; i < array.length; ++i) {
                        if (array[i] instanceof Bundle) {
                            array[i] = (Parcelable)new Bundle((Bundle)array[i]);
                        }
                    }
                }
                else {
                    if (!(value instanceof List)) {
                        continue;
                    }
                    final List<Object> list = (List<Object>)value;
                    for (int j = n; j < list.size(); ++j) {
                        final Bundle value2 = list.get(j);
                        if (value2 instanceof Bundle) {
                            list.set(j, new Bundle((Bundle)value2));
                        }
                    }
                }
            }
        }
        return bundle;
    }
    
    public static Bundle G(final List list) {
        final Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (final R5 r5 : list) {
            final String t = r5.t;
            if (t != null) {
                ((BaseBundle)bundle).putString(r5.p, t);
            }
            else {
                final Long r6 = r5.r;
                if (r6 != null) {
                    ((BaseBundle)bundle).putLong(r5.p, (long)r6);
                }
                else {
                    final Double v = r5.v;
                    if (v == null) {
                        continue;
                    }
                    ((BaseBundle)bundle).putDouble(r5.p, (double)v);
                }
            }
        }
        return bundle;
    }
    
    public static boolean H0(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && s.startsWith("_");
    }
    
    public static String I(String substring, final int codePointOffset, final boolean b) {
        if (substring == null) {
            return null;
        }
        if (substring.codePointCount(0, substring.length()) <= codePointOffset) {
            return substring;
        }
        if (b) {
            substring = substring.substring(0, substring.offsetByCodePoints(0, codePointOffset));
            final StringBuilder sb = new StringBuilder();
            sb.append(substring);
            sb.append("...");
            return sb.toString();
        }
        return null;
    }
    
    public static boolean J0(final String s) {
        n.e(s);
        return s.charAt(0) != '_' || s.equals("_ep");
    }
    
    public static void L(final w4 w4, final Bundle bundle, final boolean b) {
        if (bundle != null && w4 != null && (!((BaseBundle)bundle).containsKey("_sc") || b)) {
            final String a = w4.a;
            if (a != null) {
                ((BaseBundle)bundle).putString("_sn", a);
            }
            else {
                bundle.remove("_sn");
            }
            final String b2 = w4.b;
            if (b2 != null) {
                ((BaseBundle)bundle).putString("_sc", b2);
            }
            else {
                bundle.remove("_sc");
            }
            ((BaseBundle)bundle).putLong("_si", w4.c);
            return;
        }
        if (bundle != null && w4 == null && b) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }
    
    public static boolean L0(final String anObject) {
        final String[] j = S5.j;
        for (int length = j.length, i = 0; i < length; ++i) {
            if (j[i].equals(anObject)) {
                return false;
            }
        }
        return true;
    }
    
    public static void M(final U5 u5, final int n, final String s, final String s2, final int n2) {
        N(u5, null, n, s, s2, n2);
    }
    
    public static void N(final U5 u5, final String s, final int n, final String s2, final String s3, final int n2) {
        final Bundle bundle = new Bundle();
        v0(bundle, n);
        if (!TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)s3)) {
            ((BaseBundle)bundle).putString(s2, s3);
        }
        if (n == 6 || n == 7 || n == 2) {
            ((BaseBundle)bundle).putLong("_el", (long)n2);
        }
        u5.r(s, "_err", bundle);
    }
    
    public static void O(final Bundle bundle, final int n, final String s, final String s2, final Object obj) {
        if (v0(bundle, n)) {
            ((BaseBundle)bundle).putString("_ev", I(s, 40, true));
            if (obj != null) {
                n.i(bundle);
                if (obj instanceof String || obj instanceof CharSequence) {
                    ((BaseBundle)bundle).putLong("_el", (long)String.valueOf(obj).length());
                }
            }
        }
    }
    
    public static int O0(final String s) {
        if ("_ldl".equals(s)) {
            return 2048;
        }
        if ("_id".equals(s)) {
            return 256;
        }
        if ("_lgclid".equals(s)) {
            return 100;
        }
        if ("_gbraid".equals(s)) {
            return 100;
        }
        return 36;
    }
    
    private static boolean R0(final String s) {
        n.i(s);
        return s.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }
    
    public static MessageDigest T0() {
        int n = 0;
    Label_0020_Outer:
        while (true) {
            Label_0027: {
                if (n >= 2) {
                    break Label_0027;
                }
                while (true) {
                    try {
                        final MessageDigest instance = MessageDigest.getInstance("MD5");
                        if (instance != null) {
                            return instance;
                        }
                        ++n;
                        continue Label_0020_Outer;
                        return null;
                    }
                    catch (NoSuchAlgorithmException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    private final boolean X0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        R2/S5.g:Ljava/lang/Boolean;
        //     4: ifnonnull       144
        //     7: aload_0        
        //     8: invokevirtual   R2/S5.Q0:()Lq1/a;
        //    11: astore_3       
        //    12: iconst_0       
        //    13: istore_2       
        //    14: aload_3        
        //    15: ifnonnull       20
        //    18: iconst_0       
        //    19: ireturn        
        //    20: aload_3        
        //    21: invokevirtual   q1/a.b:()Lb3/e;
        //    24: astore_3       
        //    25: aconst_null    
        //    26: astore          5
        //    28: aload_3        
        //    29: ldc2_w          10000
        //    32: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //    35: invokeinterface java/util/concurrent/Future.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //    40: checkcast       Ljava/lang/Integer;
        //    43: astore          4
        //    45: iload_2        
        //    46: istore_1       
        //    47: aload           4
        //    49: ifnull          68
        //    52: iload_2        
        //    53: istore_1       
        //    54: aload           4
        //    56: invokevirtual   java/lang/Integer.intValue:()I
        //    59: iconst_1       
        //    60: if_icmpne       68
        //    63: iconst_1       
        //    64: istore_1       
        //    65: goto            68
        //    68: aload_0        
        //    69: iload_1        
        //    70: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    73: putfield        R2/S5.g:Ljava/lang/Boolean;
        //    76: goto            129
        //    79: astore_3       
        //    80: aload           5
        //    82: astore          4
        //    84: goto            108
        //    87: astore_3       
        //    88: aload           5
        //    90: astore          4
        //    92: goto            108
        //    95: astore_3       
        //    96: aload           5
        //    98: astore          4
        //   100: goto            108
        //   103: astore_3       
        //   104: aload           5
        //   106: astore          4
        //   108: aload_0        
        //   109: invokevirtual   R2/m3.j:()LR2/Y1;
        //   112: invokevirtual   R2/Y1.L:()LR2/a2;
        //   115: ldc_w           "Measurement manager api exception"
        //   118: aload_3        
        //   119: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   122: aload_0        
        //   123: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //   126: putfield        R2/S5.g:Ljava/lang/Boolean;
        //   129: aload_0        
        //   130: invokevirtual   R2/m3.j:()LR2/Y1;
        //   133: invokevirtual   R2/Y1.K:()LR2/a2;
        //   136: ldc_w           "Measurement manager api status result"
        //   139: aload           4
        //   141: invokevirtual   R2/a2.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   144: aload_0        
        //   145: getfield        R2/S5.g:Ljava/lang/Boolean;
        //   148: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   151: ireturn        
        //   152: astore_3       
        //   153: goto            108
        //   156: astore_3       
        //   157: goto            153
        //   160: astore_3       
        //   161: goto            153
        //   164: astore_3       
        //   165: goto            153
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                        
        //  -----  -----  -----  -----  --------------------------------------------
        //  28     45     103    108    Ljava/util/concurrent/CancellationException;
        //  28     45     95     103    Ljava/util/concurrent/ExecutionException;
        //  28     45     87     95     Ljava/lang/InterruptedException;
        //  28     45     79     87     Ljava/util/concurrent/TimeoutException;
        //  54     63     164    168    Ljava/util/concurrent/CancellationException;
        //  54     63     160    164    Ljava/util/concurrent/ExecutionException;
        //  54     63     156    160    Ljava/lang/InterruptedException;
        //  54     63     152    153    Ljava/util/concurrent/TimeoutException;
        //  68     76     164    168    Ljava/util/concurrent/CancellationException;
        //  68     76     160    164    Ljava/util/concurrent/ExecutionException;
        //  68     76     156    160    Ljava/lang/InterruptedException;
        //  68     76     152    153    Ljava/util/concurrent/TimeoutException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static boolean c0(final Context context) {
        n.i(context);
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            final ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            return receiverInfo != null && receiverInfo.enabled;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public static boolean d0(final Context context, final boolean b) {
        n.i(context);
        String s;
        if (Build$VERSION.SDK_INT >= 24) {
            s = "com.google.android.gms.measurement.AppMeasurementJobService";
        }
        else {
            s = "com.google.android.gms.measurement.AppMeasurementService";
        }
        return B0(context, s);
    }
    
    public static boolean e0(final Intent intent) {
        final String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }
    
    public static boolean f0(final Bundle bundle, final int n) {
        final int size = ((BaseBundle)bundle).size();
        int n2 = 0;
        if (size <= n) {
            return false;
        }
        for (final String s : new TreeSet<Object>(((BaseBundle)bundle).keySet())) {
            final int n3 = n2 + 1;
            if ((n2 = n3) > n) {
                bundle.remove(s);
                n2 = n3;
            }
        }
        return true;
    }
    
    public static boolean g0(final Object o) {
        return o instanceof Parcelable[] || o instanceof ArrayList || o instanceof Bundle;
    }
    
    public static boolean l0(final String s, final String anObject, final String s2, final String anObject2) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final boolean empty2 = TextUtils.isEmpty((CharSequence)anObject);
        if (!empty && !empty2) {
            n.i(s);
            return !s.equals(anObject);
        }
        if (empty && empty2) {
            if (!TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)anObject2)) {
                return !s2.equals(anObject2);
            }
            return !TextUtils.isEmpty((CharSequence)anObject2);
        }
        else {
            if (!empty && empty2) {
                return !TextUtils.isEmpty((CharSequence)anObject2) && (TextUtils.isEmpty((CharSequence)s2) || !s2.equals(anObject2));
            }
            return TextUtils.isEmpty((CharSequence)s2) || !s2.equals(anObject2);
        }
    }
    
    public static boolean m0(final String s, final String[] array) {
        n.i(array);
        for (int length = array.length, i = 0; i < length; ++i) {
            if (V5.a(s, array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static byte[] p0(final Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        final Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        }
        finally {
            obtain.recycle();
        }
    }
    
    public static ArrayList t0(final List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        final ArrayList<Bundle> list2 = new ArrayList<Bundle>(list.size());
        for (final e e : list) {
            final Bundle e2 = new Bundle();
            ((BaseBundle)e2).putString("app_id", e.o);
            ((BaseBundle)e2).putString("origin", e.p);
            ((BaseBundle)e2).putLong("creation_timestamp", e.r);
            ((BaseBundle)e2).putString("name", e.q.p);
            n3.b(e2, n.i(e.q.a()));
            ((BaseBundle)e2).putBoolean("active", e.s);
            final String t = e.t;
            if (t != null) {
                ((BaseBundle)e2).putString("trigger_event_name", t);
            }
            final I u = e.u;
            if (u != null) {
                ((BaseBundle)e2).putString("timed_out_event_name", u.o);
                final D p = u.p;
                if (p != null) {
                    e2.putBundle("timed_out_event_params", p.g());
                }
            }
            ((BaseBundle)e2).putLong("trigger_timeout", e.v);
            final I w = e.w;
            if (w != null) {
                ((BaseBundle)e2).putString("triggered_event_name", w.o);
                final D p2 = w.p;
                if (p2 != null) {
                    e2.putBundle("triggered_event_params", p2.g());
                }
            }
            ((BaseBundle)e2).putLong("triggered_timestamp", e.q.q);
            ((BaseBundle)e2).putLong("time_to_live", e.x);
            final I y = e.y;
            if (y != null) {
                ((BaseBundle)e2).putString("expired_event_name", y.o);
                final D p3 = y.p;
                if (p3 != null) {
                    e2.putBundle("expired_event_params", p3.g());
                }
            }
            list2.add(e2);
        }
        return list2;
    }
    
    public static boolean v0(final Bundle bundle, final int n) {
        if (bundle == null) {
            return false;
        }
        if (((BaseBundle)bundle).getLong("_err") == 0L) {
            ((BaseBundle)bundle).putLong("_err", (long)n);
            return true;
        }
        return false;
    }
    
    public static Bundle[] x0(final Object o) {
        if (o instanceof Bundle) {
            return new Bundle[] { (Bundle)o };
        }
        Object[] array;
        if (o instanceof Parcelable[]) {
            final Parcelable[] original = (Parcelable[])o;
            array = Arrays.copyOf(original, original.length, (Class<? extends Object[]>)Bundle[].class);
        }
        else {
            if (!(o instanceof ArrayList)) {
                return null;
            }
            final ArrayList list = (ArrayList)o;
            array = list.toArray(new Bundle[list.size()]);
        }
        return (Bundle[])array;
    }
    
    public static long y(final long n, final long n2) {
        return (n + n2 * 60000L) / 86400000L;
    }
    
    public static int y0() {
        if (Build$VERSION.SDK_INT >= 30 && E.a.a(30) > 3) {
            return E.a.a(1000000);
        }
        return 0;
    }
    
    public static long z(final D d) {
        long n = 0L;
        if (d == null) {
            return 0L;
        }
        final Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            final Object k = d.k(iterator.next());
            if (k instanceof Parcelable[]) {
                n += ((Parcelable[])k).length;
            }
        }
        return n;
    }
    
    public final long A(final Context context, final String s) {
        this.n();
        n.i(context);
        n.e(s);
        final PackageManager packageManager = context.getPackageManager();
        final MessageDigest t0 = T0();
        if (t0 == null) {
            this.j().G().a("Could not get MD5 instance");
            return -1L;
        }
        if (packageManager != null) {
            while (true) {
                try {
                    if (!this.u0(context, s)) {
                        final Signature[] signatures = G2.d.a(context).e(this.a().getPackageName(), 64).signatures;
                        if (signatures != null && signatures.length > 0) {
                            return B(t0.digest(signatures[0].toByteArray()));
                        }
                        this.j().L().a("Could not get signatures");
                        return -1L;
                    }
                    return 0L;
                    final PackageManager$NameNotFoundException ex;
                    this.j().G().b("Package name not found", ex);
                    return 0L;
                }
                catch (PackageManager$NameNotFoundException ex2) {}
                final PackageManager$NameNotFoundException ex2;
                final PackageManager$NameNotFoundException ex = ex2;
                continue;
            }
        }
        return 0L;
    }
    
    public final Object A0(final String anObject, final Object o) {
        final boolean equals = "_ldl".equals(anObject);
        final int o2 = O0(anObject);
        if (equals) {
            return this.H(o2, o, true, false);
        }
        return this.H(o2, o, false, false);
    }
    
    public final I C(final String s, final String s2, Bundle bundle, final String s3, final long n, final boolean b, final boolean b2) {
        if (TextUtils.isEmpty((CharSequence)s2)) {
            return null;
        }
        if (this.v(s2) == 0) {
            if (bundle != null) {
                bundle = new Bundle(bundle);
            }
            else {
                bundle = new Bundle();
            }
            ((BaseBundle)bundle).putString("_o", s3);
            Bundle bundle2;
            bundle = (bundle2 = this.F(s, s2, bundle, E2.f.b("_o"), true));
            if (b) {
                bundle2 = this.r0(bundle);
            }
            n.i(bundle2);
            return new I(s2, new D(bundle2), s3, n);
        }
        this.j().G().b("Invalid conditional property event name", this.h().g(s2));
        throw new IllegalArgumentException();
    }
    
    public final boolean C0(final String s, final String s2) {
        if (s2 == null) {
            this.j().H().b("Name is required and can't be null. Type", s);
            return false;
        }
        if (s2.length() == 0) {
            this.j().H().b("Name is required and can't be empty. Type", s);
            return false;
        }
        final int codePoint = s2.codePointAt(0);
        if (!Character.isLetter(codePoint)) {
            this.j().H().c("Name must start with a letter. Type, name", s, s2);
            return false;
        }
        int codePoint2;
        for (int length = s2.length(), i = Character.charCount(codePoint); i < length; i += Character.charCount(codePoint2)) {
            codePoint2 = s2.codePointAt(i);
            if (codePoint2 != 95 && !Character.isLetterOrDigit(codePoint2)) {
                this.j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", s, s2);
                return false;
            }
        }
        return true;
    }
    
    public final Bundle D(final Uri uri, final boolean b, final boolean b2) {
        if (uri == null) {
            return null;
        }
        while (true) {
            while (true) {
                Label_0692: {
                    while (true) {
                        try {
                            String queryParameter;
                            String queryParameter2;
                            String queryParameter3;
                            String queryParameter4;
                            String queryParameter6;
                            String queryParameter7;
                            String queryParameter8;
                            String s;
                            String s2;
                            if (uri.isHierarchical()) {
                                queryParameter = uri.getQueryParameter("utm_campaign");
                                queryParameter2 = uri.getQueryParameter("utm_source");
                                queryParameter3 = uri.getQueryParameter("utm_medium");
                                queryParameter4 = uri.getQueryParameter("gclid");
                                if (!b2) {
                                    break Label_0692;
                                }
                                final String queryParameter5 = uri.getQueryParameter("gbraid");
                                queryParameter6 = uri.getQueryParameter("utm_id");
                                queryParameter7 = uri.getQueryParameter("dclid");
                                queryParameter8 = uri.getQueryParameter("srsltid");
                                if (b) {
                                    final String queryParameter9 = uri.getQueryParameter("sfmc_id");
                                    s = queryParameter5;
                                    s2 = queryParameter9;
                                }
                                else {
                                    final String s3 = null;
                                    s = queryParameter5;
                                    s2 = s3;
                                }
                            }
                            else {
                                final String s4 = null;
                                final String s6;
                                final String s5 = s6 = s4;
                                final String s8;
                                final String s7 = s8 = s6;
                                queryParameter6 = (queryParameter7 = s8);
                                queryParameter8 = (s2 = queryParameter7);
                                s = s8;
                                queryParameter4 = s7;
                                queryParameter3 = s6;
                                queryParameter2 = s5;
                                queryParameter = s4;
                            }
                            if (TextUtils.isEmpty((CharSequence)queryParameter) && TextUtils.isEmpty((CharSequence)queryParameter2) && TextUtils.isEmpty((CharSequence)queryParameter3) && TextUtils.isEmpty((CharSequence)queryParameter4) && (!b2 || TextUtils.isEmpty((CharSequence)s)) && TextUtils.isEmpty((CharSequence)queryParameter6) && TextUtils.isEmpty((CharSequence)queryParameter7) && TextUtils.isEmpty((CharSequence)queryParameter8) && (!b || TextUtils.isEmpty((CharSequence)s2))) {
                                return null;
                            }
                            final Bundle bundle = new Bundle();
                            if (!TextUtils.isEmpty((CharSequence)queryParameter)) {
                                ((BaseBundle)bundle).putString("campaign", queryParameter);
                            }
                            if (!TextUtils.isEmpty((CharSequence)queryParameter2)) {
                                ((BaseBundle)bundle).putString("source", queryParameter2);
                            }
                            if (!TextUtils.isEmpty((CharSequence)queryParameter3)) {
                                ((BaseBundle)bundle).putString("medium", queryParameter3);
                            }
                            if (!TextUtils.isEmpty((CharSequence)queryParameter4)) {
                                ((BaseBundle)bundle).putString("gclid", queryParameter4);
                            }
                            if (b2 && !TextUtils.isEmpty((CharSequence)s)) {
                                ((BaseBundle)bundle).putString("gbraid", s);
                            }
                            final String queryParameter10 = uri.getQueryParameter("utm_term");
                            if (!TextUtils.isEmpty((CharSequence)queryParameter10)) {
                                ((BaseBundle)bundle).putString("term", queryParameter10);
                            }
                            final String queryParameter11 = uri.getQueryParameter("utm_content");
                            if (!TextUtils.isEmpty((CharSequence)queryParameter11)) {
                                ((BaseBundle)bundle).putString("content", queryParameter11);
                            }
                            final String queryParameter12 = uri.getQueryParameter("aclid");
                            if (!TextUtils.isEmpty((CharSequence)queryParameter12)) {
                                ((BaseBundle)bundle).putString("aclid", queryParameter12);
                            }
                            final String queryParameter13 = uri.getQueryParameter("cp1");
                            if (!TextUtils.isEmpty((CharSequence)queryParameter13)) {
                                ((BaseBundle)bundle).putString("cp1", queryParameter13);
                            }
                            final String queryParameter14 = uri.getQueryParameter("anid");
                            if (!TextUtils.isEmpty((CharSequence)queryParameter14)) {
                                ((BaseBundle)bundle).putString("anid", queryParameter14);
                            }
                            if (!TextUtils.isEmpty((CharSequence)queryParameter6)) {
                                ((BaseBundle)bundle).putString("campaign_id", queryParameter6);
                            }
                            if (!TextUtils.isEmpty((CharSequence)queryParameter7)) {
                                ((BaseBundle)bundle).putString("dclid", queryParameter7);
                            }
                            final String queryParameter15 = uri.getQueryParameter("utm_source_platform");
                            if (!TextUtils.isEmpty((CharSequence)queryParameter15)) {
                                ((BaseBundle)bundle).putString("source_platform", queryParameter15);
                            }
                            final String queryParameter16 = uri.getQueryParameter("utm_creative_format");
                            if (!TextUtils.isEmpty((CharSequence)queryParameter16)) {
                                ((BaseBundle)bundle).putString("creative_format", queryParameter16);
                            }
                            final String queryParameter17 = uri.getQueryParameter("utm_marketing_tactic");
                            if (!TextUtils.isEmpty((CharSequence)queryParameter17)) {
                                ((BaseBundle)bundle).putString("marketing_tactic", queryParameter17);
                            }
                            if (!TextUtils.isEmpty((CharSequence)queryParameter8)) {
                                ((BaseBundle)bundle).putString("srsltid", queryParameter8);
                            }
                            if (b && !TextUtils.isEmpty((CharSequence)s2)) {
                                ((BaseBundle)bundle).putString("sfmc_id", s2);
                            }
                            return bundle;
                            final UnsupportedOperationException ex;
                            this.j().L().b("Install referrer url isn't a hierarchical URI", ex);
                            return null;
                        }
                        catch (UnsupportedOperationException ex) {
                            continue;
                        }
                        break;
                    }
                }
                final String queryParameter5 = null;
                continue;
            }
        }
    }
    
    public final boolean E0(final String s) {
        this.n();
        if (G2.d.a(this.a()).a(s) == 0) {
            return true;
        }
        this.j().F().b("Permission not granted", s);
        return false;
    }
    
    public final Bundle F(final String s, final String s2, final Bundle bundle, final List list, final boolean b) {
        final boolean m0 = m0(s2, r3.d);
        if (bundle != null) {
            final Bundle bundle2 = new Bundle(bundle);
            final int e = this.f().E();
            final Iterator<String> iterator = (Iterator<String>)new TreeSet<Object>(((BaseBundle)bundle).keySet()).iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final String anObject = iterator.next();
                int m2;
                if (list != null && list.contains(anObject)) {
                    m2 = 0;
                }
                else {
                    int n2;
                    if (!b) {
                        n2 = this.N0(anObject);
                    }
                    else {
                        n2 = 0;
                    }
                    m2 = n2;
                    if (n2 == 0) {
                        m2 = this.M0(anObject);
                    }
                }
                int n3 = 0;
                Label_0307: {
                    if (m2 != 0) {
                        String s3;
                        if (m2 == 3) {
                            s3 = anObject;
                        }
                        else {
                            s3 = null;
                        }
                        O(bundle2, m2, anObject, anObject, s3);
                        bundle2.remove(anObject);
                        n3 = n;
                    }
                    else {
                        final Object value = ((BaseBundle)bundle).get(anObject);
                        final int i = e;
                        final int x = this.x(s, s2, anObject, value, bundle2, list, b, m0);
                        if (x == 17) {
                            O(bundle2, x, anObject, anObject, Boolean.FALSE);
                        }
                        else if (x != 0 && !"_ev".equals(anObject)) {
                            String s4;
                            if (x == 21) {
                                s4 = s2;
                            }
                            else {
                                s4 = anObject;
                            }
                            O(bundle2, x, s4, anObject, ((BaseBundle)bundle).get(anObject));
                            bundle2.remove(anObject);
                            n3 = n;
                            break Label_0307;
                        }
                        n3 = n;
                        if (J0(anObject)) {
                            n3 = n + 1;
                            if (n3 > i) {
                                final StringBuilder sb = new StringBuilder("Event can't contain more than ");
                                sb.append(i);
                                sb.append(" params");
                                this.j().H().c(sb.toString(), this.h().c(s2), this.h().b(bundle));
                                v0(bundle2, 5);
                                bundle2.remove(anObject);
                            }
                        }
                    }
                }
                n = n3;
            }
            return bundle2;
        }
        return null;
    }
    
    public final boolean F0(final String anObject) {
        return !TextUtils.isEmpty((CharSequence)anObject) && this.f().N().equals(anObject);
    }
    
    public final int G0() {
        if (this.h == null) {
            this.h = k.f().a(this.a()) / 1000;
        }
        return this.h;
    }
    
    public final Object H(int i, final Object obj, final boolean b, final boolean b2) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return obj;
        }
        if (obj instanceof Double) {
            return obj;
        }
        if (obj instanceof Integer) {
            return obj;
        }
        if (obj instanceof Byte) {
            return obj;
        }
        if (obj instanceof Short) {
            return obj;
        }
        if (obj instanceof Boolean) {
            long l;
            if (obj) {
                l = 1L;
            }
            else {
                l = 0L;
            }
            return l;
        }
        if (obj instanceof Float) {
            return obj;
        }
        if (obj instanceof String || obj instanceof Character || obj instanceof CharSequence) {
            return I(String.valueOf(obj), i, b);
        }
        if (b2 && (obj instanceof Bundle[] || obj instanceof Parcelable[])) {
            final ArrayList<BaseBundle> list = new ArrayList<BaseBundle>();
            final Parcelable[] array = (Parcelable[])obj;
            int length;
            Parcelable parcelable;
            Bundle r0;
            for (length = array.length, i = 0; i < length; ++i) {
                parcelable = array[i];
                if (parcelable instanceof Bundle) {
                    r0 = this.r0((Bundle)parcelable);
                    if (r0 != null && !((BaseBundle)r0).isEmpty()) {
                        list.add((BaseBundle)r0);
                    }
                }
            }
            return list.toArray(new Bundle[list.size()]);
        }
        return null;
    }
    
    public final long I0() {
        this.n();
        if (!D0(super.a.B().F())) {
            return 0L;
        }
        long n;
        if (Build$VERSION.SDK_INT < 30) {
            n = 4L;
        }
        else if (E.a.a(30) < 4) {
            n = 8L;
        }
        else if (y0() < (int)K.X.a(null)) {
            n = 16L;
        }
        else {
            n = 0L;
        }
        long n2 = n;
        if (!this.E0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            n2 = (n | 0x2L);
        }
        long n3 = n2;
        if (n2 == 0L) {
            n3 = n2;
            if (!this.X0()) {
                n3 = (n2 | 0x40L);
            }
        }
        if (n3 == 0L) {
            return 1L;
        }
        return n3;
    }
    
    public final URL J(final long l, String spec, String s, final long i, final String str) {
        while (true) {
            try {
                n.e(s);
                n.e(spec);
                final String s2 = s = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", l, this.G0()), s, spec, i);
                if (spec.equals(this.f().O())) {
                    s = s2.concat("&ddl_test=1");
                }
                spec = s;
                if (!str.isEmpty()) {
                    spec = s;
                    if (str.charAt(0) != '&') {
                        spec = s.concat("&");
                    }
                    spec = spec.concat(str);
                }
                return new URL(spec);
                final IllegalArgumentException ex;
                this.j().G().b("Failed to create BOW URL for Deferred Deep Link. exception", ex.getMessage());
                return null;
            }
            catch (IllegalArgumentException ex) {
                continue;
            }
            catch (MalformedURLException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void K(final c2 c2, final int i) {
        final Iterator<String> iterator = new TreeSet<String>(((BaseBundle)c2.d).keySet()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (J0(s)) {
                final int n2 = n + 1;
                if ((n = n2) <= i) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                this.j().H().c(sb.toString(), this.h().c(c2.a), this.h().b(c2.d));
                v0(c2.d, 5);
                c2.d.remove(s);
                n = n2;
            }
        }
    }
    
    public final boolean K0(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final List queryIntentActivities = this.a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0);
        return queryIntentActivities != null && !queryIntentActivities.isEmpty();
    }
    
    public final int M0(final String s) {
        if (!this.w0("event param", s)) {
            return 3;
        }
        if (!this.n0("event param", null, s)) {
            return 14;
        }
        if (!this.i0("event param", 40, s)) {
            return 3;
        }
        return 0;
    }
    
    public final int N0(final String s) {
        if (!this.C0("event param", s)) {
            return 3;
        }
        if (!this.n0("event param", null, s)) {
            return 14;
        }
        if (!this.i0("event param", 40, s)) {
            return 3;
        }
        return 0;
    }
    
    public final void P(final Bundle bundle, final long n) {
        final long long1 = ((BaseBundle)bundle).getLong("_et");
        if (long1 != 0L) {
            this.j().L().b("Params already contained engagement", long1);
        }
        ((BaseBundle)bundle).putLong("_et", n + long1);
    }
    
    public final long P0() {
        if (this.d.get() == 0L) {
            synchronized (this.d) {
                final long nextLong = new Random(System.nanoTime() ^ this.b().a()).nextLong();
                final int e = this.e + 1;
                this.e = e;
                final long n = e;
                // monitorexit(this.d)
                return nextLong + n;
            }
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1L, 1L);
            return this.d.getAndIncrement();
        }
    }
    
    public final void Q(final Bundle bundle, final Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (final String s : ((BaseBundle)bundle2).keySet()) {
            if (!((BaseBundle)bundle).containsKey(s)) {
                this.k().R(bundle, s, ((BaseBundle)bundle2).get(s));
            }
        }
    }
    
    public final a Q0() {
        if (this.f == null) {
            this.f = q1.a.a(this.a());
        }
        return this.f;
    }
    
    public final void R(final Bundle bundle, final String s, final Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            ((BaseBundle)bundle).putLong(s, (long)obj);
            return;
        }
        if (obj instanceof String) {
            ((BaseBundle)bundle).putString(s, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            ((BaseBundle)bundle).putDouble(s, (double)obj);
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(s, (Parcelable[])obj);
            return;
        }
        if (s != null) {
            String simpleName;
            if (obj != null) {
                simpleName = obj.getClass().getSimpleName();
            }
            else {
                simpleName = null;
            }
            this.j().M().c("Not putting event parameter. Invalid value type. name, type", this.h().f(s), simpleName);
        }
    }
    
    public final void S(final y0 y0, final int n) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("r", n);
        try {
            y0.l(bundle);
        }
        catch (RemoteException ex) {
            super.a.j().L().b("Error returning int value to wrapper", ex);
        }
    }
    
    public final String S0() {
        final byte[] array = new byte[16];
        this.U0().nextBytes(array);
        return String.format(Locale.US, "%032x", new BigInteger(1, array));
    }
    
    public final void T(final y0 y0, final long n) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("r", n);
        try {
            y0.l(bundle);
        }
        catch (RemoteException ex) {
            super.a.j().L().b("Error returning long value to wrapper", ex);
        }
    }
    
    public final void U(final y0 y0, final Bundle bundle) {
        try {
            y0.l(bundle);
        }
        catch (RemoteException ex) {
            super.a.j().L().b("Error returning bundle value to wrapper", ex);
        }
    }
    
    public final SecureRandom U0() {
        this.n();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }
    
    public final void V(final y0 y0, final String s) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("r", s);
        try {
            y0.l(bundle);
        }
        catch (RemoteException ex) {
            super.a.j().L().b("Error returning string value to wrapper", ex);
        }
    }
    
    public final boolean V0() {
        this.n();
        return this.I0() == 1L;
    }
    
    public final void W(final y0 y0, final ArrayList list) {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", list);
        try {
            y0.l(bundle);
        }
        catch (RemoteException ex) {
            super.a.j().L().b("Error returning bundle list to wrapper", ex);
        }
    }
    
    public final boolean W0() {
        try {
            this.a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    public final void X(final y0 y0, final boolean b) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putBoolean("r", b);
        try {
            y0.l(bundle);
        }
        catch (RemoteException ex) {
            super.a.j().L().b("Error returning boolean value to wrapper", ex);
        }
    }
    
    public final void Y(final y0 y0, final byte[] array) {
        final Bundle bundle = new Bundle();
        bundle.putByteArray("r", array);
        try {
            y0.l(bundle);
        }
        catch (RemoteException ex) {
            super.a.j().L().b("Error returning byte array to wrapper", ex);
        }
    }
    
    public final void Z(final String s, final String s2, final String s3, final Bundle bundle, final List list, final boolean b) {
        if (bundle == null) {
            return;
        }
        final int v = this.f().v();
        final Iterator<String> iterator = (Iterator<String>)new TreeSet<Object>(((BaseBundle)bundle).keySet()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final String s4 = iterator.next();
            int m0;
            if (list != null && list.contains(s4)) {
                m0 = 0;
            }
            else {
                int n2;
                if (!b) {
                    n2 = this.N0(s4);
                }
                else {
                    n2 = 0;
                }
                m0 = n2;
                if (n2 == 0) {
                    m0 = this.M0(s4);
                }
            }
            if (m0 != 0) {
                String s5;
                if (m0 == 3) {
                    s5 = s4;
                }
                else {
                    s5 = null;
                }
                O(bundle, m0, s4, s4, s5);
                bundle.remove(s4);
            }
            else {
                int x;
                if (g0(((BaseBundle)bundle).get(s4))) {
                    this.j().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", s2, s3, s4);
                    x = 22;
                }
                else {
                    x = this.x(s, s2, s4, ((BaseBundle)bundle).get(s4), bundle, list, b, false);
                }
                final String anObject = s4;
                if (x != 0 && !"_ev".equals(anObject)) {
                    O(bundle, x, anObject, anObject, ((BaseBundle)bundle).get(anObject));
                    bundle.remove(anObject);
                }
                else {
                    if (!J0(anObject) || m0(anObject, t3.d)) {
                        continue;
                    }
                    ++n;
                    Label_0364: {
                        a2 a2;
                        String s6;
                        String s7;
                        String s8;
                        if (!this.b0(231100000, true)) {
                            a2 = this.j().H();
                            s6 = this.h().c(s2);
                            s7 = this.h().b(bundle);
                            s8 = "Item array not supported on client's version of Google Play Services (Android Only)";
                        }
                        else {
                            if (n <= v) {
                                continue;
                            }
                            if (S6.a() && this.f().s(K.I0)) {
                                final a2 h = this.j().H();
                                final StringBuilder sb = new StringBuilder("Item can't contain more than ");
                                sb.append(v);
                                sb.append(" item-scoped custom params");
                                h.c(sb.toString(), this.h().c(s2), this.h().b(bundle));
                                v0(bundle, 28);
                                break Label_0364;
                            }
                            a2 = this.j().H();
                            s6 = this.h().c(s2);
                            s7 = this.h().b(bundle);
                            s8 = "Item cannot contain custom parameters";
                        }
                        a2.c(s8, s6, s7);
                        v0(bundle, 23);
                    }
                    bundle.remove(anObject);
                }
            }
        }
    }
    
    public final void a0(final Parcelable[] array, final int i, final boolean b) {
        n.i(array);
        for (int length = array.length, j = 0; j < length; ++j) {
            final Bundle bundle = (Bundle)array[j];
            final Iterator<Object> iterator = new TreeSet<Object>(((BaseBundle)bundle).keySet()).iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final String s = iterator.next();
                if (J0(s) && !m0(s, t3.d)) {
                    final int n2 = n + 1;
                    if ((n = n2) <= i) {
                        continue;
                    }
                    final a2 h = this.j().H();
                    int n3;
                    if (b) {
                        final StringBuilder sb = new StringBuilder("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        h.c(sb.toString(), this.h().f(s), this.h().b(bundle));
                        n3 = 28;
                    }
                    else {
                        h.c("Param cannot contain item-scoped custom parameters", this.h().f(s), this.h().b(bundle));
                        n3 = 23;
                    }
                    v0(bundle, n3);
                    bundle.remove(s);
                    n = n2;
                }
            }
        }
    }
    
    public final boolean b0(final int n, final boolean b) {
        final Boolean w = super.a.J().W();
        return this.G0() >= n / 1000 || (w != null && !w);
    }
    
    public final boolean h0(final String s, final double n) {
        try {
            final SharedPreferences$Editor edit = this.a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", s);
            edit.putLong("timestamp", Double.doubleToRawLongBits(n));
            return edit.commit();
        }
        catch (RuntimeException ex) {
            this.j().G().b("Failed to persist Deferred Deep Link. exception", ex);
            return false;
        }
    }
    
    public final boolean i0(final String s, final int i, final String s2) {
        if (s2 == null) {
            this.j().H().b("Name is required and can't be null. Type", s);
            return false;
        }
        if (s2.codePointCount(0, s2.length()) > i) {
            this.j().H().d("Name is too long. Type, maximum supported length, name", s, i, s2);
            return false;
        }
        return true;
    }
    
    public final boolean j0(final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            if (!R0(s)) {
                if (super.a.r()) {
                    this.j().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", Y1.v(s));
                }
                return false;
            }
        }
        else {
            if (TextUtils.isEmpty((CharSequence)s2)) {
                if (super.a.r()) {
                    this.j().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            }
            if (!R0(s2)) {
                this.j().H().b("Invalid admob_app_id. Analytics disabled.", Y1.v(s2));
                return false;
            }
        }
        return true;
    }
    
    public final boolean k0(final String s, final String s2, final int n, final Object obj) {
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean)) {
            if (obj instanceof Double) {
                return true;
            }
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            final String value = String.valueOf(obj);
            if (value.codePointCount(0, value.length()) > n) {
                this.j().M().d("Value is too long; discarded. Value kind, name, value length", s, s2, value.length());
                return false;
            }
        }
        return true;
    }
    
    public final boolean n0(final String s, final String[] array, final String s2) {
        return this.o0(s, array, null, s2);
    }
    
    public final boolean o0(final String s, final String[] array, final String[] array2, final String s2) {
        if (s2 == null) {
            this.j().H().b("Name is required and can't be null. Type", s);
            return false;
        }
        n.i(s2);
        final String[] i = S5.i;
        for (int length = i.length, j = 0; j < length; ++j) {
            if (s2.startsWith(i[j])) {
                this.j().H().c("Name starts with reserved prefix. Type, name", s, s2);
                return false;
            }
        }
        if (array != null && m0(s2, array) && (array2 == null || !m0(s2, array2))) {
            this.j().H().c("Name is reserved. Type, name", s, s2);
            return false;
        }
        return true;
    }
    
    public final int q0(final String s) {
        if (!this.w0("user property", s)) {
            return 6;
        }
        if (!this.n0("user property", s3.a, s)) {
            return 15;
        }
        if (!this.i0("user property", 24, s)) {
            return 6;
        }
        return 0;
    }
    
    public final Bundle r0(final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (final String s : ((BaseBundle)bundle).keySet()) {
                final Object s2 = this.s0(s, ((BaseBundle)bundle).get(s));
                if (s2 == null) {
                    this.j().M().b("Param value can't be null", this.h().f(s));
                }
                else {
                    this.R(bundle2, s, s2);
                }
            }
        }
        return bundle2;
    }
    
    @Override
    public final boolean s() {
        return true;
    }
    
    public final Object s0(final String anObject, final Object o) {
        if ("_ev".equals(anObject)) {
            return this.H(this.f().w(super.a.B().F()), o, true, true);
        }
        int n;
        if (H0(anObject)) {
            n = this.f().w(super.a.B().F());
        }
        else {
            n = this.f().t(super.a.B().F());
        }
        return this.H(n, o, false, true);
    }
    
    @Override
    public final void t() {
        this.n();
        final SecureRandom secureRandom = new SecureRandom();
        long newValue;
        if ((newValue = secureRandom.nextLong()) == 0L) {
            final long n = newValue = secureRandom.nextLong();
            if (n == 0L) {
                this.j().L().a("Utils falling back to Random for random id");
                newValue = n;
            }
        }
        this.d.set(newValue);
    }
    
    public final int u(final int n) {
        return k.f().h(this.a(), 12451000);
    }
    
    public final boolean u0(final Context context, final String s) {
        final X500Principal o = new X500Principal("CN=Android Debug,O=Android,C=US");
        while (true) {
            Label_0110: {
                try {
                    final PackageInfo e = G2.d.a(context).e(s, 64);
                    if (e == null) {
                        return true;
                    }
                    final Signature[] signatures = e.signatures;
                    if (signatures != null && signatures.length > 0) {
                        return ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatures[0].toByteArray()))).getSubjectX500Principal().equals(o);
                    }
                    return true;
                }
                catch (PackageManager$NameNotFoundException ex) {}
                catch (CertificateException ex) {
                    break Label_0110;
                }
                final a2 a2 = this.j().G();
                final String s2 = "Package name not found";
                final PackageManager$NameNotFoundException ex;
                a2.b(s2, ex);
                return true;
            }
            final a2 a2 = this.j().G();
            final String s2 = "Error obtaining certificate";
            continue;
        }
    }
    
    public final int v(final String s) {
        if (!this.w0("event", s)) {
            return 2;
        }
        if (!this.o0("event", r3.a, r3.b, s)) {
            return 13;
        }
        if (!this.i0("event", 40, s)) {
            return 2;
        }
        return 0;
    }
    
    public final int w(final String anObject, final Object o) {
        String s;
        if ("_ldl".equals(anObject)) {
            s = "user property referrer";
        }
        else {
            s = "user property";
        }
        if (this.k0(s, anObject, O0(anObject), o)) {
            return 0;
        }
        return 7;
    }
    
    public final boolean w0(final String s, final String s2) {
        if (s2 == null) {
            this.j().H().b("Name is required and can't be null. Type", s);
            return false;
        }
        if (s2.length() == 0) {
            this.j().H().b("Name is required and can't be empty. Type", s);
            return false;
        }
        final int codePoint = s2.codePointAt(0);
        if (!Character.isLetter(codePoint) && codePoint != 95) {
            this.j().H().c("Name must start with a letter or _ (underscore). Type, name", s, s2);
            return false;
        }
        int codePoint2;
        for (int length = s2.length(), i = Character.charCount(codePoint); i < length; i += Character.charCount(codePoint2)) {
            codePoint2 = s2.codePointAt(i);
            if (codePoint2 != 95 && !Character.isLetterOrDigit(codePoint2)) {
                this.j().H().c("Name must consist of letters, digits or _ (underscores). Type, name", s, s2);
                return false;
            }
        }
        return true;
    }
    
    public final int x(String s, final String s2, final String s3, Object value, final Bundle bundle, final List list, final boolean b, final boolean b2) {
        this.n();
        final boolean g0 = g0(value);
        final int n = 0;
        int n2 = 0;
        Label_0226: {
            Label_0223: {
                if (g0) {
                    if (!b2) {
                        return 21;
                    }
                    if (!m0(s3, t3.c)) {
                        return 20;
                    }
                    if (!super.a.J().d0()) {
                        return 25;
                    }
                    final boolean b3 = value instanceof Parcelable[];
                    int i;
                    if (b3) {
                        i = ((Parcelable[])value).length;
                    }
                    else {
                        if (!(value instanceof ArrayList)) {
                            break Label_0223;
                        }
                        i = ((ArrayList)value).size();
                    }
                    if (i > 200) {
                        this.j().M().d("Parameter array is too long; discarded. Value kind, name, array length", "param", s3, i);
                        if (b3) {
                            final Parcelable[] original = (Parcelable[])value;
                            if (original.length > 200) {
                                bundle.putParcelableArray(s3, (Parcelable[])Arrays.copyOf(original, 200));
                            }
                        }
                        else if (value instanceof ArrayList) {
                            final ArrayList list2 = (ArrayList)value;
                            if (list2.size() > 200) {
                                bundle.putParcelableArrayList(s3, new ArrayList(list2.subList(0, 200)));
                            }
                        }
                        n2 = 17;
                        break Label_0226;
                    }
                }
            }
            n2 = 0;
        }
        int n3;
        if (!H0(s2) && !H0(s3)) {
            n3 = this.f().t(super.a.B().F());
        }
        else {
            n3 = this.f().w(super.a.B().F());
        }
        if (this.k0("param", s3, n3, value)) {
            return n2;
        }
        if (b2) {
            if (value instanceof Bundle) {
                this.Z(s, s2, s3, (Bundle)value, list, b);
                return n2;
            }
            a2 a2 = null;
            String s4 = null;
            Label_0398: {
                if (value instanceof Parcelable[]) {
                    final Parcelable[] array = (Parcelable[])value;
                    for (int length = array.length, j = 0; j < length; ++j) {
                        final Parcelable parcelable = array[j];
                        if (!(parcelable instanceof Bundle)) {
                            a2 = this.j().M();
                            s = (String)parcelable.getClass();
                            s4 = "All Parcelable[] elements must be of type Bundle. Value type, name";
                            break Label_0398;
                        }
                        this.Z(s, s2, s3, (Bundle)parcelable, list, b);
                    }
                    return n2;
                }
                if (value instanceof ArrayList) {
                    final ArrayList list3 = (ArrayList)value;
                    for (int size = list3.size(), k = n; k < size; ++k) {
                        value = list3.get(k);
                        if (!(value instanceof Bundle)) {
                            a2 = this.j().M();
                            if (value != null) {
                                s = (String)value.getClass();
                            }
                            else {
                                s = "null";
                            }
                            s4 = "All ArrayList elements must be of type Bundle. Value type, name";
                            break Label_0398;
                        }
                        this.Z(s, s2, s3, (Bundle)value, list, b);
                    }
                    return n2;
                }
                return 4;
            }
            a2.c(s4, s, s3);
            return 4;
        }
        return 4;
    }
    
    public final long z0(final String s) {
        if (this.a().getPackageManager() == null) {
            return 0L;
        }
        final boolean b = false;
        while (true) {
            try {
                final ApplicationInfo c = G2.d.a(this.a()).c(s, 0);
                int targetSdkVersion = b ? 1 : 0;
                if (c != null) {
                    targetSdkVersion = c.targetSdkVersion;
                }
                return targetSdkVersion;
                this.j().J().b("PackageManager failed to find running app: app_id", s);
                targetSdkVersion = (b ? 1 : 0);
                return targetSdkVersion;
            }
            catch (PackageManager$NameNotFoundException ex) {}
            continue;
        }
    }
}
