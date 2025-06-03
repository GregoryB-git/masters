/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Point
 *  android.hardware.display.DisplayManager
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.media.AudioManager
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Parcel
 *  android.os.SystemClock
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  android.view.Display
 *  android.view.Display$Mode
 *  android.view.WindowManager
 *  java.io.Closeable
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Comparable
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.math.BigDecimal
 *  java.math.RoundingMode
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.GregorianCalendar
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.MissingResourceException
 *  java.util.Objects
 *  java.util.TimeZone
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  java.util.zip.DataFormatException
 *  java.util.zip.Inflater
 */
package g0;

import W2.c;
import Z2.b;
import Z2.e;
import a3.i;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
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
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import d0.A;
import d0.D;
import d0.q;
import g0.H;
import g0.I;
import g0.J;
import g0.K;
import g0.L;
import g0.a;
import g0.o;
import g0.p;
import g0.z;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
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

public abstract class M {
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
        int n8;
        String string2;
        String string3;
        String string4;
        a = n8 = Build.VERSION.SDK_INT;
        b = string4 = Build.DEVICE;
        c = string3 = Build.MANUFACTURER;
        d = string2 = Build.MODEL;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string4);
        stringBuilder.append(", ");
        stringBuilder.append(string2);
        stringBuilder.append(", ");
        stringBuilder.append(string3);
        stringBuilder.append(", ");
        stringBuilder.append(n8);
        e = stringBuilder.toString();
        f = new byte[0];
        g = new long[0];
        h = Pattern.compile((String)"(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        i = Pattern.compile((String)"^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        j = Pattern.compile((String)"%([A-Fa-f0-9]{2})");
        k = Pattern.compile((String)"(?:.*\\.)?isml?(?:/(manifest(.*))?)?", (int)2);
        m = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        n = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        o = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        p = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        q = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Handler A() {
        return M.B(null);
    }

    public static boolean A0(int n8) {
        if (n8 != 3 && n8 != 2 && n8 != 268435456 && n8 != 21 && n8 != 1342177280 && n8 != 22 && n8 != 1610612736 && n8 != 4) {
            return false;
        }
        return true;
    }

    public static Handler B(Handler.Callback callback) {
        return M.z((Looper)a.h((Object)Looper.myLooper()), callback);
    }

    public static boolean B0(Context object) {
        int n8 = a;
        if (n8 >= 29 && object.getApplicationInfo().targetSdkVersion >= 29 && (n8 != 30 || !c.a((CharSequence)(object = d), "moto g(20)") && !c.a((CharSequence)object, "rmx3231"))) {
            return false;
        }
        return true;
    }

    public static Handler C() {
        return M.D(null);
    }

    public static boolean C0(int n8) {
        if (n8 != 10 && n8 != 13) {
            return false;
        }
        return true;
    }

    public static Handler D(Handler.Callback callback) {
        return M.z(M.U(), callback);
    }

    public static boolean D0(Uri object) {
        if (!TextUtils.isEmpty((CharSequence)(object = object.getScheme())) && !"file".equals(object)) {
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HashMap E() {
        int n11;
        String[] arrstring = Locale.getISOLanguages();
        HashMap hashMap = new HashMap(arrstring.length + m.length);
        int n8 = arrstring.length;
        int n9 = 0;
        int n10 = 0;
        do {
            n11 = n9;
            if (n10 >= n8) break;
            String string2 = arrstring[n10];
            try {
                String string3 = new Locale(string2).getISO3Language();
                if (!TextUtils.isEmpty((CharSequence)string3)) {
                    hashMap.put((Object)string3, (Object)string2);
                }
            }
            catch (MissingResourceException missingResourceException) {}
            ++n10;
        } while (true);
        while (n11 < (arrstring = m).length) {
            hashMap.put((Object)arrstring[n11], (Object)arrstring[n11 + 1]);
            n11 += 2;
        }
        return hashMap;
    }

    public static boolean E0(Context context) {
        if ((context = (UiModeManager)context.getApplicationContext().getSystemService("uimode")) != null && context.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long F(long l8, int n8) {
        return M.Y0(l8, n8, 1000000L, RoundingMode.CEILING);
    }

    public static boolean F0(Context context) {
        if (a >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return true;
        }
        return false;
    }

    public static /* varargs */ String G(String string2, Object ... arrobject) {
        return String.format((Locale)Locale.US, (String)string2, (Object[])arrobject);
    }

    public static /* synthetic */ Thread G0(String string2, Runnable runnable) {
        return new Thread(runnable, string2);
    }

    public static String H(byte[] arrby) {
        return new String(arrby, W2.e.c);
    }

    public static int H0(int[] arrn, int n8) {
        for (int i8 = 0; i8 < arrn.length; ++i8) {
            if (arrn[i8] != n8) continue;
            return i8;
        }
        return -1;
    }

    public static String I(byte[] arrby, int n8, int n9) {
        return new String(arrby, n8, n9, W2.e.c);
    }

    public static String I0(String string2) {
        String[] arrstring;
        for (int i8 = 0; i8 < (arrstring = n).length; i8 += 2) {
            if (!string2.startsWith(arrstring[i8])) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(arrstring[i8 + 1]);
            stringBuilder.append(string2.substring(arrstring[i8].length()));
            return stringBuilder.toString();
        }
        return string2;
    }

    public static int J(Context context) {
        if ((context = (AudioManager)context.getSystemService("audio")) == null) {
            return -1;
        }
        return context.generateAudioSessionId();
    }

    public static long J0(long l8) {
        long l9 = l8;
        if (l8 != -9223372036854775807L) {
            if (l8 == Long.MIN_VALUE) {
                return l8;
            }
            l9 = l8 * 1000L;
        }
        return l9;
    }

    public static int K(int n8) {
        if (n8 != 20) {
            if (n8 != 22) {
                if (n8 != 30) {
                    switch (n8) {
                        default: {
                            switch (n8) {
                                default: {
                                    return Integer.MAX_VALUE;
                                }
                                case 14: {
                                    return 25;
                                }
                                case 15: 
                                case 16: 
                                case 17: 
                                case 18: 
                            }
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
                        case 3: 
                    }
                    return 3;
                }
                return 34;
            }
            return 31;
        }
        return 30;
    }

    public static ExecutorService K0(String string2) {
        return Executors.newSingleThreadExecutor((ThreadFactory)new L(string2));
    }

    public static AudioFormat L(int n8, int n9, int n10) {
        return new AudioFormat.Builder().setSampleRate(n8).setChannelMask(n9).setEncoding(n10).build();
    }

    public static String L0(String string2) {
        String string3;
        block8 : {
            block7 : {
                if (string2 == null) {
                    return null;
                }
                string3 = string2.replace('_', '-');
                String string4 = string2;
                if (!string3.isEmpty()) {
                    string4 = string3.equals((Object)"und") ? string2 : string3;
                }
                String string5 = c.e(string4);
                String string6 = M.c1(string5, "-")[0];
                if (l == null) {
                    l = M.E();
                }
                string3 = (String)l.get((Object)string6);
                string4 = string6;
                string2 = string5;
                if (string3 != null) {
                    string2 = new StringBuilder();
                    string2.append(string3);
                    string2.append(string5.substring(string6.length()));
                    string2 = string2.toString();
                    string4 = string3;
                }
                if ("no".equals((Object)string4) || "i".equals((Object)string4)) break block7;
                string3 = string2;
                if (!"zh".equals((Object)string4)) break block8;
            }
            string3 = M.I0(string2);
        }
        return string3;
    }

    public static int M(int n8) {
        switch (n8) {
            default: {
                return 0;
            }
            case 12: {
                return 743676;
            }
            case 10: {
                if (a >= 32) {
                    return 737532;
                }
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
            case 1: 
        }
        return 4;
    }

    public static Object[] M0(Object[] arrobject, Object object) {
        Object[] arrobject2 = Arrays.copyOf((Object[])arrobject, (int)(arrobject.length + 1));
        arrobject2[arrobject.length] = object;
        return M.j(arrobject2);
    }

    public static D.b N(D object, D.b b8) {
        boolean bl = object.o();
        boolean bl2 = object.w();
        boolean bl3 = object.G();
        boolean bl4 = object.B();
        boolean bl5 = object.Q();
        boolean bl6 = object.I();
        boolean bl7 = object.L().q();
        object = new D.b.a().b(b8).d(4, bl ^ true);
        boolean bl8 = false;
        boolean bl9 = bl2 && !bl;
        object = object.d(5, bl9);
        bl9 = bl3 && !bl;
        object = object.d(6, bl9);
        bl9 = !bl7 && (bl3 || !bl5 || bl2) && !bl;
        object = object.d(7, bl9);
        bl9 = bl4 && !bl;
        object = object.d(8, bl9);
        bl9 = !bl7 && (bl4 || bl5 && bl6) && !bl;
        object = object.d(9, bl9).d(10, bl ^ true);
        bl9 = bl2 && !bl;
        object = object.d(11, bl9);
        bl9 = bl8;
        if (bl2) {
            bl9 = bl8;
            if (!bl) {
                bl9 = true;
            }
        }
        return object.d(12, bl9).e();
    }

    public static Object[] N0(Object[] arrobject, Object[] arrobject2) {
        Object[] arrobject3 = Arrays.copyOf((Object[])arrobject, (int)(arrobject.length + arrobject2.length));
        System.arraycopy((Object)arrobject2, (int)0, (Object)arrobject3, (int)arrobject.length, (int)arrobject2.length);
        return arrobject3;
    }

    public static int O(ByteBuffer byteBuffer, int n8) {
        n8 = byteBuffer.getInt(n8);
        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
            return n8;
        }
        return Integer.reverseBytes((int)n8);
    }

    public static Object[] O0(Object[] arrobject, int n8) {
        boolean bl = n8 <= arrobject.length;
        a.a(bl);
        return Arrays.copyOf((Object[])arrobject, (int)n8);
    }

    public static int P(String arrstring, int n8) {
        arrstring = M.d1((String)arrstring);
        int n9 = arrstring.length;
        int n10 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n11 = n10;
            if (n8 == d0.z.m(arrstring[i8])) {
                n11 = n10 + 1;
            }
            n10 = n11;
        }
        return n10;
    }

    public static Object[] P0(Object[] arrobject, int n8, int n9) {
        boolean bl = false;
        boolean bl2 = n8 >= 0;
        a.a(bl2);
        bl2 = bl;
        if (n9 <= arrobject.length) {
            bl2 = true;
        }
        a.a(bl2);
        return Arrays.copyOfRange((Object[])arrobject, (int)n8, (int)n9);
    }

    public static String Q(String string2, int n8) {
        String[] arrstring = M.d1(string2);
        int n9 = arrstring.length;
        string2 = null;
        if (n9 == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string3 : arrstring) {
            if (n8 != d0.z.m(string3)) continue;
            if (stringBuilder.length() > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(string3);
        }
        if (stringBuilder.length() > 0) {
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public static long Q0(String string2) {
        Matcher matcher = h.matcher((CharSequence)string2);
        if (matcher.matches()) {
            long l8;
            string2 = matcher.group(9);
            int n8 = 0;
            if (string2 != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                int n9;
                n8 = n9 = Integer.parseInt((String)matcher.group(12)) * 60 + Integer.parseInt((String)matcher.group(13));
                if ("-".equals((Object)matcher.group(11))) {
                    n8 = n9 * -1;
                }
            }
            string2 = new GregorianCalendar(TimeZone.getTimeZone((String)"GMT"));
            string2.clear();
            string2.set(Integer.parseInt((String)matcher.group(1)), Integer.parseInt((String)matcher.group(2)) - 1, Integer.parseInt((String)matcher.group(3)), Integer.parseInt((String)matcher.group(4)), Integer.parseInt((String)matcher.group(5)), Integer.parseInt((String)matcher.group(6)));
            if (!TextUtils.isEmpty((CharSequence)matcher.group(8))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("0.");
                stringBuilder.append(matcher.group(8));
                string2.set(14, new BigDecimal(stringBuilder.toString()).movePointRight(3).intValue());
            }
            long l9 = l8 = string2.getTimeInMillis();
            if (n8 != 0) {
                l9 = l8 - (long)n8 * 60000L;
            }
            return l9;
        }
        matcher = new StringBuilder();
        matcher.append("Invalid date/time format: ");
        matcher.append(string2);
        throw A.a(matcher.toString(), null);
    }

    public static String R(Context object) {
        if (object != null && (object = (TelephonyManager)object.getSystemService("phone")) != null && !TextUtils.isEmpty((CharSequence)(object = object.getNetworkCountryIso()))) {
            return c.f((String)object);
        }
        return c.f(Locale.getDefault().getCountry());
    }

    public static long R0(String string2) {
        Matcher matcher = i.matcher((CharSequence)string2);
        if (matcher.matches()) {
            long l8;
            boolean bl = TextUtils.isEmpty((CharSequence)matcher.group(1));
            string2 = matcher.group(3);
            double d8 = 0.0;
            double d9 = string2 != null ? Double.parseDouble((String)string2) * 3.1556908E7 : 0.0;
            string2 = matcher.group(5);
            double d10 = string2 != null ? Double.parseDouble((String)string2) * 2629739.0 : 0.0;
            string2 = matcher.group(7);
            double d11 = string2 != null ? Double.parseDouble((String)string2) * 86400.0 : 0.0;
            string2 = matcher.group(10);
            double d12 = string2 != null ? Double.parseDouble((String)string2) * 3600.0 : 0.0;
            string2 = matcher.group(12);
            double d13 = string2 != null ? Double.parseDouble((String)string2) * 60.0 : 0.0;
            string2 = matcher.group(14);
            if (string2 != null) {
                d8 = Double.parseDouble((String)string2);
            }
            long l9 = l8 = (long)((d9 + d10 + d11 + d12 + d13 + d8) * 1000.0);
            if (true ^ bl) {
                l9 = - l8;
            }
            return l9;
        }
        return (long)(Double.parseDouble((String)string2) * 3600.0 * 1000.0);
    }

    public static Point S(Context context) {
        DisplayManager displayManager = (DisplayManager)context.getSystemService("display");
        displayManager = displayManager != null ? displayManager.getDisplay(0) : null;
        DisplayManager displayManager2 = displayManager;
        if (displayManager == null) {
            displayManager2 = ((WindowManager)a.e((Object)((WindowManager)context.getSystemService("window")))).getDefaultDisplay();
        }
        return M.T(context, (Display)displayManager2);
    }

    public static boolean S0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Point T(Context context, Display display) {
        if (display.getDisplayId() == 0 && M.E0(context)) {
            String string2 = a < 28 ? "sys.display-size" : "vendor.display-size";
            if (!TextUtils.isEmpty((CharSequence)(string2 = M.o0(string2)))) {
                StringBuilder stringBuilder;
                try {
                    stringBuilder = M.b1(string2.trim(), "x");
                    if (stringBuilder.length == 2) {
                        int n8 = Integer.parseInt((String)stringBuilder[0]);
                        int n9 = Integer.parseInt((String)stringBuilder[1]);
                        if (n8 > 0 && n9 > 0) {
                            return new Point(n8, n9);
                        }
                    }
                }
                catch (NumberFormatException numberFormatException) {}
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid display size: ");
                stringBuilder.append(string2);
                o.c("Util", stringBuilder.toString());
            }
            if ("Sony".equals((Object)c) && d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        context = new Point();
        if (a >= 23) {
            M.V(display, (Point)context);
            return context;
        }
        display.getRealSize((Point)context);
        return context;
    }

    public static boolean T0(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Looper U() {
        Looper looper = Looper.myLooper();
        if (looper != null) {
            return looper;
        }
        return Looper.getMainLooper();
    }

    public static void U0(List list, int n8, int n9) {
        if (n8 >= 0 && n9 <= list.size() && n8 <= n9) {
            if (n8 != n9) {
                list.subList(n8, n9).clear();
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void V(Display display, Point point) {
        display = display.getMode();
        point.x = display.getPhysicalWidth();
        point.y = display.getPhysicalHeight();
    }

    public static long V0(long l8, int n8) {
        return M.Y0(l8, 1000000L, n8, RoundingMode.FLOOR);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int W(int n8) {
        if (n8 == 2 || n8 == 4) return 6005;
        if (n8 == 10) return 6004;
        if (n8 == 7) return 6005;
        if (n8 == 8) return 6003;
        switch (n8) {
            default: {
                switch (n8) {
                    default: {
                        return 6006;
                    }
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                }
                return 6002;
            }
            case 15: {
                return 6003;
            }
            case 17: 
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                return 6004;
            }
            case 16: 
            case 18: 
        }
        return 6005;
    }

    public static long W0(long l8, long l9, long l10) {
        return M.Y0(l8, l9, l10, RoundingMode.FLOOR);
    }

    public static int X(String arrstring) {
        int n8;
        block4 : {
            int n9;
            if (arrstring == null) {
                return 0;
            }
            int n10 = (arrstring = M.b1((String)arrstring, "_")).length;
            if (n10 < 2) {
                return 0;
            }
            String string2 = arrstring[n10 - 1];
            n10 = n10 >= 3 && "neg".equals((Object)arrstring[n10 - 2]) ? 1 : 0;
            try {
                n8 = n9 = Integer.parseInt((String)((String)a.e(string2)));
                if (n10 == 0) break block4;
            }
            catch (NumberFormatException numberFormatException) {
                return 0;
            }
            n8 = - n9;
        }
        return n8;
    }

    public static void X0(long[] arrl, long l8, long l9) {
        M.a1(arrl, l8, l9, RoundingMode.FLOOR);
    }

    public static String Y(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    public static long Y0(long l8, long l9, long l10, RoundingMode roundingMode) {
        if (l8 != 0L) {
            if (l9 == 0L) {
                return 0L;
            }
            long l11 = l10 LCMP l9;
            if (l11 >= 0 && l10 % l9 == 0L) {
                return e.b(l8, e.b(l10, l9, RoundingMode.UNNECESSARY), roundingMode);
            }
            if (l11 < 0 && l9 % l10 == 0L) {
                return e.d(l8, e.b(l9, l10, RoundingMode.UNNECESSARY));
            }
            l11 = l10 LCMP l8;
            if (l11 >= 0 && l10 % l8 == 0L) {
                return e.b(l9, e.b(l10, l8, RoundingMode.UNNECESSARY), roundingMode);
            }
            if (l11 < 0 && l8 % l10 == 0L) {
                return e.d(l9, e.b(l8, l10, RoundingMode.UNNECESSARY));
            }
            return M.Z0(l8, l9, l10, roundingMode);
        }
        return 0L;
    }

    public static String Z(Locale locale) {
        if (a >= 21) {
            return M.a0(locale);
        }
        return locale.toString();
    }

    public static long Z0(long l8, long l9, long l10, RoundingMode roundingMode) {
        long l11 = e.d(l8, l9);
        if (l11 != Long.MAX_VALUE && l11 != Long.MIN_VALUE) {
            return e.b(l11, l10, roundingMode);
        }
        l11 = e.c(Math.abs((long)l9), Math.abs((long)l10));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        l9 = e.b(l9, l11, roundingMode2);
        l10 = e.b(l10, l11, roundingMode2);
        l11 = e.c(Math.abs((long)l8), Math.abs((long)l10));
        l8 = e.b(l8, l11, roundingMode2);
        l10 = e.b(l10, l11, roundingMode2);
        l11 = e.d(l8, l9);
        if (l11 != Long.MAX_VALUE && l11 != Long.MIN_VALUE) {
            return e.b(l11, l10, roundingMode);
        }
        double d8 = (double)l9 / (double)l10;
        if ((d8 = (double)l8 * d8) > 9.223372036854776E18) {
            return Long.MAX_VALUE;
        }
        if (d8 < -9.223372036854776E18) {
            return Long.MIN_VALUE;
        }
        return b.c(d8, roundingMode);
    }

    public static /* synthetic */ Thread a(String string2, Runnable runnable) {
        return M.G0(string2, runnable);
    }

    public static String a0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static void a1(long[] arrl, long l8, long l9, RoundingMode roundingMode) {
        int n8;
        if (l8 == 0L) {
            Arrays.fill((long[])arrl, (long)0L);
            return;
        }
        long l10 = l9 LCMP l8;
        int n9 = 0;
        if (l10 >= 0 && l9 % l8 == 0L) {
            l8 = e.b(l9, l8, RoundingMode.UNNECESSARY);
            for (n8 = 0; n8 < arrl.length; ++n8) {
                arrl[n8] = e.b(arrl[n8], l8, roundingMode);
            }
        } else if (l10 < 0 && l8 % l9 == 0L) {
            l8 = e.b(l8, l9, RoundingMode.UNNECESSARY);
            for (n8 = n9; n8 < arrl.length; ++n8) {
                arrl[n8] = e.d(arrl[n8], l8);
            }
        } else {
            for (n8 = 0; n8 < arrl.length; ++n8) {
                long l11 = arrl[n8];
                if (l11 == 0L) continue;
                arrl[n8] = l9 >= l11 && l9 % l11 == 0L ? e.b(l8, e.b(l9, l11, RoundingMode.UNNECESSARY), roundingMode) : (l9 < l11 && l11 % l9 == 0L ? e.d(l8, e.b(l11, l9, RoundingMode.UNNECESSARY)) : M.Z0(l11, l8, l9, roundingMode));
            }
        }
    }

    public static long b(long l8, long l9, long l10) {
        long l11 = l8 + l9;
        if (((l8 ^ l11) & (l9 ^ l11)) < 0L) {
            return l10;
        }
        return l11;
    }

    public static int b0(Context context) {
        if (M.B0(context)) {
            return 1;
        }
        return 5;
    }

    public static String[] b1(String string2, String string3) {
        return string2.split(string3, -1);
    }

    public static boolean c(Object object, Object object2) {
        if (object == null) {
            if (object2 == null) {
                return true;
            }
            return false;
        }
        return object.equals(object2);
    }

    public static long c0(long l8, float f8) {
        if (f8 == 1.0f) {
            return l8;
        }
        return Math.round((double)((double)l8 * (double)f8));
    }

    public static String[] c1(String string2, String string3) {
        return string2.split(string3, 2);
    }

    public static int d(long[] arrl, long l8, boolean bl, boolean bl2) {
        int n8;
        int n9 = n8 = Arrays.binarySearch((long[])arrl, (long)l8);
        if (n8 < 0) {
            n9 = n8;
        } else {
            while ((n8 = n9 + 1) < arrl.length && arrl[n8] == l8) {
                n9 = n8;
            }
            if (!bl) {
                n9 = n8;
            }
        }
        n8 = n9;
        if (bl2) {
            n8 = Math.min((int)(arrl.length - 1), (int)n9);
        }
        return n8;
    }

    public static long d0(long l8) {
        if (l8 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return l8 + SystemClock.elapsedRealtime();
    }

    public static String[] d1(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return new String[0];
        }
        return M.b1(string2.trim(), "(\\s*,\\s*)");
    }

    public static int e(p p8, long l8, boolean bl, boolean bl2) {
        int n8 = p8.c() - 1;
        int n9 = 0;
        while (n9 <= n8) {
            int n10 = n9 + n8 >>> 1;
            if (p8.b(n10) < l8) {
                n9 = n10 + 1;
                continue;
            }
            n8 = n10 - 1;
        }
        if (bl && (n9 = n8 + 1) < p8.c() && p8.b(n9) == l8) {
            return n9;
        }
        if (bl2 && n8 == -1) {
            return 0;
        }
        return n8;
    }

    public static int e0(int n8) {
        if (n8 != 8) {
            if (n8 != 16) {
                if (n8 != 24) {
                    if (n8 != 32) {
                        return 0;
                    }
                    return 22;
                }
                return 21;
            }
            return 2;
        }
        return 3;
    }

    public static long e1(long l8, long l9, long l10) {
        long l11 = l8 - l9;
        if (((l8 ^ l11) & (l9 ^ l8)) < 0L) {
            return l10;
        }
        return l11;
    }

    public static int f(List list, Comparable comparable, boolean bl, boolean bl2) {
        int n8;
        int n9 = n8 = Collections.binarySearch((List)list, (Object)comparable);
        if (n8 < 0) {
            n9 = - n8 + 2;
        } else {
            while ((n8 = n9 - 1) >= 0 && ((Comparable)list.get(n8)).compareTo((Object)comparable) == 0) {
                n9 = n8;
            }
            if (!bl) {
                n9 = n8;
            }
        }
        n8 = n9;
        if (bl2) {
            n8 = Math.max((int)0, (int)n9);
        }
        return n8;
    }

    public static q f0(int n8, int n9, int n10) {
        return new q.b().o0("audio/raw").N(n9).p0(n10).i0(n8).K();
    }

    public static String f1(byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder(arrby.length * 2);
        for (int i8 = 0; i8 < arrby.length; ++i8) {
            stringBuilder.append(Character.forDigit((int)(arrby[i8] >> 4 & 15), (int)16));
            stringBuilder.append(Character.forDigit((int)(arrby[i8] & 15), (int)16));
        }
        return stringBuilder.toString();
    }

    public static int g(int[] arrn, int n8, boolean bl, boolean bl2) {
        int n9;
        int n10 = n9 = Arrays.binarySearch((int[])arrn, (int)n8);
        if (n9 < 0) {
            n8 = - n9 + 2;
        } else {
            while ((n9 = n10 - 1) >= 0 && arrn[n9] == n8) {
                n10 = n9;
            }
            n8 = bl ? n10 : n9;
        }
        n10 = n8;
        if (bl2) {
            n10 = Math.max((int)0, (int)n8);
        }
        return n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int g0(int n8, int n9) {
        if (n8 == 2) return n9 * 2;
        int n10 = n9;
        if (n8 == 3) return n10;
        if (n8 == 4) return n9 * 4;
        if (n8 == 21) return n9 * 3;
        if (n8 == 22) return n9 * 4;
        if (n8 == 268435456) return n9 * 2;
        if (n8 == 1342177280) return n9 * 3;
        if (n8 != 1610612736) throw new IllegalArgumentException();
        return n9 * 4;
    }

    public static long g1(int n8, int n9) {
        long l8 = M.h1(n8);
        return M.h1(n9) | l8 << 32;
    }

    public static int h(long[] arrl, long l8, boolean bl, boolean bl2) {
        int n8;
        int n9 = n8 = Arrays.binarySearch((long[])arrl, (long)l8);
        if (n8 < 0) {
            n9 = - n8 + 2;
        } else {
            while ((n8 = n9 - 1) >= 0 && arrl[n8] == l8) {
                n9 = n8;
            }
            if (!bl) {
                n9 = n8;
            }
        }
        n8 = n9;
        if (bl2) {
            n8 = Math.max((int)0, (int)n9);
        }
        return n8;
    }

    public static long h0(long l8, float f8) {
        if (f8 == 1.0f) {
            return l8;
        }
        return Math.round((double)((double)l8 / (double)f8));
    }

    public static long h1(int n8) {
        return (long)n8 & 0xFFFFFFFFL;
    }

    public static Object i(Object object) {
        return object;
    }

    public static List i0(int n8) {
        ArrayList arrayList = new ArrayList();
        if ((n8 & 1) != 0) {
            arrayList.add((Object)"main");
        }
        if ((n8 & 2) != 0) {
            arrayList.add((Object)"alt");
        }
        if ((n8 & 4) != 0) {
            arrayList.add((Object)"supplementary");
        }
        if ((n8 & 8) != 0) {
            arrayList.add((Object)"commentary");
        }
        if ((n8 & 16) != 0) {
            arrayList.add((Object)"dub");
        }
        if ((n8 & 32) != 0) {
            arrayList.add((Object)"emergency");
        }
        if ((n8 & 64) != 0) {
            arrayList.add((Object)"caption");
        }
        if ((n8 & 128) != 0) {
            arrayList.add((Object)"subtitle");
        }
        if ((n8 & 256) != 0) {
            arrayList.add((Object)"sign");
        }
        if ((n8 & 512) != 0) {
            arrayList.add((Object)"describes-video");
        }
        if ((n8 & 1024) != 0) {
            arrayList.add((Object)"describes-music");
        }
        if ((n8 & 2048) != 0) {
            arrayList.add((Object)"enhanced-intelligibility");
        }
        if ((n8 & 4096) != 0) {
            arrayList.add((Object)"transcribes-dialog");
        }
        if ((n8 & 8192) != 0) {
            arrayList.add((Object)"easy-read");
        }
        if ((n8 & 16384) != 0) {
            arrayList.add((Object)"trick-play");
        }
        return arrayList;
    }

    public static long i1(long l8) {
        long l9 = l8;
        if (l8 != -9223372036854775807L) {
            if (l8 == Long.MIN_VALUE) {
                return l8;
            }
            l9 = l8 / 1000L;
        }
        return l9;
    }

    public static Object[] j(Object[] arrobject) {
        return arrobject;
    }

    public static List j0(int n8) {
        ArrayList arrayList = new ArrayList();
        if ((n8 & 4) != 0) {
            arrayList.add((Object)"auto");
        }
        if ((n8 & 1) != 0) {
            arrayList.add((Object)"default");
        }
        if ((n8 & 2) != 0) {
            arrayList.add((Object)"forced");
        }
        return arrayList;
    }

    public static void j1(Parcel parcel, boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static int k(int n8, int n9) {
        return (n8 + n9 - 1) / n9;
    }

    public static int k0(int n8) {
        if (n8 != 13) {
            switch (n8) {
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
                case 2: 
            }
            return 0;
        }
        return 1;
    }

    public static long l(long l8, long l9) {
        return (l8 + l9 - 1L) / l9;
    }

    public static String[] l0() {
        String[] arrstring = M.m0();
        for (int i8 = 0; i8 < arrstring.length; ++i8) {
            arrstring[i8] = M.L0(arrstring[i8]);
        }
        return arrstring;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void m(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static String[] m0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (a >= 24) {
            return M.n0(configuration);
        }
        return new String[]{M.Z(configuration.locale)};
    }

    public static int n(long l8, long l9) {
        long l10 = l8 LCMP l9;
        if (l10 < 0) {
            return -1;
        }
        if (l10 == false) {
            return 0;
        }
        return 1;
    }

    public static String[] n0(Configuration configuration) {
        return M.b1(K.a(J.a(configuration)), ",");
    }

    public static float o(float f8, float f9, float f10) {
        return Math.max((float)f9, (float)Math.min((float)f8, (float)f10));
    }

    public static String o0(String string2) {
        try {
            Object object = Class.forName((String)"android.os.SystemProperties");
            object = (String)object.getMethod("get", new Class[]{String.class}).invoke(object, new Object[]{string2});
            return object;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to read system property ");
            stringBuilder.append(string2);
            o.d("Util", stringBuilder.toString(), (Throwable)exception);
            return null;
        }
    }

    public static int p(int n8, int n9, int n10) {
        return Math.max((int)n9, (int)Math.min((int)n8, (int)n10));
    }

    public static String p0(int n8) {
        switch (n8) {
            default: {
                if (n8 >= 10000) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("custom (");
                    stringBuilder.append(n8);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
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
            case -2: 
        }
        return "none";
    }

    public static long q(long l8, long l9, long l10) {
        return Math.max((long)l9, (long)Math.min((long)l8, (long)l10));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String q0(Context object, String string2) {
        String string3;
        block2 : {
            try {
                string3 = object.getPackageName();
                object = object.getPackageManager().getPackageInfo((String)string3, (int)0).versionName;
                break block2;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            object = "?";
        }
        string3 = new StringBuilder();
        string3.append(string2);
        string3.append("/");
        string3.append((String)object);
        string3.append(" (Linux;Android ");
        string3.append(Build.VERSION.RELEASE);
        string3.append(") ");
        string3.append("AndroidXMedia3/1.4.1");
        return string3.toString();
    }

    public static boolean r(SparseArray sparseArray, int n8) {
        if (sparseArray.indexOfKey(n8) >= 0) {
            return true;
        }
        return false;
    }

    public static byte[] r0(String string2) {
        return string2.getBytes(W2.e.c);
    }

    public static boolean s(Object[] arrobject, Object object) {
        int n8 = arrobject.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!M.c(arrobject[i8], object)) continue;
            return true;
        }
        return false;
    }

    public static int s0(Uri object) {
        String string2 = object.getScheme();
        if (string2 != null && c.a("rtsp", string2)) {
            return 3;
        }
        string2 = object.getLastPathSegment();
        if (string2 == null) {
            return 4;
        }
        int n8 = string2.lastIndexOf(46);
        if (n8 >= 0 && (n8 = M.t0(string2.substring(n8 + 1))) != 4) {
            return n8;
        }
        if ((object = k.matcher((CharSequence)a.e(object.getPath()))).matches()) {
            if ((object = object.group(2)) != null) {
                if (object.contains((CharSequence)"format=mpd-time-csf")) {
                    return 0;
                }
                if (object.contains((CharSequence)"format=m3u8-aapl")) {
                    return 2;
                }
            }
            return 1;
        }
        return 4;
    }

    public static boolean t(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            if (sparseArray2 == null) {
                return true;
            }
            return false;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (a >= 31) {
            return I.a(sparseArray, sparseArray2);
        }
        int n8 = sparseArray.size();
        if (n8 != sparseArray2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < n8; ++i8) {
            int n9 = sparseArray.keyAt(i8);
            if (Objects.equals((Object)sparseArray.valueAt(i8), (Object)sparseArray2.get(n9))) continue;
            return false;
        }
        return true;
    }

    public static int t0(String string2) {
        string2 = c.e(string2);
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 3299913: {
                if (!string2.equals((Object)"m3u8")) break;
                n9 = 3;
                break;
            }
            case 3242057: {
                if (!string2.equals((Object)"isml")) break;
                n9 = 2;
                break;
            }
            case 108321: {
                if (!string2.equals((Object)"mpd")) break;
                n9 = 1;
                break;
            }
            case 104579: {
                if (!string2.equals((Object)"ism")) break;
                n9 = 0;
            }
        }
        switch (n9) {
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
            case 2: 
        }
        return 1;
    }

    public static int u(SparseArray sparseArray) {
        if (a >= 31) {
            return H.a(sparseArray);
        }
        int n8 = 17;
        for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
            n8 = (n8 * 31 + sparseArray.keyAt(i8)) * 31 + Objects.hashCode((Object)sparseArray.valueAt(i8));
        }
        return n8;
    }

    public static int u0(Uri uri, String string2) {
        if (string2 == null) {
            return M.s0(uri);
        }
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1154777587: {
                if (!string2.equals((Object)"application/x-rtsp")) break;
                n9 = 3;
                break;
            }
            case 64194685: {
                if (!string2.equals((Object)"application/dash+xml")) break;
                n9 = 2;
                break;
            }
            case -156749520: {
                if (!string2.equals((Object)"application/vnd.ms-sstr+xml")) break;
                n9 = 1;
                break;
            }
            case -979127466: {
                if (!string2.equals((Object)"application/x-mpegURL")) break;
                n9 = 0;
            }
        }
        switch (n9) {
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
            case 0: 
        }
        return 2;
    }

    public static int v(byte[] arrby, int n8, int n9, int n10) {
        while (n8 < n9) {
            int n11 = i.b(arrby[n8]);
            n10 = M.w(n11 & 15, M.w(n11 >> 4, n10));
            ++n8;
        }
        return n10;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static boolean v0(z z8, z z9, Inflater inflater) {
        Inflater inflater2;
        Throwable throwable222;
        block10 : {
            if (z8.a() <= 0) {
                return false;
            }
            if (z9.b() < z8.a()) {
                z9.c(z8.a() * 2);
            }
            inflater2 = inflater;
            if (inflater == null) {
                inflater2 = new Inflater();
            }
            inflater2.setInput(z8.e(), z8.f(), z8.a());
            int n8 = 0;
            do {
                int n9;
                block9 : {
                    n9 = n8 + inflater2.inflate(z9.e(), n8, z9.b() - n8);
                    if (!inflater2.finished()) break block9;
                    z9.S(n9);
                    inflater2.reset();
                    return true;
                }
                try {
                    if (inflater2.needsDictionary() || inflater2.needsInput()) {
                        break;
                    }
                }
                catch (Throwable throwable222) {
                    break block10;
                }
                n8 = n9;
                if (n9 != z9.b()) continue;
                z9.c(z9.b() * 2);
                n8 = n9;
            } while (true);
            inflater2.reset();
            return false;
        }
        inflater2.reset();
        throw throwable222;
        catch (DataFormatException dataFormatException) {}
        inflater2.reset();
        return false;
    }

    public static int w(int n8, int n9) {
        return (p[(n8 ^ n9 >> 12 & 255) & 255] ^ n9 << 4 & 65535) & 65535;
    }

    public static String w0(int n8) {
        return Integer.toString((int)n8, (int)36);
    }

    public static int x(byte[] arrby, int n8, int n9, int n10) {
        while (n8 < n9) {
            n10 = o[(n10 >>> 24 ^ arrby[n8] & 255) & 255] ^ n10 << 8;
            ++n8;
        }
        return n10;
    }

    public static boolean x0(Context context) {
        if (a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return true;
        }
        return false;
    }

    public static int y(byte[] arrby, int n8, int n9, int n10) {
        while (n8 < n9) {
            n10 = q[n10 ^ arrby[n8] & 255];
            ++n8;
        }
        return n10;
    }

    public static boolean y0(String string2) {
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case -879258763: {
                if (!string2.equals((Object)"image/png")) break;
                n9 = 6;
                break;
            }
            case -879272239: {
                if (!string2.equals((Object)"image/bmp")) break;
                n9 = 5;
                break;
            }
            case -1487018032: {
                if (!string2.equals((Object)"image/webp")) break;
                n9 = 4;
                break;
            }
            case -1487394660: {
                if (!string2.equals((Object)"image/jpeg")) break;
                n9 = 3;
                break;
            }
            case -1487464690: {
                if (!string2.equals((Object)"image/heif")) break;
                n9 = 2;
                break;
            }
            case -1487464693: {
                if (!string2.equals((Object)"image/heic")) break;
                n9 = 1;
                break;
            }
            case -1487656890: {
                if (!string2.equals((Object)"image/avif")) break;
                n9 = 0;
            }
        }
        switch (n9) {
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
                if (a >= 26) {
                    return true;
                }
                return false;
            }
            case 0: 
        }
        if (a >= 34) {
            return true;
        }
        return false;
    }

    public static Handler z(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean z0(int n8) {
        if (n8 != 21 && n8 != 1342177280 && n8 != 22 && n8 != 1610612736 && n8 != 4) {
            return false;
        }
        return true;
    }
}

