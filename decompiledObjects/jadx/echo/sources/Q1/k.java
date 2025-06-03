package Q1;

import O1.P;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import kotlin.text.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.F;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f4344a = new k();

    public static final boolean d(String str) {
        File f7 = f();
        if (f7 == null || str == null) {
            return false;
        }
        return new File(f7, str).delete();
    }

    public static final String e(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    public static final File f() {
        File file = new File(C2146B.l().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static final String g(Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i7 = 0;
        while (i7 < length) {
            StackTraceElement stackTraceElement = stackTrace[i7];
            i7++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String h(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i7 = 0;
            while (i7 < length) {
                StackTraceElement stackTraceElement = stackTrace[i7];
                i7++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean i(StackTraceElement element) {
        boolean s7;
        boolean s8;
        Intrinsics.checkNotNullParameter(element, "element");
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        s7 = r.s(className, "com.facebook", false, 2, null);
        if (!s7) {
            String className2 = element.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "element.className");
            s8 = r.s(className2, "com.meta", false, 2, null);
            if (!s8) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i7 = 0;
            while (i7 < length) {
                StackTraceElement element = stackTrace[i7];
                i7++;
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (i(element)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean k(Thread thread) {
        StackTraceElement[] stackTrace;
        boolean s7;
        boolean s8;
        boolean s9;
        boolean s10;
        boolean s11;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement element : stackTrace) {
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (i(element)) {
                    String className = element.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    s7 = r.s(className, "com.facebook.appevents.codeless", false, 2, null);
                    if (!s7) {
                        String className2 = element.getClassName();
                        Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                        s11 = r.s(className2, "com.facebook.appevents.suggestedevents", false, 2, null);
                        if (!s11) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                    s8 = r.s(methodName, "onClick", false, 2, null);
                    if (s8) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                        s9 = r.s(methodName2, "onItemClick", false, 2, null);
                        if (s9) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                            s10 = r.s(methodName3, "onTouch", false, 2, null);
                            if (!s10) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final File[] l() {
        File f7 = f();
        if (f7 == null) {
            return new File[0];
        }
        File[] listFiles = f7.listFiles(new FilenameFilter() { // from class: Q1.i
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean m7;
                m7 = k.m(file, str);
                return m7;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    public static final boolean m(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        x xVar = x.f16233a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).b(name);
    }

    public static final File[] n() {
        File f7 = f();
        if (f7 == null) {
            return new File[0];
        }
        File[] listFiles = f7.listFiles(new FilenameFilter() { // from class: Q1.j
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean o7;
                o7 = k.o(file, str);
                return o7;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    public static final boolean o(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        x xVar = x.f16233a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).b(name);
    }

    public static final File[] p() {
        File f7 = f();
        if (f7 == null) {
            return new File[0];
        }
        File[] listFiles = f7.listFiles(new FilenameFilter() { // from class: Q1.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean q7;
                q7 = k.q(file, str);
                return q7;
            }
        });
        return listFiles == null ? new File[0] : listFiles;
    }

    public static final boolean q(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        x xVar = x.f16233a;
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).b(name);
    }

    public static final JSONObject r(String str, boolean z7) {
        File f7 = f();
        if (f7 != null && str != null) {
            try {
                return new JSONObject(P.s0(new FileInputStream(new File(f7, str))));
            } catch (Exception unused) {
                if (z7) {
                    d(str);
                }
            }
        }
        return null;
    }

    public static final void s(String str, JSONArray reports, F.b bVar) {
        Intrinsics.checkNotNullParameter(reports, "reports");
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, reports.toString());
            JSONObject C7 = P.C();
            if (C7 != null) {
                Iterator<String> keys = C7.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, C7.get(next));
                }
            }
            F.c cVar = F.f20890n;
            x xVar = x.f16233a;
            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C2146B.m()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            cVar.A(null, format, jSONObject, bVar).l();
        } catch (JSONException unused) {
        }
    }

    public static final void t(String str, String str2) {
        File f7 = f();
        if (f7 == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(f7, str));
            byte[] bytes = str2.getBytes(kotlin.text.b.f16240b);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
