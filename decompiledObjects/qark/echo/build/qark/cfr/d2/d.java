/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TimeZone
 *  java.util.zip.GZIPInputStream
 */
package d2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import d2.c;
import e2.a;
import e2.j;
import e2.k;
import e2.l;
import e2.m;
import e2.o;
import e2.p;
import f2.h;
import f2.i;
import g2.f;
import g2.g;
import g2.m;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;

public final class d
implements m {
    public final j4.a a = j.b();
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final p2.a e;
    public final p2.a f;
    public final int g;

    public d(Context context, p2.a a8, p2.a a9) {
        this(context, a8, a9, 130000);
    }

    public d(Context context, p2.a a8, p2.a a9, int n8) {
        this.c = context;
        this.b = (ConnectivityManager)context.getSystemService("connectivity");
        this.d = d.n(d2.a.c);
        this.e = a9;
        this.f = a8;
        this.g = n8;
    }

    public static /* synthetic */ b c(d d8, a a8) {
        return d8.e(a8);
    }

    public static /* synthetic */ a d(a a8, b b8) {
        return d.l(a8, b8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int f(NetworkInfo object) {
        if (object == null) {
            object = o.b.p;
            do {
                return object.e();
                break;
            } while (true);
        }
        int n8 = object.getSubtype();
        if (n8 == -1) {
            object = o.b.J;
            return object.e();
        }
        if (o.b.c(n8) == null) return 0;
        return n8;
    }

    public static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.H.e();
        }
        return networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            int n8 = context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)0).versionCode;
            return n8;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            j2.a.d("CctTransportBackend", "Unable to find version code for package", (Throwable)nameNotFoundException);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager)context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a l(a a8, b b8) {
        URL uRL = b8.b;
        if (uRL != null) {
            j2.a.b("CctTransportBackend", "Following redirect to: %s", (Object)uRL);
            return a8.a(b8.b);
        }
        return null;
    }

    public static InputStream m(InputStream inputStream, String string2) {
        if ("gzip".equals((Object)string2)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    public static URL n(String string2) {
        try {
            URL uRL = new URL(string2);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid url: ");
            stringBuilder.append(string2);
            throw new IllegalArgumentException(stringBuilder.toString(), (Throwable)malformedURLException);
        }
    }

    @Override
    public i a(i i8) {
        NetworkInfo networkInfo = this.b.getActiveNetworkInfo();
        return i8.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", d.k()).a("net-type", d.g(networkInfo)).a("mobile-subtype", d.f(networkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", d.j(this.c).getSimOperator()).c("application_build", Integer.toString((int)d.h(this.c))).d();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public g b(f object) {
        IOException iOException222;
        int n8;
        block10 : {
            Object object2;
            URL uRL;
            j j8;
            block9 : {
                j8 = this.i((f)object);
                URL uRL2 = this.d;
                Object object3 = object.c();
                object2 = null;
                Object var6_8 = null;
                uRL = uRL2;
                if (object3 != null) {
                    object3 = d2.a.c(object.c());
                    object = var6_8;
                    if (object3.e() != null) {
                        object = object3.e();
                    }
                    uRL = uRL2;
                    object2 = object;
                    if (object3.f() == null) break block9;
                    uRL = d.n(object3.f());
                    object2 = object;
                }
            }
            try {
                object = (b)k2.b.a(5, new a(uRL, j8, (String)object2), new d2.b(this), new c());
                n8 = object.a;
                if (n8 == 200) {
                    return g.e(object.c);
                }
                break block10;
            }
            catch (IOException iOException222) {}
            catch (IllegalArgumentException illegalArgumentException) {
                return g.a();
            }
        }
        if (n8 >= 500) return g.f();
        if (n8 == 404) return g.f();
        if (n8 != 400) return g.a();
        return g.d();
        j2.a.d("CctTransportBackend", "Could not make request to the backend", (Throwable)iOException222);
        return g.f();
    }

    /*
     * Exception decompiling
     */
    public final b e(a var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j i(f object) {
        Object object2;
        i i82;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        for (i i82 : object.b()) {
            object2 = i82.j();
            if (!hashMap.containsKey(object2)) {
                arrayList = new ArrayList();
                arrayList.add((Object)i82);
                hashMap.put(object2, (Object)arrayList);
                continue;
            }
            ((List)hashMap.get(object2)).add((Object)i82);
        }
        i82 = new ArrayList();
        hashMap = hashMap.entrySet().iterator();
        do {
            block11 : {
                if (!hashMap.hasNext()) {
                    return j.a((List)i82);
                }
                object = (Map.Entry)hashMap.next();
                object2 = (i)((List)object.getValue()).get(0);
                object2 = e2.m.a().f(p.p).g(this.f.a()).h(this.e.a()).b(k.a().c(k.b.q).b(e2.a.a().m(object2.g("sdk-version")).j(object2.b("model")).f(object2.b("hardware")).d(object2.b("device")).l(object2.b("product")).k(object2.b("os-uild")).h(object2.b("manufacturer")).e(object2.b("fingerprint")).c(object2.b("country")).g(object2.b("locale")).i(object2.b("mcc_mnc")).b(object2.b("application_build")).a()).a());
                try {
                    object2.i(Integer.parseInt((String)((String)object.getKey())));
                    break block11;
                }
                catch (NumberFormatException numberFormatException) {}
                object2.j((String)object.getKey());
            }
            arrayList = new ArrayList();
            for (i i9 : (List)object.getValue()) {
                c2.b b8;
                block14 : {
                    block13 : {
                        block12 : {
                            object = i9.e();
                            b8 = object.b();
                            if (!b8.equals(c2.b.b("proto"))) break block12;
                            object = l.j(object.a());
                            break block13;
                        }
                        if (!b8.equals(c2.b.b("json"))) break block14;
                        object = l.i(new String(object.a(), Charset.forName((String)"UTF-8")));
                    }
                    object.c(i9.f()).d(i9.k()).h(i9.h("tz-offset")).e(o.a().c(o.c.c(i9.g("net-type"))).b(o.b.c(i9.g("mobile-subtype"))).a());
                    if (i9.d() != null) {
                        object.b(i9.d());
                    }
                    arrayList.add((Object)object.a());
                    continue;
                }
                j2.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b8);
            }
            object2.c((List)arrayList);
            i82.add((Object)object2.a());
        } while (true);
    }

    public static final class a {
        public final URL a;
        public final j b;
        public final String c;

        public a(URL uRL, j j8, String string2) {
            this.a = uRL;
            this.b = j8;
            this.c = string2;
        }

        public a a(URL uRL) {
            return new a(uRL, this.b, this.c);
        }
    }

    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int n8, URL uRL, long l8) {
            this.a = n8;
            this.b = uRL;
            this.c = l8;
        }
    }

}

