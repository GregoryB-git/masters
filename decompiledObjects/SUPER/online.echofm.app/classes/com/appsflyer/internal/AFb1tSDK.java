package com.appsflyer.internal;

import android.content.pm.PackageManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public abstract interface AFb1tSDK
{
  public abstract void AFInAppEventParameterName();
  
  public abstract void AFInAppEventParameterName(String paramString);
  
  public abstract void AFInAppEventParameterName(@NotNull String paramString1, int paramInt, @NotNull String paramString2);
  
  public abstract void AFInAppEventParameterName(@NotNull String paramString1, @NotNull String paramString2);
  
  public abstract void AFInAppEventParameterName(@NotNull String paramString, @NotNull String... paramVarArgs);
  
  public abstract void AFInAppEventType();
  
  public abstract void AFInAppEventType(@NotNull Throwable paramThrowable);
  
  public abstract void AFKeystoreWrapper();
  
  public abstract boolean afInfoLog();
  
  public abstract void valueOf();
  
  public abstract void valueOf(String paramString, PackageManager paramPackageManager, AFc1xSDK paramAFc1xSDK);
  
  public abstract void valueOf(@NotNull String paramString1, @NotNull String paramString2);
  
  public abstract void values();
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1tSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */