package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFb1fSDK
  extends HashMap<String, Object>
{
  private static long AFInAppEventParameterName = 0L;
  private static int AFInAppEventType = 0;
  private static char[] AFLogger;
  private static int afDebugLog = 0;
  private static int afErrorLog = 0;
  private static int afErrorLogForExcManagerOnly = (afErrorLog + 99) % 128;
  private static boolean afInfoLog;
  private static boolean afRDLog;
  private static char valueOf;
  private final Map<String, Object> AFKeystoreWrapper;
  private final Context values;
  
  static
  {
    valueOf();
    Color.argb(0, 0, 0, 0);
    TextUtils.lastIndexOf("", '0', 0);
    TextUtils.indexOf("", '0', 0, 0);
    View.getDefaultSize(0, 0);
    Drawable.resolveOpacity(0, 0);
    ViewConfiguration.getWindowTouchSlop();
    TextUtils.indexOf("", '0');
    ExpandableListView.getPackedPositionForChild(0, 0);
    ViewConfiguration.getJumpTapTimeout();
    KeyEvent.getDeadChar(0, 0);
    ExpandableListView.getPackedPositionGroup(0L);
    TextUtils.getOffsetAfter("", 0);
  }
  
  public AFb1fSDK(Map<String, Object> paramMap, Context paramContext)
  {
    AFKeystoreWrapper = paramMap;
    values = paramContext;
    put(AFInAppEventType(), AFKeystoreWrapper());
  }
  
  @NonNull
  private String AFInAppEventType()
  {
    afErrorLogForExcManagerOnly = (afErrorLog + 47) % 128;
    String str;
    try
    {
      localObject1 = Integer.toString(Build.VERSION.SDK_INT);
      Object localObject2 = AFKeystoreWrapper;
      i = View.resolveSizeAndState(0, 0, 0);
      c = (char)(-1 - TextUtils.lastIndexOf("", '0'));
      localObject4 = new Object[1];
      AFInAppEventType("흓鼋屖꿣", "八鬵᳑覨㑖抗便လ헭ꎭ좠囡", i, "\000\000\000\000", c, (Object[])localObject4);
      str = ((Map)localObject2).get(((String)localObject4[0]).intern()).toString();
      localObject4 = AFKeystoreWrapper;
      i = Color.red(0);
      c = (char)(View.MeasureSpec.getSize(0) + 19168);
      localObject2 = new Object[1];
      AFInAppEventType("ᆎ䐡핊", "；㈽㎐嘘㲍", -1706811119 - i, "\000\000\000\000", c, (Object[])localObject2);
      localObject4 = ((Map)localObject4).get(((String)localObject2[0]).intern()).toString();
      localObject2 = localObject4;
      if (localObject4 == null)
      {
        i = Process.myTid();
        localObject2 = new Object[1];
        values(null, null, "", 127 - (i >> 22), (Object[])localObject2);
        localObject2 = ((String)localObject2[0]).intern();
      }
    }
    catch (Exception localException)
    {
      break label346;
    }
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>(str);
    ((StringBuilder)localObject4).reverse();
    Object localObject3 = AFKeystoreWrapper(new String[] { localObject1, localException, localObject4.toString() });
    int j = ((StringBuilder)localObject3).length();
    int i = j;
    if (j > 4)
    {
      ((StringBuilder)localObject3).delete(4, j);
      afErrorLogForExcManagerOnly = (afErrorLog + 21) % 128;
    }
    else
    {
      while (i < 4)
      {
        i++;
        ((StringBuilder)localObject3).append('1');
      }
    }
    i = ViewConfiguration.getWindowTouchSlop();
    localObject4 = new Object[1];
    values(null, null, "", (i >> 8) + 127, (Object[])localObject4);
    ((StringBuilder)localObject3).insert(0, ((String)localObject4[0]).intern());
    localObject3 = localObject3.toString();
    return (String)localObject3;
    label346:
    i = KeyEvent.keyCodeFromString("");
    char c = (char)((Process.getThreadPriority(0) + 20 >> 6) + 27895);
    localObject4 = new Object[1];
    AFInAppEventType("哥Њ핬", "ꐙ⺸뙸ꉒ虂䚍咕ᅩ孽⻀쟣ퟏ늦ꝴ瑠ȫ䅘ᅫẵ䱷킷舴኎⪒煨串ᴆ됅Ꮚ古垃끹藘녧쒐蟉乖", i, "\000\000\000\000", c, (Object[])localObject4);
    AFLogger.afErrorLogForExcManagerOnly(((String)localObject4[0]).intern(), (Throwable)localObject3);
    localObject4 = new StringBuilder();
    i = ViewConfiguration.getFadingEdgeLength();
    Object localObject1 = new Object[1];
    values(null, null, "", 127 - (i >> 16), (Object[])localObject1);
    ((StringBuilder)localObject4).append(((String)localObject1[0]).intern());
    ((StringBuilder)localObject4).append(localObject3);
    AFLogger.afRDLog(localObject4.toString());
    i = TextUtils.lastIndexOf("", '0', 0, 0);
    localObject3 = new Object[1];
    values(null, null, "", i + 128, (Object[])localObject3);
    return ((String)localObject3[0]).intern();
  }
  
  private static void AFInAppEventType(String arg0, String paramString2, int paramInt, String paramString3, char paramChar, Object[] paramArrayOfObject)
  {
    Object localObject = paramString3;
    if (paramString3 != null) {
      localObject = paramString3.toCharArray();
    }
    localObject = (char[])localObject;
    paramString3 = paramString2;
    if (paramString2 != null) {
      paramString3 = paramString2.toCharArray();
    }
    paramString3 = (char[])paramString3;
    paramString2 = ???;
    if (??? != null) {
      paramString2 = ???.toCharArray();
    }
    paramString2 = (char[])paramString2;
    synchronized (AFg1vSDK.valueOf)
    {
      char[] arrayOfChar = (char[])paramString2.clone();
      localObject = (char[])((char[])localObject).clone();
      arrayOfChar[0] = ((char)(char)(paramChar ^ arrayOfChar[0]));
      localObject[2] = ((char)(char)(localObject[2] + (char)paramInt));
      paramInt = paramString3.length;
      paramString2 = new char[paramInt];
      AFg1vSDK.values = 0;
      int i = AFg1vSDK.values;
      if (i < paramInt)
      {
        paramChar = (i + 3) % 4;
        int j = arrayOfChar[(i % 4)];
        i = localObject[((i + 2) % 4)];
        j = (char)((j * 32718 + i) % 65535);
        AFg1vSDK.AFInAppEventParameterName = (char)j;
        localObject[paramChar] = ((char)(char)((arrayOfChar[paramChar] * '翎' + i) / 65535));
        arrayOfChar[paramChar] = ((char)j);
        paramChar = AFg1vSDK.values;
        paramString2[paramChar] = ((char)(char)(int)(j ^ paramString3[paramChar] ^ AFInAppEventParameterName ^ AFInAppEventType ^ valueOf));
        AFg1vSDK.values = paramChar + '\001';
      }
    }
  }
  
  private String AFKeystoreWrapper()
  {
    Object localObject5;
    Object localObject2;
    try
    {
      Object localObject1 = AFKeystoreWrapper;
      i = Color.rgb(0, 0, 0);
      c = (char)(ViewConfiguration.getTapTimeout() >> 16);
      localObject5 = new Object[1];
      AFInAppEventType("흓鼋屖꿣", "八鬵᳑覨㑖抗便လ헭ꎭ좠囡", i + 16777216, "\000\000\000\000", c, (Object[])localObject5);
      localObject1 = ((Map)localObject1).get(((String)localObject5[0]).intern()).toString();
      localObject5 = AFKeystoreWrapper;
      i = Gravity.getAbsoluteGravity(0, 0);
      c = (char)((AudioTrack.getMinVolume() < 0.0F) + true);
      localObject7 = new Object[1];
      AFInAppEventType("ம㗫⺎縻", "٧?鮉팽㘺⋢쯽ḙ偓笕Ἁ൞瀩盓璺", -1909069045 + i, "\000\000\000\000", c, (Object[])localObject7);
      localObject5 = ((Map)localObject5).get(((String)localObject7[0]).intern()).toString();
      i = TextUtils.getOffsetBefore("", 0);
      localObject7 = new Object[1];
      values(null, null, "  ", i + 127, (Object[])localObject7);
      localObject7 = ((String)localObject7[0]).intern();
      i = ViewConfiguration.getTouchSlop();
      localObject8 = new Object[1];
      values(null, null, "¢¡", (i >> 8) + 127, (Object[])localObject8);
      localObject7 = ((String)localObject7).replaceAll(((String)localObject8[0]).intern(), "");
      localObject8 = new java/lang/StringBuilder;
      ((StringBuilder)localObject8).<init>();
      ((StringBuilder)localObject8).append((String)localObject1);
      ((StringBuilder)localObject8).append((String)localObject5);
      ((StringBuilder)localObject8).append((String)localObject7);
      localObject1 = AFc1nSDK.AFInAppEventType(localObject8.toString());
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      ((StringBuilder)localObject5).append("");
      ((StringBuilder)localObject5).append(((String)localObject1).substring(0, 16));
      localObject1 = localObject5.toString();
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        i = View.resolveSize(0, 0);
        localObject5 = new Object[1];
        values(null, null, "¤¥¤£ £", 127 - i, (Object[])localObject5);
        AFLogger.afErrorLogForExcManagerOnly(((String)localObject5[0]).intern(), localException1);
        localObject7 = new StringBuilder();
        i = MotionEvent.axisFromString("");
        c = (char)((ViewConfiguration.getScrollFriction() < 0.0F) + true);
        localObject5 = new Object[1];
        AFInAppEventType("?䅗", "잹揪볭屸佢묜⋙?똶ᑎ팫鄩뿖럑⟀꾑偬뤮?裣瞖Èꈍ羬덭莌㰼?︚ग㖘쿌峺′ꝿ졣紭੐걏遲괐㥐", -1 - i, "\000\000\000\000", c, (Object[])localObject5);
        ((StringBuilder)localObject7).append(((String)localObject5[0]).intern());
        ((StringBuilder)localObject7).append(localException1);
        AFLogger.afRDLog(localObject7.toString());
        localObject5 = new StringBuilder();
        ((StringBuilder)localObject5).append("");
        i = View.MeasureSpec.getMode(0);
        c = (char)(ExpandableListView.getPackedPositionGroup(0L) + 3830);
        localObject2 = new Object[1];
        AFInAppEventType("鵑ﶭᐎ", "缹ᙽ?ⱓ躗ꭜ㮥ពㅓ煮㖗｣?筗", i, "\000\000\000\000", c, (Object[])localObject2);
        ((StringBuilder)localObject5).append(((String)localObject2[0]).intern());
        localObject2 = localObject5.toString();
      }
    }
    for (;;)
    {
      try
      {
        localObject7 = values;
        localObject8 = new android/content/IntentFilter;
        i = Process.getThreadPriority(0);
        c = (char)(true - (ViewConfiguration.getGlobalActionKeyTimeout() < 0L));
        localObject5 = new Object[1];
        AFInAppEventType("ꇻיꒉ儇", "識ૐ豦᳣㐲ﬃ캊㇭筇略挏ퟹꔃや㛋ꪑﱊ⭓栂ॄ밝ᓕ頏ꡯ룍륍댉?䳟됅?讣蛣", -1996105311 + (i + 20 >> 6), "\000\000\000\000", c, (Object[])localObject5);
        ((IntentFilter)localObject8).<init>(((String)localObject5[0]).intern());
        localObject5 = ((Context)localObject7).registerReceiver(null, (IntentFilter)localObject8);
        i = 62836;
        if (localObject5 == null) {
          break;
        }
        i = afErrorLog + 79;
        afErrorLogForExcManagerOnly = i % 128;
        if (i % 2 == 0)
        {
          i = 110 / Color.argb(0, 1, 0, 0);
          localObject7 = new Object[1];
          values(null, null, "¤¦", i, (Object[])localObject7);
          i = ((Intent)localObject5).getIntExtra(((String)localObject7[0]).intern(), 10427);
        }
      }
      catch (Exception localException2)
      {
        break label1329;
      }
      i = Color.argb(0, 0, 0, 0);
      localObject7 = new Object[1];
      values(null, null, "¤¦", i + 127, (Object[])localObject7);
      i = localException2.getIntExtra(((String)localObject7[0]).intern(), 62836);
    }
    Object localObject6 = values.getApplicationInfo().nativeLibraryDir;
    if (localObject6 != null)
    {
      j = TextUtils.getOffsetAfter("", 0);
      localObject7 = new Object[1];
      values(null, null, "§", j + 127, (Object[])localObject7);
      if (((String)localObject6).contains(((String)localObject7[0]).intern()))
      {
        j = 1;
        break label785;
      }
    }
    int j = 0;
    label785:
    localObject6 = values;
    int k = ViewConfiguration.getJumpTapTimeout();
    Object localObject7 = new Object[1];
    values(null, null, "¨¨", 127 - (k >> 16), (Object[])localObject7);
    k = ((SensorManager)((Context)localObject6).getSystemService(((String)localObject7[0]).intern())).getSensorList(-1).size();
    localObject6 = new java/lang/StringBuilder;
    ((StringBuilder)localObject6).<init>();
    int m = TextUtils.indexOf("", '0');
    char c = (char)((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 39337);
    localObject7 = new Object[1];
    AFInAppEventType("底싔ꥒ", "숿", m + 1388500063, "\000\000\000\000", c, (Object[])localObject7);
    ((StringBuilder)localObject6).append(((String)localObject7[0]).intern());
    ((StringBuilder)localObject6).append(i);
    long l = Process.getElapsedCpuTime();
    c = (char)(View.resolveSize(0, 0) + 1740);
    localObject7 = new Object[1];
    AFInAppEventType("ꠖ핤챻匆", "볒橉", true - (l < 0L), "\000\000\000\000", c, (Object[])localObject7);
    ((StringBuilder)localObject6).append(((String)localObject7[0]).intern());
    ((StringBuilder)localObject6).append(j);
    int i = TextUtils.lastIndexOf("", '0', 0);
    c = (char)(true - (ViewConfiguration.getZoomControlsTimeout() < 0L));
    localObject7 = new Object[1];
    AFInAppEventType("蚨抓칃", "峾텓", -1 - i, "\000\000\000\000", c, (Object[])localObject7);
    ((StringBuilder)localObject6).append(((String)localObject7[0]).intern());
    ((StringBuilder)localObject6).append(k);
    l = SystemClock.currentThreadTimeMillis();
    c = (char)(Drawable.resolveOpacity(0, 0) + 43206);
    localObject7 = new Object[1];
    AFInAppEventType("嬃긌웇䒨", "템", (l < -1L) - true, "\000\000\000\000", c, (Object[])localObject7);
    ((StringBuilder)localObject6).append(((String)localObject7[0]).intern());
    ((StringBuilder)localObject6).append(AFKeystoreWrapper.size());
    localObject6 = localObject6.toString();
    Object localObject8 = new java/lang/StringBuilder;
    ((StringBuilder)localObject8).<init>();
    ((StringBuilder)localObject8).append((String)localObject2);
    byte[] arrayOfByte = AFa1ySDK.AFInAppEventParameterName(AFa1ySDK.valueOf((String)localObject6));
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    j = arrayOfByte.length;
    for (i = 0; i < j; i++)
    {
      afErrorLogForExcManagerOnly = (afErrorLog + 65) % 128;
      localObject7 = Integer.toHexString(arrayOfByte[i]);
      k = ((String)localObject7).length();
      localObject6 = localObject7;
      if (k == 1)
      {
        k = afErrorLogForExcManagerOnly + 35;
        afErrorLog = k % 128;
        if (k % 2 != 0)
        {
          localObject6 = "0".concat((String)localObject7);
          try
          {
            throw new ArithmeticException("divide by zero");
          }
          finally {}
        }
        localObject6 = "0".concat((String)localObject7);
      }
      localStringBuilder.append((String)localObject6);
    }
    ((StringBuilder)localObject8).append(localStringBuilder.toString());
    localObject6 = localObject8.toString();
    Object localObject4 = localObject6;
    return (String)localObject4;
    label1329:
    i = ViewConfiguration.getKeyRepeatTimeout();
    localObject7 = new Object[1];
    values(null, null, "¤£ £", 127 - (i >> 16), (Object[])localObject7);
    AFLogger.afErrorLogForExcManagerOnly(((String)localObject7[0]).intern(), (Throwable)localObject6);
    localObject8 = new StringBuilder();
    i = Color.argb(0, 0, 0, 0);
    c = (char)(18241 - Color.argb(0, 0, 0, 0));
    localObject7 = new Object[1];
    AFInAppEventType("?䅗", "잹揪볭屸佢묜⋙?똶ᑎ팫鄩뿖럑⟀꾑偬뤮?裣瞖Èꈍ羬덭莌㰼?︚ग㖘쿌峺′ꝿ졣紭੐걏遲괐㥐", i, "\000\000\000\000", c, (Object[])localObject7);
    ((StringBuilder)localObject8).append(((String)localObject7[0]).intern());
    ((StringBuilder)localObject8).append(localObject6);
    AFLogger.afRDLog(localObject8.toString());
    localObject6 = new StringBuilder();
    ((StringBuilder)localObject6).append((String)localObject4);
    l = ViewConfiguration.getGlobalActionKeyTimeout();
    c = (char)((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 60931);
    localObject4 = new Object[1];
    AFInAppEventType("翟ᎅΠ燮", "䟼绗ᥓ鍑高輕倢欬᜛蕣塟較", (l < 0L) - true, "\000\000\000\000", c, (Object[])localObject4);
    ((StringBuilder)localObject6).append(((String)localObject4[0]).intern());
    localObject4 = localObject6.toString();
    return (String)localObject4;
  }
  
  private static StringBuilder AFKeystoreWrapper(@NonNull String... paramVarArgs)
  {
    Object localObject = new ArrayList();
    int i = paramVarArgs.length;
    i = 0;
    int j;
    while (i < 3)
    {
      j = afErrorLog + 93;
      afErrorLogForExcManagerOnly = j % 128;
      if (j % 2 == 0)
      {
        ((List)localObject).add(Integer.valueOf(paramVarArgs[i].length()));
        i += 34;
      }
      else
      {
        ((List)localObject).add(Integer.valueOf(paramVarArgs[i].length()));
        i++;
      }
    }
    Collections.sort((List)localObject);
    int k = ((Integer)((List)localObject).get(0)).intValue();
    StringBuilder localStringBuilder = new StringBuilder();
    for (i = 0; i < k; i++)
    {
      localObject = null;
      for (j = 0; j < 3; j++)
      {
        int m = afErrorLog + 115;
        afErrorLogForExcManagerOnly = m % 128;
        if (m % 2 == 0)
        {
          i = paramVarArgs[j].charAt(i);
          throw new ArithmeticException("divide by zero");
        }
        m = paramVarArgs[j].charAt(i);
        int n = m;
        if (localObject != null) {
          m = n ^ ((Number)localObject).intValue();
        }
        localObject = Integer.valueOf(m);
      }
      localStringBuilder.append(Integer.toHexString(((Number)localObject).intValue()));
    }
    return localStringBuilder;
  }
  
  public static void valueOf()
  {
    AFInAppEventType = 0;
    valueOf = (char)35907;
    AFInAppEventParameterName = 0L;
    afRDLog = true;
    AFLogger = new char[] { 175, 176, 192, 163, 179, 162, 165, 204, 198, 199, 194, 202, 205, 197, 129, 200, 207, 211, 213, 218, 216, 201, 217, 196, 209, 208, 155, 154, 151, 143, 146, 147, 142, 139, 183, 214, 215, 206, 153, 212 };
    afInfoLog = true;
    afDebugLog = 97;
  }
  
  private static void values(int[] paramArrayOfInt, String arg1, String paramString2, int paramInt, Object[] paramArrayOfObject)
  {
    Object localObject = paramString2;
    if (paramString2 != null) {
      localObject = paramString2.getBytes("ISO-8859-1");
    }
    localObject = (byte[])localObject;
    paramString2 = ???;
    if (??? != null) {
      paramString2 = ???.toCharArray();
    }
    char[] arrayOfChar = (char[])paramString2;
    int i;
    int j;
    int k;
    int m;
    synchronized (AFg1tSDK.AFKeystoreWrapper)
    {
      paramString2 = AFLogger;
      i = afDebugLog;
      if (afInfoLog)
      {
        j = localObject.length;
        AFg1tSDK.values = j;
        paramArrayOfInt = new char[j];
        AFg1tSDK.valueOf = 0;
        if (AFg1tSDK.valueOf < AFg1tSDK.values)
        {
          j = AFg1tSDK.valueOf;
          k = AFg1tSDK.values;
          m = AFg1tSDK.valueOf;
          paramArrayOfInt[j] = ((char)(char)(paramString2[(localObject[(k - 1 - m)] + paramInt)] - i));
          AFg1tSDK.valueOf = m + 1;
        }
      }
    }
  }
  
  public static final class AFa1ySDK
  {
    public final int AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final int AFKeystoreWrapper;
    public final long valueOf;
    
    public AFa1ySDK() {}
    
    public AFa1ySDK(String paramString, int paramInt1, int paramInt2, long paramLong)
    {
      AFInAppEventType = paramString;
      AFInAppEventParameterName = paramInt1;
      AFKeystoreWrapper = paramInt2;
      valueOf = paramLong;
    }
    
    public static byte[] AFInAppEventParameterName(@NonNull byte[] paramArrayOfByte)
    {
      for (int i = 0; i < paramArrayOfByte.length; i++) {
        paramArrayOfByte[i] = ((byte)(byte)(paramArrayOfByte[i] ^ i % 2 + 42));
      }
      return paramArrayOfByte;
    }
    
    @NonNull
    public static byte[] valueOf(@NonNull String paramString)
    {
      return paramString.getBytes(Charset.defaultCharset());
    }
    
    public final String AFInAppEventType()
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("sdk_ver", AFInAppEventType);
        localJSONObject.put("min", AFInAppEventParameterName);
        localJSONObject.put("expire", AFKeystoreWrapper);
        localJSONObject.put("ttl", valueOf);
        return localJSONObject.toString();
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (AFa1ySDK.class == paramObject.getClass()))
      {
        paramObject = (AFa1ySDK)paramObject;
        if ((AFInAppEventParameterName == AFInAppEventParameterName) && (AFKeystoreWrapper == AFKeystoreWrapper) && (valueOf == valueOf))
        {
          String str = AFInAppEventType;
          if ((str != null) && (str.equals(AFInAppEventType))) {
            return true;
          }
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      String str = AFInAppEventType;
      int i;
      if (str != null) {
        i = str.hashCode();
      } else {
        i = 0;
      }
      return ((i * 31 + AFInAppEventParameterName) * 31 + AFKeystoreWrapper) * 31 + (int)valueOf;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1fSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */