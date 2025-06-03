// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i1;

import c1.i;
import c1.s;
import java.io.IOException;
import java.util.ArrayDeque;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import c1.k;
import g0.N;
import java.util.Map;
import c1.m;
import g0.M;
import java.util.regex.Matcher;
import g0.o;
import g0.a;
import org.xmlpull.v1.XmlPullParser;
import W2.c;
import android.text.Layout$Alignment;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import java.util.regex.Pattern;
import c1.t;

public final class d implements t
{
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    public static final a i;
    public final XmlPullParserFactory a;
    
    static {
        b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
        c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
        d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
        e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
        f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
        g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
        h = Pattern.compile("^(\\d+) (\\d+)$");
        i = new a(30.0f, 1, 1);
    }
    
    public d() {
        try {
            (this.a = XmlPullParserFactory.newInstance()).setNamespaceAware(true);
        }
        catch (XmlPullParserException cause) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", (Throwable)cause);
        }
    }
    
    public static g e(final g g) {
        g g2 = g;
        if (g == null) {
            g2 = new g();
        }
        return g2;
    }
    
    public static boolean f(final String s) {
        return s.equals("tt") || s.equals("head") || s.equals("body") || s.equals("div") || s.equals("p") || s.equals("span") || s.equals("br") || s.equals("style") || s.equals("styling") || s.equals("layout") || s.equals("region") || s.equals("metadata") || s.equals("image") || s.equals("data") || s.equals("information");
    }
    
    public static Layout$Alignment g(String e) {
        e = W2.c.e(e);
        e.hashCode();
        final int hashCode = e.hashCode();
        int n = -1;
        switch (hashCode) {
            case 109757538: {
                if (!e.equals("start")) {
                    break;
                }
                n = 4;
                break;
            }
            case 108511772: {
                if (!e.equals("right")) {
                    break;
                }
                n = 3;
                break;
            }
            case 3317767: {
                if (!e.equals("left")) {
                    break;
                }
                n = 2;
                break;
            }
            case 100571: {
                if (!e.equals("end")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1364013995: {
                if (!e.equals("center")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return null;
            }
            case 2:
            case 4: {
                return Layout$Alignment.ALIGN_NORMAL;
            }
            case 1:
            case 3: {
                return Layout$Alignment.ALIGN_OPPOSITE;
            }
            case 0: {
                return Layout$Alignment.ALIGN_CENTER;
            }
        }
    }
    
    public static int h(final XmlPullParser xmlPullParser, final int n) {
        final String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return n;
        }
        final Matcher matcher = i1.d.h.matcher(attributeValue);
        StringBuilder sb;
        if (!matcher.matches()) {
            sb = new StringBuilder();
        }
        else {
            while (true) {
                boolean b = true;
                while (true) {
                    Label_0172: {
                        while (true) {
                            try {
                                final int int1 = Integer.parseInt((String)g0.a.e(matcher.group(1)));
                                final int int2 = Integer.parseInt((String)g0.a.e(matcher.group(2)));
                                if (int1 != 0 && int2 != 0) {
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Invalid cell resolution ");
                                    sb2.append(int1);
                                    sb2.append(" ");
                                    sb2.append(int2);
                                    g0.a.b(b, sb2.toString());
                                    return int2;
                                }
                                break Label_0172;
                                sb = new StringBuilder();
                                break;
                            }
                            catch (NumberFormatException ex) {
                                continue;
                            }
                            break;
                        }
                    }
                    b = false;
                    continue;
                }
            }
        }
        sb.append("Ignoring malformed cell resolution: ");
        sb.append(attributeValue);
        o.h("TtmlParser", sb.toString());
        return n;
    }
    
    public static void i(String str, final g g) {
        final String[] b1 = M.b1(str, "\\s+");
        Matcher matcher;
        if (b1.length == 1) {
            matcher = i1.d.d.matcher(str);
        }
        else {
            if (b1.length != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Invalid number of entries for fontSize: ");
                sb.append(b1.length);
                sb.append(".");
                throw new m(sb.toString());
            }
            matcher = i1.d.d.matcher(b1[1]);
            o.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (matcher.matches()) {
            str = (String)g0.a.e(matcher.group(3));
            str.hashCode();
            final int hashCode = str.hashCode();
            int n = -1;
            switch (hashCode) {
                case 3592: {
                    if (!str.equals("px")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case 3240: {
                    if (!str.equals("em")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case 37: {
                    if (!str.equals("%")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid unit for fontSize: '");
                    sb2.append(str);
                    sb2.append("'.");
                    throw new m(sb2.toString());
                }
                case 2: {
                    g.z(1);
                    break;
                }
                case 1: {
                    g.z(2);
                    break;
                }
                case 0: {
                    g.z(3);
                    break;
                }
            }
            g.y(Float.parseFloat((String)g0.a.e(matcher.group(1))));
            return;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid expression for fontSize: '");
        sb3.append(str);
        sb3.append("'.");
        throw new m(sb3.toString());
    }
    
    public static a j(final XmlPullParser xmlPullParser) {
        final String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int int1;
        if (attributeValue != null) {
            int1 = Integer.parseInt(attributeValue);
        }
        else {
            int1 = 30;
        }
        final String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        float n;
        if (attributeValue2 != null) {
            final String[] b1 = M.b1(attributeValue2, " ");
            g0.a.b(b1.length == 2, "frameRateMultiplier doesn't have 2 parts");
            n = Integer.parseInt(b1[0]) / (float)Integer.parseInt(b1[1]);
        }
        else {
            n = 1.0f;
        }
        final a i = i1.d.i;
        int n2 = i.b;
        final String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            n2 = Integer.parseInt(attributeValue3);
        }
        int n3 = i.c;
        final String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            n3 = Integer.parseInt(attributeValue4);
        }
        return new a(int1 * n, n2, n3);
    }
    
    public static Map k(final XmlPullParser xmlPullParser, final Map map, final int n, final b b, final Map map2, final Map map3) {
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "style")) {
                final String a = N.a(xmlPullParser, "style");
                final g p6 = p(xmlPullParser, new g());
                if (a != null) {
                    final String[] q = q(a);
                    for (int length = q.length, i = 0; i < length; ++i) {
                        p6.a(map.get(q[i]));
                    }
                }
                final String g = p6.g();
                if (g == null) {
                    continue;
                }
                map.put(g, p6);
            }
            else if (N.f(xmlPullParser, "region")) {
                final e n2 = n(xmlPullParser, n, b);
                if (n2 == null) {
                    continue;
                }
                map2.put(n2.a, n2);
            }
            else {
                if (!N.f(xmlPullParser, "metadata")) {
                    continue;
                }
                l(xmlPullParser, map3);
            }
        } while (!N.d(xmlPullParser, "head"));
        return map;
    }
    
    public static void l(final XmlPullParser xmlPullParser, final Map map) {
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "image")) {
                final String a = N.a(xmlPullParser, "id");
                if (a == null) {
                    continue;
                }
                map.put(a, xmlPullParser.nextText());
            }
        } while (!N.d(xmlPullParser, "metadata"));
    }
    
    public static i1.c m(final XmlPullParser xmlPullParser, final i1.c c, final Map map, final a a) {
        final int attributeCount = xmlPullParser.getAttributeCount();
        final g p4 = p(xmlPullParser, null);
        String s;
        Object o = s = null;
        String s2 = "";
        int i = 0;
        long n = -9223372036854775807L;
        long n2 = -9223372036854775807L;
        long n3 = -9223372036854775807L;
        while (i < attributeCount) {
            final String attributeName = xmlPullParser.getAttributeName(i);
            final String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            int n4 = 0;
            Label_0260: {
                switch (attributeName) {
                    case "backgroundImage": {
                        n4 = 5;
                        break Label_0260;
                    }
                    case "style": {
                        n4 = 4;
                        break Label_0260;
                    }
                    case "begin": {
                        n4 = 3;
                        break Label_0260;
                    }
                    case "end": {
                        n4 = 2;
                        break Label_0260;
                    }
                    case "dur": {
                        n4 = 1;
                        break Label_0260;
                    }
                    case "region": {
                        n4 = 0;
                        break Label_0260;
                    }
                    default:
                        break;
                }
                n4 = -1;
            }
            String[] array = null;
            String substring = null;
            long r = 0L;
            long r2 = 0L;
            long r3 = 0L;
            switch (n4) {
                default: {
                    array = (String[])o;
                    substring = s;
                    r = n;
                    r2 = n2;
                    r3 = n3;
                    break;
                }
                case 5: {
                    array = (String[])o;
                    substring = s;
                    r = n;
                    r2 = n2;
                    r3 = n3;
                    if (attributeValue.startsWith("#")) {
                        substring = attributeValue.substring(1);
                        r3 = n3;
                        r2 = n2;
                        r = n;
                        array = (String[])o;
                        break;
                    }
                    break;
                }
                case 4: {
                    final String[] q = q(attributeValue);
                    array = (String[])o;
                    substring = s;
                    r = n;
                    r2 = n2;
                    r3 = n3;
                    if (q.length > 0) {
                        array = q;
                        substring = s;
                        r = n;
                        r2 = n2;
                        r3 = n3;
                        break;
                    }
                    break;
                }
                case 3: {
                    r = r(attributeValue, a);
                    array = (String[])o;
                    substring = s;
                    r2 = n2;
                    r3 = n3;
                    break;
                }
                case 2: {
                    r2 = r(attributeValue, a);
                    array = (String[])o;
                    substring = s;
                    r = n;
                    r3 = n3;
                    break;
                }
                case 1: {
                    r3 = r(attributeValue, a);
                    array = (String[])o;
                    substring = s;
                    r = n;
                    r2 = n2;
                    break;
                }
                case 0: {
                    array = (String[])o;
                    substring = s;
                    r = n;
                    r2 = n2;
                    r3 = n3;
                    if (map.containsKey(attributeValue)) {
                        s2 = attributeValue;
                        r3 = n3;
                        r2 = n2;
                        r = n;
                        substring = s;
                        array = (String[])o;
                        break;
                    }
                    break;
                }
            }
            ++i;
            o = array;
            s = substring;
            n = r;
            n2 = r2;
            n3 = r3;
        }
        long n5;
        long n6;
        if (c != null) {
            final long d = c.d;
            n5 = n;
            n6 = n2;
            if (d != -9223372036854775807L) {
                long n7 = n;
                if (n != -9223372036854775807L) {
                    n7 = n + d;
                }
                n5 = n7;
                n6 = n2;
                if (n2 != -9223372036854775807L) {
                    n6 = n2 + d;
                    n5 = n7;
                }
            }
        }
        else {
            n5 = n;
            n6 = n2;
        }
        if (n6 == -9223372036854775807L) {
            if (n3 != -9223372036854775807L) {
                final long e = n5 + n3;
                return c.c(xmlPullParser.getName(), n5, e, p4, (String[])o, s2, s, c);
            }
            if (c != null) {
                final long e = c.e;
                if (e != -9223372036854775807L) {
                    return c.c(xmlPullParser.getName(), n5, e, p4, (String[])o, s2, s, c);
                }
            }
        }
        final long e = n6;
        return c.c(xmlPullParser.getName(), n5, e, p4, (String[])o, s2, s, c);
    }
    
    public static e n(final XmlPullParser p0, final int p1, final b p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "id"
        //     4: invokestatic    g0/N.a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //     7: astore          13
        //     9: aload           13
        //    11: ifnonnull       16
        //    14: aconst_null    
        //    15: areturn        
        //    16: aload_0        
        //    17: ldc_w           "origin"
        //    20: invokestatic    g0/N.a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //    23: astore          12
        //    25: aload           12
        //    27: ifnull          784
        //    30: getstatic       i1/d.f:Ljava/util/regex/Pattern;
        //    33: astore          15
        //    35: aload           15
        //    37: aload           12
        //    39: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    42: astore          16
        //    44: getstatic       i1/d.g:Ljava/util/regex/Pattern;
        //    47: astore          14
        //    49: aload           14
        //    51: aload           12
        //    53: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    56: astore          17
        //    58: aload           16
        //    60: invokevirtual   java/util/regex/Matcher.matches:()Z
        //    63: istore          10
        //    65: ldc_w           "Ignoring region with malformed origin: "
        //    68: astore          11
        //    70: iload           10
        //    72: ifeq            158
        //    75: aload           16
        //    77: iconst_1       
        //    78: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //    81: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //    84: checkcast       Ljava/lang/String;
        //    87: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //    90: ldc_w           100.0
        //    93: fdiv           
        //    94: fstore          4
        //    96: aload           16
        //    98: iconst_2       
        //    99: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   102: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   105: checkcast       Ljava/lang/String;
        //   108: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   111: fstore_3       
        //   112: fload_3        
        //   113: ldc_w           100.0
        //   116: fdiv           
        //   117: fstore_3       
        //   118: goto            250
        //   121: new             Ljava/lang/StringBuilder;
        //   124: dup            
        //   125: invokespecial   java/lang/StringBuilder.<init>:()V
        //   128: astore_0       
        //   129: aload           11
        //   131: astore_2       
        //   132: aload_0        
        //   133: aload_2        
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   137: pop            
        //   138: aload_0        
        //   139: aload           12
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: pop            
        //   145: aload_0        
        //   146: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   149: astore_0       
        //   150: ldc             "TtmlParser"
        //   152: aload_0        
        //   153: invokestatic    g0/o.h:(Ljava/lang/String;Ljava/lang/String;)V
        //   156: aconst_null    
        //   157: areturn        
        //   158: aload           17
        //   160: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   163: ifeq            769
        //   166: aload_2        
        //   167: ifnonnull       189
        //   170: new             Ljava/lang/StringBuilder;
        //   173: dup            
        //   174: invokespecial   java/lang/StringBuilder.<init>:()V
        //   177: astore_0       
        //   178: aload_0        
        //   179: ldc_w           "Ignoring region with missing tts:extent: "
        //   182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   185: pop            
        //   186: goto            138
        //   189: aload           17
        //   191: iconst_1       
        //   192: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   195: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   198: checkcast       Ljava/lang/String;
        //   201: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   204: istore          8
        //   206: aload           17
        //   208: iconst_2       
        //   209: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   212: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   215: checkcast       Ljava/lang/String;
        //   218: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   221: istore          9
        //   223: iload           8
        //   225: i2f            
        //   226: aload_2        
        //   227: getfield        i1/d$b.a:I
        //   230: i2f            
        //   231: fdiv           
        //   232: fstore          4
        //   234: iload           9
        //   236: i2f            
        //   237: fstore_3       
        //   238: aload_2        
        //   239: getfield        i1/d$b.b:I
        //   242: istore          8
        //   244: fload_3        
        //   245: iload           8
        //   247: i2f            
        //   248: fdiv           
        //   249: fstore_3       
        //   250: aload_0        
        //   251: ldc_w           "extent"
        //   254: invokestatic    g0/N.a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //   257: astore          11
        //   259: aload           11
        //   261: ifnull          748
        //   264: aload           15
        //   266: aload           11
        //   268: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   271: astore          15
        //   273: aload           14
        //   275: aload           11
        //   277: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   280: astore          14
        //   282: aload           15
        //   284: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   287: istore          10
        //   289: ldc_w           "Ignoring region with malformed extent: "
        //   292: astore          11
        //   294: iload           10
        //   296: ifeq            362
        //   299: aload           15
        //   301: iconst_1       
        //   302: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   305: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   308: checkcast       Ljava/lang/String;
        //   311: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   314: ldc_w           100.0
        //   317: fdiv           
        //   318: fstore          5
        //   320: aload           15
        //   322: iconst_2       
        //   323: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   326: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   329: checkcast       Ljava/lang/String;
        //   332: invokestatic    java/lang/Float.parseFloat:(Ljava/lang/String;)F
        //   335: fstore          6
        //   337: fload           6
        //   339: ldc_w           100.0
        //   342: fdiv           
        //   343: fstore          6
        //   345: goto            449
        //   348: new             Ljava/lang/StringBuilder;
        //   351: dup            
        //   352: invokespecial   java/lang/StringBuilder.<init>:()V
        //   355: astore_0       
        //   356: aload           11
        //   358: astore_2       
        //   359: goto            132
        //   362: aload           14
        //   364: invokevirtual   java/util/regex/Matcher.matches:()Z
        //   367: ifeq            727
        //   370: aload_2        
        //   371: ifnonnull       385
        //   374: new             Ljava/lang/StringBuilder;
        //   377: dup            
        //   378: invokespecial   java/lang/StringBuilder.<init>:()V
        //   381: astore_0       
        //   382: goto            178
        //   385: aload           14
        //   387: iconst_1       
        //   388: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   391: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   394: checkcast       Ljava/lang/String;
        //   397: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   400: istore          8
        //   402: aload           14
        //   404: iconst_2       
        //   405: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   408: invokestatic    g0/a.e:(Ljava/lang/Object;)Ljava/lang/Object;
        //   411: checkcast       Ljava/lang/String;
        //   414: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   417: istore          9
        //   419: iload           8
        //   421: i2f            
        //   422: aload_2        
        //   423: getfield        i1/d$b.a:I
        //   426: i2f            
        //   427: fdiv           
        //   428: fstore          5
        //   430: iload           9
        //   432: i2f            
        //   433: fstore          6
        //   435: aload_2        
        //   436: getfield        i1/d$b.b:I
        //   439: istore          8
        //   441: fload           6
        //   443: iload           8
        //   445: i2f            
        //   446: fdiv           
        //   447: fstore          6
        //   449: aload_0        
        //   450: ldc_w           "displayAlign"
        //   453: invokestatic    g0/N.a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //   456: astore_2       
        //   457: iconst_0       
        //   458: istore          9
        //   460: aload_2        
        //   461: ifnull          520
        //   464: aload_2        
        //   465: invokestatic    W2/c.e:(Ljava/lang/String;)Ljava/lang/String;
        //   468: astore_2       
        //   469: aload_2        
        //   470: invokevirtual   java/lang/String.hashCode:()I
        //   473: pop            
        //   474: aload_2        
        //   475: ldc             "center"
        //   477: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   480: ifne            507
        //   483: aload_2        
        //   484: ldc_w           "after"
        //   487: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   490: ifne            496
        //   493: goto            520
        //   496: fload_3        
        //   497: fload           6
        //   499: fadd           
        //   500: fstore_3       
        //   501: iconst_2       
        //   502: istore          8
        //   504: goto            523
        //   507: fload_3        
        //   508: fload           6
        //   510: fconst_2       
        //   511: fdiv           
        //   512: fadd           
        //   513: fstore_3       
        //   514: iconst_1       
        //   515: istore          8
        //   517: goto            523
        //   520: iconst_0       
        //   521: istore          8
        //   523: fconst_1       
        //   524: iload_1        
        //   525: i2f            
        //   526: fdiv           
        //   527: fstore          7
        //   529: aload_0        
        //   530: ldc_w           "writingMode"
        //   533: invokestatic    g0/N.a:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
        //   536: astore_0       
        //   537: aload_0        
        //   538: ifnull          685
        //   541: aload_0        
        //   542: invokestatic    W2/c.e:(Ljava/lang/String;)Ljava/lang/String;
        //   545: astore_0       
        //   546: aload_0        
        //   547: invokevirtual   java/lang/String.hashCode:()I
        //   550: pop            
        //   551: aload_0        
        //   552: invokevirtual   java/lang/String.hashCode:()I
        //   555: lookupswitch {
        //             3694: 629
        //          3553396: 611
        //          3553576: 593
        //          default: 588
        //        }
        //   588: iconst_m1      
        //   589: istore_1       
        //   590: goto            645
        //   593: aload_0        
        //   594: ldc_w           "tbrl"
        //   597: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   600: ifne            606
        //   603: goto            588
        //   606: iconst_2       
        //   607: istore_1       
        //   608: goto            645
        //   611: aload_0        
        //   612: ldc_w           "tblr"
        //   615: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   618: ifne            624
        //   621: goto            588
        //   624: iconst_1       
        //   625: istore_1       
        //   626: goto            645
        //   629: iload           9
        //   631: istore_1       
        //   632: aload_0        
        //   633: ldc_w           "tb"
        //   636: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   639: ifne            645
        //   642: goto            588
        //   645: iload_1        
        //   646: tableswitch {
        //                0: 680
        //                1: 680
        //                2: 675
        //          default: 672
        //        }
        //   672: goto            685
        //   675: iconst_1       
        //   676: istore_1       
        //   677: goto            689
        //   680: iconst_2       
        //   681: istore_1       
        //   682: goto            689
        //   685: ldc_w           -2147483648
        //   688: istore_1       
        //   689: new             Li1/e;
        //   692: dup            
        //   693: aload           13
        //   695: fload           4
        //   697: fload_3        
        //   698: iconst_0       
        //   699: iload           8
        //   701: fload           5
        //   703: fload           6
        //   705: iconst_1       
        //   706: fload           7
        //   708: iload_1        
        //   709: invokespecial   i1/e.<init>:(Ljava/lang/String;FFIIFFIFI)V
        //   712: areturn        
        //   713: new             Ljava/lang/StringBuilder;
        //   716: dup            
        //   717: invokespecial   java/lang/StringBuilder.<init>:()V
        //   720: astore_0       
        //   721: aload           11
        //   723: astore_2       
        //   724: goto            132
        //   727: new             Ljava/lang/StringBuilder;
        //   730: dup            
        //   731: invokespecial   java/lang/StringBuilder.<init>:()V
        //   734: astore_0       
        //   735: ldc_w           "Ignoring region with unsupported extent: "
        //   738: astore_2       
        //   739: aload_0        
        //   740: aload_2        
        //   741: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   744: pop            
        //   745: goto            138
        //   748: ldc_w           "Ignoring region without an extent"
        //   751: astore_0       
        //   752: goto            150
        //   755: new             Ljava/lang/StringBuilder;
        //   758: dup            
        //   759: invokespecial   java/lang/StringBuilder.<init>:()V
        //   762: astore_0       
        //   763: aload           11
        //   765: astore_2       
        //   766: goto            132
        //   769: new             Ljava/lang/StringBuilder;
        //   772: dup            
        //   773: invokespecial   java/lang/StringBuilder.<init>:()V
        //   776: astore_0       
        //   777: ldc_w           "Ignoring region with unsupported origin: "
        //   780: astore_2       
        //   781: goto            739
        //   784: ldc_w           "Ignoring region without an origin"
        //   787: astore_0       
        //   788: goto            150
        //   791: astore_0       
        //   792: goto            121
        //   795: astore_0       
        //   796: goto            755
        //   799: astore_0       
        //   800: goto            348
        //   803: astore_0       
        //   804: goto            713
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  75     112    791    132    Ljava/lang/NumberFormatException;
        //  189    234    795    769    Ljava/lang/NumberFormatException;
        //  238    244    795    769    Ljava/lang/NumberFormatException;
        //  299    337    799    362    Ljava/lang/NumberFormatException;
        //  385    430    803    727    Ljava/lang/NumberFormatException;
        //  435    441    803    727    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 371 out of bounds for length 371
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static float o(final String str) {
        final Matcher matcher = i1.d.e.matcher(str);
        if (!matcher.matches()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid value for shear: ");
            sb.append(str);
            o.h("TtmlParser", sb.toString());
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String)g0.a.e(matcher.group(1)))));
        }
        catch (NumberFormatException ex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to parse shear: ");
            sb2.append(str);
            o.i("TtmlParser", sb2.toString(), ex);
            return Float.MAX_VALUE;
        }
    }
    
    public static g p(final XmlPullParser p0, final g p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeCount:()I
        //     6: istore          6
        //     8: iconst_0       
        //     9: istore_3       
        //    10: aload_1        
        //    11: astore          7
        //    13: iload_3        
        //    14: iload           6
        //    16: if_icmpge       1488
        //    19: aload_0        
        //    20: iload_3        
        //    21: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeValue:(I)Ljava/lang/String;
        //    26: astore          9
        //    28: aload_0        
        //    29: iload_3        
        //    30: invokeinterface org/xmlpull/v1/XmlPullParser.getAttributeName:(I)Ljava/lang/String;
        //    35: astore_1       
        //    36: aload_1        
        //    37: invokevirtual   java/lang/String.hashCode:()I
        //    40: pop            
        //    41: aload_1        
        //    42: invokevirtual   java/lang/String.hashCode:()I
        //    45: istore_2       
        //    46: iconst_5       
        //    47: istore          4
        //    49: iconst_m1      
        //    50: istore          5
        //    52: iload_2        
        //    53: lookupswitch {
        //          -1550943582: 450
        //          -1224696685: 432
        //          -1065511464: 414
        //          -879295043: 396
        //          -734428249: 378
        //             3355: 360
        //          3511770: 341
        //          94842723: 322
        //          109403361: 303
        //          110138194: 284
        //          365601008: 265
        //          921125321: 246
        //          1115953443: 227
        //          1287124693: 208
        //          1754920356: 189
        //          default: 184
        //        }
        //   184: iconst_m1      
        //   185: istore_2       
        //   186: goto            465
        //   189: aload_1        
        //   190: ldc_w           "multiRowAlign"
        //   193: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   196: ifne            202
        //   199: goto            184
        //   202: bipush          14
        //   204: istore_2       
        //   205: goto            465
        //   208: aload_1        
        //   209: ldc_w           "backgroundColor"
        //   212: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   215: ifne            221
        //   218: goto            184
        //   221: bipush          13
        //   223: istore_2       
        //   224: goto            465
        //   227: aload_1        
        //   228: ldc_w           "rubyPosition"
        //   231: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   234: ifne            240
        //   237: goto            184
        //   240: bipush          12
        //   242: istore_2       
        //   243: goto            465
        //   246: aload_1        
        //   247: ldc_w           "textEmphasis"
        //   250: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   253: ifne            259
        //   256: goto            184
        //   259: bipush          11
        //   261: istore_2       
        //   262: goto            465
        //   265: aload_1        
        //   266: ldc_w           "fontSize"
        //   269: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   272: ifne            278
        //   275: goto            184
        //   278: bipush          10
        //   280: istore_2       
        //   281: goto            465
        //   284: aload_1        
        //   285: ldc_w           "textCombine"
        //   288: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   291: ifne            297
        //   294: goto            184
        //   297: bipush          9
        //   299: istore_2       
        //   300: goto            465
        //   303: aload_1        
        //   304: ldc_w           "shear"
        //   307: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   310: ifne            316
        //   313: goto            184
        //   316: bipush          8
        //   318: istore_2       
        //   319: goto            465
        //   322: aload_1        
        //   323: ldc_w           "color"
        //   326: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   329: ifne            335
        //   332: goto            184
        //   335: bipush          7
        //   337: istore_2       
        //   338: goto            465
        //   341: aload_1        
        //   342: ldc_w           "ruby"
        //   345: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   348: ifne            354
        //   351: goto            184
        //   354: bipush          6
        //   356: istore_2       
        //   357: goto            465
        //   360: aload_1        
        //   361: ldc_w           "id"
        //   364: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   367: ifne            373
        //   370: goto            184
        //   373: iconst_5       
        //   374: istore_2       
        //   375: goto            465
        //   378: aload_1        
        //   379: ldc_w           "fontWeight"
        //   382: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   385: ifne            391
        //   388: goto            184
        //   391: iconst_4       
        //   392: istore_2       
        //   393: goto            465
        //   396: aload_1        
        //   397: ldc_w           "textDecoration"
        //   400: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   403: ifne            409
        //   406: goto            184
        //   409: iconst_3       
        //   410: istore_2       
        //   411: goto            465
        //   414: aload_1        
        //   415: ldc_w           "textAlign"
        //   418: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   421: ifne            427
        //   424: goto            184
        //   427: iconst_2       
        //   428: istore_2       
        //   429: goto            465
        //   432: aload_1        
        //   433: ldc_w           "fontFamily"
        //   436: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   439: ifne            445
        //   442: goto            184
        //   445: iconst_1       
        //   446: istore_2       
        //   447: goto            465
        //   450: aload_1        
        //   451: ldc_w           "fontStyle"
        //   454: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   457: ifne            463
        //   460: goto            184
        //   463: iconst_0       
        //   464: istore_2       
        //   465: iload_2        
        //   466: tableswitch {
        //                0: 1461
        //                1: 1447
        //                2: 1430
        //                3: 1193
        //                4: 1173
        //                5: 1142
        //                6: 864
        //                7: 828
        //                8: 811
        //                9: 748
        //               10: 679
        //               11: 662
        //               12: 599
        //               13: 563
        //               14: 546
        //          default: 540
        //        }
        //   540: aload           7
        //   542: astore_1       
        //   543: goto            1478
        //   546: aload           7
        //   548: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //   551: aload           9
        //   553: invokestatic    i1/d.g:(Ljava/lang/String;)Landroid/text/Layout$Alignment;
        //   556: invokevirtual   i1/g.D:(Landroid/text/Layout$Alignment;)Li1/g;
        //   559: astore_1       
        //   560: goto            1478
        //   563: aload           7
        //   565: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //   568: astore_1       
        //   569: aload_1        
        //   570: aload           9
        //   572: invokestatic    g0/e.c:(Ljava/lang/String;)I
        //   575: invokevirtual   i1/g.u:(I)Li1/g;
        //   578: pop            
        //   579: goto            1478
        //   582: new             Ljava/lang/StringBuilder;
        //   585: dup            
        //   586: invokespecial   java/lang/StringBuilder.<init>:()V
        //   589: astore          7
        //   591: ldc_w           "Failed parsing background value: "
        //   594: astore          8
        //   596: goto            719
        //   599: aload           9
        //   601: invokestatic    W2/c.e:(Ljava/lang/String;)Ljava/lang/String;
        //   604: astore_1       
        //   605: aload_1        
        //   606: invokevirtual   java/lang/String.hashCode:()I
        //   609: pop            
        //   610: aload_1        
        //   611: ldc_w           "before"
        //   614: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   617: ifne            649
        //   620: aload_1        
        //   621: ldc_w           "after"
        //   624: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   627: ifne            636
        //   630: aload           7
        //   632: astore_1       
        //   633: goto            1478
        //   636: aload           7
        //   638: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //   641: iconst_2       
        //   642: invokevirtual   i1/g.E:(I)Li1/g;
        //   645: astore_1       
        //   646: goto            1478
        //   649: aload           7
        //   651: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //   654: iconst_1       
        //   655: invokevirtual   i1/g.E:(I)Li1/g;
        //   658: astore_1       
        //   659: goto            1478
        //   662: aload           7
        //   664: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //   667: aload           9
        //   669: invokestatic    i1/b.a:(Ljava/lang/String;)Li1/b;
        //   672: invokevirtual   i1/g.J:(Li1/b;)Li1/g;
        //   675: astore_1       
        //   676: goto            1478
        //   679: aload           7
        //   681: astore_1       
        //   682: aload           7
        //   684: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //   687: astore          7
        //   689: aload           7
        //   691: astore_1       
        //   692: aload           9
        //   694: aload           7
        //   696: invokestatic    i1/d.i:(Ljava/lang/String;Li1/g;)V
        //   699: aload           7
        //   701: astore_1       
        //   702: goto            1478
        //   705: new             Ljava/lang/StringBuilder;
        //   708: dup            
        //   709: invokespecial   java/lang/StringBuilder.<init>:()V
        //   712: astore          7
        //   714: ldc_w           "Failed parsing fontSize value: "
        //   717: astore          8
        //   719: aload           7
        //   721: aload           8
        //   723: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   726: pop            
        //   727: aload           7
        //   729: aload           9
        //   731: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   734: pop            
        //   735: ldc             "TtmlParser"
        //   737: aload           7
        //   739: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   742: invokestatic    g0/o.h:(Ljava/lang/String;Ljava/lang/String;)V
        //   745: goto            1478
        //   748: aload           9
        //   750: invokestatic    W2/c.e:(Ljava/lang/String;)Ljava/lang/String;
        //   753: astore_1       
        //   754: aload_1        
        //   755: invokevirtual   java/lang/String.hashCode:()I
        //   758: pop            
        //   759: aload_1        
        //   760: ldc_w           "all"
        //   763: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   766: ifne            798
        //   769: aload_1        
        //   770: ldc_w           "none"
        //   773: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   776: ifne            785
        //   779: aload           7
        //   781: astore_1       
        //   782: goto            1478
        //   785: aload           7
        //   787: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //   790: iconst_0       
        //   791: invokevirtual   i1/g.I:(Z)Li1/g;
        //   794: astore_1       
        //   795: goto            1478
        //   798: aload           7
        //   800: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //   803: iconst_1       
        //   804: invokevirtual   i1/g.I:(Z)Li1/g;
        //   807: astore_1       
        //   808: goto            1478
        //   811: aload           7
        //   813: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //   816: aload           9
        //   818: invokestatic    i1/d.o:(Ljava/lang/String;)F
        //   821: invokevirtual   i1/g.G:(F)Li1/g;
        //   824: astore_1       
        //   825: goto            1478
        //   828: aload           7
        //   830: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //   833: astore_1       
        //   834: aload_1        
        //   835: aload           9
        //   837: invokestatic    g0/e.c:(Ljava/lang/String;)I
        //   840: invokevirtual   i1/g.w:(I)Li1/g;
        //   843: pop            
        //   844: goto            1478
        //   847: new             Ljava/lang/StringBuilder;
        //   850: dup            
        //   851: invokespecial   java/lang/StringBuilder.<init>:()V
        //   854: astore          7
        //   856: ldc_w           "Failed parsing color value: "
        //   859: astore          8
        //   861: goto            719
        //   864: aload           9
        //   866: invokestatic    W2/c.e:(Ljava/lang/String;)Ljava/lang/String;
        //   869: astore_1       
        //   870: aload_1        
        //   871: invokevirtual   java/lang/String.hashCode:()I
        //   874: pop            
        //   875: aload_1        
        //   876: invokevirtual   java/lang/String.hashCode:()I
        //   879: lookupswitch {
        //          -618561360: 1029
        //          -410956671: 1011
        //          -250518009: 993
        //          -136074796: 975
        //          3016401: 957
        //          3556653: 941
        //          default: 936
        //        }
        //   936: iconst_m1      
        //   937: istore_2       
        //   938: goto            1044
        //   941: iload           4
        //   943: istore_2       
        //   944: aload_1        
        //   945: ldc_w           "text"
        //   948: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   951: ifne            1044
        //   954: goto            936
        //   957: aload_1        
        //   958: ldc_w           "base"
        //   961: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   964: ifne            970
        //   967: goto            936
        //   970: iconst_4       
        //   971: istore_2       
        //   972: goto            1044
        //   975: aload_1        
        //   976: ldc_w           "textContainer"
        //   979: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   982: ifne            988
        //   985: goto            936
        //   988: iconst_3       
        //   989: istore_2       
        //   990: goto            1044
        //   993: aload_1        
        //   994: ldc_w           "delimiter"
        //   997: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1000: ifne            1006
        //  1003: goto            936
        //  1006: iconst_2       
        //  1007: istore_2       
        //  1008: goto            1044
        //  1011: aload_1        
        //  1012: ldc_w           "container"
        //  1015: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1018: ifne            1024
        //  1021: goto            936
        //  1024: iconst_1       
        //  1025: istore_2       
        //  1026: goto            1044
        //  1029: aload_1        
        //  1030: ldc_w           "baseContainer"
        //  1033: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1036: ifne            1042
        //  1039: goto            936
        //  1042: iconst_0       
        //  1043: istore_2       
        //  1044: iload_2        
        //  1045: tableswitch {
        //                0: 1129
        //                1: 1116
        //                2: 1103
        //                3: 1090
        //                4: 1129
        //                5: 1090
        //          default: 1084
        //        }
        //  1084: aload           7
        //  1086: astore_1       
        //  1087: goto            1478
        //  1090: aload           7
        //  1092: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1095: iconst_3       
        //  1096: invokevirtual   i1/g.F:(I)Li1/g;
        //  1099: astore_1       
        //  1100: goto            1478
        //  1103: aload           7
        //  1105: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1108: iconst_4       
        //  1109: invokevirtual   i1/g.F:(I)Li1/g;
        //  1112: astore_1       
        //  1113: goto            1478
        //  1116: aload           7
        //  1118: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1121: iconst_1       
        //  1122: invokevirtual   i1/g.F:(I)Li1/g;
        //  1125: astore_1       
        //  1126: goto            1478
        //  1129: aload           7
        //  1131: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1134: iconst_2       
        //  1135: invokevirtual   i1/g.F:(I)Li1/g;
        //  1138: astore_1       
        //  1139: goto            1478
        //  1142: aload           7
        //  1144: astore_1       
        //  1145: ldc             "style"
        //  1147: aload_0        
        //  1148: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //  1153: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1156: ifeq            1478
        //  1159: aload           7
        //  1161: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1164: aload           9
        //  1166: invokevirtual   i1/g.A:(Ljava/lang/String;)Li1/g;
        //  1169: astore_1       
        //  1170: goto            1478
        //  1173: aload           7
        //  1175: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1178: ldc_w           "bold"
        //  1181: aload           9
        //  1183: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1186: invokevirtual   i1/g.v:(Z)Li1/g;
        //  1189: astore_1       
        //  1190: goto            1478
        //  1193: aload           9
        //  1195: invokestatic    W2/c.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1198: astore_1       
        //  1199: aload_1        
        //  1200: invokevirtual   java/lang/String.hashCode:()I
        //  1203: pop            
        //  1204: aload_1        
        //  1205: invokevirtual   java/lang/String.hashCode:()I
        //  1208: lookupswitch {
        //          -1461280213: 1321
        //          -1026963764: 1300
        //          913457136: 1279
        //          1679736913: 1258
        //          default: 1252
        //        }
        //  1252: iload           5
        //  1254: istore_2       
        //  1255: goto            1339
        //  1258: aload_1        
        //  1259: ldc_w           "linethrough"
        //  1262: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1265: ifne            1274
        //  1268: iload           5
        //  1270: istore_2       
        //  1271: goto            1339
        //  1274: iconst_3       
        //  1275: istore_2       
        //  1276: goto            1339
        //  1279: aload_1        
        //  1280: ldc_w           "nolinethrough"
        //  1283: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1286: ifne            1295
        //  1289: iload           5
        //  1291: istore_2       
        //  1292: goto            1339
        //  1295: iconst_2       
        //  1296: istore_2       
        //  1297: goto            1339
        //  1300: aload_1        
        //  1301: ldc_w           "underline"
        //  1304: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1307: ifne            1316
        //  1310: iload           5
        //  1312: istore_2       
        //  1313: goto            1339
        //  1316: iconst_1       
        //  1317: istore_2       
        //  1318: goto            1339
        //  1321: aload_1        
        //  1322: ldc_w           "nounderline"
        //  1325: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1328: ifne            1337
        //  1331: iload           5
        //  1333: istore_2       
        //  1334: goto            1339
        //  1337: iconst_0       
        //  1338: istore_2       
        //  1339: iload_2        
        //  1340: tableswitch {
        //                0: 1417
        //                1: 1404
        //                2: 1391
        //                3: 1378
        //          default: 1372
        //        }
        //  1372: aload           7
        //  1374: astore_1       
        //  1375: goto            1478
        //  1378: aload           7
        //  1380: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1383: iconst_1       
        //  1384: invokevirtual   i1/g.C:(Z)Li1/g;
        //  1387: astore_1       
        //  1388: goto            1478
        //  1391: aload           7
        //  1393: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1396: iconst_0       
        //  1397: invokevirtual   i1/g.C:(Z)Li1/g;
        //  1400: astore_1       
        //  1401: goto            1478
        //  1404: aload           7
        //  1406: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1409: iconst_1       
        //  1410: invokevirtual   i1/g.K:(Z)Li1/g;
        //  1413: astore_1       
        //  1414: goto            1478
        //  1417: aload           7
        //  1419: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1422: iconst_0       
        //  1423: invokevirtual   i1/g.K:(Z)Li1/g;
        //  1426: astore_1       
        //  1427: goto            1478
        //  1430: aload           7
        //  1432: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1435: aload           9
        //  1437: invokestatic    i1/d.g:(Ljava/lang/String;)Landroid/text/Layout$Alignment;
        //  1440: invokevirtual   i1/g.H:(Landroid/text/Layout$Alignment;)Li1/g;
        //  1443: astore_1       
        //  1444: goto            1478
        //  1447: aload           7
        //  1449: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1452: aload           9
        //  1454: invokevirtual   i1/g.x:(Ljava/lang/String;)Li1/g;
        //  1457: astore_1       
        //  1458: goto            1478
        //  1461: aload           7
        //  1463: invokestatic    i1/d.e:(Li1/g;)Li1/g;
        //  1466: ldc_w           "italic"
        //  1469: aload           9
        //  1471: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //  1474: invokevirtual   i1/g.B:(Z)Li1/g;
        //  1477: astore_1       
        //  1478: iload_3        
        //  1479: iconst_1       
        //  1480: iadd           
        //  1481: istore_3       
        //  1482: aload_1        
        //  1483: astore          7
        //  1485: goto            13
        //  1488: aload           7
        //  1490: areturn        
        //  1491: astore          7
        //  1493: goto            582
        //  1496: astore          7
        //  1498: goto            705
        //  1501: astore          7
        //  1503: goto            847
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  569    579    1491   599    Ljava/lang/IllegalArgumentException;
        //  682    689    1496   719    Lc1/m;
        //  692    699    1496   719    Lc1/m;
        //  834    844    1501   864    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 523 out of bounds for length 523
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static String[] q(String trim) {
        trim = trim.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        return M.b1(trim, "\\s+");
    }
    
    public static long r(String s, final a a) {
        final Matcher matcher = i1.d.b.matcher(s);
        final boolean matches = matcher.matches();
        int n = 4;
        if (matches) {
            final double n2 = (double)(Long.parseLong((String)a.e(matcher.group(1))) * 3600L);
            final double n3 = (double)(Long.parseLong((String)a.e(matcher.group(2))) * 60L);
            final double n4 = (double)Long.parseLong((String)a.e(matcher.group(3)));
            s = matcher.group(4);
            double n5 = 0.0;
            double double1;
            if (s != null) {
                double1 = Double.parseDouble(s);
            }
            else {
                double1 = 0.0;
            }
            s = matcher.group(5);
            double n6;
            if (s != null) {
                n6 = Long.parseLong(s) / a.a;
            }
            else {
                n6 = 0.0;
            }
            s = matcher.group(6);
            if (s != null) {
                n5 = Long.parseLong(s) / (double)a.b / a.a;
            }
            return (long)((n2 + n3 + n4 + double1 + n6 + n5) * 1000000.0);
        }
        final Matcher matcher2 = i1.d.c.matcher(s);
        if (matcher2.matches()) {
            final double double2 = Double.parseDouble((String)a.e(matcher2.group(1)));
            s = (String)a.e(matcher2.group(2));
            s.hashCode();
            Label_0392: {
                switch (s) {
                    case "ms": {
                        break Label_0392;
                    }
                    case "t": {
                        n = 3;
                        break Label_0392;
                    }
                    case "m": {
                        n = 2;
                        break Label_0392;
                    }
                    case "h": {
                        n = 1;
                        break Label_0392;
                    }
                    case "f": {
                        n = 0;
                        break Label_0392;
                    }
                    default:
                        break;
                }
                n = -1;
            }
            double n9 = 0.0;
            Label_0459: {
                double n8 = 0.0;
                switch (n) {
                    default: {
                        final double n7 = double2;
                        return (long)(n7 * 1000000.0);
                    }
                    case 4: {
                        n8 = 1000.0;
                        break;
                    }
                    case 3: {
                        n8 = a.c;
                        break;
                    }
                    case 2: {
                        n9 = 60.0;
                        break Label_0459;
                    }
                    case 1: {
                        n9 = 3600.0;
                        break Label_0459;
                    }
                    case 0: {
                        n8 = a.a;
                        break;
                    }
                }
                final double n7 = double2 / n8;
                return (long)(n7 * 1000000.0);
            }
            final double n7 = double2 * n9;
            return (long)(n7 * 1000000.0);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Malformed time expression: ");
        sb.append(s);
        throw new m(sb.toString());
    }
    
    public static b s(final XmlPullParser xmlPullParser) {
        final String a = N.a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        final Matcher matcher = i1.d.g.matcher(a);
        StringBuilder sb;
        String str;
        if (!matcher.matches()) {
            sb = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        else {
            while (true) {
                try {
                    return new b(Integer.parseInt((String)g0.a.e(matcher.group(1))), Integer.parseInt((String)g0.a.e(matcher.group(2))));
                    sb = new StringBuilder();
                    str = "Ignoring malformed tts extent: ";
                }
                catch (NumberFormatException ex) {
                    continue;
                }
                break;
            }
        }
        sb.append(str);
        sb.append(a);
        o.h("TtmlParser", sb.toString());
        return null;
    }
    
    @Override
    public k a(byte[] s, int h, int length) {
    Label_0512_Outer:
        while (true) {
            while (true) {
                int i = 0;
                a a = null;
                Object o = null;
                int n = 0;
                Label_0601: {
                    while (true) {
                        Label_0595: {
                            while (true) {
                                try {
                                    final XmlPullParser pullParser = this.a.newPullParser();
                                    final HashMap hashMap = new HashMap();
                                    final HashMap<String, e> hashMap2 = new HashMap<String, e>();
                                    final HashMap hashMap3 = new HashMap();
                                    hashMap2.put("", new e(""));
                                    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])s, h, length);
                                    s = null;
                                    pullParser.setInput((InputStream)byteArrayInputStream, (String)null);
                                    final ArrayDeque<i1.c> arrayDeque = new ArrayDeque<i1.c>();
                                    i = pullParser.getEventType();
                                    a = i1.d.i;
                                    o = null;
                                    length = 0;
                                    n = 15;
                                    while (i != 1) {
                                        final i1.c c = arrayDeque.peek();
                                        if (length != 0) {
                                            break Label_0601;
                                        }
                                        final String name = pullParser.getName();
                                        Object o2 = null;
                                        a a2 = null;
                                        int n2 = 0;
                                        Object o3 = null;
                                        if (i == 2) {
                                            if (!"tt".equals(name)) {
                                                break Label_0595;
                                            }
                                            a = j(pullParser);
                                            h = h(pullParser, 15);
                                            s = s(pullParser);
                                            if (!f(name)) {
                                                final StringBuilder sb = new StringBuilder();
                                                sb.append("Ignoring unsupported tag: ");
                                                sb.append(pullParser.getName());
                                                g0.o.f("TtmlParser", sb.toString());
                                                ++length;
                                                o2 = s;
                                                a2 = a;
                                                n2 = h;
                                                o3 = o;
                                                h = length;
                                            }
                                            else {
                                            Label_0334:
                                                while (true) {
                                                    if ("head".equals(name)) {
                                                        k(pullParser, hashMap, h, (b)s, hashMap2, hashMap3);
                                                        final int n3 = length;
                                                        break Label_0334;
                                                    }
                                                    while (true) {
                                                        try {
                                                            final i1.c m = m(pullParser, c, hashMap2, a);
                                                            arrayDeque.push(m);
                                                            int n3 = length;
                                                            if (c != null) {
                                                                c.a(m);
                                                                n3 = length;
                                                            }
                                                            break Label_0334;
                                                        }
                                                        catch (m j) {
                                                            g0.o.i("TtmlParser", "Suppressing parser error", j);
                                                            final int n3 = length + 1;
                                                            o2 = s;
                                                            a2 = a;
                                                            n2 = h;
                                                            o3 = o;
                                                            h = n3;
                                                            break;
                                                        }
                                                        continue Label_0334;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        else if (i == 4) {
                                            ((i1.c)g0.a.e(c)).a(i1.c.d(pullParser.getText()));
                                            o2 = s;
                                            a2 = a;
                                            n2 = n;
                                            o3 = o;
                                            h = length;
                                        }
                                        else {
                                            o2 = s;
                                            a2 = a;
                                            n2 = n;
                                            o3 = o;
                                            h = length;
                                            if (i == 3) {
                                                if (pullParser.getName().equals("tt")) {
                                                    o = new h((i1.c)g0.a.e(arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                                                }
                                                arrayDeque.pop();
                                                o2 = s;
                                                a2 = a;
                                                n2 = n;
                                                o3 = o;
                                                h = length;
                                            }
                                        }
                                        pullParser.next();
                                        i = pullParser.getEventType();
                                        s = o2;
                                        a = a2;
                                        n = n2;
                                        o = o3;
                                        length = h;
                                    }
                                    return (k)g0.a.e(o);
                                    final Throwable cause;
                                    throw new IllegalStateException("Unable to decode source", cause);
                                }
                                catch (IOException ex2) {}
                                catch (XmlPullParserException ex) {}
                                final XmlPullParserException ex;
                                final Throwable cause = (Throwable)ex;
                                continue;
                            }
                        }
                        h = n;
                        continue Label_0512_Outer;
                    }
                }
                if (i == 2) {
                    h = length + 1;
                    final Object o2 = s;
                    final a a2 = a;
                    final int n2 = n;
                    final Object o3 = o;
                    continue;
                }
                Object o2 = s;
                a a2 = a;
                int n2 = n;
                Object o3 = o;
                h = length;
                if (i == 3) {
                    h = length - 1;
                    o2 = s;
                    a2 = a;
                    n2 = n;
                    o3 = o;
                    continue;
                }
                continue;
            }
        }
    }
    
    @Override
    public void c(final byte[] array, final int n, final int n2, final t.b b, final g0.g g) {
        c1.i.c(this.a(array, n, n2), b, g);
    }
    
    @Override
    public int d() {
        return 1;
    }
    
    public static final class a
    {
        public final float a;
        public final int b;
        public final int c;
        
        public a(final float a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        
        public b(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}
