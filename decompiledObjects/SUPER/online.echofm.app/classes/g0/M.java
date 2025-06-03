package g0;

import W2.c;
import Z2.b;
import a3.i;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioFormat.Builder;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.Display.Mode;
import android.view.WindowManager;
import d0.A;
import d0.D;
import d0.D.b;
import d0.D.b.a;
import d0.q;
import d0.q.b;
import d0.z;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class M
{
  public static final int a;
  public static final String b;
  public static final String c;
  public static final String d;
  public static final String e;
  public static final byte[] f = new byte[0];
  public static final long[] g = new long[0];
  public static final Pattern h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
  public static final Pattern i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
  public static final Pattern j = Pattern.compile("%([A-Fa-f0-9]{2})");
  public static final Pattern k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
  public static HashMap l;
  public static final String[] m = { "alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn" };
  public static final String[] n = { "i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn" };
  public static final int[] o = { 0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108 };
  public static final int[] p = { 0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935 };
  public static final int[] q = { 0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243 };
  
  static
  {
    int i1 = Build.VERSION.SDK_INT;
    a = i1;
    String str1 = Build.DEVICE;
    b = str1;
    String str2 = Build.MANUFACTURER;
    c = str2;
    String str3 = Build.MODEL;
    d = str3;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append(", ");
    localStringBuilder.append(str3);
    localStringBuilder.append(", ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", ");
    localStringBuilder.append(i1);
    e = localStringBuilder.toString();
  }
  
  public static Handler A()
  {
    return B(null);
  }
  
  public static boolean A0(int paramInt)
  {
    boolean bool;
    if ((paramInt != 3) && (paramInt != 2) && (paramInt != 268435456) && (paramInt != 21) && (paramInt != 1342177280) && (paramInt != 22) && (paramInt != 1610612736) && (paramInt != 4)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static Handler B(Handler.Callback paramCallback)
  {
    return z((Looper)a.h(Looper.myLooper()), paramCallback);
  }
  
  public static boolean B0(Context paramContext)
  {
    int i1 = a;
    if ((i1 >= 29) && (getApplicationInfotargetSdkVersion >= 29)) {
      if (i1 == 30)
      {
        paramContext = d;
        if ((c.a(paramContext, "moto g(20)")) || (c.a(paramContext, "rmx3231"))) {}
      }
      else
      {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static Handler C()
  {
    return D(null);
  }
  
  public static boolean C0(int paramInt)
  {
    boolean bool;
    if ((paramInt != 10) && (paramInt != 13)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static Handler D(Handler.Callback paramCallback)
  {
    return z(U(), paramCallback);
  }
  
  public static boolean D0(Uri paramUri)
  {
    paramUri = paramUri.getScheme();
    boolean bool;
    if ((!TextUtils.isEmpty(paramUri)) && (!"file".equals(paramUri))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static HashMap E()
  {
    String[] arrayOfString = Locale.getISOLanguages();
    HashMap localHashMap = new HashMap(arrayOfString.length + m.length);
    int i1 = arrayOfString.length;
    int i2 = 0;
    int i3 = 0;
    for (;;)
    {
      int i4 = i2;
      String str;
      if (i3 < i1) {
        str = arrayOfString[i3];
      }
      try
      {
        Object localObject = new java/util/Locale;
        ((Locale)localObject).<init>(str);
        localObject = ((Locale)localObject).getISO3Language();
        if (!TextUtils.isEmpty((CharSequence)localObject)) {
          localHashMap.put(localObject, str);
        }
        i3++;
        continue;
        for (;;)
        {
          arrayOfString = m;
          if (i4 >= arrayOfString.length) {
            break;
          }
          localHashMap.put(arrayOfString[i4], arrayOfString[(i4 + 1)]);
          i4 += 2;
        }
        return localHashMap;
      }
      catch (MissingResourceException localMissingResourceException)
      {
        for (;;) {}
      }
    }
  }
  
  public static boolean E0(Context paramContext)
  {
    paramContext = (UiModeManager)paramContext.getApplicationContext().getSystemService("uimode");
    boolean bool;
    if ((paramContext != null) && (paramContext.getCurrentModeType() == 4)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static long F(long paramLong, int paramInt)
  {
    return Y0(paramLong, paramInt, 1000000L, RoundingMode.CEILING);
  }
  
  public static boolean F0(Context paramContext)
  {
    boolean bool;
    if ((a >= 20) && (paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static String G(String paramString, Object... paramVarArgs)
  {
    return String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static String H(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, W2.e.c);
  }
  
  public static int H0(int[] paramArrayOfInt, int paramInt)
  {
    for (int i1 = 0; i1 < paramArrayOfInt.length; i1++) {
      if (paramArrayOfInt[i1] == paramInt) {
        return i1;
      }
    }
    return -1;
  }
  
  public static String I(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new String(paramArrayOfByte, paramInt1, paramInt2, W2.e.c);
  }
  
  public static String I0(String paramString)
  {
    for (int i1 = 0;; i1 += 2)
    {
      String[] arrayOfString = n;
      if (i1 >= arrayOfString.length) {
        break;
      }
      if (paramString.startsWith(arrayOfString[i1]))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(arrayOfString[(i1 + 1)]);
        localStringBuilder.append(paramString.substring(arrayOfString[i1].length()));
        return localStringBuilder.toString();
      }
    }
    return paramString;
  }
  
  public static int J(Context paramContext)
  {
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    int i1;
    if (paramContext == null) {
      i1 = -1;
    } else {
      i1 = paramContext.generateAudioSessionId();
    }
    return i1;
  }
  
  public static long J0(long paramLong)
  {
    long l1 = paramLong;
    if (paramLong != -9223372036854775807L) {
      if (paramLong == Long.MIN_VALUE) {
        l1 = paramLong;
      } else {
        l1 = paramLong * 1000L;
      }
    }
    return l1;
  }
  
  public static int K(int paramInt)
  {
    if (paramInt != 20)
    {
      if (paramInt != 22)
      {
        if (paramInt != 30)
        {
          switch (paramInt)
          {
          default: 
            switch (paramInt)
            {
            default: 
              return Integer.MAX_VALUE;
            case 14: 
              return 25;
            }
          case 9: 
          case 10: 
          case 11: 
          case 12: 
            return 28;
          case 7: 
          case 8: 
            return 23;
          case 4: 
          case 5: 
          case 6: 
            return 21;
          }
          return 3;
        }
        return 34;
      }
      return 31;
    }
    return 30;
  }
  
  public static ExecutorService K0(String paramString)
  {
    return Executors.newSingleThreadExecutor(new L(paramString));
  }
  
  public static AudioFormat L(int paramInt1, int paramInt2, int paramInt3)
  {
    return new AudioFormat.Builder().setSampleRate(paramInt1).setChannelMask(paramInt2).setEncoding(paramInt3).build();
  }
  
  public static String L0(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    String str1 = paramString.replace('_', '-');
    Object localObject = paramString;
    if (!str1.isEmpty()) {
      if (str1.equals("und")) {
        localObject = paramString;
      } else {
        localObject = str1;
      }
    }
    String str2 = c.e((String)localObject);
    String str3 = c1(str2, "-")[0];
    if (l == null) {
      l = E();
    }
    str1 = (String)l.get(str3);
    localObject = str3;
    paramString = str2;
    if (str1 != null)
    {
      paramString = new StringBuilder();
      paramString.append(str1);
      paramString.append(str2.substring(str3.length()));
      paramString = paramString.toString();
      localObject = str1;
    }
    if ((!"no".equals(localObject)) && (!"i".equals(localObject)))
    {
      str1 = paramString;
      if (!"zh".equals(localObject)) {}
    }
    else
    {
      str1 = I0(paramString);
    }
    return str1;
  }
  
  public static int M(int paramInt)
  {
    switch (paramInt)
    {
    case 9: 
    case 11: 
    default: 
      return 0;
    case 12: 
      return 743676;
    case 10: 
      if (a >= 32) {
        return 737532;
      }
    case 8: 
      return 6396;
    case 7: 
      return 1276;
    case 6: 
      return 252;
    case 5: 
      return 220;
    case 4: 
      return 204;
    case 3: 
      return 28;
    case 2: 
      return 12;
    }
    return 4;
  }
  
  public static Object[] M0(Object[] paramArrayOfObject, Object paramObject)
  {
    Object[] arrayOfObject = Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length + 1);
    arrayOfObject[paramArrayOfObject.length] = paramObject;
    return j(arrayOfObject);
  }
  
  public static D.b N(D paramD, D.b paramb)
  {
    boolean bool1 = paramD.o();
    boolean bool2 = paramD.w();
    boolean bool3 = paramD.G();
    boolean bool4 = paramD.B();
    boolean bool5 = paramD.Q();
    boolean bool6 = paramD.I();
    boolean bool7 = paramD.L().q();
    paramD = new D.b.a().b(paramb).d(4, bool1 ^ true);
    boolean bool8 = false;
    if ((bool2) && (!bool1)) {
      bool9 = true;
    } else {
      bool9 = false;
    }
    paramD = paramD.d(5, bool9);
    if ((bool3) && (!bool1)) {
      bool9 = true;
    } else {
      bool9 = false;
    }
    paramD = paramD.d(6, bool9);
    if ((!bool7) && ((bool3) || (!bool5) || (bool2)) && (!bool1)) {
      bool9 = true;
    } else {
      bool9 = false;
    }
    paramD = paramD.d(7, bool9);
    if ((bool4) && (!bool1)) {
      bool9 = true;
    } else {
      bool9 = false;
    }
    paramD = paramD.d(8, bool9);
    if ((!bool7) && ((bool4) || ((bool5) && (bool6))) && (!bool1)) {
      bool9 = true;
    } else {
      bool9 = false;
    }
    paramD = paramD.d(9, bool9).d(10, bool1 ^ true);
    if ((bool2) && (!bool1)) {
      bool9 = true;
    } else {
      bool9 = false;
    }
    paramD = paramD.d(11, bool9);
    boolean bool9 = bool8;
    if (bool2)
    {
      bool9 = bool8;
      if (!bool1) {
        bool9 = true;
      }
    }
    return paramD.d(12, bool9).e();
  }
  
  public static Object[] N0(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    Object[] arrayOfObject = Arrays.copyOf(paramArrayOfObject1, paramArrayOfObject1.length + paramArrayOfObject2.length);
    System.arraycopy(paramArrayOfObject2, 0, arrayOfObject, paramArrayOfObject1.length, paramArrayOfObject2.length);
    return arrayOfObject;
  }
  
  public static int O(ByteBuffer paramByteBuffer, int paramInt)
  {
    paramInt = paramByteBuffer.getInt(paramInt);
    if (paramByteBuffer.order() != ByteOrder.BIG_ENDIAN) {
      paramInt = Integer.reverseBytes(paramInt);
    }
    return paramInt;
  }
  
  public static Object[] O0(Object[] paramArrayOfObject, int paramInt)
  {
    boolean bool;
    if (paramInt <= paramArrayOfObject.length) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    return Arrays.copyOf(paramArrayOfObject, paramInt);
  }
  
  public static int P(String paramString, int paramInt)
  {
    paramString = d1(paramString);
    int i1 = paramString.length;
    int i2 = 0;
    int i4;
    for (int i3 = 0; i2 < i1; i3 = i4)
    {
      i4 = i3;
      if (paramInt == z.m(paramString[i2])) {
        i4 = i3 + 1;
      }
      i2++;
    }
    return i3;
  }
  
  public static Object[] P0(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    if (paramInt1 >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a.a(bool2);
    boolean bool2 = bool1;
    if (paramInt2 <= paramArrayOfObject.length) {
      bool2 = true;
    }
    a.a(bool2);
    return Arrays.copyOfRange(paramArrayOfObject, paramInt1, paramInt2);
  }
  
  public static String Q(String paramString, int paramInt)
  {
    String[] arrayOfString = d1(paramString);
    int i1 = arrayOfString.length;
    paramString = null;
    if (i1 == 0) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i2 = arrayOfString.length;
    for (i1 = 0; i1 < i2; i1++)
    {
      String str = arrayOfString[i1];
      if (paramInt == z.m(str))
      {
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append(str);
      }
    }
    if (localStringBuilder.length() > 0) {
      paramString = localStringBuilder.toString();
    }
    return paramString;
  }
  
  public static long Q0(String paramString)
  {
    Object localObject = h.matcher(paramString);
    if (((Matcher)localObject).matches())
    {
      paramString = ((Matcher)localObject).group(9);
      int i1 = 0;
      if ((paramString != null) && (!((Matcher)localObject).group(9).equalsIgnoreCase("Z")))
      {
        int i2 = Integer.parseInt(((Matcher)localObject).group(12)) * 60 + Integer.parseInt(((Matcher)localObject).group(13));
        i1 = i2;
        if ("-".equals(((Matcher)localObject).group(11))) {
          i1 = i2 * -1;
        }
      }
      GregorianCalendar localGregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
      localGregorianCalendar.clear();
      localGregorianCalendar.set(Integer.parseInt(((Matcher)localObject).group(1)), Integer.parseInt(((Matcher)localObject).group(2)) - 1, Integer.parseInt(((Matcher)localObject).group(3)), Integer.parseInt(((Matcher)localObject).group(4)), Integer.parseInt(((Matcher)localObject).group(5)), Integer.parseInt(((Matcher)localObject).group(6)));
      if (!TextUtils.isEmpty(((Matcher)localObject).group(8)))
      {
        paramString = new StringBuilder();
        paramString.append("0.");
        paramString.append(((Matcher)localObject).group(8));
        localGregorianCalendar.set(14, new BigDecimal(paramString.toString()).movePointRight(3).intValue());
      }
      long l1 = localGregorianCalendar.getTimeInMillis();
      long l2 = l1;
      if (i1 != 0) {
        l2 = l1 - i1 * 60000L;
      }
      return l2;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Invalid date/time format: ");
    ((StringBuilder)localObject).append(paramString);
    throw A.a(((StringBuilder)localObject).toString(), null);
  }
  
  public static String R(Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        paramContext = paramContext.getNetworkCountryIso();
        if (!TextUtils.isEmpty(paramContext)) {
          return c.f(paramContext);
        }
      }
    }
    return c.f(Locale.getDefault().getCountry());
  }
  
  public static long R0(String paramString)
  {
    Matcher localMatcher = i.matcher(paramString);
    if (localMatcher.matches())
    {
      boolean bool = TextUtils.isEmpty(localMatcher.group(1));
      paramString = localMatcher.group(3);
      double d1 = 0.0D;
      double d2;
      if (paramString != null) {
        d2 = Double.parseDouble(paramString) * 3.1556908E7D;
      } else {
        d2 = 0.0D;
      }
      paramString = localMatcher.group(5);
      double d3;
      if (paramString != null) {
        d3 = Double.parseDouble(paramString) * 2629739.0D;
      } else {
        d3 = 0.0D;
      }
      paramString = localMatcher.group(7);
      double d4;
      if (paramString != null) {
        d4 = Double.parseDouble(paramString) * 86400.0D;
      } else {
        d4 = 0.0D;
      }
      paramString = localMatcher.group(10);
      double d5;
      if (paramString != null) {
        d5 = Double.parseDouble(paramString) * 3600.0D;
      } else {
        d5 = 0.0D;
      }
      paramString = localMatcher.group(12);
      double d6;
      if (paramString != null) {
        d6 = Double.parseDouble(paramString) * 60.0D;
      } else {
        d6 = 0.0D;
      }
      paramString = localMatcher.group(14);
      if (paramString != null) {
        d1 = Double.parseDouble(paramString);
      }
      long l1 = ((d2 + d3 + d4 + d5 + d6 + d1) * 1000.0D);
      long l2 = l1;
      if ((true ^ bool)) {
        l2 = -l1;
      }
      return l2;
    }
    return (Double.parseDouble(paramString) * 3600.0D * 1000.0D);
  }
  
  public static Point S(Context paramContext)
  {
    Object localObject1 = (DisplayManager)paramContext.getSystemService("display");
    if (localObject1 != null) {
      localObject1 = ((DisplayManager)localObject1).getDisplay(0);
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = ((WindowManager)a.e((WindowManager)paramContext.getSystemService("window"))).getDefaultDisplay();
    }
    return T(paramContext, (Display)localObject2);
  }
  
  public static boolean S0(Handler paramHandler, Runnable paramRunnable)
  {
    if (!paramHandler.getLooper().getThread().isAlive()) {
      return false;
    }
    if (paramHandler.getLooper() == Looper.myLooper())
    {
      paramRunnable.run();
      return true;
    }
    return paramHandler.post(paramRunnable);
  }
  
  public static Point T(Context paramContext, Display paramDisplay)
  {
    String str;
    if ((paramDisplay.getDisplayId() == 0) && (E0(paramContext)))
    {
      if (a < 28) {}
      for (str = "sys.display-size";; str = "vendor.display-size")
      {
        str = o0(str);
        break;
      }
      if (TextUtils.isEmpty(str)) {}
    }
    try
    {
      localObject = b1(str.trim(), "x");
      if (localObject.length == 2)
      {
        int i1 = Integer.parseInt(localObject[0]);
        int i2 = Integer.parseInt(localObject[1]);
        if ((i1 > 0) && (i2 > 0))
        {
          localObject = new Point(i1, i2);
          return (Point)localObject;
        }
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Object localObject;
      for (;;) {}
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Invalid display size: ");
    ((StringBuilder)localObject).append(str);
    o.c("Util", ((StringBuilder)localObject).toString());
    if (("Sony".equals(c)) && (d.startsWith("BRAVIA")) && (paramContext.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd"))) {
      return new Point(3840, 2160);
    }
    paramContext = new Point();
    if (a >= 23) {
      V(paramDisplay, paramContext);
    } else {
      paramDisplay.getRealSize(paramContext);
    }
    return paramContext;
  }
  
  public static boolean T0(Parcel paramParcel)
  {
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static Looper U()
  {
    Looper localLooper = Looper.myLooper();
    if (localLooper == null) {
      localLooper = Looper.getMainLooper();
    }
    return localLooper;
  }
  
  public static void U0(List paramList, int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt2 <= paramList.size()) && (paramInt1 <= paramInt2))
    {
      if (paramInt1 != paramInt2) {
        paramList.subList(paramInt1, paramInt2).clear();
      }
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void V(Display paramDisplay, Point paramPoint)
  {
    paramDisplay = paramDisplay.getMode();
    x = paramDisplay.getPhysicalWidth();
    y = paramDisplay.getPhysicalHeight();
  }
  
  public static long V0(long paramLong, int paramInt)
  {
    return Y0(paramLong, 1000000L, paramInt, RoundingMode.FLOOR);
  }
  
  public static int W(int paramInt)
  {
    if ((paramInt != 2) && (paramInt != 4))
    {
      if (paramInt != 10)
      {
        if (paramInt == 7) {
          break label128;
        }
        if (paramInt == 8) {}
      }
      switch (paramInt)
      {
      default: 
        switch (paramInt)
        {
        default: 
          return 6006;
        }
        return 6002;
      case 15: 
        return 6003;
      case 17: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
        return 6004;
      }
    }
    label128:
    return 6005;
  }
  
  public static long W0(long paramLong1, long paramLong2, long paramLong3)
  {
    return Y0(paramLong1, paramLong2, paramLong3, RoundingMode.FLOOR);
  }
  
  public static int X(String paramString)
  {
    int i1 = 0;
    if (paramString == null) {
      return 0;
    }
    String[] arrayOfString = b1(paramString, "_");
    int i2 = arrayOfString.length;
    if (i2 < 2) {
      return 0;
    }
    paramString = arrayOfString[(i2 - 1)];
    if ((i2 >= 3) && ("neg".equals(arrayOfString[(i2 - 2)]))) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    try
    {
      int i3 = Integer.parseInt((String)a.e(paramString));
      i1 = i3;
      if (i2 != 0) {
        i1 = -i3;
      }
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return i1;
  }
  
  public static void X0(long[] paramArrayOfLong, long paramLong1, long paramLong2)
  {
    a1(paramArrayOfLong, paramLong1, paramLong2, RoundingMode.FLOOR);
  }
  
  public static String Y(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 4) {
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
  
  public static long Y0(long paramLong1, long paramLong2, long paramLong3, RoundingMode paramRoundingMode)
  {
    if ((paramLong1 != 0L) && (paramLong2 != 0L))
    {
      boolean bool = paramLong3 < paramLong2;
      if ((!bool) && (paramLong3 % paramLong2 == 0L)) {
        return Z2.e.b(paramLong1, Z2.e.b(paramLong3, paramLong2, RoundingMode.UNNECESSARY), paramRoundingMode);
      }
      if ((bool) && (paramLong2 % paramLong3 == 0L)) {
        return Z2.e.d(paramLong1, Z2.e.b(paramLong2, paramLong3, RoundingMode.UNNECESSARY));
      }
      bool = paramLong3 < paramLong1;
      if ((!bool) && (paramLong3 % paramLong1 == 0L)) {
        return Z2.e.b(paramLong2, Z2.e.b(paramLong3, paramLong1, RoundingMode.UNNECESSARY), paramRoundingMode);
      }
      if ((bool) && (paramLong1 % paramLong3 == 0L)) {
        return Z2.e.d(paramLong2, Z2.e.b(paramLong1, paramLong3, RoundingMode.UNNECESSARY));
      }
      return Z0(paramLong1, paramLong2, paramLong3, paramRoundingMode);
    }
    return 0L;
  }
  
  public static String Z(Locale paramLocale)
  {
    if (a >= 21) {
      paramLocale = a0(paramLocale);
    } else {
      paramLocale = paramLocale.toString();
    }
    return paramLocale;
  }
  
  public static long Z0(long paramLong1, long paramLong2, long paramLong3, RoundingMode paramRoundingMode)
  {
    long l1 = Z2.e.d(paramLong1, paramLong2);
    if ((l1 != Long.MAX_VALUE) && (l1 != Long.MIN_VALUE)) {
      return Z2.e.b(l1, paramLong3, paramRoundingMode);
    }
    l1 = Z2.e.c(Math.abs(paramLong2), Math.abs(paramLong3));
    RoundingMode localRoundingMode = RoundingMode.UNNECESSARY;
    paramLong2 = Z2.e.b(paramLong2, l1, localRoundingMode);
    l1 = Z2.e.b(paramLong3, l1, localRoundingMode);
    paramLong3 = Z2.e.c(Math.abs(paramLong1), Math.abs(l1));
    paramLong1 = Z2.e.b(paramLong1, paramLong3, localRoundingMode);
    paramLong3 = Z2.e.b(l1, paramLong3, localRoundingMode);
    l1 = Z2.e.d(paramLong1, paramLong2);
    if ((l1 != Long.MAX_VALUE) && (l1 != Long.MIN_VALUE)) {
      return Z2.e.b(l1, paramLong3, paramRoundingMode);
    }
    double d1 = paramLong2 / paramLong3;
    d1 = paramLong1 * d1;
    if (d1 > 9.223372036854776E18D) {
      return Long.MAX_VALUE;
    }
    if (d1 < -9.223372036854776E18D) {
      return Long.MIN_VALUE;
    }
    return b.c(d1, paramRoundingMode);
  }
  
  public static String a0(Locale paramLocale)
  {
    return paramLocale.toLanguageTag();
  }
  
  public static void a1(long[] paramArrayOfLong, long paramLong1, long paramLong2, RoundingMode paramRoundingMode)
  {
    if (paramLong1 == 0L)
    {
      Arrays.fill(paramArrayOfLong, 0L);
      return;
    }
    boolean bool = paramLong2 < paramLong1;
    int i1 = 0;
    int i2 = 0;
    if ((!bool) && (paramLong2 % paramLong1 == 0L)) {
      paramLong1 = Z2.e.b(paramLong2, paramLong1, RoundingMode.UNNECESSARY);
    }
    while (i2 < paramArrayOfLong.length)
    {
      paramArrayOfLong[i2] = Z2.e.b(paramArrayOfLong[i2], paramLong1, paramRoundingMode);
      i2++;
      continue;
      if ((bool) && (paramLong1 % paramLong2 == 0L))
      {
        paramLong1 = Z2.e.b(paramLong1, paramLong2, RoundingMode.UNNECESSARY);
        i2 = i1;
      }
      while (i2 < paramArrayOfLong.length)
      {
        paramArrayOfLong[i2] = Z2.e.d(paramArrayOfLong[i2], paramLong1);
        i2++;
        continue;
        for (i2 = 0; i2 < paramArrayOfLong.length; i2++)
        {
          long l1 = paramArrayOfLong[i2];
          if (l1 != 0L) {
            if ((paramLong2 >= l1) && (paramLong2 % l1 == 0L)) {
              paramArrayOfLong[i2] = Z2.e.b(paramLong1, Z2.e.b(paramLong2, l1, RoundingMode.UNNECESSARY), paramRoundingMode);
            } else if ((paramLong2 < l1) && (l1 % paramLong2 == 0L)) {
              paramArrayOfLong[i2] = Z2.e.d(paramLong1, Z2.e.b(l1, paramLong2, RoundingMode.UNNECESSARY));
            } else {
              paramArrayOfLong[i2] = Z0(l1, paramLong1, paramLong2, paramRoundingMode);
            }
          }
        }
      }
    }
  }
  
  public static long b(long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = paramLong1 + paramLong2;
    if (((paramLong1 ^ l1) & (paramLong2 ^ l1)) < 0L) {
      return paramLong3;
    }
    return l1;
  }
  
  public static int b0(Context paramContext)
  {
    if (B0(paramContext)) {
      return 1;
    }
    return 5;
  }
  
  public static String[] b1(String paramString1, String paramString2)
  {
    return paramString1.split(paramString2, -1);
  }
  
  public static boolean c(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null)
    {
      if (paramObject2 == null) {
        bool = true;
      } else {
        bool = false;
      }
    }
    else {
      bool = paramObject1.equals(paramObject2);
    }
    return bool;
  }
  
  public static long c0(long paramLong, float paramFloat)
  {
    if (paramFloat == 1.0F) {
      return paramLong;
    }
    return Math.round(paramLong * paramFloat);
  }
  
  public static String[] c1(String paramString1, String paramString2)
  {
    return paramString1.split(paramString2, 2);
  }
  
  public static int d(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int i2 = i1;
    if (i1 < 0)
    {
      i2 = i1;
    }
    else
    {
      for (;;)
      {
        i1 = i2 + 1;
        if ((i1 >= paramArrayOfLong.length) || (paramArrayOfLong[i1] != paramLong)) {
          break;
        }
        i2 = i1;
      }
      if (!paramBoolean1) {
        i2 = i1;
      }
    }
    i1 = i2;
    if (paramBoolean2) {
      i1 = Math.min(paramArrayOfLong.length - 1, i2);
    }
    return i1;
  }
  
  public static long d0(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      paramLong = System.currentTimeMillis();
    } else {
      paramLong += SystemClock.elapsedRealtime();
    }
    return paramLong;
  }
  
  public static String[] d1(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return new String[0];
    }
    return b1(paramString.trim(), "(\\s*,\\s*)");
  }
  
  public static int e(p paramp, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = paramp.c() - 1;
    int i2 = 0;
    int i3 = 0;
    while (i3 <= i1)
    {
      int i4 = i3 + i1 >>> 1;
      if (paramp.b(i4) < paramLong) {
        i3 = i4 + 1;
      } else {
        i1 = i4 - 1;
      }
    }
    if (paramBoolean1)
    {
      i3 = i1 + 1;
      if ((i3 < paramp.c()) && (paramp.b(i3) == paramLong))
      {
        i1 = i3;
        break label114;
      }
    }
    if ((paramBoolean2) && (i1 == -1)) {
      i1 = i2;
    }
    label114:
    return i1;
  }
  
  public static int e0(int paramInt)
  {
    if (paramInt != 8)
    {
      if (paramInt != 16)
      {
        if (paramInt != 24)
        {
          if (paramInt != 32) {
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
  
  public static long e1(long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = paramLong1 - paramLong2;
    if (((paramLong1 ^ l1) & (paramLong2 ^ paramLong1)) < 0L) {
      return paramLong3;
    }
    return l1;
  }
  
  public static int f(List paramList, Comparable paramComparable, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = Collections.binarySearch(paramList, paramComparable);
    int i2 = i1;
    if (i1 < 0)
    {
      i2 = -(i1 + 2);
    }
    else
    {
      for (;;)
      {
        i1 = i2 - 1;
        if ((i1 < 0) || (((Comparable)paramList.get(i1)).compareTo(paramComparable) != 0)) {
          break;
        }
        i2 = i1;
      }
      if (!paramBoolean1) {
        i2 = i1;
      }
    }
    i1 = i2;
    if (paramBoolean2) {
      i1 = Math.max(0, i2);
    }
    return i1;
  }
  
  public static q f0(int paramInt1, int paramInt2, int paramInt3)
  {
    return new q.b().o0("audio/raw").N(paramInt2).p0(paramInt3).i0(paramInt1).K();
  }
  
  public static String f1(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    for (int i1 = 0; i1 < paramArrayOfByte.length; i1++)
    {
      localStringBuilder.append(Character.forDigit(paramArrayOfByte[i1] >> 4 & 0xF, 16));
      localStringBuilder.append(Character.forDigit(paramArrayOfByte[i1] & 0xF, 16));
    }
    return localStringBuilder.toString();
  }
  
  public static int g(int[] paramArrayOfInt, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = Arrays.binarySearch(paramArrayOfInt, paramInt);
    int i2 = i1;
    if (i1 < 0)
    {
      paramInt = -(i1 + 2);
    }
    else
    {
      for (;;)
      {
        i1 = i2 - 1;
        if ((i1 < 0) || (paramArrayOfInt[i1] != paramInt)) {
          break;
        }
        i2 = i1;
      }
      if (paramBoolean1) {
        paramInt = i2;
      } else {
        paramInt = i1;
      }
    }
    i2 = paramInt;
    if (paramBoolean2) {
      i2 = Math.max(0, paramInt);
    }
    return i2;
  }
  
  public static int g0(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 2)
    {
      int i1 = paramInt2;
      if (paramInt1 != 3)
      {
        if (paramInt1 != 4)
        {
          if (paramInt1 != 21)
          {
            if (paramInt1 == 22) {
              break label65;
            }
            if (paramInt1 == 268435456) {
              break label71;
            }
            if (paramInt1 != 1342177280)
            {
              if (paramInt1 == 1610612736) {
                break label65;
              }
              throw new IllegalArgumentException();
            }
          }
          return paramInt2 * 3;
        }
        label65:
        i1 = paramInt2 * 4;
      }
      else
      {
        return i1;
      }
    }
    label71:
    return paramInt2 * 2;
  }
  
  public static long g1(int paramInt1, int paramInt2)
  {
    long l1 = h1(paramInt1);
    return h1(paramInt2) | l1 << 32;
  }
  
  public static int h(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int i2 = i1;
    if (i1 < 0)
    {
      i2 = -(i1 + 2);
    }
    else
    {
      for (;;)
      {
        i1 = i2 - 1;
        if ((i1 < 0) || (paramArrayOfLong[i1] != paramLong)) {
          break;
        }
        i2 = i1;
      }
      if (!paramBoolean1) {
        i2 = i1;
      }
    }
    i1 = i2;
    if (paramBoolean2) {
      i1 = Math.max(0, i2);
    }
    return i1;
  }
  
  public static long h0(long paramLong, float paramFloat)
  {
    if (paramFloat == 1.0F) {
      return paramLong;
    }
    return Math.round(paramLong / paramFloat);
  }
  
  public static long h1(int paramInt)
  {
    return paramInt & 0xFFFFFFFF;
  }
  
  public static Object i(Object paramObject)
  {
    return paramObject;
  }
  
  public static List i0(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramInt & 0x1) != 0) {
      localArrayList.add("main");
    }
    if ((paramInt & 0x2) != 0) {
      localArrayList.add("alt");
    }
    if ((paramInt & 0x4) != 0) {
      localArrayList.add("supplementary");
    }
    if ((paramInt & 0x8) != 0) {
      localArrayList.add("commentary");
    }
    if ((paramInt & 0x10) != 0) {
      localArrayList.add("dub");
    }
    if ((paramInt & 0x20) != 0) {
      localArrayList.add("emergency");
    }
    if ((paramInt & 0x40) != 0) {
      localArrayList.add("caption");
    }
    if ((paramInt & 0x80) != 0) {
      localArrayList.add("subtitle");
    }
    if ((paramInt & 0x100) != 0) {
      localArrayList.add("sign");
    }
    if ((paramInt & 0x200) != 0) {
      localArrayList.add("describes-video");
    }
    if ((paramInt & 0x400) != 0) {
      localArrayList.add("describes-music");
    }
    if ((paramInt & 0x800) != 0) {
      localArrayList.add("enhanced-intelligibility");
    }
    if ((paramInt & 0x1000) != 0) {
      localArrayList.add("transcribes-dialog");
    }
    if ((paramInt & 0x2000) != 0) {
      localArrayList.add("easy-read");
    }
    if ((paramInt & 0x4000) != 0) {
      localArrayList.add("trick-play");
    }
    return localArrayList;
  }
  
  public static long i1(long paramLong)
  {
    long l1 = paramLong;
    if (paramLong != -9223372036854775807L) {
      if (paramLong == Long.MIN_VALUE) {
        l1 = paramLong;
      } else {
        l1 = paramLong / 1000L;
      }
    }
    return l1;
  }
  
  public static Object[] j(Object[] paramArrayOfObject)
  {
    return paramArrayOfObject;
  }
  
  public static List j0(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramInt & 0x4) != 0) {
      localArrayList.add("auto");
    }
    if ((paramInt & 0x1) != 0) {
      localArrayList.add("default");
    }
    if ((paramInt & 0x2) != 0) {
      localArrayList.add("forced");
    }
    return localArrayList;
  }
  
  public static void j1(Parcel paramParcel, boolean paramBoolean)
  {
    paramParcel.writeInt(paramBoolean);
  }
  
  public static int k(int paramInt1, int paramInt2)
  {
    return (paramInt1 + paramInt2 - 1) / paramInt2;
  }
  
  public static int k0(int paramInt)
  {
    if (paramInt != 13)
    {
      switch (paramInt)
      {
      default: 
        return 3;
      case 6: 
        return 2;
      case 5: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
        return 5;
      case 4: 
        return 4;
      case 3: 
        return 8;
      }
      return 0;
    }
    return 1;
  }
  
  public static long l(long paramLong1, long paramLong2)
  {
    return (paramLong1 + paramLong2 - 1L) / paramLong2;
  }
  
  public static String[] l0()
  {
    String[] arrayOfString = m0();
    for (int i1 = 0; i1 < arrayOfString.length; i1++) {
      arrayOfString[i1] = L0(arrayOfString[i1]);
    }
    return arrayOfString;
  }
  
  public static void m(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;) {}
    }
  }
  
  public static String[] m0()
  {
    Object localObject = Resources.getSystem().getConfiguration();
    if (a >= 24) {
      localObject = n0((Configuration)localObject);
    } else {
      localObject = new String[] { Z(locale) };
    }
    return (String[])localObject;
  }
  
  public static int n(long paramLong1, long paramLong2)
  {
    boolean bool = paramLong1 < paramLong2;
    int i1;
    if (bool) {
      i1 = -1;
    } else if (i1 == 0) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    return i1;
  }
  
  public static String[] n0(Configuration paramConfiguration)
  {
    return b1(K.a(J.a(paramConfiguration)), ",");
  }
  
  public static float o(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.max(paramFloat2, Math.min(paramFloat1, paramFloat3));
  }
  
  public static String o0(String paramString)
  {
    try
    {
      localObject = Class.forName("android.os.SystemProperties");
      localObject = (String)((Class)localObject).getMethod("get", new Class[] { String.class }).invoke(localObject, new Object[] { paramString });
      return (String)localObject;
    }
    catch (Exception localException)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to read system property ");
      ((StringBuilder)localObject).append(paramString);
      o.d("Util", ((StringBuilder)localObject).toString(), localException);
    }
    return null;
  }
  
  public static int p(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.max(paramInt2, Math.min(paramInt1, paramInt3));
  }
  
  public static String p0(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      Object localObject;
      if (paramInt >= 10000)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("custom (");
        ((StringBuilder)localObject).append(paramInt);
        ((StringBuilder)localObject).append(")");
        localObject = ((StringBuilder)localObject).toString();
      }
      else
      {
        localObject = "?";
      }
      return (String)localObject;
    case 6: 
      return "camera motion";
    case 5: 
      return "metadata";
    case 4: 
      return "image";
    case 3: 
      return "text";
    case 2: 
      return "video";
    case 1: 
      return "audio";
    case 0: 
      return "default";
    case -1: 
      return "unknown";
    }
    return "none";
  }
  
  public static long q(long paramLong1, long paramLong2, long paramLong3)
  {
    return Math.max(paramLong2, Math.min(paramLong1, paramLong3));
  }
  
  public static String q0(Context paramContext, String paramString)
  {
    try
    {
      localObject = paramContext.getPackageName();
      paramContext = getPackageManagergetPackageInfo0versionName;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = "?";
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("/");
    ((StringBuilder)localObject).append(paramContext);
    ((StringBuilder)localObject).append(" (Linux;Android ");
    ((StringBuilder)localObject).append(Build.VERSION.RELEASE);
    ((StringBuilder)localObject).append(") ");
    ((StringBuilder)localObject).append("AndroidXMedia3/1.4.1");
    return ((StringBuilder)localObject).toString();
  }
  
  public static boolean r(SparseArray paramSparseArray, int paramInt)
  {
    boolean bool;
    if (paramSparseArray.indexOfKey(paramInt) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static byte[] r0(String paramString)
  {
    return paramString.getBytes(W2.e.c);
  }
  
  public static boolean s(Object[] paramArrayOfObject, Object paramObject)
  {
    int i1 = paramArrayOfObject.length;
    for (int i2 = 0; i2 < i1; i2++) {
      if (c(paramArrayOfObject[i2], paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public static int s0(Uri paramUri)
  {
    String str = paramUri.getScheme();
    if ((str != null) && (c.a("rtsp", str))) {
      return 3;
    }
    str = paramUri.getLastPathSegment();
    if (str == null) {
      return 4;
    }
    int i1 = str.lastIndexOf('.');
    if (i1 >= 0)
    {
      i1 = t0(str.substring(i1 + 1));
      if (i1 != 4) {
        return i1;
      }
    }
    paramUri = k.matcher((CharSequence)a.e(paramUri.getPath()));
    if (paramUri.matches())
    {
      paramUri = paramUri.group(2);
      if (paramUri != null)
      {
        if (paramUri.contains("format=mpd-time-csf")) {
          return 0;
        }
        if (paramUri.contains("format=m3u8-aapl")) {
          return 2;
        }
      }
      return 1;
    }
    return 4;
  }
  
  public static boolean t(SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    boolean bool = true;
    if (paramSparseArray1 == null)
    {
      if (paramSparseArray2 != null) {
        bool = false;
      }
      return bool;
    }
    if (paramSparseArray2 == null) {
      return false;
    }
    if (a >= 31) {
      return I.a(paramSparseArray1, paramSparseArray2);
    }
    int i1 = paramSparseArray1.size();
    if (i1 != paramSparseArray2.size()) {
      return false;
    }
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = paramSparseArray1.keyAt(i2);
      if (!Objects.equals(paramSparseArray1.valueAt(i2), paramSparseArray2.get(i3))) {
        return false;
      }
    }
    return true;
  }
  
  public static int t0(String paramString)
  {
    paramString = c.e(paramString);
    paramString.hashCode();
    int i1 = paramString.hashCode();
    int i2 = -1;
    switch (i1)
    {
    default: 
      break;
    case 3299913: 
      if (paramString.equals("m3u8")) {
        i2 = 3;
      }
      break;
    case 3242057: 
      if (paramString.equals("isml")) {
        i2 = 2;
      }
      break;
    case 108321: 
      if (paramString.equals("mpd")) {
        i2 = 1;
      }
      break;
    case 104579: 
      if (paramString.equals("ism")) {
        i2 = 0;
      }
      break;
    }
    switch (i2)
    {
    default: 
      return 4;
    case 3: 
      return 2;
    case 1: 
      return 0;
    }
    return 1;
  }
  
  public static int u(SparseArray paramSparseArray)
  {
    if (a >= 31) {
      return H.a(paramSparseArray);
    }
    int i1 = 17;
    for (int i2 = 0; i2 < paramSparseArray.size(); i2++) {
      i1 = (i1 * 31 + paramSparseArray.keyAt(i2)) * 31 + Objects.hashCode(paramSparseArray.valueAt(i2));
    }
    return i1;
  }
  
  public static int u0(Uri paramUri, String paramString)
  {
    if (paramString == null) {
      return s0(paramUri);
    }
    int i1 = paramString.hashCode();
    int i2 = -1;
    switch (i1)
    {
    default: 
      break;
    case 1154777587: 
      if (paramString.equals("application/x-rtsp")) {
        i2 = 3;
      }
      break;
    case 64194685: 
      if (paramString.equals("application/dash+xml")) {
        i2 = 2;
      }
      break;
    case -156749520: 
      if (paramString.equals("application/vnd.ms-sstr+xml")) {
        i2 = 1;
      }
      break;
    case -979127466: 
      if (paramString.equals("application/x-mpegURL")) {
        i2 = 0;
      }
      break;
    }
    switch (i2)
    {
    default: 
      return 4;
    case 3: 
      return 3;
    case 2: 
      return 0;
    case 1: 
      return 1;
    }
    return 2;
  }
  
  public static int v(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    while (paramInt1 < paramInt2)
    {
      int i1 = i.b(paramArrayOfByte[paramInt1]);
      paramInt3 = w(i1 & 0xF, w(i1 >> 4, paramInt3));
      paramInt1++;
    }
    return paramInt3;
  }
  
  /* Error */
  public static boolean v0(z paramz1, z paramz2, java.util.zip.Inflater paramInflater)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 1657	g0/z:a	()I
    //   4: ifgt +5 -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_1
    //   10: invokevirtual 1659	g0/z:b	()I
    //   13: aload_0
    //   14: invokevirtual 1657	g0/z:a	()I
    //   17: if_icmpge +13 -> 30
    //   20: aload_1
    //   21: aload_0
    //   22: invokevirtual 1657	g0/z:a	()I
    //   25: iconst_2
    //   26: imul
    //   27: invokevirtual 1661	g0/z:c	(I)V
    //   30: aload_2
    //   31: astore_3
    //   32: aload_2
    //   33: ifnonnull +11 -> 44
    //   36: new 1663	java/util/zip/Inflater
    //   39: dup
    //   40: invokespecial 1664	java/util/zip/Inflater:<init>	()V
    //   43: astore_3
    //   44: aload_3
    //   45: aload_0
    //   46: invokevirtual 1667	g0/z:e	()[B
    //   49: aload_0
    //   50: invokevirtual 1669	g0/z:f	()I
    //   53: aload_0
    //   54: invokevirtual 1657	g0/z:a	()I
    //   57: invokevirtual 1673	java/util/zip/Inflater:setInput	([BII)V
    //   60: iconst_0
    //   61: istore 4
    //   63: iload 4
    //   65: aload_3
    //   66: aload_1
    //   67: invokevirtual 1667	g0/z:e	()[B
    //   70: iload 4
    //   72: aload_1
    //   73: invokevirtual 1659	g0/z:b	()I
    //   76: iload 4
    //   78: isub
    //   79: invokevirtual 1677	java/util/zip/Inflater:inflate	([BII)I
    //   82: iadd
    //   83: istore 5
    //   85: aload_3
    //   86: invokevirtual 1680	java/util/zip/Inflater:finished	()Z
    //   89: ifeq +19 -> 108
    //   92: aload_1
    //   93: iload 5
    //   95: invokevirtual 1682	g0/z:S	(I)V
    //   98: aload_3
    //   99: invokevirtual 1685	java/util/zip/Inflater:reset	()V
    //   102: iconst_1
    //   103: ireturn
    //   104: astore_0
    //   105: goto +56 -> 161
    //   108: aload_3
    //   109: invokevirtual 1688	java/util/zip/Inflater:needsDictionary	()Z
    //   112: ifne +43 -> 155
    //   115: aload_3
    //   116: invokevirtual 1691	java/util/zip/Inflater:needsInput	()Z
    //   119: ifeq +6 -> 125
    //   122: goto +33 -> 155
    //   125: iload 5
    //   127: istore 4
    //   129: iload 5
    //   131: aload_1
    //   132: invokevirtual 1659	g0/z:b	()I
    //   135: if_icmpne -72 -> 63
    //   138: aload_1
    //   139: aload_1
    //   140: invokevirtual 1659	g0/z:b	()I
    //   143: iconst_2
    //   144: imul
    //   145: invokevirtual 1661	g0/z:c	(I)V
    //   148: iload 5
    //   150: istore 4
    //   152: goto -89 -> 63
    //   155: aload_3
    //   156: invokevirtual 1685	java/util/zip/Inflater:reset	()V
    //   159: iconst_0
    //   160: ireturn
    //   161: aload_3
    //   162: invokevirtual 1685	java/util/zip/Inflater:reset	()V
    //   165: aload_0
    //   166: athrow
    //   167: astore_0
    //   168: aload_3
    //   169: invokevirtual 1685	java/util/zip/Inflater:reset	()V
    //   172: iconst_0
    //   173: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	paramz1	z
    //   0	174	1	paramz2	z
    //   0	174	2	paramInflater	java.util.zip.Inflater
    //   31	138	3	localInflater	java.util.zip.Inflater
    //   61	90	4	i1	int
    //   83	66	5	i2	int
    // Exception table:
    //   from	to	target	type
    //   63	98	104	finally
    //   108	122	104	finally
    //   129	148	104	finally
    //   63	98	167	java/util/zip/DataFormatException
    //   108	122	167	java/util/zip/DataFormatException
    //   129	148	167	java/util/zip/DataFormatException
  }
  
  public static int w(int paramInt1, int paramInt2)
  {
    return (p[((paramInt1 ^ paramInt2 >> 12 & 0xFF) & 0xFF)] ^ paramInt2 << 4 & 0xFFFF) & 0xFFFF;
  }
  
  public static String w0(int paramInt)
  {
    return Integer.toString(paramInt, 36);
  }
  
  public static int x(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    while (paramInt1 < paramInt2)
    {
      paramInt3 = o[((paramInt3 >>> 24 ^ paramArrayOfByte[paramInt1] & 0xFF) & 0xFF)] ^ paramInt3 << 8;
      paramInt1++;
    }
    return paramInt3;
  }
  
  public static boolean x0(Context paramContext)
  {
    boolean bool;
    if ((a >= 23) && (paramContext.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static int y(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    while (paramInt1 < paramInt2)
    {
      paramInt3 = q[(paramInt3 ^ paramArrayOfByte[paramInt1] & 0xFF)];
      paramInt1++;
    }
    return paramInt3;
  }
  
  public static boolean y0(String paramString)
  {
    paramString.hashCode();
    int i1 = paramString.hashCode();
    boolean bool1 = true;
    boolean bool2 = true;
    int i2 = -1;
    switch (i1)
    {
    default: 
      break;
    case -879258763: 
      if (paramString.equals("image/png")) {
        i2 = 6;
      }
      break;
    case -879272239: 
      if (paramString.equals("image/bmp")) {
        i2 = 5;
      }
      break;
    case -1487018032: 
      if (paramString.equals("image/webp")) {
        i2 = 4;
      }
      break;
    case -1487394660: 
      if (paramString.equals("image/jpeg")) {
        i2 = 3;
      }
      break;
    case -1487464690: 
      if (paramString.equals("image/heif")) {
        i2 = 2;
      }
      break;
    case -1487464693: 
      if (paramString.equals("image/heic")) {
        i2 = 1;
      }
      break;
    case -1487656890: 
      if (paramString.equals("image/avif")) {
        i2 = 0;
      }
      break;
    }
    switch (i2)
    {
    default: 
      return false;
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      return true;
    case 1: 
    case 2: 
      if (a < 26) {
        bool2 = false;
      }
      return bool2;
    }
    if (a >= 34) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public static Handler z(Looper paramLooper, Handler.Callback paramCallback)
  {
    return new Handler(paramLooper, paramCallback);
  }
  
  public static boolean z0(int paramInt)
  {
    boolean bool;
    if ((paramInt != 21) && (paramInt != 1342177280) && (paramInt != 22) && (paramInt != 1610612736) && (paramInt != 4)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     g0.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */