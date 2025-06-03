package com.google.ads.interactivemedia.v3.internal;

import a;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public final class wl
{
  public static final int a;
  public static final String b;
  public static final String c;
  public static final String d;
  public static final String e;
  public static final byte[] f;
  private static final Pattern g;
  private static final Pattern h;
  private static HashMap<String, String> i;
  private static final String[] j = { "alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "slo", "sk", "wel", "cy" };
  private static final int[] k = { 0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108 };
  
  static
  {
    int m = Build.VERSION.SDK_INT;
    a = m;
    Object localObject = Build.DEVICE;
    b = (String)localObject;
    String str1 = Build.MANUFACTURER;
    c = str1;
    String str2 = Build.MODEL;
    d = str2;
    localObject = a.q(a.b(str1, a.b(str2, a.b((String)localObject, 17))), (String)localObject, ", ", str2, ", ");
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(m);
    e = ((StringBuilder)localObject).toString();
    f = new byte[0];
    g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    Pattern.compile("%([A-Fa-f0-9]{2})");
  }
  
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.max(0.1F, Math.min(paramFloat1, 8.0F));
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    return (paramInt1 + paramInt2 - 1) / paramInt2;
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.max(paramInt2, Math.min(paramInt1, paramInt3));
  }
  
  public static int a(Context paramContext)
  {
    int m = 0;
    if (paramContext == null) {
      return 0;
    }
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null) {
      return 0;
    }
    try
    {
      paramContext = paramContext.getActiveNetworkInfo();
      int n = 1;
      m = n;
      if (paramContext != null) {
        if (!paramContext.isConnected())
        {
          m = n;
        }
        else
        {
          m = paramContext.getType();
          if (m != 0) {
            if (m != 1)
            {
              if ((m != 4) && (m != 5))
              {
                if (m != 6)
                {
                  if (m != 9) {
                    return 8;
                  }
                  return 7;
                }
                return 5;
              }
            }
            else {
              return 2;
            }
          }
          switch (paramContext.getSubtype())
          {
          case 16: 
          default: 
            return 6;
          case 18: 
            return 2;
          case 13: 
            return 5;
          case 3: 
          case 4: 
          case 5: 
          case 6: 
          case 7: 
          case 8: 
          case 9: 
          case 10: 
          case 11: 
          case 12: 
          case 14: 
          case 15: 
          case 17: 
            return 4;
          }
          return 3;
        }
      }
    }
    catch (SecurityException paramContext)
    {
      for (;;) {}
    }
    return m;
  }
  
  public static <T extends Comparable<? super T>> int a(List<? extends Comparable<? super T>> paramList, T paramT, boolean paramBoolean1, boolean paramBoolean2)
  {
    int m = Collections.binarySearch(paramList, paramT);
    int n = m;
    if (m < 0)
    {
      n = -(m + 2);
    }
    else
    {
      do
      {
        m = n - 1;
        if (m < 0) {
          break;
        }
        n = m;
      } while (((Comparable)paramList.get(m)).compareTo(paramT) == 0);
      n = m + 1;
    }
    m = n;
    if (paramBoolean2) {
      m = Math.max(0, n);
    }
    return m;
  }
  
  public static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      paramInt3 = k[((paramInt3 >>> 24 ^ paramArrayOfByte[paramInt1] & 0xFF) & 0xFF)] ^ paramInt3 << 8;
    }
    return paramInt3;
  }
  
  public static int a(int[] paramArrayOfInt, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int m = Arrays.binarySearch(paramArrayOfInt, paramInt);
    int n = m;
    if (m < 0) {
      m = -(m + 2);
    } else {
      do
      {
        m = n - 1;
        if (m < 0) {
          break;
        }
        n = m;
      } while (paramArrayOfInt[m] == paramInt);
    }
    return m;
  }
  
  public static int a(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int m = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int n = m;
    if (m < 0)
    {
      n = -(m + 2);
    }
    else
    {
      do
      {
        m = n - 1;
        if (m < 0) {
          break;
        }
        n = m;
      } while (paramArrayOfLong[m] == paramLong);
      n = m + 1;
    }
    m = n;
    if (paramBoolean2) {
      m = Math.max(0, n);
    }
    return m;
  }
  
  public static long a(long paramLong, float paramFloat)
  {
    if (paramFloat == 1.0F) {
      return paramLong;
    }
    return Math.round(paramLong * paramFloat);
  }
  
  public static long a(long paramLong1, long paramLong2)
  {
    return (paramLong1 + paramLong2 - 1L) / paramLong2;
  }
  
  public static long a(long paramLong1, long paramLong2, long paramLong3)
  {
    return Math.max(paramLong2, Math.min(paramLong1, paramLong3));
  }
  
  public static long a(long paramLong1, cn paramcn, long paramLong2, long paramLong3)
  {
    if (cn.a.equals(paramcn)) {
      return paramLong1;
    }
    long l1 = c;
    long l2 = paramLong1 - l1;
    long l3 = l2;
    if (((l1 ^ paramLong1) & (paramLong1 ^ l2)) < 0L) {
      l3 = Long.MIN_VALUE;
    }
    l2 = b(paramLong1, d, Long.MAX_VALUE);
    int m = 1;
    int n;
    if ((l3 <= paramLong2) && (paramLong2 <= l2)) {
      n = 1;
    } else {
      n = 0;
    }
    if ((l3 > paramLong3) || (paramLong3 > l2)) {
      m = 0;
    }
    if ((n != 0) && (m != 0))
    {
      if (Math.abs(paramLong2 - paramLong1) <= Math.abs(paramLong3 - paramLong1)) {
        return paramLong2;
      }
      return paramLong3;
    }
    if (n != 0) {
      return paramLong2;
    }
    if (m != 0) {
      return paramLong3;
    }
    return l3;
  }
  
  public static Handler a(Looper paramLooper, Handler.Callback paramCallback)
  {
    return new Handler(paramLooper, paramCallback);
  }
  
  public static Looper a()
  {
    Looper localLooper = Looper.myLooper();
    if (localLooper != null) {
      return localLooper;
    }
    return Looper.getMainLooper();
  }
  
  public static <T> T a(T paramT)
  {
    return paramT;
  }
  
  public static String a(Context paramContext, String paramString)
  {
    try
    {
      str = paramContext.getPackageName();
      paramContext = getPackageManagergetPackageInfo0versionName;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = "?";
    }
    String str = Build.VERSION.RELEASE;
    return z2.s(a.q(a.b(str, a.b(paramContext, a.b(paramString, 38))), paramString, "/", paramContext, " (Linux;Android "), str, ") ExoPlayerLib/2.10.4");
  }
  
  public static String a(String paramString, int paramInt)
  {
    String[] arrayOfString = i(paramString);
    if (arrayOfString.length == 0) {
      return null;
    }
    paramString = new StringBuilder();
    int m = arrayOfString.length;
    for (int n = 0; n < m; n++)
    {
      String str = arrayOfString[n];
      if (paramInt == vs.i(str))
      {
        if (paramString.length() > 0) {
          paramString.append(",");
        }
        paramString.append(str);
      }
    }
    if (paramString.length() > 0) {
      return paramString.toString();
    }
    return null;
  }
  
  public static String a(String paramString, Object... paramVarArgs)
  {
    return String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, Charset.forName("UTF-8"));
  }
  
  public static String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new String(paramArrayOfByte, paramInt1, paramInt2, Charset.forName("UTF-8"));
  }
  
  public static ExecutorService a(String paramString)
  {
    return Executors.newSingleThreadExecutor(new wk(paramString));
  }
  
  public static void a(Parcel paramParcel, boolean paramBoolean)
  {
    paramParcel.writeInt(paramBoolean);
  }
  
  public static void a(tt paramtt)
  {
    if (paramtt != null) {}
    try
    {
      paramtt.c();
      return;
    }
    catch (IOException paramtt)
    {
      for (;;) {}
    }
  }
  
  public static void a(Closeable paramCloseable)
  {
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
  
  public static <T> void a(List<T> paramList, int paramInt1, int paramInt2)
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
  
  public static void a(long[] paramArrayOfLong, long paramLong1, long paramLong2)
  {
    boolean bool = paramLong2 < 1000000L;
    int m = 0;
    int n = 0;
    int i1 = 0;
    if ((!bool) && (paramLong2 % 1000000L == 0L))
    {
      paramLong1 = paramLong2 / 1000000L;
      while (i1 < paramArrayOfLong.length)
      {
        paramArrayOfLong[i1] /= paramLong1;
        i1++;
      }
      return;
    }
    if ((bool) && (1000000L % paramLong2 == 0L))
    {
      paramLong1 = 1000000L / paramLong2;
      for (i1 = m; i1 < paramArrayOfLong.length; i1++) {
        paramArrayOfLong[i1] *= paramLong1;
      }
      return;
    }
    double d1 = 1000000.0D / paramLong2;
    for (i1 = n; i1 < paramArrayOfLong.length; i1++) {
      paramArrayOfLong[i1] = ((paramArrayOfLong[i1] * d1));
    }
  }
  
  public static boolean a(int paramInt)
  {
    return (paramInt == 10) || (paramInt == 13);
  }
  
  public static boolean a(Uri paramUri)
  {
    paramUri = paramUri.getScheme();
    return (TextUtils.isEmpty(paramUri)) || ("file".equals(paramUri));
  }
  
  public static boolean a(Parcel paramParcel)
  {
    return paramParcel.readInt() != 0;
  }
  
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
  }
  
  public static boolean a(Object[] paramArrayOfObject, Object paramObject)
  {
    int m = paramArrayOfObject.length;
    for (int n = 0; n < m; n++) {
      if (a(paramArrayOfObject[n], paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public static int[] a(List<Integer> paramList)
  {
    if (paramList == null) {
      return null;
    }
    int m = paramList.size();
    int[] arrayOfInt = new int[m];
    for (int n = 0; n < m; n++) {
      arrayOfInt[n] = ((Integer)paramList.get(n)).intValue();
    }
    return arrayOfInt;
  }
  
  public static <T> T[] a(T[] paramArrayOfT)
  {
    return paramArrayOfT;
  }
  
  public static <T> T[] a(T[] paramArrayOfT, int paramInt)
  {
    boolean bool;
    if (paramInt <= paramArrayOfT.length) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    return Arrays.copyOf(paramArrayOfT, paramInt);
  }
  
  public static <T> T[] a(T[] paramArrayOfT1, T[] paramArrayOfT2)
  {
    Object[] arrayOfObject = Arrays.copyOf(paramArrayOfT1, paramArrayOfT1.length + paramArrayOfT2.length);
    System.arraycopy(paramArrayOfT2, 0, arrayOfObject, paramArrayOfT1.length, paramArrayOfT2.length);
    return arrayOfObject;
  }
  
  public static String[] a(String paramString1, String paramString2)
  {
    return paramString1.split(paramString2, -1);
  }
  
  public static int b(int paramInt)
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
          return 1073741824;
        }
        return Integer.MIN_VALUE;
      }
      return 2;
    }
    return 3;
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    if (paramInt1 != Integer.MIN_VALUE)
    {
      if (paramInt1 != 1073741824) {
        if (paramInt1 != 2)
        {
          if (paramInt1 != 3)
          {
            if (paramInt1 != 4) {
              throw new IllegalArgumentException();
            }
          }
          else {
            return paramInt2;
          }
        }
        else {
          return paramInt2 << 1;
        }
      }
      return paramInt2 << 2;
    }
    return paramInt2 * 3;
  }
  
  public static int b(long paramLong1, long paramLong2)
  {
    boolean bool = paramLong1 < paramLong2;
    if (bool) {
      return -1;
    }
    if (!bool) {
      return 0;
    }
    return 1;
  }
  
  public static int b(Uri paramUri)
  {
    paramUri = paramUri.getPath();
    if (paramUri != null)
    {
      paramUri = d(paramUri);
      if (paramUri.endsWith(".mpd")) {
        return 0;
      }
      if (paramUri.endsWith(".m3u8")) {
        return 2;
      }
      if (paramUri.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?")) {
        return 1;
      }
    }
    return 3;
  }
  
  public static int b(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int m = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int n = m;
    if (m < 0)
    {
      n = m;
    }
    else
    {
      do
      {
        m = n + 1;
        if (m >= paramArrayOfLong.length) {
          break;
        }
        n = m;
      } while (paramArrayOfLong[m] == paramLong);
      if (paramBoolean1) {
        n = m - 1;
      } else {
        n = m;
      }
    }
    if (paramBoolean2) {
      return Math.min(paramArrayOfLong.length - 1, n);
    }
    return n;
  }
  
  public static long b(long paramLong, float paramFloat)
  {
    if (paramFloat == 1.0F) {
      return paramLong;
    }
    return Math.round(paramLong / paramFloat);
  }
  
  public static long b(long paramLong1, long paramLong2, long paramLong3)
  {
    paramLong3 = paramLong1 + paramLong2;
    if (((paramLong1 ^ paramLong3) & (paramLong2 ^ paramLong3)) < 0L) {
      return Long.MAX_VALUE;
    }
    return paramLong3;
  }
  
  public static String b(Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        paramContext = paramContext.getNetworkCountryIso();
        if (!TextUtils.isEmpty(paramContext)) {
          return e(paramContext);
        }
      }
    }
    return e(Locale.getDefault().getCountry());
  }
  
  public static String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    Object localObject1 = paramString.replace('_', '-');
    Object localObject2 = localObject1;
    if (a >= 21) {
      localObject2 = Locale.forLanguageTag((String)localObject1).toLanguageTag();
    }
    localObject1 = paramString;
    if (!((String)localObject2).isEmpty()) {
      if ("und".equals(localObject2)) {
        localObject1 = paramString;
      } else {
        localObject1 = localObject2;
      }
    }
    localObject2 = d((String)localObject1);
    localObject1 = localObject2.split("-", 2)[0];
    paramString = (String)localObject2;
    if (((String)localObject1).length() == 3)
    {
      if (i == null) {
        i = c();
      }
      localObject1 = (String)i.get(localObject1);
      paramString = (String)localObject2;
      if (localObject1 != null)
      {
        paramString = String.valueOf(((String)localObject2).substring(3));
        if (paramString.length() != 0) {
          paramString = ((String)localObject1).concat(paramString);
        } else {
          paramString = new String((String)localObject1);
        }
      }
    }
    return paramString;
  }
  
  public static String b(Object[] paramArrayOfObject)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int m = 0; m < paramArrayOfObject.length; m++)
    {
      localStringBuilder.append(paramArrayOfObject[m].getClass().getSimpleName());
      if (m < paramArrayOfObject.length - 1) {
        localStringBuilder.append(", ");
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String[] b()
  {
    Configuration localConfiguration = Resources.getSystem().getConfiguration();
    int m = a;
    int n = 0;
    String[] arrayOfString;
    if (m >= 24)
    {
      arrayOfString = localConfiguration.getLocales().toLanguageTags().split(",", -1);
    }
    else if (m >= 21)
    {
      arrayOfString = new String[1];
      arrayOfString[0] = locale.toLanguageTag();
    }
    else
    {
      arrayOfString = new String[1];
      arrayOfString[0] = locale.toString();
    }
    while (n < arrayOfString.length)
    {
      arrayOfString[n] = b(arrayOfString[n]);
      n++;
    }
    return arrayOfString;
  }
  
  public static String[] b(String paramString1, String paramString2)
  {
    return paramString1.split(paramString2, 2);
  }
  
  public static long c(long paramLong1, long paramLong2, long paramLong3)
  {
    boolean bool = paramLong3 < paramLong2;
    if ((!bool) && (paramLong3 % paramLong2 == 0L)) {
      return paramLong1 / (paramLong3 / paramLong2);
    }
    if ((bool) && (paramLong2 % paramLong3 == 0L)) {
      return paramLong2 / paramLong3 * paramLong1;
    }
    double d1 = paramLong2 / paramLong3;
    return (paramLong1 * d1);
  }
  
  private static HashMap<String, String> c()
  {
    String[] arrayOfString = Locale.getISOLanguages();
    HashMap localHashMap = new HashMap(arrayOfString.length + j.length);
    int m = arrayOfString.length;
    int n = 0;
    int i1 = 0;
    for (;;)
    {
      int i2 = n;
      String str;
      if (i1 < m) {
        str = arrayOfString[i1];
      }
      try
      {
        Object localObject = new java/util/Locale;
        ((Locale)localObject).<init>(str);
        localObject = ((Locale)localObject).getISO3Language();
        if (!TextUtils.isEmpty((CharSequence)localObject)) {
          localHashMap.put(localObject, str);
        }
        i1++;
        continue;
        for (;;)
        {
          arrayOfString = j;
          if (i2 >= arrayOfString.length) {
            break;
          }
          localHashMap.put(arrayOfString[i2], arrayOfString[(i2 + 1)]);
          i2 += 2;
        }
        return localHashMap;
      }
      catch (MissingResourceException localMissingResourceException)
      {
        for (;;) {}
      }
    }
  }
  
  public static boolean c(int paramInt)
  {
    return (paramInt == 3) || (paramInt == 2) || (paramInt == Integer.MIN_VALUE) || (paramInt == 1073741824) || (paramInt == 4);
  }
  
  public static boolean c(Context paramContext)
  {
    paramContext = (UiModeManager)paramContext.getApplicationContext().getSystemService("uimode");
    return (paramContext != null) && (paramContext.getCurrentModeType() == 4);
  }
  
  public static byte[] c(String paramString)
  {
    return paramString.getBytes(Charset.forName("UTF-8"));
  }
  
  public static String d(String paramString)
  {
    if (paramString == null) {
      return paramString;
    }
    return paramString.toLowerCase(Locale.US);
  }
  
  public static boolean d(int paramInt)
  {
    return (paramInt == Integer.MIN_VALUE) || (paramInt == 1073741824);
  }
  
  public static int e(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 8: 
      paramInt = a;
      if (paramInt >= 23) {
        return 6396;
      }
      if (paramInt >= 21) {
        return 6396;
      }
      return 0;
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
  
  public static String e(String paramString)
  {
    if (paramString == null) {
      return paramString;
    }
    return paramString.toUpperCase(Locale.US);
  }
  
  public static int f(int paramInt)
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
  
  public static long f(String paramString)
  {
    Matcher localMatcher = h.matcher(paramString);
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
  
  public static long g(String paramString)
    throws ce
  {
    Matcher localMatcher = g.matcher(paramString);
    if (!localMatcher.matches())
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Invalid date/time format: ".concat(paramString);
      } else {
        paramString = new String("Invalid date/time format: ");
      }
      throw new ce(paramString);
    }
    paramString = localMatcher.group(9);
    int m = 0;
    if ((paramString != null) && (!localMatcher.group(9).equalsIgnoreCase("Z")))
    {
      m = Integer.parseInt(localMatcher.group(12));
      int n = Integer.parseInt(localMatcher.group(13)) + m * 60;
      m = n;
      if ("-".equals(localMatcher.group(11))) {
        m = -n;
      }
    }
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
    localGregorianCalendar.clear();
    localGregorianCalendar.set(Integer.parseInt(localMatcher.group(1)), Integer.parseInt(localMatcher.group(2)) - 1, Integer.parseInt(localMatcher.group(3)), Integer.parseInt(localMatcher.group(4)), Integer.parseInt(localMatcher.group(5)), Integer.parseInt(localMatcher.group(6)));
    if (!TextUtils.isEmpty(localMatcher.group(8)))
    {
      paramString = String.valueOf(localMatcher.group(8));
      if (paramString.length() != 0) {
        paramString = "0.".concat(paramString);
      } else {
        paramString = new String("0.");
      }
      localGregorianCalendar.set(14, new BigDecimal(paramString).movePointRight(3).intValue());
    }
    long l1 = localGregorianCalendar.getTimeInMillis();
    long l2 = l1;
    if (m != 0) {
      l2 = l1 - m * 60000;
    }
    return l2;
  }
  
  public static byte[] h(String paramString)
  {
    int m = paramString.length() / 2;
    byte[] arrayOfByte = new byte[m];
    for (int n = 0; n < m; n++)
    {
      int i1 = n << 1;
      int i2 = Character.digit(paramString.charAt(i1), 16);
      arrayOfByte[n] = ((byte)(byte)(Character.digit(paramString.charAt(i1 + 1), 16) + (i2 << 4)));
    }
    return arrayOfByte;
  }
  
  public static String[] i(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return new String[0];
    }
    return paramString.trim().split("(\\s*,\\s*)", -1);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */