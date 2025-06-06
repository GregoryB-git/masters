package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class InstallReferrerClient
{
  public static Builder newBuilder(Context paramContext)
  {
    return new Builder(paramContext, null);
  }
  
  public abstract void endConnection();
  
  public abstract ReferrerDetails getInstallReferrer()
    throws RemoteException;
  
  public abstract boolean isReady();
  
  public abstract void startConnection(InstallReferrerStateListener paramInstallReferrerStateListener);
  
  public static final class Builder
  {
    private final Context mContext;
    
    private Builder(Context paramContext)
    {
      mContext = paramContext;
    }
    
    public InstallReferrerClient build()
    {
      Context localContext = mContext;
      if (localContext != null) {
        return new InstallReferrerClientImpl(localContext);
      }
      throw new IllegalArgumentException("Please provide a valid Context.");
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface InstallReferrerResponse
  {
    public static final int DEVELOPER_ERROR = 3;
    public static final int FEATURE_NOT_SUPPORTED = 2;
    public static final int OK = 0;
    public static final int PERMISSION_ERROR = 4;
    public static final int SERVICE_DISCONNECTED = -1;
    public static final int SERVICE_UNAVAILABLE = 1;
  }
}

/* Location:
 * Qualified Name:     com.android.installreferrer.api.InstallReferrerClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */