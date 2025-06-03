/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package d0;

import W2.c;
import android.text.TextUtils;
import g0.M;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class z {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile((String)"^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String object, String string2) {
        boolean bl = false;
        if (object == null) {
            return false;
        }
        int n8 = object.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1903589369: {
                if (!object.equals((Object)"audio/g711-mlaw")) break;
                n9 = 10;
                break;
            }
            case 1903231877: {
                if (!object.equals((Object)"audio/g711-alaw")) break;
                n9 = 9;
                break;
            }
            case 1504831518: {
                if (!object.equals((Object)"audio/mpeg")) break;
                n9 = 8;
                break;
            }
            case 1504619009: {
                if (!object.equals((Object)"audio/flac")) break;
                n9 = 7;
                break;
            }
            case 1504578661: {
                if (!object.equals((Object)"audio/eac3")) break;
                n9 = 6;
                break;
            }
            case 187094639: {
                if (!object.equals((Object)"audio/raw")) break;
                n9 = 5;
                break;
            }
            case 187078296: {
                if (!object.equals((Object)"audio/ac3")) break;
                n9 = 4;
                break;
            }
            case -53558318: {
                if (!object.equals((Object)"audio/mp4a-latm")) break;
                n9 = 3;
                break;
            }
            case -432837259: {
                if (!object.equals((Object)"audio/mpeg-L2")) break;
                n9 = 2;
                break;
            }
            case -432837260: {
                if (!object.equals((Object)"audio/mpeg-L1")) break;
                n9 = 1;
                break;
            }
            case -2123537834: {
                if (!object.equals((Object)"audio/eac3-joc")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return false;
            }
            case 3: {
                if (string2 == null) {
                    return false;
                }
                object = z.i(string2);
                if (object == null) {
                    return false;
                }
                n9 = object.a();
                boolean bl2 = bl;
                if (n9 != 0) {
                    bl2 = bl;
                    if (n9 != 16) {
                        bl2 = true;
                    }
                }
                return bl2;
            }
            case 0: 
            case 1: 
            case 2: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
        }
        return true;
    }

    public static boolean b(String string2, String string3) {
        if (z.d(string2, string3) != null) {
            return true;
        }
        return false;
    }

    public static String c(String arrstring) {
        if (arrstring == null) {
            return null;
        }
        arrstring = M.d1((String)arrstring);
        int n8 = arrstring.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            String string2 = z.g(arrstring[i8]);
            if (string2 == null || !z.o(string2)) continue;
            return string2;
        }
        return null;
    }

    public static String d(String string2, String string3) {
        String[] arrstring = null;
        Object object = arrstring;
        if (string2 != null) {
            if (string3 == null) {
                return null;
            }
            object = M.d1(string2);
            string2 = new StringBuilder();
            for (String string4 : object) {
                if (!string3.equals((Object)z.g(string4))) continue;
                if (string2.length() > 0) {
                    string2.append(",");
                }
                string2.append(string4);
            }
            object = arrstring;
            if (string2.length() > 0) {
                object = string2.toString();
            }
        }
        return object;
    }

    public static String e(String string2) {
        string2 = a;
        if (string2.size() <= 0) {
            return null;
        }
        android.support.v4.media.a.a(string2.get(0));
        throw null;
    }

    public static int f(String object, String string2) {
        object.hashCode();
        int n8 = object.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1556697186: {
                if (!object.equals((Object)"audio/true-hd")) break;
                n9 = 11;
                break;
            }
            case 1505942594: {
                if (!object.equals((Object)"audio/vnd.dts.hd")) break;
                n9 = 10;
                break;
            }
            case 1504891608: {
                if (!object.equals((Object)"audio/opus")) break;
                n9 = 9;
                break;
            }
            case 1504831518: {
                if (!object.equals((Object)"audio/mpeg")) break;
                n9 = 8;
                break;
            }
            case 1504578661: {
                if (!object.equals((Object)"audio/eac3")) break;
                n9 = 7;
                break;
            }
            case 550520934: {
                if (!object.equals((Object)"audio/vnd.dts.uhd;profile=p2")) break;
                n9 = 6;
                break;
            }
            case 187078297: {
                if (!object.equals((Object)"audio/ac4")) break;
                n9 = 5;
                break;
            }
            case 187078296: {
                if (!object.equals((Object)"audio/ac3")) break;
                n9 = 4;
                break;
            }
            case -53558318: {
                if (!object.equals((Object)"audio/mp4a-latm")) break;
                n9 = 3;
                break;
            }
            case -1095064472: {
                if (!object.equals((Object)"audio/vnd.dts")) break;
                n9 = 2;
                break;
            }
            case -1365340241: {
                if (!object.equals((Object)"audio/vnd.dts.hd;profile=lbr")) break;
                n9 = 1;
                break;
            }
            case -2123537834: {
                if (!object.equals((Object)"audio/eac3-joc")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return 0;
            }
            case 11: {
                return 14;
            }
            case 10: {
                return 8;
            }
            case 9: {
                return 20;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 6;
            }
            case 6: {
                return 30;
            }
            case 5: {
                return 17;
            }
            case 4: {
                return 5;
            }
            case 3: {
                if (string2 == null) {
                    return 0;
                }
                object = z.i(string2);
                if (object == null) {
                    return 0;
                }
                return object.a();
            }
            case 2: {
                return 7;
            }
            case 1: {
                return 8;
            }
            case 0: 
        }
        return 18;
    }

    public static String g(String string2) {
        String string3 = null;
        if (string2 == null) {
            return null;
        }
        Object object = c.e(string2.trim());
        if (!object.startsWith("avc1") && !object.startsWith("avc3")) {
            if (!object.startsWith("hev1") && !object.startsWith("hvc1")) {
                if (!(object.startsWith("dvav") || object.startsWith("dva1") || object.startsWith("dvhe") || object.startsWith("dvh1"))) {
                    if (object.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!object.startsWith("vp9") && !object.startsWith("vp09")) {
                        if (!object.startsWith("vp8") && !object.startsWith("vp08")) {
                            if (object.startsWith("mp4a")) {
                                string2 = string3;
                                if (object.startsWith("mp4a.")) {
                                    object = z.i((String)object);
                                    string2 = string3;
                                    if (object != null) {
                                        string2 = z.h(object.a);
                                    }
                                }
                                string3 = string2;
                                if (string2 == null) {
                                    string3 = "audio/mp4a-latm";
                                }
                                return string3;
                            }
                            if (object.startsWith("mha1")) {
                                return "audio/mha1";
                            }
                            if (object.startsWith("mhm1")) {
                                return "audio/mhm1";
                            }
                            if (!object.startsWith("ac-3") && !object.startsWith("dac3")) {
                                if (!object.startsWith("ec-3") && !object.startsWith("dec3")) {
                                    if (object.startsWith("ec+3")) {
                                        return "audio/eac3-joc";
                                    }
                                    if (!object.startsWith("ac-4") && !object.startsWith("dac4")) {
                                        if (object.startsWith("dtsc")) {
                                            return "audio/vnd.dts";
                                        }
                                        if (object.startsWith("dtse")) {
                                            return "audio/vnd.dts.hd;profile=lbr";
                                        }
                                        if (!object.startsWith("dtsh") && !object.startsWith("dtsl")) {
                                            if (object.startsWith("dtsx")) {
                                                return "audio/vnd.dts.uhd;profile=p2";
                                            }
                                            if (object.startsWith("opus")) {
                                                return "audio/opus";
                                            }
                                            if (object.startsWith("vorbis")) {
                                                return "audio/vorbis";
                                            }
                                            if (object.startsWith("flac")) {
                                                return "audio/flac";
                                            }
                                            if (object.startsWith("stpp")) {
                                                return "application/ttml+xml";
                                            }
                                            if (object.startsWith("wvtt")) {
                                                return "text/vtt";
                                            }
                                            if (object.contains((CharSequence)"cea708")) {
                                                return "application/cea-708";
                                            }
                                            if (!object.contains((CharSequence)"eia608") && !object.contains((CharSequence)"cea608")) {
                                                return z.e((String)object);
                                            }
                                            return "application/cea-608";
                                        }
                                        return "audio/vnd.dts.hd";
                                    }
                                    return "audio/ac4";
                                }
                                return "audio/eac3";
                            }
                            return "audio/ac3";
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    /*
     * Exception decompiling
     */
    public static String h(int var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:486)
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

    public static a i(String string2) {
        int n8;
        int n9;
        block5 : {
            block4 : {
                Object object = b.matcher((CharSequence)string2);
                if (!object.matches()) {
                    return null;
                }
                string2 = (String)g0.a.e(object.group(1));
                object = object.group(2);
                try {
                    n8 = Integer.parseInt((String)string2, (int)16);
                    if (object == null) break block4;
                }
                catch (NumberFormatException numberFormatException) {
                    return null;
                }
                n9 = Integer.parseInt((String)object);
                break block5;
            }
            n9 = 0;
        }
        return new a(n8, n9);
    }

    public static String j(String string2) {
        if (string2 == null) {
            return null;
        }
        int n8 = string2.indexOf(47);
        if (n8 == -1) {
            return null;
        }
        return string2.substring(0, n8);
    }

    public static int k(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return -1;
        }
        if (z.o(string2)) {
            return 1;
        }
        if (z.s(string2)) {
            return 2;
        }
        if (z.r(string2)) {
            return 3;
        }
        if (z.p(string2)) {
            return 4;
        }
        if (!("application/id3".equals((Object)string2) || "application/x-emsg".equals((Object)string2) || "application/x-scte35".equals((Object)string2))) {
            if ("application/x-camera-motion".equals((Object)string2)) {
                return 6;
            }
            return z.l(string2);
        }
        return 5;
    }

    public static int l(String string2) {
        string2 = a;
        if (string2.size() <= 0) {
            return -1;
        }
        android.support.v4.media.a.a(string2.get(0));
        throw null;
    }

    public static int m(String string2) {
        return z.k(z.g(string2));
    }

    public static String n(String arrstring) {
        if (arrstring == null) {
            return null;
        }
        arrstring = M.d1((String)arrstring);
        int n8 = arrstring.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            String string2 = z.g(arrstring[i8]);
            if (string2 == null || !z.s(string2)) continue;
            return string2;
        }
        return null;
    }

    public static boolean o(String string2) {
        return "audio".equals((Object)z.j(string2));
    }

    public static boolean p(String string2) {
        if (!"image".equals((Object)z.j(string2)) && !"application/x-image-uri".equals((Object)string2)) {
            return false;
        }
        return true;
    }

    public static boolean q(String string2) {
        boolean bl = false;
        if (string2 == null) {
            return false;
        }
        if (string2.startsWith("video/webm") || string2.startsWith("audio/webm") || string2.startsWith("application/webm") || string2.startsWith("video/x-matroska") || string2.startsWith("audio/x-matroska") || string2.startsWith("application/x-matroska")) {
            bl = true;
        }
        return bl;
    }

    public static boolean r(String string2) {
        if (!("text".equals((Object)z.j(string2)) || "application/x-media3-cues".equals((Object)string2) || "application/cea-608".equals((Object)string2) || "application/cea-708".equals((Object)string2) || "application/x-mp4-cea-608".equals((Object)string2) || "application/x-subrip".equals((Object)string2) || "application/ttml+xml".equals((Object)string2) || "application/x-quicktime-tx3g".equals((Object)string2) || "application/x-mp4-vtt".equals((Object)string2) || "application/x-rawcc".equals((Object)string2) || "application/vobsub".equals((Object)string2) || "application/pgs".equals((Object)string2) || "application/dvbsubs".equals((Object)string2))) {
            return false;
        }
        return true;
    }

    public static boolean s(String string2) {
        return "video".equals((Object)z.j(string2));
    }

    public static String t(String string2) {
        if (string2 == null) {
            return null;
        }
        string2 = c.e(string2);
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 187090231: {
                if (!string2.equals((Object)"audio/mp3")) break;
                n9 = 5;
                break;
            }
            case -432836267: {
                if (!string2.equals((Object)"audio/mpeg-l2")) break;
                n9 = 4;
                break;
            }
            case -432836268: {
                if (!string2.equals((Object)"audio/mpeg-l1")) break;
                n9 = 3;
                break;
            }
            case -586683234: {
                if (!string2.equals((Object)"audio/x-wav")) break;
                n9 = 2;
                break;
            }
            case -979095690: {
                if (!string2.equals((Object)"application/x-mpegurl")) break;
                n9 = 1;
                break;
            }
            case -1007807498: {
                if (!string2.equals((Object)"audio/x-flac")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return string2;
            }
            case 5: {
                return "audio/mpeg";
            }
            case 4: {
                return "audio/mpeg-L2";
            }
            case 3: {
                return "audio/mpeg-L1";
            }
            case 2: {
                return "audio/wav";
            }
            case 1: {
                return "application/x-mpegURL";
            }
            case 0: 
        }
        return "audio/flac";
    }

    public static final class a {
        public final int a;
        public final int b;

        public a(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }

        public int a() {
            int n8 = this.b;
            if (n8 != 2) {
                if (n8 != 5) {
                    if (n8 != 29) {
                        if (n8 != 42) {
                            if (n8 != 22) {
                                if (n8 != 23) {
                                    return 0;
                                }
                                return 15;
                            }
                            return 1073741824;
                        }
                        return 16;
                    }
                    return 12;
                }
                return 11;
            }
            return 10;
        }
    }

}

