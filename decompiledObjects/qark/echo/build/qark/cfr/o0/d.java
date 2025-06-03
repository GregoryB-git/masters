/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.util.Pair
 *  android.util.Xml
 *  java.io.ByteArrayOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.UUID
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.xml.sax.helpers.DefaultHandler
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 *  org.xmlpull.v1.XmlPullParserFactory
 *  org.xmlpull.v1.XmlSerializer
 */
package o0;

import B0.p;
import X2.E;
import X2.v;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import d0.A;
import d0.m;
import d0.q;
import d0.t;
import d0.z;
import g0.G;
import g0.M;
import g0.N;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.b;
import o0.c;
import o0.e;
import o0.f;
import o0.g;
import o0.h;
import o0.i;
import o0.j;
import o0.k;
import o0.l;
import o0.n;
import o0.o;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public class d
extends DefaultHandler
implements p.a {
    public static final Pattern b = Pattern.compile((String)"(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile((String)"CC([1-4])=.*");
    public static final Pattern d = Pattern.compile((String)"([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = new int[]{-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public d() {
        try {
            this.a = XmlPullParserFactory.newInstance();
            return;
        }
        catch (XmlPullParserException xmlPullParserException) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", (Throwable)xmlPullParserException);
        }
    }

    public static int D(List list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            String string2;
            e e8 = (e)list.get(i8);
            if (!"urn:scte:dash:cc:cea-608:2015".equals((Object)e8.a) || (string2 = e8.b) == null) continue;
            if ((string2 = c.matcher((CharSequence)string2)).matches()) {
                return Integer.parseInt((String)string2.group(1));
            }
            string2 = new StringBuilder();
            string2.append("Unable to parse CEA-608 channel number from: ");
            string2.append(e8.b);
            g0.o.h("MpdParser", string2.toString());
        }
        return -1;
    }

    public static int E(List list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            String string2;
            e e8 = (e)list.get(i8);
            if (!"urn:scte:dash:cc:cea-708:2015".equals((Object)e8.a) || (string2 = e8.b) == null) continue;
            if ((string2 = d.matcher((CharSequence)string2)).matches()) {
                return Integer.parseInt((String)string2.group(1));
            }
            string2 = new StringBuilder();
            string2.append("Unable to parse CEA-708 service block number from: ");
            string2.append(e8.b);
            g0.o.h("MpdParser", string2.toString());
        }
        return -1;
    }

    public static long H(XmlPullParser object, String string2, long l8) {
        if ((object = object.getAttributeValue(null, string2)) == null) {
            return l8;
        }
        return M.Q0((String)object);
    }

    public static e I(XmlPullParser xmlPullParser, String string2) {
        String string3 = d.r0(xmlPullParser, "schemeIdUri", "");
        String string4 = d.r0(xmlPullParser, "value", null);
        String string5 = d.r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!N.d(xmlPullParser, string2));
        return new e(string3, string4, string5);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int J(XmlPullParser var0) {
        block15 : {
            if ((var0 = var0.getAttributeValue(null, "value")) == null) {
                return -1;
            }
            var0 = W2.c.e((String)var0);
            var0.hashCode();
            switch (var0.hashCode()) {
                case 3133436: {
                    if (!var0.equals((Object)"fa01")) break;
                    var1_1 = 4;
                    ** break;
                }
                case 3094035: {
                    if (!var0.equals((Object)"f801")) break;
                    var1_1 = 3;
                    ** break;
                }
                case 3094034: {
                    if (!var0.equals((Object)"f800")) break;
                    var1_1 = 2;
                    ** break;
                }
                case 2937391: {
                    if (!var0.equals((Object)"a000")) break;
                    var1_1 = 1;
                    ** break;
                }
                case 1596796: {
                    if (var0.equals((Object)"4000")) break block15;
                }
            }
            var1_1 = -1;
            ** break;
        }
        var1_1 = 0;
lbl28: // 6 sources:
        switch (var1_1) {
            default: {
                return -1;
            }
            case 4: {
                return 8;
            }
            case 3: {
                return 6;
            }
            case 2: {
                return 5;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    public static int K(XmlPullParser xmlPullParser) {
        int n8 = -1;
        int n9 = d.U(xmlPullParser, "value", -1);
        int n10 = n8;
        if (n9 > 0) {
            n10 = n8;
            if (n9 < 33) {
                n10 = n9;
            }
        }
        return n10;
    }

    public static int L(XmlPullParser object) {
        if ((object = object.getAttributeValue(null, "value")) == null) {
            return -1;
        }
        int n8 = Integer.bitCount((int)Integer.parseInt((String)object, (int)16));
        if (n8 == 0) {
            return -1;
        }
        return n8;
    }

    public static long M(XmlPullParser object, String string2, long l8) {
        if ((object = object.getAttributeValue(null, string2)) == null) {
            return l8;
        }
        return M.R0((String)object);
    }

    public static String N(List list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            e e8 = (e)list.get(i8);
            String string2 = e8.a;
            if ((!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals((Object)string2) || !"JOC".equals((Object)e8.b)) && (!"tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals((Object)string2) || !"ec+3".equals((Object)e8.b))) continue;
            return "audio/eac3-joc";
        }
        return "audio/eac3";
    }

    public static float R(XmlPullParser object, String string2, float f8) {
        if ((object = object.getAttributeValue(null, string2)) == null) {
            return f8;
        }
        return Float.parseFloat((String)object);
    }

    public static float S(XmlPullParser object, float f8) {
        object = object.getAttributeValue(null, "frameRate");
        float f9 = f8;
        if (object != null) {
            object = b.matcher((CharSequence)object);
            f9 = f8;
            if (object.matches()) {
                int n8 = Integer.parseInt((String)object.group(1));
                object = object.group(2);
                boolean bl = TextUtils.isEmpty((CharSequence)object);
                f9 = f8 = (float)n8;
                if (!bl) {
                    f9 = f8 / (float)Integer.parseInt((String)object);
                }
            }
        }
        return f9;
    }

    public static int U(XmlPullParser object, String string2, int n8) {
        if ((object = object.getAttributeValue(null, string2)) == null) {
            return n8;
        }
        return Integer.parseInt((String)object);
    }

    public static long W(List list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            e e8 = (e)list.get(i8);
            if (!W2.c.a("http://dashif.org/guidelines/last-segment-number", e8.a)) continue;
            return Long.parseLong((String)e8.b);
        }
        return -1L;
    }

    public static long X(XmlPullParser object, String string2, long l8) {
        if ((object = object.getAttributeValue(null, string2)) == null) {
            return l8;
        }
        return Long.parseLong((String)object);
    }

    public static int Z(XmlPullParser arrn) {
        int n8 = -1;
        int n9 = d.U((XmlPullParser)arrn, "value", -1);
        int n10 = n8;
        if (n9 >= 0) {
            arrn = e;
            n10 = n8;
            if (n9 < arrn.length) {
                n10 = arrn[n9];
            }
        }
        return n10;
    }

    public static int p(int n8, int n9) {
        if (n8 == -1) {
            return n9;
        }
        if (n9 == -1) {
            return n8;
        }
        boolean bl = n8 == n9;
        g0.a.f(bl);
        return n8;
    }

    public static String q(String string2, String string3) {
        if (string2 == null) {
            return string3;
        }
        if (string3 == null) {
            return string2;
        }
        g0.a.f(string2.equals((Object)string3));
        return string2;
    }

    public static void r(ArrayList arrayList) {
        int n8;
        Object object;
        block3 : {
            int n9 = 0;
            for (n8 = 0; n8 < arrayList.size(); ++n8) {
                object = (m.b)arrayList.get(n8);
                if (!d0.g.c.equals((Object)object.p) || (object = object.q) == null) continue;
                arrayList.remove(n8);
                break block3;
            }
            object = null;
        }
        if (object == null) {
            return;
        }
        for (n8 = n9; n8 < arrayList.size(); ++n8) {
            m.b b8 = (m.b)arrayList.get(n8);
            if (!d0.g.b.equals((Object)b8.p) || b8.q != null) continue;
            arrayList.set(n8, (Object)new m.b(d0.g.c, (String)object, b8.r, b8.s));
        }
    }

    public static String r0(XmlPullParser object, String string2, String string3) {
        if ((object = object.getAttributeValue(null, string2)) == null) {
            return string3;
        }
        return object;
    }

    public static void s(ArrayList arrayList) {
        block0 : for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
            m.b b8 = (m.b)arrayList.get(i8);
            if (b8.c()) continue;
            for (int i9 = 0; i9 < arrayList.size(); ++i9) {
                if (!((m.b)arrayList.get(i9)).a(b8)) continue;
                arrayList.remove(i8);
                continue block0;
            }
        }
    }

    public static String s0(XmlPullParser xmlPullParser, String string2) {
        String string3;
        String string4 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                string3 = xmlPullParser.getText();
            } else {
                d.w(xmlPullParser);
                string3 = string4;
            }
            string4 = string3;
        } while (!N.d(xmlPullParser, string2));
        return string3;
    }

    public static long t(long l8, long l9) {
        if (l9 != -9223372036854775807L) {
            l8 = l9;
        }
        if (l8 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return l8;
    }

    public static String u(String string2, String string3) {
        if (z.o(string2)) {
            return z.c(string3);
        }
        if (z.s(string2)) {
            return z.n(string3);
        }
        if (z.r(string2)) {
            return string2;
        }
        if (z.p(string2)) {
            return string2;
        }
        if ("application/mp4".equals((Object)string2)) {
            string2 = string3 = z.g(string3);
            if ("text/vtt".equals((Object)string3)) {
                string2 = "application/x-mp4-vtt";
            }
            return string2;
        }
        return null;
    }

    public static void w(XmlPullParser xmlPullParser) {
        if (!N.e(xmlPullParser)) {
            return;
        }
        int n8 = 1;
        while (n8 != 0) {
            xmlPullParser.next();
            if (N.e(xmlPullParser)) {
                ++n8;
                continue;
            }
            if (!N.c(xmlPullParser)) continue;
            --n8;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int A(XmlPullParser var1_1) {
        block17 : {
            var4_2 = d.r0(var1_1, "schemeIdUri", null);
            var4_2.hashCode();
            var2_3 = var4_2.hashCode();
            var3_4 = -1;
            switch (var2_3) {
                case 2036691300: {
                    if (!var4_2.equals((Object)"urn:dolby:dash:audio_channel_configuration:2011")) break;
                    var2_3 = 6;
                    ** break;
                }
                case 312179081: {
                    if (!var4_2.equals((Object)"tag:dts.com,2018:uhd:audio_channel_configuration")) break;
                    var2_3 = 5;
                    ** break;
                }
                case -79006963: {
                    if (!var4_2.equals((Object)"tag:dts.com,2014:dash:audio_channel_configuration:2012")) break;
                    var2_3 = 4;
                    ** break;
                }
                case -986633423: {
                    if (!var4_2.equals((Object)"urn:mpeg:mpegB:cicp:ChannelConfiguration")) break;
                    var2_3 = 3;
                    ** break;
                }
                case -1138141449: {
                    if (!var4_2.equals((Object)"tag:dolby.com,2014:dash:audio_channel_configuration:2011")) break;
                    var2_3 = 2;
                    ** break;
                }
                case -1352850286: {
                    if (!var4_2.equals((Object)"urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) break;
                    var2_3 = 1;
                    ** break;
                }
                case -2128649360: {
                    if (var4_2.equals((Object)"urn:dts:dash:audio_channel_configuration:2012")) break block17;
                }
            }
            var2_3 = -1;
            ** break;
        }
        var2_3 = 0;
lbl36: // 8 sources:
        switch (var2_3) {
            default: {
                var2_3 = var3_4;
                ** break;
            }
            case 5: {
                var2_3 = d.L(var1_1);
                ** break;
            }
            case 3: {
                var2_3 = d.Z(var1_1);
                ** break;
            }
            case 2: 
            case 6: {
                var2_3 = d.J(var1_1);
                ** break;
            }
            case 1: {
                var2_3 = d.U(var1_1, "value", -1);
                ** break;
            }
            case 0: 
            case 4: 
        }
        var2_3 = d.K(var1_1);
lbl54: // 6 sources:
        do {
            var1_1.next();
        } while (!N.d(var1_1, "AudioChannelConfiguration"));
        return var2_3;
    }

    public long B(XmlPullParser object, long l8) {
        if ((object = object.getAttributeValue(null, "availabilityTimeOffset")) == null) {
            return l8;
        }
        if ("INF".equals(object)) {
            return Long.MAX_VALUE;
        }
        return (long)(Float.parseFloat((String)object) * 1000000.0f);
    }

    public List C(XmlPullParser object, List list, boolean bl) {
        int n8 = 0;
        String string2 = object.getAttributeValue(null, "dvb:priority");
        int n9 = string2 != null ? Integer.parseInt((String)string2) : (bl ? 1 : Integer.MIN_VALUE);
        string2 = object.getAttributeValue(null, "dvb:weight");
        int n10 = string2 != null ? Integer.parseInt((String)string2) : 1;
        string2 = object.getAttributeValue(null, "serviceLocation");
        String string3 = d.s0((XmlPullParser)object, "BaseURL");
        if (G.c(string3)) {
            object = string2;
            if (string2 == null) {
                object = string3;
            }
            return E.j(new b(string3, (String)object, n9, n10));
        }
        ArrayList arrayList = new ArrayList();
        int n11 = n9;
        for (n9 = n8; n9 < list.size(); ++n9) {
            b b8 = (b)list.get(n9);
            String string4 = G.e(b8.a, string3);
            object = string2 == null ? string4 : string2;
            if (bl) {
                n11 = b8.c;
                n10 = b8.d;
                object = b8.b;
            }
            arrayList.add((Object)new b(string4, (String)object, n11, n10));
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public Pair F(XmlPullParser var1_1) {
        block25 : {
            block27 : {
                block26 : {
                    block24 : {
                        var11_2 = null;
                        var4_3 = var1_1.getAttributeValue(null, "schemeIdUri");
                        if (var4_3 == null) break block24;
                        var4_3 = W2.c.e((String)var4_3);
                        var4_3.hashCode();
                        var3_4 = var4_3.hashCode();
                        var2_5 = -1;
                        switch (var3_4) {
                            default: {
                                break;
                            }
                            case 1812765994: {
                                if (!var4_3.equals((Object)"urn:mpeg:dash:mp4protection:2011")) break;
                                var2_5 = 3;
                                break;
                            }
                            case 755418770: {
                                if (!var4_3.equals((Object)"urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) break;
                                var2_5 = 2;
                                break;
                            }
                            case 489446379: {
                                if (!var4_3.equals((Object)"urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) break;
                                var2_5 = 1;
                                break;
                            }
                            case -1980789791: {
                                if (!var4_3.equals((Object)"urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) break;
                                var2_5 = 0;
                            }
                        }
                        switch (var2_5) {
                            default: {
                                ** break;
                            }
                            case 3: {
                                var6_6 = var1_1.getAttributeValue(null, "value");
                                var4_3 = N.b((XmlPullParser)var1_1, "default_KID");
                                if (TextUtils.isEmpty((CharSequence)var4_3) || "00000000-0000-0000-0000-000000000000".equals((Object)var4_3)) ** GOTO lbl44
                                var5_7 = var4_3.split("\\s+");
                                var4_3 = new UUID[var5_7.length];
                                for (var2_5 = 0; var2_5 < var5_7.length; ++var2_5) {
                                    var4_3[var2_5] = UUID.fromString((String)var5_7[var2_5]);
                                }
                                var5_7 = d0.g.b;
                                var8_8 = Z0.o.b((UUID)var5_7, (UUID[])var4_3, null);
                                var4_3 = null;
                                var10_9 = var6_6;
                                var6_6 = var4_3;
                                break block25;
lbl44: // 1 sources:
                                g0.o.h("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                                break block26;
                            }
                            case 2: {
                                var4_3 = d0.g.d;
                                break;
                            }
                            case 1: {
                                var4_3 = d0.g.e;
                                break;
                            }
                            case 0: {
                                var4_3 = d0.g.c;
                            }
                        }
                        var7_10 = var6_6 = null;
                        var5_7 = var4_3;
                        var4_3 = var7_10;
                        break block27;
                    }
                    var6_6 = null;
                }
                var5_7 = null;
                var4_3 = null;
            }
            var7_10 = var4_3;
            var10_9 = var6_6;
            var8_8 = var4_3;
            var6_6 = var7_10;
        }
        do {
            var1_1.next();
            if ((N.f((XmlPullParser)var1_1, "clearkey:Laurl") || N.f((XmlPullParser)var1_1, "dashif:Laurl")) && var1_1.next() == 4) {
                var9_11 = var1_1.getText();
                var7_10 = var5_7;
                var4_3 = var8_8;
            } else if (N.f((XmlPullParser)var1_1, "ms:laurl")) {
                var9_11 = var1_1.getAttributeValue(null, "licenseUrl");
                var7_10 = var5_7;
                var4_3 = var8_8;
            } else if (var8_8 == null && N.g((XmlPullParser)var1_1, "pssh") && var1_1.next() == 4) {
                var4_3 = Base64.decode((String)var1_1.getText(), (int)0);
                var5_7 = Z0.o.f(var4_3);
                if (var5_7 == null) {
                    g0.o.h("MpdParser", "Skipping malformed cenc:pssh data");
                    var4_3 = null;
                    var7_10 = var5_7;
                    var9_11 = var6_6;
                } else {
                    var7_10 = var5_7;
                    var9_11 = var6_6;
                }
            } else if (var8_8 == null && (var4_3 = d0.g.e).equals((Object)var5_7) && N.f((XmlPullParser)var1_1, "mspr:pro") && var1_1.next() == 4) {
                var4_3 = Z0.o.a((UUID)var4_3, Base64.decode((String)var1_1.getText(), (int)0));
                var7_10 = var5_7;
                var9_11 = var6_6;
            } else {
                d.w((XmlPullParser)var1_1);
                var9_11 = var6_6;
                var4_3 = var8_8;
                var7_10 = var5_7;
            }
            var5_7 = var7_10;
            var8_8 = var4_3;
            var6_6 = var9_11;
        } while (!N.d((XmlPullParser)var1_1, "ContentProtection"));
        var1_1 = var11_2;
        if (var7_10 == null) return Pair.create((Object)var10_9, (Object)var1_1);
        var1_1 = new m.b((UUID)var7_10, (String)var9_11, "video/mp4", var4_3);
        return Pair.create((Object)var10_9, (Object)var1_1);
    }

    public int G(XmlPullParser object) {
        object = object.getAttributeValue(null, "contentType");
        boolean bl = TextUtils.isEmpty((CharSequence)object);
        int n8 = -1;
        if (bl) {
            return -1;
        }
        if ("audio".equals(object)) {
            return 1;
        }
        if ("video".equals(object)) {
            return 2;
        }
        if ("text".equals(object)) {
            return 3;
        }
        if ("image".equals(object)) {
            n8 = 4;
        }
        return n8;
    }

    public Pair O(XmlPullParser arrby, String string2, String string3, long l8, long l9, ByteArrayOutputStream byteArrayOutputStream) {
        long l10;
        long l11;
        block0 : {
            l11 = d.X((XmlPullParser)arrby, "id", 0L);
            l10 = d.X((XmlPullParser)arrby, "duration", -9223372036854775807L);
            long l12 = d.X((XmlPullParser)arrby, "presentationTime", 0L);
            l10 = M.W0(l10, 1000L, l8);
            l8 = M.W0(l12 - l9, 1000000L, l8);
            String string4 = d.r0((XmlPullParser)arrby, "messageData", null);
            arrby = this.P((XmlPullParser)arrby, byteArrayOutputStream);
            if (string4 == null) break block0;
            arrby = M.r0(string4);
        }
        return Pair.create((Object)l8, (Object)this.d(string2, string3, l11, l10, arrby));
    }

    public byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializer = Xml.newSerializer();
        xmlSerializer.setOutput((OutputStream)byteArrayOutputStream, W2.e.c.name());
        block13 : do {
            xmlPullParser.nextToken();
            if (N.d(xmlPullParser, "Event")) break;
            switch (xmlPullParser.getEventType()) {
                default: {
                    continue block13;
                }
                case 10: {
                    xmlSerializer.docdecl(xmlPullParser.getText());
                    continue block13;
                }
                case 9: {
                    xmlSerializer.comment(xmlPullParser.getText());
                    continue block13;
                }
                case 8: {
                    xmlSerializer.processingInstruction(xmlPullParser.getText());
                    continue block13;
                }
                case 7: {
                    xmlSerializer.ignorableWhitespace(xmlPullParser.getText());
                    continue block13;
                }
                case 6: {
                    xmlSerializer.entityRef(xmlPullParser.getText());
                    continue block13;
                }
                case 5: {
                    xmlSerializer.cdsect(xmlPullParser.getText());
                    continue block13;
                }
                case 4: {
                    xmlSerializer.text(xmlPullParser.getText());
                    continue block13;
                }
                case 3: {
                    xmlSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    continue block13;
                }
                case 2: {
                    xmlSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    int n8 = 0;
                    do {
                        if (n8 >= xmlPullParser.getAttributeCount()) continue block13;
                        xmlSerializer.attribute(xmlPullParser.getAttributeNamespace(n8), xmlPullParser.getAttributeName(n8), xmlPullParser.getAttributeValue(n8));
                        ++n8;
                    } while (true);
                }
                case 1: {
                    xmlSerializer.endDocument();
                    continue block13;
                }
                case 0: 
            }
            xmlSerializer.startDocument(null, Boolean.FALSE);
        } while (true);
        xmlSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public f Q(XmlPullParser arrl) {
        String string2 = d.r0((XmlPullParser)arrl, "schemeIdUri", "");
        String string3 = d.r0((XmlPullParser)arrl, "value", "");
        long l8 = d.X((XmlPullParser)arrl, "timescale", 1L);
        long l9 = d.X((XmlPullParser)arrl, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        Q0.a[] arra = new Q0.a[](512);
        do {
            arrl.next();
            if (N.f((XmlPullParser)arrl, "Event")) {
                arrayList.add((Object)this.O((XmlPullParser)arrl, string2, string3, l8, l9, (ByteArrayOutputStream)arra));
                continue;
            }
            d.w((XmlPullParser)arrl);
        } while (!N.d((XmlPullParser)arrl, "EventStream"));
        arrl = new long[arrayList.size()];
        arra = new Q0.a[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            Pair pair = (Pair)arrayList.get(i8);
            arrl[i8] = (Long)pair.first;
            arra[i8] = (Q0.a)pair.second;
        }
        return this.e(string2, string3, l8, arrl, arra);
    }

    public i T(XmlPullParser xmlPullParser) {
        return this.d0(xmlPullParser, "sourceURL", "range");
    }

    public t V(XmlPullParser xmlPullParser) {
        return new t(xmlPullParser.getAttributeValue(null, "lang"), d.s0(xmlPullParser, "Label"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public c Y(XmlPullParser var1_1, Uri var2_2) {
        var30_3 = this;
        var6_4 = var30_3.v(var30_3.b0(var1_1, "profiles", new String[0]));
        var14_5 = -9223372036854775807L;
        var24_6 = d.H(var1_1, "availabilityStartTime", -9223372036854775807L);
        var22_7 = d.M(var1_1, "mediaPresentationDuration", -9223372036854775807L);
        var26_8 = d.M(var1_1, "minBufferTime", -9223372036854775807L);
        var33_9 = null;
        var7_10 = "dynamic".equals((Object)var1_1.getAttributeValue(null, "type"));
        var16_11 = var7_10 != false ? d.M(var1_1, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        var18_12 = var7_10 != false ? d.M(var1_1, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        var20_13 = var7_10 != false ? d.M(var1_1, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        var28_14 = d.H(var1_1, "publishTime", -9223372036854775807L);
        var10_15 = 0L;
        var8_16 = var7_10 != false ? 0L : -9223372036854775807L;
        var30_3 = var2_2.toString();
        var31_17 = var2_2.toString();
        var3_18 = var6_4 != false ? 1 : Integer.MIN_VALUE;
        var30_3 = E.j(new b[]{new b((String)var30_3, var31_17, var3_18, 1)});
        var32_19 = new ArrayList();
        var31_17 = new ArrayList();
        if (var7_10) {
            var10_15 = -9223372036854775807L;
        }
        var4_20 = var3_18 = 0;
        var37_21 = null;
        var36_22 = var37_21;
        var35_23 = var36_22;
        var34_24 = var35_23;
        var12_25 = var10_15;
        var10_15 = var14_5;
        do {
            var38_27 = this;
            var1_1.next();
            if (N.f(var1_1, "BaseURL")) {
                var14_5 = var8_16;
                var5_26 = var3_18;
                if (var3_18 == 0) {
                    var14_5 = var38_27.B(var1_1, var8_16);
                    var5_26 = 1;
                }
                var31_17.addAll((Collection)var38_27.C(var1_1, (List)var30_3, var6_4));
                var3_18 = var5_26;
                var8_16 = var14_5;
                continue;
            }
            if (N.f(var1_1, "ProgramInformation")) {
                var37_21 = this.c0(var1_1);
                continue;
            }
            if (N.f(var1_1, "UTCTiming")) {
                var36_22 = this.w0(var1_1);
                continue;
            }
            if (N.f(var1_1, "Location")) {
                var35_23 = G.f(var2_2.toString(), var1_1.nextText());
                continue;
            }
            if (N.f(var1_1, "ServiceDescription")) {
                var34_24 = this.q0(var1_1);
                continue;
            }
            if (N.f(var1_1, "Period") && var4_20 == 0) {
                var38_27 = var31_17.isEmpty() == false ? var31_17 : var30_3;
                var14_5 = var10_15;
                var38_27 = this.a0(var1_1, (List)var38_27, var12_25, var8_16, var24_6, var18_12, var6_4);
                var39_28 = (g)var38_27.first;
                if (var39_28.b == var14_5) {
                    if (!var7_10) {
                        var1_1 = new StringBuilder();
                        var1_1.append("Unable to determine start of period ");
                        var1_1.append(var32_19.size());
                        throw A.c(var1_1.toString(), var33_9);
                    }
                    var4_20 = 1;
                    continue;
                }
                var12_25 = (Long)var38_27.second;
                var12_25 = var12_25 == var14_5 ? var14_5 : var39_28.b + var12_25;
                var32_19.add((Object)var39_28);
                continue;
            }
            d.w(var1_1);
        } while (!N.d(var1_1, "MPD"));
        if (var22_7 != var10_15) ** GOTO lbl79
        if (var12_25 != var10_15) {
            var8_16 = var12_25;
        } else {
            if (var7_10 == false) throw A.c("Unable to determine duration of static manifest.", var33_9);
lbl79: // 2 sources:
            var8_16 = var22_7;
        }
        if (var32_19.isEmpty() != false) throw A.c("No periods found.", var33_9);
        return this.g(var24_6, var8_16, var26_8, var7_10, var16_11, var18_12, var20_13, var28_14, var37_21, (o)var36_22, (l)var34_24, (Uri)var35_23, (List)var32_19);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Pair a0(XmlPullParser xmlPullParser, List list, long l8, long l9, long l10, long l11, boolean bl) {
        Object object;
        Object object2 = xmlPullParser;
        boolean bl2 = false;
        String string2 = object2.getAttributeValue(null, "id");
        long l12 = d.M((XmlPullParser)object2, "start", l8);
        long l13 = -9223372036854775807L;
        long l14 = l10 != -9223372036854775807L ? l10 + l12 : -9223372036854775807L;
        long l15 = d.M((XmlPullParser)object2, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        l8 = l9;
        boolean bl3 = false;
        long l16 = -9223372036854775807L;
        Object object3 = object = null;
        l9 = l13;
        do {
            block10 : {
                d d8;
                block14 : {
                    block13 : {
                        block12 : {
                            block11 : {
                                block9 : {
                                    d8 = this;
                                    xmlPullParser.next();
                                    if (N.f((XmlPullParser)object2, "BaseURL")) {
                                        l10 = l8;
                                        boolean bl4 = bl3;
                                        if (!bl3) {
                                            l10 = d8.B((XmlPullParser)object2, l8);
                                            bl4 = true;
                                        }
                                        arrayList3.addAll((Collection)d8.C((XmlPullParser)object2, list, bl));
                                        l8 = l10;
                                        bl3 = bl4;
                                        continue;
                                    }
                                    if (!N.f((XmlPullParser)object2, "AdaptationSet")) break block9;
                                    object2 = !arrayList3.isEmpty() ? arrayList3 : list;
                                    arrayList.add((Object)this.y(xmlPullParser, (List)object2, (k)object, l15, l8, l16, l14, l11, bl));
                                    break block10;
                                }
                                l9 = l8;
                                d8 = xmlPullParser;
                                if (!N.f((XmlPullParser)d8, "EventStream")) break block11;
                                arrayList2.add((Object)this.Q(xmlPullParser));
                                break block10;
                            }
                            if (N.f((XmlPullParser)d8, "SegmentBase")) {
                                object = this.j0((XmlPullParser)d8, null);
                                bl2 = false;
                                l8 = l9;
                                l9 = -9223372036854775807L;
                                object2 = d8;
                                continue;
                            }
                            if (!N.f((XmlPullParser)d8, "SegmentList")) break block12;
                            l10 = this.B((XmlPullParser)d8, -9223372036854775807L);
                            object2 = this.k0(xmlPullParser, null, l14, l15, l9, l10, l11);
                            l9 = l10;
                            break block13;
                        }
                        if (!N.f((XmlPullParser)d8, "SegmentTemplate")) break block14;
                        l10 = this.B((XmlPullParser)d8, -9223372036854775807L);
                        object2 = this.l0(xmlPullParser, null, v.Y(), l14, l15, l9, l10, l11);
                        l9 = l10;
                    }
                    l10 = -9223372036854775807L;
                    bl2 = false;
                    object = object2;
                    object2 = d8;
                    l16 = l9;
                    l9 = l10;
                    continue;
                }
                if (N.f((XmlPullParser)d8, "AssetIdentifier")) {
                    object3 = d.I((XmlPullParser)d8, "AssetIdentifier");
                } else {
                    d.w(xmlPullParser);
                }
            }
            l9 = -9223372036854775807L;
            bl2 = false;
            object2 = xmlPullParser;
        } while (!N.d((XmlPullParser)object2, "Period"));
        return Pair.create((Object)this.h(string2, l12, (List)arrayList, (List)arrayList2, (e)object3), (Object)l15);
    }

    public final long b(List list, long l8, long l9, int n8, long l10) {
        n8 = n8 >= 0 ? ++n8 : (int)M.l(l10 - l8, l9);
        for (int i8 = 0; i8 < n8; ++i8) {
            list.add((Object)this.m(l8, l9));
            l8 += l9;
        }
        return l8;
    }

    public String[] b0(XmlPullParser object, String string2, String[] arrstring) {
        if ((object = object.getAttributeValue(null, string2)) == null) {
            return arrstring;
        }
        return object.split(",");
    }

    public o0.a c(long l8, int n8, List list, List list2, List list3, List list4) {
        return new o0.a(l8, n8, list, list2, list3, list4);
    }

    public h c0(XmlPullParser xmlPullParser) {
        String string2;
        String string3 = null;
        String string4 = d.r0(xmlPullParser, "moreInformationURL", null);
        String string5 = d.r0(xmlPullParser, "lang", null);
        String string6 = string2 = null;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Title")) {
                string3 = xmlPullParser.nextText();
                continue;
            }
            if (N.f(xmlPullParser, "Source")) {
                string2 = xmlPullParser.nextText();
                continue;
            }
            if (N.f(xmlPullParser, "Copyright")) {
                string6 = xmlPullParser.nextText();
                continue;
            }
            d.w(xmlPullParser);
        } while (!N.d(xmlPullParser, "ProgramInformation"));
        return new h(string3, string2, string6, string4, string5);
    }

    public Q0.a d(String string2, String string3, long l8, long l9, byte[] arrby) {
        return new Q0.a(string2, string3, l9, l8, arrby);
    }

    /*
     * Enabled aggressive block sorting
     */
    public i d0(XmlPullParser arrstring, String string2, String string3) {
        long l8;
        long l9;
        string2 = arrstring.getAttributeValue(null, string2);
        if ((arrstring = arrstring.getAttributeValue(null, string3)) != null) {
            long l10;
            arrstring = arrstring.split("-");
            l8 = l10 = Long.parseLong((String)arrstring[0]);
            if (arrstring.length == 2) {
                l9 = Long.parseLong((String)arrstring[1]) - l10 + 1L;
                l8 = l10;
                return this.i(string2, l8, l9);
            }
        } else {
            l8 = 0L;
        }
        l9 = -1L;
        return this.i(string2, l8, l9);
    }

    public f e(String string2, String string3, long l8, long[] arrl, Q0.a[] arra) {
        return new f(string2, string3, l8, arrl, arra);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public a e0(XmlPullParser var1_1, List var2_2, String var3_3, String var4_4, int var5_5, int var6_6, float var7_7, int var8_8, int var9_9, String var10_10, List var11_11, List var12_12, List var13_13, List var14_14, k var15_15, long var16_16, long var18_17, long var20_18, long var22_19, long var24_20, boolean var26_21) {
        var39_22 = var1_1.getAttributeValue(null, "id");
        var27_23 = d.U((XmlPullParser)var1_1, "bandwidth", -1);
        var40_24 = d.r0((XmlPullParser)var1_1, "mimeType", (String)var3_3);
        var41_25 = d.r0((XmlPullParser)var1_1, "codecs", (String)var4_4);
        var28_26 = d.U((XmlPullParser)var1_1, "width", var5_5);
        var29_27 = d.U((XmlPullParser)var1_1, "height", var6_6);
        var7_7 = d.S((XmlPullParser)var1_1, var7_7);
        var9_9 = d.U((XmlPullParser)var1_1, "audioSamplingRate", var9_9);
        var33_28 = new ArrayList();
        var4_4 = new ArrayList();
        var32_29 = new ArrayList((Collection)var13_13);
        var3_3 = new ArrayList((Collection)var14_14);
        var34_30 = new ArrayList();
        var6_6 = var8_8;
        var5_5 = 0;
        var35_31 = null;
        var13_13 = var15_15;
        var15_15 = var35_31;
        do {
            block19 : {
                block21 : {
                    block20 : {
                        block18 : {
                            block17 : {
                                block15 : {
                                    block16 : {
                                        block14 : {
                                            var35_31 = this;
                                            var1_1.next();
                                            if (!N.f((XmlPullParser)var1_1, "BaseURL")) break block14;
                                            var30_32 = var20_18;
                                            var8_8 = var5_5;
                                            if (var5_5 == 0) {
                                                var30_32 = var35_31.B((XmlPullParser)var1_1, var20_18);
                                                var8_8 = 1;
                                            }
                                            var34_30.addAll((Collection)var35_31.C((XmlPullParser)var1_1, var2_2, var26_21));
                                            var5_5 = var8_8;
                                            var20_18 = var30_32;
                                            break block15;
                                        }
                                        if (!N.f((XmlPullParser)var1_1, "AudioChannelConfiguration")) break block16;
                                        var6_6 = this.A((XmlPullParser)var1_1);
                                        var35_31 = var13_13;
                                        break block17;
                                    }
                                    if (!N.f((XmlPullParser)var1_1, "SegmentBase")) break block18;
                                    var13_13 = var35_31.j0((XmlPullParser)var1_1, (k.e)var13_13);
                                }
                                var35_31 = var13_13;
                            }
                            var13_13 = var4_4;
                            var4_4 = var3_3;
                            var3_3 = var35_31;
                            break block19;
                        }
                        if (!N.f((XmlPullParser)var1_1, "SegmentList")) break block20;
                        var22_19 = var35_31.B((XmlPullParser)var1_1, var22_19);
                        var13_13 = this.k0((XmlPullParser)var1_1, (k.b)var13_13, var16_16, var18_17, var20_18, var22_19, var24_20);
                        ** GOTO lbl69
                    }
                    var30_32 = var20_18;
                    var36_33 = var3_3;
                    var37_34 = var4_4;
                    var38_35 = var32_29;
                    if (!N.f((XmlPullParser)var1_1, "SegmentTemplate")) break block21;
                    var22_19 = var35_31.B((XmlPullParser)var1_1, var22_19);
                    var13_13 = this.l0((XmlPullParser)var1_1, (k.c)var13_13, var14_14, var16_16, var18_17, var30_32, var22_19, var24_20);
                    ** GOTO lbl69
                }
                if (N.f((XmlPullParser)var1_1, "ContentProtection")) {
                    var35_31 = this.F((XmlPullParser)var1_1);
                    var36_33 = var35_31.first;
                    if (var36_33 != null) {
                        var15_15 = (String)var36_33;
                    }
                    if ((var35_31 = var35_31.second) != null) {
                        var33_28.add((Object)((m.b)var35_31));
                    }
lbl69: // 5 sources:
                    var35_31 = var3_3;
                    var3_3 = var4_4;
                    var4_4 = var35_31;
                } else {
                    if (N.f((XmlPullParser)var1_1, "InbandEventStream")) {
                        var37_34.add((Object)d.I((XmlPullParser)var1_1, "InbandEventStream"));
                    } else if (N.f((XmlPullParser)var1_1, "EssentialProperty")) {
                        var38_35.add((Object)d.I((XmlPullParser)var1_1, "EssentialProperty"));
                    } else if (N.f((XmlPullParser)var1_1, "SupplementalProperty")) {
                        var36_33.add((Object)d.I((XmlPullParser)var1_1, "SupplementalProperty"));
                    } else {
                        d.w((XmlPullParser)var1_1);
                    }
                    var35_31 = var4_4;
                    var20_18 = var30_32;
                    var4_4 = var3_3;
                    var3_3 = var35_31;
                }
                var35_31 = var13_13;
                var13_13 = var3_3;
                var3_3 = var35_31;
            }
            if (N.d((XmlPullParser)var1_1, "Representation")) {
                var1_1 = this.f(var39_22, var40_24, var28_26, var29_27, var7_7, var6_6, var9_9, var27_23, var10_10, var11_11, var12_12, var41_25, (List)var32_29, (List)var4_4);
                if (var3_3 == null) {
                    var3_3 = new k.e();
                }
                if (var34_30.isEmpty() != false) return new a((q)var1_1, var2_2, (k)var3_3, (String)var15_15, var33_28, (ArrayList)var13_13, (List)var32_29, (List)var4_4, -1L);
                var2_2 = var34_30;
                return new a((q)var1_1, var2_2, (k)var3_3, (String)var15_15, var33_28, (ArrayList)var13_13, (List)var32_29, (List)var4_4, -1L);
            }
            var35_31 = var13_13;
            var13_13 = var3_3;
            var3_3 = var4_4;
            var4_4 = var35_31;
        } while (true);
    }

    public q f(String object, String string2, int n8, int n9, float f8, int n10, int n11, int n12, String string3, List list, List list2, String string4, List list3, List list4) {
        String string5 = string4;
        String string6 = d.u(string2, string5);
        String string7 = string5;
        string4 = string6;
        if ("audio/eac3".equals((Object)string6)) {
            string6 = d.N(list4);
            string7 = string5;
            string4 = string6;
            if ("audio/eac3-joc".equals((Object)string6)) {
                string7 = "ec+3";
                string4 = string6;
            }
        }
        int n13 = this.p0(list);
        int n14 = this.i0(list);
        int n15 = this.f0(list2);
        int n16 = this.h0(list3);
        int n17 = this.h0(list4);
        list = this.t0(list3);
        object = new q.b().a0((String)object).Q(string2).o0(string4).O(string7).j0(n12).q0(n13).m0(n14 | n15 | n16 | n17).e0(string3);
        n13 = -1;
        n12 = list != null ? (Integer)list.first : -1;
        object = object.t0(n12);
        n12 = list != null ? (Integer)list.second : -1;
        object = object.u0(n12);
        if (z.s(string4)) {
            object.v0(n8).Y(n9).X(f8);
        } else if (z.o(string4)) {
            object.N(n10).p0(n11);
        } else if (z.r(string4)) {
            if ("application/cea-608".equals((Object)string4)) {
                n8 = d.D(list2);
            } else {
                n8 = n13;
                if ("application/cea-708".equals((Object)string4)) {
                    n8 = d.E(list2);
                }
            }
            object.L(n8);
        } else if (z.p(string4)) {
            object.v0(n8).Y(n9);
        }
        return object.K();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int f0(List list) {
        int n8 = 0;
        int n9 = 0;
        do {
            int n10;
            block7 : {
                block6 : {
                    block5 : {
                        if (n8 >= list.size()) {
                            return n9;
                        }
                        e e8 = (e)list.get(n8);
                        if (!W2.c.a("urn:mpeg:dash:role:2011", e8.a)) break block5;
                        n10 = this.g0(e8.b);
                        break block6;
                    }
                    n10 = n9;
                    if (!W2.c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", e8.a)) break block7;
                    n10 = this.u0(e8.b);
                }
                n10 = n9 | n10;
            }
            ++n8;
            n9 = n10;
        } while (true);
    }

    public c g(long l8, long l9, long l10, boolean bl, long l11, long l12, long l13, long l14, h h8, o o8, l l15, Uri uri, List list) {
        return new c(l8, l9, l10, bl, l11, l12, l13, l14, h8, o8, l15, uri, list);
    }

    public int g0(String string2) {
        if (string2 == null) {
            return 0;
        }
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1855372047: {
                if (!string2.equals((Object)"supplementary")) break;
                n9 = 12;
                break;
            }
            case 1629013393: {
                if (!string2.equals((Object)"emergency")) break;
                n9 = 11;
                break;
            }
            case 899152809: {
                if (!string2.equals((Object)"commentary")) break;
                n9 = 10;
                break;
            }
            case 552573414: {
                if (!string2.equals((Object)"caption")) break;
                n9 = 9;
                break;
            }
            case 3530173: {
                if (!string2.equals((Object)"sign")) break;
                n9 = 8;
                break;
            }
            case 3343801: {
                if (!string2.equals((Object)"main")) break;
                n9 = 7;
                break;
            }
            case 99825: {
                if (!string2.equals((Object)"dub")) break;
                n9 = 6;
                break;
            }
            case -1396432756: {
                if (!string2.equals((Object)"forced-subtitle")) break;
                n9 = 5;
                break;
            }
            case -1408024454: {
                if (!string2.equals((Object)"alternate")) break;
                n9 = 4;
                break;
            }
            case -1574842690: {
                if (!string2.equals((Object)"forced_subtitle")) break;
                n9 = 3;
                break;
            }
            case -1580883024: {
                if (!string2.equals((Object)"enhanced-audio-intelligibility")) break;
                n9 = 2;
                break;
            }
            case -1724546052: {
                if (!string2.equals((Object)"description")) break;
                n9 = 1;
                break;
            }
            case -2060497896: {
                if (!string2.equals((Object)"subtitle")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return 0;
            }
            case 12: {
                return 4;
            }
            case 11: {
                return 32;
            }
            case 10: {
                return 8;
            }
            case 9: {
                return 64;
            }
            case 8: {
                return 256;
            }
            case 7: {
                return 1;
            }
            case 6: {
                return 16;
            }
            case 4: {
                return 2;
            }
            case 2: {
                return 2048;
            }
            case 1: {
                return 512;
            }
            case 0: 
            case 3: 
            case 5: 
        }
        return 128;
    }

    public g h(String string2, long l8, List list, List list2, e e8) {
        return new g(string2, l8, list, list2, e8);
    }

    public int h0(List list) {
        int n8 = 0;
        for (int i8 = 0; i8 < list.size(); ++i8) {
            if (!W2.c.a("http://dashif.org/guidelines/trickmode", ((e)list.get((int)i8)).a)) continue;
            n8 = 16384;
        }
        return n8;
    }

    public i i(String string2, long l8, long l9) {
        return new i(string2, l8, l9);
    }

    public int i0(List list) {
        int n8 = 0;
        for (int i8 = 0; i8 < list.size(); ++i8) {
            e e8 = (e)list.get(i8);
            int n9 = n8;
            if (W2.c.a("urn:mpeg:dash:role:2011", e8.a)) {
                n9 = n8 | this.g0(e8.b);
            }
            n8 = n9;
        }
        return n8;
    }

    public j j(a a8, String object, List object2, String string2, ArrayList arrayList, ArrayList arrayList2) {
        q.b b8 = a8.a.a();
        if (object != null && object2.isEmpty()) {
            b8.c0((String)object);
        } else {
            b8.d0((List)object2);
        }
        object = object2 = a8.d;
        if (object2 == null) {
            object = string2;
        }
        object2 = a8.e;
        object2.addAll((Collection)arrayList);
        if (!object2.isEmpty()) {
            d.r((ArrayList)object2);
            d.s((ArrayList)object2);
            b8.U(new m((String)object, (List)object2));
        }
        object = a8.f;
        object.addAll((Collection)arrayList2);
        return j.o(a8.g, b8.K(), a8.b, a8.c, (List)object, a8.h, a8.i, null);
    }

    public k.e j0(XmlPullParser xmlPullParser, k.e object) {
        long l8 = object != null ? object.b : 1L;
        long l9 = d.X(xmlPullParser, "timescale", l8);
        long l10 = 0L;
        l8 = object != null ? object.c : 0L;
        long l11 = d.X(xmlPullParser, "presentationTimeOffset", l8);
        l8 = object != null ? object.d : 0L;
        if (object != null) {
            l10 = object.e;
        }
        Object object2 = null;
        String[] arrstring = xmlPullParser.getAttributeValue(null, "indexRange");
        if (arrstring != null) {
            arrstring = arrstring.split("-");
            l8 = Long.parseLong((String)arrstring[0]);
            l10 = Long.parseLong((String)arrstring[1]) - l8 + 1L;
        }
        if (object != null) {
            object2 = object.a;
        }
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Initialization")) {
                object = this.T(xmlPullParser);
            } else {
                d.w(xmlPullParser);
                object = object2;
            }
            object2 = object;
        } while (!N.d(xmlPullParser, "SegmentBase"));
        return this.n((i)object, l9, l11, l8, l10);
    }

    public k.b k(i i8, long l8, long l9, long l10, long l11, List list, long l12, List list2, long l13, long l14) {
        return new k.b(i8, l8, l9, l10, l11, list, l12, list2, M.J0(l13), M.J0(l14));
    }

    public k.b k0(XmlPullParser object, k.b b8, long l8, long l9, long l10, long l11, long l12) {
        i i8;
        List list;
        i i9;
        i i10;
        long l13 = 1L;
        long l14 = b8 != null ? b8.b : 1L;
        long l15 = d.X((XmlPullParser)object, "timescale", l14);
        l14 = b8 != null ? b8.c : 0L;
        long l16 = d.X((XmlPullParser)object, "presentationTimeOffset", l14);
        l14 = b8 != null ? b8.e : -9223372036854775807L;
        long l17 = d.X((XmlPullParser)object, "duration", l14);
        l14 = l13;
        if (b8 != null) {
            l14 = b8.d;
        }
        l14 = d.X((XmlPullParser)object, "startNumber", l14);
        l10 = d.t(l10, l11);
        List list2 = null;
        i i11 = i10 = null;
        do {
            object.next();
            if (N.f((XmlPullParser)object, "Initialization")) {
                i8 = this.T((XmlPullParser)object);
                list = list2;
                i9 = i10;
            } else if (N.f((XmlPullParser)object, "SegmentTimeline")) {
                list = this.m0((XmlPullParser)object, l15, l9);
                i9 = i10;
                i8 = i11;
            } else if (N.f((XmlPullParser)object, "SegmentURL")) {
                i9 = i10;
                if (i10 == null) {
                    i9 = new ArrayList();
                }
                i9.add((Object)this.n0((XmlPullParser)object));
                list = list2;
                i8 = i11;
            } else {
                d.w((XmlPullParser)object);
                i8 = i11;
                i9 = i10;
                list = list2;
            }
            list2 = list;
            i10 = i9;
            i11 = i8;
        } while (!N.d((XmlPullParser)object, "SegmentList"));
        i11 = list;
        object = i9;
        i10 = i8;
        if (b8 != null) {
            if (i8 == null) {
                i8 = b8.a;
            }
            if (list == null) {
                list = b8.f;
            }
            if (i9 != null) {
                i11 = list;
                object = i9;
                i10 = i8;
            } else {
                object = b8.j;
                i10 = i8;
                i11 = list;
            }
        }
        return this.k(i10, l15, l16, l14, l17, (List)i11, l10, (List)object, l12, l8);
    }

    public k.c l(i i8, long l8, long l9, long l10, long l11, long l12, List list, long l13, n n8, n n9, long l14, long l15) {
        return new k.c(i8, l8, l9, l10, l11, l12, list, l13, n8, n9, M.J0(l14), M.J0(l15));
    }

    public k.c l0(XmlPullParser xmlPullParser, k.c c8, List object, long l8, long l9, long l10, long l11, long l12) {
        long l13 = 1L;
        long l14 = c8 != null ? c8.b : 1L;
        long l15 = d.X(xmlPullParser, "timescale", l14);
        l14 = c8 != null ? c8.c : 0L;
        long l16 = d.X(xmlPullParser, "presentationTimeOffset", l14);
        l14 = c8 != null ? c8.e : -9223372036854775807L;
        long l17 = d.X(xmlPullParser, "duration", l14);
        l14 = l13;
        if (c8 != null) {
            l14 = c8.d;
        }
        l14 = d.X(xmlPullParser, "startNumber", l14);
        l13 = d.W((List)object);
        l10 = d.t(l10, l11);
        List list = null;
        object = c8 != null ? c8.k : null;
        n n8 = this.v0(xmlPullParser, "media", (n)object);
        object = c8 != null ? c8.j : null;
        n n9 = this.v0(xmlPullParser, "initialization", (n)object);
        object = null;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Initialization")) {
                object = this.T(xmlPullParser);
                continue;
            }
            if (N.f(xmlPullParser, "SegmentTimeline")) {
                list = this.m0(xmlPullParser, l15, l9);
                continue;
            }
            d.w(xmlPullParser);
        } while (!N.d(xmlPullParser, "SegmentTemplate"));
        xmlPullParser = list;
        Object object2 = object;
        if (c8 != null) {
            if (object == null) {
                object = c8.a;
            }
            if (list != null) {
                xmlPullParser = list;
                object2 = object;
            } else {
                xmlPullParser = c8.f;
                object2 = object;
            }
        }
        return this.l((i)object2, l15, l16, l14, l13, l17, (List)xmlPullParser, l10, n9, n8, l12, l8);
    }

    public k.d m(long l8, long l9) {
        return new k.d(l8, l9);
    }

    public List m0(XmlPullParser xmlPullParser, long l8, long l9) {
        long l10;
        long l11;
        int n8;
        int n9;
        int n10;
        ArrayList arrayList = new ArrayList();
        long l12 = 0L;
        long l13 = -9223372036854775807L;
        int n11 = n10 = 0;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "S")) {
                l11 = d.X(xmlPullParser, "t", -9223372036854775807L);
                l10 = l12;
                if (n10 != 0) {
                    l10 = this.b((List)arrayList, l12, l13, n11, l11);
                }
                l12 = l11 != -9223372036854775807L ? l11 : l10;
                l13 = d.X(xmlPullParser, "d", -9223372036854775807L);
                n8 = d.U(xmlPullParser, "r", 0);
                n9 = 1;
                l10 = l12;
                l11 = l13;
            } else {
                d.w(xmlPullParser);
                n8 = n11;
                l11 = l13;
                l10 = l12;
                n9 = n10;
            }
            n10 = n9;
            l12 = l10;
            l13 = l11;
            n11 = n8;
        } while (!N.d(xmlPullParser, "SegmentTimeline"));
        if (n9 != 0) {
            this.b((List)arrayList, l10, l11, n8, M.W0(l9, l8, 1000L));
        }
        return arrayList;
    }

    public k.e n(i i8, long l8, long l9, long l10, long l11) {
        return new k.e(i8, l8, l9, l10, l11);
    }

    public i n0(XmlPullParser xmlPullParser) {
        return this.d0(xmlPullParser, "media", "mediaRange");
    }

    public o o(String string2, String string3) {
        return new o(string2, string3);
    }

    public int o0(String string2) {
        if (string2 == null) {
            return 0;
        }
        if (!string2.equals((Object)"forced_subtitle") && !string2.equals((Object)"forced-subtitle")) {
            return 0;
        }
        return 2;
    }

    public int p0(List list) {
        int n8 = 0;
        for (int i8 = 0; i8 < list.size(); ++i8) {
            e e8 = (e)list.get(i8);
            int n9 = n8;
            if (W2.c.a("urn:mpeg:dash:role:2011", e8.a)) {
                n9 = n8 | this.o0(e8.b);
            }
            n8 = n9;
        }
        return n8;
    }

    public l q0(XmlPullParser xmlPullParser) {
        long l8;
        float f8;
        long l9;
        long l10 = l9 = (l8 = -9223372036854775807L);
        float f9 = f8 = -3.4028235E38f;
        do {
            long l11;
            long l12;
            long l13;
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Latency")) {
                l12 = d.X(xmlPullParser, "target", -9223372036854775807L);
                l13 = d.X(xmlPullParser, "min", -9223372036854775807L);
                l11 = d.X(xmlPullParser, "max", -9223372036854775807L);
            } else {
                l12 = l8;
                l13 = l9;
                l11 = l10;
                if (N.f(xmlPullParser, "PlaybackRate")) {
                    f8 = d.R(xmlPullParser, "min", -3.4028235E38f);
                    f9 = d.R(xmlPullParser, "max", -3.4028235E38f);
                    l12 = l8;
                    l13 = l9;
                    l11 = l10;
                }
            }
            if (N.d(xmlPullParser, "ServiceDescription")) {
                return new l(l12, l13, l11, f8, f9);
            }
            l8 = l12;
            l9 = l13;
            l10 = l11;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Pair t0(List list) {
        int n8 = 0;
        while (n8 < list.size()) {
            Pair pair = (e)list.get(n8);
            if ((W2.c.a("http://dashif.org/thumbnail_tile", pair.a) || W2.c.a("http://dashif.org/guidelines/thumbnail_tile", pair.a)) && (pair = pair.b) != null && (pair = M.b1((String)pair, "x")).length == 2) {
                try {
                    return Pair.create((Object)Integer.parseInt((String)pair[0]), (Object)Integer.parseInt((String)pair[1]));
                }
                catch (NumberFormatException numberFormatException) {}
            }
            ++n8;
        }
        return null;
    }

    public int u0(String string2) {
        if (string2 == null) {
            return 0;
        }
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 54: {
                if (!string2.equals((Object)"6")) break;
                n9 = 4;
                break;
            }
            case 52: {
                if (!string2.equals((Object)"4")) break;
                n9 = 3;
                break;
            }
            case 51: {
                if (!string2.equals((Object)"3")) break;
                n9 = 2;
                break;
            }
            case 50: {
                if (!string2.equals((Object)"2")) break;
                n9 = 1;
                break;
            }
            case 49: {
                if (!string2.equals((Object)"1")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return 0;
            }
            case 4: {
                return 1;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 2048;
            }
            case 0: 
        }
        return 512;
    }

    public final boolean v(String[] arrstring) {
        int n8 = arrstring.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!arrstring[i8].startsWith("urn:dvb:dash:profile:dvb-dash:")) continue;
            return true;
        }
        return false;
    }

    public n v0(XmlPullParser object, String string2, n n8) {
        if ((object = object.getAttributeValue(null, string2)) != null) {
            return n.b((String)object);
        }
        return n8;
    }

    public o w0(XmlPullParser xmlPullParser) {
        return this.o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public c x(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser xmlPullParser = this.a.newPullParser();
            xmlPullParser.setInput(inputStream, null);
            if (xmlPullParser.next() != 2 || !"MPD".equals((Object)xmlPullParser.getName())) throw A.c("inputStream does not contain a valid media presentation description", null);
            return this.Y(xmlPullParser, uri);
        }
        catch (XmlPullParserException xmlPullParserException) {
            throw A.c(null, (Throwable)xmlPullParserException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public o0.a y(XmlPullParser xmlPullParser, List list, k object, long l8, long l9, long l10, long l11, long l12, boolean bl) {
        Object object2 = xmlPullParser;
        long l13 = d.X((XmlPullParser)object2, "id", -1L);
        int n8 = this.G(xmlPullParser);
        String string2 = object2.getAttributeValue(null, "mimeType");
        String string3 = object2.getAttributeValue(null, "codecs");
        int n9 = d.U((XmlPullParser)object2, "width", -1);
        int n10 = d.U((XmlPullParser)object2, "height", -1);
        float f8 = d.S((XmlPullParser)object2, -1.0f);
        int n11 = d.U((XmlPullParser)object2, "audioSamplingRate", -1);
        String string4 = "lang";
        Object object3 = object2.getAttributeValue(null, "lang");
        String string5 = object2.getAttributeValue(null, "label");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object object4 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        int n12 = -1;
        String string6 = null;
        int n13 = 0;
        Object object5 = object;
        object = object4;
        do {
            Object object6;
            block21 : {
                block19 : {
                    long l14;
                    block20 : {
                        block18 : {
                            object4 = this;
                            xmlPullParser.next();
                            if (N.f((XmlPullParser)object2, "BaseURL")) {
                                l14 = l9;
                                int n14 = n13;
                                if (n13 == 0) {
                                    l14 = object4.B((XmlPullParser)object2, l9);
                                    n14 = 1;
                                }
                                arrayList8.addAll((Collection)object4.C((XmlPullParser)object2, list, bl));
                                l9 = l14;
                                n13 = n14;
                                continue;
                            }
                            if (N.f((XmlPullParser)object2, "ContentProtection")) {
                                object4 = this.F(xmlPullParser);
                                object6 = object4.first;
                                if (object6 != null) {
                                    string6 = (String)object6;
                                }
                                if ((object4 = object4.second) == null) continue;
                                arrayList2.add((Object)((m.b)object4));
                                continue;
                            }
                            if (N.f((XmlPullParser)object2, "ContentComponent")) {
                                object3 = d.q((String)object3, object2.getAttributeValue(null, string4));
                                n8 = d.p(n8, this.G(xmlPullParser));
                                continue;
                            }
                            if (N.f((XmlPullParser)object2, "Role")) {
                                arrayList4.add((Object)d.I((XmlPullParser)object2, "Role"));
                                continue;
                            }
                            if (N.f((XmlPullParser)object2, "AudioChannelConfiguration")) {
                                n12 = this.A(xmlPullParser);
                                continue;
                            }
                            if (N.f((XmlPullParser)object2, "Accessibility")) {
                                arrayList3.add((Object)d.I((XmlPullParser)object2, "Accessibility"));
                                continue;
                            }
                            if (N.f((XmlPullParser)object2, "EssentialProperty")) {
                                arrayList5.add((Object)d.I((XmlPullParser)object2, "EssentialProperty"));
                                continue;
                            }
                            if (N.f((XmlPullParser)object2, "SupplementalProperty")) {
                                arrayList6.add((Object)d.I((XmlPullParser)object2, "SupplementalProperty"));
                                continue;
                            }
                            if (!N.f((XmlPullParser)object2, "Representation")) break block18;
                            object2 = !arrayList8.isEmpty() ? arrayList8 : list;
                            object2 = this.e0(xmlPullParser, (List)object2, string2, string3, n9, n10, f8, n12, n11, (String)object3, (List)arrayList4, (List)arrayList3, (List)arrayList5, (List)arrayList6, (k)object5, l11, l8, l9, l10, l12, bl);
                            n8 = d.p(n8, z.k(object2.a.n));
                            arrayList7.add(object2);
                            break block19;
                        }
                        object6 = object;
                        object4 = object3;
                        object2 = arrayList;
                        l14 = l9;
                        if (N.f(xmlPullParser, "SegmentBase")) {
                            object5 = this.j0(xmlPullParser, (k.e)object5);
                            l9 = l14;
                            object = object6;
                            arrayList = object2;
                            object2 = xmlPullParser;
                            object3 = object4;
                            continue;
                        }
                        if (!N.f(xmlPullParser, "SegmentList")) break block20;
                        l10 = this.B(xmlPullParser, l10);
                        object5 = this.k0(xmlPullParser, (k.b)object5, l11, l8, l14, l10, l12);
                        break block19;
                    }
                    if (!N.f(xmlPullParser, "SegmentTemplate")) break block21;
                    l10 = this.B(xmlPullParser, l10);
                    object5 = this.l0(xmlPullParser, (k.c)object5, (List)arrayList6, l11, l8, l14, l10, l12);
                }
                object2 = xmlPullParser;
                continue;
            }
            object4 = xmlPullParser;
            if (N.f((XmlPullParser)object4, "InbandEventStream")) {
                object6.add((Object)d.I((XmlPullParser)object4, "InbandEventStream"));
                object2 = object4;
                continue;
            }
            if (N.f((XmlPullParser)object4, "Label")) {
                object2.add((Object)this.V(xmlPullParser));
                object2 = object4;
                continue;
            }
            object2 = object4;
            if (!N.e(xmlPullParser)) continue;
            this.z(xmlPullParser);
            object2 = object4;
        } while (!N.d((XmlPullParser)object2, "AdaptationSet"));
        xmlPullParser = new ArrayList(arrayList7.size());
        n13 = 0;
        while (n13 < arrayList7.size()) {
            xmlPullParser.add((Object)this.j((a)arrayList7.get(n13), string5, (List)arrayList, string6, arrayList2, (ArrayList)object));
            ++n13;
        }
        return this.c(l13, n8, (List)xmlPullParser, (List)arrayList3, (List)arrayList5, (List)arrayList6);
    }

    public void z(XmlPullParser xmlPullParser) {
        d.w(xmlPullParser);
    }

    public static final class a {
        public final q a;
        public final v b;
        public final k c;
        public final String d;
        public final ArrayList e;
        public final ArrayList f;
        public final long g;
        public final List h;
        public final List i;

        public a(q q8, List list, k k8, String string2, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long l8) {
            this.a = q8;
            this.b = v.U((Collection)list);
            this.c = k8;
            this.d = string2;
            this.e = arrayList;
            this.f = arrayList2;
            this.h = list2;
            this.i = list3;
            this.g = l8;
        }
    }

}

