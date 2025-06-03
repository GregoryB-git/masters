package io.flutter.plugins.firebase.core;

import java.util.Map;

public final class GeneratedAndroidFirebaseCore$PigeonInitializeResponse$Builder
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */