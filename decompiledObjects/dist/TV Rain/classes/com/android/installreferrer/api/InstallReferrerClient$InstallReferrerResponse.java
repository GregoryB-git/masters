package com.android.installreferrer.api;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface InstallReferrerClient$InstallReferrerResponse
{
  public static final int DEVELOPER_ERROR = 3;
  public static final int FEATURE_NOT_SUPPORTED = 2;
  public static final int OK = 0;
  public static final int PERMISSION_ERROR = 4;
  public static final int SERVICE_DISCONNECTED = -1;
  public static final int SERVICE_UNAVAILABLE = 1;
}

/* Location:
 * Qualified Name:     com.android.installreferrer.api.InstallReferrerClient.InstallReferrerResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */