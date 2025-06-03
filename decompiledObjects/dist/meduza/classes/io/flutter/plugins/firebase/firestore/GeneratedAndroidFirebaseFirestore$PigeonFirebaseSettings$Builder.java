package io.flutter.plugins.firebase.firestore;

public final class GeneratedAndroidFirebaseFirestore$PigeonFirebaseSettings$Builder
{
  private Long cacheSizeBytes;
  private String host;
  private Boolean ignoreUndefinedProperties;
  private Boolean persistenceEnabled;
  private Boolean sslEnabled;
  
  public GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings build()
  {
    GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings localPigeonFirebaseSettings = new GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings();
    localPigeonFirebaseSettings.setPersistenceEnabled(persistenceEnabled);
    localPigeonFirebaseSettings.setHost(host);
    localPigeonFirebaseSettings.setSslEnabled(sslEnabled);
    localPigeonFirebaseSettings.setCacheSizeBytes(cacheSizeBytes);
    localPigeonFirebaseSettings.setIgnoreUndefinedProperties(ignoreUndefinedProperties);
    return localPigeonFirebaseSettings;
  }
  
  public Builder setCacheSizeBytes(Long paramLong)
  {
    cacheSizeBytes = paramLong;
    return this;
  }
  
  public Builder setHost(String paramString)
  {
    host = paramString;
    return this;
  }
  
  public Builder setIgnoreUndefinedProperties(Boolean paramBoolean)
  {
    ignoreUndefinedProperties = paramBoolean;
    return this;
  }
  
  public Builder setPersistenceEnabled(Boolean paramBoolean)
  {
    persistenceEnabled = paramBoolean;
    return this;
  }
  
  public Builder setSslEnabled(Boolean paramBoolean)
  {
    sslEnabled = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */