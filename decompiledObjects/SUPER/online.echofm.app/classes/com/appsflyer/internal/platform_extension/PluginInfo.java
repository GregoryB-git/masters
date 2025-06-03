package com.appsflyer.internal.platform_extension;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class PluginInfo
{
  @NotNull
  private final String AFKeystoreWrapper;
  @NotNull
  private final Map<String, String> valueOf;
  @NotNull
  private final Plugin values;
  
  public PluginInfo(@NotNull Plugin paramPlugin, @NotNull String paramString)
  {
    this(paramPlugin, paramString, null, 4, null);
  }
  
  public PluginInfo(@NotNull Plugin paramPlugin, @NotNull String paramString, @NotNull Map<String, String> paramMap)
  {
    values = paramPlugin;
    AFKeystoreWrapper = paramString;
    valueOf = paramMap;
  }
  
  @NotNull
  public final Plugin component1()
  {
    return values;
  }
  
  @NotNull
  public final String component2()
  {
    return AFKeystoreWrapper;
  }
  
  @NotNull
  public final Map<String, String> component3()
  {
    return valueOf;
  }
  
  @NotNull
  public final PluginInfo copy(@NotNull Plugin paramPlugin, @NotNull String paramString, @NotNull Map<String, String> paramMap)
  {
    Intrinsics.checkNotNullParameter(paramPlugin, "");
    Intrinsics.checkNotNullParameter(paramString, "");
    Intrinsics.checkNotNullParameter(paramMap, "");
    return new PluginInfo(paramPlugin, paramString, paramMap);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof PluginInfo)) {
      return false;
    }
    paramObject = (PluginInfo)paramObject;
    if (values != values) {
      return false;
    }
    if (!Intrinsics.a(AFKeystoreWrapper, AFKeystoreWrapper)) {
      return false;
    }
    return Intrinsics.a(valueOf, valueOf);
  }
  
  @NotNull
  public final Map<String, String> getAdditionalParams()
  {
    return valueOf;
  }
  
  @NotNull
  public final Plugin getPlugin()
  {
    return values;
  }
  
  @NotNull
  public final String getVersion()
  {
    return AFKeystoreWrapper;
  }
  
  public final int hashCode()
  {
    return (values.hashCode() * 31 + AFKeystoreWrapper.hashCode()) * 31 + valueOf.hashCode();
  }
  
  @NotNull
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PluginInfo(plugin=");
    localStringBuilder.append(values);
    localStringBuilder.append(", version=");
    localStringBuilder.append(AFKeystoreWrapper);
    localStringBuilder.append(", additionalParams=");
    localStringBuilder.append(valueOf);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.platform_extension.PluginInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */