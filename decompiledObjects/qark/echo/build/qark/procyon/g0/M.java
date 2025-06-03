// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import a3.i;
import java.util.Objects;
import android.util.SparseArray;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.io.IOException;
import java.io.Closeable;
import java.util.ArrayList;
import d0.q;
import java.util.Collections;
import android.os.SystemClock;
import Z2.b;
import android.view.Display$Mode;
import java.util.List;
import android.os.Parcel;
import android.view.Display;
import android.view.WindowManager;
import android.hardware.display.DisplayManager;
import android.graphics.Point;
import android.telephony.TelephonyManager;
import java.util.regex.Matcher;
import d0.A;
import java.math.BigDecimal;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import d0.z;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import d0.D;
import java.util.Arrays;
import android.media.AudioFormat$Builder;
import android.media.AudioFormat;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import android.media.AudioManager;
import W2.e;
import java.math.RoundingMode;
import android.app.UiModeManager;
import java.util.MissingResourceException;
import java.util.Locale;
import android.text.TextUtils;
import android.net.Uri;
import W2.c;
import android.content.Context;
import android.os.Looper;
import android.os.Handler$Callback;
import android.os.Handler;
import android.os.Build;
import android.os.Build$VERSION;
import java.util.HashMap;
import java.util.regex.Pattern;

public abstract class M
{
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final long[] g;
    public static final Pattern h;
    public static final Pattern i;
    public static final Pattern j;
    public static final Pattern k;
    public static HashMap l;
    public static final String[] m;
    public static final String[] n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;
    
    static {
        final int l = a = Build$VERSION.SDK_INT;
        final String str = b = Build.DEVICE;
        final String str2 = c = Build.MANUFACTURER;
        final String str3 = d = Build.MODEL;
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(l);
        e = sb.toString();
        f = new byte[0];
        g = new long[0];
        h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        j = Pattern.compile("%([A-Fa-f0-9]{2})");
        k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        m = new String[] { "alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn" };
        n = new String[] { "i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn" };
        o = new int[] { 0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108 };
        p = new int[] { 0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935 };
        q = new int[] { 0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243 };
    }
    
    public static Handler A() {
        return B(null);
    }
    
    public static boolean A0(final int n) {
        return n == 3 || n == 2 || n == 268435456 || n == 21 || n == 1342177280 || n == 22 || n == 1610612736 || n == 4;
    }
    
    public static Handler B(final Handler$Callback handler$Callback) {
        return z((Looper)g0.a.h(Looper.myLooper()), handler$Callback);
    }
    
