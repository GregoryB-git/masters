/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package g0;

import W2.c;
import android.graphics.Color;
import android.text.TextUtils;
import g0.a;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class e {
    public static final Pattern a = Pattern.compile((String)"^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile((String)"^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile((String)"^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put((Object)"aliceblue", (Object)-984833);
        hashMap.put((Object)"antiquewhite", (Object)-332841);
        Integer n8 = -16711681;
        hashMap.put((Object)"aqua", (Object)n8);
        hashMap.put((Object)"aquamarine", (Object)-8388652);
        hashMap.put((Object)"azure", (Object)-983041);
        hashMap.put((Object)"beige", (Object)-657956);
        hashMap.put((Object)"bisque", (Object)-6972);
        hashMap.put((Object)"black", (Object)-16777216);
        hashMap.put((Object)"blanchedalmond", (Object)-5171);
        hashMap.put((Object)"blue", (Object)-16776961);
        hashMap.put((Object)"blueviolet", (Object)-7722014);
        hashMap.put((Object)"brown", (Object)-5952982);
        hashMap.put((Object)"burlywood", (Object)-2180985);
        hashMap.put((Object)"cadetblue", (Object)-10510688);
        hashMap.put((Object)"chartreuse", (Object)-8388864);
        hashMap.put((Object)"chocolate", (Object)-2987746);
        hashMap.put((Object)"coral", (Object)-32944);
        hashMap.put((Object)"cornflowerblue", (Object)-10185235);
        hashMap.put((Object)"cornsilk", (Object)-1828);
        hashMap.put((Object)"crimson", (Object)-2354116);
        hashMap.put((Object)"cyan", (Object)n8);
        hashMap.put((Object)"darkblue", (Object)-16777077);
        hashMap.put((Object)"darkcyan", (Object)-16741493);
        hashMap.put((Object)"darkgoldenrod", (Object)-4684277);
        n8 = -5658199;
        hashMap.put((Object)"darkgray", (Object)n8);
        hashMap.put((Object)"darkgreen", (Object)-16751616);
        hashMap.put((Object)"darkgrey", (Object)n8);
        hashMap.put((Object)"darkkhaki", (Object)-4343957);
        hashMap.put((Object)"darkmagenta", (Object)-7667573);
        hashMap.put((Object)"darkolivegreen", (Object)-11179217);
        hashMap.put((Object)"darkorange", (Object)-29696);
        hashMap.put((Object)"darkorchid", (Object)-6737204);
        hashMap.put((Object)"darkred", (Object)-7667712);
        hashMap.put((Object)"darksalmon", (Object)-1468806);
        hashMap.put((Object)"darkseagreen", (Object)-7357297);
        hashMap.put((Object)"darkslateblue", (Object)-12042869);
        n8 = -13676721;
        hashMap.put((Object)"darkslategray", (Object)n8);
        hashMap.put((Object)"darkslategrey", (Object)n8);
        hashMap.put((Object)"darkturquoise", (Object)-16724271);
        hashMap.put((Object)"darkviolet", (Object)-7077677);
        hashMap.put((Object)"deeppink", (Object)-60269);
        hashMap.put((Object)"deepskyblue", (Object)-16728065);
        n8 = -9868951;
        hashMap.put((Object)"dimgray", (Object)n8);
        hashMap.put((Object)"dimgrey", (Object)n8);
        hashMap.put((Object)"dodgerblue", (Object)-14774017);
        hashMap.put((Object)"firebrick", (Object)-5103070);
        hashMap.put((Object)"floralwhite", (Object)-1296);
        hashMap.put((Object)"forestgreen", (Object)-14513374);
        n8 = -65281;
        hashMap.put((Object)"fuchsia", (Object)n8);
        hashMap.put((Object)"gainsboro", (Object)-2302756);
        hashMap.put((Object)"ghostwhite", (Object)-460545);
        hashMap.put((Object)"gold", (Object)-10496);
        hashMap.put((Object)"goldenrod", (Object)-2448096);
        Integer n9 = -8355712;
        hashMap.put((Object)"gray", (Object)n9);
        hashMap.put((Object)"green", (Object)-16744448);
        hashMap.put((Object)"greenyellow", (Object)-5374161);
        hashMap.put((Object)"grey", (Object)n9);
        hashMap.put((Object)"honeydew", (Object)-983056);
        hashMap.put((Object)"hotpink", (Object)-38476);
        hashMap.put((Object)"indianred", (Object)-3318692);
        hashMap.put((Object)"indigo", (Object)-11861886);
        hashMap.put((Object)"ivory", (Object)-16);
        hashMap.put((Object)"khaki", (Object)-989556);
        hashMap.put((Object)"lavender", (Object)-1644806);
        hashMap.put((Object)"lavenderblush", (Object)-3851);
        hashMap.put((Object)"lawngreen", (Object)-8586240);
        hashMap.put((Object)"lemonchiffon", (Object)-1331);
        hashMap.put((Object)"lightblue", (Object)-5383962);
        hashMap.put((Object)"lightcoral", (Object)-1015680);
        hashMap.put((Object)"lightcyan", (Object)-2031617);
        hashMap.put((Object)"lightgoldenrodyellow", (Object)-329006);
        n9 = -2894893;
        hashMap.put((Object)"lightgray", (Object)n9);
        hashMap.put((Object)"lightgreen", (Object)-7278960);
        hashMap.put((Object)"lightgrey", (Object)n9);
        hashMap.put((Object)"lightpink", (Object)-18751);
        hashMap.put((Object)"lightsalmon", (Object)-24454);
        hashMap.put((Object)"lightseagreen", (Object)-14634326);
        hashMap.put((Object)"lightskyblue", (Object)-7876870);
        n9 = -8943463;
        hashMap.put((Object)"lightslategray", (Object)n9);
        hashMap.put((Object)"lightslategrey", (Object)n9);
        hashMap.put((Object)"lightsteelblue", (Object)-5192482);
        hashMap.put((Object)"lightyellow", (Object)-32);
        hashMap.put((Object)"lime", (Object)-16711936);
        hashMap.put((Object)"limegreen", (Object)-13447886);
        hashMap.put((Object)"linen", (Object)-331546);
        hashMap.put((Object)"magenta", (Object)n8);
        hashMap.put((Object)"maroon", (Object)-8388608);
        hashMap.put((Object)"mediumaquamarine", (Object)-10039894);
        hashMap.put((Object)"mediumblue", (Object)-16777011);
        hashMap.put((Object)"mediumorchid", (Object)-4565549);
        hashMap.put((Object)"mediumpurple", (Object)-7114533);
        hashMap.put((Object)"mediumseagreen", (Object)-12799119);
        hashMap.put((Object)"mediumslateblue", (Object)-8689426);
        hashMap.put((Object)"mediumspringgreen", (Object)-16713062);
        hashMap.put((Object)"mediumturquoise", (Object)-12004916);
        hashMap.put((Object)"mediumvioletred", (Object)-3730043);
        hashMap.put((Object)"midnightblue", (Object)-15132304);
        hashMap.put((Object)"mintcream", (Object)-655366);
        hashMap.put((Object)"mistyrose", (Object)-6943);
        hashMap.put((Object)"moccasin", (Object)-6987);
        hashMap.put((Object)"navajowhite", (Object)-8531);
        hashMap.put((Object)"navy", (Object)-16777088);
        hashMap.put((Object)"oldlace", (Object)-133658);
        hashMap.put((Object)"olive", (Object)-8355840);
        hashMap.put((Object)"olivedrab", (Object)-9728477);
        hashMap.put((Object)"orange", (Object)-23296);
        hashMap.put((Object)"orangered", (Object)-47872);
        hashMap.put((Object)"orchid", (Object)-2461482);
        hashMap.put((Object)"palegoldenrod", (Object)-1120086);
        hashMap.put((Object)"palegreen", (Object)-6751336);
        hashMap.put((Object)"paleturquoise", (Object)-5247250);
        hashMap.put((Object)"palevioletred", (Object)-2396013);
        hashMap.put((Object)"papayawhip", (Object)-4139);
        hashMap.put((Object)"peachpuff", (Object)-9543);
        hashMap.put((Object)"peru", (Object)-3308225);
        hashMap.put((Object)"pink", (Object)-16181);
        hashMap.put((Object)"plum", (Object)-2252579);
        hashMap.put((Object)"powderblue", (Object)-5185306);
        hashMap.put((Object)"purple", (Object)-8388480);
        hashMap.put((Object)"rebeccapurple", (Object)-10079335);
        hashMap.put((Object)"red", (Object)-65536);
        hashMap.put((Object)"rosybrown", (Object)-4419697);
        hashMap.put((Object)"royalblue", (Object)-12490271);
        hashMap.put((Object)"saddlebrown", (Object)-7650029);
        hashMap.put((Object)"salmon", (Object)-360334);
        hashMap.put((Object)"sandybrown", (Object)-744352);
        hashMap.put((Object)"seagreen", (Object)-13726889);
        hashMap.put((Object)"seashell", (Object)-2578);
        hashMap.put((Object)"sienna", (Object)-6270419);
        hashMap.put((Object)"silver", (Object)-4144960);
        hashMap.put((Object)"skyblue", (Object)-7876885);
        hashMap.put((Object)"slateblue", (Object)-9807155);
        n8 = -9404272;
        hashMap.put((Object)"slategray", (Object)n8);
        hashMap.put((Object)"slategrey", (Object)n8);
        hashMap.put((Object)"snow", (Object)-1286);
        hashMap.put((Object)"springgreen", (Object)-16711809);
        hashMap.put((Object)"steelblue", (Object)-12156236);
        hashMap.put((Object)"tan", (Object)-2968436);
        hashMap.put((Object)"teal", (Object)-16744320);
        hashMap.put((Object)"thistle", (Object)-2572328);
        hashMap.put((Object)"tomato", (Object)-40121);
        hashMap.put((Object)"transparent", (Object)0);
        hashMap.put((Object)"turquoise", (Object)-12525360);
        hashMap.put((Object)"violet", (Object)-1146130);
        hashMap.put((Object)"wheat", (Object)-663885);
        hashMap.put((Object)"white", (Object)-1);
        hashMap.put((Object)"whitesmoke", (Object)-657931);
        hashMap.put((Object)"yellow", (Object)-256);
        hashMap.put((Object)"yellowgreen", (Object)-6632142);
    }

    public static int a(String string2, boolean bl) {
        a.a(TextUtils.isEmpty((CharSequence)string2) ^ true);
        String string3 = string2.replace((CharSequence)" ", (CharSequence)"");
        if (string3.charAt(0) == '#') {
            int n8 = (int)Long.parseLong((String)string3.substring(1), (int)16);
            if (string3.length() == 7) {
                return -16777216 | n8;
            }
            if (string3.length() == 9) {
                return (n8 & 255) << 24 | n8 >>> 8;
            }
            throw new IllegalArgumentException();
        }
        if (string3.startsWith("rgba")) {
            string2 = bl ? c : b;
            if ((string2 = string2.matcher((CharSequence)string3)).matches()) {
                int n9 = bl ? (int)(Float.parseFloat((String)((String)a.e(string2.group(4)))) * 255.0f) : Integer.parseInt((String)((String)a.e(string2.group(4))), (int)10);
                return Color.argb((int)n9, (int)Integer.parseInt((String)((String)a.e(string2.group(1))), (int)10), (int)Integer.parseInt((String)((String)a.e(string2.group(2))), (int)10), (int)Integer.parseInt((String)((String)a.e(string2.group(3))), (int)10));
            }
        } else if (string3.startsWith("rgb")) {
            string2 = a.matcher((CharSequence)string3);
            if (string2.matches()) {
                return Color.rgb((int)Integer.parseInt((String)((String)a.e(string2.group(1))), (int)10), (int)Integer.parseInt((String)((String)a.e(string2.group(2))), (int)10), (int)Integer.parseInt((String)((String)a.e(string2.group(3))), (int)10));
            }
        } else {
            string2 = (Integer)d.get((Object)c.e(string3));
            if (string2 != null) {
                return string2.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int b(String string2) {
        return e.a(string2, true);
    }

    public static int c(String string2) {
        return e.a(string2, false);
    }
}

