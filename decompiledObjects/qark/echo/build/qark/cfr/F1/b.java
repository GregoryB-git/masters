/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Locale
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package F1;

import O1.P;
import O1.v;
import T1.a;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;

public final class b {
    public static final b a = new b();
    public static boolean b;
    public static JSONArray c;
    public static String[] d;

    static {
        d = new String[]{"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};
    }

    public static final void a() {
        Throwable throwable2;
        block4 : {
            if (a.d(b.class)) {
                return;
            }
            try {
                a.g();
                if (c != null) {
                    b = true;
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return;
        }
        a.b(throwable2, b.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(Bundle bundle, String string2) {
        String string3;
        StringBuilder stringBuilder;
        String string4;
        P p8;
        block10 : {
            block9 : {
                if (a.d(b.class)) {
                    return;
                }
                try {
                    block12 : {
                        block11 : {
                            Intrinsics.checkNotNullParameter((Object)bundle, "params");
                            Intrinsics.checkNotNullParameter(string2, "event");
                            bundle.putString("event", string2);
                            stringBuilder = new StringBuilder();
                            p8 = P.a;
                            string2 = p8.I();
                            string4 = "";
                            if (string2 == null) break block11;
                            string2 = string3 = string2.getLanguage();
                            if (string3 != null) break block12;
                        }
                        string2 = "";
                    }
                    stringBuilder.append(string2);
                    stringBuilder.append('_');
                    string2 = p8.I();
                    if (string2 == null) break block9;
                    string2 = string3 = string2.getCountry();
                    if (string3 != null) break block10;
                }
                catch (Throwable throwable) {
                    a.b(throwable, b.class);
                    return;
                }
            }
            string2 = "";
        }
        stringBuilder.append(string2);
        bundle.putString("_locale", stringBuilder.toString());
        string2 = string3 = p8.P();
        if (string3 == null) {
            string2 = "";
        }
        bundle.putString("_appVersion", string2);
        bundle.putString("_deviceOS", "ANDROID");
        bundle.putString("_platform", "mobile");
        string2 = string3 = Build.MODEL;
        if (string3 == null) {
            string2 = "";
        }
        bundle.putString("_deviceModel", string2);
        bundle.putString("_nativeAppID", B.m());
        string2 = p8.P();
        if (string2 == null) {
            string2 = string4;
        }
        bundle.putString("_nativeAppShortVersion", string2);
        bundle.putString("_timezone", p8.D());
        bundle.putString("_carrier", p8.y());
        bundle.putString("_deviceOSTypeName", "ANDROID");
        bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
        bundle.putLong("_remainingDiskGB", p8.w());
    }

    public static final String c(JSONObject object) {
        Throwable throwable2;
        block4 : {
            if (a.d(b.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(object, "logic");
                object = object.keys();
                if (object.hasNext()) {
                    object = (String)object.next();
                    return object;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return null;
        }
        a.b(throwable2, b.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String d(Bundle object) {
        ArrayList arrayList;
        block7 : {
            if (a.d(b.class)) {
                return null;
            }
            JSONArray jSONArray = c;
            if (jSONArray == null) return "[]";
            jSONArray = jSONArray == null ? null : Integer.valueOf((int)jSONArray.length());
            if (jSONArray != null && jSONArray.intValue() == 0) {
                return "[]";
            }
            jSONArray = c;
            if (jSONArray == null) throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            arrayList = new ArrayList();
            int n8 = jSONArray.length();
            if (n8 <= 0) break block7;
            int n9 = 0;
            do {
                int n10;
                block8 : {
                    n10 = n9 + 1;
                    try {
                        long l8;
                        String string2 = jSONArray.optString(n9);
                        if (string2 != null && (l8 = (string2 = new JSONObject(string2)).optLong("id")) != 0L && (string2 = string2.optString("rule")) != null && b.f(string2, (Bundle)object)) {
                            arrayList.add((Object)l8);
                        }
                        break block8;
                    }
                    catch (Throwable throwable) {}
                    a.b(throwable, b.class);
                    return null;
                }
                if (n10 >= n8) break;
                n9 = n10;
            } while (true);
        }
        object = new JSONArray((Collection)arrayList).toString();
        Intrinsics.checkNotNullExpressionValue(object, "JSONArray(res).toString()");
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final ArrayList e(JSONArray jSONArray) {
        int n8;
        int n9;
        ArrayList arrayList;
        if (a.d(b.class)) {
            return null;
        }
        if (jSONArray == null) {
            return null;
        }
        try {
            arrayList = new ArrayList();
            n8 = jSONArray.length();
            if (n8 <= 0) return arrayList;
            n9 = 0;
        }
        catch (Throwable throwable) {}
        do {
            int n10 = n9 + 1;
            arrayList.add((Object)jSONArray.get(n9).toString());
            if (n10 >= n8) {
                return arrayList;
            }
            n9 = n10;
            continue;
            break;
        } while (true);
        a.b(throwable, b.class);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final boolean f(String var0, Bundle var1_2) {
        block21 : {
            if (a.d(b.class)) {
                return false;
            }
            if (var0 == null) return false;
            if (var1_2 == null) {
                return false;
            }
            try {
                block22 : {
                    var6_3 = new JSONObject(var0);
                    var0 = b.c((JSONObject)var6_3);
                    if (var0 == null) {
                        return false;
                    }
                    var6_3 = var6_3.get(var0);
                    var2_4 = var0.hashCode();
                    if (var2_4 == 3555) ** GOTO lbl-1000
                    if (var2_4 == 96727) break block22;
                    if (var2_4 == 109267) {
                        if (var0.equals((Object)"not") != false) return b.f(var6_3.toString(), var1_2) ^ true;
                    }
                    ** GOTO lbl28
                }
                if (!var0.equals((Object)"and")) ** GOTO lbl28
                var0 = (JSONArray)var6_3;
                if (var0 == null) {
                    return false;
                }
                var4_5 = var0.length();
                if (var4_5 <= 0) return true;
                var2_4 = 0;
                ** GOTO lbl39
            }
lbl59: // 3 sources:
            catch (Throwable var0_1) {}
lbl-1000: // 1 sources:
            {
                block23 : {
                    if (var0.equals((Object)"or")) break block23;
lbl28: // 3 sources:
                    var6_3 = (JSONObject)var6_3;
                    if (var6_3 != null) return b.j(var0, (JSONObject)var6_3, var1_2);
                    return false;
                }
                var0 = (JSONArray)var6_3;
                if (var0 == null) {
                    return false;
                }
                var4_6 = var0.length();
                if (var4_6 <= 0) return false;
                var2_4 = 0;
                break block21;
lbl39: // 1 sources:
                do {
                    var3_7 = var2_4 + 1;
                    ** try [egrp 2[TRYBLOCK] [7 : 144->211)] { 
lbl42: // 1 sources:
                    if (!b.f(var0.get(var2_4).toString(), var1_2)) {
                        return false;
                    }
                    if (var3_7 >= var4_5) {
                        return true;
                    }
                    var2_4 = var3_7;
                } while (true);
            }
        }
        do {
            var3_8 = var2_4 + 1;
            var5_9 = b.f(var0.get(var2_4).toString(), var1_2);
            if (var5_9) {
                return true;
            }
            if (var3_8 >= var4_6) {
                return false;
            }
            var2_4 = var3_8;
            continue;
            break;
        } while (true);
        a.b(var0_1, b.class);
        return false;
    }

    public static final void h(Bundle bundle, String string2) {
        Throwable throwable2;
        block7 : {
            block5 : {
                block6 : {
                    if (a.d(b.class)) {
                        return;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(string2, "event");
                        boolean bl = b;
                        if (!bl) break block5;
                        if (bundle != null) break block6;
                        return;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                try {
                    b.b(bundle, string2);
                    bundle.putString("_audiencePropertyIds", b.d(bundle));
                    bundle.putString("cs_maca", "1");
                    b.i(bundle);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            return;
        }
        a.b(throwable2, b.class);
        return;
    }

    public static final void i(Bundle bundle) {
        Throwable throwable2;
        if (a.d(b.class)) {
            return;
        }
        Intrinsics.checkNotNullParameter((Object)bundle, "params");
        for (String string2 : d) {
            try {
                bundle.remove(string2);
            }
            catch (Throwable throwable2) {
            }
        }
        return;
        a.b(throwable2, b.class);
    }

    /*
     * Exception decompiling
     */
    public static final boolean j(String var0, JSONObject var1_2, Bundle var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
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

    public final void g() {
        Object object;
        block4 : {
            if (a.d(this)) {
                return;
            }
            try {
                object = v.a;
                object = v.q(B.m(), false);
                if (object != null) break block4;
                return;
            }
            catch (Throwable throwable) {
                a.b(throwable, this);
                return;
            }
        }
        c = object.f();
    }
}

