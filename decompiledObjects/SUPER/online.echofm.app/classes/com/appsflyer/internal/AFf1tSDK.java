package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public abstract interface AFf1tSDK
{
  public abstract void AFInAppEventParameterName(@NotNull PluginInfo paramPluginInfo);
  
  @NotNull
  public abstract Map<String, Object> AFKeystoreWrapper();
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1tSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */