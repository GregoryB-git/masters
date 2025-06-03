/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package F4;

public abstract class b {
    public static String a(String string2, String string3, String string4) {
        return String.format((String)"%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", (Object[])new Object[]{b.d(string2, string3), string4, "perf-android-sdk", "android-ide"});
    }

    public static String b(String string2, String string3) {
        return String.format((String)"%s/trends?utm_source=%s&utm_medium=%s", (Object[])new Object[]{b.d(string2, string3), "perf-android-sdk", "android-ide"});
    }

    public static String c(String string2, String string3, String string4) {
        return String.format((String)"%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", (Object[])new Object[]{b.d(string2, string3), string4, "perf-android-sdk", "android-ide"});
    }

    public static String d(String string2, String string3) {
        return String.format((String)"%s/project/%s/performance/app/android:%s", (Object[])new Object[]{"https://console.firebase.google.com", string2, string3});
    }
}

