// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q1;

import kotlin.text.b;
import java.io.FileOutputStream;
import java.util.Iterator;
import org.json.JSONException;
import x1.a;
import x1.F;
import java.io.InputStream;
import O1.P;
import java.io.FileInputStream;
import org.json.JSONObject;
import kotlin.text.Regex;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import java.io.FilenameFilter;
import kotlin.text.i;
import org.json.JSONArray;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import java.io.File;

public final class k
{
    public static final k a;
    
    static {
        a = new k();
    }
    
    public static final boolean d(final String child) {
        final File f = f();
        return f != null && child != null && new File(f, child).delete();
    }
    
    public static final String e(final Throwable t) {
        if (t == null) {
            return null;
        }
        if (t.getCause() == null) {
            return t.toString();
        }
        return String.valueOf(t.getCause());
    }
    
    public static final File f() {
        File file2;
        final File file = file2 = new File(B.l().getCacheDir(), "instrument");
        if (!file.exists()) {
            if (file.mkdirs()) {
                return file;
            }
            file2 = null;
        }
        return file2;
    }
    
    public static final String g(final Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        final StackTraceElement[] stackTrace = thread.getStackTrace();
        final JSONArray jsonArray = new JSONArray();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        final int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            final StackTraceElement stackTraceElement = stackTrace[i];
            ++i;
            jsonArray.put((Object)stackTraceElement.toString());
        }
        return jsonArray.toString();
    }
    
    public static final String h(Throwable t) {
        Throwable t2 = null;
        if (t == null) {
            return null;
        }
        final JSONArray jsonArray = new JSONArray();
        while (t != null && t != t2) {
            final StackTraceElement[] stackTrace = t.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            final int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                final StackTraceElement stackTraceElement = stackTrace[i];
                ++i;
                jsonArray.put((Object)stackTraceElement.toString());
            }
            final Throwable cause = t.getCause();
            t2 = t;
            t = cause;
        }
        return jsonArray.toString();
    }
    
    public static final boolean i(final StackTraceElement stackTraceElement) {
        Intrinsics.checkNotNullParameter(stackTraceElement, "element");
        final String className = stackTraceElement.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "element.className");
        boolean b = false;
        if (!i.s(className, "com.facebook", false, 2, null)) {
            final String className2 = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "element.className");
            if (!i.s(className2, "com.meta", false, 2, null)) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public static final boolean j(Throwable t) {
        if (t == null) {
            return false;
        }
        Throwable cause;
        for (Throwable t2 = null; t != null && t != t2; t2 = t, t = cause) {
            final StackTraceElement[] stackTrace = t.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
            final int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                final StackTraceElement stackTraceElement = stackTrace[i];
                ++i;
                Intrinsics.checkNotNullExpressionValue(stackTraceElement, "element");
                if (i(stackTraceElement)) {
                    return true;
                }
            }
            cause = t.getCause();
        }
        return false;
    }
    
    public static final boolean k(final Thread thread) {
        if (thread == null) {
            return false;
        }
        final StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace == null) {
            return false;
        }
        for (int length = stackTrace.length, i = 0; i < length; ++i) {
            final StackTraceElement stackTraceElement = stackTrace[i];
            Intrinsics.checkNotNullExpressionValue(stackTraceElement, "element");
            if (i(stackTraceElement)) {
                final String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "element.className");
                if (!i.s(className, "com.facebook.appevents.codeless", false, 2, null)) {
                    final String className2 = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className2, "element.className");
                    if (!i.s(className2, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                        return true;
                    }
                }
                final String methodName = stackTraceElement.getMethodName();
                Intrinsics.checkNotNullExpressionValue(methodName, "element.methodName");
                if (i.s(methodName, "onClick", false, 2, null)) {
                    continue;
                }
                final String methodName2 = stackTraceElement.getMethodName();
                Intrinsics.checkNotNullExpressionValue(methodName2, "element.methodName");
                if (i.s(methodName2, "onItemClick", false, 2, null)) {
                    continue;
                }
                final String methodName3 = stackTraceElement.getMethodName();
                Intrinsics.checkNotNullExpressionValue(methodName3, "element.methodName");
                if (i.s(methodName3, "onTouch", false, 2, null)) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    public static final File[] l() {
        final File f = f();
        if (f == null) {
            return new File[0];
        }
        File[] listFiles;
        if ((listFiles = f.listFiles(new Q1.i())) == null) {
            listFiles = new File[0];
        }
        return listFiles;
    }
    
    public static final boolean m(final File file, final String s) {
        Intrinsics.checkNotNullExpressionValue(s, "name");
        final x a = x.a;
        final String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[] { "anr_log_" }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).b(s);
    }
    
    public static final File[] n() {
        final File f = f();
        if (f == null) {
            return new File[0];
        }
        File[] listFiles;
        if ((listFiles = f.listFiles(new j())) == null) {
            listFiles = new File[0];
        }
        return listFiles;
    }
    
    public static final boolean o(final File file, final String s) {
        Intrinsics.checkNotNullExpressionValue(s, "name");
        final x a = x.a;
        final String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[] { "analysis_log_" }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).b(s);
    }
    
    public static final File[] p() {
        final File f = f();
        if (f == null) {
            return new File[0];
        }
        File[] listFiles;
        if ((listFiles = f.listFiles(new h())) == null) {
            listFiles = new File[0];
        }
        return listFiles;
    }
    
    public static final boolean q(final File file, final String s) {
        Intrinsics.checkNotNullExpressionValue(s, "name");
        final x a = x.a;
        final String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[] { "crash_log_", "shield_log_", "thread_check_log_" }, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).b(s);
    }
    
    public static final JSONObject r(final String child, final boolean b) {
        final File f = f();
        while (true) {
            Label_0054: {
                if (f == null) {
                    break Label_0054;
                }
                if (child == null) {
                    return null;
                }
                final File file = new File(f, child);
                try {
                    return new JSONObject(P.s0(new FileInputStream(file)));
                    // iftrue(Label_0054:, !b)
                    d(child);
                    return null;
                }
                catch (Exception ex) {}
            }
            continue;
        }
    }
    
    public static final void s(final String s, final JSONArray jsonArray, final F.b b) {
        Intrinsics.checkNotNullParameter(jsonArray, "reports");
        if (jsonArray.length() == 0) {
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(s, (Object)jsonArray.toString());
            final JSONObject c = P.C();
            if (c != null) {
                final Iterator keys = c.keys();
                while (keys.hasNext()) {
                    final String s2 = keys.next();
                    jsonObject.put(s2, c.get(s2));
                }
            }
            final F.c n = F.n;
            final x a = x.a;
            final String format = String.format("%s/instruments", Arrays.copyOf(new Object[] { B.m() }, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            n.A(null, format, jsonObject, b).l();
        }
        catch (JSONException ex) {}
    }
    
    public static final void t(final String child, final String s) {
        final File f = f();
        if (f == null || child == null) {
            return;
        }
        if (s == null) {
            return;
        }
        final File file = new File(f, child);
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(file);
            final byte[] bytes = s.getBytes(b.b);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        }
        catch (Exception ex) {}
    }
}
