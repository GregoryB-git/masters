/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.pm.ApplicationInfo
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.hardware.Sensor
 *  android.hardware.SensorManager
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Debug
 *  android.os.StatFs
 *  android.text.TextUtils
 *  java.io.Closeable
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Scanner
 */
package H3;

import H3.f;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public abstract class i {
    public static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String A(String string2) {
        return i.s(string2, "SHA-1");
    }

    public static String B(InputStream inputStream) {
        if ((inputStream = new Scanner(inputStream).useDelimiter("\\A")).hasNext()) {
            return inputStream.next();
        }
        return "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long b(Context context) {
        synchronized (i.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            long l8 = memoryInfo.totalMem;
            return l8;
        }
    }

    public static long c(String string2) {
        string2 = new StatFs(string2);
        long l8 = string2.getBlockSize();
        return (long)string2.getBlockCount() * l8 - l8 * (long)string2.getAvailableBlocks();
    }

    public static boolean d(Context context) {
        boolean bl = i.e(context, "android.permission.ACCESS_NETWORK_STATE");
        boolean bl2 = true;
        if (bl) {
            if ((context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && context.isConnectedOrConnecting()) {
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static boolean e(Context context, String string2) {
        if (context.checkCallingOrSelfPermission(string2) == 0) {
            return true;
        }
        return false;
    }

    public static void f(Closeable closeable, String string2) {
        if (closeable != null) {
            try {
                closeable.close();
                return;
            }
            catch (IOException iOException) {
                E3.f.f().e(string2, (Throwable)iOException);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void g(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static /* varargs */ String h(String ... object) {
        ArrayList arrayList = null;
        Object object2 = arrayList;
        if (object != null) {
            if (object.length == 0) {
                return null;
            }
            object2 = new ArrayList();
            for (String string2 : object) {
                if (string2 == null) continue;
                object2.add((Object)string2.replace((CharSequence)"-", (CharSequence)"").toLowerCase(Locale.US));
            }
            Collections.sort((List)object2);
            object = new StringBuilder();
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object.append((String)object2.next());
            }
            object = object.toString();
            object2 = arrayList;
            if (object.length() > 0) {
                object2 = i.A((String)object);
            }
        }
        return object2;
    }

    public static ActivityManager.RunningAppProcessInfo i(String string2, Context context) {
        if ((context = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : context) {
                if (!runningAppProcessInfo.processName.equals((Object)string2)) continue;
                return runningAppProcessInfo;
            }
        }
        return null;
    }

    public static boolean j(Context context, String string2, boolean bl) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int n8 = i.q(context, string2, "bool");
            if (n8 > 0) {
                return resources.getBoolean(n8);
            }
            n8 = i.q(context, string2, "string");
            if (n8 > 0) {
                return Boolean.parseBoolean((String)context.getString(n8));
            }
        }
        return bl;
    }

    public static List k(Context arrstring) {
        ArrayList arrayList = new ArrayList();
        int n8 = i.q((Context)arrstring, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int n9 = i.q((Context)arrstring, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int n10 = i.q((Context)arrstring, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (n8 != 0 && n9 != 0 && n10 != 0) {
            String[] arrstring2 = arrstring.getResources().getStringArray(n8);
            String[] arrstring3 = arrstring.getResources().getStringArray(n9);
            if (arrstring2.length == (arrstring = arrstring.getResources().getStringArray(n10)).length && arrstring3.length == arrstring.length) {
                for (int i8 = 0; i8 < arrstring.length; ++i8) {
                    arrayList.add((Object)new f(arrstring2[i8], arrstring3[i8], arrstring[i8]));
                }
                return arrayList;
            }
            E3.f.f().b(String.format((String)"Lengths did not match: %d %d %d", (Object[])new Object[]{arrstring2.length, arrstring3.length, arrstring.length}));
            return arrayList;
        }
        E3.f.f().b(String.format((String)"Could not find resources: %d %d %d", (Object[])new Object[]{n8, n9, n10}));
        return arrayList;
    }

    public static int l() {
        return a.c().ordinal();
    }

    public static int m() {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static String n(Context context) {
        int n8;
        int n9 = n8 = i.q(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (n8 == 0) {
            n9 = i.q(context, "com.crashlytics.android.build_id", "string");
        }
        if (n9 != 0) {
            return context.getResources().getString(n9);
        }
        return null;
    }

    public static boolean o(Context context) {
        boolean bl = i.x();
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        if (((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String p(Context context) {
        String string2;
        String string3;
        int n8 = context.getApplicationContext().getApplicationInfo().icon;
        if (n8 <= 0) return context.getPackageName();
        try {
            string3 = string2 = context.getResources().getResourcePackageName(n8);
        }
        catch (Resources.NotFoundException notFoundException) {
            return context.getPackageName();
        }
        if (!"android".equals((Object)string2)) return string3;
        return context.getPackageName();
    }

    public static int q(Context context, String string2, String string3) {
        return context.getResources().getIdentifier(string2, string3, i.p(context));
    }

    public static SharedPreferences r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String s(String string2, String string3) {
        return i.t(string2.getBytes(), string3);
    }

    public static String t(byte[] arrby, String string2) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance((String)string2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            E3.f f8 = E3.f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create hashing algorithm: ");
            stringBuilder.append(string2);
            stringBuilder.append(", returning empty string.");
            f8.e(stringBuilder.toString(), (Throwable)noSuchAlgorithmException);
            return "";
        }
        messageDigest.update(arrby);
        return i.u(messageDigest.digest());
    }

    public static String u(byte[] arrby) {
        char[] arrc = new char[arrby.length * 2];
        for (int i8 = 0; i8 < arrby.length; ++i8) {
            byte by = arrby[i8];
            int n8 = i8 * 2;
            char[] arrc2 = a;
            arrc[n8] = arrc2[(by & 255) >>> 4];
            arrc[n8 + 1] = arrc2[by & 15];
        }
        return new String(arrc);
    }

    public static boolean v(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean w() {
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return false;
        }
        return true;
    }

    public static boolean x() {
        String string2;
        if (!(Build.PRODUCT.contains((CharSequence)"sdk") || (string2 = Build.HARDWARE).contains((CharSequence)"goldfish") || string2.contains((CharSequence)"ranchu"))) {
            return false;
        }
        return true;
    }

    public static boolean y() {
        boolean bl = i.x();
        String string2 = Build.TAGS;
        if (!bl && string2 != null && string2.contains((CharSequence)"test-keys")) {
            return true;
        }
        if (new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        string2 = new File("/system/xbin/su");
        if (!bl && string2.exists()) {
            return true;
        }
        return false;
    }

    public static boolean z(String string2, String string3) {
        if (string2 == null) {
            if (string3 == null) {
                return true;
            }
            return false;
        }
        return string2.equals((Object)string3);
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* enum */ a r;
        public static final /* enum */ a s;
        public static final /* enum */ a t;
        public static final /* enum */ a u;
        public static final /* enum */ a v;
        public static final /* enum */ a w;
        public static final /* enum */ a x;
        public static final Map y;
        public static final /* synthetic */ a[] z;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            a a14;
            a a15;
            a a16;
            a a17;
            o = a11 = new a();
            p = a13 = new a();
            q = a17 = new a();
            r = a16 = new a();
            s = a15 = new a();
            t = a10 = new a();
            u = a14 = new a();
            v = a9 = new a();
            w = a8 = new a();
            x = a12 = new a();
            z = new a[]{a11, a13, a17, a16, a15, a10, a14, a9, a8, a12};
            a13 = new HashMap(4);
            y = a13;
            a13.put((Object)"armeabi-v7a", (Object)a14);
            a13.put((Object)"armeabi", (Object)a10);
            a13.put((Object)"arm64-v8a", (Object)a12);
            a13.put((Object)"x86", (Object)a11);
        }

        public static a c() {
            Object object = Build.CPU_ABI;
            if (TextUtils.isEmpty((CharSequence)object)) {
                E3.f.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return v;
            }
            object = object.toLowerCase(Locale.US);
            a a8 = (a)((Object)y.get(object));
            object = a8;
            if (a8 == null) {
                object = v;
            }
            return object;
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])z.clone();
        }
    }

}

