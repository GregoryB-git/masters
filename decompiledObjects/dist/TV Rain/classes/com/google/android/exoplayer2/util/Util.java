package com.google.android.exoplayer2.util;

import a;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.Display.Mode;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.upstream.DataSource;
import d5;
import f0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import z2;

public final class Util
{
  private static final int[] CRC32_BYTES_MSBF = { 0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108 };
  public static final String DEVICE;
  public static final String DEVICE_DEBUG_INFO;
  public static final byte[] EMPTY_BYTE_ARRAY;
  private static final Pattern ESCAPED_CHARACTER_PATTERN;
  public static final String MANUFACTURER;
  public static final String MODEL;
  public static final int SDK_INT;
  private static final String TAG = "Util";
  private static final Pattern XS_DATE_TIME_PATTERN;
  private static final Pattern XS_DURATION_PATTERN;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    SDK_INT = i;
    String str1 = Build.DEVICE;
    DEVICE = str1;
    String str2 = Build.MANUFACTURER;
    MANUFACTURER = str2;
    Object localObject = Build.MODEL;
    MODEL = (String)localObject;
    localObject = a.t(str1, ", ", (String)localObject, ", ", str2);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(i);
    DEVICE_DEBUG_INFO = ((StringBuilder)localObject).toString();
    EMPTY_BYTE_ARRAY = new byte[0];
    XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
  }
  
  public static long addWithOverflowDefault(long paramLong1, long paramLong2, long paramLong3)
  {
    long l = paramLong1 + paramLong2;
    if (((paramLong1 ^ l) & (paramLong2 ^ l)) < 0L) {
      return paramLong3;
    }
    return l;
  }
  
  public static boolean areEqual(@Nullable Object paramObject1, @Nullable Object paramObject2)
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
  
  public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> paramList, T paramT, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Collections.binarySearch(paramList, paramT);
    if (i < 0)
    {
      i = i;
    }
    else
    {
      j = paramList.size();
      do
      {
        i++;
      } while ((i < j) && (((Comparable)paramList.get(i)).compareTo(paramT) == 0));
      if (paramBoolean1) {
        i--;
      }
    }
    int j = i;
    if (paramBoolean2) {
      j = Math.min(paramList.size() - 1, i);
    }
    return j;
  }
  
  public static int binarySearchCeil(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int j = i;
    if (i < 0)
    {
      j = i;
    }
    else
    {
      do
      {
        j++;
      } while ((j < paramArrayOfLong.length) && (paramArrayOfLong[j] == paramLong));
      if (paramBoolean1) {
        j--;
      }
    }
    i = j;
    if (paramBoolean2) {
      i = Math.min(paramArrayOfLong.length - 1, j);
    }
    return i;
  }
  
  public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> paramList, T paramT, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Collections.binarySearch(paramList, paramT);
    int j = i;
    if (i < 0)
    {
      j = -(i + 2);
    }
    else
    {
      do
      {
        j--;
      } while ((j >= 0) && (((Comparable)paramList.get(j)).compareTo(paramT) == 0));
      if (paramBoolean1) {
        j++;
      }
    }
    i = j;
    if (paramBoolean2) {
      i = Math.max(0, j);
    }
    return i;
  }
  
  public static int binarySearchFloor(int[] paramArrayOfInt, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Arrays.binarySearch(paramArrayOfInt, paramInt);
    int j = i;
    if (i < 0)
    {
      paramInt = -(i + 2);
    }
    else
    {
      do
      {
        j--;
      } while ((j >= 0) && (paramArrayOfInt[j] == paramInt));
      if (paramBoolean1) {
        paramInt = j + 1;
      } else {
        paramInt = j;
      }
    }
    j = paramInt;
    if (paramBoolean2) {
      j = Math.max(0, paramInt);
    }
    return j;
  }
  
  public static int binarySearchFloor(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int j = i;
    if (i < 0)
    {
      j = -(i + 2);
    }
    else
    {
      do
      {
        j--;
      } while ((j >= 0) && (paramArrayOfLong[j] == paramLong));
      if (paramBoolean1) {
        j++;
      }
    }
    i = j;
    if (paramBoolean2) {
      i = Math.max(0, j);
    }
    return i;
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T castNonNull(@Nullable T paramT)
  {
    return paramT;
  }
  
  @EnsuresNonNull({"#1"})
  public static <T> T[] castNonNullTypeArray(T[] paramArrayOfT)
  {
    return paramArrayOfT;
  }
  
  public static int ceilDivide(int paramInt1, int paramInt2)
  {
    return (paramInt1 + paramInt2 - 1) / paramInt2;
  }
  
  public static long ceilDivide(long paramLong1, long paramLong2)
  {
    return (paramLong1 + paramLong2 - 1L) / paramLong2;
  }
  
  @TargetApi(24)
  public static boolean checkCleartextTrafficPermitted(Uri... paramVarArgs)
  {
    if (SDK_INT < 24) {
      return true;
    }
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      Uri localUri = paramVarArgs[j];
      if (("http".equals(localUri.getScheme())) && (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(localUri.getHost()))) {
        return false;
      }
    }
    return true;
  }
  
  public static void closeQuietly(DataSource paramDataSource)
  {
    if (paramDataSource != null) {}
    try
    {
      paramDataSource.close();
      return;
    }
    catch (IOException paramDataSource)
    {
      for (;;) {}
    }
  }
  
  public static void closeQuietly(Closeable paramCloseable)
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
  
  public static int compareLong(long paramLong1, long paramLong2)
  {
    boolean bool = paramLong1 < paramLong2;
    int i;
    if (bool) {
      i = -1;
    } else if (i == 0) {
      i = 0;
    } else {
      i = 1;
    }
    return i;
  }
  
  public static float constrainValue(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.max(paramFloat2, Math.min(paramFloat1, paramFloat3));
  }
  
  public static int constrainValue(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.max(paramInt2, Math.min(paramInt1, paramInt3));
  }
  
  public static long constrainValue(long paramLong1, long paramLong2, long paramLong3)
  {
    return Math.max(paramLong2, Math.min(paramLong1, paramLong3));
  }
  
  public static boolean contains(Object[] paramArrayOfObject, Object paramObject)
  {
    int i = paramArrayOfObject.length;
    for (int j = 0; j < i; j++) {
      if (areEqual(paramArrayOfObject[j], paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public static int crc(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    while (paramInt1 < paramInt2)
    {
      paramInt3 = CRC32_BYTES_MSBF[((paramInt3 >>> 24 ^ paramArrayOfByte[paramInt1] & 0xFF) & 0xFF)] ^ paramInt3 << 8;
      paramInt1++;
    }
    return paramInt3;
  }
  
  public static Handler createHandler(Handler.Callback paramCallback)
  {
    return createHandler(getLooper(), paramCallback);
  }
  
  public static Handler createHandler(Looper paramLooper, Handler.Callback paramCallback)
  {
    return new Handler(paramLooper, paramCallback);
  }
  
  public static File createTempDirectory(Context paramContext, String paramString)
    throws IOException
  {
    paramContext = createTempFile(paramContext, paramString);
    paramContext.delete();
    paramContext.mkdir();
    return paramContext;
  }
  
  public static File createTempFile(Context paramContext, String paramString)
    throws IOException
  {
    return File.createTempFile(paramString, null, paramContext.getCacheDir());
  }
  
  public static String escapeFileName(String paramString)
  {
    int i = paramString.length();
    int j = 0;
    int k = 0;
    int n;
    for (int m = k; k < i; m = n)
    {
      n = m;
      if (shouldEscapeCharacter(paramString.charAt(k))) {
        n = m + 1;
      }
      k++;
    }
    if (m == 0) {
      return paramString;
    }
    StringBuilder localStringBuilder = new StringBuilder(m * 2 + i);
    k = m;
    for (m = j; k > 0; m++)
    {
      char c = paramString.charAt(m);
      if (shouldEscapeCharacter(c))
      {
        localStringBuilder.append('%');
        localStringBuilder.append(Integer.toHexString(c));
        k--;
      }
      else
      {
        localStringBuilder.append(c);
      }
    }
    if (m < i) {
      localStringBuilder.append(paramString, m, i);
    }
    return localStringBuilder.toString();
  }
  
  public static String formatInvariant(String paramString, Object... paramVarArgs)
  {
    return String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static String fromUtf8Bytes(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, Charset.forName("UTF-8"));
  }
  
  public static String fromUtf8Bytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new String(paramArrayOfByte, paramInt1, paramInt2, Charset.forName("UTF-8"));
  }
  
  public static int getAudioContentTypeForStreamType(int paramInt)
  {
    if (paramInt != 0)
    {
      if ((paramInt != 1) && (paramInt != 2) && (paramInt != 4) && (paramInt != 5) && (paramInt != 8)) {
        return 2;
      }
      return 4;
    }
    return 1;
  }
  
  public static int getAudioTrackChannelConfig(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 8: 
      paramInt = SDK_INT;
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
  
  public static int getAudioUsageForStreamType(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          int i = 4;
          if (paramInt != 4)
          {
            i = 5;
            if (paramInt != 5)
            {
              if (paramInt != 8) {
                return 1;
              }
              return 3;
            }
          }
          return i;
        }
        return 6;
      }
      return 13;
    }
    return 2;
  }
  
  public static byte[] getBytesFromHexString(String paramString)
  {
    int i = paramString.length() / 2;
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++)
    {
      int k = j * 2;
      int m = Character.digit(paramString.charAt(k), 16);
      arrayOfByte[j] = ((byte)(byte)(Character.digit(paramString.charAt(k + 1), 16) + (m << 4)));
    }
    return arrayOfByte;
  }
  
  @Nullable
  public static String getCodecsOfType(String paramString, int paramInt)
  {
    String[] arrayOfString = splitCodecs(paramString);
    int i = arrayOfString.length;
    paramString = null;
    if (i == 0) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int j = arrayOfString.length;
    for (i = 0; i < j; i++)
    {
      String str = arrayOfString[i];
      if (paramInt == MimeTypes.getTrackTypeOfCodec(str))
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
  
  public static String getCommaDelimitedSimpleClassNames(Object[] paramArrayOfObject)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfObject.length; i++)
    {
      localStringBuilder.append(paramArrayOfObject[i].getClass().getSimpleName());
      if (i < paramArrayOfObject.length - 1) {
        localStringBuilder.append(", ");
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String getCountryCode(@Nullable Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext != null)
      {
        paramContext = paramContext.getNetworkCountryIso();
        if (!TextUtils.isEmpty(paramContext)) {
          return toUpperInvariant(paramContext);
        }
      }
    }
    return toUpperInvariant(Locale.getDefault().getCountry());
  }
  
  public static int getDefaultBufferSize(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if ((paramInt != 3) && (paramInt != 4))
          {
            if (paramInt == 5) {
              return 131072;
            }
            throw new IllegalStateException();
          }
          return 131072;
        }
        return 13107200;
      }
      return 3538944;
    }
    return 16777216;
  }
  
  @TargetApi(16)
  private static void getDisplaySizeV16(Display paramDisplay, Point paramPoint)
  {
    paramDisplay.getSize(paramPoint);
  }
  
  @TargetApi(17)
  private static void getDisplaySizeV17(Display paramDisplay, Point paramPoint)
  {
    paramDisplay.getRealSize(paramPoint);
  }
  
  @TargetApi(23)
  private static void getDisplaySizeV23(Display paramDisplay, Point paramPoint)
  {
    paramDisplay = paramDisplay.getMode();
    x = paramDisplay.getPhysicalWidth();
    y = paramDisplay.getPhysicalHeight();
  }
  
  private static void getDisplaySizeV9(Display paramDisplay, Point paramPoint)
  {
    x = paramDisplay.getWidth();
    y = paramDisplay.getHeight();
  }
  
  @Nullable
  public static UUID getDrmUuid(String paramString)
  {
    String str = toLowerInvariant(paramString);
    str.getClass();
    int i = str.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 790309106: 
      if (str.equals("clearkey")) {
        j = 2;
      }
      break;
    case -1400551171: 
      if (str.equals("widevine")) {
        j = 1;
      }
      break;
    case -1860423953: 
      if (str.equals("playready")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      try
      {
        paramString = UUID.fromString(paramString);
        return paramString;
      }
      catch (RuntimeException paramString)
      {
        return null;
      }
    case 2: 
      return C.CLEARKEY_UUID;
    case 1: 
      return C.WIDEVINE_UUID;
    }
    return C.PLAYREADY_UUID;
  }
  
  public static int getIntegerCodeForString(String paramString)
  {
    int i = paramString.length();
    int j = 0;
    boolean bool;
    if (i <= 4) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    int k = 0;
    while (j < i)
    {
      k = k << 8 | paramString.charAt(j);
      j++;
    }
    return k;
  }
  
  public static Looper getLooper()
  {
    Looper localLooper = Looper.myLooper();
    if (localLooper == null) {
      localLooper = Looper.getMainLooper();
    }
    return localLooper;
  }
  
  public static long getMediaDurationForPlayoutDuration(long paramLong, float paramFloat)
  {
    if (paramFloat == 1.0F) {
      return paramLong;
    }
    return Math.round(paramLong * paramFloat);
  }
  
  private static int getMobileNetworkType(NetworkInfo paramNetworkInfo)
  {
    switch (paramNetworkInfo.getSubtype())
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
  
  public static int getNetworkType(@Nullable Context paramContext)
  {
    int i = 0;
    if (paramContext == null) {
      return 0;
    }
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null) {
        return 0;
      }
      paramContext = paramContext.getActiveNetworkInfo();
      int j = 1;
      i = j;
      if (paramContext != null) {
        if (!paramContext.isConnected())
        {
          i = j;
        }
        else
        {
          i = paramContext.getType();
          if (i != 0) {
            if (i != 1)
            {
              if ((i != 4) && (i != 5))
              {
                if (i != 6)
                {
                  if (i != 9) {
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
          return getMobileNetworkType(paramContext);
        }
      }
    }
    catch (SecurityException paramContext)
    {
      for (;;) {}
    }
    return i;
  }
  
  public static int getPcmEncoding(int paramInt)
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
  
  public static int getPcmFrameSize(int paramInt1, int paramInt2)
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
          return paramInt2 * 2;
        }
      }
      return paramInt2 * 4;
    }
    return paramInt2 * 3;
  }
  
  public static Point getPhysicalDisplaySize(Context paramContext)
  {
    return getPhysicalDisplaySize(paramContext, ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay());
  }
  
  public static Point getPhysicalDisplaySize(Context paramContext, Display paramDisplay)
  {
    if ((SDK_INT < 25) && (paramDisplay.getDisplayId() == 0))
    {
      Object localObject1 = MANUFACTURER;
      if (("Sony".equals(localObject1)) && (MODEL.startsWith("BRAVIA")) && (paramContext.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd"))) {
        return new Point(3840, 2160);
      }
      if ((!"NVIDIA".equals(localObject1)) || (!MODEL.contains("SHIELD")))
      {
        if ("philips".equals(toLowerInvariant((String)localObject1)))
        {
          paramContext = MODEL;
          if ((!paramContext.startsWith("QM1")) && (!paramContext.equals("QV151E")) && (!paramContext.equals("TPM171E"))) {}
        }
      }
      else
      {
        paramContext = null;
        try
        {
          localObject1 = Class.forName("android.os.SystemProperties");
          localObject1 = (String)((Class)localObject1).getMethod("get", new Class[] { String.class }).invoke(localObject1, new Object[] { "sys.display-size" });
          paramContext = (Context)localObject1;
        }
        catch (Exception localException)
        {
          Log.e("Util", "Failed to read sys.display-size", localException);
        }
        if (TextUtils.isEmpty(paramContext)) {}
      }
    }
    try
    {
      localObject2 = split(paramContext.trim(), "x");
      if (localObject2.length == 2)
      {
        i = Integer.parseInt(localObject2[0]);
        int j = Integer.parseInt(localObject2[1]);
        if ((i > 0) && (j > 0))
        {
          localObject2 = new Point(i, j);
          return (Point)localObject2;
        }
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Object localObject2;
      int i;
      for (;;) {}
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Invalid sys.display-size: ");
    ((StringBuilder)localObject2).append(paramContext);
    Log.e("Util", ((StringBuilder)localObject2).toString());
    paramContext = new Point();
    i = SDK_INT;
    if (i >= 23) {
      getDisplaySizeV23(paramDisplay, paramContext);
    } else if (i >= 17) {
      getDisplaySizeV17(paramDisplay, paramContext);
    } else if (i >= 16) {
      getDisplaySizeV16(paramDisplay, paramContext);
    } else {
      getDisplaySizeV9(paramDisplay, paramContext);
    }
    return paramContext;
  }
  
  public static long getPlayoutDurationForMediaDuration(long paramLong, float paramFloat)
  {
    if (paramFloat == 1.0F) {
      return paramLong;
    }
    return Math.round(paramLong / paramFloat);
  }
  
  public static int getStreamTypeForAudioUsage(int paramInt)
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
  
  public static String getStringForTime(StringBuilder paramStringBuilder, Formatter paramFormatter, long paramLong)
  {
    long l1 = paramLong;
    if (paramLong == -9223372036854775807L) {
      l1 = 0L;
    }
    long l2 = (l1 + 500L) / 1000L;
    l1 = l2 % 60L;
    paramLong = l2 / 60L % 60L;
    l2 /= 3600L;
    paramStringBuilder.setLength(0);
    if (l2 > 0L) {
      paramStringBuilder = paramFormatter.format("%d:%02d:%02d", new Object[] { Long.valueOf(l2), Long.valueOf(paramLong), Long.valueOf(l1) }).toString();
    } else {
      paramStringBuilder = paramFormatter.format("%02d:%02d", new Object[] { Long.valueOf(paramLong), Long.valueOf(l1) }).toString();
    }
    return paramStringBuilder;
  }
  
  public static String getUserAgent(Context paramContext, String paramString)
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
    return a.p((StringBuilder)localObject, Build.VERSION.RELEASE, ") ", "ExoPlayerLib/2.9.1");
  }
  
  public static byte[] getUtf8Bytes(String paramString)
  {
    return paramString.getBytes(Charset.forName("UTF-8"));
  }
  
  public static int inferContentType(Uri paramUri)
  {
    paramUri = paramUri.getPath();
    int i;
    if (paramUri == null) {
      i = 3;
    } else {
      i = inferContentType(paramUri);
    }
    return i;
  }
  
  public static int inferContentType(Uri paramUri, String paramString)
  {
    int i;
    if (TextUtils.isEmpty(paramString))
    {
      i = inferContentType(paramUri);
    }
    else
    {
      paramUri = new StringBuilder();
      paramUri.append(".");
      paramUri.append(paramString);
      i = inferContentType(paramUri.toString());
    }
    return i;
  }
  
  public static int inferContentType(String paramString)
  {
    paramString = toLowerInvariant(paramString);
    if (paramString.endsWith(".mpd")) {
      return 0;
    }
    if (paramString.endsWith(".m3u8")) {
      return 2;
    }
    if (paramString.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?")) {
      return 1;
    }
    return 3;
  }
  
  /* Error */
  public static boolean inflate(ParsableByteArray paramParsableByteArray1, ParsableByteArray paramParsableByteArray2, @Nullable java.util.zip.Inflater paramInflater)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 989	com/google/android/exoplayer2/util/ParsableByteArray:bytesLeft	()I
    //   4: ifgt +5 -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_1
    //   10: getfield 992	com/google/android/exoplayer2/util/ParsableByteArray:data	[B
    //   13: astore_3
    //   14: aload_3
    //   15: astore 4
    //   17: aload_3
    //   18: arraylength
    //   19: aload_0
    //   20: invokevirtual 989	com/google/android/exoplayer2/util/ParsableByteArray:bytesLeft	()I
    //   23: if_icmpge +13 -> 36
    //   26: aload_0
    //   27: invokevirtual 989	com/google/android/exoplayer2/util/ParsableByteArray:bytesLeft	()I
    //   30: iconst_2
    //   31: imul
    //   32: newarray <illegal type>
    //   34: astore 4
    //   36: aload_2
    //   37: astore_3
    //   38: aload_2
    //   39: ifnonnull +11 -> 50
    //   42: new 994	java/util/zip/Inflater
    //   45: dup
    //   46: invokespecial 995	java/util/zip/Inflater:<init>	()V
    //   49: astore_3
    //   50: aload_3
    //   51: aload_0
    //   52: getfield 992	com/google/android/exoplayer2/util/ParsableByteArray:data	[B
    //   55: aload_0
    //   56: invokevirtual 998	com/google/android/exoplayer2/util/ParsableByteArray:getPosition	()I
    //   59: aload_0
    //   60: invokevirtual 989	com/google/android/exoplayer2/util/ParsableByteArray:bytesLeft	()I
    //   63: invokevirtual 1002	java/util/zip/Inflater:setInput	([BII)V
    //   66: iconst_0
    //   67: istore 5
    //   69: iload 5
    //   71: aload_3
    //   72: aload 4
    //   74: iload 5
    //   76: aload 4
    //   78: arraylength
    //   79: iload 5
    //   81: isub
    //   82: invokevirtual 1005	java/util/zip/Inflater:inflate	([BII)I
    //   85: iadd
    //   86: istore 6
    //   88: aload_3
    //   89: invokevirtual 1008	java/util/zip/Inflater:finished	()Z
    //   92: ifeq +17 -> 109
    //   95: aload_1
    //   96: aload 4
    //   98: iload 6
    //   100: invokevirtual 1012	com/google/android/exoplayer2/util/ParsableByteArray:reset	([BI)V
    //   103: aload_3
    //   104: invokevirtual 1014	java/util/zip/Inflater:reset	()V
    //   107: iconst_1
    //   108: ireturn
    //   109: aload_3
    //   110: invokevirtual 1017	java/util/zip/Inflater:needsDictionary	()Z
    //   113: ifne +44 -> 157
    //   116: aload_3
    //   117: invokevirtual 1020	java/util/zip/Inflater:needsInput	()Z
    //   120: ifeq +6 -> 126
    //   123: goto +34 -> 157
    //   126: iload 6
    //   128: istore 5
    //   130: iload 6
    //   132: aload 4
    //   134: arraylength
    //   135: if_icmpne -66 -> 69
    //   138: aload 4
    //   140: aload 4
    //   142: arraylength
    //   143: iconst_2
    //   144: imul
    //   145: invokestatic 1024	java/util/Arrays:copyOf	([BI)[B
    //   148: astore 4
    //   150: iload 6
    //   152: istore 5
    //   154: goto -85 -> 69
    //   157: aload_3
    //   158: invokevirtual 1014	java/util/zip/Inflater:reset	()V
    //   161: iconst_0
    //   162: ireturn
    //   163: astore_0
    //   164: aload_3
    //   165: invokevirtual 1014	java/util/zip/Inflater:reset	()V
    //   168: aload_0
    //   169: athrow
    //   170: astore_0
    //   171: aload_3
    //   172: invokevirtual 1014	java/util/zip/Inflater:reset	()V
    //   175: iconst_0
    //   176: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	paramParsableByteArray1	ParsableByteArray
    //   0	177	1	paramParsableByteArray2	ParsableByteArray
    //   0	177	2	paramInflater	java.util.zip.Inflater
    //   13	159	3	localObject1	Object
    //   15	134	4	localObject2	Object
    //   67	86	5	i	int
    //   86	65	6	j	int
    // Exception table:
    //   from	to	target	type
    //   69	103	163	finally
    //   109	123	163	finally
    //   130	150	163	finally
    //   69	103	170	java/util/zip/DataFormatException
    //   109	123	170	java/util/zip/DataFormatException
    //   130	150	170	java/util/zip/DataFormatException
  }
  
  public static boolean isEncodingHighResolutionIntegerPcm(int paramInt)
  {
    boolean bool;
    if ((paramInt != Integer.MIN_VALUE) && (paramInt != 1073741824)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean isEncodingLinearPcm(int paramInt)
  {
    boolean bool;
    if ((paramInt != 3) && (paramInt != 2) && (paramInt != Integer.MIN_VALUE) && (paramInt != 1073741824) && (paramInt != 4)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean isLinebreak(int paramInt)
  {
    boolean bool;
    if ((paramInt != 10) && (paramInt != 13)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean isLocalFileUri(Uri paramUri)
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
  
  @TargetApi(23)
  public static boolean maybeRequestReadExternalStoragePermission(Activity paramActivity, Uri... paramVarArgs)
  {
    if (SDK_INT < 23) {
      return false;
    }
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      if (isLocalFileUri(paramVarArgs[j]))
      {
        if (paramActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
          break;
        }
        paramActivity.requestPermissions(new String[] { "android.permission.READ_EXTERNAL_STORAGE" }, 0);
        return true;
      }
    }
    return false;
  }
  
  public static ExecutorService newSingleThreadExecutor(String paramString)
  {
    return Executors.newSingleThreadExecutor(new d5(paramString));
  }
  
  @Nullable
  public static String normalizeLanguageCode(@Nullable String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    try
    {
      Object localObject = new java/util/Locale;
      ((Locale)localObject).<init>(paramString);
      localObject = ((Locale)localObject).getISO3Language();
      paramString = (String)localObject;
      return paramString;
    }
    catch (MissingResourceException localMissingResourceException) {}
    return toLowerInvariant(paramString);
  }
  
  public static <T> T[] nullSafeArrayCopy(T[] paramArrayOfT, int paramInt)
  {
    boolean bool;
    if (paramInt <= paramArrayOfT.length) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    return Arrays.copyOf(paramArrayOfT, paramInt);
  }
  
  public static long parseXsDateTime(String paramString)
    throws ParserException
  {
    Matcher localMatcher = XS_DATE_TIME_PATTERN.matcher(paramString);
    if (localMatcher.matches())
    {
      paramString = localMatcher.group(9);
      int i = 0;
      if ((paramString != null) && (!localMatcher.group(9).equalsIgnoreCase("Z")))
      {
        i = Integer.parseInt(localMatcher.group(12));
        int j = Integer.parseInt(localMatcher.group(13)) + i * 60;
        i = j;
        if ("-".equals(localMatcher.group(11))) {
          i = j * -1;
        }
      }
      paramString = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
      paramString.clear();
      paramString.set(Integer.parseInt(localMatcher.group(1)), Integer.parseInt(localMatcher.group(2)) - 1, Integer.parseInt(localMatcher.group(3)), Integer.parseInt(localMatcher.group(4)), Integer.parseInt(localMatcher.group(5)), Integer.parseInt(localMatcher.group(6)));
      if (!TextUtils.isEmpty(localMatcher.group(8)))
      {
        StringBuilder localStringBuilder = z2.t("0.");
        localStringBuilder.append(localMatcher.group(8));
        paramString.set(14, new BigDecimal(localStringBuilder.toString()).movePointRight(3).intValue());
      }
      long l1 = paramString.getTimeInMillis();
      long l2 = l1;
      if (i != 0) {
        l2 = l1 - i * 60000;
      }
      return l2;
    }
    throw new ParserException(z2.o("Invalid date/time format: ", paramString));
  }
  
  public static long parseXsDuration(String paramString)
  {
    Matcher localMatcher = XS_DURATION_PATTERN.matcher(paramString);
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
  
  public static boolean readBoolean(Parcel paramParcel)
  {
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void recursiveDelete(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++) {
        recursiveDelete(arrayOfFile[j]);
      }
    }
    paramFile.delete();
  }
  
  public static <T> void removeRange(List<T> paramList, int paramInt1, int paramInt2)
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
  
  public static long resolveSeekPositionUs(long paramLong1, SeekParameters paramSeekParameters, long paramLong2, long paramLong3)
  {
    if (SeekParameters.EXACT.equals(paramSeekParameters)) {
      return paramLong1;
    }
    long l1 = subtractWithOverflowDefault(paramLong1, toleranceBeforeUs, Long.MIN_VALUE);
    long l2 = addWithOverflowDefault(paramLong1, toleranceAfterUs, Long.MAX_VALUE);
    int i = 1;
    int j;
    if ((l1 <= paramLong2) && (paramLong2 <= l2)) {
      j = 1;
    } else {
      j = 0;
    }
    if ((l1 > paramLong3) || (paramLong3 > l2)) {
      i = 0;
    }
    if ((j != 0) && (i != 0))
    {
      if (Math.abs(paramLong2 - paramLong1) <= Math.abs(paramLong3 - paramLong1)) {
        return paramLong2;
      }
      return paramLong3;
    }
    if (j != 0) {
      return paramLong2;
    }
    if (i != 0) {
      return paramLong3;
    }
    return l1;
  }
  
  public static long scaleLargeTimestamp(long paramLong1, long paramLong2, long paramLong3)
  {
    boolean bool = paramLong3 < paramLong2;
    if ((!bool) && (paramLong3 % paramLong2 == 0L)) {
      return paramLong1 / (paramLong3 / paramLong2);
    }
    if ((bool) && (paramLong2 % paramLong3 == 0L)) {
      return paramLong2 / paramLong3 * paramLong1;
    }
    double d = paramLong2 / paramLong3;
    return (paramLong1 * d);
  }
  
  public static long[] scaleLargeTimestamps(List<Long> paramList, long paramLong1, long paramLong2)
  {
    int i = paramList.size();
    long[] arrayOfLong = new long[i];
    boolean bool = paramLong2 < paramLong1;
    int j = 0;
    int k = 0;
    int m = 0;
    if ((!bool) && (paramLong2 % paramLong1 == 0L)) {
      paramLong1 = paramLong2 / paramLong1;
    }
    while (m < i)
    {
      arrayOfLong[m] = (((Long)paramList.get(m)).longValue() / paramLong1);
      m++;
      continue;
      if ((bool) && (paramLong1 % paramLong2 == 0L))
      {
        paramLong1 /= paramLong2;
        m = j;
      }
      while (m < i)
      {
        arrayOfLong[m] = (((Long)paramList.get(m)).longValue() * paramLong1);
        m++;
        continue;
        double d = paramLong1 / paramLong2;
        for (m = k; m < i; m++) {
          arrayOfLong[m] = ((((Long)paramList.get(m)).longValue() * d));
        }
      }
    }
    return arrayOfLong;
  }
  
  public static void scaleLargeTimestampsInPlace(long[] paramArrayOfLong, long paramLong1, long paramLong2)
  {
    boolean bool = paramLong2 < paramLong1;
    int i = 0;
    int j = 0;
    int k = 0;
    if ((!bool) && (paramLong2 % paramLong1 == 0L)) {
      paramLong1 = paramLong2 / paramLong1;
    }
    while (k < paramArrayOfLong.length)
    {
      paramArrayOfLong[k] /= paramLong1;
      k++;
      continue;
      if ((bool) && (paramLong1 % paramLong2 == 0L))
      {
        paramLong1 /= paramLong2;
        k = i;
      }
      while (k < paramArrayOfLong.length)
      {
        paramArrayOfLong[k] *= paramLong1;
        k++;
        continue;
        double d = paramLong1 / paramLong2;
        for (k = j; k < paramArrayOfLong.length; k++) {
          paramArrayOfLong[k] = ((paramArrayOfLong[k] * d));
        }
      }
    }
  }
  
  private static boolean shouldEscapeCharacter(char paramChar)
  {
    return (paramChar == '"') || (paramChar == '%') || (paramChar == '*') || (paramChar == '/') || (paramChar == ':') || (paramChar == '<') || (paramChar == '\\') || (paramChar == '|') || (paramChar == '>') || (paramChar == '?');
  }
  
  public static void sneakyThrow(Throwable paramThrowable)
  {
    sneakyThrowInternal(paramThrowable);
  }
  
  private static <T extends Throwable> void sneakyThrowInternal(Throwable paramThrowable)
    throws Throwable
  {
    throw paramThrowable;
  }
  
  public static String[] split(String paramString1, String paramString2)
  {
    return paramString1.split(paramString2, -1);
  }
  
  public static String[] splitAtFirst(String paramString1, String paramString2)
  {
    return paramString1.split(paramString2, 2);
  }
  
  public static String[] splitCodecs(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return new String[0];
    }
    return split(paramString.trim(), "(\\s*,\\s*)");
  }
  
  public static ComponentName startForegroundService(Context paramContext, Intent paramIntent)
  {
    if (SDK_INT >= 26) {
      return f0.i(paramContext, paramIntent);
    }
    return paramContext.startService(paramIntent);
  }
  
  public static long subtractWithOverflowDefault(long paramLong1, long paramLong2, long paramLong3)
  {
    long l = paramLong1 - paramLong2;
    if (((paramLong1 ^ l) & (paramLong2 ^ paramLong1)) < 0L) {
      return paramLong3;
    }
    return l;
  }
  
  public static int[] toArray(List<Integer> paramList)
  {
    if (paramList == null) {
      return null;
    }
    int i = paramList.size();
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = ((Integer)paramList.get(j)).intValue();
    }
    return arrayOfInt;
  }
  
  public static byte[] toByteArray(InputStream paramInputStream)
    throws IOException
  {
    byte[] arrayOfByte = new byte['က'];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static String toLowerInvariant(String paramString)
  {
    if (paramString != null) {
      paramString = paramString.toLowerCase(Locale.US);
    }
    return paramString;
  }
  
  public static String toUpperInvariant(String paramString)
  {
    if (paramString != null) {
      paramString = paramString.toUpperCase(Locale.US);
    }
    return paramString;
  }
  
  @Nullable
  public static String unescapeFileName(String paramString)
  {
    int i = paramString.length();
    int j = 0;
    int k = 0;
    for (int m = k; k < i; m = n)
    {
      n = m;
      if (paramString.charAt(k) == '%') {
        n = m + 1;
      }
      k++;
    }
    if (m == 0) {
      return paramString;
    }
    int n = i - m * 2;
    StringBuilder localStringBuilder = new StringBuilder(n);
    Matcher localMatcher = ESCAPED_CHARACTER_PATTERN.matcher(paramString);
    k = j;
    while ((m > 0) && (localMatcher.find()))
    {
      char c = (char)Integer.parseInt(localMatcher.group(1), 16);
      localStringBuilder.append(paramString, k, localMatcher.start());
      localStringBuilder.append(c);
      k = localMatcher.end();
      m--;
    }
    if (k < i) {
      localStringBuilder.append(paramString, k, i);
    }
    if (localStringBuilder.length() != n) {
      return null;
    }
    return localStringBuilder.toString();
  }
  
  public static void writeBoolean(Parcel paramParcel, boolean paramBoolean)
  {
    paramParcel.writeInt(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.Util
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */