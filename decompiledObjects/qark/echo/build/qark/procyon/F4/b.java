// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F4;

public abstract class b
{
    public static String a(final String s, final String s2, final String s3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", d(s, s2), s3, "perf-android-sdk", "android-ide");
    }
    
    public static String b(final String s, final String s2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", d(s, s2), "perf-android-sdk", "android-ide");
    }
    
    public static String c(final String s, final String s2, final String s3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", d(s, s2), s3, "perf-android-sdk", "android-ide");
    }
    
    public static String d(final String s, final String s2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", s, s2);
    }
}
