package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

public final class AFb1rSDK
  implements AFb1tSDK
{
  private static char[] afDebugLog = { 63, 132, 130, 132, 133 };
  private static int afErrorLog = 1;
  private static int afInfoLog;
  private List<String> AFInAppEventParameterName = new ArrayList();
  @NonNull
  private final Map<String, Object> AFInAppEventType = new HashMap();
  private boolean AFKeystoreWrapper = false;
  private String AFLogger = "-1";
  private boolean afRDLog = true ^ AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
  private boolean valueOf = true;
  private int values = 0;
  
  private void AFInAppEventType(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    label155:
    try
    {
      AFInAppEventType.put("sdk_version", paramString1);
      if (paramString2 != null) {
        try
        {
          afErrorLog = (afInfoLog + 19) % 128;
          if (paramString2.length() > 0) {
            AFInAppEventType.put("devkey", paramString2);
          }
        }
        finally
        {
          break label155;
        }
      }
      if ((paramString3 != null) && (paramString3.length() > 0)) {
        AFInAppEventType.put("originalAppsFlyerId", paramString3);
      }
      if (paramString4 != null)
      {
        int i = afInfoLog + 109;
        afErrorLog = i % 128;
        if (i % 2 != 0)
        {
          if (paramString4.length() > 0) {
            AFInAppEventType.put("uid", paramString4);
          }
        }
        else {
          throw null;
        }
      }
      afInfoLog = (afErrorLog + 79) % 128;
      return;
    }
    finally {}
    throw paramString1;
  }
  
  private boolean afDebugLog()
  {
    if (afRDLog)
    {
      int i = (afErrorLog + 29) % 128;
      afInfoLog = i;
      if (!valueOf)
      {
        i += 13;
        afErrorLog = i % 128;
        if (i % 2 == 0)
        {
          boolean bool = AFKeystoreWrapper;
          throw new ArithmeticException("divide by zero");
        }
        if (AFKeystoreWrapper != true) {}
      }
      else
      {
        i = afErrorLog + 83;
        afInfoLog = i % 128;
        if (i % 2 != 0) {
          throw new ArithmeticException("divide by zero");
        }
        return true;
      }
    }
    return false;
  }
  
  private void afErrorLog()
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      AFInAppEventParameterName = localArrayList;
      values = 0;
      afErrorLog = (afInfoLog + 95) % 128;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @NonNull
  private Map<String, Object> afRDLog()
  {
    try
    {
      afErrorLog = (afInfoLog + 49) % 128;
      AFInAppEventType.put("data", AFInAppEventParameterName);
      afErrorLog();
      Map localMap = AFInAppEventType;
      afInfoLog = (afErrorLog + 15) % 128;
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  private void valueOf(String paramString, PackageManager paramPackageManager, AFe1wSDK paramAFe1wSDK)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 85	com/appsflyer/internal/AFb1rSDK:afErrorLog	I
    //   5: bipush 85
    //   7: iadd
    //   8: istore 4
    //   10: iload 4
    //   12: sipush 128
    //   15: irem
    //   16: putstatic 83	com/appsflyer/internal/AFb1rSDK:afInfoLog	I
    //   19: iload 4
    //   21: iconst_2
    //   22: irem
    //   23: ifeq +40 -> 63
    //   26: invokestatic 60	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   29: astore_1
    //   30: aload_1
    //   31: ldc 116
    //   33: invokevirtual 120	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   36: astore_1
    //   37: aload_0
    //   38: getfield 50	com/appsflyer/internal/AFb1rSDK:AFInAppEventType	Ljava/util/Map;
    //   41: invokeinterface 123 1 0
    //   46: new 100	java/lang/ArithmeticException
    //   49: dup
    //   50: ldc 102
    //   52: invokespecial 105	java/lang/ArithmeticException:<init>	(Ljava/lang/String;)V
    //   55: athrow
    //   56: astore_1
    //   57: aload_1
    //   58: athrow
    //   59: astore_1
    //   60: goto +223 -> 283
    //   63: invokestatic 60	com/appsflyer/AppsFlyerProperties:getInstance	()Lcom/appsflyer/AppsFlyerProperties;
    //   66: astore 5
    //   68: aload 5
    //   70: ldc 116
    //   72: invokevirtual 120	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   75: astore 6
    //   77: aload_0
    //   78: getfield 50	com/appsflyer/internal/AFb1rSDK:AFInAppEventType	Ljava/util/Map;
    //   81: invokeinterface 123 1 0
    //   86: aload 6
    //   88: ifnull +31 -> 119
    //   91: aload_0
    //   92: getfield 50	com/appsflyer/internal/AFb1rSDK:AFInAppEventType	Ljava/util/Map;
    //   95: astore_1
    //   96: new 125	org/json/JSONObject
    //   99: astore_2
    //   100: aload_2
    //   101: aload 6
    //   103: invokespecial 126	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   106: aload_1
    //   107: aload_2
    //   108: invokestatic 131	com/appsflyer/internal/AFa1rSDK:valueOf	(Lorg/json/JSONObject;)Ljava/util/Map;
    //   111: invokeinterface 135 2 0
    //   116: goto +148 -> 264
    //   119: invokestatic 140	com/appsflyer/internal/AFa1eSDK:valueOf	()Lcom/appsflyer/internal/AFa1eSDK;
    //   122: astore 6
    //   124: aload_0
    //   125: aload 5
    //   127: ldc -114
    //   129: invokevirtual 120	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   132: aload_3
    //   133: getfield 146	com/appsflyer/internal/AFe1wSDK:values	Ljava/lang/String;
    //   136: aload 6
    //   138: getfield 147	com/appsflyer/internal/AFa1eSDK:AFLogger	Ljava/lang/String;
    //   141: invokespecial 150	com/appsflyer/internal/AFb1rSDK:values	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   144: new 152	java/lang/StringBuilder
    //   147: astore_3
    //   148: aload_3
    //   149: ldc -102
    //   151: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   154: aload_3
    //   155: getstatic 156	com/appsflyer/internal/AFa1eSDK:values	Ljava/lang/String;
    //   158: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: aload_0
    //   163: aload_3
    //   164: invokevirtual 164	java/lang/Object:toString	()Ljava/lang/String;
    //   167: aload 6
    //   169: invokevirtual 167	com/appsflyer/internal/AFa1eSDK:AFInAppEventType	()Lcom/appsflyer/internal/AFc1xSDK;
    //   172: invokeinterface 173 1 0
    //   177: getfield 175	com/appsflyer/internal/AFe1wSDK:AFInAppEventParameterName	Ljava/lang/String;
    //   180: aload 5
    //   182: ldc -79
    //   184: invokevirtual 120	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   187: aload 5
    //   189: ldc 97
    //   191: invokevirtual 120	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   194: invokespecial 179	com/appsflyer/internal/AFb1rSDK:AFInAppEventType	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   197: aload_0
    //   198: aload_1
    //   199: aload_2
    //   200: aload_1
    //   201: iconst_0
    //   202: invokevirtual 185	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   205: getfield 190	android/content/pm/PackageInfo:versionCode	I
    //   208: invokestatic 193	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   211: aload 5
    //   213: ldc -61
    //   215: invokevirtual 120	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   218: aload 5
    //   220: ldc -59
    //   222: invokevirtual 120	com/appsflyer/AppsFlyerProperties:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   225: invokespecial 199	com/appsflyer/internal/AFb1rSDK:values	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   228: new 125	org/json/JSONObject
    //   231: astore_1
    //   232: aload_1
    //   233: aload_0
    //   234: getfield 50	com/appsflyer/internal/AFb1rSDK:AFInAppEventType	Ljava/util/Map;
    //   237: invokespecial 201	org/json/JSONObject:<init>	(Ljava/util/Map;)V
    //   240: aload 5
    //   242: ldc 116
    //   244: aload_1
    //   245: invokevirtual 202	org/json/JSONObject:toString	()Ljava/lang/String;
    //   248: invokevirtual 206	com/appsflyer/AppsFlyerProperties:set	(Ljava/lang/String;Ljava/lang/String;)V
    //   251: getstatic 83	com/appsflyer/internal/AFb1rSDK:afInfoLog	I
    //   254: bipush 23
    //   256: iadd
    //   257: sipush 128
    //   260: irem
    //   261: putstatic 85	com/appsflyer/internal/AFb1rSDK:afErrorLog	I
    //   264: aload_0
    //   265: getfield 50	com/appsflyer/internal/AFb1rSDK:AFInAppEventType	Ljava/util/Map;
    //   268: ldc -48
    //   270: aload_0
    //   271: getfield 54	com/appsflyer/internal/AFb1rSDK:AFLogger	Ljava/lang/String;
    //   274: invokeinterface 81 3 0
    //   279: pop
    //   280: aload_0
    //   281: monitorexit
    //   282: return
    //   283: aload_0
    //   284: monitorexit
    //   285: aload_1
    //   286: athrow
    //   287: astore_1
    //   288: goto -24 -> 264
    //   291: astore_1
    //   292: goto -64 -> 228
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	295	0	this	AFb1rSDK
    //   0	295	1	paramString	String
    //   0	295	2	paramPackageManager	PackageManager
    //   0	295	3	paramAFe1wSDK	AFe1wSDK
    //   8	15	4	i	int
    //   66	175	5	localAppsFlyerProperties	AppsFlyerProperties
    //   75	93	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   46	56	56	finally
    //   2	19	59	finally
    //   26	46	59	finally
    //   57	59	59	finally
    //   63	86	59	finally
    //   119	197	59	finally
    //   228	264	59	finally
    //   264	280	59	finally
    //   91	116	287	finally
    //   197	228	291	finally
  }
  
  private static String[] valueOf(String paramString, StackTraceElement[] paramArrayOfStackTraceElement)
  {
    if (paramArrayOfStackTraceElement == null)
    {
      i = afInfoLog + 89;
      afErrorLog = i % 128;
      if (i % 2 == 0)
      {
        paramArrayOfStackTraceElement = new String[0];
        paramArrayOfStackTraceElement[0] = paramString;
        return paramArrayOfStackTraceElement;
      }
      return new String[] { paramString };
    }
    int j = paramArrayOfStackTraceElement.length;
    int i = 1;
    String[] arrayOfString = new String[j + 1];
    arrayOfString[0] = paramString;
    while (i < paramArrayOfStackTraceElement.length)
    {
      j = afInfoLog + 5;
      afErrorLog = j % 128;
      if (j % 2 == 0)
      {
        arrayOfString[i] = paramArrayOfStackTraceElement[i].toString();
        i += 85;
      }
      else
      {
        arrayOfString[i] = paramArrayOfStackTraceElement[i].toString();
        i++;
      }
    }
    afErrorLog = (afInfoLog + 93) % 128;
    return arrayOfString;
  }
  
  private Map<String, Object> values(String paramString, PackageManager paramPackageManager, AFc1xSDK paramAFc1xSDK)
  {
    int i = afInfoLog + 29;
    afErrorLog = i % 128;
    valueOf(paramString, paramPackageManager, paramAFc1xSDK.afWarnLog());
    if (i % 2 != 0) {
      return afRDLog();
    }
    afRDLog();
    throw null;
  }
  
  private void values(String paramString1, String paramString2, String paramString3)
  {
    label269:
    try
    {
      Map localMap = AFInAppEventType;
      Object[] arrayOfObject = new Object[1];
      values("\001\000\001\001\000", true, new int[] { 0, 5, 27, 0 }, arrayOfObject);
      localMap.put(((String)arrayOfObject[0]).intern(), Build.BRAND);
      AFInAppEventType.put("model", Build.MODEL);
      AFInAppEventType.put("platform", "Android");
      AFInAppEventType.put("platform_version", Build.VERSION.RELEASE);
      if ((paramString1 != null) && (paramString1.length() > 0)) {
        AFInAppEventType.put("advertiserId", paramString1);
      }
      if (paramString2 != null) {
        try
        {
          afErrorLog = (afInfoLog + 85) % 128;
          if (paramString2.length() > 0) {
            AFInAppEventType.put("imei", paramString2);
          }
        }
        finally
        {
          break label269;
        }
      }
      if (paramString3 != null)
      {
        afInfoLog = (afErrorLog + 7) % 128;
        i = paramString3.length();
        if (i > 0)
        {
          afErrorLog = (afInfoLog + 9) % 128;
          AFInAppEventType.put("android_id", paramString3);
        }
      }
      int i = afInfoLog + 17;
      afErrorLog = i % 128;
      if (i % 2 == 0) {
        try
        {
          throw new ArithmeticException("divide by zero");
        }
        finally {}
      }
      return;
    }
    finally {}
    throw paramString1;
  }
  
  private void values(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramString1 != null) {}
    try
    {
      if (paramString1.length() > 0)
      {
        AFInAppEventType.put("app_id", paramString1);
        try
        {
          afErrorLog = (afInfoLog + 81) % 128;
        }
        finally
        {
          break label174;
        }
      }
      if (paramString2 != null)
      {
        int i = paramString2.length();
        if (i > 0)
        {
          afErrorLog = (afInfoLog + 125) % 128;
          AFInAppEventType.put("app_version", paramString2);
        }
      }
      if ((paramString3 != null) && (paramString3.length() > 0)) {
        AFInAppEventType.put("channel", paramString3);
      }
      if (paramString4 != null)
      {
        afInfoLog = (afErrorLog + 95) % 128;
        if (paramString4.length() > 0) {
          AFInAppEventType.put("preInstall", paramString4);
        }
      }
    }
    finally
    {
      return;
    }
    afErrorLog = (afInfoLog + 99) % 128;
    return;
    label174:
    throw paramString1;
  }
  
  /* Error */
  private void values(String paramString1, String paramString2, String... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 257	com/appsflyer/internal/AFb1rSDK:afDebugLog	()Z
    //   6: ifeq +293 -> 299
    //   9: getstatic 85	com/appsflyer/internal/AFb1rSDK:afErrorLog	I
    //   12: bipush 75
    //   14: iadd
    //   15: istore 4
    //   17: iload 4
    //   19: sipush 128
    //   22: irem
    //   23: putstatic 83	com/appsflyer/internal/AFb1rSDK:afInfoLog	I
    //   26: iload 4
    //   28: iconst_2
    //   29: irem
    //   30: ifeq +26 -> 56
    //   33: aload_0
    //   34: getfield 70	com/appsflyer/internal/AFb1rSDK:values	I
    //   37: istore 4
    //   39: new 100	java/lang/ArithmeticException
    //   42: dup
    //   43: ldc 102
    //   45: invokespecial 105	java/lang/ArithmeticException:<init>	(Ljava/lang/String;)V
    //   48: athrow
    //   49: astore_1
    //   50: aload_1
    //   51: athrow
    //   52: astore_1
    //   53: goto +249 -> 302
    //   56: aload_0
    //   57: getfield 70	com/appsflyer/internal/AFb1rSDK:values	I
    //   60: istore 4
    //   62: iload 4
    //   64: ldc_w 258
    //   67: if_icmplt +6 -> 73
    //   70: goto +229 -> 299
    //   73: invokestatic 264	java/lang/System:currentTimeMillis	()J
    //   76: lstore 5
    //   78: ldc_w 266
    //   81: aload_3
    //   82: invokestatic 272	android/text/TextUtils:join	(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;
    //   85: astore_3
    //   86: aload_1
    //   87: ifnull +99 -> 186
    //   90: new 152	java/lang/StringBuilder
    //   93: astore 7
    //   95: aload 7
    //   97: invokespecial 273	java/lang/StringBuilder:<init>	()V
    //   100: aload 7
    //   102: lload 5
    //   104: invokevirtual 276	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload 7
    //   110: ldc_w 278
    //   113: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload 7
    //   119: invokestatic 284	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   122: invokevirtual 287	java/lang/Thread:getId	()J
    //   125: invokevirtual 276	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: aload 7
    //   131: ldc_w 289
    //   134: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload 7
    //   140: aload_1
    //   141: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload 7
    //   147: ldc_w 291
    //   150: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload 7
    //   156: aload_2
    //   157: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: aload 7
    //   163: ldc_w 278
    //   166: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload 7
    //   172: aload_3
    //   173: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: pop
    //   177: aload 7
    //   179: invokevirtual 164	java/lang/Object:toString	()Ljava/lang/String;
    //   182: astore_1
    //   183: goto +83 -> 266
    //   186: new 152	java/lang/StringBuilder
    //   189: astore_1
    //   190: aload_1
    //   191: invokespecial 273	java/lang/StringBuilder:<init>	()V
    //   194: aload_1
    //   195: lload 5
    //   197: invokevirtual 276	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: aload_1
    //   202: ldc_w 278
    //   205: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload_1
    //   210: invokestatic 284	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   213: invokevirtual 287	java/lang/Thread:getId	()J
    //   216: invokevirtual 276	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload_1
    //   221: ldc_w 278
    //   224: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: pop
    //   228: aload_1
    //   229: aload_2
    //   230: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: pop
    //   234: aload_1
    //   235: ldc_w 293
    //   238: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: pop
    //   242: aload_1
    //   243: aload_3
    //   244: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload_1
    //   249: invokevirtual 164	java/lang/Object:toString	()Ljava/lang/String;
    //   252: astore_1
    //   253: getstatic 85	com/appsflyer/internal/AFb1rSDK:afErrorLog	I
    //   256: bipush 103
    //   258: iadd
    //   259: sipush 128
    //   262: irem
    //   263: putstatic 83	com/appsflyer/internal/AFb1rSDK:afInfoLog	I
    //   266: aload_0
    //   267: getfield 43	com/appsflyer/internal/AFb1rSDK:AFInAppEventParameterName	Ljava/util/List;
    //   270: aload_1
    //   271: invokeinterface 299 2 0
    //   276: pop
    //   277: aload_0
    //   278: aload_0
    //   279: getfield 70	com/appsflyer/internal/AFb1rSDK:values	I
    //   282: aload_1
    //   283: invokevirtual 91	java/lang/String:length	()I
    //   286: iconst_1
    //   287: ishl
    //   288: iadd
    //   289: putfield 70	com/appsflyer/internal/AFb1rSDK:values	I
    //   292: aload_0
    //   293: monitorexit
    //   294: return
    //   295: astore_1
    //   296: aload_0
    //   297: monitorexit
    //   298: return
    //   299: aload_0
    //   300: monitorexit
    //   301: return
    //   302: aload_0
    //   303: monitorexit
    //   304: aload_1
    //   305: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	306	0	this	AFb1rSDK
    //   0	306	1	paramString1	String
    //   0	306	2	paramString2	String
    //   0	306	3	paramVarArgs	String[]
    //   15	53	4	i	int
    //   76	120	5	l	long
    //   93	85	7	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   39	49	49	finally
    //   2	26	52	finally
    //   33	39	52	finally
    //   50	52	52	finally
    //   56	62	52	finally
    //   253	266	52	finally
    //   73	86	295	finally
    //   90	183	295	finally
    //   186	253	295	finally
    //   266	292	295	finally
  }
  
  private static void values(String paramString, boolean paramBoolean, int[] paramArrayOfInt, Object[] paramArrayOfObject)
  {
    Object localObject1 = paramString;
    if (paramString != null) {
      localObject1 = paramString.getBytes("ISO-8859-1");
    }
    byte[] arrayOfByte = (byte[])localObject1;
    Object localObject2 = AFg1sSDK.AFInAppEventType;
    int i = paramArrayOfInt[0];
    int j = paramArrayOfInt[1];
    int k = paramArrayOfInt[2];
    int m = paramArrayOfInt[3];
    for (;;)
    {
      int n;
      try
      {
        paramString = afDebugLog;
        localObject1 = new char[j];
        System.arraycopy(paramString, i, localObject1, 0, j);
        paramString = (String)localObject1;
        if (arrayOfByte == null) {
          break;
        }
        paramString = new char[j];
        AFg1sSDK.AFInAppEventParameterName = 0;
        i = 0;
        n = AFg1sSDK.AFInAppEventParameterName;
        if (n >= j) {
          break;
        }
        if (arrayOfByte[n] == 1) {
          paramString[n] = ((char)(char)((localObject1[n] << '\001') + 1 - i));
        }
      }
      finally
      {
        break label339;
      }
      paramString[n] = ((char)(char)((localObject1[n] << '\001') - i));
      i = paramString[n];
      AFg1sSDK.AFInAppEventParameterName = n + 1;
    }
    if (m > 0)
    {
      localObject1 = new char[j];
      System.arraycopy(paramString, 0, localObject1, 0, j);
      i = j - m;
      System.arraycopy(localObject1, 0, paramString, i, m);
      System.arraycopy(localObject1, m, paramString, 0, i);
    }
    localObject1 = paramString;
    if (paramBoolean)
    {
      localObject1 = new char[j];
      for (AFg1sSDK.AFInAppEventParameterName = 0;; AFg1sSDK.AFInAppEventParameterName = i + 1)
      {
        i = AFg1sSDK.AFInAppEventParameterName;
        if (i >= j) {
          break;
        }
        localObject1[i] = ((char)paramString[(j - i - 1)]);
      }
    }
    if (k > 0) {
      for (AFg1sSDK.AFInAppEventParameterName = 0;; AFg1sSDK.AFInAppEventParameterName = i + 1)
      {
        i = AFg1sSDK.AFInAppEventParameterName;
        if (i >= j) {
          break;
        }
        localObject1[i] = ((char)(char)(localObject1[i] - paramArrayOfInt[2]));
      }
    }
    paramString = new java/lang/String;
    paramString.<init>((char[])localObject1);
    paramArrayOfObject[0] = paramString;
    return;
    label339:
    throw paramString;
  }
  
  public final void AFInAppEventParameterName()
  {
    int i = afErrorLog + 15;
    int j = i % 128;
    afInfoLog = j;
    if (i % 2 != 0) {
      afRDLog = true;
    } else {
      afRDLog = false;
    }
    i = j + 101;
    afErrorLog = i % 128;
    if (i % 2 == 0) {
      throw new ArithmeticException("divide by zero");
    }
  }
  
  public final void AFInAppEventParameterName(String paramString)
  {
    label57:
    try
    {
      int i = afErrorLog;
      int j = i + 87;
      afInfoLog = j % 128;
      if (j % 2 == 0)
      {
        AFLogger = paramString;
        afInfoLog = (i + 1) % 128;
        return;
      }
    }
    finally
    {
      break label57;
      AFLogger = paramString;
      try
      {
        throw null;
      }
      finally {}
    }
  }
  
  public final void AFInAppEventParameterName(String paramString1, int paramInt, String paramString2)
  {
    afErrorLog = (afInfoLog + 85) % 128;
    values("server_response", paramString1, new String[] { String.valueOf(paramInt), paramString2 });
    paramInt = afErrorLog + 63;
    afInfoLog = paramInt % 128;
    if (paramInt % 2 != 0) {
      throw new ArithmeticException("divide by zero");
    }
  }
  
  public final void AFInAppEventParameterName(String paramString1, String paramString2)
  {
    int i = afErrorLog + 69;
    afInfoLog = i % 128;
    if (i % 2 != 0)
    {
      String[] arrayOfString = new String[0];
      arrayOfString[0] = paramString2;
      values(null, paramString1, arrayOfString);
    }
    else
    {
      values(null, paramString1, new String[] { paramString2 });
    }
  }
  
  public final void AFInAppEventParameterName(String paramString, String... paramVarArgs)
  {
    afInfoLog = (afErrorLog + 115) % 128;
    values("public_api_call", paramString, paramVarArgs);
    int i = afInfoLog + 43;
    afErrorLog = i % 128;
    if (i % 2 != 0) {
      return;
    }
    throw null;
  }
  
  public final void AFInAppEventType()
  {
    try
    {
      afErrorLog = (afInfoLog + 41) % 128;
      valueOf = false;
      afErrorLog();
      afErrorLog = (afInfoLog + 37) % 128;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void AFInAppEventType(Throwable paramThrowable)
  {
    Throwable localThrowable = paramThrowable.getCause();
    String str1 = paramThrowable.getClass().getSimpleName();
    String str2;
    if (localThrowable == null)
    {
      str2 = paramThrowable.getMessage();
    }
    else
    {
      str2 = localThrowable.getMessage();
      afInfoLog = (afErrorLog + 71) % 128;
    }
    if (localThrowable == null)
    {
      afInfoLog = (afErrorLog + 39) % 128;
      paramThrowable = paramThrowable.getStackTrace();
    }
    else
    {
      paramThrowable = localThrowable.getStackTrace();
    }
    values("exception", str1, valueOf(str2, paramThrowable));
  }
  
  /* Error */
  public final void AFKeystoreWrapper()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield 72	com/appsflyer/internal/AFb1rSDK:AFKeystoreWrapper	Z
    //   7: new 358	java/text/SimpleDateFormat
    //   10: astore_1
    //   11: aload_1
    //   12: ldc_w 360
    //   15: getstatic 366	java/util/Locale:ENGLISH	Ljava/util/Locale;
    //   18: invokespecial 369	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   21: aload_0
    //   22: ldc_w 371
    //   25: aload_1
    //   26: invokestatic 264	java/lang/System:currentTimeMillis	()J
    //   29: invokestatic 376	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   32: invokevirtual 382	java/text/Format:format	(Ljava/lang/Object;)Ljava/lang/String;
    //   35: iconst_0
    //   36: anewarray 87	java/lang/String
    //   39: invokespecial 326	com/appsflyer/internal/AFb1rSDK:values	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    //   42: getstatic 83	com/appsflyer/internal/AFb1rSDK:afInfoLog	I
    //   45: bipush 73
    //   47: iadd
    //   48: istore_2
    //   49: iload_2
    //   50: sipush 128
    //   53: irem
    //   54: putstatic 85	com/appsflyer/internal/AFb1rSDK:afErrorLog	I
    //   57: iload_2
    //   58: iconst_2
    //   59: irem
    //   60: ifne +20 -> 80
    //   63: new 100	java/lang/ArithmeticException
    //   66: dup
    //   67: ldc 102
    //   69: invokespecial 105	java/lang/ArithmeticException:<init>	(Ljava/lang/String;)V
    //   72: athrow
    //   73: astore_1
    //   74: aload_1
    //   75: athrow
    //   76: astore_1
    //   77: goto +6 -> 83
    //   80: aload_0
    //   81: monitorexit
    //   82: return
    //   83: aload_0
    //   84: monitorexit
    //   85: aload_1
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	AFb1rSDK
    //   10	16	1	localSimpleDateFormat	SimpleDateFormat
    //   73	2	1	localObject1	Object
    //   76	10	1	localObject2	Object
    //   48	12	2	i	int
    // Exception table:
    //   from	to	target	type
    //   63	73	73	finally
    //   2	57	76	finally
    //   74	76	76	finally
  }
  
  public final boolean afInfoLog()
  {
    int i = afErrorLog;
    int j = i + 59;
    afInfoLog = j % 128;
    if (j % 2 == 0)
    {
      boolean bool = AFKeystoreWrapper;
      i += 51;
      afInfoLog = i % 128;
      if (i % 2 == 0) {
        return bool;
      }
      throw null;
    }
    throw null;
  }
  
  public final void valueOf()
  {
    try
    {
      i = afInfoLog + 45;
      afErrorLog = i % 128;
      if (i % 2 == 0)
      {
        AFInAppEventType.clear();
        AFInAppEventParameterName.clear();
        values = 1;
      }
    }
    finally
    {
      break label113;
    }
    AFInAppEventType.clear();
    AFInAppEventParameterName.clear();
    values = 0;
    int i = afInfoLog + 69;
    afErrorLog = i % 128;
    if (i % 2 == 0) {
      try
      {
        throw new ArithmeticException("divide by zero");
      }
      finally {}
    }
    return;
    label113:
    throw ((Throwable)localObject2);
  }
  
  public final void valueOf(String paramString, PackageManager paramPackageManager, AFc1xSDK paramAFc1xSDK)
  {
    try
    {
      paramPackageManager = values(paramString, paramPackageManager, paramAFc1xSDK);
      paramString = new com/appsflyer/internal/AFd1iSDK;
      paramString.<init>(paramPackageManager, paramAFc1xSDK);
      paramPackageManager = paramAFc1xSDK.AFVersionDeclaration();
      paramAFc1xSDK = AFKeystoreWrapper;
      AFc1bSDK.4 local4 = new com/appsflyer/internal/AFc1bSDK$4;
      local4.<init>(paramPackageManager, paramString);
      paramAFc1xSDK.execute(local4);
      int i = afErrorLog + 7;
      afInfoLog = i % 128;
      if (i % 2 == 0) {
        return;
      }
      throw null;
    }
    finally {}
  }
  
  public final void valueOf(String paramString1, String paramString2)
  {
    afInfoLog = (afErrorLog + 87) % 128;
    values("server_request", paramString1, new String[] { paramString2 });
    afErrorLog = (afInfoLog + 113) % 128;
  }
  
  public final void values()
  {
    try
    {
      SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
      localSimpleDateFormat.<init>("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH);
      values("r_debugging_off", localSimpleDateFormat.format(Long.valueOf(System.currentTimeMillis())), new String[0]);
      AFKeystoreWrapper = false;
      valueOf = false;
      afInfoLog = (afErrorLog + 49) % 128;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1rSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */