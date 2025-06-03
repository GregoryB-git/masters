package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

public class AFa1aSDK
{
  private static String AFLogger;
  private static String afRDLog;
  @NonNull
  public final String AFInAppEventParameterName;
  public boolean AFInAppEventType;
  @NonNull
  public final Map<String, String> AFKeystoreWrapper;
  private final boolean AFVersionDeclaration;
  public int afDebugLog;
  private final byte[] afErrorLog;
  private final boolean afInfoLog;
  private boolean getLevel;
  @NonNull
  public final String valueOf;
  public boolean values;
  
  public AFa1aSDK() {}
  
  public AFa1aSDK(String paramString1, String paramString2)
  {
    this(paramString1, null, paramString2, new HashMap(), false);
  }
  
  public AFa1aSDK(String paramString1, byte[] paramArrayOfByte, String paramString2, Map<String, String> paramMap, boolean paramBoolean)
  {
    this(paramString1, paramArrayOfByte, paramString2, paramMap, paramBoolean, true);
  }
  
  public AFa1aSDK(String paramString1, byte[] paramArrayOfByte, String paramString2, Map<String, String> paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    getLevel = true;
    values = false;
    AFInAppEventType = true;
    afDebugLog = -1;
    valueOf = paramString1;
    afErrorLog = paramArrayOfByte;
    AFInAppEventParameterName = paramString2;
    AFKeystoreWrapper = paramMap;
    afInfoLog = paramBoolean1;
    AFVersionDeclaration = paramBoolean2;
  }
  
  public static void AFInAppEventType(String paramString)
  {
    AFLogger = paramString;
    if (paramString == null) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramString.length(); i++) {
      if ((i != 0) && (i != paramString.length() - 1)) {
        localStringBuilder.append("*");
      } else {
        localStringBuilder.append(paramString.charAt(i));
      }
    }
    afRDLog = localStringBuilder.toString();
  }
  
  public static void values(String paramString)
  {
    if (AFLogger == null) {
      AFInAppEventType(valueOfAFInAppEventTypeafWarnLogAFInAppEventParameterName);
    }
    String str = AFLogger;
    if (str != null) {
      AFLogger.afInfoLog(paramString.replace(str, afRDLog));
    }
  }
  
  public final boolean AFInAppEventParameterName()
  {
    return values;
  }
  
  public final boolean AFInAppEventType()
  {
    return getLevel;
  }
  
  public final boolean AFKeystoreWrapper()
  {
    return afInfoLog;
  }
  
  public final boolean afDebugLog()
  {
    return AFInAppEventType;
  }
  
  public final byte[] valueOf()
  {
    return afErrorLog;
  }
  
  public final AFa1aSDK values(int paramInt)
  {
    afDebugLog = paramInt;
    return this;
  }
  
  public final boolean values()
  {
    return AFVersionDeclaration;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1aSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */