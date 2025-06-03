package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1kSDK;
import java.io.IOException;

public class HttpException
  extends IOException
{
  private final AFc1kSDK valueOf;
  
  public HttpException(@NonNull Throwable paramThrowable, @NonNull AFc1kSDK paramAFc1kSDK)
  {
    super(paramThrowable.getMessage(), paramThrowable);
    valueOf = paramAFc1kSDK;
  }
  
  @NonNull
  public AFc1kSDK getMetrics()
  {
    return valueOf;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.components.network.http.exceptions.HttpException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */