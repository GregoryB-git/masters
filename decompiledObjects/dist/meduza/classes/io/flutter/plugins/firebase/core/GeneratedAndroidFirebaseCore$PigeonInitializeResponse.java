package io.flutter.plugins.firebase.core;

import java.util.ArrayList;
import java.util.Map;

public final class GeneratedAndroidFirebaseCore$PigeonInitializeResponse
{
  private Boolean isAutomaticDataCollectionEnabled;
  private String name;
  private GeneratedAndroidFirebaseCore.PigeonFirebaseOptions options;
  private Map<String, Object> pluginConstants;
  
  public static PigeonInitializeResponse fromList(ArrayList<Object> paramArrayList)
  {
    PigeonInitializeResponse localPigeonInitializeResponse = new PigeonInitializeResponse();
    localPigeonInitializeResponse.setName((String)paramArrayList.get(0));
    Object localObject = paramArrayList.get(1);
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.fromList((ArrayList)localObject);
    }
    localPigeonInitializeResponse.setOptions((GeneratedAndroidFirebaseCore.PigeonFirebaseOptions)localObject);
    localPigeonInitializeResponse.setIsAutomaticDataCollectionEnabled((Boolean)paramArrayList.get(2));
    localPigeonInitializeResponse.setPluginConstants((Map)paramArrayList.get(3));
    return localPigeonInitializeResponse;
  }
  
  public Boolean getIsAutomaticDataCollectionEnabled()
  {
    return isAutomaticDataCollectionEnabled;
  }
  
  public String getName()
  {
    return name;
  }
  
  public GeneratedAndroidFirebaseCore.PigeonFirebaseOptions getOptions()
  {
    return options;
  }
  
  public Map<String, Object> getPluginConstants()
  {
    return pluginConstants;
  }
  
  public void setIsAutomaticDataCollectionEnabled(Boolean paramBoolean)
  {
    isAutomaticDataCollectionEnabled = paramBoolean;
  }
  
  public void setName(String paramString)
  {
    if (paramString != null)
    {
      name = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"name\" is null.");
  }
  
  public void setOptions(GeneratedAndroidFirebaseCore.PigeonFirebaseOptions paramPigeonFirebaseOptions)
  {
    if (paramPigeonFirebaseOptions != null)
    {
      options = paramPigeonFirebaseOptions;
      return;
    }
    throw new IllegalStateException("Nonnull field \"options\" is null.");
  }
  
  public void setPluginConstants(Map<String, Object> paramMap)
  {
    if (paramMap != null)
    {
      pluginConstants = paramMap;
      return;
    }
    throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(4);
    localArrayList.add(name);
    Object localObject = options;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((GeneratedAndroidFirebaseCore.PigeonFirebaseOptions)localObject).toList();
    }
    localArrayList.add(localObject);
    localArrayList.add(isAutomaticDataCollectionEnabled);
    localArrayList.add(pluginConstants);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Boolean isAutomaticDataCollectionEnabled;
    private String name;
    private GeneratedAndroidFirebaseCore.PigeonFirebaseOptions options;
    private Map<String, Object> pluginConstants;
    
    public GeneratedAndroidFirebaseCore.PigeonInitializeResponse build()
    {
      GeneratedAndroidFirebaseCore.PigeonInitializeResponse localPigeonInitializeResponse = new GeneratedAndroidFirebaseCore.PigeonInitializeResponse();
      localPigeonInitializeResponse.setName(name);
      localPigeonInitializeResponse.setOptions(options);
      localPigeonInitializeResponse.setIsAutomaticDataCollectionEnabled(isAutomaticDataCollectionEnabled);
      localPigeonInitializeResponse.setPluginConstants(pluginConstants);
      return localPigeonInitializeResponse;
    }
    
    public Builder setIsAutomaticDataCollectionEnabled(Boolean paramBoolean)
    {
      isAutomaticDataCollectionEnabled = paramBoolean;
      return this;
    }
    
    public Builder setName(String paramString)
    {
      name = paramString;
      return this;
    }
    
    public Builder setOptions(GeneratedAndroidFirebaseCore.PigeonFirebaseOptions paramPigeonFirebaseOptions)
    {
      options = paramPigeonFirebaseOptions;
      return this;
    }
    
    public Builder setPluginConstants(Map<String, Object> paramMap)
    {
      pluginConstants = paramMap;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.PigeonInitializeResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */