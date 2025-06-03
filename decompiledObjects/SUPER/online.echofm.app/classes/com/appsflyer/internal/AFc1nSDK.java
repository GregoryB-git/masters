package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
public final class AFc1nSDK
{
  public final AFc1lSDK AFKeystoreWrapper;
  public final ExecutorService valueOf;
  
  public AFc1nSDK() {}
  
  public AFc1nSDK(AFc1lSDK paramAFc1lSDK, ExecutorService paramExecutorService)
  {
    AFKeystoreWrapper = paramAFc1lSDK;
    valueOf = paramExecutorService;
  }
  
  @NotNull
  public static final List<StackTraceElement> AFInAppEventParameterName(@NotNull Throwable paramThrowable)
  {
    Intrinsics.checkNotNullParameter(paramThrowable, "");
    StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
    Intrinsics.checkNotNullExpressionValue(arrayOfStackTraceElement, "");
    ArrayList localArrayList = new ArrayList();
    int i = arrayOfStackTraceElement.length;
    for (int j = 0; j < i; j++)
    {
      paramThrowable = arrayOfStackTraceElement[j];
      String str = paramThrowable.getClassName();
      Intrinsics.checkNotNullExpressionValue(str, "");
      if (!i.s(str, "com.appsflyer", false, 2, null)) {
        paramThrowable = null;
      }
      if (paramThrowable != null) {
        localArrayList.add(paramThrowable);
      }
    }
    return localArrayList;
  }
  
  public static String AFInAppEventType(String paramString)
  {
    try
    {
      Object localObject = MessageDigest.getInstance("SHA-256");
      ((MessageDigest)localObject).update(paramString.getBytes(Charset.defaultCharset()));
      localObject = values(((MessageDigest)localObject).digest());
      paramString = (String)localObject;
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new StringBuilder("Error turning ");
      localStringBuilder.append(paramString.substring(0, 6));
      localStringBuilder.append(".. to SHA-256");
      AFLogger.afErrorLog(localStringBuilder.toString(), localException);
      paramString = null;
    }
    return paramString;
  }
  
  public static boolean AFKeystoreWrapper(Map<String, Object> paramMap, String[] paramArrayOfString, AFb1gSDK paramAFb1gSDK)
  {
    if ((paramMap != null) && (!paramMap.isEmpty()))
    {
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++) {
        if (!paramMap.containsKey(paramArrayOfString[j])) {
          return false;
        }
      }
      paramArrayOfString = (String)paramMap.remove("sig");
      if (paramArrayOfString == null) {
        return false;
      }
      String str = AFb1gSDK.valueOf();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(new JSONObject(paramMap));
      localStringBuilder.append(str);
      return valueOf(localStringBuilder.toString(), AFb1zSDK.valueOf(valueOf, AFInAppEventType)).equals(paramArrayOfString);
    }
    return false;
  }
  
  public static String valueOf(String paramString1, String paramString2)
  {
    try
    {
      Mac localMac = Mac.getInstance("HmacSHA256");
      SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
      localSecretKeySpec.<init>(paramString2.getBytes(Charset.defaultCharset()), "HmacSHA256");
      localMac.init(localSecretKeySpec);
      paramString1 = values(localMac.doFinal(paramString1.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
      return paramString1;
    }
    catch (InvalidKeyException paramString1) {}catch (NoSuchAlgorithmException paramString1) {}
    AFLogger.afErrorLog(paramString1.getMessage(), paramString1, true);
    return paramString1.getMessage();
  }
  
  private static String values(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(Integer.toString((paramArrayOfByte[j] & 0xFF) + 256, 16).substring(1));
    }
    return localStringBuilder.toString();
  }
  
  @Metadata
  public static final class AFa1wSDK
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public static final AFa1wSDK AFKeystoreWrapper = new AFa1wSDK();
    
    public AFa1wSDK()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1nSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */