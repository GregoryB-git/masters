/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package H1;

import G1.k;
import H1.b;
import H1.d;
import H1.e;
import H1.g;
import H1.h;
import H1.j;
import O1.P;
import O1.n;
import V5.l;
import W5.m;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.K;

public final class f {
    public static final f a = new f();
    public static final Map b = new ConcurrentHashMap();
    public static final List c = m.i("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
    public static final List d = m.i("none", "address", "health");

    public static /* synthetic */ void a() {
        f.g();
    }

    public static /* synthetic */ void b() {
        f.j();
    }

    public static /* synthetic */ void c() {
        f.i();
    }

    public static final /* synthetic */ float[] d(f arrf, JSONArray jSONArray) {
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            arrf = arrf.o(jSONArray);
            return arrf;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, f.class);
            return null;
        }
    }

    public static final void f() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            P p8 = P.a;
            P.B0(new H1.c());
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, f.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void g() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            Object object = B.l().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string2 = object.getString("models", null);
            string2 = string2 != null && string2.length() != 0 ? new JSONObject(string2) : new JSONObject();
            long l8 = object.getLong("model_request_timestamp", 0L);
            n n8 = n.a;
            if (!n.g(n.b.A) || string2.length() == 0 || !a.n(l8)) {
                string2 = a.k();
                if (string2 == null) {
                    return;
                }
                object.edit().putString("models", string2.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
            }
            object = a;
            object.e((JSONObject)string2);
            object.h();
            return;
        }
        catch (Exception exception) {
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, f.class);
    }

    public static final void i() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            K1.e.b();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, f.class);
            return;
        }
    }

    public static final void j() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            F1.a.a();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, f.class);
            return;
        }
    }

    public static final File l(a object) {
        block4 : {
            if (T1.a.d(f.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(object, "task");
                object = (b)b.get((Object)object.h());
                if (object != null) break block4;
                return null;
            }
            catch (Throwable throwable) {
                T1.a.b(throwable, f.class);
                return null;
            }
        }
        object = object.d();
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final String[] q(a var0, float[][] var1_2, String[] var2_3) {
        var7_4 = T1.a.d(f.class);
        var9_5 = null;
        if (var7_4) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)var0, "task");
            Intrinsics.checkNotNullParameter(var1_2, "denses");
            Intrinsics.checkNotNullParameter(var2_3, "texts");
            var10_6 = (float[])f.b.get((Object)var0.h());
            if (var10_6 == null) {
                return null;
            }
            var8_7 = var10_6.c();
            if (var8_7 == null) {
                return null;
            }
            var10_6 = var10_6.f();
            var5_8 = var2_3.length;
            var6_9 = var1_2[0].length;
            var11_10 = new H1.a(new int[]{var5_8, var6_9});
            if (var5_8 <= 0) ** GOTO lbl26
            var3_11 = 0;
        }
        catch (Throwable var0_1) {}
        do {
            block12 : {
                var4_12 = var3_11 + 1;
                System.arraycopy((Object)var1_2[var3_11], (int)0, (Object)var11_10.a(), (int)(var3_11 * var6_9), (int)var6_9);
                if (var4_12 < var5_8) break block12;
lbl26: // 2 sources:
                var2_3 = var8_7.b(var11_10, (String[])var2_3, var0.e());
                var1_2 = var9_5;
                if (var2_3 == null) return var1_2;
                var1_2 = var9_5;
                if (var10_6 == null) return var1_2;
                if (var2_3.a().length == 0) {
                    return null;
                }
                if (var10_6.length == 0) {
                    return null;
                }
                var3_11 = c.a[var0.ordinal()];
                if (var3_11 == 1) return f.a.s((H1.a)var2_3, var10_6);
                if (var3_11 != 2) throw new l();
                return f.a.r((H1.a)var2_3, var10_6);
            }
            var3_11 = var4_12;
            continue;
            break;
        } while (true);
        T1.a.b(var0_1, f.class);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void e(JSONObject jSONObject) {
        block6 : {
            if (T1.a.d(this)) {
                return;
            }
            try {
                iterator = jSONObject.keys();
                ** try [egrp 1[TRYBLOCK] [1 : 13->68)] { 
lbl6: // 1 sources:
                break block6;
            }
            catch (Throwable throwable2) {}
            T1.a.b(throwable2, this);
            return;
lbl10: // 1 sources:
            catch (JSONException jSONException) {
                return;
            }
        }
        while (iterator.hasNext() != false) {
            object = (String)iterator.next();
            if ((object = b.i.c(jSONObject.getJSONObject((String)object))) == null) continue;
            f.b.put((Object)object.g(), object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = b.entrySet().iterator();
            Object object = null;
            int n8 = 0;
            while (iterator.hasNext()) {
                Object object2 = (Map.Entry)iterator.next();
                String string2 = (String)object2.getKey();
                object2 = (b)object2.getValue();
                int n9 = n8;
                if (Intrinsics.a(string2, a.p.h())) {
                    object = object2.b();
                    n9 = Math.max((int)n8, (int)object2.h());
                    n n10 = n.a;
                    if (n.g(n.b.y) && this.m()) {
                        arrayList.add((Object)object2.j(new d()));
                    }
                }
                n8 = n9;
                if (!Intrinsics.a(string2, a.o.h())) continue;
                string2 = object2.b();
                n9 = Math.max((int)n9, (int)object2.h());
                object = n.a;
                object = string2;
                n8 = n9;
                if (!n.g(n.b.z)) continue;
                arrayList.add((Object)object2.j(new e()));
                object = string2;
                n8 = n9;
            }
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    public final JSONObject k() {
        Bundle bundle;
        block4 : {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                bundle = new Bundle();
                bundle.putString("fields", TextUtils.join((CharSequence)",", (Object[])new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
                F f8 = F.n.x(null, "app/model_asset", null);
                f8.G(bundle);
                bundle = f8.k().c();
                if (bundle != null) break block4;
                return null;
            }
            catch (Throwable throwable) {
                T1.a.b(throwable, this);
                return null;
            }
        }
        bundle = this.p((JSONObject)bundle);
        return bundle;
    }

    public final boolean m() {
        Throwable throwable2;
        block6 : {
            boolean bl;
            block5 : {
                block4 : {
                    Object object;
                    boolean bl2 = T1.a.d(this);
                    bl = false;
                    if (bl2) {
                        return false;
                    }
                    try {
                        object = P.N();
                        if (object == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    object = object.getLanguage();
                    Intrinsics.checkNotNullExpressionValue(object, "locale.language");
                    bl2 = i.v((CharSequence)object, "en", false, 2, null);
                    if (!bl2) break block5;
                }
                bl = true;
            }
            return bl;
        }
        T1.a.b(throwable2, this);
        return false;
    }

    public final boolean n(long l8) {
        long l9;
        boolean bl = T1.a.d(this);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        if (l8 == 0L) {
            return false;
        }
        try {
            l9 = System.currentTimeMillis();
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return false;
        }
        if (l9 - l8 < 259200000L) {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final float[] o(JSONArray jSONArray) {
        if (T1.a.d(this)) {
            return null;
        }
        if (jSONArray == null) {
            return null;
        }
        float[] arrf = new float[jSONArray.length()];
        int n9 = jSONArray.length();
        if (n9 <= 0) return arrf;
        int n8 = 0;
        do {
            int n10;
            block8 : {
                n10 = n8 + 1;
                try {
                    String string2 = jSONArray.getString(n8);
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                    arrf[n8] = Float.parseFloat((String)string2);
                    break block8;
                }
                catch (Throwable throwable) {}
                T1.a.b(throwable, this);
                return null;
                catch (JSONException jSONException) {}
            }
            if (n10 >= n9) {
                return arrf;
            }
            n8 = n10;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final JSONObject p(JSONObject var1_1) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            var5_4 = new JSONObject();
            var6_5 = var1_1.getJSONArray("data");
            var4_6 = var6_5.length();
            var1_1 = var5_4;
            if (var4_6 <= 0) return var1_1;
            var2_7 = 0;
        }
        catch (Throwable var1_3) {
            ** continue;
        }
        do {
            var3_8 = var2_7 + 1;
            var1_1 = var6_5.getJSONObject(var2_7);
            var7_9 = new JSONObject();
            var7_9.put("version_id", (Object)var1_1.getString("version_id"));
            var7_9.put("use_case", (Object)var1_1.getString("use_case"));
            var7_9.put("thresholds", (Object)var1_1.getJSONArray("thresholds"));
            var7_9.put("asset_uri", (Object)var1_1.getString("asset_uri"));
            if (var1_1.has("rules_uri")) {
                var7_9.put("rules_uri", (Object)var1_1.getString("rules_uri"));
            }
            var5_4.put(var1_1.getString("use_case"), (Object)var7_9);
            if (var3_8 >= var4_6) {
                return var5_4;
            }
            var2_7 = var3_8;
            continue;
            break;
        } while (true);
lbl27: // 1 sources:
        do {
            return new JSONObject();
            break;
        } while (true);
lbl30: // 1 sources:
        do {
            T1.a.b(var1_3, this);
            return null;
            break;
        } while (true);
        {
            catch (JSONException var1_2) {
                ** continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final String[] r(H1.a var1_1, float[] var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 3[UNCONDITIONALDOLOOP]
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
     * Exception decompiling
     */
    public final String[] s(H1.a var1_1, float[] var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 3[UNCONDITIONALDOLOOP]
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

    public static final class H1.f$a
    extends Enum {
        public static final /* enum */ H1.f$a o = new H1.f$a();
        public static final /* enum */ H1.f$a p = new H1.f$a();
        public static final /* synthetic */ H1.f$a[] q;

        static {
            q = H1.f$a.c();
        }

        public static final /* synthetic */ H1.f$a[] c() {
            return new H1.f$a[]{o, p};
        }

        public static H1.f$a valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (H1.f$a)Enum.valueOf(H1.f$a.class, (String)string2);
        }

        public static H1.f$a[] values() {
            H1.f$a[] arra = q;
            return (H1.f$a[])Arrays.copyOf((Object[])arra, (int)arra.length);
        }

        public final String e() {
            int n8 = a.a[this.ordinal()];
            if (n8 != 1) {
                if (n8 == 2) {
                    return "app_event_pred";
                }
                throw new l();
            }
            return "integrity_detect";
        }

        public final String h() {
            int n8 = a.a[this.ordinal()];
            if (n8 != 1) {
                if (n8 == 2) {
                    return "MTML_APP_EVENT_PRED";
                }
                throw new l();
            }
            return "MTML_INTEGRITY_DETECT";
        }

        public abstract class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] arrn = new int[H1.f$a.values().length];
                arrn[H1.f$a.o.ordinal()] = 1;
                arrn[H1.f$a.p.ordinal()] = 2;
                a = arrn;
            }
        }

    }

    public static final class b {
        public static final a i = new a(null);
        public String a;
        public String b;
        public String c;
        public int d;
        public float[] e;
        public File f;
        public H1.b g;
        public Runnable h;

        public b(String string2, String string3, String string4, int n8, float[] arrf) {
            Intrinsics.checkNotNullParameter(string2, "useCase");
            Intrinsics.checkNotNullParameter(string3, "assetUri");
            this.a = string2;
            this.b = string3;
            this.c = string4;
            this.d = n8;
            this.e = arrf;
        }

        public final String b() {
            return this.b;
        }

        public final H1.b c() {
            return this.g;
        }

        public final File d() {
            return this.f;
        }

        public final String e() {
            return this.c;
        }

        public final float[] f() {
            return this.e;
        }

        public final String g() {
            return this.a;
        }

        public final int h() {
            return this.d;
        }

        public final void i(H1.b b8) {
            this.g = b8;
        }

        public final b j(Runnable runnable) {
            this.h = runnable;
            return this;
        }

        public final void k(File file) {
            this.f = file;
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g g8) {
                this();
            }

            public static /* synthetic */ void a(List list, File file) {
                a.g(list, file);
            }

            public static /* synthetic */ void b(b b8, H1.b b9, File file) {
                a.h(b8, b9, file);
            }

            public static final void g(List list, File object) {
                Intrinsics.checkNotNullParameter((Object)list, "$slaves");
                Intrinsics.checkNotNullParameter(object, "file");
                object = H1.b.m.a((File)object);
                if (object != null) {
                    for (b b8 : list) {
                        Object object2 = new StringBuilder();
                        object2.append(b8.g());
                        object2.append('_');
                        object2.append(b8.h());
                        object2.append("_rule");
                        object2 = object2.toString();
                        b.i.e(b8.e(), (String)object2, new h(b8, (H1.b)object));
                    }
                }
            }

            public static final void h(b b8, H1.b b9, File file) {
                Intrinsics.checkNotNullParameter(b8, "$slave");
                Intrinsics.checkNotNullParameter((Object)file, "file");
                b8.i(b9);
                b8.k(file);
                b8 = b8.h;
                if (b8 == null) {
                    return;
                }
                b8.run();
            }

            public final b c(JSONObject object) {
                if (object == null) {
                    return null;
                }
                try {
                    String string2 = object.getString("use_case");
                    String string3 = object.getString("asset_uri");
                    String string4 = object.optString("rules_uri", null);
                    int n8 = object.getInt("version_id");
                    object = f.d(f.a, object.getJSONArray("thresholds"));
                    Intrinsics.checkNotNullExpressionValue(string2, "useCase");
                    Intrinsics.checkNotNullExpressionValue(string3, "assetUri");
                    object = new b(string2, string3, string4, n8, (float[])object);
                    return object;
                }
                catch (Exception exception) {
                    return null;
                }
            }

            public final void d(String string2, int n8) {
                File[] arrfile = j.a();
                if (arrfile == null) {
                    return;
                }
                if ((arrfile = arrfile.listFiles()) != null) {
                    if (arrfile.length == 0) {
                        return;
                    }
                    Object object = new StringBuilder();
                    object.append(string2);
                    object.append('_');
                    object.append(n8);
                    object = object.toString();
                    int n9 = arrfile.length;
                    n8 = 0;
                    while (n8 < n9) {
                        File file = arrfile[n8];
                        int n10 = n8 + 1;
                        String string3 = file.getName();
                        Intrinsics.checkNotNullExpressionValue(string3, "name");
                        n8 = n10;
                        if (!i.s(string3, string2, false, 2, null)) continue;
                        n8 = n10;
                        if (i.s(string3, (String)object, false, 2, null)) continue;
                        file.delete();
                        n8 = n10;
                    }
                }
            }

            public final void e(String string2, String string3, k.a a8) {
                string3 = new File(j.a(), string3);
                if (string2 != null && !string3.exists()) {
                    new k(string2, (File)string3, a8).execute((Object[])new String[0]);
                    return;
                }
                a8.a((File)string3);
            }

            public final void f(b b8, List list) {
                Intrinsics.checkNotNullParameter(b8, "master");
                Intrinsics.checkNotNullParameter((Object)list, "slaves");
                this.d(b8.g(), b8.h());
                Object object = new StringBuilder();
                object.append(b8.g());
                object.append('_');
                object.append(b8.h());
                object = object.toString();
                this.e(b8.b(), (String)object, new g(list));
            }
        }

    }

    public abstract class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] arrn = new int[a.values().length];
            arrn[a.p.ordinal()] = 1;
            arrn[a.o.ordinal()] = 2;
            a = arrn;
        }
    }

}

