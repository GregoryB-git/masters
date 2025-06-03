package com.appsflyer.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

public abstract class AFa1qSDK
{
  public AppsFlyerRequestListener AFInAppEventParameterName;
  public String AFInAppEventType;
  public final Map<String, Object> AFKeystoreWrapper = new HashMap();
  public int AFLogger;
  private final boolean AFLogger$LogLevel;
  private byte[] AFVersionDeclaration;
  String afDebugLog;
  String afErrorLog;
  String afInfoLog;
  public String afRDLog;
  String valueOf;
  Map<String, Object> values;
  
  public AFa1qSDK()
  {
    this(null, null, null);
  }
  
  public AFa1qSDK(String paramString1, String paramString2, Boolean paramBoolean)
  {
    afDebugLog = paramString1;
    afRDLog = paramString2;
    boolean bool;
    if (paramBoolean != null) {
      bool = paramBoolean.booleanValue();
    } else {
      bool = true;
    }
    AFLogger$LogLevel = bool;
  }
  
  @NonNull
  public static String AFInAppEventParameterName(String paramString)
  {
    String str1 = AFa1eSDK.valueOf().AFInAppEventType().AFInAppEventParameterName().values();
    String str2 = paramString;
    if (str1 != null) {
      str2 = Uri.parse(paramString).buildUpon().appendQueryParameter("channel", str1).build().toString();
    }
    return str2;
  }
  
  public static boolean AFInAppEventType(double paramDouble)
  {
    if ((paramDouble >= 0.0D) && (paramDouble < 1.0D))
    {
      if (paramDouble == 0.0D) {
        return true;
      }
      int i = (int)(1.0D / paramDouble);
      if (i + 1 > 0) {
        return (int)(Math.random() * i + 1.0D) != i;
      }
      throw new IllegalArgumentException("Unsupported max value");
    }
    return false;
  }
  
  public final AFa1qSDK AFInAppEventParameterName(int paramInt)
  {
    AFLogger = paramInt;
    synchronized (AFKeystoreWrapper)
    {
      if (AFKeystoreWrapper.containsKey("counter")) {
        AFKeystoreWrapper.put("counter", Integer.toString(paramInt));
      }
    }
    if (AFKeystoreWrapper.containsKey("launch_counter")) {
      AFKeystoreWrapper.put("launch_counter", Integer.toString(paramInt));
    }
    return this;
    throw ((Throwable)localObject);
  }
  
  public final boolean AFInAppEventParameterName()
  {
    return (afDebugLog == null) && (AFInAppEventType == null);
  }
  
  public abstract AFd1vSDK AFInAppEventType();
  
  public AFa1qSDK AFKeystoreWrapper(String paramString)
  {
    afRDLog = paramString;
    return this;
  }
  
  public final AFa1qSDK AFKeystoreWrapper(String paramString, Object paramObject)
  {
    synchronized (AFKeystoreWrapper)
    {
      AFKeystoreWrapper.put(paramString, paramObject);
      return this;
    }
  }
  
  public final byte[] AFKeystoreWrapper()
  {
    return AFVersionDeclaration;
  }
  
  public boolean afDebugLog()
  {
    return true;
  }
  
  public boolean afErrorLog()
  {
    return true;
  }
  
  public boolean afInfoLog()
  {
    return true;
  }
  
  public boolean afRDLog()
  {
    return false;
  }
  
  public final AFa1qSDK valueOf(byte[] paramArrayOfByte)
  {
    AFVersionDeclaration = paramArrayOfByte;
    return this;
  }
  
  public final Map<String, Object> valueOf()
  {
    return AFKeystoreWrapper;
  }
  
  public final AFa1qSDK values(Map<String, ?> paramMap)
  {
    try
    {
      AFKeystoreWrapper.putAll(paramMap);
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean values()
  {
    return AFLogger$LogLevel;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1qSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */