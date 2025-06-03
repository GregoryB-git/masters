package com.appsflyer.internal;

import V5.h;
import V5.i;
import V5.m;
import W5.C;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import g6.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
public final class AFc1sSDK
  implements AFc1wSDK
{
  private static int AFVersionDeclaration = 0;
  private static long afRDLog = 316052305582461199L;
  private static int afWarnLog = 1;
  @NotNull
  private final h AFInAppEventParameterName;
  @NotNull
  private final h AFInAppEventType;
  @NotNull
  private final h AFKeystoreWrapper;
  @NotNull
  private final h AFLogger;
  @NotNull
  private final h afDebugLog;
  @NotNull
  private final h afErrorLog;
  @NotNull
  private final String afInfoLog;
  @NotNull
  private final h valueOf;
  @NotNull
  private AFc1xSDK values;
  
  public AFc1sSDK(@NotNull AFc1xSDK paramAFc1xSDK)
  {
    values = paramAFc1xSDK;
    AFInAppEventType = i.a(new AFa1vSDK(this));
    AFInAppEventParameterName = i.a(new AFa1xSDK(this));
    AFKeystoreWrapper = i.a(new AFa1wSDK(this));
    valueOf = i.a(new AFa1qSDK(this));
    afDebugLog = i.a(new AFa1ySDK(this));
    afInfoLog = "6.12.2";
    afErrorLog = i.a(new AFa1zSDK(this));
    AFLogger = i.a(new AFa1tSDK(this));
  }
  
  private final AFb1wSDK AFInAppEventParameterName()
  {
    AFVersionDeclaration = (afWarnLog + 75) % 128;
    AFb1wSDK localAFb1wSDK = (AFb1wSDK)AFInAppEventType.getValue();
    AFVersionDeclaration = (afWarnLog + 109) % 128;
    return localAFb1wSDK;
  }
  
  private final Map<String, String> AFInAppEventParameterName(AFb1fSDK.AFa1ySDK paramAFa1ySDK)
  {
    int i = ViewConfiguration.getMaximumDrawingCacheSize();
    Object localObject = new Object[1];
    AFInAppEventType("Ꮵₖ?ᎇ뇫ﵙ屷垽", 1 - (i >> 24), (Object[])localObject);
    m localm1 = V5.q.a(((String)localObject[0]).intern(), Build.BRAND);
    m localm2 = V5.q.a("model", Build.MODEL);
    m localm3 = V5.q.a("app_id", afRDLogvalueOf.AFInAppEventType.getPackageName());
    m localm4 = V5.q.a("p_ex", new AFb1xSDK().AFInAppEventParameterName());
    m localm5 = V5.q.a("api", String.valueOf(Build.VERSION.SDK_INT));
    m localm6 = V5.q.a("sdk", AFLogger());
    localObject = afRDLog();
    paramAFa1ySDK = C.f(new m[] { localm1, localm2, localm3, localm4, localm5, localm6, V5.q.a("uid", AFb1zSDK.valueOf(valueOf, AFInAppEventType)), V5.q.a("exc_config", paramAFa1ySDK.AFInAppEventType()) });
    AFVersionDeclaration = (afWarnLog + 1) % 128;
    return paramAFa1ySDK;
  }
  
  private static final void AFInAppEventParameterName(AFc1sSDK paramAFc1sSDK)
  {
    AFVersionDeclaration = (afWarnLog + 77) % 128;
    Intrinsics.checkNotNullParameter(paramAFc1sSDK, "");
    paramAFc1sSDK.AFLogger$LogLevel();
    AFVersionDeclaration = (afWarnLog + 61) % 128;
  }
  
  private static final void AFInAppEventParameterName(AFc1sSDK paramAFc1sSDK, Throwable paramThrowable, String paramString)
  {
    int i = afWarnLog + 93;
    AFVersionDeclaration = i % 128;
    Intrinsics.checkNotNullParameter(paramAFc1sSDK, "");
    Intrinsics.checkNotNullParameter(paramThrowable, "");
    Intrinsics.checkNotNullParameter(paramString, "");
    if (i % 2 != 0)
    {
      paramAFc1sSDK = paramAFc1sSDK.afWarnLog();
      throw new ArithmeticException("divide by zero");
    }
    AFb1fSDK.AFa1ySDK localAFa1ySDK = paramAFc1sSDK.afWarnLog();
    if (localAFa1ySDK != null) {
      if (paramAFc1sSDK.valueOf(localAFa1ySDK) == true) {
        paramAFc1sSDK.AFKeystoreWrapper().values(paramThrowable, paramString);
      } else {
        AFVersionDeclaration = (afWarnLog + 53) % 128;
      }
    }
  }
  
  private static void AFInAppEventType(String arg0, int paramInt, Object[] paramArrayOfObject)
  {
    Object localObject = ???;
    if (??? != null) {
      localObject = ???.toCharArray();
    }
    localObject = (char[])localObject;
    String str;
    synchronized (AFg1rSDK.AFInAppEventParameterName)
    {
      localObject = AFg1rSDK.AFInAppEventType(afRDLog, (char[])localObject, paramInt);
      AFg1rSDK.AFInAppEventType = 4;
      paramInt = AFg1rSDK.AFInAppEventType;
      if (paramInt < localObject.length)
      {
        AFg1rSDK.AFKeystoreWrapper = paramInt - 4;
        paramInt = AFg1rSDK.AFInAppEventType;
        localObject[paramInt] = ((char)(char)(int)(localObject[paramInt] ^ localObject[(paramInt % 4)] ^ AFg1rSDK.AFKeystoreWrapper * afRDLog));
        AFg1rSDK.AFInAppEventType += 1;
      }
    }
  }
  
  private final boolean AFInAppEventType(AFb1fSDK.AFa1ySDK paramAFa1ySDK)
  {
    afWarnLog = (AFVersionDeclaration + 43) % 128;
    long l1 = System.currentTimeMillis();
    long l2 = afInfoLog().valueOf("af_send_exc_to_server_window", -1L);
    if (valueOf < l1 / 1000L)
    {
      afWarnLog = (AFVersionDeclaration + 95) % 128;
      return false;
    }
    if (l2 != -1L)
    {
      int i = afWarnLog + 101;
      AFVersionDeclaration = i % 128;
      if (i % 2 == 0)
      {
        if (l2 >= l1)
        {
          int j = afInfoLog().values("af_send_exc_min", -1);
          if (j != -1)
          {
            i = AFVersionDeclaration + 117;
            afWarnLog = i % 128;
            if (i % 2 != 0)
            {
              if (AFKeystoreWrapper().AFInAppEventType() >= j)
              {
                paramAFa1ySDK = AFInAppEventType;
                Intrinsics.checkNotNullExpressionValue(paramAFa1ySDK, "");
                if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(paramAFa1ySDK) == AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(AFLogger()))
                {
                  afWarnLog = (AFVersionDeclaration + 65) % 128;
                  return true;
                }
                return false;
              }
            }
            else
            {
              AFKeystoreWrapper().AFInAppEventType();
              throw null;
            }
          }
          return false;
        }
      }
      else {
        throw null;
      }
    }
    return false;
  }
  
  private static final void AFKeystoreWrapper(AFc1sSDK paramAFc1sSDK)
  {
    afWarnLog = (AFVersionDeclaration + 37) % 128;
    Intrinsics.checkNotNullParameter(paramAFc1sSDK, "");
    paramAFc1sSDK.AFVersionDeclaration();
    afWarnLog = (AFVersionDeclaration + 91) % 128;
  }
  
  private final void AFKeystoreWrapper(String paramString1, String paramString2)
  {
    afWarnLog = (AFVersionDeclaration + 121) % 128;
    byte[] arrayOfByte = paramString1.getBytes(b.b);
    Intrinsics.checkNotNullExpressionValue(arrayOfByte, "");
    paramString1 = C.b(V5.q.a("Authorization", AFc1nSDK.valueOf(paramString1, paramString2)));
    afErrorLogForExcManagerOnly().valueOf(arrayOfByte, paramString1, 2000);
    int i = afWarnLog + 3;
    AFVersionDeclaration = i % 128;
    if (i % 2 == 0) {
      return;
    }
    throw null;
  }
  
  @NotNull
  private String AFLogger()
  {
    int i = (AFVersionDeclaration + 99) % 128;
    afWarnLog = i;
    String str = afInfoLog;
    AFVersionDeclaration = (i + 25) % 128;
    return str;
  }
  
  private final void AFLogger$LogLevel()
  {
    try
    {
      AFb1fSDK.AFa1ySDK localAFa1ySDK = afWarnLog();
      if (localAFa1ySDK != null)
      {
        afWarnLog = (AFVersionDeclaration + 91) % 128;
        l1 = valueOf;
      }
    }
    finally
    {
      break label255;
    }
    long l1 = -1L;
    long l2 = System.currentTimeMillis() / 1000L;
    Object localObject4;
    try
    {
      Object localObject2 = afWarnLog();
      if (localObject2 != null) {
        localObject2 = AFInAppEventType;
      } else {
        localObject2 = null;
      }
      localObject4 = localObject2;
      if (localObject2 == null)
      {
        AFVersionDeclaration = (afWarnLog + 89) % 128;
        localObject4 = "";
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localObject4 = "NOT_DETECTED";
    }
    if (l1 < l2)
    {
      Intrinsics.checkNotNullParameter("TTL is already passed", "");
      AFLogger.afRDLog("[Exception Manager]: ".concat("TTL is already passed"));
      afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
      AFKeystoreWrapper().values();
      int i = afWarnLog + 69;
      AFVersionDeclaration = i % 128;
      if (i % 2 == 0) {
        return;
      }
      try
      {
        throw null;
      }
      finally {}
    }
    if ((AFc1uSDK.AFa1wSDK.AFKeystoreWrapper((String)localObject4) != -1) && (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper((String)localObject4) <= AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(AFLogger())))
    {
      AFKeystoreWrapper().AFInAppEventParameterName(new String[] { AFLogger() });
      return;
    }
    afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
    AFKeystoreWrapper().values();
    return;
    label255:
    throw ((Throwable)localObject3);
  }
  
  private final void AFVersionDeclaration()
  {
    label198:
    try
    {
      i = afWarnLog + 55;
      AFVersionDeclaration = i % 128;
      if (i % 2 == 0)
      {
        AFb1fSDK.AFa1ySDK localAFa1ySDK = afWarnLog();
        if (localAFa1ySDK != null) {
          if (AFKeystoreWrapper == -1)
          {
            afInfoLog().AFInAppEventType("af_send_exc_to_server_window");
            AFVersionDeclaration = (afWarnLog + 11) % 128;
            return;
          }
        }
      }
    }
    finally
    {
      break label198;
      if (afInfoLog().valueOf("af_send_exc_to_server_window", -1L) == -1L)
      {
        int j = AFInAppEventParameterName;
        i = AFKeystoreWrapper;
        long l1 = System.currentTimeMillis();
        long l2 = TimeUnit.DAYS.toMillis(i);
        AFb1dSDK localAFb1dSDK = afInfoLog();
        localAFb1dSDK.AFInAppEventParameterName("af_send_exc_to_server_window", l1 + l2);
        localAFb1dSDK.AFInAppEventType("af_send_exc_min", j);
      }
      return;
      int i = afWarnLog + 73;
      AFVersionDeclaration = i % 128;
      if (i % 2 != 0) {
        try
        {
          throw new ArithmeticException("divide by zero");
        }
        finally {}
      }
      return;
      afWarnLog();
      try
      {
        throw null;
      }
      finally {}
    }
  }
  
  private final AFe1wSDK afDebugLog()
  {
    int i = AFVersionDeclaration + 71;
    afWarnLog = i % 128;
    if (i % 2 != 0)
    {
      localAFe1wSDK = (AFe1wSDK)valueOf.getValue();
      i = AFVersionDeclaration + 77;
      afWarnLog = i % 128;
      if (i % 2 != 0) {
        return localAFe1wSDK;
      }
      throw null;
    }
    AFe1wSDK localAFe1wSDK = (AFe1wSDK)valueOf.getValue();
    throw null;
  }
  
  private final ExecutorService afErrorLog()
  {
    afWarnLog = (AFVersionDeclaration + 95) % 128;
    ExecutorService localExecutorService = (ExecutorService)afDebugLog.getValue();
    int i = AFVersionDeclaration + 43;
    afWarnLog = i % 128;
    if (i % 2 == 0) {
      throw new ArithmeticException("divide by zero");
    }
    return localExecutorService;
  }
  
  @NotNull
  private AFc1uSDK afErrorLogForExcManagerOnly()
  {
    AFVersionDeclaration = (afWarnLog + 23) % 128;
    AFc1uSDK localAFc1uSDK = (AFc1uSDK)AFLogger.getValue();
    afWarnLog = (AFVersionDeclaration + 93) % 128;
    return localAFc1uSDK;
  }
  
  private final AFb1dSDK afInfoLog()
  {
    int i = AFVersionDeclaration + 3;
    afWarnLog = i % 128;
    if (i % 2 != 0) {
      return (AFb1dSDK)AFKeystoreWrapper.getValue();
    }
    AFb1dSDK localAFb1dSDK = (AFb1dSDK)AFKeystoreWrapper.getValue();
    throw null;
  }
  
  private final AFb1gSDK afRDLog()
  {
    int i = afWarnLog + 125;
    AFVersionDeclaration = i % 128;
    if (i % 2 == 0) {
      return (AFb1gSDK)AFInAppEventParameterName.getValue();
    }
    AFb1gSDK localAFb1gSDK = (AFb1gSDK)AFInAppEventParameterName.getValue();
    throw null;
  }
  
  private final AFb1fSDK.AFa1ySDK afWarnLog()
  {
    Object localObject = AFInAppEventParameterNameAFInAppEventType.AFInAppEventParameterName;
    if (localObject != null)
    {
      localObject = AFInAppEventParameterName;
      if (localObject != null)
      {
        AFVersionDeclaration = (afWarnLog + 9) % 128;
        return values;
      }
    }
    int i = AFVersionDeclaration + 115;
    afWarnLog = i % 128;
    if (i % 2 != 0) {
      return null;
    }
    throw null;
  }
  
  private final void getLevel()
  {
    Object localObject = afWarnLog();
    if (localObject != null)
    {
      AFVersionDeclaration = (afWarnLog + 125) % 128;
      if ((AFInAppEventType((AFb1fSDK.AFa1ySDK)localObject) ^ true) != true)
      {
        String str = afDebugLogAFInAppEventParameterName;
        if (str != null)
        {
          localObject = new JSONObject(values(AFInAppEventParameterName((AFb1fSDK.AFa1ySDK)localObject), AFKeystoreWrapper().AFKeystoreWrapper())).toString();
          Intrinsics.checkNotNullExpressionValue(localObject, "");
          Intrinsics.checkNotNullExpressionValue(str, "");
          AFKeystoreWrapper((String)localObject, str);
        }
        return;
      }
      Intrinsics.checkNotNullParameter("skipping", "");
      AFLogger.afRDLog("[Exception Manager]: ".concat("skipping"));
      return;
    }
    int i = AFVersionDeclaration + 3;
    afWarnLog = i % 128;
    if (i % 2 == 0) {
      throw new ArithmeticException("divide by zero");
    }
  }
  
  private final boolean valueOf(AFb1fSDK.AFa1ySDK paramAFa1ySDK)
  {
    int i = afWarnLog + 17;
    AFVersionDeclaration = i % 128;
    long l1 = System.currentTimeMillis();
    long l2;
    if (i % 2 != 0)
    {
      l2 = afInfoLog().valueOf("af_send_exc_to_server_window", -1L);
      if (valueOf < (l1 | 0x3E8)) {
        break label165;
      }
    }
    else
    {
      l2 = afInfoLog().valueOf("af_send_exc_to_server_window", -1L);
      if (valueOf < l1 / 1000L) {
        break label165;
      }
    }
    if (l2 != -1L)
    {
      i = afWarnLog + 119;
      AFVersionDeclaration = i % 128;
      if (i % 2 != 0) {
        throw new ArithmeticException("divide by zero");
      }
      if (l2 >= l1)
      {
        paramAFa1ySDK = AFInAppEventType;
        Intrinsics.checkNotNullExpressionValue(paramAFa1ySDK, "");
        if (AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(paramAFa1ySDK) == AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(AFLogger())) {
          return true;
        }
      }
    }
    label165:
    return false;
  }
  
  private static Map<String, Object> values(Map<String, ? extends Object> paramMap, List<AFc1zSDK> paramList)
  {
    int i = afWarnLog + 27;
    AFVersionDeclaration = i % 128;
    if (i % 2 != 0)
    {
      m[] arrayOfm = new m[5];
      arrayOfm[1] = V5.q.a("deviceInfo", paramMap);
      arrayOfm[1] = V5.q.a("excs", AFc1uSDK.AFa1wSDK.values(paramList));
      paramMap = C.f(arrayOfm);
    }
    else
    {
      paramMap = C.f(new m[] { V5.q.a("deviceInfo", paramMap), V5.q.a("excs", AFc1uSDK.AFa1wSDK.values(paramList)) });
    }
    afWarnLog = (AFVersionDeclaration + 47) % 128;
    return paramMap;
  }
  
  private static final void values(AFc1sSDK paramAFc1sSDK)
  {
    AFVersionDeclaration = (afWarnLog + 79) % 128;
    Intrinsics.checkNotNullParameter(paramAFc1sSDK, "");
    paramAFc1sSDK.getLevel();
    AFVersionDeclaration = (afWarnLog + 109) % 128;
  }
  
  public final void AFInAppEventType()
  {
    int i = AFVersionDeclaration + 85;
    afWarnLog = i % 128;
    if (i % 2 != 0)
    {
      afErrorLog().execute(new o(this));
      return;
    }
    afErrorLog().execute(new o(this));
    throw null;
  }
  
  @NotNull
  public final AFc1vSDK AFKeystoreWrapper()
  {
    AFVersionDeclaration = (afWarnLog + 13) % 128;
    AFc1vSDK localAFc1vSDK = (AFc1vSDK)afErrorLog.getValue();
    int i = AFVersionDeclaration + 87;
    afWarnLog = i % 128;
    if (i % 2 != 0) {
      return localAFc1vSDK;
    }
    throw null;
  }
  
  public final void AFKeystoreWrapper(@NotNull Throwable paramThrowable, @NotNull String paramString)
  {
    int i = afWarnLog + 1;
    AFVersionDeclaration = i % 128;
    Intrinsics.checkNotNullParameter(paramThrowable, "");
    Intrinsics.checkNotNullParameter(paramString, "");
    if (i % 2 == 0)
    {
      afErrorLog().execute(new q(this, paramThrowable, paramString));
      afWarnLog = (AFVersionDeclaration + 81) % 128;
      return;
    }
    afErrorLog().execute(new q(this, paramThrowable, paramString));
    throw null;
  }
  
  public final void valueOf()
  {
    AFVersionDeclaration = (afWarnLog + 17) % 128;
    afErrorLog().execute(new p(this));
    AFVersionDeclaration = (afWarnLog + 27) % 128;
  }
  
  public final void values()
  {
    afWarnLog = (AFVersionDeclaration + 87) % 128;
    afErrorLog().execute(new r(this));
    AFVersionDeclaration = (afWarnLog + 79) % 128;
  }
  
  @Metadata
  public static final class AFa1qSDK
    extends l
    implements a
  {
    public AFa1qSDK(AFc1sSDK paramAFc1sSDK)
    {
      super();
    }
  }
  
  @Metadata
  public static final class AFa1tSDK
    extends l
    implements a
  {
    public AFa1tSDK(AFc1sSDK paramAFc1sSDK)
    {
      super();
    }
  }
  
  @Metadata
  public static final class AFa1vSDK
    extends l
    implements a
  {
    public AFa1vSDK(AFc1sSDK paramAFc1sSDK)
    {
      super();
    }
  }
  
  @Metadata
  public static final class AFa1wSDK
    extends l
    implements a
  {
    public AFa1wSDK(AFc1sSDK paramAFc1sSDK)
    {
      super();
    }
  }
  
  @Metadata
  public static final class AFa1xSDK
    extends l
    implements a
  {
    public AFa1xSDK(AFc1sSDK paramAFc1sSDK)
    {
      super();
    }
  }
  
  @Metadata
  public static final class AFa1ySDK
    extends l
    implements a
  {
    public AFa1ySDK(AFc1sSDK paramAFc1sSDK)
    {
      super();
    }
  }
  
  @Metadata
  public static final class AFa1zSDK
    extends l
    implements a
  {
    public AFa1zSDK(AFc1sSDK paramAFc1sSDK)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1sSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */