package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class MetadataBackendRegistry
  implements BackendRegistry
{
  private static final String BACKEND_KEY_PREFIX = "backend:";
  private static final String TAG = "BackendRegistry";
  private final BackendFactoryProvider backendFactoryProvider;
  private final Map<String, TransportBackend> backends = new HashMap();
  private final CreationContextFactory creationContextFactory;
  
  @Inject
  public MetadataBackendRegistry(Context paramContext, CreationContextFactory paramCreationContextFactory)
  {
    this(new BackendFactoryProvider(paramContext), paramCreationContextFactory);
  }
  
  public MetadataBackendRegistry(BackendFactoryProvider paramBackendFactoryProvider, CreationContextFactory paramCreationContextFactory)
  {
    backendFactoryProvider = paramBackendFactoryProvider;
    creationContextFactory = paramCreationContextFactory;
  }
  
  @Nullable
  public TransportBackend get(String paramString)
  {
    try
    {
      if (backends.containsKey(paramString))
      {
        paramString = (TransportBackend)backends.get(paramString);
        return paramString;
      }
      Object localObject = backendFactoryProvider.get(paramString);
      if (localObject == null) {
        return null;
      }
      localObject = ((BackendFactory)localObject).create(creationContextFactory.create(paramString));
      backends.put(paramString, localObject);
      return (TransportBackend)localObject;
    }
    finally {}
  }
  
  public static class BackendFactoryProvider
  {
    private final Context applicationContext;
    private Map<String, String> backendProviders = null;
    
    public BackendFactoryProvider(Context paramContext)
    {
      applicationContext = paramContext;
    }
    
    private Map<String, String> discover(Context paramContext)
    {
      Bundle localBundle = getMetadata(paramContext);
      if (localBundle == null)
      {
        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
        return Collections.emptyMap();
      }
      HashMap localHashMap = new HashMap();
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        paramContext = (String)localIterator.next();
        Object localObject = localBundle.get(paramContext);
        if (((localObject instanceof String)) && (paramContext.startsWith("backend:")))
        {
          String[] arrayOfString = ((String)localObject).split(",", -1);
          int i = arrayOfString.length;
          for (int j = 0; j < i; j++)
          {
            localObject = arrayOfString[j].trim();
            if (!((String)localObject).isEmpty()) {
              localHashMap.put(localObject, paramContext.substring(8));
            }
          }
        }
      }
      return localHashMap;
    }
    
    private Map<String, String> getBackendProviders()
    {
      if (backendProviders == null) {
        backendProviders = discover(applicationContext);
      }
      return backendProviders;
    }
    
    private static Bundle getMetadata(Context paramContext)
    {
      try
      {
        PackageManager localPackageManager = paramContext.getPackageManager();
        if (localPackageManager == null)
        {
          Log.w("BackendRegistry", "Context has no PackageManager.");
          return null;
        }
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramContext, TransportBackendDiscovery.class);
        paramContext = localPackageManager.getServiceInfo(localComponentName, 128);
        if (paramContext == null)
        {
          Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
          return null;
        }
        paramContext = metaData;
        return paramContext;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.w("BackendRegistry", "Application info not found.");
      }
      return null;
    }
    
    @Nullable
    public BackendFactory get(String paramString)
    {
      paramString = (String)getBackendProviders().get(paramString);
      if (paramString == null) {
        return null;
      }
      try
      {
        BackendFactory localBackendFactory = (BackendFactory)Class.forName(paramString).asSubclass(BackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        return localBackendFactory;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[] { paramString }), localInvocationTargetException);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.w("BackendRegistry", String.format("Could not instantiate %s", new Object[] { paramString }), localNoSuchMethodException);
      }
      catch (InstantiationException localInstantiationException)
      {
        Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[] { paramString }), localInstantiationException);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.w("BackendRegistry", String.format("Could not instantiate %s.", new Object[] { paramString }), localIllegalAccessException);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Log.w("BackendRegistry", String.format("Class %s is not found.", new Object[] { paramString }), localClassNotFoundException);
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.backends.MetadataBackendRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */