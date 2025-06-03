package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.Set;

public class PluginScript
  extends UserScript
{
  private boolean requiredInAllContentWorlds;
  
  public PluginScript(String paramString1, String paramString2, UserScriptInjectionTime paramUserScriptInjectionTime, ContentWorld paramContentWorld, boolean paramBoolean, Set<String> paramSet)
  {
    super(paramString1, paramString2, paramUserScriptInjectionTime, paramContentWorld, paramSet);
    requiredInAllContentWorlds = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      if (!super.equals(paramObject)) {
        return false;
      }
      paramObject = (PluginScript)paramObject;
      if (requiredInAllContentWorlds != requiredInAllContentWorlds) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return super.hashCode() * 31 + requiredInAllContentWorlds;
  }
  
  public boolean isRequiredInAllContentWorlds()
  {
    return requiredInAllContentWorlds;
  }
  
  public void setRequiredInAllContentWorlds(boolean paramBoolean)
  {
    requiredInAllContentWorlds = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("PluginScript{requiredInContentWorld=");
    localStringBuilder.append(requiredInAllContentWorlds);
    localStringBuilder.append("} ");
    localStringBuilder.append(super.toString());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */