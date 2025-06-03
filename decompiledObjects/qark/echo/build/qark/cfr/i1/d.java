/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  java.io.ByteArrayInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 *  org.xmlpull.v1.XmlPullParserFactory
 */
package i1;

import android.text.Layout;
import c1.i;
import c1.k;
import c1.m;
import c1.s;
import c1.t;
import g0.M;
import g0.N;
import g0.o;
import i1.c;
import i1.e;
import i1.g;
import i1.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class d
implements t {
    public static final Pattern b = Pattern.compile((String)"^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile((String)"^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile((String)"^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile((String)"^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile((String)"^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile((String)"^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile((String)"^(\\d+) (\\d+)$");
    public static final a i = new a(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public d() {
        try {
            XmlPullParserFactory xmlPullParserFactory;
            this.a = xmlPullParserFactory = XmlPullParserFactory.newInstance();
            xmlPullParserFactory.setNamespaceAware(true);
            return;
        }
        catch (XmlPullParserException xmlPullParserException) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", (Throwable)xmlPullParserException);
        }
    }

    public static g e(g g8) {
        g g9 = g8;
        if (g8 == null) {
            g9 = new g();
        }
        return g9;
    }

    public static boolean f(String string2) {
        if (!(string2.equals((Object)"tt") || string2.equals((Object)"head") || string2.equals((Object)"body") || string2.equals((Object)"div") || string2.equals((Object)"p") || string2.equals((Object)"span") || string2.equals((Object)"br") || string2.equals((Object)"style") || string2.equals((Object)"styling") || string2.equals((Object)"layout") || string2.equals((Object)"region") || string2.equals((Object)"metadata") || string2.equals((Object)"image") || string2.equals((Object)"data") || string2.equals((Object)"information"))) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment g(String string2) {
        string2 = W2.c.e(string2);
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 109757538: {
                if (!string2.equals((Object)"start")) break;
                n9 = 4;
                break;
            }
            case 108511772: {
                if (!string2.equals((Object)"right")) break;
                n9 = 3;
                break;
            }
            case 3317767: {
                if (!string2.equals((Object)"left")) break;
                n9 = 2;
                break;
            }
            case 100571: {
                if (!string2.equals((Object)"end")) break;
                n9 = 1;
                break;
            }
            case -1364013995: {
                if (!string2.equals((Object)"center")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return null;
            }
            case 2: 
            case 4: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            case 1: 
            case 3: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            case 0: 
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int h(XmlPullParser xmlPullParser, int n8) {
        int n9;
        int n10;
        boolean bl;
        block6 : {
            block5 : {
                String string2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
                if (string2 == null) {
                    return n8;
                }
                xmlPullParser = h.matcher((CharSequence)string2);
                if (!xmlPullParser.matches()) {
                    xmlPullParser = new StringBuilder();
                } else {
                    bl = true;
                    try {
                        n9 = Integer.parseInt((String)((String)g0.a.e(xmlPullParser.group(1))));
                        n10 = Integer.parseInt((String)((String)g0.a.e(xmlPullParser.group(2))));
                        if (n9 == 0 || n10 == 0) break block5;
                        break block6;
                    }
                    catch (NumberFormatException numberFormatException) {}
                    xmlPullParser = new StringBuilder();
                }
                xmlPullParser.append("Ignoring malformed cell resolution: ");
                xmlPullParser.append(string2);
                o.h("TtmlParser", xmlPullParser.toString());
                return n8;
            }
            bl = false;
        }
        xmlPullParser = new StringBuilder();
        xmlPullParser.append("Invalid cell resolution ");
        xmlPullParser.append(n9);
        xmlPullParser.append(" ");
        xmlPullParser.append(n10);
        g0.a.b(bl, xmlPullParser.toString());
        return n10;
    }

    public static void i(String string2, g g8) {
        Matcher matcher;
        block16 : {
            block15 : {
                block14 : {
                    matcher = M.b1(string2, "\\s+");
                    if (matcher.length != 1) break block14;
                    matcher = d.matcher((CharSequence)string2);
                    break block15;
                }
                if (matcher.length != 2) break block16;
                matcher = d.matcher((CharSequence)matcher[1]);
                o.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
            }
            if (matcher.matches()) {
                string2 = (String)g0.a.e(matcher.group(3));
                string2.hashCode();
                int n8 = string2.hashCode();
                int n9 = -1;
                switch (n8) {
                    default: {
                        break;
                    }
                    case 3592: {
                        if (!string2.equals((Object)"px")) break;
                        n9 = 2;
                        break;
                    }
                    case 3240: {
                        if (!string2.equals((Object)"em")) break;
                        n9 = 1;
                        break;
                    }
                    case 37: {
                        if (!string2.equals((Object)"%")) break;
                        n9 = 0;
                    }
                }
                switch (n9) {
                    default: {
                        g8 = new StringBuilder();
                        g8.append("Invalid unit for fontSize: '");
                        g8.append(string2);
                        g8.append("'.");
                        throw new m(g8.toString());
                    }
                    case 2: {
                        g8.z(1);
                        break;
                    }
                    case 1: {
                        g8.z(2);
                        break;
                    }
                    case 0: {
                        g8.z(3);
                    }
                }
                g8.y(Float.parseFloat((String)((String)g0.a.e(matcher.group(1)))));
                return;
            }
            g8 = new StringBuilder();
            g8.append("Invalid expression for fontSize: '");
            g8.append(string2);
            g8.append("'.");
            throw new m(g8.toString());
        }
        string2 = new StringBuilder();
        string2.append("Invalid number of entries for fontSize: ");
        string2.append(matcher.length);
        string2.append(".");
        throw new m(string2.toString());
    }

    public static a j(XmlPullParser object) {
        float f8;
        Object object2 = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int n8 = object2 != null ? Integer.parseInt((String)object2) : 30;
        object2 = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (object2 != null) {
            boolean bl = (object2 = M.b1((String)object2, " ")).length == 2;
            g0.a.b(bl, "frameRateMultiplier doesn't have 2 parts");
            f8 = (float)Integer.parseInt((String)object2[0]) / (float)Integer.parseInt((String)object2[1]);
        } else {
            f8 = 1.0f;
        }
        object2 = i;
        int n9 = object2.b;
        String string2 = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (string2 != null) {
            n9 = Integer.parseInt((String)string2);
        }
        int n10 = object2.c;
        if ((object = object.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate")) != null) {
            n10 = Integer.parseInt((String)object);
        }
        return new a((float)n8 * f8, n9, n10);
    }

    public static Map k(XmlPullParser xmlPullParser, Map map, int n8, b b8, Map map2, Map map3) {
        do {
            Object object;
            xmlPullParser.next();
            if (N.f(xmlPullParser, "style")) {
                Object object2 = N.a(xmlPullParser, "style");
                object = d.p(xmlPullParser, new g());
                if (object2 != null) {
                    object2 = d.q((String)object2);
                    int n9 = object2.length;
                    for (int i8 = 0; i8 < n9; ++i8) {
                        object.a((g)map.get(object2[i8]));
                    }
                }
                if ((object2 = object.g()) == null) continue;
                map.put(object2, object);
                continue;
            }
            if (N.f(xmlPullParser, "region")) {
                object = d.n(xmlPullParser, n8, b8);
                if (object == null) continue;
                map2.put((Object)object.a, object);
                continue;
            }
            if (!N.f(xmlPullParser, "metadata")) continue;
            d.l(xmlPullParser, map3);
        } while (!N.d(xmlPullParser, "head"));
        return map;
    }

    public static void l(XmlPullParser xmlPullParser, Map map) {
        do {
            String string2;
            xmlPullParser.next();
            if (!N.f(xmlPullParser, "image") || (string2 = N.a(xmlPullParser, "id")) == null) continue;
            map.put((Object)string2, (Object)xmlPullParser.nextText());
        } while (!N.d(xmlPullParser, "metadata"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static c m(XmlPullParser var0, c var1_1, Map var2_2, a var3_3) {
        var6_4 = var0.getAttributeCount();
        var27_5 = d.p(var0, null);
        var22_6 = null;
        var21_7 = var22_6;
        var25_8 = "";
        var7_10 = -9223372036854775807L;
        var9_11 = -9223372036854775807L;
        var11_12 = -9223372036854775807L;
        for (var5_9 = 0; var5_9 < var6_4; ++var5_9) {
            block25 : {
                var23_17 = var0.getAttributeName(var5_9);
                var26_19 = var0.getAttributeValue(var5_9);
                var23_17.hashCode();
                switch (var23_17.hashCode()) {
                    case 1292595405: {
                        if (!var23_17.equals((Object)"backgroundImage")) break;
                        var4_13 = 5;
                        ** break;
                    }
                    case 109780401: {
                        if (!var23_17.equals((Object)"style")) break;
                        var4_13 = 4;
                        ** break;
                    }
                    case 93616297: {
                        if (!var23_17.equals((Object)"begin")) break;
                        var4_13 = 3;
                        ** break;
                    }
                    case 100571: {
                        if (!var23_17.equals((Object)"end")) break;
                        var4_13 = 2;
                        ** break;
                    }
                    case 99841: {
                        if (!var23_17.equals((Object)"dur")) break;
                        var4_13 = 1;
                        ** break;
                    }
                    case -934795532: {
                        if (var23_17.equals((Object)"region")) break block25;
                    }
                }
                var4_13 = -1;
                ** break;
            }
            var4_13 = 0;
lbl40: // 7 sources:
            switch (var4_13) {
                default: {
                    var24_18 = var22_6;
                    var23_17 = var21_7;
                    var13_14 = var7_10;
                    var15_15 = var9_11;
                    var17_16 = var11_12;
                    break;
                }
                case 5: {
                    var24_18 = var22_6;
                    var23_17 = var21_7;
                    var13_14 = var7_10;
                    var15_15 = var9_11;
                    var17_16 = var11_12;
                    if (!var26_19.startsWith("#")) break;
                    var23_17 = var26_19.substring(1);
                    var17_16 = var11_12;
                    var15_15 = var9_11;
                    var13_14 = var7_10;
                    var24_18 = var22_6;
                    break;
                }
                case 4: {
                    var26_19 = d.q((String)var26_19);
                    var24_18 = var22_6;
                    var23_17 = var21_7;
                    var13_14 = var7_10;
                    var15_15 = var9_11;
                    var17_16 = var11_12;
                    if (var26_19.length <= 0) break;
                    var24_18 = var26_19;
                    var23_17 = var21_7;
                    var13_14 = var7_10;
                    var15_15 = var9_11;
                    var17_16 = var11_12;
                    break;
                }
                case 3: {
                    var13_14 = d.r((String)var26_19, var3_3);
                    var24_18 = var22_6;
                    var23_17 = var21_7;
                    var15_15 = var9_11;
                    var17_16 = var11_12;
                    break;
                }
                case 2: {
                    var15_15 = d.r((String)var26_19, var3_3);
                    var24_18 = var22_6;
                    var23_17 = var21_7;
                    var13_14 = var7_10;
                    var17_16 = var11_12;
                    break;
                }
                case 1: {
                    var17_16 = d.r((String)var26_19, var3_3);
                    var24_18 = var22_6;
                    var23_17 = var21_7;
                    var13_14 = var7_10;
                    var15_15 = var9_11;
                    break;
                }
                case 0: {
                    var24_18 = var22_6;
                    var23_17 = var21_7;
                    var13_14 = var7_10;
                    var15_15 = var9_11;
                    var17_16 = var11_12;
                    if (!var2_2.containsKey((Object)var26_19)) break;
                    var25_8 = var26_19;
                    var17_16 = var11_12;
                    var15_15 = var9_11;
                    var13_14 = var7_10;
                    var23_17 = var21_7;
                    var24_18 = var22_6;
                }
            }
            var22_6 = var24_18;
            var21_7 = var23_17;
            var7_10 = var13_14;
            var9_11 = var15_15;
            var11_12 = var17_16;
        }
        if (var1_1 != null) {
            var19_20 = var1_1.d;
            var17_16 = var7_10;
            var15_15 = var9_11;
            if (var19_20 != -9223372036854775807L) {
                var13_14 = var7_10;
                if (var7_10 != -9223372036854775807L) {
                    var13_14 = var7_10 + var19_20;
                }
                var17_16 = var13_14;
                var15_15 = var9_11;
                if (var9_11 != -9223372036854775807L) {
                    var15_15 = var9_11 + var19_20;
                    var17_16 = var13_14;
                }
            }
        } else {
            var17_16 = var7_10;
            var15_15 = var9_11;
        }
        if (var15_15 == -9223372036854775807L) {
            if (var11_12 != -9223372036854775807L) {
                var7_10 = var17_16 + var11_12;
                return c.c(var0.getName(), var17_16, var7_10, var27_5, var22_6, (String)var25_8, (String)var21_7, var1_1);
            }
            if (var1_1 != null && (var7_10 = var1_1.e) != -9223372036854775807L) {
                return c.c(var0.getName(), var17_16, var7_10, var27_5, var22_6, (String)var25_8, (String)var21_7, var1_1);
            }
        }
        var7_10 = var15_15;
        return c.c(var0.getName(), var17_16, var7_10, var27_5, var22_6, (String)var25_8, (String)var21_7, var1_1);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static e n(XmlPullParser var0, int var1_5, b var2_6) {
        block38 : {
            block31 : {
                block39 : {
                    block24 : {
                        block37 : {
                            block25 : {
                                block28 : {
                                    block29 : {
                                        block35 : {
                                            block36 : {
                                                block34 : {
                                                    block32 : {
                                                        block33 : {
                                                            block23 : {
                                                                block30 : {
                                                                    block27 : {
                                                                        block22 : {
                                                                            block26 : {
                                                                                var13_7 = N.a((XmlPullParser)var0, "id");
                                                                                if (var13_7 == null) {
                                                                                    return null;
                                                                                }
                                                                                var12_8 = N.a((XmlPullParser)var0, "origin");
                                                                                if (var12_8 == null) break block24;
                                                                                var15_9 = d.f;
                                                                                var16_10 = var15_9.matcher((CharSequence)var12_8);
                                                                                var14_11 = d.g;
                                                                                var17_12 = var14_11.matcher((CharSequence)var12_8);
                                                                                var10_13 = var16_10.matches();
                                                                                var11_14 = "Ignoring region with malformed origin: ";
                                                                                if (var10_13) {
                                                                                    var4_15 = Float.parseFloat((String)((String)g0.a.e(var16_10.group(1)))) / 100.0f;
                                                                                    var3_16 = Float.parseFloat((String)((String)g0.a.e(var16_10.group(2))));
                                                                                    var3_16 /= 100.0f;
                                                                                    break block22;
                                                                                }
                                                                                if (!var17_12.matches()) break block25;
                                                                                if (var2_6 != null) break block26;
                                                                                var0 = new StringBuilder();
                                                                                break block27;
                                                                            }
                                                                            var8_17 = Integer.parseInt((String)((String)g0.a.e(var17_12.group(1))));
                                                                            var9_18 = Integer.parseInt((String)((String)g0.a.e(var17_12.group(2))));
                                                                            var4_15 = (float)var8_17 / (float)var2_6.a;
                                                                            var3_16 = var9_18;
                                                                            var8_17 = var2_6.b;
                                                                            var3_16 /= (float)var8_17;
                                                                        }
                                                                        var11_14 = N.a((XmlPullParser)var0, "extent");
                                                                        if (var11_14 == null) break block28;
                                                                        var15_9 = var15_9.matcher((CharSequence)var11_14);
                                                                        var14_11 = var14_11.matcher((CharSequence)var11_14);
                                                                        var10_13 = var15_9.matches();
                                                                        var11_14 = "Ignoring region with malformed extent: ";
                                                                        if (var10_13) {
                                                                            var5_19 = Float.parseFloat((String)((String)g0.a.e(var15_9.group(1)))) / 100.0f;
                                                                            var6_20 = Float.parseFloat((String)((String)g0.a.e(var15_9.group(2))));
                                                                            var6_20 /= 100.0f;
                                                                            break block23;
                                                                        }
                                                                        if (!var14_11.matches()) break block29;
                                                                        if (var2_6 != null) break block30;
                                                                        var0 = new StringBuilder();
                                                                    }
                                                                    var0.append("Ignoring region with missing tts:extent: ");
                                                                    break block31;
                                                                }
                                                                try {
                                                                    var8_17 = Integer.parseInt((String)((String)g0.a.e(var14_11.group(1))));
                                                                    var9_18 = Integer.parseInt((String)((String)g0.a.e(var14_11.group(2))));
                                                                    var5_19 = (float)var8_17 / (float)var2_6.a;
                                                                }
                                                                catch (NumberFormatException var0_3) {}
                                                                var6_20 = var9_18;
                                                                var8_17 = var2_6.b;
                                                                var6_20 /= (float)var8_17;
                                                            }
                                                            var2_6 = N.a((XmlPullParser)var0, "displayAlign");
                                                            var9_18 = 0;
                                                            if (var2_6 == null) break block32;
                                                            var2_6 = W2.c.e((String)var2_6);
                                                            var2_6.hashCode();
                                                            if (var2_6.equals((Object)"center")) break block33;
                                                            if (!var2_6.equals((Object)"after")) break block32;
                                                            var3_16 += var6_20;
                                                            var8_17 = 2;
                                                            break block34;
                                                        }
                                                        var3_16 += var6_20 / 2.0f;
                                                        var8_17 = 1;
                                                        break block34;
                                                    }
                                                    var8_17 = 0;
                                                }
                                                var7_21 = 1.0f / (float)var1_5;
                                                var0 = N.a((XmlPullParser)var0, "writingMode");
                                                if (var0 == null) break block35;
                                                var0 = W2.c.e((String)var0);
                                                var0.hashCode();
                                                switch (var0.hashCode()) {
                                                    case 3553576: {
                                                        if (!var0.equals((Object)"tbrl")) break;
                                                        var1_5 = 2;
                                                        ** break;
                                                    }
                                                    case 3553396: {
                                                        if (!var0.equals((Object)"tblr")) break;
                                                        var1_5 = 1;
                                                        ** break;
                                                    }
                                                    case 3694: {
                                                        var1_5 = var9_18;
                                                        if (var0.equals((Object)"tb")) break block36;
                                                    }
                                                }
                                                var1_5 = -1;
                                                ** break;
                                            }
                                            switch (var1_5) {
                                                default: {
                                                    ** break;
                                                }
                                                case 2: {
                                                    var1_5 = 1;
                                                    return new e(var13_7, var4_15, var3_16, 0, var8_17, var5_19, var6_20, 1, var7_21, var1_5);
                                                }
                                                case 0: 
                                                case 1: 
                                            }
                                            var1_5 = 2;
                                            return new e(var13_7, var4_15, var3_16, 0, var8_17, var5_19, var6_20, 1, var7_21, var1_5);
                                        }
                                        var1_5 = Integer.MIN_VALUE;
                                        return new e(var13_7, var4_15, var3_16, 0, var8_17, var5_19, var6_20, 1, var7_21, var1_5);
                                    }
                                    var0 = new StringBuilder();
                                    var2_6 = "Ignoring region with unsupported extent: ";
                                    break block37;
                                }
                                var0 = "Ignoring region without an extent";
                                break block38;
                            }
                            var0 = new StringBuilder();
                            var2_6 = "Ignoring region with unsupported origin: ";
                        }
                        var0.append((String)var2_6);
                        break block31;
                    }
                    var0 = "Ignoring region without an origin";
                    break block38;
                    catch (NumberFormatException var0_1) {}
                    var0 = new StringBuilder();
                    var2_6 = var11_14;
                    break block39;
                    catch (NumberFormatException var0_4) {}
                    var0 = new StringBuilder();
                    var2_6 = var11_14;
                    break block39;
                    catch (NumberFormatException var0_2) {}
                    var0 = new StringBuilder();
                    var2_6 = var11_14;
                    break block39;
                    var0 = new StringBuilder();
                    var2_6 = var11_14;
                }
                var0.append((String)var2_6);
            }
            var0.append(var12_8);
            var0 = var0.toString();
        }
        o.h("TtmlParser", (String)var0);
        return null;
    }

    public static float o(String string2) {
        Matcher matcher = e.matcher((CharSequence)string2);
        if (!matcher.matches()) {
            matcher = new StringBuilder();
            matcher.append("Invalid value for shear: ");
            matcher.append(string2);
            o.h("TtmlParser", matcher.toString());
            return Float.MAX_VALUE;
        }
        try {
            float f8 = Math.min((float)100.0f, (float)Math.max((float)-100.0f, (float)Float.parseFloat((String)((String)g0.a.e(matcher.group(1))))));
            return f8;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse shear: ");
            stringBuilder.append(string2);
            o.i("TtmlParser", stringBuilder.toString(), (Throwable)numberFormatException);
            return Float.MAX_VALUE;
        }
    }

    /*
     * Exception decompiling
     */
    public static g p(XmlPullParser var0, g var1_1) {
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

    public static String[] q(String string2) {
        if ((string2 = string2.trim()).isEmpty()) {
            return new String[0];
        }
        return M.b1(string2, "\\s+");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static long r(String var0, a var1_1) {
        block19 : {
            block17 : {
                block18 : {
                    var16_2 = d.b.matcher((CharSequence)var0);
                    var15_3 = var16_2.matches();
                    var14_4 = 4;
                    if (var15_3) {
                        var8_5 = Long.parseLong((String)((String)g0.a.e(var16_2.group(1)))) * 3600L;
                        var10_6 = Long.parseLong((String)((String)g0.a.e(var16_2.group(2)))) * 60L;
                        var12_7 = Long.parseLong((String)((String)g0.a.e(var16_2.group(3))));
                        var0 = var16_2.group(4);
                        var6_8 = 0.0;
                        var2_9 = var0 != null ? Double.parseDouble((String)var0) : 0.0;
                        var0 = var16_2.group(5);
                        var4_11 = var0 != null ? (double)((float)Long.parseLong((String)var0) / var1_1.a) : 0.0;
                        var0 = var16_2.group(6);
                        if (var0 == null) return (long)((var8_5 + var10_6 + var12_7 + var2_9 + var4_11 + var6_8) * 1000000.0);
                        var6_8 = (double)Long.parseLong((String)var0) / (double)var1_1.b / (double)var1_1.a;
                        return (long)((var8_5 + var10_6 + var12_7 + var2_9 + var4_11 + var6_8) * 1000000.0);
                    }
                    var16_2 = d.c.matcher((CharSequence)var0);
                    if (!var16_2.matches()) {
                        var1_1 = new StringBuilder();
                        var1_1.append("Malformed time expression: ");
                        var1_1.append(var0);
                        throw new m(var1_1.toString());
                    }
                    var4_12 = Double.parseDouble((String)((String)g0.a.e(var16_2.group(1))));
                    var0 = (String)g0.a.e(var16_2.group(2));
                    var0.hashCode();
                    switch (var0.hashCode()) {
                        case 3494: {
                            if (!var0.equals((Object)"ms")) {
                                break;
                            }
                            break block17;
                        }
                        case 116: {
                            if (!var0.equals((Object)"t")) break;
                            var14_4 = 3;
                            ** break;
                        }
                        case 109: {
                            if (!var0.equals((Object)"m")) break;
                            var14_4 = 2;
                            ** break;
                        }
                        case 104: {
                            if (!var0.equals((Object)"h")) break;
                            var14_4 = 1;
                            ** break;
                        }
                        case 102: {
                            if (var0.equals((Object)"f")) break block18;
                        }
                    }
                    var14_4 = -1;
                    ** break;
                }
                var14_4 = 0;
            }
            switch (var14_4) {
                default: {
                    var2_10 = var4_12;
                    return (long)(var2_10 * 1000000.0);
                }
                case 4: {
                    var2_10 = 1000.0;
                    break block19;
                }
                case 3: {
                    var2_10 = var1_1.c;
                    break block19;
                }
                case 2: {
                    var2_10 = 60.0;
                    ** GOTO lbl65
                }
                case 1: {
                    var2_10 = 3600.0;
lbl65: // 2 sources:
                    var2_10 = var4_12 * var2_10;
                    return (long)(var2_10 * 1000000.0);
                }
                case 0: 
            }
            var2_10 = var1_1.a;
        }
        var2_10 = var4_12 / var2_10;
        return (long)(var2_10 * 1000000.0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b s(XmlPullParser object) {
        String string2;
        String string3 = N.a((XmlPullParser)object, "extent");
        if (string3 == null) {
            return null;
        }
        object = g.matcher((CharSequence)string3);
        if (!object.matches()) {
            object = new StringBuilder();
            string2 = "Ignoring non-pixel tts extent: ";
        } else {
            try {
                return new b(Integer.parseInt((String)((String)g0.a.e(object.group(1)))), Integer.parseInt((String)((String)g0.a.e(object.group(2)))));
            }
            catch (NumberFormatException numberFormatException) {}
            object = new StringBuilder();
            string2 = "Ignoring malformed tts extent: ";
        }
        object.append(string2);
        object.append(string3);
        o.h("TtmlParser", object.toString());
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public k a(byte[] var1_1, int var2_4, int var3_5) {
        var13_6 = this.a.newPullParser();
        var14_7 = new HashMap();
        var15_8 = new HashMap();
        var16_9 = new HashMap();
        var15_8.put((Object)"", (Object)new e(""));
        var8_10 = new ByteArrayInputStream((byte[])var1_1, var2_4, var3_5);
        var1_1 = null;
        var13_6.setInput((InputStream)var8_10, null);
        var17_11 = new ArrayDeque();
        var6_12 = var13_6.getEventType();
        var8_10 = d.i;
        var9_13 = null;
        var3_5 = 0;
        var5_14 = 15;
        while (var6_12 != 1) {
            block18 : {
                block17 : {
                    block19 : {
                        block23 : {
                            block22 : {
                                block21 : {
                                    var10_17 = (c)var17_11.peek();
                                    if (var3_5 != 0) break block17;
                                    var11_19 = var13_6.getName();
                                    if (var6_12 != 2) break block21;
                                    if (!"tt".equals(var11_19)) break block22;
                                    var8_10 = d.j(var13_6);
                                    var2_4 = d.h(var13_6, 15);
                                    var1_1 = d.s(var13_6);
                                    break block23;
                                }
                                if (var6_12 != 4) ** GOTO lbl37
                                ((c)g0.a.e(var10_17)).a(c.d(var13_6.getText()));
                                var10_17 = var1_1;
                                var11_19 = var8_10;
                                var4_15 = var5_14;
                                var12_20 = var9_13;
                                var2_4 = var3_5;
                                break block18;
lbl37: // 1 sources:
                                var10_17 = var1_1;
                                var11_19 = var8_10;
                                var4_15 = var5_14;
                                var12_20 = var9_13;
                                var2_4 = var3_5;
                                if (var6_12 == 3) {
                                    if (var13_6.getName().equals((Object)"tt")) {
                                        var9_13 = new h((c)g0.a.e((c)var17_11.peek()), (Map)var14_7, (Map)var15_8, (Map)var16_9);
                                    }
                                    var17_11.pop();
                                    var10_17 = var1_1;
                                    var11_19 = var8_10;
                                    var4_15 = var5_14;
                                    var12_20 = var9_13;
                                    var2_4 = var3_5;
                                }
                                break block18;
                            }
                            var2_4 = var5_14;
                        }
                        if (var7_16 = d.f((String)var11_19)) break block19;
                        var10_17 = new StringBuilder();
                        var10_17.append("Ignoring unsupported tag: ");
                        var10_17.append(var13_6.getName());
                        o.f("TtmlParser", var10_17.toString());
                        var10_17 = var1_1;
                        var11_19 = var8_10;
                        var4_15 = var2_4;
                        var12_20 = var9_13;
                        var2_4 = ++var3_5;
                        break block18;
                    }
                    try {
                        block20 : {
                            if ("head".equals(var11_19)) {
                                d.k(var13_6, (Map)var14_7, var2_4, (b)var1_1, (Map)var15_8, (Map)var16_9);
                                var5_14 = var3_5;
                            } else {
                                try {
                                    var11_19 = d.m(var13_6, (c)var10_17, (Map)var15_8, (a)var8_10);
                                    var17_11.push(var11_19);
                                    var5_14 = var3_5;
                                    if (var10_17 != null) {
                                        var10_17.a((c)var11_19);
                                        var5_14 = var3_5;
                                    }
                                    break block20;
                                }
                                catch (m var10_18) {}
                                o.i("TtmlParser", "Suppressing parser error", (Throwable)var10_18);
                                var5_14 = var3_5 + 1;
                            }
                        }
                        var10_17 = var1_1;
                        var11_19 = var8_10;
                        var4_15 = var2_4;
                        var12_20 = var9_13;
                        var2_4 = var5_14;
                    }
                    catch (IOException var1_2) {
                        throw new IllegalStateException("Unexpected error when reading input.", (Throwable)var1_2);
                    }
                    catch (XmlPullParserException var1_3) {
                        throw new IllegalStateException("Unable to decode source", (Throwable)var1_3);
                    }
                }
                if (var6_12 == 2) {
                    var2_4 = var3_5 + 1;
                    var10_17 = var1_1;
                    var11_19 = var8_10;
                    var4_15 = var5_14;
                    var12_20 = var9_13;
                } else {
                    var10_17 = var1_1;
                    var11_19 = var8_10;
                    var4_15 = var5_14;
                    var12_20 = var9_13;
                    var2_4 = var3_5;
                    if (var6_12 == 3) {
                        var2_4 = var3_5 - 1;
                        var10_17 = var1_1;
                        var11_19 = var8_10;
                        var4_15 = var5_14;
                        var12_20 = var9_13;
                    }
                }
            }
            var13_6.next();
            var6_12 = var13_6.getEventType();
            var1_1 = var10_17;
            var8_10 = var11_19;
            var5_14 = var4_15;
            var9_13 = var12_20;
            var3_5 = var2_4;
        }
        return (k)g0.a.e(var9_13);
    }

    @Override
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override
    public void c(byte[] arrby, int n8, int n9, t.b b8, g0.g g8) {
        i.c(this.a(arrby, n8, n9), b8, g8);
    }

    @Override
    public int d() {
        return 1;
    }

    public static final class a {
        public final float a;
        public final int b;
        public final int c;

        public a(float f8, int n8, int n9) {
            this.a = f8;
            this.b = n8;
            this.c = n9;
        }
    }

    public static final class b {
        public final int a;
        public final int b;

        public b(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }
    }

}

