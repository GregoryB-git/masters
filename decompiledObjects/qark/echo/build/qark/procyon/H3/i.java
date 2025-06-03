// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import android.os.Build;
import android.os.Debug;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.content.SharedPreferences;
import android.content.res.Resources$NotFoundException;
import android.hardware.SensorManager;
import android.content.res.Resources;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Locale;
import java.util.ArrayList;
import java.io.IOException;
import E3.f;
import java.io.Closeable;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.os.StatFs;
import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.content.Context;
import java.util.Scanner;
import java.io.InputStream;

public abstract class i
{
    public static final char[] a;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
    
    public static String A(final String s) {
        return s(s, "SHA-1");
    }
    
    public static String B(final InputStream source) {
        final Scanner useDelimiter = new Scanner(source).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }
    
    public static long a(final Context context) {
        final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo);
        return activityManager$MemoryInfo.availMem;
    }
    
    public static long b(final Context context) {
        synchronized (i.class) {
            final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo);
            return activityManager$MemoryInfo.totalMem;
        }
    }
    
    public static long c(final String s) {
        final StatFs statFs = new StatFs(s);
        final long n = statFs.getBlockSize();
        return statFs.getBlockCount() * n - n * statFs.getAvailableBlocks();
    }
    
    public static boolean d(final Context context) {
        final boolean e = e(context, "android.permission.ACCESS_NETWORK_STATE");
        boolean b = true;
        if (e) {
            final NetworkInfo activeNetworkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    public static boolean e(final Context context, final String s) {
        return context.checkCallingOrSelfPermission(s) == 0;
    }
    
    public static void f(final Closeable closeable, final String s) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (IOException ex) {
                f.f().e(s, ex);
            }
        }
    }
    
    public static void g(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0014;
        }
        try {
            closeable.close();
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {}
    }
    
    public static String h(final String... array) {
        String a = null;
        if (array != null) {
            if (array.length == 0) {
                return null;
            }
            final ArrayList<String> list = (ArrayList<String>)new ArrayList<Comparable>();
            for (int length = array.length, i = 0; i < length; ++i) {
                final String s = array[i];
                if (s != null) {
                    list.add(s.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort((List<Comparable>)list);
            final StringBuilder sb = new StringBuilder();
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                sb.append(iterator.next());
            }
            final String string = sb.toString();
            a = a;
            if (string.length() > 0) {
                a = A(string);
            }
        }
        return a;
    }
    
    public static ActivityManager$RunningAppProcessInfo i(final String anObject, final Context context) {
        final List runningAppProcesses = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo : runningAppProcesses) {
                if (activityManager$RunningAppProcessInfo.processName.equals(anObject)) {
                    return activityManager$RunningAppProcessInfo;
                }
            }
        }
        return null;
    }
    
    public static boolean j(final Context context, final String s, final boolean b) {
        if (context != null) {
            final Resources resources = context.getResources();
            if (resources != null) {
                final int q = q(context, s, "bool");
                if (q > 0) {
                    return resources.getBoolean(q);
                }
                final int q2 = q(context, s, "string");
                if (q2 > 0) {
                    return Boolean.parseBoolean(context.getString(q2));
                }
            }
        }
        return b;
    }
    
    public static List k(final Context context) {
        int i = 0;
        final ArrayList<H3.f> list = new ArrayList<H3.f>();
        final int q = q(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        final int q2 = q(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        final int q3 = q(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (q == 0 || q2 == 0 || q3 == 0) {
            f.f().b(String.format("Could not find resources: %d %d %d", q, q2, q3));
            return list;
        }
        final String[] stringArray = context.getResources().getStringArray(q);
        final String[] stringArray2 = context.getResources().getStringArray(q2);
        final String[] stringArray3 = context.getResources().getStringArray(q3);
        if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
            while (i < stringArray3.length) {
                list.add(new H3.f(stringArray[i], stringArray2[i], stringArray3[i]));
                ++i;
            }
            return list;
        }
        f.f().b(String.format("Lengths did not match: %d %d %d", stringArray.length, stringArray2.length, stringArray3.length));
        return list;
    }
    
    public static int l() {
        return i.a.c().ordinal();
    }
    
    public static int m() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static String n(final Context context) {
        int n;
        if ((n = q(context, "com.google.firebase.crashlytics.mapping_file_id", "string")) == 0) {
            n = q(context, "com.crashlytics.android.build_id", "string");
        }
        if (n != 0) {
            return context.getResources().getString(n);
        }
        return null;
    }
    
    public static boolean o(final Context context) {
        final boolean x = x();
        boolean b = false;
        if (x) {
            return false;
        }
        if (((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            b = true;
        }
        return b;
    }
    
    public static String p(final Context context) {
        final int icon = context.getApplicationContext().getApplicationInfo().icon;
        Label_0043: {
            if (icon <= 0) {
                break Label_0043;
            }
            try {
                String s;
                if ("android".equals(s = context.getResources().getResourcePackageName(icon))) {
                    return context.getPackageName();
                }
                return s;
                s = context.getPackageName();
                return s;
            }
            catch (Resources$NotFoundException ex) {
                return context.getPackageName();
            }
        }
    }
    
    public static int q(final Context context, final String s, final String s2) {
        return context.getResources().getIdentifier(s, s2, p(context));
    }
    
    public static SharedPreferences r(final Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }
    
    public static String s(final String s, final String s2) {
        return t(s.getBytes(), s2);
    }
    
    public static String t(final byte[] input, final String s) {
        try {
            final MessageDigest instance = MessageDigest.getInstance(s);
            instance.update(input);
            return u(instance.digest());
        }
        catch (NoSuchAlgorithmException ex) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not create hashing algorithm: ");
            sb.append(s);
            sb.append(", returning empty string.");
            f.e(sb.toString(), ex);
            return "";
        }
    }
    
    public static String u(final byte[] array) {
        final char[] value = new char[array.length * 2];
        for (int i = 0; i < array.length; ++i) {
            final byte b = array[i];
            final int n = i * 2;
            final char[] a = i.a;
            value[n] = a[(b & 0xFF) >>> 4];
            value[n + 1] = a[b & 0xF];
        }
        return new String(value);
    }
    
    public static boolean v(final Context context) {
        return (context.getApplicationInfo().flags & 0x2) != 0x0;
    }
    
    public static boolean w() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }
    
    public static boolean x() {
        if (!Build.PRODUCT.contains("sdk")) {
            final String hardware = Build.HARDWARE;
            if (!hardware.contains("goldfish")) {
                if (!hardware.contains("ranchu")) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean y() {
        final boolean x = x();
        final String tags = Build.TAGS;
        if (!x && tags != null && tags.contains("test-keys")) {
            return true;
        }
        if (new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        final File file = new File("/system/xbin/su");
        return !x && file.exists();
    }
    
    public static boolean z(final String s, final String anObject) {
        if (s == null) {
            return anObject == null;
        }
        return s.equals(anObject);
    }
    
    public enum a
    {
        o("X86_32", 0), 
        p("X86_64", 1), 
        q("ARM_UNKNOWN", 2), 
        r("PPC", 3), 
        s("PPC64", 4), 
        t("ARMV6", 5), 
        u("ARMV7", 6), 
        v("UNKNOWN", 7), 
        w("ARMV7S", 8), 
        x("ARM64", 9);
        
        public static final Map y;
        
        static {
            final HashMap<String, a> y2 = new HashMap<String, a>(4);
            final a a7;
            (y = y2).put("armeabi-v7a", a7);
            final a a6;
            y2.put("armeabi", a6);
            final a a10;
            y2.put("arm64-v8a", a10);
            final a a;
            y2.put("x86", a);
        }
        
        public a(final String name, final int ordinal) {
        }
        
        public static a c() {
            final String cpu_ABI = Build.CPU_ABI;
            if (TextUtils.isEmpty((CharSequence)cpu_ABI)) {
                f.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return a.v;
            }
            a v;
            if ((v = a.y.get(cpu_ABI.toLowerCase(Locale.US))) == null) {
                v = a.v;
            }
            return v;
        }
    }
}