    public static boolean B0(final Context context) {
        final int a = M.a;
        if (a >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (a == 30) {
                final String d = M.d;
                if (W2.c.a(d, "moto g(20)")) {
                    return true;
                }
                if (W2.c.a(d, "rmx3231")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public static Handler C() {
        return D(null);
    }
    
    public static boolean C0(final int n) {
        return n == 10 || n == 13;
    }
    
    public static Handler D(final Handler$Callback handler$Callback) {
        return z(U(), handler$Callback);
    }
    
    public static boolean D0(final Uri uri) {
        final String scheme = uri.getScheme();
        return TextUtils.isEmpty((CharSequence)scheme) || "file".equals(scheme);
    }
    
    public static HashMap E() {
        String[] array = Locale.getISOLanguages();
        final HashMap hashMap = new HashMap<String, String>(array.length + M.m.length);
        final int length = array.length;
        final int n = 0;
        int n2 = 0;
    Label_0075_Outer:
        while (true) {
            int n3 = n;
            Label_0082: {
                if (n2 >= length) {
                    break Label_0082;
                }
                final String s = array[n2];
                while (true) {
                    try {
                        final String iso3Language = new Locale(s).getISO3Language();
                        if (!TextUtils.isEmpty((CharSequence)iso3Language)) {
                            hashMap.put(iso3Language, s);
                        }
                        ++n2;
                        continue Label_0075_Outer;
                        while (true) {
                            hashMap.put(array[n3], array[n3 + 1]);
                            n3 += 2;
                            break Label_0082;
                            Label_0117: {
                                return hashMap;
                            }
                            array = M.m;
                            continue;
                        }
                    }
                    // iftrue(Label_0117:, n3 >= array.length)
                    catch (MissingResourceException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static boolean E0(final Context context) {
        final UiModeManager uiModeManager = (UiModeManager)context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }
    
    public static long F(final long n, final int n2) {
        return Y0(n, n2, 1000000L, RoundingMode.CEILING);
    }
    
    public static boolean F0(final Context context) {
        return M.a >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }
    
    public static String G(final String format, final Object... args) {
        return String.format(Locale.US, format, args);
    }
    
    public static String H(final byte[] bytes) {
        return new String(bytes, W2.e.c);
    }
    
    public static int H0(final int[] array, final int n) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    public static String I(final byte[] bytes, final int offset, final int length) {
        return new String(bytes, offset, length, W2.e.c);
    }
    
    public static String I0(final String s) {
        int n = 0;
        while (true) {
            final String[] n2 = M.n;
            if (n >= n2.length) {
                return s;
            }
            if (s.startsWith(n2[n])) {
                final StringBuilder sb = new StringBuilder();
                sb.append(n2[n + 1]);
                sb.append(s.substring(n2[n].length()));
                return sb.toString();
            }
            n += 2;
        }
    }
    
    public static int J(final Context context) {
        final AudioManager audioManager = (AudioManager)context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }
    
    public static long J0(final long n) {
        long n2 = n;
        if (n != -9223372036854775807L) {
            if (n == Long.MIN_VALUE) {
                return n;
            }
            n2 = n * 1000L;
        }
        return n2;
    }
    
    public static int K(final int n) {
        if (n == 20) {
            return 30;
        }
        if (n == 22) {
            return 31;
        }
        if (n == 30) {
            return 34;
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        return Integer.MAX_VALUE;
                    }
                    case 14: {
                        return 25;
                    }
                    case 15:
                    case 16:
                    case 17:
                    case 18: {
                        return 28;
                    }
                }
                break;
            }
            case 9:
            case 10:
            case 11:
            case 12: {
                return 28;
            }
            case 7:
            case 8: {
                return 23;
            }
            case 4:
            case 5:
            case 6: {
                return 21;
            }
            case 2:
            case 3: {
                return 3;
            }
        }
    }
    
    public static ExecutorService K0(final String s) {
        return Executors.newSingleThreadExecutor(new L(s));
    }
    
    public static AudioFormat L(final int sampleRate, final int channelMask, final int encoding) {
        return new AudioFormat$Builder().setSampleRate(sampleRate).setChannelMask(channelMask).setEncoding(encoding).build();
    }
    
    public static String L0(String string) {
        if (string == null) {
            return null;
        }
        final String replace = string.replace('_', '-');
        String s = string;
        if (!replace.isEmpty()) {
            if (replace.equals("und")) {
                s = string;
            }
            else {
                s = replace;
            }
        }
        final String e = W2.c.e(s);
        final String key = c1(e, "-")[0];
        if (M.l == null) {
            M.l = E();
        }
        final String str = M.l.get(key);
        String anObject = key;
        string = e;
        if (str != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(e.substring(key.length()));
            string = sb.toString();
            anObject = str;
        }
        if (!"no".equals(anObject) && !"i".equals(anObject)) {
            final String i0 = string;
            if (!"zh".equals(anObject)) {
                return i0;
            }
        }
        return I0(string);
    }
    
    public static int M(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 12: {
                return 743676;
            }
            case 10: {
                if (M.a >= 32) {
                    return 737532;
                }
                return 6396;
            }
            case 8: {
                return 6396;
            }
            case 7: {
                return 1276;
            }
            case 6: {
                return 252;
            }
            case 5: {
                return 220;
            }
            case 4: {
                return 204;
            }
            case 3: {
                return 28;
            }
            case 2: {
                return 12;
            }
            case 1: {
                return 4;
            }
        }
    }
    
    public static Object[] M0(final Object[] original, final Object o) {
        final Object[] copy = Arrays.copyOf(original, original.length + 1);
        copy[original.length] = o;
        return j(copy);
    }
    
    public static D.b N(final D d, final D.b b) {
        final boolean o = d.o();
        final boolean w = d.w();
        final boolean g = d.G();
        final boolean b2 = d.B();
        final boolean q = d.Q();
        final boolean i = d.I();
        final boolean q2 = d.L().q();
        final D.b.a d2 = new D.b.a().b(b).d(4, o ^ true);
        final boolean b3 = false;
        final D.b.a d3 = d2.d(5, w && !o).d(6, g && !o).d(7, !q2 && (g || !q || w) && !o).d(8, b2 && !o).d(9, !q2 && (b2 || (q && i)) && !o).d(10, o ^ true).d(11, w && !o);
        boolean b4 = b3;
        if (w) {
            b4 = b3;
            if (!o) {
                b4 = true;
            }
        }
        return d3.d(12, b4).e();
    }
    
    public static Object[] N0(final Object[] original, final Object[] array) {
        final Object[] copy = Arrays.copyOf(original, original.length + array.length);
        System.arraycopy(array, 0, copy, original.length, array.length);
        return copy;
    }
    
    public static int O(final ByteBuffer byteBuffer, int int1) {
        int1 = byteBuffer.getInt(int1);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return int1;
        }
        return Integer.reverseBytes(int1);
    }
    
    public static Object[] O0(final Object[] original, final int newLength) {
        g0.a.a(newLength <= original.length);
        return Arrays.copyOf(original, newLength);
    }
    
    public static int P(final String s, final int n) {
        final String[] d1 = d1(s);
        final int length = d1.length;
        int i = 0;
        int n2 = 0;
        while (i < length) {
            int n3 = n2;
            if (n == z.m(d1[i])) {
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        return n2;
    }
    
    public static Object[] P0(final Object[] original, final int from, final int to) {
        final boolean b = false;
        g0.a.a(from >= 0);
        boolean b2 = b;
        if (to <= original.length) {
            b2 = true;
        }
        g0.a.a(b2);
        return Arrays.copyOfRange(original, from, to);
    }
    
    public static String Q(String string, final int n) {
        final String[] d1 = d1(string);
        final int length = d1.length;
        string = null;
        if (length == 0) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (int length2 = d1.length, i = 0; i < length2; ++i) {
            final String str = d1[i];
            if (n == z.m(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        if (sb.length() > 0) {
            string = sb.toString();
        }
        return string;
    }
    
    public static long Q0(String group) {
        final Matcher matcher = M.h.matcher(group);
        if (matcher.matches()) {
            group = matcher.group(9);
            int n = 0;
            if (group != null) {
                if (!matcher.group(9).equalsIgnoreCase("Z")) {
                    final int n2 = n = Integer.parseInt(matcher.group(12)) * 60 + Integer.parseInt(matcher.group(13));
                    if ("-".equals(matcher.group(11))) {
                        n = n2 * -1;
                    }
                }
            }
            final GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty((CharSequence)matcher.group(8))) {
                final StringBuilder sb = new StringBuilder();
                sb.append("0.");
                sb.append(matcher.group(8));
                gregorianCalendar.set(14, new BigDecimal(sb.toString()).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (n != 0) {
                timeInMillis -= n * 60000L;
            }
            return timeInMillis;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid date/time format: ");
        sb2.append(group);
        throw A.a(sb2.toString(), null);
    }
    
    public static String R(final Context context) {
        if (context != null) {
            final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
            if (telephonyManager != null) {
                final String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (!TextUtils.isEmpty((CharSequence)networkCountryIso)) {
                    return W2.c.f(networkCountryIso);
                }
            }
        }
        return W2.c.f(Locale.getDefault().getCountry());
    }
    
    public static long R0(String s) {
        final Matcher matcher = M.i.matcher(s);
        if (matcher.matches()) {
            final boolean empty = TextUtils.isEmpty((CharSequence)matcher.group(1));
            s = matcher.group(3);
            double double1 = 0.0;
            double n;
            if (s != null) {
                n = Double.parseDouble(s) * 3.1556908E7;
            }
            else {
                n = 0.0;
            }
            s = matcher.group(5);
            double n2;
            if (s != null) {
                n2 = Double.parseDouble(s) * 2629739.0;
            }
            else {
                n2 = 0.0;
            }
            s = matcher.group(7);
            double n3;
            if (s != null) {
                n3 = Double.parseDouble(s) * 86400.0;
            }
            else {
                n3 = 0.0;
            }
            s = matcher.group(10);
            double n4;
            if (s != null) {
                n4 = Double.parseDouble(s) * 3600.0;
            }
            else {
                n4 = 0.0;
            }
            s = matcher.group(12);
            double n5;
            if (s != null) {
                n5 = Double.parseDouble(s) * 60.0;
            }
            else {
                n5 = 0.0;
            }
            s = matcher.group(14);
            if (s != null) {
                double1 = Double.parseDouble(s);
            }
            long n6 = (long)((n + n2 + n3 + n4 + n5 + double1) * 1000.0);
            if (true ^ empty) {
                n6 = -n6;
            }
            return n6;
        }
        return (long)(Double.parseDouble(s) * 3600.0 * 1000.0);
    }
    
    public static Point S(final Context context) {
        final DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
        Display display;
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        }
        else {
            display = null;
        }
        Display defaultDisplay = display;
        if (display == null) {
            defaultDisplay = ((WindowManager)g0.a.e(context.getSystemService("window"))).getDefaultDisplay();
        }
        return T(context, defaultDisplay);
    }
    
    public static boolean S0(final Handler handler, final Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }
    
    public static Point T(Context context, final Display display) {
        Label_0199: {
            if (display.getDisplayId() != 0 || !E0(context)) {
                break Label_0199;
            }
            String s;
            if (M.a < 28) {
                s = "sys.display-size";
            }
            else {
                s = "vendor.display-size";
            }
            final String o0 = o0(s);
            Label_0148: {
                if (TextUtils.isEmpty((CharSequence)o0)) {
                    break Label_0148;
                }
                while (true) {
                    try {
                        final String[] b1 = b1(o0.trim(), "x");
                        if (b1.length == 2) {
                            final int int1 = Integer.parseInt(b1[0]);
                            final int int2 = Integer.parseInt(b1[1]);
                            if (int1 > 0 && int2 > 0) {
                                return new Point(int1, int2);
                            }
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid display size: ");
                        sb.append(o0);
                        g0.o.c("Util", sb.toString());
                        if ("Sony".equals(M.c) && M.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                            return new Point(3840, 2160);
                        }
                        context = (Context)new Point();
                        if (M.a >= 23) {
                            V(display, (Point)context);
                            return (Point)context;
                        }
                        display.getRealSize((Point)context);
                        return (Point)context;
                    }
                    catch (NumberFormatException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static boolean T0(final Parcel parcel) {
        return parcel.readInt() != 0;
    }
    
    public static Looper U() {
        final Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }
    
    public static void U0(final List list, final int n, final int n2) {
        if (n >= 0 && n2 <= list.size() && n <= n2) {
            if (n != n2) {
                list.subList(n, n2).clear();
            }
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void V(final Display display, final Point point) {
        final Display$Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }
    
    public static long V0(final long n, final int n2) {
        return Y0(n, 1000000L, n2, RoundingMode.FLOOR);
    }
    
    public static int W(final int n) {
        if (n != 2 && n != 4) {
            if (n != 10) {
                if (n != 7) {
                    if (n != 8) {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        return 6006;
                                    }
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28: {
                                        return 6002;
                                    }
                                }
                                break;
                            }
                            case 15: {
                                break;
                            }
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22: {
                                return 6004;
                            }
                            case 16:
                            case 18: {
                                return 6005;
                            }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }
    
    public static long W0(final long n, final long n2, final long n3) {
        return Y0(n, n2, n3, RoundingMode.FLOOR);
    }
    
    public static int X(final String s) {
        if (s == null) {
            return 0;
        }
        final String[] b1 = b1(s, "_");
        final int length = b1.length;
        if (length < 2) {
            return 0;
        }
        final String s2 = b1[length - 1];
        boolean b2;
        if (length >= 3 && "neg".equals(b1[length - 2])) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        try {
            int int1 = Integer.parseInt((String)g0.a.e(s2));
            if (b2) {
                int1 = -int1;
            }
            return int1;
        }
        catch (NumberFormatException ex) {
            return 0;
        }
    }
    
    public static void X0(final long[] array, final long n, final long n2) {
        a1(array, n, n2, RoundingMode.FLOOR);
    }
    
    public static String Y(final int n) {
        if (n == 0) {
            return "NO";
        }
        if (n == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (n == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (n == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (n == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }
    
    public static long Y0(final long n, final long n2, final long n3, final RoundingMode roundingMode) {
        if (n == 0L) {
            return 0L;
        }
        if (n2 == 0L) {
            return 0L;
        }
        final long n4 = lcmp(n3, n2);
        if (n4 >= 0 && n3 % n2 == 0L) {
            return Z2.e.b(n, Z2.e.b(n3, n2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (n4 < 0 && n2 % n3 == 0L) {
            return Z2.e.d(n, Z2.e.b(n2, n3, RoundingMode.UNNECESSARY));
        }
        final long n5 = lcmp(n3, n);
        if (n5 >= 0 && n3 % n == 0L) {
            return Z2.e.b(n2, Z2.e.b(n3, n, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (n5 < 0 && n % n3 == 0L) {
            return Z2.e.d(n2, Z2.e.b(n, n3, RoundingMode.UNNECESSARY));
        }
        return Z0(n, n2, n3, roundingMode);
    }
    
    public static String Z(final Locale locale) {
        if (M.a >= 21) {
            return a0(locale);
        }
        return locale.toString();
    }
    
    public static long Z0(long b, long b2, long n, final RoundingMode roundingMode) {
        final long d = Z2.e.d(b, b2);
        if (d != Long.MAX_VALUE && d != Long.MIN_VALUE) {
            return Z2.e.b(d, n, roundingMode);
        }
        final long c = Z2.e.c(Math.abs(b2), Math.abs(n));
        final RoundingMode unnecessary = RoundingMode.UNNECESSARY;
        b2 = Z2.e.b(b2, c, unnecessary);
        n = Z2.e.b(n, c, unnecessary);
        final long c2 = Z2.e.c(Math.abs(b), Math.abs(n));
        b = Z2.e.b(b, c2, unnecessary);
        n = Z2.e.b(n, c2, unnecessary);
        final long d2 = Z2.e.d(b, b2);
        if (d2 != Long.MAX_VALUE && d2 != Long.MIN_VALUE) {
            return Z2.e.b(d2, n, roundingMode);
        }
        final double n2 = b * (b2 / (double)n);
        if (n2 > 9.223372036854776E18) {
            return Long.MAX_VALUE;
        }
        if (n2 < -9.223372036854776E18) {
            return Long.MIN_VALUE;
        }
        return b.c(n2, roundingMode);
    }
    
    public static String a0(final Locale locale) {
        return locale.toLanguageTag();
    }
    
    public static void a1(final long[] a, long n, final long n2, final RoundingMode roundingMode) {
        if (n == 0L) {
            Arrays.fill(a, 0L);
            return;
        }
        final long n3 = lcmp(n2, n);
        final int n4 = 0;
        int i = 0;
        if (n3 >= 0 && n2 % n == 0L) {
            n = Z2.e.b(n2, n, RoundingMode.UNNECESSARY);
            while (i < a.length) {
                a[i] = Z2.e.b(a[i], n, roundingMode);
                ++i;
            }
        }
        else if (n3 < 0 && n % n2 == 0L) {
            n = Z2.e.b(n, n2, RoundingMode.UNNECESSARY);
            for (int j = n4; j < a.length; ++j) {
                a[j] = Z2.e.d(a[j], n);
            }
        }
        else {
            for (int k = 0; k < a.length; ++k) {
                final long n5 = a[k];
                if (n5 != 0L) {
                    if (n2 >= n5 && n2 % n5 == 0L) {
                        a[k] = Z2.e.b(n, Z2.e.b(n2, n5, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    else if (n2 < n5 && n5 % n2 == 0L) {
                        a[k] = Z2.e.d(n, Z2.e.b(n5, n2, RoundingMode.UNNECESSARY));
                    }
                    else {
                        a[k] = Z0(n5, n, n2, roundingMode);
                    }
                }
            }
        }
    }
    
    public static long b(final long n, final long n2, final long n3) {
        final long n4 = n + n2;
        if (((n ^ n4) & (n2 ^ n4)) < 0L) {
            return n3;
        }
        return n4;
    }
    
    public static int b0(final Context context) {
        if (B0(context)) {
            return 1;
        }
        return 5;
    }
    
    public static String[] b1(final String s, final String regex) {
        return s.split(regex, -1);
    }
    
    public static boolean c(final Object o, final Object obj) {
        if (o == null) {
            return obj == null;
        }
        return o.equals(obj);
    }
    
    public static long c0(final long n, final float n2) {
        if (n2 == 1.0f) {
            return n;
        }
        return Math.round(n * (double)n2);
    }
    
    public static String[] c1(final String s, final String regex) {
        return s.split(regex, 2);
    }
    
    public static int d(final long[] a, final long key, final boolean b, final boolean b2) {
        int binarySearch;
        final int n = binarySearch = Arrays.binarySearch(a, key);
        if (n < 0) {
            binarySearch = n;
        }
        else {
            int n2;
            while (true) {
                n2 = binarySearch + 1;
                if (n2 >= a.length || a[n2] != key) {
                    break;
                }
                binarySearch = n2;
            }
            if (!b) {
                binarySearch = n2;
            }
        }
        int min = binarySearch;
        if (b2) {
            min = Math.min(a.length - 1, binarySearch);
        }
        return min;
    }
    
    public static long d0(final long n) {
        if (n == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return n + SystemClock.elapsedRealtime();
    }
    
    public static String[] d1(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return new String[0];
        }
        return b1(s.trim(), "(\\s*,\\s*)");
    }
    
    public static int e(final p p4, final long n, final boolean b, final boolean b2) {
        int n2 = p4.c() - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            if (p4.b(n3) < n) {
                i = n3 + 1;
            }
            else {
                n2 = n3 - 1;
            }
        }
        if (b) {
            final int n4 = n2 + 1;
            if (n4 < p4.c() && p4.b(n4) == n) {
                return n4;
            }
        }
        if (b2 && n2 == -1) {
            return 0;
        }
        return n2;
    }
    
    public static int e0(final int n) {
        if (n == 8) {
            return 3;
        }
        if (n == 16) {
            return 2;
        }
        if (n == 24) {
            return 21;
        }
        if (n != 32) {
            return 0;
        }
        return 22;
    }
    
    public static long e1(final long n, final long n2, final long n3) {
        final long n4 = n - n2;
        if (((n ^ n4) & (n2 ^ n)) < 0L) {
            return n3;
        }
        return n4;
    }
    
    public static int f(final List list, final Comparable key, final boolean b, final boolean b2) {
        int binarySearch;
        final int n = binarySearch = Collections.binarySearch(list, key);
        if (n < 0) {
            binarySearch = -(n + 2);
        }
        else {
            int n2;
            while (true) {
                n2 = binarySearch - 1;
                if (n2 < 0 || ((Comparable)list.get(n2)).compareTo(key) != 0) {
                    break;
                }
                binarySearch = n2;
            }
            if (!b) {
                binarySearch = n2;
            }
        }
        int max = binarySearch;
        if (b2) {
            max = Math.max(0, binarySearch);
        }
        return max;
    }
    
    public static q f0(final int n, final int n2, final int n3) {
        return new q.b().o0("audio/raw").N(n2).p0(n3).i0(n).K();
    }
    
    public static String f1(final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length * 2);
        for (int i = 0; i < array.length; ++i) {
            sb.append(Character.forDigit(array[i] >> 4 & 0xF, 16));
            sb.append(Character.forDigit(array[i] & 0xF, 16));
        }
        return sb.toString();
    }
    
    public static int g(final int[] a, int n, final boolean b, final boolean b2) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(a, n);
        if (n2 < 0) {
            n = -(n2 + 2);
        }
        else {
            int n3;
            while (true) {
                n3 = binarySearch - 1;
                if (n3 < 0 || a[n3] != n) {
                    break;
                }
                binarySearch = n3;
            }
            if (b) {
                n = binarySearch;
            }
            else {
                n = n3;
            }
        }
        int max = n;
        if (b2) {
            max = Math.max(0, n);
        }
        return max;
    }
    
    public static int g0(final int n, final int n2) {
        if (n != 2) {
            int n3 = n2;
            if (n != 3) {
                Label_0065: {
                    if (n != 4) {
                        if (n != 21) {
                            if (n == 22) {
                                break Label_0065;
                            }
                            if (n == 268435456) {
                                return n2 * 2;
                            }
                            if (n != 1342177280) {
                                if (n == 1610612736) {
                                    break Label_0065;
                                }
                                throw new IllegalArgumentException();
                            }
                        }
                        return n2 * 3;
                    }
                }
                n3 = n2 * 4;
            }
            return n3;
        }
        return n2 * 2;
    }
    
    public static long g1(final int n, final int n2) {
        return h1(n2) | h1(n) << 32;
    }
    
    public static int h(final long[] a, final long key, final boolean b, final boolean b2) {
        int binarySearch;
        final int n = binarySearch = Arrays.binarySearch(a, key);
        if (n < 0) {
            binarySearch = -(n + 2);
        }
        else {
            int n2;
            while (true) {
                n2 = binarySearch - 1;
                if (n2 < 0 || a[n2] != key) {
                    break;
                }
                binarySearch = n2;
            }
            if (!b) {
                binarySearch = n2;
            }
        }
        int max = binarySearch;
        if (b2) {
            max = Math.max(0, binarySearch);
        }
        return max;
    }
    
    public static long h0(final long n, final float n2) {
        if (n2 == 1.0f) {
            return n;
        }
        return Math.round(n / (double)n2);
    }
    
    public static long h1(final int n) {
        return (long)n & 0xFFFFFFFFL;
    }
    
    public static Object i(final Object o) {
        return o;
    }
    
    public static List i0(final int n) {
        final ArrayList<String> list = new ArrayList<String>();
        if ((n & 0x1) != 0x0) {
            list.add("main");
        }
        if ((n & 0x2) != 0x0) {
            list.add("alt");
        }
        if ((n & 0x4) != 0x0) {
            list.add("supplementary");
        }
        if ((n & 0x8) != 0x0) {
            list.add("commentary");
        }
        if ((n & 0x10) != 0x0) {
            list.add("dub");
        }
        if ((n & 0x20) != 0x0) {
            list.add("emergency");
        }
        if ((n & 0x40) != 0x0) {
            list.add("caption");
        }
        if ((n & 0x80) != 0x0) {
            list.add("subtitle");
        }
        if ((n & 0x100) != 0x0) {
            list.add("sign");
        }
        if ((n & 0x200) != 0x0) {
            list.add("describes-video");
        }
        if ((n & 0x400) != 0x0) {
            list.add("describes-music");
        }
        if ((n & 0x800) != 0x0) {
            list.add("enhanced-intelligibility");
        }
        if ((n & 0x1000) != 0x0) {
            list.add("transcribes-dialog");
        }
        if ((n & 0x2000) != 0x0) {
            list.add("easy-read");
        }
        if ((n & 0x4000) != 0x0) {
            list.add("trick-play");
        }
        return list;
    }
    
    public static long i1(final long n) {
        long n2 = n;
        if (n != -9223372036854775807L) {
            if (n == Long.MIN_VALUE) {
                return n;
            }
            n2 = n / 1000L;
        }
        return n2;
    }
    
    public static Object[] j(final Object[] array) {
        return array;
    }
    
    public static List j0(final int n) {
        final ArrayList<String> list = new ArrayList<String>();
        if ((n & 0x4) != 0x0) {
            list.add("auto");
        }
        if ((n & 0x1) != 0x0) {
            list.add("default");
        }
        if ((n & 0x2) != 0x0) {
            list.add("forced");
        }
        return list;
    }
    
    public static void j1(final Parcel parcel, final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static int k(final int n, final int n2) {
        return (n + n2 - 1) / n2;
    }
    
    public static int k0(final int n) {
        if (n == 13) {
            return 1;
        }
        switch (n) {
            default: {
                return 3;
            }
            case 6: {
                return 2;
            }
            case 5:
            case 7:
            case 8:
            case 9:
            case 10: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 0;
            }
        }
    }
    
    public static long l(final long n, final long n2) {
        return (n + n2 - 1L) / n2;
    }
    
    public static String[] l0() {
        final String[] m0 = m0();
        for (int i = 0; i < m0.length; ++i) {
            m0[i] = L0(m0[i]);
        }
        return m0;
    }
    
    public static void m(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {}
    }
    
    public static String[] m0() {
        final Configuration configuration = Resources.getSystem().getConfiguration();
        if (M.a >= 24) {
            return n0(configuration);
        }
        return new String[] { Z(configuration.locale) };
    }
    
    public static int n(final long n, final long n2) {
        final long n3 = lcmp(n, n2);
        if (n3 < 0) {
            return -1;
        }
        if (n3 == 0) {
            return 0;
        }
        return 1;
    }
    
    public static String[] n0(final Configuration configuration) {
        return b1(K.a(J.a(configuration)), ",");
    }
    
    public static float o(final float a, final float a2, final float b) {
        return Math.max(a2, Math.min(a, b));
    }
    
    public static String o0(final String str) {
        try {
            final Class<?> forName = Class.forName("android.os.SystemProperties");
            return (String)forName.getMethod("get", String.class).invoke(forName, str);
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to read system property ");
            sb.append(str);
            g0.o.d("Util", sb.toString(), ex);
            return null;
        }
    }
    
    public static int p(final int a, final int a2, final int b) {
        return Math.max(a2, Math.min(a, b));
    }
    
    public static String p0(final int i) {
        switch (i) {
            default: {
                if (i >= 10000) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("custom (");
                    sb.append(i);
                    sb.append(")");
                    return sb.toString();
                }
                return "?";
            }
            case 6: {
                return "camera motion";
            }
            case 5: {
                return "metadata";
            }
            case 4: {
                return "image";
            }
            case 3: {
                return "text";
            }
            case 2: {
                return "video";
            }
            case 1: {
                return "audio";
            }
            case 0: {
                return "default";
            }
            case -1: {
                return "unknown";
            }
            case -2: {
                return "none";
            }
        }
    }
    
    public static long q(final long a, final long a2, final long b) {
        return Math.max(a2, Math.min(a, b));
    }
    
    public static String q0(final Context context, final String str) {
    Label_0021_Outer:
        while (true) {
            while (true) {
                try {
                    String versionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    while (true) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("/");
                        sb.append(versionName);
                        sb.append(" (Linux;Android ");
                        sb.append(Build$VERSION.RELEASE);
                        sb.append(") ");
                        sb.append("AndroidXMedia3/1.4.1");
                        return sb.toString();
                        versionName = "?";
                        continue Label_0021_Outer;
                    }
                }
                catch (PackageManager$NameNotFoundException ex) {}
                continue;
            }
        }
    }
    
    public static boolean r(final SparseArray sparseArray, final int n) {
        return sparseArray.indexOfKey(n) >= 0;
    }
    
    public static byte[] r0(final String s) {
        return s.getBytes(W2.e.c);
    }
    
    public static boolean s(final Object[] array, final Object o) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (c(array[i], o)) {
                return true;
            }
        }
        return false;
    }
    
    public static int s0(final Uri uri) {
        final String scheme = uri.getScheme();
        if (scheme != null && W2.c.a("rtsp", scheme)) {
            return 3;
        }
        final String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        final int lastIndex = lastPathSegment.lastIndexOf(46);
        if (lastIndex >= 0) {
            final int t0 = t0(lastPathSegment.substring(lastIndex + 1));
            if (t0 != 4) {
                return t0;
            }
        }
        final Matcher matcher = M.k.matcher((CharSequence)g0.a.e(uri.getPath()));
        if (matcher.matches()) {
            final String group = matcher.group(2);
            if (group != null) {
                if (group.contains("format=mpd-time-csf")) {
                    return 0;
                }
                if (group.contains("format=m3u8-aapl")) {
                    return 2;
                }
            }
            return 1;
        }
        return 4;
    }
    
    public static boolean t(final SparseArray sparseArray, final SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (M.a >= 31) {
            return I.a(sparseArray, sparseArray2);
        }
        final int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < size; ++i) {
            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                return false;
            }
        }
        return true;
    }
    
    public static int t0(String e) {
        e = W2.c.e(e);
        e.hashCode();
        final int hashCode = e.hashCode();
        int n = -1;
        switch (hashCode) {
            case 3299913: {
                if (!e.equals("m3u8")) {
                    break;
                }
                n = 3;
                break;
            }
            case 3242057: {
                if (!e.equals("isml")) {
                    break;
                }
                n = 2;
                break;
            }
            case 108321: {
                if (!e.equals("mpd")) {
                    break;
                }
                n = 1;
                break;
            }
            case 104579: {
                if (!e.equals("ism")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return 4;
            }
            case 3: {
                return 2;
            }
            case 1: {
                return 0;
            }
            case 0:
            case 2: {
                return 1;
            }
        }
    }
    
    public static int u(final SparseArray sparseArray) {
        if (M.a >= 31) {
            return H.a(sparseArray);
        }
        int n = 17;
        for (int i = 0; i < sparseArray.size(); ++i) {
            n = (n * 31 + sparseArray.keyAt(i)) * 31 + Objects.hashCode(sparseArray.valueAt(i));
        }
        return n;
    }
    
    public static int u0(final Uri uri, final String s) {
        if (s == null) {
            return s0(uri);
        }
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1154777587: {
                if (!s.equals("application/x-rtsp")) {
                    break;
                }
                n = 3;
                break;
            }
            case 64194685: {
                if (!s.equals("application/dash+xml")) {
                    break;
                }
                n = 2;
                break;
            }
            case -156749520: {
                if (!s.equals("application/vnd.ms-sstr+xml")) {
                    break;
                }
                n = 1;
                break;
            }
            case -979127466: {
                if (!s.equals("application/x-mpegURL")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return 4;
            }
            case 3: {
                return 3;
            }
            case 2: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 0: {
                return 2;
            }
        }
    }
    
    public static int v(final byte[] array, int i, final int n, int w) {
        while (i < n) {
            final int b = i.b(array[i]);
            w = w(b & 0xF, w(b >> 4, w));
            ++i;
        }
        return w;
    }
    
    public static boolean v0(final g0.z z, final g0.z z2, final Inflater inflater) {
        if (z.a() <= 0) {
            return false;
        }
        if (z2.b() < z.a()) {
            z2.c(z.a() * 2);
        }
        Inflater inflater2;
        if ((inflater2 = inflater) == null) {
            inflater2 = new Inflater();
        }
        inflater2.setInput(z.e(), z.f(), z.a());
        final int off = 0;
        try {
            final int n = off + inflater2.inflate(z2.e(), off, z2.b() - off);
            if (inflater2.finished()) {
                z2.S(n);
                inflater2.reset();
                return true;
            }
            goto Label_0110;
        }
        catch (DataFormatException ex) {
            goto Label_0171;
        }
        finally {
            goto Label_0164;
        }
    }
    
    public static int w(final int n, final int n2) {
        return (M.p[(n ^ (n2 >> 12 & 0xFF)) & 0xFF] ^ (n2 << 4 & 0xFFFF)) & 0xFFFF;
    }
    
    public static String w0(final int i) {
        return Integer.toString(i, 36);
    }
    
    public static int x(final byte[] array, int i, final int n, int n2) {
        while (i < n) {
            n2 = (M.o[(n2 >>> 24 ^ (array[i] & 0xFF)) & 0xFF] ^ n2 << 8);
            ++i;
        }
        return n2;
    }
    
    public static boolean x0(final Context context) {
        return M.a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }
    
    public static int y(final byte[] array, int i, final int n, int n2) {
        while (i < n) {
            n2 = M.q[n2 ^ (array[i] & 0xFF)];
            ++i;
        }
        return n2;
    }
    
    public static boolean y0(final String s) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case -879258763: {
                if (!s.equals("image/png")) {
                    break;
                }
                n = 6;
                break;
            }
            case -879272239: {
                if (!s.equals("image/bmp")) {
                    break;
                }
                n = 5;
                break;
            }
            case -1487018032: {
                if (!s.equals("image/webp")) {
                    break;
                }
                n = 4;
                break;
            }
            case -1487394660: {
                if (!s.equals("image/jpeg")) {
                    break;
                }
                n = 3;
                break;
            }
            case -1487464690: {
                if (!s.equals("image/heif")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1487464693: {
                if (!s.equals("image/heic")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1487656890: {
                if (!s.equals("image/avif")) {
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
            case 3:
            case 4:
            case 5:
            case 6: {
                return true;
            }
            case 1:
            case 2: {
                return M.a >= 26;
            }
            case 0: {
                return M.a >= 34;
            }
        }
    }
    
    public static Handler z(final Looper looper, final Handler$Callback handler$Callback) {
        return new Handler(looper, handler$Callback);
    }
    
    public static boolean z0(final int n) {
        return n == 21 || n == 1342177280 || n == 22 || n == 1610612736 || n == 4;
    }
}
