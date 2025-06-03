package g0;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.AbstractC1203z;
import d0.C1162A;
import d0.C1194q;
import d0.InterfaceC1165D;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14261a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f14262b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f14263c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f14264d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f14265e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f14266f;

    /* renamed from: g, reason: collision with root package name */
    public static final long[] f14267g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f14268h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f14269i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f14270j;

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f14271k;

    /* renamed from: l, reason: collision with root package name */
    public static HashMap f14272l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f14273m;

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f14274n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f14275o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f14276p;

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f14277q;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f14261a = i7;
        String str = Build.DEVICE;
        f14262b = str;
        String str2 = Build.MANUFACTURER;
        f14263c = str2;
        String str3 = Build.MODEL;
        f14264d = str3;
        f14265e = str + ", " + str3 + ", " + str2 + ", " + i7;
        f14266f = new byte[0];
        f14267g = new long[0];
        f14268h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f14269i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f14270j = Pattern.compile("%([A-Fa-f0-9]{2})");
        f14271k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f14273m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f14274n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f14275o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f14276p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f14277q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Handler A() {
        return B(null);
    }

    public static boolean A0(int i7) {
        return i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4;
    }

    public static Handler B(Handler.Callback callback) {
        return z((Looper) AbstractC1297a.h(Looper.myLooper()), callback);
    }

    public static boolean B0(Context context) {
        int i7 = f14261a;
        if (i7 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i7 == 30) {
                String str = f14264d;
                if (W2.c.a(str, "moto g(20)") || W2.c.a(str, "rmx3231")) {
                }
            }
            return false;
        }
        return true;
    }

    public static Handler C() {
        return D(null);
    }

    public static boolean C0(int i7) {
        return i7 == 10 || i7 == 13;
    }

    public static Handler D(Handler.Callback callback) {
        return z(U(), callback);
    }

    public static boolean D0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static HashMap E() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap hashMap = new HashMap(iSOLanguages.length + f14273m.length);
        int i7 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f14273m;
            if (i7 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i7], strArr[i7 + 1]);
            i7 += 2;
        }
    }

    public static boolean E0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long F(long j7, int i7) {
        return Y0(j7, i7, 1000000L, RoundingMode.CEILING);
    }

    public static boolean F0(Context context) {
        return f14261a >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static String G(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static /* synthetic */ Thread G0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static String H(byte[] bArr) {
        return new String(bArr, W2.e.f6821c);
    }

    public static int H0(int[] iArr, int i7) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            if (iArr[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    public static String I(byte[] bArr, int i7, int i8) {
        return new String(bArr, i7, i8, W2.e.f6821c);
    }

    public static String I0(String str) {
        int i7 = 0;
        while (true) {
            String[] strArr = f14274n;
            if (i7 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i7])) {
                return strArr[i7 + 1] + str.substring(strArr[i7].length());
            }
            i7 += 2;
        }
    }

    public static int J(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static long J0(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }

    public static int K(int i7) {
        if (i7 == 20) {
            return 30;
        }
        if (i7 == 22) {
            return 31;
        }
        if (i7 == 30) {
            return 34;
        }
        switch (i7) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return 28;
            default:
                switch (i7) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    public static ExecutorService K0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: g0.L
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread G02;
                G02 = M.G0(str, runnable);
                return G02;
            }
        });
    }

    public static AudioFormat L(int i7, int i8, int i9) {
        return new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i8).setEncoding(i9).build();
    }

    public static String L0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e7 = W2.c.e(str);
        String str2 = c1(e7, "-")[0];
        if (f14272l == null) {
            f14272l = E();
        }
        String str3 = (String) f14272l.get(str2);
        if (str3 != null) {
            e7 = str3 + e7.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? I0(e7) : e7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int M(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = g0.M.f14261a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.M.M(int):int");
    }

    public static Object[] M0(Object[] objArr, Object obj) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        copyOf[objArr.length] = obj;
        return j(copyOf);
    }

    public static InterfaceC1165D.b N(InterfaceC1165D interfaceC1165D, InterfaceC1165D.b bVar) {
        boolean o7 = interfaceC1165D.o();
        boolean w7 = interfaceC1165D.w();
        boolean G6 = interfaceC1165D.G();
        boolean B7 = interfaceC1165D.B();
        boolean Q6 = interfaceC1165D.Q();
        boolean I6 = interfaceC1165D.I();
        boolean q7 = interfaceC1165D.L().q();
        boolean z7 = false;
        InterfaceC1165D.b.a d7 = new InterfaceC1165D.b.a().b(bVar).d(4, !o7).d(5, w7 && !o7).d(6, G6 && !o7).d(7, !q7 && (G6 || !Q6 || w7) && !o7).d(8, B7 && !o7).d(9, !q7 && (B7 || (Q6 && I6)) && !o7).d(10, !o7).d(11, w7 && !o7);
        if (w7 && !o7) {
            z7 = true;
        }
        return d7.d(12, z7).e();
    }

    public static Object[] N0(Object[] objArr, Object[] objArr2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, copyOf, objArr.length, objArr2.length);
        return copyOf;
    }

    public static int O(ByteBuffer byteBuffer, int i7) {
        int i8 = byteBuffer.getInt(i7);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i8 : Integer.reverseBytes(i8);
    }

    public static Object[] O0(Object[] objArr, int i7) {
        AbstractC1297a.a(i7 <= objArr.length);
        return Arrays.copyOf(objArr, i7);
    }

    public static int P(String str, int i7) {
        int i8 = 0;
        for (String str2 : d1(str)) {
            if (i7 == AbstractC1203z.m(str2)) {
                i8++;
            }
        }
        return i8;
    }

    public static Object[] P0(Object[] objArr, int i7, int i8) {
        AbstractC1297a.a(i7 >= 0);
        AbstractC1297a.a(i8 <= objArr.length);
        return Arrays.copyOfRange(objArr, i7, i8);
    }

    public static String Q(String str, int i7) {
        String[] d12 = d1(str);
        if (d12.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : d12) {
            if (i7 == AbstractC1203z.m(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static long Q0(String str) {
        Matcher matcher = f14268h.matcher(str);
        if (!matcher.matches()) {
            throw C1162A.a("Invalid date/time format: " + str, null);
        }
        int i7 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i7 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i7 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i7 != 0 ? timeInMillis - (i7 * 60000) : timeInMillis;
    }

    public static String R(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return W2.c.f(networkCountryIso);
            }
        }
        return W2.c.f(Locale.getDefault().getCountry());
    }

    public static long R0(String str) {
        Matcher matcher = f14269i.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static Point S(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) AbstractC1297a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return T(context, display);
    }

    public static boolean S0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Point T(Context context, Display display) {
        if (display.getDisplayId() == 0 && E0(context)) {
            String o02 = o0(f14261a < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(o02)) {
                try {
                    String[] b12 = b1(o02.trim(), "x");
                    if (b12.length == 2) {
                        int parseInt = Integer.parseInt(b12[0]);
                        int parseInt2 = Integer.parseInt(b12[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                o.c("Util", "Invalid display size: " + o02);
            }
            if ("Sony".equals(f14263c) && f14264d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f14261a >= 23) {
            V(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static boolean T0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static Looper U() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static void U0(List list, int i7, int i8) {
        if (i7 < 0 || i8 > list.size() || i7 > i8) {
            throw new IllegalArgumentException();
        }
        if (i7 != i8) {
            list.subList(i7, i8).clear();
        }
    }

    public static void V(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long V0(long j7, int i7) {
        return Y0(j7, 1000000L, i7, RoundingMode.FLOOR);
    }

    public static int W(int i7) {
        if (i7 == 2 || i7 == 4) {
            return 6005;
        }
        if (i7 == 10) {
            return 6004;
        }
        if (i7 == 7) {
            return 6005;
        }
        if (i7 == 8) {
            return 6003;
        }
        switch (i7) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i7) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static long W0(long j7, long j8, long j9) {
        return Y0(j7, j8, j9, RoundingMode.FLOOR);
    }

    public static int X(String str) {
        String[] b12;
        int length;
        if (str == null || (length = (b12 = b1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = b12[length - 1];
        boolean z7 = length >= 3 && "neg".equals(b12[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) AbstractC1297a.e(str2));
            return z7 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static void X0(long[] jArr, long j7, long j8) {
        a1(jArr, j7, j8, RoundingMode.FLOOR);
    }

    public static String Y(int i7) {
        if (i7 == 0) {
            return "NO";
        }
        if (i7 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i7 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i7 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i7 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long Y0(long j7, long j8, long j9, RoundingMode roundingMode) {
        if (j7 == 0 || j8 == 0) {
            return 0L;
        }
        return (j9 < j8 || j9 % j8 != 0) ? (j9 >= j8 || j8 % j9 != 0) ? (j9 < j7 || j9 % j7 != 0) ? (j9 >= j7 || j7 % j9 != 0) ? Z0(j7, j8, j9, roundingMode) : Z2.e.d(j8, Z2.e.b(j7, j9, RoundingMode.UNNECESSARY)) : Z2.e.b(j8, Z2.e.b(j9, j7, RoundingMode.UNNECESSARY), roundingMode) : Z2.e.d(j7, Z2.e.b(j8, j9, RoundingMode.UNNECESSARY)) : Z2.e.b(j7, Z2.e.b(j9, j8, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static String Z(Locale locale) {
        return f14261a >= 21 ? a0(locale) : locale.toString();
    }

    public static long Z0(long j7, long j8, long j9, RoundingMode roundingMode) {
        long d7 = Z2.e.d(j7, j8);
        if (d7 != Long.MAX_VALUE && d7 != Long.MIN_VALUE) {
            return Z2.e.b(d7, j9, roundingMode);
        }
        long c7 = Z2.e.c(Math.abs(j8), Math.abs(j9));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b7 = Z2.e.b(j8, c7, roundingMode2);
        long b8 = Z2.e.b(j9, c7, roundingMode2);
        long c8 = Z2.e.c(Math.abs(j7), Math.abs(b8));
        long b9 = Z2.e.b(j7, c8, roundingMode2);
        long b10 = Z2.e.b(b8, c8, roundingMode2);
        long d8 = Z2.e.d(b9, b7);
        if (d8 != Long.MAX_VALUE && d8 != Long.MIN_VALUE) {
            return Z2.e.b(d8, b10, roundingMode);
        }
        double d9 = b9 * (b7 / b10);
        if (d9 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d9 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return Z2.b.c(d9, roundingMode);
    }

    public static String a0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static void a1(long[] jArr, long j7, long j8, RoundingMode roundingMode) {
        if (j7 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i7 = 0;
        if (j8 >= j7 && j8 % j7 == 0) {
            long b7 = Z2.e.b(j8, j7, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = Z2.e.b(jArr[i7], b7, roundingMode);
                i7++;
            }
            return;
        }
        if (j8 < j7 && j7 % j8 == 0) {
            long b8 = Z2.e.b(j7, j8, RoundingMode.UNNECESSARY);
            while (i7 < jArr.length) {
                jArr[i7] = Z2.e.d(jArr[i7], b8);
                i7++;
            }
            return;
        }
        for (int i8 = 0; i8 < jArr.length; i8++) {
            long j9 = jArr[i8];
            if (j9 != 0) {
                if (j8 >= j9 && j8 % j9 == 0) {
                    jArr[i8] = Z2.e.b(j7, Z2.e.b(j8, j9, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j8 >= j9 || j9 % j8 != 0) {
                    jArr[i8] = Z0(j9, j7, j8, roundingMode);
                } else {
                    jArr[i8] = Z2.e.d(j7, Z2.e.b(j9, j8, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static long b(long j7, long j8, long j9) {
        long j10 = j7 + j8;
        return ((j7 ^ j10) & (j8 ^ j10)) < 0 ? j9 : j10;
    }

    public static int b0(Context context) {
        return B0(context) ? 1 : 5;
    }

    public static String[] b1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static long c0(long j7, float f7) {
        return f7 == 1.0f ? j7 : Math.round(j7 * f7);
    }

    public static String[] c1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static int d(long[] jArr, long j7, boolean z7, boolean z8) {
        int i7;
        int i8;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i8 = ~binarySearch;
        } else {
            while (true) {
                i7 = binarySearch + 1;
                if (i7 >= jArr.length || jArr[i7] != j7) {
                    break;
                }
                binarySearch = i7;
            }
            i8 = z7 ? binarySearch : i7;
        }
        return z8 ? Math.min(jArr.length - 1, i8) : i8;
    }

    public static long d0(long j7) {
        return j7 == -9223372036854775807L ? System.currentTimeMillis() : j7 + SystemClock.elapsedRealtime();
    }

    public static String[] d1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : b1(str.trim(), "(\\s*,\\s*)");
    }

    public static int e(p pVar, long j7, boolean z7, boolean z8) {
        int i7;
        int c7 = pVar.c() - 1;
        int i8 = 0;
        while (i8 <= c7) {
            int i9 = (i8 + c7) >>> 1;
            if (pVar.b(i9) < j7) {
                i8 = i9 + 1;
            } else {
                c7 = i9 - 1;
            }
        }
        if (z7 && (i7 = c7 + 1) < pVar.c() && pVar.b(i7) == j7) {
            return i7;
        }
        if (z8 && c7 == -1) {
            return 0;
        }
        return c7;
    }

    public static int e0(int i7) {
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 2;
        }
        if (i7 != 24) {
            return i7 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static long e1(long j7, long j8, long j9) {
        long j10 = j7 - j8;
        return ((j7 ^ j10) & (j8 ^ j7)) < 0 ? j9 : j10;
    }

    public static int f(List list, Comparable comparable, boolean z7, boolean z8) {
        int i7;
        int i8;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i8 = -(binarySearch + 2);
        } else {
            while (true) {
                i7 = binarySearch - 1;
                if (i7 < 0 || ((Comparable) list.get(i7)).compareTo(comparable) != 0) {
                    break;
                }
                binarySearch = i7;
            }
            i8 = z7 ? binarySearch : i7;
        }
        return z8 ? Math.max(0, i8) : i8;
    }

    public static C1194q f0(int i7, int i8, int i9) {
        return new C1194q.b().o0("audio/raw").N(i8).p0(i9).i0(i7).K();
    }

    public static String f1(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i7 = 0; i7 < bArr.length; i7++) {
            sb.append(Character.forDigit((bArr[i7] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i7] & 15, 16));
        }
        return sb.toString();
    }

    public static int g(int[] iArr, int i7, boolean z7, boolean z8) {
        int i8;
        int i9;
        int binarySearch = Arrays.binarySearch(iArr, i7);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i8 = binarySearch - 1;
                if (i8 < 0 || iArr[i8] != i7) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z7 ? binarySearch : i8;
        }
        return z8 ? Math.max(0, i9) : i9;
    }

    public static int g0(int i7, int i8) {
        if (i7 != 2) {
            if (i7 == 3) {
                return i8;
            }
            if (i7 != 4) {
                if (i7 != 21) {
                    if (i7 != 22) {
                        if (i7 != 268435456) {
                            if (i7 != 1342177280) {
                                if (i7 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return i8 * 3;
            }
            return i8 * 4;
        }
        return i8 * 2;
    }

    public static long g1(int i7, int i8) {
        return h1(i8) | (h1(i7) << 32);
    }

    public static int h(long[] jArr, long j7, boolean z7, boolean z8) {
        int i7;
        int i8;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i8 = -(binarySearch + 2);
        } else {
            while (true) {
                i7 = binarySearch - 1;
                if (i7 < 0 || jArr[i7] != j7) {
                    break;
                }
                binarySearch = i7;
            }
            i8 = z7 ? binarySearch : i7;
        }
        return z8 ? Math.max(0, i8) : i8;
    }

    public static long h0(long j7, float f7) {
        return f7 == 1.0f ? j7 : Math.round(j7 / f7);
    }

    public static long h1(int i7) {
        return i7 & 4294967295L;
    }

    public static List i0(int i7) {
        ArrayList arrayList = new ArrayList();
        if ((i7 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i7 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i7 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i7 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i7 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i7 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i7 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i7 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i7 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i7 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i7 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i7 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i7 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i7 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        return arrayList;
    }

    public static long i1(long j7) {
        return (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }

    public static List j0(int i7) {
        ArrayList arrayList = new ArrayList();
        if ((i7 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i7 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static void j1(Parcel parcel, boolean z7) {
        parcel.writeInt(z7 ? 1 : 0);
    }

    public static int k(int i7, int i8) {
        return ((i7 + i8) - 1) / i8;
    }

    public static int k0(int i7) {
        if (i7 == 13) {
            return 1;
        }
        switch (i7) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static long l(long j7, long j8) {
        return ((j7 + j8) - 1) / j8;
    }

    public static String[] l0() {
        String[] m02 = m0();
        for (int i7 = 0; i7 < m02.length; i7++) {
            m02[i7] = L0(m02[i7]);
        }
        return m02;
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String[] m0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f14261a >= 24 ? n0(configuration) : new String[]{Z(configuration.locale)};
    }

    public static int n(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 == j8 ? 0 : 1;
    }

    public static String[] n0(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return b1(languageTags, ",");
    }

    public static float o(float f7, float f8, float f9) {
        return Math.max(f8, Math.min(f7, f9));
    }

    public static String o0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e7) {
            o.d("Util", "Failed to read system property " + str, e7);
            return null;
        }
    }

    public static int p(int i7, int i8, int i9) {
        return Math.max(i8, Math.min(i7, i9));
    }

    public static String p0(int i7) {
        switch (i7) {
            case -2:
                return "none";
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "unknown";
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i7 < 10000) {
                    return "?";
                }
                return "custom (" + i7 + ")";
        }
    }

    public static long q(long j7, long j8, long j9) {
        return Math.max(j8, Math.min(j7, j9));
    }

    public static String q0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") AndroidXMedia3/1.4.1";
    }

    public static boolean r(SparseArray sparseArray, int i7) {
        return sparseArray.indexOfKey(i7) >= 0;
    }

    public static byte[] r0(String str) {
        return str.getBytes(W2.e.f6821c);
    }

    public static boolean s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int s0(Uri uri) {
        int t02;
        String scheme = uri.getScheme();
        if (scheme != null && W2.c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (t02 = t0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return t02;
        }
        Matcher matcher = f14271k.matcher((CharSequence) AbstractC1297a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
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

    public static boolean t(SparseArray sparseArray, SparseArray sparseArray2) {
        boolean contentEquals;
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f14261a >= 31) {
            contentEquals = sparseArray.contentEquals(sparseArray2);
            return contentEquals;
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!Objects.equals(sparseArray.valueAt(i7), sparseArray2.get(sparseArray.keyAt(i7)))) {
                return false;
            }
        }
        return true;
    }

    public static int t0(String str) {
        String e7 = W2.c.e(str);
        e7.hashCode();
        switch (e7) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static int u(SparseArray sparseArray) {
        int contentHashCode;
        if (f14261a >= 31) {
            contentHashCode = sparseArray.contentHashCode();
            return contentHashCode;
        }
        int i7 = 17;
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            i7 = (((i7 * 31) + sparseArray.keyAt(i8)) * 31) + Objects.hashCode(sparseArray.valueAt(i8));
        }
        return i7;
    }

    public static int u0(Uri uri, String str) {
        if (str == null) {
            return s0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static int v(byte[] bArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            int b7 = a3.i.b(bArr[i7]);
            i9 = w(b7 & 15, w(b7 >> 4, i9));
            i7++;
        }
        return i9;
    }

    public static boolean v0(z zVar, z zVar2, Inflater inflater) {
        if (zVar.a() <= 0) {
            return false;
        }
        if (zVar2.b() < zVar.a()) {
            zVar2.c(zVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(zVar.e(), zVar.f(), zVar.a());
        int i7 = 0;
        while (true) {
            try {
                i7 += inflater.inflate(zVar2.e(), i7, zVar2.b() - i7);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i7 == zVar2.b()) {
                        zVar2.c(zVar2.b() * 2);
                    }
                } else {
                    zVar2.S(i7);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static int w(int i7, int i8) {
        return (f14276p[(i7 ^ ((i8 >> 12) & 255)) & 255] ^ ((i8 << 4) & 65535)) & 65535;
    }

    public static String w0(int i7) {
        return Integer.toString(i7, 36);
    }

    public static int x(byte[] bArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            i9 = f14275o[((i9 >>> 24) ^ (bArr[i7] & 255)) & 255] ^ (i9 << 8);
            i7++;
        }
        return i9;
    }

    public static boolean x0(Context context) {
        return f14261a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int y(byte[] bArr, int i7, int i8, int i9) {
        while (i7 < i8) {
            i9 = f14277q[i9 ^ (bArr[i7] & 255)];
            i7++;
        }
        return i9;
    }

    public static boolean y0(String str) {
        str.hashCode();
        switch (str) {
            case "image/avif":
                return f14261a >= 34;
            case "image/heic":
            case "image/heif":
                return f14261a >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    public static Handler z(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean z0(int i7) {
        return i7 == 21 || i7 == 1342177280 || i7 == 22 || i7 == 1610612736 || i7 == 4;
    }

    public static Object i(Object obj) {
        return obj;
    }

    public static Object[] j(Object[] objArr) {
        return objArr;
    }
}
