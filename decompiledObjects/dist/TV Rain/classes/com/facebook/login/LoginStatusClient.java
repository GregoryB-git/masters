package com.facebook.login;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;

final class LoginStatusClient
  extends PlatformServiceClient
{
  public static final long DEFAULT_TOAST_DURATION_MS = 5000L;
  private final String graphApiVersion;
  private final String loggerRef;
  private final long toastDurationMs;
  
  public LoginStatusClient(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong)
  {
    super(paramContext, 65546, 65547, 20170411, paramString1);
    loggerRef = paramString2;
    graphApiVersion = paramString3;
    toastDurationMs = paramLong;
  }
  
  public void populateRequestBundle(Bundle paramBundle)
  {
    paramBundle.putString("com.facebook.platform.extra.LOGGER_REF", loggerRef);
    paramBundle.putString("com.facebook.platform.extra.GRAPH_API_VERSION", graphApiVersion);
    paramBundle.putLong("com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS", toastDurationMs);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginStatusClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */