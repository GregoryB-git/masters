package io.flutter.plugins.firebase.core;

import android.util.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAndroidFirebaseCore
{
  public static ArrayList<Object> wrapError(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList(3);
    if ((paramThrowable instanceof FlutterError))
    {
      paramThrowable = (FlutterError)paramThrowable;
      localArrayList.add(code);
      localArrayList.add(paramThrowable.getMessage());
      paramThrowable = details;
    }
    else
    {
      localArrayList.add(paramThrowable.toString());
      localArrayList.add(paramThrowable.getClass().getSimpleName());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Cause: ");
      localStringBuilder.append(paramThrowable.getCause());
      localStringBuilder.append(", Stacktrace: ");
      localStringBuilder.append(Log.getStackTraceString(paramThrowable));
      paramThrowable = localStringBuilder.toString();
    }
    localArrayList.add(paramThrowable);
    return localArrayList;
  }
  
  public static abstract interface FirebaseAppHostApi
  {
    public abstract void delete(String paramString, GeneratedAndroidFirebaseCore.Result<Void> paramResult);
    
    public abstract void setAutomaticDataCollectionEnabled(String paramString, Boolean paramBoolean, GeneratedAndroidFirebaseCore.Result<Void> paramResult);
    
    public abstract void setAutomaticResourceManagementEnabled(String paramString, Boolean paramBoolean, GeneratedAndroidFirebaseCore.Result<Void> paramResult);
  }
  
  public static abstract interface FirebaseCoreHostApi
  {
    public abstract void initializeApp(String paramString, GeneratedAndroidFirebaseCore.PigeonFirebaseOptions paramPigeonFirebaseOptions, GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> paramResult);
    
    public abstract void initializeCore(GeneratedAndroidFirebaseCore.Result<List<GeneratedAndroidFirebaseCore.PigeonInitializeResponse>> paramResult);
    
    public abstract void optionsFromResource(GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonFirebaseOptions> paramResult);
  }
  
  public static class FirebaseCoreHostApiCodec
    extends StandardMessageCodec
  {
    public static final FirebaseCoreHostApiCodec INSTANCE = new FirebaseCoreHostApiCodec();
    
    public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
    {
      if (paramByte != Byte.MIN_VALUE)
      {
        if (paramByte != -127) {
          return super.readValueOfType(paramByte, paramByteBuffer);
        }
        return GeneratedAndroidFirebaseCore.PigeonInitializeResponse.fromList((ArrayList)readValue(paramByteBuffer));
      }
      return GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.fromList((ArrayList)readValue(paramByteBuffer));
    }
    
    public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof GeneratedAndroidFirebaseCore.PigeonFirebaseOptions)) {
        paramByteArrayOutputStream.write(128);
      }
      for (paramObject = ((GeneratedAndroidFirebaseCore.PigeonFirebaseOptions)paramObject).toList();; paramObject = ((GeneratedAndroidFirebaseCore.PigeonInitializeResponse)paramObject).toList())
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        return;
        if (!(paramObject instanceof GeneratedAndroidFirebaseCore.PigeonInitializeResponse)) {
          break;
        }
        paramByteArrayOutputStream.write(129);
      }
      super.writeValue(paramByteArrayOutputStream, paramObject);
    }
  }
  
  public static class FlutterError
    extends RuntimeException
  {
    public final String code;
    public final Object details;
    
    public FlutterError(String paramString1, String paramString2, Object paramObject)
    {
      super();
      code = paramString1;
      details = paramObject;
    }
  }
  
  public static final class PigeonFirebaseOptions
  {
    private String androidClientId;
    private String apiKey;
    private String appGroupId;
    private String appId;
    private String authDomain;
    private String databaseURL;
    private String deepLinkURLScheme;
    private String iosBundleId;
    private String iosClientId;
    private String measurementId;
    private String messagingSenderId;
    private String projectId;
    private String storageBucket;
    private String trackingId;
    
    public static PigeonFirebaseOptions fromList(ArrayList<Object> paramArrayList)
    {
      PigeonFirebaseOptions localPigeonFirebaseOptions = new PigeonFirebaseOptions();
      localPigeonFirebaseOptions.setApiKey((String)paramArrayList.get(0));
      localPigeonFirebaseOptions.setAppId((String)paramArrayList.get(1));
      localPigeonFirebaseOptions.setMessagingSenderId((String)paramArrayList.get(2));
      localPigeonFirebaseOptions.setProjectId((String)paramArrayList.get(3));
      localPigeonFirebaseOptions.setAuthDomain((String)paramArrayList.get(4));
      localPigeonFirebaseOptions.setDatabaseURL((String)paramArrayList.get(5));
      localPigeonFirebaseOptions.setStorageBucket((String)paramArrayList.get(6));
      localPigeonFirebaseOptions.setMeasurementId((String)paramArrayList.get(7));
      localPigeonFirebaseOptions.setTrackingId((String)paramArrayList.get(8));
      localPigeonFirebaseOptions.setDeepLinkURLScheme((String)paramArrayList.get(9));
      localPigeonFirebaseOptions.setAndroidClientId((String)paramArrayList.get(10));
      localPigeonFirebaseOptions.setIosClientId((String)paramArrayList.get(11));
      localPigeonFirebaseOptions.setIosBundleId((String)paramArrayList.get(12));
      localPigeonFirebaseOptions.setAppGroupId((String)paramArrayList.get(13));
      return localPigeonFirebaseOptions;
    }
    
    public String getAndroidClientId()
    {
      return androidClientId;
    }
    
    public String getApiKey()
    {
      return apiKey;
    }
    
    public String getAppGroupId()
    {
      return appGroupId;
    }
    
    public String getAppId()
    {
      return appId;
    }
    
    public String getAuthDomain()
    {
      return authDomain;
    }
    
    public String getDatabaseURL()
    {
      return databaseURL;
    }
    
    public String getDeepLinkURLScheme()
    {
      return deepLinkURLScheme;
    }
    
    public String getIosBundleId()
    {
      return iosBundleId;
    }
    
    public String getIosClientId()
    {
      return iosClientId;
    }
    
    public String getMeasurementId()
    {
      return measurementId;
    }
    
    public String getMessagingSenderId()
    {
      return messagingSenderId;
    }
    
    public String getProjectId()
    {
      return projectId;
    }
    
    public String getStorageBucket()
    {
      return storageBucket;
    }
    
    public String getTrackingId()
    {
      return trackingId;
    }
    
    public void setAndroidClientId(String paramString)
    {
      androidClientId = paramString;
    }
    
    public void setApiKey(String paramString)
    {
      if (paramString != null)
      {
        apiKey = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
    }
    
    public void setAppGroupId(String paramString)
    {
      appGroupId = paramString;
    }
    
    public void setAppId(String paramString)
    {
      if (paramString != null)
      {
        appId = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"appId\" is null.");
    }
    
    public void setAuthDomain(String paramString)
    {
      authDomain = paramString;
    }
    
    public void setDatabaseURL(String paramString)
    {
      databaseURL = paramString;
    }
    
    public void setDeepLinkURLScheme(String paramString)
    {
      deepLinkURLScheme = paramString;
    }
    
    public void setIosBundleId(String paramString)
    {
      iosBundleId = paramString;
    }
    
    public void setIosClientId(String paramString)
    {
      iosClientId = paramString;
    }
    
    public void setMeasurementId(String paramString)
    {
      measurementId = paramString;
    }
    
    public void setMessagingSenderId(String paramString)
    {
      if (paramString != null)
      {
        messagingSenderId = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
    }
    
    public void setProjectId(String paramString)
    {
      if (paramString != null)
      {
        projectId = paramString;
        return;
      }
      throw new IllegalStateException("Nonnull field \"projectId\" is null.");
    }
    
    public void setStorageBucket(String paramString)
    {
      storageBucket = paramString;
    }
    
    public void setTrackingId(String paramString)
    {
      trackingId = paramString;
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(14);
      localArrayList.add(apiKey);
      localArrayList.add(appId);
      localArrayList.add(messagingSenderId);
      localArrayList.add(projectId);
      localArrayList.add(authDomain);
      localArrayList.add(databaseURL);
      localArrayList.add(storageBucket);
      localArrayList.add(measurementId);
      localArrayList.add(trackingId);
      localArrayList.add(deepLinkURLScheme);
      localArrayList.add(androidClientId);
      localArrayList.add(iosClientId);
      localArrayList.add(iosBundleId);
      localArrayList.add(appGroupId);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private String androidClientId;
      private String apiKey;
      private String appGroupId;
      private String appId;
      private String authDomain;
      private String databaseURL;
      private String deepLinkURLScheme;
      private String iosBundleId;
      private String iosClientId;
      private String measurementId;
      private String messagingSenderId;
      private String projectId;
      private String storageBucket;
      private String trackingId;
      
      public GeneratedAndroidFirebaseCore.PigeonFirebaseOptions build()
      {
        GeneratedAndroidFirebaseCore.PigeonFirebaseOptions localPigeonFirebaseOptions = new GeneratedAndroidFirebaseCore.PigeonFirebaseOptions();
        localPigeonFirebaseOptions.setApiKey(apiKey);
        localPigeonFirebaseOptions.setAppId(appId);
        localPigeonFirebaseOptions.setMessagingSenderId(messagingSenderId);
        localPigeonFirebaseOptions.setProjectId(projectId);
        localPigeonFirebaseOptions.setAuthDomain(authDomain);
        localPigeonFirebaseOptions.setDatabaseURL(databaseURL);
        localPigeonFirebaseOptions.setStorageBucket(storageBucket);
        localPigeonFirebaseOptions.setMeasurementId(measurementId);
        localPigeonFirebaseOptions.setTrackingId(trackingId);
        localPigeonFirebaseOptions.setDeepLinkURLScheme(deepLinkURLScheme);
        localPigeonFirebaseOptions.setAndroidClientId(androidClientId);
        localPigeonFirebaseOptions.setIosClientId(iosClientId);
        localPigeonFirebaseOptions.setIosBundleId(iosBundleId);
        localPigeonFirebaseOptions.setAppGroupId(appGroupId);
        return localPigeonFirebaseOptions;
      }
      
      public Builder setAndroidClientId(String paramString)
      {
        androidClientId = paramString;
        return this;
      }
      
      public Builder setApiKey(String paramString)
      {
        apiKey = paramString;
        return this;
      }
      
      public Builder setAppGroupId(String paramString)
      {
        appGroupId = paramString;
        return this;
      }
      
      public Builder setAppId(String paramString)
      {
        appId = paramString;
        return this;
      }
      
      public Builder setAuthDomain(String paramString)
      {
        authDomain = paramString;
        return this;
      }
      
      public Builder setDatabaseURL(String paramString)
      {
        databaseURL = paramString;
        return this;
      }
      
      public Builder setDeepLinkURLScheme(String paramString)
      {
        deepLinkURLScheme = paramString;
        return this;
      }
      
      public Builder setIosBundleId(String paramString)
      {
        iosBundleId = paramString;
        return this;
      }
      
      public Builder setIosClientId(String paramString)
      {
        iosClientId = paramString;
        return this;
      }
      
      public Builder setMeasurementId(String paramString)
      {
        measurementId = paramString;
        return this;
      }
      
      public Builder setMessagingSenderId(String paramString)
      {
        messagingSenderId = paramString;
        return this;
      }
      
      public Builder setProjectId(String paramString)
      {
        projectId = paramString;
        return this;
      }
      
      public Builder setStorageBucket(String paramString)
      {
        storageBucket = paramString;
        return this;
      }
      
      public Builder setTrackingId(String paramString)
      {
        trackingId = paramString;
        return this;
      }
    }
  }
  
  public static final class PigeonInitializeResponse
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
  
  public static abstract interface Result<T>
  {
    public abstract void error(Throwable paramThrowable);
    
    public abstract void success(T paramT);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */