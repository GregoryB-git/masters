package com.appsflyer.internal;

import java.text.SimpleDateFormat;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public abstract interface AFe1vSDK
{
  @NotNull
  public abstract String AFInAppEventParameterName();
  
  public abstract void AFInAppEventParameterName(@NotNull Map<String, Object> paramMap);
  
  public abstract String AFInAppEventType();
  
  public abstract void AFInAppEventType(@NotNull Map<String, Object> paramMap);
  
  public abstract void AFInAppEventType(boolean paramBoolean, @NotNull Map<String, Object> paramMap, int paramInt);
  
  public abstract String AFKeystoreWrapper();
  
  public abstract void AFKeystoreWrapper(@NotNull Map<String, Object> paramMap, boolean paramBoolean);
  
  public abstract String AFLogger();
  
  public abstract boolean afDebugLog();
  
  public abstract boolean afErrorLog();
  
  public abstract String afInfoLog();
  
  public abstract boolean afRDLog();
  
  public abstract long valueOf();
  
  public abstract void valueOf(@NotNull Map<String, ? extends Object> paramMap);
  
  public abstract void valueOf(@NotNull Map<String, Object> paramMap, @NotNull String paramString);
  
  public abstract long values();
  
  public abstract String values(@NotNull SimpleDateFormat paramSimpleDateFormat);
  
  public abstract void values(@NotNull Map<String, Object> paramMap);
  
  public abstract void values(@NotNull Map<String, Object> paramMap, String paramString);
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFe1vSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */