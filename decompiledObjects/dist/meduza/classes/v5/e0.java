package v5;

import a0.j;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.LocaleList;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import f;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.d;
import v3.a1;
import x6.b;

public final class e0
{
  public static final int a;
  public static final String b;
  public static final String c;
  public static final String d;
  public static final String e;
  public static final byte[] f = new byte[0];
  public static final Pattern g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
  public static final Pattern h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
  public static final Pattern i = Pattern.compile("%([A-Fa-f0-9]{2})");
  public static final Pattern j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
  public static HashMap<String, String> k;
  public static final String[] l = { "alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn" };
  public static final String[] m = { "i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn" };
  public static final int[] n = { 0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108 };
  public static final int[] o = { 0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243 };
  
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
  
  public static String A(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      if (paramInt >= 10000) {
        str = j.h("custom (", paramInt, ")");
      }
      break;
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
    case -2: 
      return "none";
    }
    String str = "?";
    return str;
  }
  
  public static byte[] B(String paramString)
  {
    return paramString.getBytes(d.c);
  }
  
  public static int C(Uri paramUri)
  {
    Object localObject = paramUri.getScheme();
    int i1 = 3;
    if ((localObject != null) && (b.R("rtsp", (String)localObject))) {
      return 3;
    }
    localObject = paramUri.getLastPathSegment();
    if (localObject == null) {
      return 4;
    }
    int i2 = ((String)localObject).lastIndexOf('.');
    if (i2 >= 0)
    {
      localObject = b.x0(((String)localObject).substring(i2 + 1));
      localObject.getClass();
      switch (((String)localObject).hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            i1 = -1;
            break;
            if (((String)localObject).equals("m3u8")) {
              break;
            }
          } while ((goto 108) || (!((String)localObject).equals("isml")));
          i1 = 2;
          break;
        } while (!((String)localObject).equals("mpd"));
        i1 = 1;
        break;
      } while (!((String)localObject).equals("ism"));
      i1 = 0;
      switch (i1)
      {
      default: 
        i1 = 4;
        break;
      case 3: 
        i1 = 2;
        break;
      case 1: 
        i1 = 0;
        break;
      case 0: 
      case 2: 
        i1 = 1;
      }
      if (i1 != 4) {
        return i1;
      }
    }
    localObject = j;
    paramUri = paramUri.getPath();
    paramUri.getClass();
    paramUri = ((Pattern)localObject).matcher(paramUri);
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
  
  /* Error */
  public static boolean D(u paramu1, u paramu2, java.util.zip.Inflater paramInflater)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 667	v5/u:c	I
    //   4: aload_0
    //   5: getfield 669	v5/u:b	I
    //   8: isub
    //   9: istore_3
    //   10: iload_3
    //   11: ifgt +5 -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_1
    //   17: getfield 671	v5/u:a	[B
    //   20: arraylength
    //   21: iload_3
    //   22: if_icmpge +10 -> 32
    //   25: aload_1
    //   26: iload_3
    //   27: iconst_2
    //   28: imul
    //   29: invokevirtual 674	v5/u:a	(I)V
    //   32: aload_2
    //   33: astore 4
    //   35: aload_2
    //   36: ifnonnull +12 -> 48
    //   39: new 676	java/util/zip/Inflater
    //   42: dup
    //   43: invokespecial 677	java/util/zip/Inflater:<init>	()V
    //   46: astore 4
    //   48: aload_0
    //   49: getfield 671	v5/u:a	[B
    //   52: astore_2
    //   53: aload_0
    //   54: getfield 669	v5/u:b	I
    //   57: istore_3
    //   58: aload 4
    //   60: aload_2
    //   61: iload_3
    //   62: aload_0
    //   63: getfield 667	v5/u:c	I
    //   66: iload_3
    //   67: isub
    //   68: invokevirtual 681	java/util/zip/Inflater:setInput	([BII)V
    //   71: iconst_0
    //   72: istore_3
    //   73: aload_1
    //   74: getfield 671	v5/u:a	[B
    //   77: astore_0
    //   78: iload_3
    //   79: aload 4
    //   81: aload_0
    //   82: iload_3
    //   83: aload_0
    //   84: arraylength
    //   85: iload_3
    //   86: isub
    //   87: invokevirtual 685	java/util/zip/Inflater:inflate	([BII)I
    //   90: iadd
    //   91: istore 5
    //   93: aload 4
    //   95: invokevirtual 688	java/util/zip/Inflater:finished	()Z
    //   98: ifeq +16 -> 114
    //   101: aload_1
    //   102: iload 5
    //   104: invokevirtual 691	v5/u:F	(I)V
    //   107: aload 4
    //   109: invokevirtual 694	java/util/zip/Inflater:reset	()V
    //   112: iconst_1
    //   113: ireturn
    //   114: aload 4
    //   116: invokevirtual 697	java/util/zip/Inflater:needsDictionary	()Z
    //   119: ifne +43 -> 162
    //   122: aload 4
    //   124: invokevirtual 700	java/util/zip/Inflater:needsInput	()Z
    //   127: ifeq +6 -> 133
    //   130: goto +32 -> 162
    //   133: aload_1
    //   134: getfield 671	v5/u:a	[B
    //   137: astore_0
    //   138: iload 5
    //   140: istore_3
    //   141: iload 5
    //   143: aload_0
    //   144: arraylength
    //   145: if_icmpne -72 -> 73
    //   148: aload_1
    //   149: aload_0
    //   150: arraylength
    //   151: iconst_2
    //   152: imul
    //   153: invokevirtual 674	v5/u:a	(I)V
    //   156: iload 5
    //   158: istore_3
    //   159: goto -86 -> 73
    //   162: aload 4
    //   164: invokevirtual 694	java/util/zip/Inflater:reset	()V
    //   167: iconst_0
    //   168: ireturn
    //   169: astore_0
    //   170: aload 4
    //   172: invokevirtual 694	java/util/zip/Inflater:reset	()V
    //   175: aload_0
    //   176: athrow
    //   177: astore_0
    //   178: aload 4
    //   180: invokevirtual 694	java/util/zip/Inflater:reset	()V
    //   183: iconst_0
    //   184: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	paramu1	u
    //   0	185	1	paramu2	u
    //   0	185	2	paramInflater	java.util.zip.Inflater
    //   9	150	3	i1	int
    //   33	146	4	localInflater	java.util.zip.Inflater
    //   91	66	5	i2	int
    // Exception table:
    //   from	to	target	type
    //   73	107	169	finally
    //   114	130	169	finally
    //   133	138	169	finally
    //   141	156	169	finally
    //   73	107	177	java/util/zip/DataFormatException
    //   114	130	177	java/util/zip/DataFormatException
    //   133	138	177	java/util/zip/DataFormatException
    //   141	156	177	java/util/zip/DataFormatException
  }
  
  public static String E(int paramInt)
  {
    return Integer.toString(paramInt, 36);
  }
  
  public static boolean F(int paramInt)
  {
    boolean bool;
    if ((paramInt != 3) && (paramInt != 2) && (paramInt != 268435456) && (paramInt != 536870912) && (paramInt != 805306368) && (paramInt != 4)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean G(int paramInt)
  {
    boolean bool;
    if ((paramInt != 10) && (paramInt != 13)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean H(Context paramContext)
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
  
  public static long I(long paramLong)
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
  
  public static String J(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    Object localObject1 = paramString.replace('_', '-');
    Object localObject2 = paramString;
    if (!((String)localObject1).isEmpty()) {
      if (((String)localObject1).equals("und")) {
        localObject2 = paramString;
      } else {
        localObject2 = localObject1;
      }
    }
    localObject1 = b.x0((String)localObject2);
    paramString = ((String)localObject1).split("-", 2);
    int i1 = 0;
    Object localObject3 = paramString[0];
    int i2;
    int i3;
    if (k == null)
    {
      localObject2 = Locale.getISOLanguages();
      paramString = new HashMap(localObject2.length + l.length);
      i2 = localObject2.length;
      i3 = 0;
    }
    for (;;)
    {
      String str;
      if (i3 < i2) {
        str = localObject2[i3];
      }
      try
      {
        Object localObject4 = new java/util/Locale;
        ((Locale)localObject4).<init>(str);
        localObject4 = ((Locale)localObject4).getISO3Language();
        if (!TextUtils.isEmpty((CharSequence)localObject4)) {
          paramString.put(localObject4, str);
        }
        i3++;
        continue;
        for (i3 = 0;; i3 += 2)
        {
          localObject2 = l;
          if (i3 >= localObject2.length) {
            break;
          }
          paramString.put(localObject2[i3], localObject2[(i3 + 1)]);
        }
        k = paramString;
        str = (String)k.get(localObject3);
        localObject2 = localObject3;
        paramString = (String)localObject1;
        if (str != null)
        {
          paramString = f.l(str);
          paramString.append(((String)localObject1).substring(((String)localObject3).length()));
          paramString = paramString.toString();
          localObject2 = str;
        }
        i3 = i1;
        if (!"no".equals(localObject2))
        {
          i3 = i1;
          if (!"i".equals(localObject2))
          {
            localObject1 = paramString;
            if (!"zh".equals(localObject2)) {
              break label352;
            }
          }
        }
        for (i3 = i1;; i3 += 2)
        {
          localObject2 = m;
          localObject1 = paramString;
          if (i3 >= localObject2.length) {
            break;
          }
          if (paramString.startsWith(localObject2[i3]))
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append(localObject2[(i3 + 1)]);
            ((StringBuilder)localObject1).append(paramString.substring(localObject2[i3].length()));
            localObject1 = ((StringBuilder)localObject1).toString();
            break;
          }
        }
        label352:
        return (String)localObject1;
      }
      catch (MissingResourceException localMissingResourceException)
      {
        for (;;) {}
      }
    }
  }
  
  public static Object[] K(int paramInt, Object[] paramArrayOfObject)
  {
    boolean bool;
    if (paramInt <= paramArrayOfObject.length) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    return Arrays.copyOf(paramArrayOfObject, paramInt);
  }
  
  public static long L(String paramString)
  {
    Object localObject = g.matcher(paramString);
    if (((Matcher)localObject).matches())
    {
      paramString = ((Matcher)localObject).group(9);
      int i1 = 0;
      if ((paramString != null) && (!((Matcher)localObject).group(9).equalsIgnoreCase("Z")))
      {
        i1 = Integer.parseInt(((Matcher)localObject).group(12));
        int i2 = Integer.parseInt(((Matcher)localObject).group(13)) + i1 * 60;
        i1 = i2;
        if ("-".equals(((Matcher)localObject).group(11))) {
          i1 = i2 * -1;
        }
      }
      paramString = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
      paramString.clear();
      paramString.set(Integer.parseInt(((Matcher)localObject).group(1)), Integer.parseInt(((Matcher)localObject).group(2)) - 1, Integer.parseInt(((Matcher)localObject).group(3)), Integer.parseInt(((Matcher)localObject).group(4)), Integer.parseInt(((Matcher)localObject).group(5)), Integer.parseInt(((Matcher)localObject).group(6)));
      if (!TextUtils.isEmpty(((Matcher)localObject).group(8)))
      {
        StringBuilder localStringBuilder = f.l("0.");
        localStringBuilder.append(((Matcher)localObject).group(8));
        paramString.set(14, new BigDecimal(localStringBuilder.toString()).movePointRight(3).intValue());
      }
      long l1 = paramString.getTimeInMillis();
      long l2 = l1;
      if (i1 != 0) {
        l2 = l1 - i1 * 60000L;
      }
      return l2;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Invalid date/time format: ");
    ((StringBuilder)localObject).append(paramString);
    throw a1.a(((StringBuilder)localObject).toString(), null);
  }
  
  public static void M(Handler paramHandler, Runnable paramRunnable)
  {
    if (!paramHandler.getLooper().getThread().isAlive()) {
      return;
    }
    if (paramHandler.getLooper() == Looper.myLooper())
    {
      paramRunnable.run();
      return;
    }
    paramHandler.post(paramRunnable);
  }
  
  public static void N(int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    if ((paramInt1 >= 0) && (paramInt2 <= paramArrayList.size()) && (paramInt1 <= paramInt2))
    {
      if (paramInt1 != paramInt2) {
        paramArrayList.subList(paramInt1, paramInt2).clear();
      }
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static long O(long paramLong1, long paramLong2, long paramLong3)
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
  
  public static void P(long[] paramArrayOfLong, long paramLong)
  {
    boolean bool = paramLong < 1000000L;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    if ((!bool) && (paramLong % 1000000L == 0L)) {
      paramLong /= 1000000L;
    }
    while (i3 < paramArrayOfLong.length)
    {
      paramArrayOfLong[i3] /= paramLong;
      i3++;
      continue;
      if ((bool) && (1000000L % paramLong == 0L))
      {
        paramLong = 1000000L / paramLong;
        i3 = i1;
      }
      while (i3 < paramArrayOfLong.length)
      {
        paramArrayOfLong[i3] *= paramLong;
        i3++;
        continue;
        double d1 = 1000000L / paramLong;
        for (i3 = i2; i3 < paramArrayOfLong.length; i3++) {
          paramArrayOfLong[i3] = ((paramArrayOfLong[i3] * d1));
        }
      }
    }
  }
  
  public static String[] Q(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return new String[0];
    }
    return paramString.trim().split("(\\s*,\\s*)", -1);
  }
  
  public static long R(long paramLong)
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
  
  public static boolean a(Object paramObject1, Object paramObject2)
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
  
  public static int b(long[] paramArrayOfLong, long paramLong, boolean paramBoolean)
  {
    int i1 = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int i2 = i1;
    if (i1 < 0)
    {
      i2 = i1;
    }
    else
    {
      do
      {
        i2++;
      } while ((i2 < paramArrayOfLong.length) && (paramArrayOfLong[i2] == paramLong));
      if (paramBoolean) {
        i2--;
      }
    }
    return i2;
  }
  
  public static int c(List paramList, Long paramLong, boolean paramBoolean)
  {
    int i1 = Collections.binarySearch(paramList, paramLong);
    int i2 = i1;
    if (i1 < 0)
    {
      i2 = -(i1 + 2);
    }
    else
    {
      do
      {
        i2--;
      } while ((i2 >= 0) && (((Comparable)paramList.get(i2)).compareTo(paramLong) == 0));
      i2++;
    }
    i1 = i2;
    if (paramBoolean) {
      i1 = Math.max(0, i2);
    }
    return i1;
  }
  
  public static int d(n paramn, long paramLong)
  {
    int i1 = a - 1;
    int i2 = 0;
    int i3 = 0;
    while (i3 <= i1)
    {
      int i4 = i3 + i1 >>> 1;
      if (paramn.b(i4) < paramLong) {
        i3 = i4 + 1;
      } else {
        i1 = i4 - 1;
      }
    }
    i3 = i1 + 1;
    if ((i3 < a) && (paramn.b(i3) == paramLong)) {
      i1 = i3;
    } else if (i1 == -1) {
      i1 = i2;
    }
    return i1;
  }
  
  public static int e(int[] paramArrayOfInt, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = Arrays.binarySearch(paramArrayOfInt, paramInt);
    int i2 = i1;
    if (i1 < 0)
    {
      paramInt = -(i1 + 2);
    }
    else
    {
      do
      {
        i2--;
      } while ((i2 >= 0) && (paramArrayOfInt[i2] == paramInt));
      if (paramBoolean1) {
        paramInt = i2 + 1;
      } else {
        paramInt = i2;
      }
    }
    i2 = paramInt;
    if (paramBoolean2) {
      i2 = Math.max(0, paramInt);
    }
    return i2;
  }
  
  public static int f(long[] paramArrayOfLong, long paramLong, boolean paramBoolean)
  {
    int i1 = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int i2 = i1;
    if (i1 < 0)
    {
      i2 = -(i1 + 2);
    }
    else
    {
      do
      {
        i2--;
      } while ((i2 >= 0) && (paramArrayOfLong[i2] == paramLong));
      i2++;
    }
    i1 = i2;
    if (paramBoolean) {
      i1 = Math.max(0, i2);
    }
    return i1;
  }
  
  public static void g(Closeable paramCloseable)
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
  
  public static float h(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return Math.max(paramFloat2, Math.min(paramFloat1, paramFloat3));
  }
  
  public static int i(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.max(paramInt2, Math.min(paramInt1, paramInt3));
  }
  
  public static long j(long paramLong1, long paramLong2, long paramLong3)
  {
    return Math.max(paramLong2, Math.min(paramLong1, paramLong3));
  }
  
  public static boolean k(Object paramObject, Object[] paramArrayOfObject)
  {
    int i1 = paramArrayOfObject.length;
    for (int i2 = 0; i2 < i1; i2++) {
      if (a(paramArrayOfObject[i2], paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public static Handler l(Handler.Callback paramCallback)
  {
    Looper localLooper = Looper.myLooper();
    b.K(localLooper);
    return new Handler(localLooper, paramCallback);
  }
  
  public static String m(String paramString, Object... paramVarArgs)
  {
    return String.format(Locale.US, paramString, paramVarArgs);
  }
  
  public static String n(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, d.c);
  }
  
  public static int o(int paramInt)
  {
    if (paramInt != 12)
    {
      switch (paramInt)
      {
      default: 
        return 0;
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
    return 743676;
  }
  
  public static int p(int paramInt, String paramString)
  {
    paramString = Q(paramString);
    int i1 = paramString.length;
    int i2 = 0;
    int i4;
    for (int i3 = 0; i2 < i1; i3 = i4)
    {
      i4 = i3;
      if (paramInt == p.i(p.e(paramString[i2]))) {
        i4 = i3 + 1;
      }
      i2++;
    }
    return i3;
  }
  
  public static String q(int paramInt, String paramString)
  {
    String[] arrayOfString = Q(paramString);
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
      if (paramInt == p.i(p.e(str)))
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
  
  public static int r(int paramInt)
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
  
  public static int s(String paramString)
  {
    int i1 = 0;
    if (paramString == null) {
      return 0;
    }
    String[] arrayOfString = paramString.split("_", -1);
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
      paramString.getClass();
      int i3 = Integer.parseInt(paramString);
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
  
  public static long t(long paramLong, float paramFloat)
  {
    if (paramFloat == 1.0F) {
      return paramLong;
    }
    return Math.round(paramLong * paramFloat);
  }
  
  public static long u(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      paramLong = System.currentTimeMillis();
    } else {
      paramLong += SystemClock.elapsedRealtime();
    }
    return paramLong;
  }
  
  public static int v(int paramInt)
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
          return 805306368;
        }
        return 536870912;
      }
      return 2;
    }
    return 3;
  }
  
  public static int w(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 2)
    {
      int i1 = paramInt2;
      if (paramInt1 != 3)
      {
        if (paramInt1 != 4)
        {
          if (paramInt1 == 268435456) {
            break label59;
          }
          if (paramInt1 != 536870912)
          {
            if (paramInt1 != 805306368) {
              throw new IllegalArgumentException();
            }
          }
          else {
            return paramInt2 * 3;
          }
        }
        i1 = paramInt2 * 4;
      }
      else
      {
        return i1;
      }
    }
    label59:
    return paramInt2 * 2;
  }
  
  public static long x(long paramLong, float paramFloat)
  {
    if (paramFloat == 1.0F) {
      return paramLong;
    }
    return Math.round(paramLong / paramFloat);
  }
  
  public static int y(int paramInt)
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
  
  public static String[] z()
  {
    Object localObject = Resources.getSystem().getConfiguration();
    int i1 = a;
    int i2 = 0;
    if (i1 >= 24)
    {
      localObject = ((Configuration)localObject).getLocales().toLanguageTags().split(",", -1);
    }
    else
    {
      localObject = locale;
      if (i1 >= 21) {
        localObject = ((Locale)localObject).toLanguageTag();
      } else {
        localObject = ((Locale)localObject).toString();
      }
      localObject = new String[] { localObject };
    }
    while (i2 < localObject.length)
    {
      localObject[i2] = J(localObject[i2]);
      i2++;
    }
    return (String[])localObject;
  }
}

/* Location:
 * Qualified Name:     v5.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */