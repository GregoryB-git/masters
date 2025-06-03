/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.PointF
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package g1;

import a3.f;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import g0.M;
import g0.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public c(String string2, int n8, Integer n9, Integer n10, float f8, boolean bl, boolean bl2, boolean bl3, boolean bl4, int n11) {
        this.a = string2;
        this.b = n8;
        this.c = n9;
        this.d = n10;
        this.e = f8;
        this.f = bl;
        this.g = bl2;
        this.h = bl3;
        this.i = bl4;
        this.j = n11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c b(String string2, a object) {
        Integer n8;
        float f8;
        String string3;
        Integer n9;
        g0.a.a(string2.startsWith("Style:"));
        String[] arrstring = TextUtils.split((String)string2.substring(6), (String)",");
        int n10 = arrstring.length;
        int n11 = object.k;
        if (n10 != n11) {
            o.h("SsaStyle", M.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", n11, arrstring.length, string2));
            return null;
        }
        try {
            string3 = arrstring[object.a].trim();
            n10 = object.b;
            n10 = n10 != -1 ? c.e(arrstring[n10].trim()) : -1;
            n11 = object.c;
            n8 = n11 != -1 ? c.h(arrstring[n11].trim()) : null;
            n11 = object.d;
            n9 = n11 != -1 ? c.h(arrstring[n11].trim()) : null;
            n11 = object.e;
            f8 = n11 != -1 ? c.i(arrstring[n11].trim()) : -3.4028235E38f;
        }
        catch (RuntimeException runtimeException) {}
        object = new StringBuilder();
        object.append("Skipping malformed 'Style:' line: '");
        object.append(string2);
        object.append("'");
        o.i("SsaStyle", object.toString(), (Throwable)runtimeException);
        return null;
        n11 = object.f;
        boolean bl = n11 != -1 && c.f(arrstring[n11].trim());
        n11 = object.g;
        boolean bl2 = n11 != -1 && c.f(arrstring[n11].trim());
        n11 = object.h;
        boolean bl3 = n11 != -1 && c.f(arrstring[n11].trim());
        n11 = object.i;
        boolean bl4 = n11 != -1 && c.f(arrstring[n11].trim());
        n11 = object.j;
        n11 = n11 != -1 ? c.g(arrstring[n11].trim()) : -1;
        return new c(string3, n10, n8, n9, f8, bl, bl2, bl3, bl4, n11);
    }

    public static boolean c(int n8) {
        switch (n8) {
            default: {
                return false;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
        }
        return true;
    }

    public static boolean d(int n8) {
        if (n8 != 1 && n8 != 3) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int e(String string2) {
        try {
            int n8 = Integer.parseInt((String)string2.trim());
            boolean bl = c.c(n8);
            if (bl) {
                return n8;
            }
        }
        catch (NumberFormatException numberFormatException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring unknown alignment: ");
        stringBuilder.append(string2);
        o.h("SsaStyle", stringBuilder.toString());
        return -1;
    }

    public static boolean f(String string2) {
        boolean bl = false;
        try {
            int n8 = Integer.parseInt((String)string2);
            if (n8 == 1 || n8 == -1) {
                bl = true;
            }
            return bl;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse boolean value: '");
            stringBuilder.append(string2);
            stringBuilder.append("'");
            o.i("SsaStyle", stringBuilder.toString(), (Throwable)numberFormatException);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int g(String string2) {
        try {
            int n8 = Integer.parseInt((String)string2.trim());
            boolean bl = c.d(n8);
            if (bl) {
                return n8;
            }
        }
        catch (NumberFormatException numberFormatException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring unknown BorderStyle: ");
        stringBuilder.append(string2);
        o.h("SsaStyle", stringBuilder.toString());
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Integer h(String string2) {
        long l8;
        block2 : {
            try {
                l8 = string2.startsWith("&H") ? Long.parseLong((String)string2.substring(2), (int)16) : Long.parseLong((String)string2);
                break block2;
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse color expression: '");
            stringBuilder.append(string2);
            stringBuilder.append("'");
            o.i("SsaStyle", stringBuilder.toString(), (Throwable)illegalArgumentException);
            return null;
        }
        boolean bl = l8 <= 0xFFFFFFFFL;
        g0.a.a(bl);
        int n8 = f.d(l8 >> 24 & 255L ^ 255L);
        int n9 = f.d(l8 >> 16 & 255L);
        int n10 = f.d(l8 >> 8 & 255L);
        return Color.argb((int)n8, (int)f.d(l8 & 255L), (int)n10, (int)n9);
    }

    public static float i(String string2) {
        try {
            float f8 = Float.parseFloat((String)string2);
            return f8;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse font size: '");
            stringBuilder.append(string2);
            stringBuilder.append("'");
            o.i("SsaStyle", stringBuilder.toString(), (Throwable)numberFormatException);
            return -3.4028235E38f;
        }
    }

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;

        public a(int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
            this.g = n14;
            this.h = n15;
            this.i = n16;
            this.j = n17;
            this.k = n18;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public static a a(String var0) {
            var0 = TextUtils.split((String)var0.substring(7), (String)",");
            var9_10 = var8_9 = (var7_8 = (var6_7 = (var5_6 = (var4_5 = (var3_4 = (var2_3 = (var1_2 = (var12_1 = -1))))))));
            var13_11 = 0;
            var10_12 = var2_3;
            var11_13 = var1_2;
            var1_2 = var13_11;
            while (var1_2 < var0.length) {
                block25 : {
                    var14_14 = W2.c.e(var0[var1_2].trim());
                    var14_14.hashCode();
                    switch (var14_14.hashCode()) {
                        case 1988365454: {
                            if (!var14_14.equals((Object)"outlinecolour")) break;
                            var2_3 = 9;
                            ** break;
                        }
                        case 1767875043: {
                            if (!var14_14.equals((Object)"alignment")) break;
                            var2_3 = 8;
                            ** break;
                        }
                        case 767321349: {
                            if (!var14_14.equals((Object)"borderstyle")) break;
                            var2_3 = 7;
                            ** break;
                        }
                        case 366554320: {
                            if (!var14_14.equals((Object)"fontsize")) break;
                            var2_3 = 6;
                            ** break;
                        }
                        case 3373707: {
                            if (!var14_14.equals((Object)"name")) break;
                            var2_3 = 5;
                            ** break;
                        }
                        case 3029637: {
                            if (!var14_14.equals((Object)"bold")) break;
                            var2_3 = 4;
                            ** break;
                        }
                        case -70925746: {
                            if (!var14_14.equals((Object)"primarycolour")) break;
                            var2_3 = 3;
                            ** break;
                        }
                        case -192095652: {
                            if (!var14_14.equals((Object)"strikeout")) break;
                            var2_3 = 2;
                            ** break;
                        }
                        case -1026963764: {
                            if (!var14_14.equals((Object)"underline")) break;
                            var2_3 = 1;
                            ** break;
                        }
                        case -1178781136: {
                            if (var14_14.equals((Object)"italic")) break block25;
                        }
                    }
                    var2_3 = -1;
                    ** break;
                }
                var2_3 = 0;
lbl53: // 11 sources:
                switch (var2_3) {
                    default: {
                        ** break;
                    }
                    case 9: {
                        var3_4 = var1_2;
                        ** break;
                    }
                    case 8: {
                        var11_13 = var1_2;
                        ** break;
                    }
                    case 7: {
                        var9_10 = var1_2;
                        ** break;
                    }
                    case 6: {
                        var4_5 = var1_2;
                        ** break;
                    }
                    case 5: {
                        var12_1 = var1_2;
                        ** break;
                    }
                    case 4: {
                        var5_6 = var1_2;
                        ** break;
                    }
                    case 3: {
                        var10_12 = var1_2;
                        ** break;
                    }
                    case 2: {
                        var8_9 = var1_2;
                        ** break;
                    }
                    case 1: {
                        var7_8 = var1_2;
                        ** break;
                    }
                    case 0: 
                }
                var6_7 = var1_2;
lbl85: // 11 sources:
                ++var1_2;
            }
            return null;
        }
    }

    public static final class b {
        public static final Pattern c = Pattern.compile((String)"\\{([^}]*)\\}");
        public static final Pattern d = Pattern.compile((String)M.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern e = Pattern.compile((String)M.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern f = Pattern.compile((String)"\\\\an(\\d+)");
        public final int a;
        public final PointF b;

        public b(int n8, PointF pointF) {
            this.a = n8;
            this.b = pointF;
        }

        public static int a(String string2) {
            if ((string2 = f.matcher((CharSequence)string2)).find()) {
                return c.e((String)g0.a.e(string2.group(1)));
            }
            return -1;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static b b(String string2) {
            Matcher matcher = c.matcher((CharSequence)string2);
            string2 = null;
            int n8 = -1;
            while (matcher.find()) {
                String string3;
                String string4 = (String)g0.a.e(matcher.group(1));
                try {
                    PointF pointF = b.c(string4);
                    string3 = string2;
                    if (pointF != null) {
                        string3 = pointF;
                    }
                }
                catch (RuntimeException runtimeException) {
                    string3 = string2;
                }
                try {
                    int n9 = b.a(string4);
                    string2 = string3;
                    if (n9 == -1) continue;
                    n8 = n9;
                    string2 = string3;
                    continue;
                }
                catch (RuntimeException runtimeException) {
                    string2 = string3;
                    continue;
                }
                break;
            }
            return new b(n8, (PointF)string2);
        }

        public static PointF c(String string2) {
            block6 : {
                Object object;
                block5 : {
                    Matcher matcher;
                    boolean bl;
                    block4 : {
                        Matcher matcher2 = d.matcher((CharSequence)string2);
                        matcher = e.matcher((CharSequence)string2);
                        boolean bl2 = matcher2.find();
                        bl = matcher.find();
                        if (!bl2) break block4;
                        if (bl) {
                            object = new StringBuilder();
                            object.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                            object.append(string2);
                            object.append("'");
                            o.f("SsaStyle.Overrides", object.toString());
                        }
                        object = matcher2.group(1);
                        string2 = matcher2.group(2);
                        break block5;
                    }
                    if (!bl) break block6;
                    object = matcher.group(1);
                    string2 = matcher.group(2);
                }
                return new PointF(Float.parseFloat((String)((String)g0.a.e(object)).trim()), Float.parseFloat((String)((String)g0.a.e(string2)).trim()));
            }
            return null;
        }

        public static String d(String string2) {
            return c.matcher((CharSequence)string2).replaceAll("");
        }
    }

}

