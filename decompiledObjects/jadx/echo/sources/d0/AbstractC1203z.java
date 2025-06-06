package d0;

import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import g0.AbstractC1297a;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: d0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1203z {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f13015a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f13016b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: d0.z$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13017a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13018b;

        public a(int i7, int i8) {
            this.f13017a = i7;
            this.f13018b = i8;
        }

        public int a() {
            int i7 = this.f13018b;
            if (i7 == 2) {
                return 10;
            }
            if (i7 == 5) {
                return 11;
            }
            if (i7 == 29) {
                return 12;
            }
            if (i7 == 42) {
                return 16;
            }
            if (i7 != 22) {
                return i7 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        a i7;
        int a7;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (i7 = i(str2)) != null && (a7 = i7.a()) != 0 && a7 != 16) {
                    break;
                }
                break;
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : g0.M.d1(str)) {
            String g7 = g(str2);
            if (g7 != null && o(g7)) {
                return g7;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] d12 = g0.M.d1(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : d12) {
            if (str2.equals(g(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String e(String str) {
        ArrayList arrayList = f13015a;
        if (arrayList.size() <= 0) {
            return null;
        }
        android.support.v4.media.a.a(arrayList.get(0));
        throw null;
    }

    public static int f(String str, String str2) {
        a i7;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (i7 = i(str2)) == null) {
                    return 0;
                }
                return i7.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        a i7;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e7 = W2.c.e(str.trim());
        if (e7.startsWith("avc1") || e7.startsWith("avc3")) {
            return "video/avc";
        }
        if (e7.startsWith("hev1") || e7.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e7.startsWith("dvav") || e7.startsWith("dva1") || e7.startsWith("dvhe") || e7.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e7.startsWith("av01")) {
            return "video/av01";
        }
        if (e7.startsWith("vp9") || e7.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e7.startsWith("vp8") || e7.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!e7.startsWith("mp4a")) {
            return e7.startsWith("mha1") ? "audio/mha1" : e7.startsWith("mhm1") ? "audio/mhm1" : (e7.startsWith("ac-3") || e7.startsWith("dac3")) ? "audio/ac3" : (e7.startsWith("ec-3") || e7.startsWith("dec3")) ? "audio/eac3" : e7.startsWith("ec+3") ? "audio/eac3-joc" : (e7.startsWith("ac-4") || e7.startsWith("dac4")) ? "audio/ac4" : e7.startsWith("dtsc") ? "audio/vnd.dts" : e7.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (e7.startsWith("dtsh") || e7.startsWith("dtsl")) ? "audio/vnd.dts.hd" : e7.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : e7.startsWith("opus") ? "audio/opus" : e7.startsWith("vorbis") ? "audio/vorbis" : e7.startsWith("flac") ? "audio/flac" : e7.startsWith("stpp") ? "application/ttml+xml" : e7.startsWith("wvtt") ? "text/vtt" : e7.contains("cea708") ? "application/cea-708" : (e7.contains("eia608") || e7.contains("cea608")) ? "application/cea-608" : e(e7);
        }
        if (e7.startsWith("mp4a.") && (i7 = i(e7)) != null) {
            str2 = h(i7.f13017a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    public static String h(int i7) {
        if (i7 == 32) {
            return "video/mp4v-es";
        }
        if (i7 == 33) {
            return "video/avc";
        }
        if (i7 == 35) {
            return "video/hevc";
        }
        if (i7 == 64) {
            return "audio/mp4a-latm";
        }
        if (i7 == 163) {
            return "video/wvc1";
        }
        if (i7 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i7 == 221) {
            return "audio/vorbis";
        }
        if (i7 == 165) {
            return "audio/ac3";
        }
        if (i7 == 166) {
            return "audio/eac3";
        }
        switch (i7) {
            case 96:
            case ModuleDescriptor.MODULE_VERSION /* 97 */:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i7) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static a i(String str) {
        Matcher matcher = f13016b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) AbstractC1297a.e(matcher.group(1));
        String group = matcher.group(2);
        try {
            return new a(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (o(str)) {
            return 1;
        }
        if (s(str)) {
            return 2;
        }
        if (r(str)) {
            return 3;
        }
        if (p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return l(str);
    }

    public static int l(String str) {
        ArrayList arrayList = f13015a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        android.support.v4.media.a.a(arrayList.get(0));
        throw null;
    }

    public static int m(String str) {
        return k(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : g0.M.d1(str)) {
            String g7 = g(str2);
            if (g7 != null && s(g7)) {
                return g7;
            }
        }
        return null;
    }

    public static boolean o(String str) {
        return "audio".equals(j(str));
    }

    public static boolean p(String str) {
        return "image".equals(j(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean q(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean r(String str) {
        return "text".equals(j(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean s(String str) {
        return "video".equals(j(str));
    }

    public static String t(String str) {
        String e7;
        if (str == null) {
            return null;
        }
        e7 = W2.c.e(str);
        e7.hashCode();
        switch (e7) {
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return e7;
        }
    }
}
