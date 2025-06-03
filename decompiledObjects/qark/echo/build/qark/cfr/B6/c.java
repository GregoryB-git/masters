/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package B6;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class c {
    public static final char[] j = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;

    public c(a a8) {
        this.a = a8.a;
        this.b = c.q(a8.b, false);
        this.c = c.q(a8.c, false);
        this.d = a8.d;
        this.e = a8.c();
        this.f = this.r(a8.f, false);
        Object object = a8.g;
        Object var3_3 = null;
        object = object != null ? this.r((List)object, true) : null;
        this.g = object;
        String string2 = a8.h;
        object = var3_3;
        if (string2 != null) {
            object = c.q(string2, false);
        }
        this.h = object;
        this.i = a8.toString();
    }

    public static String a(String string2, int n8, int n9, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset) {
        int n10;
        for (int i8 = n8; i8 < n9; i8 += Character.charCount((int)n10)) {
            n10 = string2.codePointAt(i8);
            if (!(n10 < 32 || n10 == 127 || n10 >= 128 && bl4)) {
                if (!(string3.indexOf(n10) != -1 || n10 == 37 && (!bl || bl2 && !c.t(string2, i8, n9)) || n10 == 43 && bl3)) {
                    continue;
                }
            }
            D6.a a8 = new D6.a();
            a8.H(string2, n8, i8);
            c.c(a8, string2, i8, n9, string3, bl, bl2, bl3, bl4, charset);
            return a8.u();
        }
        return string2.substring(n8, n9);
    }

    public static String b(String string2, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        return c.a(string2, 0, string2.length(), string3, bl, bl2, bl3, bl4, null);
    }

    /*
     * Exception decompiling
     */
    public static void c(D6.a var0, String var1_1, int var2_2, int var3_3, String var4_4, boolean var5_5, boolean var6_6, boolean var7_7, boolean var8_8, Charset var9_9) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:219)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:619)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:45)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:679)
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

    public static int d(String string2) {
        if (string2.equals((Object)"http")) {
            return 80;
        }
        if (string2.equals((Object)"https")) {
            return 443;
        }
        return -1;
    }

    public static c k(String string2) {
        return new a().h(null, string2).a();
    }

    public static void l(StringBuilder stringBuilder, List list) {
        int n8 = list.size();
        for (int i8 = 0; i8 < n8; i8 += 2) {
            String string2 = (String)list.get(i8);
            String string3 = (String)list.get(i8 + 1);
            if (i8 > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append(string2);
            if (string3 == null) continue;
            stringBuilder.append('=');
            stringBuilder.append(string3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static c n(String object) {
        try {
            return c.k((String)object);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public static void o(StringBuilder stringBuilder, List list) {
        int n8 = list.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            stringBuilder.append('/');
            stringBuilder.append((String)list.get(i8));
        }
    }

    public static String p(String string2, int n8, int n9, boolean bl) {
        for (int i8 = n8; i8 < n9; ++i8) {
            char c8 = string2.charAt(i8);
            if (!(c8 == '%' || c8 == '+' && bl)) {
                continue;
            }
            D6.a a8 = new D6.a();
            a8.H(string2, n8, i8);
            c.s(a8, string2, i8, n9, bl);
            return a8.u();
        }
        return string2.substring(n8, n9);
    }

    public static String q(String string2, boolean bl) {
        return c.p(string2, 0, string2.length(), bl);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void s(D6.a var0, String var1_1, int var2_2, int var3_3, boolean var4_4) {
        while (var2_2 < var3_3) {
            block4 : {
                block3 : {
                    var6_6 = var1_1.codePointAt(var2_2);
                    if (var6_6 != 37 || (var5_5 = var2_2 + 2) >= var3_3) break block3;
                    var7_7 = C6.a.e(var1_1.charAt(var2_2 + 1));
                    var8_8 = C6.a.e(var1_1.charAt(var5_5));
                    if (var7_7 == -1 || var8_8 == -1) ** GOTO lbl-1000
                    var0.D((var7_7 << 4) + var8_8);
                    var2_2 = var5_5;
                    break block4;
                }
                if (var6_6 == 43 && var4_4) {
                    var0.D(32);
                } else lbl-1000: // 2 sources:
                {
                    var0.I(var6_6);
                }
            }
            var2_2 += Character.charCount((int)var6_6);
        }
    }

    public static boolean t(String string2, int n8, int n9) {
        int n10 = n8 + 2;
        if (n10 < n9 && string2.charAt(n8) == '%' && C6.a.e(string2.charAt(n8 + 1)) != -1 && C6.a.e(string2.charAt(n10)) != -1) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static List u(String string2) {
        ArrayList arrayList = new ArrayList();
        int n8 = 0;
        while (n8 <= string2.length()) {
            int n9;
            String string3;
            int n10 = n9 = string2.indexOf(38, n8);
            if (n9 == -1) {
                n10 = string2.length();
            }
            if ((n9 = string2.indexOf(61, n8)) != -1 && n9 <= n10) {
                arrayList.add((Object)string2.substring(n8, n9));
                string3 = string2.substring(n9 + 1, n10);
            } else {
                arrayList.add((Object)string2.substring(n8, n10));
                string3 = null;
            }
            arrayList.add((Object)string3);
            n8 = n10 + 1;
        }
        return arrayList;
    }

    public String e() {
        if (this.h == null) {
            return null;
        }
        int n8 = this.i.indexOf(35);
        return this.i.substring(n8 + 1);
    }

    public boolean equals(Object object) {
        if (object instanceof c && ((c)object).i.equals((Object)this.i)) {
            return true;
        }
        return false;
    }

    public String f() {
        if (this.c.isEmpty()) {
            return "";
        }
        int n8 = this.i.indexOf(58, this.a.length() + 3);
        int n9 = this.i.indexOf(64);
        return this.i.substring(n8 + 1, n9);
    }

    public String g() {
        int n8 = this.i.indexOf(47, this.a.length() + 3);
        String string2 = this.i;
        int n9 = C6.a.i(string2, n8, string2.length(), "?#");
        return this.i.substring(n8, n9);
    }

    public List h() {
        int n8 = this.i.indexOf(47, this.a.length() + 3);
        String string2 = this.i;
        int n9 = C6.a.i(string2, n8, string2.length(), "?#");
        string2 = new ArrayList();
        while (n8 < n9) {
            int n10 = n8 + 1;
            n8 = C6.a.h(this.i, n10, n9, '/');
            string2.add((Object)this.i.substring(n10, n8));
        }
        return string2;
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public String i() {
        if (this.g == null) {
            return null;
        }
        int n8 = this.i.indexOf(63) + 1;
        String string2 = this.i;
        int n9 = C6.a.h(string2, n8, string2.length(), '#');
        return this.i.substring(n8, n9);
    }

    public String j() {
        if (this.b.isEmpty()) {
            return "";
        }
        int n8 = this.a.length() + 3;
        String string2 = this.i;
        int n9 = C6.a.i(string2, n8, string2.length(), ":@");
        return this.i.substring(n8, n9);
    }

    public a m() {
        a a8 = new a();
        a8.a = this.a;
        a8.b = this.j();
        a8.c = this.f();
        a8.d = this.d;
        int n8 = this.e != c.d(this.a) ? this.e : -1;
        a8.e = n8;
        a8.f.clear();
        a8.f.addAll((Collection)this.h());
        a8.d(this.i());
        a8.h = this.e();
        return a8;
    }

    public final List r(List list, boolean bl) {
        int n8 = list.size();
        ArrayList arrayList = new ArrayList(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            String string2 = (String)list.get(i8);
            string2 = string2 != null ? c.q(string2, bl) : null;
            arrayList.add((Object)string2);
        }
        return Collections.unmodifiableList((List)arrayList);
    }

    public String toString() {
        return this.i;
    }

    public static final class a {
        public String a;
        public String b = "";
        public String c = "";
        public String d;
        public int e = -1;
        public final List f;
        public List g;
        public String h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add((Object)"");
        }

        public static String b(String string2, int n8, int n9) {
            return C6.a.a(c.p(string2, n8, n9, false));
        }

        public static int i(String string2, int n8, int n9) {
            try {
                n8 = Integer.parseInt((String)c.a(string2, n8, n9, "", false, false, false, true, null));
                if (n8 > 0 && n8 <= 65535) {
                    return n8;
                }
                return -1;
            }
            catch (NumberFormatException numberFormatException) {
                return -1;
            }
        }

        public static int l(String string2, int n8, int n9) {
            while (n8 < n9) {
                char c8 = string2.charAt(n8);
                if (c8 != ':') {
                    int n10;
                    block5 : {
                        n10 = n8;
                        if (c8 != '[') {
                            n10 = n8;
                        } else {
                            do {
                                n10 = n8 = n10 + 1;
                                if (n8 >= n9) break block5;
                                n10 = n8;
                            } while (string2.charAt(n8) != ']');
                            n10 = n8;
                        }
                    }
                    n8 = n10 + 1;
                    continue;
                }
                return n8;
            }
            return n9;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static int p(String string2, int n8, int n9) {
            char c8;
            int n10;
            block11 : {
                block10 : {
                    if (n9 - n8 < 2) {
                        return -1;
                    }
                    c8 = string2.charAt(n8);
                    if (c8 < 'a') break block10;
                    n10 = n8;
                    if (c8 <= 'z') break block11;
                }
                if (c8 < 'A') return -1;
                n10 = n8;
                if (c8 > 'Z') {
                    return -1;
                }
            }
            while ((n8 = n10 + 1) < n9) {
                c8 = string2.charAt(n8);
                if (c8 >= 'a') {
                    n10 = n8;
                    if (c8 <= 'z') continue;
                }
                if (c8 >= 'A') {
                    n10 = n8;
                    if (c8 <= 'Z') continue;
                }
                if (c8 >= '0') {
                    n10 = n8;
                    if (c8 <= '9') continue;
                }
                n10 = n8;
                if (c8 == '+') continue;
                n10 = n8;
                if (c8 == '-') continue;
                if (c8 == '.') {
                    n10 = n8;
                    continue;
                }
                if (c8 != ':') return -1;
                return n8;
            }
            return -1;
        }

        public static int q(String string2, int n8, int n9) {
            char c8;
            int n10 = 0;
            while (n8 < n9 && ((c8 = string2.charAt(n8)) == '\\' || c8 == '/')) {
                ++n10;
                ++n8;
            }
            return n10;
        }

        public c a() {
            if (this.a != null) {
                if (this.d != null) {
                    return new c(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public int c() {
            int n8 = this.e;
            if (n8 != -1) {
                return n8;
            }
            return c.d(this.a);
        }

        public a d(String string2) {
            string2 = string2 != null ? c.u(c.b(string2, " \"'<>#", true, false, true, true)) : null;
            this.g = string2;
            return this;
        }

        public a e(String string2) {
            string2 = string2 != null ? c.b(string2, "", false, false, false, false) : null;
            this.h = string2;
            return this;
        }

        public final boolean f(String string2) {
            if (!string2.equals((Object)".") && !string2.equalsIgnoreCase("%2e")) {
                return false;
            }
            return true;
        }

        public final boolean g(String string2) {
            if (!(string2.equals((Object)"..") || string2.equalsIgnoreCase("%2e.") || string2.equalsIgnoreCase(".%2e") || string2.equalsIgnoreCase("%2e%2e"))) {
                return false;
            }
            return true;
        }

        public a h(c object, String string2) {
            block22 : {
                int n8;
                int n9;
                block26 : {
                    int n10;
                    int n11;
                    int n12;
                    block25 : {
                        int n13;
                        block23 : {
                            block24 : {
                                block20 : {
                                    block18 : {
                                        block21 : {
                                            block19 : {
                                                n9 = C6.a.k(string2, 0, string2.length());
                                                n12 = a.p(string2, n9, n11 = C6.a.l(string2, n9, string2.length()));
                                                if (n12 == -1) break block18;
                                                if (!string2.regionMatches(true, n9, "https:", 0, 6)) break block19;
                                                this.a = "https";
                                                n9 += 6;
                                                break block20;
                                            }
                                            if (!string2.regionMatches(true, n9, "http:", 0, 5)) break block21;
                                            this.a = "http";
                                            n9 += 5;
                                            break block20;
                                        }
                                        object = new StringBuilder();
                                        object.append("Expected URL scheme 'http' or 'https' but was '");
                                        object.append(string2.substring(0, n12));
                                        object.append("'");
                                        throw new IllegalArgumentException(object.toString());
                                    }
                                    if (object == null) break block22;
                                    this.a = object.a;
                                }
                                n8 = a.q(string2, n9, n11);
                                if (n8 >= 2 || object == null || !object.a.equals((Object)this.a)) break block23;
                                this.b = object.j();
                                this.c = object.f();
                                this.d = object.d;
                                this.e = object.e;
                                this.f.clear();
                                this.f.addAll((Collection)object.h());
                                if (n9 == n11) break block24;
                                n12 = n9;
                                if (string2.charAt(n9) != '#') break block25;
                            }
                            this.d(object.i());
                            n12 = n9;
                            break block25;
                        }
                        n12 = n10 = 0;
                        n8 = n9 + n8;
                        n9 = n10;
                        do {
                            n13 = (n10 = C6.a.i(string2, n8, n11, "@/\\?#")) != n11 ? (int)string2.charAt(n10) : -1;
                            if (n13 == -1 || n13 == 35 || n13 == 47 || n13 == 92 || n13 == 63) break;
                            if (n13 != 64) continue;
                            if (n9 == 0) {
                                int n14 = C6.a.h(string2, n8, n10, ':');
                                n13 = n10;
                                String string3 = c.a(string2, n8, n14, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                object = string3;
                                if (n12 != 0) {
                                    object = new StringBuilder();
                                    object.append(this.b);
                                    object.append("%40");
                                    object.append(string3);
                                    object = object.toString();
                                }
                                this.b = object;
                                if (n14 != n13) {
                                    this.c = c.a(string2, n14 + 1, n13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    n9 = 1;
                                }
                                n12 = 1;
                            } else {
                                object = new StringBuilder();
                                object.append(this.c);
                                object.append("%40");
                                object.append(c.a(string2, n8, n10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                this.c = object.toString();
                            }
                            n8 = n10 + 1;
                        } while (true);
                        n9 = a.l(string2, n8, n10);
                        n12 = n9 + 1;
                        if (n12 < n10) {
                            this.d = a.b(string2, n8, n9);
                            this.e = n13 = a.i(string2, n12, n10);
                            if (n13 == -1) {
                                object = new StringBuilder();
                                object.append("Invalid URL port: \"");
                                object.append(string2.substring(n12, n10));
                                object.append('\"');
                                throw new IllegalArgumentException(object.toString());
                            }
                        } else {
                            this.d = a.b(string2, n8, n9);
                            this.e = c.d(this.a);
                        }
                        if (this.d == null) break block26;
                        n12 = n10;
                    }
                    n10 = C6.a.i(string2, n12, n11, "?#");
                    this.o(string2, n12, n10);
                    n9 = n10;
                    if (n10 < n11) {
                        n9 = n10;
                        if (string2.charAt(n10) == '?') {
                            n9 = C6.a.h(string2, n10, n11, '#');
                            this.g = c.u(c.a(string2, n10 + 1, n9, " \"'<>#", true, false, true, true, null));
                        }
                    }
                    if (n9 < n11 && string2.charAt(n9) == '#') {
                        this.h = c.a(string2, 1 + n9, n11, "", true, false, false, false, null);
                    }
                    return this;
                }
                object = new StringBuilder();
                object.append("Invalid URL host: \"");
                object.append(string2.substring(n8, n9));
                object.append('\"');
                throw new IllegalArgumentException(object.toString());
            }
            throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
        }

        public a j(String string2) {
            if (string2 != null) {
                this.c = c.b(string2, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public final void k() {
            List list = this.f;
            if (((String)list.remove(list.size() - 1)).isEmpty() && !this.f.isEmpty()) {
                list = this.f;
                list.set(list.size() - 1, (Object)"");
                return;
            }
            this.f.add((Object)"");
        }

        public final void m(String string2, int n8, int n9, boolean bl, boolean bl2) {
            if (this.f(string2 = c.a(string2, n8, n9, " \"<>^`{}|/\\?#", bl2, false, false, true, null))) {
                return;
            }
            if (this.g(string2)) {
                this.k();
                return;
            }
            List list = this.f;
            if (((String)list.get(list.size() - 1)).isEmpty()) {
                list = this.f;
                list.set(list.size() - 1, (Object)string2);
            } else {
                this.f.add((Object)string2);
            }
            if (bl) {
                this.f.add((Object)"");
            }
        }

        public a n(String string2) {
            string2 = string2 != null ? c.u(c.b(string2, " \"'<>#", false, false, true, true)) : null;
            this.g = string2;
            return this;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public final void o(String var1_1, int var2_2, int var3_3) {
            block2 : {
                if (var2_2 == var3_3) {
                    return;
                }
                var4_4 = var1_1.charAt(var2_2);
                if (var4_4 != 47 && var4_4 != 92) break block2;
                this.f.clear();
                this.f.add((Object)"");
                ** GOTO lbl18
            }
            var6_5 = this.f;
            var6_5.set(var6_5.size() - 1, (Object)"");
            while (var2_2 < var3_3) {
                var4_4 = C6.a.i(var1_1, var2_2, var3_3, "/\\");
                var5_6 = var4_4 < var3_3;
                this.m(var1_1, var2_2, var4_4, var5_6, true);
                var2_2 = var4_4;
                if (!var5_6) continue;
                var2_2 = var4_4;
lbl18: // 2 sources:
                ++var2_2;
            }
        }

        public a r(String string2) {
            if (string2 != null) {
                this.b = c.b(string2, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        /*
         * Enabled aggressive block sorting
         */
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            String string2 = this.a;
            if (string2 != null) {
                stringBuilder.append(string2);
                string2 = "://";
            } else {
                string2 = "//";
            }
            stringBuilder.append(string2);
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                stringBuilder.append(this.b);
                if (!this.c.isEmpty()) {
                    stringBuilder.append(':');
                    stringBuilder.append(this.c);
                }
                stringBuilder.append('@');
            }
            if ((string2 = this.d) != null) {
                if (string2.indexOf(58) != -1) {
                    stringBuilder.append('[');
                    stringBuilder.append(this.d);
                    stringBuilder.append(']');
                } else {
                    stringBuilder.append(this.d);
                }
            }
            if (this.e != -1 || this.a != null) {
                int n8 = this.c();
                string2 = this.a;
                if (string2 == null || n8 != c.d(string2)) {
                    stringBuilder.append(':');
                    stringBuilder.append(n8);
                }
            }
            c.o(stringBuilder, this.f);
            if (this.g != null) {
                stringBuilder.append('?');
                c.l(stringBuilder, this.g);
            }
            if (this.h != null) {
                stringBuilder.append('#');
                stringBuilder.append(this.h);
            }
            return stringBuilder.toString();
        }
    }

}

