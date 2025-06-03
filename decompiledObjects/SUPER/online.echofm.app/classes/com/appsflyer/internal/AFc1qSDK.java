package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

public final class AFc1qSDK<ResponseBody>
{
  private final AFc1lSDK AFInAppEventParameterName;
  private final ExecutorService AFInAppEventType;
  private final AtomicBoolean AFKeystoreWrapper = new AtomicBoolean(false);
  public final AFa1aSDK valueOf;
  private final AFc1hSDK<ResponseBody> values;
  
  public AFc1qSDK(AFa1aSDK paramAFa1aSDK, ExecutorService paramExecutorService, AFc1lSDK paramAFc1lSDK, AFc1hSDK<ResponseBody> paramAFc1hSDK)
  {
    valueOf = paramAFa1aSDK;
    AFInAppEventType = paramExecutorService;
    AFInAppEventParameterName = paramAFc1lSDK;
    values = paramAFc1hSDK;
  }
  
  public final AFc1gSDK<ResponseBody> AFInAppEventType()
  {
    if (!AFKeystoreWrapper.getAndSet(true))
    {
      AFc1gSDK localAFc1gSDK1 = AFInAppEventParameterName.AFInAppEventParameterName(valueOf);
      try
      {
        AFc1gSDK localAFc1gSDK2 = new AFc1gSDK(values.values((String)localAFc1gSDK1.getBody()), valueOf, AFKeystoreWrapper, AFInAppEventType, values);
        return localAFc1gSDK2;
      }
      catch (JSONException localJSONException)
      {
        AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", localJSONException);
        throw new ParsingException(localJSONException.getMessage(), localJSONException, localAFc1gSDK1);
      }
    }
    throw new IllegalStateException("Http call is already executed");
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFc1qSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */