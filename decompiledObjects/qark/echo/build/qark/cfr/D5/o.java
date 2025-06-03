/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.NoSuchFieldError
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package D5;

import E5.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import t5.b;
import w5.a;

public class o {
    public final E5.k a;
    public h b;
    public final k.c c;

    public o(a object) {
        k.c c8;
        this.c = c8 = new k.c(){

            /*
             * Exception decompiling
             */
            @Override
            public void onMethodCall(E5.j var1_1, k.d var2_14) {
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
                // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
                // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
                // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
                // org.benf.cfr.reader.Main.doJar(Main.java:134)
                // org.benf.cfr.reader.Main.main(Main.java:189)
                throw new IllegalStateException("Decompilation failed");
            }
        };
        this.a = object = new E5.k((E5.c)object, "flutter/platform", E5.g.a);
        object.e(c8);
    }

    public static /* synthetic */ h a(o o8) {
        return o8.b;
    }

    public static /* synthetic */ int b(o o8, JSONArray jSONArray) {
        return o8.h(jSONArray);
    }

    public static /* synthetic */ c c(o o8, JSONObject jSONObject) {
        return o8.g(jSONObject);
    }

    public static /* synthetic */ List d(o o8, JSONArray jSONArray) {
        return o8.k(jSONArray);
    }

    public static /* synthetic */ k e(o o8, String string2) {
        return o8.j(string2);
    }

    public static /* synthetic */ j f(o o8, JSONObject jSONObject) {
        return o8.i(jSONObject);
    }

    public final c g(JSONObject jSONObject) {
        int n8;
        int n9 = n8 = jSONObject.getInt("primaryColor");
        if (n8 != 0) {
            n9 = n8 | -16777216;
        }
        return new c(n9, jSONObject.getString("label"));
    }

    public final int h(JSONArray jSONArray) {
        int n8;
        int n9;
        int n10 = n8 = (n9 = 0);
        while (n9 < jSONArray.length()) {
            f f8 = f.e(jSONArray.getString(n9));
            int n11 = .a[f8.ordinal()];
            if (n11 != 1) {
                if (n11 != 2) {
                    if (n11 != 3) {
                        if (n11 == 4) {
                            n8 |= 8;
                        }
                    } else {
                        n8 |= 2;
                    }
                } else {
                    n8 |= 4;
                }
            } else {
                n8 |= 1;
            }
            n11 = n10;
            if (n10 == 0) {
                n11 = n8;
            }
            ++n9;
            n10 = n11;
        }
        if (n8 != 0) {
            n9 = 9;
            switch (n8) {
                default: {
                    return 1;
                }
                case 15: {
                    return 13;
                }
                case 11: {
                    return 2;
                }
                case 10: {
                    return 11;
                }
                case 8: {
                    return 8;
                }
                case 5: {
                    n9 = 12;
                }
                case 4: {
                    return n9;
                }
                case 3: 
                case 6: 
                case 7: 
                case 9: 
                case 12: 
                case 13: 
                case 14: {
                    if (n10 == 2) break;
                    if (n10 != 4) {
                        if (n10 != 8) {
                            return 1;
                        }
                        return 8;
                    }
                    return 9;
                }
                case 2: 
            }
            return 0;
        }
        return -1;
    }

    public final j i(JSONObject jSONObject) {
        boolean bl = jSONObject.isNull("statusBarColor");
        Boolean bl2 = null;
        Integer n8 = !bl ? Integer.valueOf((int)jSONObject.getInt("statusBarColor")) : null;
        d d8 = !jSONObject.isNull("statusBarIconBrightness") ? d.e(jSONObject.getString("statusBarIconBrightness")) : null;
        Boolean bl3 = !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf((boolean)jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null;
        Integer n9 = !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf((int)jSONObject.getInt("systemNavigationBarColor")) : null;
        d d9 = !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.e(jSONObject.getString("systemNavigationBarIconBrightness")) : null;
        Integer n10 = !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf((int)jSONObject.getInt("systemNavigationBarDividerColor")) : null;
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bl2 = jSONObject.getBoolean("systemNavigationBarContrastEnforced");
        }
        return new j(n8, d8, bl3, n9, d9, n10, bl2);
    }

    public final k j(String object) {
        int n8 = .c[(object = k.e((String)object)).ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return k.s;
                    }
                    return k.s;
                }
                return k.r;
            }
            return k.q;
        }
        return k.p;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final List k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int n8 = 0;
        while (n8 < jSONArray.length()) {
            block2 : {
                l l8;
                block3 : {
                    block1 : {
                        l8 = l.e(jSONArray.getString(n8));
                        int n9 = .b[l8.ordinal()];
                        if (n9 == 1) break block1;
                        if (n9 != 2) break block2;
                        l8 = l.q;
                        break block3;
                    }
                    l8 = l.p;
                }
                arrayList.add((Object)l8);
            }
            ++n8;
        }
        return arrayList;
    }

    public void l(h h8) {
        this.b = h8;
    }

    public void m(boolean bl) {
        b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.a.c("SystemChrome.systemUIChange", (Object)Arrays.asList((Object[])new Boolean[]{bl}));
    }

    public static class c {
        public final int a;
        public final String b;

        public c(int n8, String string2) {
            this.a = n8;
            this.b = string2;
        }
    }

    public static final class d
    extends Enum {
        public static final /* enum */ d p = new d("Brightness.light");
        public static final /* enum */ d q = new d("Brightness.dark");
        public static final /* synthetic */ d[] r;
        public String o;

        static {
            r = d.c();
        }

        public d(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ d[] c() {
            return new d[]{p, q};
        }

        public static d e(String string2) {
            for (d d8 : d.values()) {
                if (!d8.o.equals((Object)string2)) continue;
                return d8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such Brightness: ");
            stringBuilder.append(string2);
            throw new NoSuchFieldException(stringBuilder.toString());
        }

        public static d valueOf(String string2) {
            return (d)Enum.valueOf(d.class, (String)string2);
        }

        public static d[] values() {
            return (d[])r.clone();
        }
    }

    public static final class e
    extends Enum {
        public static final /* enum */ e p = new e("text/plain");
        public static final /* synthetic */ e[] q;
        public String o;

        static {
            q = e.c();
        }

        public e(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ e[] c() {
            return new e[]{p};
        }

        public static e e(String string2) {
            for (e e8 : e.values()) {
                if (!e8.o.equals((Object)string2)) continue;
                return e8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such ClipboardContentFormat: ");
            stringBuilder.append(string2);
            throw new NoSuchFieldException(stringBuilder.toString());
        }

        public static e valueOf(String string2) {
            return (e)Enum.valueOf(e.class, (String)string2);
        }

        public static e[] values() {
            return (e[])q.clone();
        }
    }

    public static final class f
    extends Enum {
        public static final /* enum */ f p = new f("DeviceOrientation.portraitUp");
        public static final /* enum */ f q = new f("DeviceOrientation.portraitDown");
        public static final /* enum */ f r = new f("DeviceOrientation.landscapeLeft");
        public static final /* enum */ f s = new f("DeviceOrientation.landscapeRight");
        public static final /* synthetic */ f[] t;
        public String o;

        static {
            t = f.c();
        }

        public f(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ f[] c() {
            return new f[]{p, q, r, s};
        }

        public static f e(String string2) {
            for (f f8 : f.values()) {
                if (!f8.o.equals((Object)string2)) continue;
                return f8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such DeviceOrientation: ");
            stringBuilder.append(string2);
            throw new NoSuchFieldException(stringBuilder.toString());
        }

        public static f valueOf(String string2) {
            return (f)Enum.valueOf(f.class, (String)string2);
        }

        public static f[] values() {
            return (f[])t.clone();
        }
    }

    public static final class g
    extends Enum {
        public static final /* enum */ g p = new g(null);
        public static final /* enum */ g q = new g("HapticFeedbackType.lightImpact");
        public static final /* enum */ g r = new g("HapticFeedbackType.mediumImpact");
        public static final /* enum */ g s = new g("HapticFeedbackType.heavyImpact");
        public static final /* enum */ g t = new g("HapticFeedbackType.selectionClick");
        public static final /* synthetic */ g[] u;
        public final String o;

        static {
            u = g.c();
        }

        public g(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ g[] c() {
            return new g[]{p, q, r, s, t};
        }

        public static g e(String string2) {
            for (g g8 : g.values()) {
                String string3 = g8.o;
                if ((string3 != null || string2 != null) && (string3 == null || !string3.equals((Object)string2))) continue;
                return g8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such HapticFeedbackType: ");
            stringBuilder.append(string2);
            throw new NoSuchFieldException(stringBuilder.toString());
        }

        public static g valueOf(String string2) {
            return (g)Enum.valueOf(g.class, (String)string2);
        }

        public static g[] values() {
            return (g[])u.clone();
        }
    }

    public static interface h {
        public void a();

        public void f(boolean var1);

        public void g(k var1);

        public void h(List var1);

        public void i(i var1);

        public void j();

        public void k();

        public void l(String var1);

        public void m(c var1);

        public void n(g var1);

        public CharSequence o(e var1);

        public void p(int var1);

        public void q(String var1);

        public boolean r();

        public void s(j var1);
    }

    public static final class i
    extends Enum {
        public static final /* enum */ i p = new i("SystemSoundType.click");
        public static final /* enum */ i q = new i("SystemSoundType.alert");
        public static final /* synthetic */ i[] r;
        public final String o;

        static {
            r = i.c();
        }

        public i(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ i[] c() {
            return new i[]{p, q};
        }

        public static i e(String string2) {
            for (i i8 : i.values()) {
                if (!i8.o.equals((Object)string2)) continue;
                return i8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such SoundType: ");
            stringBuilder.append(string2);
            throw new NoSuchFieldException(stringBuilder.toString());
        }

        public static i valueOf(String string2) {
            return (i)Enum.valueOf(i.class, (String)string2);
        }

        public static i[] values() {
            return (i[])r.clone();
        }
    }

    public static class j {
        public final Integer a;
        public final d b;
        public final Boolean c;
        public final Integer d;
        public final d e;
        public final Integer f;
        public final Boolean g;

        public j(Integer n8, d d8, Boolean bl, Integer n9, d d9, Integer n10, Boolean bl2) {
            this.a = n8;
            this.b = d8;
            this.c = bl;
            this.d = n9;
            this.e = d9;
            this.f = n10;
            this.g = bl2;
        }
    }

    public static final class k
    extends Enum {
        public static final /* enum */ k p = new k("SystemUiMode.leanBack");
        public static final /* enum */ k q = new k("SystemUiMode.immersive");
        public static final /* enum */ k r = new k("SystemUiMode.immersiveSticky");
        public static final /* enum */ k s = new k("SystemUiMode.edgeToEdge");
        public static final /* synthetic */ k[] t;
        public String o;

        static {
            t = k.c();
        }

        public k(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ k[] c() {
            return new k[]{p, q, r, s};
        }

        public static k e(String string2) {
            for (k k8 : k.values()) {
                if (!k8.o.equals((Object)string2)) continue;
                return k8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such SystemUiMode: ");
            stringBuilder.append(string2);
            throw new NoSuchFieldException(stringBuilder.toString());
        }

        public static k valueOf(String string2) {
            return (k)Enum.valueOf(k.class, (String)string2);
        }

        public static k[] values() {
            return (k[])t.clone();
        }
    }

    public static final class l
    extends Enum {
        public static final /* enum */ l p = new l("SystemUiOverlay.top");
        public static final /* enum */ l q = new l("SystemUiOverlay.bottom");
        public static final /* synthetic */ l[] r;
        public String o;

        static {
            r = l.c();
        }

        public l(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ l[] c() {
            return new l[]{p, q};
        }

        public static l e(String string2) {
            for (l l8 : l.values()) {
                if (!l8.o.equals((Object)string2)) continue;
                return l8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such SystemUiOverlay: ");
            stringBuilder.append(string2);
            throw new NoSuchFieldException(stringBuilder.toString());
        }

        public static l valueOf(String string2) {
            return (l)Enum.valueOf(l.class, (String)string2);
        }

        public static l[] values() {
            return (l[])r.clone();
        }
    }

}

