package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AFb1hSDK<T>
{
  public final Context AFInAppEventParameterName;
  public final AFc1xSDK AFInAppEventType;
  public final String AFKeystoreWrapper;
  private final String[] valueOf;
  public final FutureTask<T> values = new FutureTask(new Callable()
  {
    public final T call()
    {
      if (AFKeystoreWrapper()) {
        return (T)values();
      }
      return null;
    }
  });
  
  public AFb1hSDK(Context paramContext, AFc1xSDK paramAFc1xSDK, String paramString, String... paramVarArgs)
  {
    AFInAppEventParameterName = paramContext;
    AFKeystoreWrapper = paramString;
    valueOf = paramVarArgs;
    AFInAppEventType = paramAFc1xSDK;
  }
  
  public final boolean AFKeystoreWrapper()
  {
    try
    {
      ProviderInfo localProviderInfo = AFInAppEventParameterName.getPackageManager().resolveContentProvider(AFKeystoreWrapper, 128);
      if (localProviderInfo != null)
      {
        boolean bool = Arrays.asList(valueOf).contains(AFa1fSDK.values(AFInAppEventParameterName.getPackageManager(), packageName));
        if (bool) {
          return true;
        }
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}catch (CertificateException localCertificateException) {}catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return false;
    AFLogger.afErrorLog(localNameNotFoundException.getMessage(), localNameNotFoundException);
    return false;
  }
  
  public T valueOf()
  {
    try
    {
      Object localObject = values.get(500L, TimeUnit.MILLISECONDS);
      return (T)localObject;
    }
    catch (TimeoutException localTimeoutException) {}catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}
    AFLogger.afErrorLog(localInterruptedException.getMessage(), localInterruptedException);
    return null;
  }
  
  public abstract T values();
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1hSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */