package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1gSDK;
import java.io.IOException;

public class ParsingException
  extends IOException
{
  @NonNull
  private final AFc1gSDK<String> AFKeystoreWrapper;
  
  public ParsingException(String paramString, Throwable paramThrowable, @NonNull AFc1gSDK<String> paramAFc1gSDK)
  {
    super(paramString, paramThrowable);
    AFKeystoreWrapper = paramAFc1gSDK;
  }
  
  @NonNull
  public AFc1gSDK<String> getRawResponse()
  {
    return AFKeystoreWrapper;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.components.network.http.exceptions.ParsingException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */