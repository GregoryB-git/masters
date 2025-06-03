package v5;

import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f15928a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f15929b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f15930a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15931b;

        public b(int i10, int i11) {
            this.f15930a = i10;
            this.f15931b = i11;
        }

        public final int a() {
            int i10 = this.f15931b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(String str, String str2) {
        b g10;
        int a10;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (g10 = g(str2)) != null && (a10 = g10.a()) != 0 && a10 != 16) {
                    break;
                }
                break;
        }
        return false;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : e0.Q(str)) {
            String e10 = e(str2);
            if (e10 != null && k(e10)) {
                return e10;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] Q = e0.Q(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : Q) {
            if (str2.equals(e(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static int d(String str, String str2) {
        b g10;
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (g10 = g(str2)) == null) {
                    return 0;
                }
                return g10.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
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

    public static String e(String str) {
        b g10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String x02 = x6.b.x0(str.trim());
        if (x02.startsWith("avc1") || x02.startsWith("avc3")) {
            return "video/avc";
        }
        if (x02.startsWith("hev1") || x02.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (x02.startsWith("dvav") || x02.startsWith("dva1") || x02.startsWith("dvhe") || x02.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (x02.startsWith("av01")) {
            return "video/av01";
        }
        if (x02.startsWith("vp9") || x02.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (x02.startsWith("vp8") || x02.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (x02.startsWith("mp4a")) {
            if (x02.startsWith("mp4a.") && (g10 = g(x02)) != null) {
                str2 = f(g10.f15930a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (x02.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (x02.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (x02.startsWith("ac-3") || x02.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (x02.startsWith("ec-3") || x02.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (x02.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (x02.startsWith("ac-4") || x02.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (x02.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (x02.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (x02.startsWith("dtsh") || x02.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (x02.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (x02.startsWith("opus")) {
            return "audio/opus";
        }
        if (x02.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (x02.startsWith("flac")) {
            return "audio/flac";
        }
        if (x02.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (x02.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (x02.contains("cea708")) {
            return "application/cea-708";
        }
        if (x02.contains("eia608") || x02.contains("cea608")) {
            return "application/cea-608";
        }
        int size = f15928a.size();
        for (int i10 = 0; i10 < size; i10++) {
            f15928a.get(i10).getClass();
            if (x02.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    public static String f(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case 100:
            case 101:
                return "video/mpeg2";
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return "audio/mp4a-latm";
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                return "audio/mpeg";
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return "video/mpeg";
            default:
                switch (i10) {
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

    public static b g(String str) {
        Matcher matcher = f15929b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new b(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if ("image".equals(h(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f15928a.size();
        for (int i10 = 0; i10 < size; i10++) {
            f15928a.get(i10).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : e0.Q(str)) {
            String e10 = e(str2);
            if (e10 != null && m(e10)) {
                return e10;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str) {
        return "text".equals(h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m(String str) {
        return "video".equals(h(str));
    }
}
