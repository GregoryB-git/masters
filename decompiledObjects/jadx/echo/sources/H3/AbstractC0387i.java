package H3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
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

/* renamed from: H3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0387i {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2265a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: H3.i$a */
    public enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* renamed from: y, reason: collision with root package name */
        public static final Map f2276y;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap hashMap = new HashMap(4);
            f2276y = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        public static a c() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                E3.f.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = (a) f2276y.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    public static String A(String str) {
        return s(str, "SHA-1");
    }

    public static String B(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(Context context) {
        long j7;
        synchronized (AbstractC0387i.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j7 = memoryInfo.totalMem;
        }
        return j7;
    }

    public static long c(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    public static boolean d(Context context) {
        if (!e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e7) {
                E3.f.f().e(str, e7);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return A(sb2);
        }
        return null;
    }

    public static ActivityManager.RunningAppProcessInfo i(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static boolean j(Context context, String str, boolean z7) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int q7 = q(context, str, "bool");
            if (q7 > 0) {
                return resources.getBoolean(q7);
            }
            int q8 = q(context, str, "string");
            if (q8 > 0) {
                return Boolean.parseBoolean(context.getString(q8));
            }
        }
        return z7;
    }

    public static List k(Context context) {
        ArrayList arrayList = new ArrayList();
        int q7 = q(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int q8 = q(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int q9 = q(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (q7 == 0 || q8 == 0 || q9 == 0) {
            E3.f.f().b(String.format("Could not find resources: %d %d %d", Integer.valueOf(q7), Integer.valueOf(q8), Integer.valueOf(q9)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(q7);
        String[] stringArray2 = context.getResources().getStringArray(q8);
        String[] stringArray3 = context.getResources().getStringArray(q9);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            E3.f.f().b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i7 = 0; i7 < stringArray3.length; i7++) {
            arrayList.add(new C0384f(stringArray[i7], stringArray2[i7], stringArray3[i7]));
        }
        return arrayList;
    }

    public static int l() {
        return a.c().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int m() {
        boolean x7 = x();
        ?? r02 = x7;
        if (y()) {
            r02 = (x7 ? 1 : 0) | 2;
        }
        return w() ? r02 | 4 : r02;
    }

    public static String n(Context context) {
        int q7 = q(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (q7 == 0) {
            q7 = q(context, "com.crashlytics.android.build_id", "string");
        }
        if (q7 != 0) {
            return context.getResources().getString(q7);
        }
        return null;
    }

    public static boolean o(Context context) {
        return (x() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static String p(Context context) {
        int i7 = context.getApplicationContext().getApplicationInfo().icon;
        if (i7 > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i7);
                return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    public static int q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, p(context));
    }

    public static SharedPreferences r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String s(String str, String str2) {
        return t(str.getBytes(), str2);
    }

    public static String t(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return u(messageDigest.digest());
        } catch (NoSuchAlgorithmException e7) {
            E3.f.f().e("Could not create hashing algorithm: " + str + ", returning empty string.", e7);
            return "";
        }
    }

    public static String u(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            int i8 = i7 * 2;
            char[] cArr2 = f2265a;
            cArr[i8] = cArr2[(b7 & 255) >>> 4];
            cArr[i8 + 1] = cArr2[b7 & 15];
        }
        return new String(cArr);
    }

    public static boolean v(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean w() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean x() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean y() {
        boolean x7 = x();
        String str = Build.TAGS;
        if ((x7 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !x7 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean z(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }
}
