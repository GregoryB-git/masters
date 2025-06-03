package com.appsflyer.internal;

import V5.m;
import V5.q;
import W5.C;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFf1sSDK
  implements AFf1tSDK
{
  @NotNull
  private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.12.2", null, 4, null);
  
  public final void AFInAppEventParameterName(@NotNull PluginInfo paramPluginInfo)
  {
    Intrinsics.checkNotNullParameter(paramPluginInfo, "");
    AFInAppEventParameterName = paramPluginInfo;
  }
  
  @NotNull
  public final Map<String, Object> AFKeystoreWrapper()
  {
    Map localMap = C.g(new m[] { q.a("platform", AFInAppEventParameterName.getPlugin().getPluginName()), q.a("version", AFInAppEventParameterName.getVersion()) });
    if ((true ^ AFInAppEventParameterName.getAdditionalParams().isEmpty())) {
      localMap.put("extras", AFInAppEventParameterName.getAdditionalParams());
    }
    return localMap;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1sSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */