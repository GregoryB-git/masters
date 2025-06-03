package com.android.installreferrer.api;

import android.content.Context;

public final class InstallReferrerClient$Builder
{
  private final Context mContext;
  
  private InstallReferrerClient$Builder(Context paramContext)
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

/* Location:
 * Qualified Name:     com.android.installreferrer.api.InstallReferrerClient.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */