package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseFirestore$PigeonFirebaseSettings
{
  private Long cacheSizeBytes;
  private String host;
  private Boolean ignoreUndefinedProperties;
  private Boolean persistenceEnabled;
  private Boolean sslEnabled;
  
  public static PigeonFirebaseSettings fromList(ArrayList<Object> paramArrayList)
  {
    PigeonFirebaseSettings localPigeonFirebaseSettings = new PigeonFirebaseSettings();
    localPigeonFirebaseSettings.setPersistenceEnabled((Boolean)paramArrayList.get(0));
    localPigeonFirebaseSettings.setHost((String)paramArrayList.get(1));
    localPigeonFirebaseSettings.setSslEnabled((Boolean)paramArrayList.get(2));
    Object localObject = paramArrayList.get(3);
    if (localObject == null)
    {
      localObject = null;
    }
    else
    {
      long l;
      if ((localObject instanceof Integer)) {
        l = ((Integer)localObject).intValue();
      } else {
        l = ((Long)localObject).longValue();
      }
      localObject = Long.valueOf(l);
    }
    localPigeonFirebaseSettings.setCacheSizeBytes((Long)localObject);
    localPigeonFirebaseSettings.setIgnoreUndefinedProperties((Boolean)paramArrayList.get(4));
    return localPigeonFirebaseSettings;
  }
  
  public Long getCacheSizeBytes()
  {
    return cacheSizeBytes;
  }
  
  public String getHost()
  {
    return host;
  }
  
  public Boolean getIgnoreUndefinedProperties()
  {
    return ignoreUndefinedProperties;
  }
  
  public Boolean getPersistenceEnabled()
  {
    return persistenceEnabled;
  }
  
  public Boolean getSslEnabled()
  {
    return sslEnabled;
  }
  
  public void setCacheSizeBytes(Long paramLong)
  {
    cacheSizeBytes = paramLong;
  }
  
  public void setHost(String paramString)
  {
    host = paramString;
  }
  
  public void setIgnoreUndefinedProperties(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      ignoreUndefinedProperties = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"ignoreUndefinedProperties\" is null.");
  }
  
  public void setPersistenceEnabled(Boolean paramBoolean)
  {
    persistenceEnabled = paramBoolean;
  }
  
  public void setSslEnabled(Boolean paramBoolean)
  {
    sslEnabled = paramBoolean;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(5);
    localArrayList.add(persistenceEnabled);
    localArrayList.add(host);
    localArrayList.add(sslEnabled);
    localArrayList.add(cacheSizeBytes);
    localArrayList.add(ignoreUndefinedProperties);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */