package com.android.installreferrer.api;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface InstallReferrerClientImpl$ClientState
{
  public static final int CLOSED = 3;
  public static final int CONNECTED = 2;
  public static final int CONNECTING = 1;
  public static final int DISCONNECTED = 0;
}

/* Location:
 * Qualified Name:     com.android.installreferrer.api.InstallReferrerClientImpl.ClientState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */