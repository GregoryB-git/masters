/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.FilenameFilter
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.Arrays
 *  java.util.Iterator
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package Q1;

import O1.P;
import Q1.h;
import Q1.i;
import Q1.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.I;
import x1.a;

public final class k {
    public static final k a = new k();

    public static /* synthetic */ boolean a(File file, String string2) {
        return k.m(file, string2);
    }

    public static /* synthetic */ boolean b(File file, String string2) {
        return k.q(file, string2);
    }

    public static /* synthetic */ boolean c(File file, String string2) {
        return k.o(file, string2);
    }

    public static final boolean d(String string2) {
        File file = k.f();
        if (file != null && string2 != null) {
            return new File(file, string2).delete();
        }
        return false;
    }

    public static final String e(Throwable throwable) {
        if (throwable == null) {
            return null;
        }
        if (throwable.getCause() == null) {
            return throwable.toString();
        }
        return String.valueOf((Object)throwable.getCause());
    }

    public static final File f() {
        File file;
        File file2 = file = new File(B.l().getCacheDir(), "instrument");
        if (!file.exists()) {
            if (file.mkdirs()) {
                return file;
            }
            file2 = null;
        }
        return file2;
    }

    public static final String g(Thread arrstackTraceElement) {
        Intrinsics.checkNotNullParameter(arrstackTraceElement, "thread");
        arrstackTraceElement = arrstackTraceElement.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        Intrinsics.checkNotNullExpressionValue(arrstackTraceElement, "stackTrace");
        for (StackTraceElement stackTraceElement : arrstackTraceElement) {
            jSONArray.put((Object)stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final String h(Throwable throwable) {
        Throwable throwable2 = null;
        if (throwable == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (throwable != null && throwable != throwable2) {
            Throwable throwable32;
            throwable2 = throwable.getStackTrace();
            Intrinsics.checkNotNullExpressionValue((Object)throwable2, "t.stackTrace");
            for (Throwable throwable32 : throwable2) {
                jSONArray.put((Object)throwable32.toString());
            }
            throwable32 = throwable.getCause();
            throwable2 = throwable;
            throwable = throwable32;
        }
        return jSONArray.toString();
    }

    public static final boolean i(StackTraceElement object) {
        boolean bl;
        block3 : {
            block2 : {
                Intrinsics.checkNotNullParameter(object, "element");
                String string2 = object.getClassName();
                Intrinsics.checkNotNullExpressionValue(string2, "element.className");
                bl = false;
                if (kotlin.text.i.s(string2, "com.facebook", false, 2, null)) break block2;
                object = object.getClassName();
                Intrinsics.checkNotNullExpressionValue(object, "element.className");
                if (!kotlin.text.i.s((String)object, "com.meta", false, 2, null)) break block3;
            }
            bl = true;
        }
        return bl;
    }

    public static final boolean j(Throwable throwable) {
        if (throwable == null) {
            return false;
        }
        Throwable throwable2 = null;
        while (throwable != null && throwable != throwable2) {
            Throwable throwable32;
            throwable2 = throwable.getStackTrace();
            Intrinsics.checkNotNullExpressionValue((Object)throwable2, "t.stackTrace");
            for (Throwable throwable32 : throwable2) {
                Intrinsics.checkNotNullExpressionValue((Object)throwable32, "element");
                if (!k.i((StackTraceElement)throwable32)) continue;
                return true;
            }
            throwable32 = throwable.getCause();
            throwable2 = throwable;
            throwable = throwable32;
        }
        return false;
    }

    public static final boolean k(Thread arrstackTraceElement) {
        if (arrstackTraceElement == null) {
            return false;
        }
        if ((arrstackTraceElement = arrstackTraceElement.getStackTrace()) == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : arrstackTraceElement) {
            block7 : {
                String string2;
                block6 : {
                    Intrinsics.checkNotNullExpressionValue((Object)stackTraceElement, "element");
                    if (!k.i(stackTraceElement)) continue;
                    string2 = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(string2, "element.className");
                    if (kotlin.text.i.s(string2, "com.facebook.appevents.codeless", false, 2, null)) break block6;
                    string2 = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(string2, "element.className");
                    if (!kotlin.text.i.s(string2, "com.facebook.appevents.suggestedevents", false, 2, null)) break block7;
                }
                string2 = stackTraceElement.getMethodName();
                Intrinsics.checkNotNullExpressionValue(string2, "element.methodName");
                if (kotlin.text.i.s(string2, "onClick", false, 2, null)) continue;
                string2 = stackTraceElement.getMethodName();
                Intrinsics.checkNotNullExpressionValue(string2, "element.methodName");
                if (kotlin.text.i.s(string2, "onItemClick", false, 2, null)) continue;
                String string3 = stackTraceElement.getMethodName();
                Intrinsics.checkNotNullExpressionValue(string3, "element.methodName");
                if (kotlin.text.i.s(string3, "onTouch", false, 2, null)) continue;
            }
            return true;
        }
        return false;
    }

    public static final File[] l() {
        File[] arrfile;
        File[] arrfile2 = k.f();
        if (arrfile2 == null) {
            return new File[0];
        }
        arrfile2 = arrfile = arrfile2.listFiles((FilenameFilter)new i());
        if (arrfile == null) {
            arrfile2 = new File[]{};
        }
        return arrfile2;
    }

    public static final boolean m(File object, String string2) {
        Intrinsics.checkNotNullExpressionValue(string2, "name");
        object = x.a;
        object = String.format((String)"^%s[0-9]+.json$", (Object[])Arrays.copyOf((Object[])new Object[]{"anr_log_"}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return new Regex((String)object).b(string2);
    }

    public static final File[] n() {
        File[] arrfile;
        File[] arrfile2 = k.f();
        if (arrfile2 == null) {
            return new File[0];
        }
        arrfile2 = arrfile = arrfile2.listFiles((FilenameFilter)new j());
        if (arrfile == null) {
            arrfile2 = new File[]{};
        }
        return arrfile2;
    }

    public static final boolean o(File object, String string2) {
        Intrinsics.checkNotNullExpressionValue(string2, "name");
        object = x.a;
        object = String.format((String)"^%s[0-9]+.json$", (Object[])Arrays.copyOf((Object[])new Object[]{"analysis_log_"}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return new Regex((String)object).b(string2);
    }

    public static final File[] p() {
        File[] arrfile;
        File[] arrfile2 = k.f();
        if (arrfile2 == null) {
            return new File[0];
        }
        arrfile2 = arrfile = arrfile2.listFiles((FilenameFilter)new h());
        if (arrfile == null) {
            arrfile2 = new File[]{};
        }
        return arrfile2;
    }

    public static final boolean q(File object, String string2) {
        Intrinsics.checkNotNullExpressionValue(string2, "name");
        object = x.a;
        object = String.format((String)"^(%s|%s|%s)[0-9]+.json$", (Object[])Arrays.copyOf((Object[])new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, (int)3));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return new Regex((String)object).b(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final JSONObject r(String string2, boolean bl) {
        File file = k.f();
        if (file == null) return null;
        if (string2 == null) {
            return null;
        }
        file = new File(file, string2);
        try {
            return new JSONObject(P.s0((InputStream)new FileInputStream(file)));
        }
        catch (Exception exception) {}
        if (!bl) return null;
        k.d(string2);
        return null;
    }

    public static final void s(String object, JSONArray object2, F.b b8) {
        JSONObject jSONObject;
        block5 : {
            Intrinsics.checkNotNullParameter(object2, "reports");
            if (object2.length() == 0) {
                return;
            }
            jSONObject = new JSONObject();
            jSONObject.put((String)object, (Object)object2.toString());
            object = P.C();
            if (object == null) break block5;
            try {
                object2 = object.keys();
                while (object2.hasNext()) {
                    String string2 = (String)object2.next();
                    jSONObject.put(string2, object.get(string2));
                }
            }
            catch (JSONException jSONException) {
                return;
            }
        }
        object = F.n;
        object2 = x.a;
        object2 = String.format((String)"%s/instruments", (Object[])Arrays.copyOf((Object[])new Object[]{B.m()}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object2, "java.lang.String.format(format, *args)");
        object.A(null, (String)object2, jSONObject, b8).l();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void t(String string2, String arrby) {
        File file = k.f();
        if (file == null || string2 == null) return;
        if (arrby == null) {
            return;
        }
        string2 = new File(file, string2);
        try {
            string2 = new FileOutputStream((File)string2);
            arrby = arrby.getBytes(b.b);
            Intrinsics.checkNotNullExpressionValue(arrby, "(this as java.lang.String).getBytes(charset)");
            string2.write(arrby);
            string2.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

