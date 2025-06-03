// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import android.text.TextUtils;
import java.util.regex.Matcher;
import W2.c;
import android.support.v4.media.a;
import g0.M;
import java.util.regex.Pattern;
import java.util.ArrayList;

public abstract class z
{
    public static final ArrayList a;
    public static final Pattern b;
    
    static {
        a = new ArrayList();
        b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }
    
    public static boolean a(final String s, final String s2) {
        final boolean b = false;
        if (s == null) {
            return false;
        }
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1903589369: {
                if (!s.equals("audio/g711-mlaw")) {
                    break;
                }
                n = 10;
                break;
            }
            case 1903231877: {
                if (!s.equals("audio/g711-alaw")) {
                    break;
                }
                n = 9;
                break;
            }
            case 1504831518: {
                if (!s.equals("audio/mpeg")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1504619009: {
                if (!s.equals("audio/flac")) {
                    break;
                }
                n = 7;
                break;
            }
            case 1504578661: {
                if (!s.equals("audio/eac3")) {
                    break;
                }
                n = 6;
                break;
            }
            case 187094639: {
                if (!s.equals("audio/raw")) {
                    break;
                }
                n = 5;
                break;
            }
            case 187078296: {
                if (!s.equals("audio/ac3")) {
                    break;
                }
                n = 4;
                break;
            }
            case -53558318: {
                if (!s.equals("audio/mp4a-latm")) {
                    break;
                }
                n = 3;
                break;
            }
            case -432837259: {
                if (!s.equals("audio/mpeg-L2")) {
                    break;
                }
                n = 2;
                break;
            }
            case -432837260: {
                if (!s.equals("audio/mpeg-L1")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2123537834: {
                if (!s.equals("audio/eac3-joc")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return false;
            }
            case 3: {
                if (s2 == null) {
                    return false;
                }
                final a i = i(s2);
                if (i == null) {
                    return false;
                }
                final int a = i.a();
                boolean b2 = b;
                if (a != 0) {
                    b2 = b;
                    if (a != 16) {
                        b2 = true;
                    }
                }
                return b2;
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
            case 10: {
                return true;
            }
        }
    }
    
    public static boolean b(final String s, final String s2) {
        return d(s, s2) != null;
    }
    
    public static String c(final String s) {
        if (s == null) {
            return null;
        }
        final String[] d1 = M.d1(s);
        for (int length = d1.length, i = 0; i < length; ++i) {
            final String g = g(d1[i]);
            if (g != null && o(g)) {
                return g;
            }
        }
        return null;
    }
    
    public static String d(final String s, final String s2) {
        String string = null;
        if (s != null) {
            if (s2 == null) {
                return null;
            }
            final String[] d1 = M.d1(s);
            final StringBuilder sb = new StringBuilder();
            for (int length = d1.length, i = 0; i < length; ++i) {
                final String str = d1[i];
                if (s2.equals(g(str))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                }
            }
            string = string;
            if (sb.length() > 0) {
                string = sb.toString();
            }
        }
        return string;
    }
    
    public static String e(final String s) {
        final ArrayList a = z.a;
        if (a.size() <= 0) {
            return null;
        }
        android.support.v4.media.a.a(a.get(0));
        throw null;
    }
    
    public static int f(final String s, final String s2) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1556697186: {
                if (!s.equals("audio/true-hd")) {
                    break;
                }
                n = 11;
                break;
            }
            case 1505942594: {
                if (!s.equals("audio/vnd.dts.hd")) {
                    break;
                }
                n = 10;
                break;
            }
            case 1504891608: {
                if (!s.equals("audio/opus")) {
                    break;
                }
                n = 9;
                break;
            }
            case 1504831518: {
                if (!s.equals("audio/mpeg")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1504578661: {
                if (!s.equals("audio/eac3")) {
                    break;
                }
                n = 7;
                break;
            }
            case 550520934: {
                if (!s.equals("audio/vnd.dts.uhd;profile=p2")) {
                    break;
                }
                n = 6;
                break;
            }
            case 187078297: {
                if (!s.equals("audio/ac4")) {
                    break;
                }
                n = 5;
                break;
            }
            case 187078296: {
                if (!s.equals("audio/ac3")) {
                    break;
                }
                n = 4;
                break;
            }
            case -53558318: {
                if (!s.equals("audio/mp4a-latm")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1095064472: {
                if (!s.equals("audio/vnd.dts")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1365340241: {
                if (!s.equals("audio/vnd.dts.hd;profile=lbr")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2123537834: {
                if (!s.equals("audio/eac3-joc")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
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
                if (s2 == null) {
                    return 0;
                }
                final a i = i(s2);
                if (i == null) {
                    return 0;
                }
                return i.a();
            }
            case 2: {
                return 7;
            }
            case 1: {
                return 8;
            }
            case 0: {
                return 18;
            }
        }
    }
    
    public static String g(String h) {
        final String s = null;
        if (h == null) {
            return null;
        }
        final String e = c.e(h.trim());
        if (e.startsWith("avc1") || e.startsWith("avc3")) {
            return "video/avc";
        }
        if (e.startsWith("hev1") || e.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e.startsWith("dvav") || e.startsWith("dva1") || e.startsWith("dvhe") || e.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e.startsWith("av01")) {
            return "video/av01";
        }
        if (e.startsWith("vp9") || e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e.startsWith("vp8") || e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (e.startsWith("mp4a")) {
            h = s;
            if (e.startsWith("mp4a.")) {
                final a i = i(e);
                h = s;
                if (i != null) {
                    h = h(i.a);
                }
            }
            String s2;
            if ((s2 = h) == null) {
                s2 = "audio/mp4a-latm";
            }
            return s2;
        }
        if (e.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (e.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (e.startsWith("ac-3") || e.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (e.startsWith("ec-3") || e.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (e.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (e.startsWith("ac-4") || e.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (e.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (e.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (e.startsWith("dtsh") || e.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (e.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (e.startsWith("opus")) {
            return "audio/opus";
        }
        if (e.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (e.startsWith("flac")) {
            return "audio/flac";
        }
        if (e.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (e.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (e.contains("cea708")) {
            return "application/cea-708";
        }
        if (!e.contains("eia608") && !e.contains("cea608")) {
            return e(e);
        }
        return "application/cea-608";
    }
    
    public static String h(final int n) {
        if (n == 32) {
            return "video/mp4v-es";
        }
        if (n == 33) {
            return "video/avc";
        }
        if (n != 35) {
            if (n != 64) {
                if (n == 163) {
                    return "video/wvc1";
                }
                if (n == 177) {
                    return "video/x-vnd.on2.vp9";
                }
                if (n == 221) {
                    return "audio/vorbis";
                }
                if (n == 165) {
                    return "audio/ac3";
                }
                if (n == 166) {
                    return "audio/eac3";
                }
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                return null;
                            }
                            case 174: {
                                return "audio/ac4";
                            }
                            case 173: {
                                return "audio/opus";
                            }
                            case 170:
                            case 171: {
                                return "audio/vnd.dts.hd";
                            }
                            case 169:
                            case 172: {
                                return "audio/vnd.dts";
                            }
                        }
                        break;
                    }
                    case 108: {
                        return "image/jpeg";
                    }
                    case 106: {
                        return "video/mpeg";
                    }
                    case 105:
                    case 107: {
                        return "audio/mpeg";
                    }
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101: {
                        return "video/mpeg2";
                    }
                    case 102:
                    case 103:
                    case 104: {
                        break;
                    }
                }
            }
            return "audio/mp4a-latm";
        }
        return "video/hevc";
    }
    
    public static a i(String s) {
        final Matcher matcher = z.b.matcher(s);
        if (!matcher.matches()) {
            return null;
        }
        s = (String)g0.a.e(matcher.group(1));
        final String group = matcher.group(2);
        try {
            final int int1 = Integer.parseInt(s, 16);
            int int2;
            if (group != null) {
                int2 = Integer.parseInt(group);
            }
            else {
                int2 = 0;
            }
            return new a(int1, int2);
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    public static String j(final String s) {
        if (s == null) {
            return null;
        }
        final int index = s.indexOf(47);
        if (index == -1) {
            return null;
        }
        return s.substring(0, index);
    }
    
    public static int k(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return -1;
        }
        if (o(s)) {
            return 1;
        }
        if (s(s)) {
            return 2;
        }
        if (r(s)) {
            return 3;
        }
        if (p(s)) {
            return 4;
        }
        if ("application/id3".equals(s) || "application/x-emsg".equals(s) || "application/x-scte35".equals(s)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(s)) {
            return 6;
        }
        return l(s);
    }
    
    public static int l(final String s) {
        final ArrayList a = z.a;
        if (a.size() <= 0) {
            return -1;
        }
        android.support.v4.media.a.a(a.get(0));
        throw null;
    }
    
    public static int m(final String s) {
        return k(g(s));
    }
    
    public static String n(final String s) {
        if (s == null) {
            return null;
        }
        final String[] d1 = M.d1(s);
        for (int length = d1.length, i = 0; i < length; ++i) {
            final String g = g(d1[i]);
            if (g != null && s(g)) {
                return g;
            }
        }
        return null;
    }
    
    public static boolean o(final String s) {
        return "audio".equals(j(s));
    }
    
    public static boolean p(final String anObject) {
        return "image".equals(j(anObject)) || "application/x-image-uri".equals(anObject);
    }
    
    public static boolean q(final String s) {
        boolean b = false;
        if (s == null) {
            return false;
        }
        if (s.startsWith("video/webm") || s.startsWith("audio/webm") || s.startsWith("application/webm") || s.startsWith("video/x-matroska") || s.startsWith("audio/x-matroska") || s.startsWith("application/x-matroska")) {
            b = true;
        }
        return b;
    }
    
    public static boolean r(final String s) {
        return "text".equals(j(s)) || "application/x-media3-cues".equals(s) || "application/cea-608".equals(s) || "application/cea-708".equals(s) || "application/x-mp4-cea-608".equals(s) || "application/x-subrip".equals(s) || "application/ttml+xml".equals(s) || "application/x-quicktime-tx3g".equals(s) || "application/x-mp4-vtt".equals(s) || "application/x-rawcc".equals(s) || "application/vobsub".equals(s) || "application/pgs".equals(s) || "application/dvbsubs".equals(s);
    }
    
    public static boolean s(final String s) {
        return "video".equals(j(s));
    }
    
    public static String t(String e) {
        if (e == null) {
            return null;
        }
        e = c.e(e);
        e.hashCode();
        final int hashCode = e.hashCode();
        int n = -1;
        switch (hashCode) {
            case 187090231: {
                if (!e.equals("audio/mp3")) {
                    break;
                }
                n = 5;
                break;
            }
            case -432836267: {
                if (!e.equals("audio/mpeg-l2")) {
                    break;
                }
                n = 4;
                break;
            }
            case -432836268: {
                if (!e.equals("audio/mpeg-l1")) {
                    break;
                }
                n = 3;
                break;
            }
            case -586683234: {
                if (!e.equals("audio/x-wav")) {
                    break;
                }
                n = 2;
                break;
            }
            case -979095690: {
                if (!e.equals("application/x-mpegurl")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1007807498: {
                if (!e.equals("audio/x-flac")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return e;
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
            case 0: {
                return "audio/flac";
            }
        }
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        
        public a(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public int a() {
            final int b = this.b;
            if (b == 2) {
                return 10;
            }
            if (b == 5) {
                return 11;
            }
            if (b == 29) {
                return 12;
            }
            if (b == 42) {
                return 16;
            }
            if (b == 22) {
                return 1073741824;
            }
            if (b != 23) {
                return 0;
            }
            return 15;
        }
    }
}
