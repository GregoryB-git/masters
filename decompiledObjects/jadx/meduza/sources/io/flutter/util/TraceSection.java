package io.flutter.util;

import android.os.Build;
import android.os.Trace;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import z1.a;

/* loaded from: classes.dex */
public final class TraceSection implements AutoCloseable {
    private TraceSection(String str) {
        begin(str);
    }

    public static void begin(String str) {
        Trace.beginSection(a.c(cropSectionName(str)));
    }

    public static void beginAsyncSection(String str, int i10) {
        String cropSectionName = cropSectionName(str);
        int i11 = Build.VERSION.SDK_INT;
        String c10 = a.c(cropSectionName);
        if (i11 >= 29) {
            Trace.beginAsyncSection(c10, i10);
            return;
        }
        try {
            if (a.f17478c == null) {
                a.f17478c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            a.f17478c.invoke(null, Long.valueOf(a.f17476a), c10, Integer.valueOf(i10));
        } catch (Exception e10) {
            a.a("asyncTraceBegin", e10);
        }
    }

    private static String cropSectionName(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, R.styleable.AppCompatTheme_windowMinWidthMajor) + "...";
    }

    public static void end() {
        Trace.endSection();
    }

    public static void endAsyncSection(String str, int i10) {
        String cropSectionName = cropSectionName(str);
        int i11 = Build.VERSION.SDK_INT;
        String c10 = a.c(cropSectionName);
        if (i11 >= 29) {
            Trace.endAsyncSection(c10, i10);
            return;
        }
        try {
            if (a.f17479d == null) {
                a.f17479d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            a.f17479d.invoke(null, Long.valueOf(a.f17476a), c10, Integer.valueOf(i10));
        } catch (Exception e10) {
            a.a("asyncTraceEnd", e10);
        }
    }

    public static TraceSection scoped(String str) {
        return new TraceSection(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end();
    }
}
