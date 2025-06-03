package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

public final class PurchaseHandler
{
  @NonNull
  private final AFb1gSDK AFInAppEventParameterName;
  @NonNull
  public final AFc1bSDK valueOf;
  @NonNull
  public final AFc1xSDK values;
  
  public PurchaseHandler(@NonNull AFc1xSDK paramAFc1xSDK)
  {
    values = paramAFc1xSDK;
    AFInAppEventParameterName = paramAFc1xSDK.AFInAppEventParameterName();
    valueOf = paramAFc1xSDK.AFVersionDeclaration();
  }
  
  public final boolean AFInAppEventParameterName(Map<String, Object> paramMap, PurchaseValidationCallback paramPurchaseValidationCallback, String... paramVarArgs)
  {
    boolean bool = AFc1nSDK.AFKeystoreWrapper(paramMap, paramVarArgs, AFInAppEventParameterName);
    if ((!bool) && (paramPurchaseValidationCallback != null)) {
      paramPurchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
    }
    return bool;
  }
  
  public static abstract interface PurchaseValidationCallback
  {
    public abstract void onFailure(@NonNull Throwable paramThrowable);
    
    public abstract void onResponse(@NonNull ResponseNetwork<String> paramResponseNetwork);
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.PurchaseHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */