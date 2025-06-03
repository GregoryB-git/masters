package com.android.installreferrer.api;

public abstract interface InstallReferrerStateListener
{
  public abstract void onInstallReferrerServiceDisconnected();
  
  public abstract void onInstallReferrerSetupFinished(int paramInt);
}

/* Location:
 * Qualified Name:     com.android.installreferrer.api.InstallReferrerStateListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */