package com.appsflyer;

import com.appsflyer.internal.AFc1tSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1vSDK;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class CreateOneLinkHttpTask
  implements AFc1uSDK
{
  @NotNull
  private final AFc1vSDK valueOf;
  
  public CreateOneLinkHttpTask() {}
  
  public CreateOneLinkHttpTask(AFc1vSDK paramAFc1vSDK)
  {
    valueOf = paramAFc1vSDK;
  }
  
  public final void valueOf(byte[] paramArrayOfByte, Map<String, String> paramMap, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "");
    Intrinsics.checkNotNullParameter(paramArrayOfByte, "");
    if (new AFc1tSDK(paramArrayOfByte, paramMap, 2000).AFInAppEventParameterName()) {
      valueOf.values();
    }
  }
  
  @Deprecated
  public static abstract interface ResponseListener
  {
    public abstract void onResponse(String paramString);
    
    public abstract void onResponseError(String paramString);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.CreateOneLinkHttpTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */