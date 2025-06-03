/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Patterns
 *  java.io.File
 *  java.io.FileInputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.Map
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package K1;

import V5.q;
import W5.C;
import android.util.Patterns;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static final a a = new a();
    public static Map b;
    public static Map c;
    public static Map d;
    public static JSONObject e;
    public static boolean f;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final float[] a(JSONObject object, String string2) {
        float[] arrf;
        Throwable throwable222;
        block9 : {
            Object object2;
            JSONArray jSONArray;
            a a8;
            JSONObject jSONObject;
            block8 : {
                if (T1.a.d(a.class)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(object, "viewHierarchy");
                Intrinsics.checkNotNullParameter(string2, "appName");
                if (!f) {
                    return null;
                }
                arrf = new float[30];
                for (int i8 = 0; i8 < 30; ++i8) {
                    arrf[i8] = 0.0f;
                }
                try {
                    string2 = string2.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(string2, "(this as java.lang.String).toLowerCase()");
                    object2 = new JSONObject(object.optJSONObject("view").toString());
                    object = object.optString("screenname");
                    jSONArray = new JSONArray();
                    a8 = a;
                    a8.j((JSONObject)object2, jSONArray);
                    a8.m(arrf, a8.i((JSONObject)object2));
                    jSONObject = a8.b((JSONObject)object2);
                    if (jSONObject == null) {
                        return null;
                    }
                    break block8;
                }
                catch (Throwable throwable222) {}
                break block9;
            }
            Intrinsics.checkNotNullExpressionValue(object, "screenName");
            object2 = object2.toString();
            Intrinsics.checkNotNullExpressionValue(object2, "viewTree.toString()");
            a8.m(arrf, a8.h(jSONObject, jSONArray, (String)object, (String)object2, string2));
            return arrf;
        }
        T1.a.b(throwable222, a.class);
        return null;
        catch (JSONException jSONException) {
            return arrf;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String c(String string2, String string3, String string4) {
        if (T1.a.d(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "buttonText");
            Intrinsics.checkNotNullParameter(string3, "activityName");
            Intrinsics.checkNotNullParameter(string4, "appName");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string4);
            stringBuilder.append(" | ");
            stringBuilder.append(string3);
            stringBuilder.append(", ");
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            if (string2 != null) {
                string2 = string2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(string2, "(this as java.lang.String).toLowerCase()");
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, a.class);
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void d(File file) {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            e = new JSONObject();
            file = new FileInputStream(file);
            byte[] arrby = new byte[file.available()];
            file.read(arrby);
            file.close();
            e = new JSONObject(new String(arrby, b.b));
            b = C.f(q.a("ENGLISH", "1"), q.a("GERMAN", "2"), q.a("SPANISH", "3"), q.a("JAPANESE", "4"));
            c = C.f(q.a("VIEW_CONTENT", "0"), q.a("SEARCH", "1"), q.a("ADD_TO_CART", "2"), q.a("ADD_TO_WISHLIST", "3"), q.a("INITIATE_CHECKOUT", "4"), q.a("ADD_PAYMENT_INFO", "5"), q.a("PURCHASE", "6"), q.a("LEAD", "7"), q.a("COMPLETE_REGISTRATION", "8"));
            d = C.f(q.a("BUTTON_TEXT", "1"), q.a("PAGE_TITLE", "2"), q.a("RESOLVED_DOCUMENT_LINK", "3"), q.a("BUTTON_ID", "4"));
            f = true;
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, a.class);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final boolean f() {
        if (T1.a.d(a.class)) {
            return false;
        }
        try {
            boolean bl = f;
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, a.class);
            return false;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final JSONObject b(JSONObject jSONObject) {
        int n8;
        int n9;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            if ((jSONObject = jSONObject.optJSONArray("childviews")) == null) {
                return null;
            }
            n9 = jSONObject.length();
            if (n9 <= 0) return null;
            n8 = 0;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
        }
        do {
            int n10 = n8 + 1;
            JSONObject jSONObject2 = jSONObject.getJSONObject(n8);
            Intrinsics.checkNotNullExpressionValue((Object)jSONObject2, "children.getJSONObject(i)");
            jSONObject2 = this.b(jSONObject2);
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            if (n10 >= n9) {
                return null;
            }
            n8 = n10;
            continue;
            break;
        } while (true);
        return null;
        catch (JSONException jSONException) {
            return null;
        }
    }

    public final boolean e(JSONObject jSONObject) {
        int n8;
        boolean bl = T1.a.d(this);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        try {
            n8 = jSONObject.optInt("classtypebitmask");
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return false;
        }
        if ((n8 & 1) << 5 > 0) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public final boolean g(String[] var1_1, String[] var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP], 5[DOLOOP]], but top level block is 2[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final float[] h(JSONObject object, JSONArray object2, String string2, String string3, String string4) {
        float f8;
        float[] arrf;
        block22 : {
            int n8;
            int n9;
            if (T1.a.d(this)) {
                return null;
            }
            arrf = new float[30];
            for (n9 = 0; n9 < 30; ++n9) {
                arrf[n9] = 0.0f;
            }
            n9 = object2.length();
            f8 = n9 > 1 ? (float)n9 - 1.0f : 0.0f;
            arrf[3] = f8;
            try {
                n8 = object2.length();
                if (n8 <= 0) break block22;
                n9 = 0;
            }
            catch (JSONException jSONException) {}
            do {
                int n10;
                block23 : {
                    n10 = n9 + 1;
                    JSONObject jSONObject = object2.getJSONObject(n9);
                    Intrinsics.checkNotNullExpressionValue((Object)jSONObject, "siblings.getJSONObject(i)");
                    if (!this.e(jSONObject)) break block23;
                    arrf[9] = arrf[9] + 1.0f;
                }
                if (n10 < n8) {
                    n9 = n10;
                    continue;
                }
                break;
            } while (true);
        }
        arrf[13] = -1.0f;
        arrf[14] = -1.0f;
        try {
            object2 = new StringBuilder();
            object2.append(string2);
            object2.append('|');
            object2.append(string4);
            object2 = object2.toString();
            string4 = new StringBuilder();
            string2 = new StringBuilder();
            this.n((JSONObject)object, (StringBuilder)string2, (StringBuilder)string4);
            object = string4.toString();
            Intrinsics.checkNotNullExpressionValue(object, "hintSB.toString()");
            string2 = string2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "textSB.toString()");
            f8 = this.l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        }
        catch (Throwable throwable) {}
        arrf[15] = f8;
        f8 = this.l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", (String)object2) ? 1.0f : 0.0f;
        arrf[16] = f8;
        f8 = this.l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", (String)object) ? 1.0f : 0.0f;
        arrf[17] = f8;
        f8 = i.v(string3, "password", false, 2, null) ? 1.0f : 0.0f;
        arrf[18] = f8;
        f8 = this.k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", string3) ? 1.0f : 0.0f;
        arrf[19] = f8;
        f8 = this.k("(?i)(sign in)|login|signIn", string3) ? 1.0f : 0.0f;
        arrf[20] = f8;
        f8 = this.k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", string3) ? 1.0f : 0.0f;
        arrf[21] = f8;
        f8 = this.l("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        arrf[22] = f8;
        f8 = this.l("ENGLISH", "PURCHASE", "PAGE_TITLE", (String)object2) ? 1.0f : 0.0f;
        arrf[24] = f8;
        f8 = this.k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? 1.0f : 0.0f;
        arrf[25] = f8;
        f8 = this.k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", (String)object2) ? 1.0f : 0.0f;
        arrf[27] = f8;
        f8 = this.l("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
        arrf[28] = f8;
        f8 = this.l("ENGLISH", "LEAD", "PAGE_TITLE", (String)object2) ? 1.0f : 0.0f;
        arrf[29] = f8;
        return arrf;
        T1.a.b(throwable, this);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final float[] i(JSONObject var1_1) {
        block27 : {
            block26 : {
                block25 : {
                    block28 : {
                        block24 : {
                            block23 : {
                                block22 : {
                                    block21 : {
                                        if (T1.a.d(this)) {
                                            return null;
                                        }
                                        var5_4 = new float[30];
                                        var3_5 = 0;
                                        for (var2_6 = 0; var2_6 < 30; ++var2_6) {
                                            var5_4[var2_6] = 0.0f;
                                        }
                                        var6_7 = var1_1.optString("text");
                                        Intrinsics.checkNotNullExpressionValue(var6_7, "node.optString(TEXT_KEY)");
                                        var6_7 = var6_7.toLowerCase();
                                        Intrinsics.checkNotNullExpressionValue(var6_7, "(this as java.lang.String).toLowerCase()");
                                        var7_8 = var1_1.optString("hint");
                                        Intrinsics.checkNotNullExpressionValue(var7_8, "node.optString(HINT_KEY)");
                                        var7_8 = var7_8.toLowerCase();
                                        Intrinsics.checkNotNullExpressionValue(var7_8, "(this as java.lang.String).toLowerCase()");
                                        var8_9 = var1_1.optString("classname");
                                        Intrinsics.checkNotNullExpressionValue(var8_9, "node.optString(CLASS_NAME_KEY)");
                                        var8_9 = var8_9.toLowerCase();
                                        Intrinsics.checkNotNullExpressionValue(var8_9, "(this as java.lang.String).toLowerCase()");
                                        var2_6 = var1_1.optInt("inputtype", -1);
                                        var9_10 = new String[]{var6_7, var7_8};
                                        if (!this.g(new String[]{"$", "amount", "price", "total"}, var9_10)) break block21;
                                        var5_4[0] = var5_4[0] + 1.0f;
                                    }
                                    if (!this.g(new String[]{"password", "pwd"}, var9_10)) break block22;
                                    var5_4[1] = var5_4[1] + 1.0f;
                                }
                                if (!this.g(new String[]{"tel", "phone"}, var9_10)) break block23;
                                var5_4[2] = var5_4[2] + 1.0f;
                            }
                            if (!this.g(new String[]{"search"}, var9_10)) break block24;
                            var5_4[4] = var5_4[4] + 1.0f;
                        }
                        if (var2_6 >= 0) {
                            var5_4[5] = var5_4[5] + 1.0f;
                        }
                        if (var2_6 == 3 || var2_6 == 2) {
                            var5_4[6] = var5_4[6] + 1.0f;
                        }
                        if (var2_6 == 32) ** GOTO lbl46
                        if (!Patterns.EMAIL_ADDRESS.matcher((CharSequence)var6_7).matches()) break block28;
lbl46: // 2 sources:
                        var5_4[7] = var5_4[7] + 1.0f;
                    }
                    if (!i.v(var8_9, "checkbox", false, 2, null)) break block25;
                    var5_4[8] = var5_4[8] + 1.0f;
                }
                if (!this.g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{var6_7})) break block26;
                var5_4[10] = var5_4[10] + 1.0f;
            }
            if (!i.v(var8_9, "radio", false, 2, null) || !i.v(var8_9, "button", false, 2, null)) break block27;
            var5_4[12] = var5_4[12] + 1.0f;
        }
        try {
            var1_1 = var1_1.optJSONArray("childviews");
            var4_11 = var1_1.length();
            if (var4_11 <= 0) return var5_4;
            var2_6 = var3_5;
        }
        catch (JSONException var1_3) {
            return var5_4;
        }
        catch (Throwable var1_2) {}
        do {
            var3_5 = var2_6 + 1;
            var6_7 = var1_1.getJSONObject(var2_6);
            Intrinsics.checkNotNullExpressionValue(var6_7, "childViews.getJSONObject(i)");
            this.m(var5_4, this.i((JSONObject)var6_7));
            if (var3_5 >= var4_11) {
                return var5_4;
            }
            var2_6 = var3_5;
            continue;
            break;
        } while (true);
        T1.a.b(var1_2, this);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final boolean j(JSONObject var1_1, JSONArray var2_4) {
        block23 : {
            block22 : {
                block18 : {
                    block19 : {
                        block20 : {
                            block21 : {
                                if (T1.a.d(this)) {
                                    return false;
                                }
                                if (var1_1.optBoolean("is_interacted")) {
                                    return true;
                                }
                                var8_5 = var1_1.optJSONArray("childviews");
                                var5_6 = var8_5.length();
                                if (var5_6 <= 0) break block18;
                                var3_7 = 0;
lbl10: // 2 sources:
                                var4_8 = var3_7 + 1;
                                if (!var8_5.getJSONObject(var3_7).optBoolean("is_interacted")) break block19;
                                var7_9 = true;
                                break block20;
lbl15: // 1 sources:
                                var9_11 = new JSONArray();
                                if (!var7_9) ** GOTO lbl27
                                var5_6 = var8_5.length();
                                var7_9 = var6_10;
                                if (var5_6 <= 0) break block21;
                                var3_7 = 0;
lbl21: // 2 sources:
                                var4_8 = var3_7 + 1;
                                var2_4.put((Object)var8_5.getJSONObject(var3_7));
                                if (var4_8 >= var5_6) {
                                    return var6_10;
                                }
                                break block22;
lbl27: // 1 sources:
                                var5_6 = var8_5.length();
                                var7_9 = var6_10;
                                if (var5_6 <= 0) ** GOTO lbl40
                                var3_7 = 0;
lbl31: // 2 sources:
                                var4_8 = var3_7 + 1;
                                try {
                                    var10_12 = var8_5.getJSONObject(var3_7);
                                    Intrinsics.checkNotNullExpressionValue((Object)var10_12, "child");
                                    var7_9 = var6_10;
                                    if (this.j(var10_12, var2_4)) {
                                        var9_11.put((Object)var10_12);
                                        var7_9 = true;
                                    }
                                    if (var4_8 < var5_6) break block23;
lbl40: // 2 sources:
                                    var1_1.put("childviews", (Object)var9_11);
                                }
                                catch (JSONException var1_3) {
                                    return false;
                                }
                            }
                            return var7_9;
lbl43: // 1 sources:
                            do {
                                T1.a.b(var1_2, this);
                                return false;
                                break;
                            } while (true);
                        }
lbl49: // 2 sources:
                        do {
                            var6_10 = var7_9;
                            ** GOTO lbl15
                            break;
                        } while (true);
                    }
                    if (var4_8 >= var5_6) break block18;
                    var3_7 = var4_8;
                    ** GOTO lbl10
                    catch (Throwable var1_2) {
                        ** continue;
                    }
                }
                var7_9 = false;
                ** while (true)
            }
            var3_7 = var4_8;
            ** GOTO lbl21
        }
        var3_7 = var4_8;
        var6_10 = var7_9;
        ** GOTO lbl31
    }

    public final boolean k(String string2, String string3) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            boolean bl = Pattern.compile((String)string2).matcher((CharSequence)string3).find();
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean l(String string2, String string3, String string4, String string5) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = e;
            Object var5_7 = null;
            if (jSONObject == null) {
                Intrinsics.n("rules");
                throw null;
            }
            if ((jSONObject = jSONObject.optJSONObject("rulesForLanguage")) == null) {
                string2 = null;
            } else {
                Map map = b;
                if (map == null) {
                    Intrinsics.n("languageInfo");
                    throw null;
                }
                string2 = jSONObject.optJSONObject((String)map.get((Object)string2));
            }
            if (string2 != null && (string2 = string2.optJSONObject("rulesForEvent")) != null) {
                jSONObject = c;
                if (jSONObject == null) {
                    Intrinsics.n("eventInfo");
                    throw null;
                }
                string2 = string2.optJSONObject((String)jSONObject.get((Object)string3));
            } else {
                string2 = null;
            }
            if (string2 == null) {
                string2 = var5_7;
            } else if ((string2 = string2.optJSONObject("positiveRules")) == null) {
                string2 = var5_7;
            } else {
                string3 = d;
                if (string3 == null) {
                    Intrinsics.n("textTypeInfo");
                    throw null;
                }
                string2 = string2.optString((String)string3.get((Object)string4));
            }
            if (string2 != null) {
                return this.k(string2, string5);
            }
            return false;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void m(float[] arrf, float[] arrf2) {
        int n8;
        int n9;
        if (T1.a.d(this)) {
            return;
        }
        try {
            n8 = arrf.length - 1;
            if (n8 < 0) return;
            n9 = 0;
        }
        catch (Throwable throwable) {}
        do {
            int n10 = n9 + 1;
            arrf[n9] = arrf[n9] + arrf2[n9];
            if (n10 > n8) {
                return;
            }
            n9 = n10;
        } while (true);
        T1.a.b(throwable, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(JSONObject jSONObject, StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        int n8;
        String string2;
        int n9;
        Throwable throwable2;
        block11 : {
            if (T1.a.d(this)) {
                return;
            }
            try {
                string2 = jSONObject.optString("text", "");
                Intrinsics.checkNotNullExpressionValue(string2, "view.optString(TEXT_KEY, \"\")");
                string2 = string2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(string2, "(this as java.lang.String).toLowerCase()");
                String string3 = jSONObject.optString("hint", "");
                Intrinsics.checkNotNullExpressionValue(string3, "view.optString(HINT_KEY, \"\")");
                string3 = string3.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(string3, "(this as java.lang.String).toLowerCase()");
                n9 = string2.length();
                if (n9 > 0) {
                    stringBuilder.append(string2);
                    stringBuilder.append(" ");
                }
                if (string3.length() > 0) {
                    stringBuilder2.append(string3);
                    stringBuilder2.append(" ");
                }
                if ((jSONObject = jSONObject.optJSONArray("childviews")) == null) {
                    return;
                }
                n8 = jSONObject.length();
                if (n8 > 0) {
                    n9 = 0;
                    break block11;
                }
                return;
            }
            catch (Throwable throwable2) {}
        }
        do {
            int n10;
            n10 = n9 + 1;
            try {
                string2 = jSONObject.getJSONObject(n9);
                Intrinsics.checkNotNullExpressionValue(string2, "currentChildView");
                this.n((JSONObject)string2, stringBuilder, stringBuilder2);
            }
            catch (JSONException jSONException) {}
            if (n10 >= n8) {
                return;
            }
            n9 = n10;
        } while (true);
        T1.a.b(throwable2, this);
    }
}

