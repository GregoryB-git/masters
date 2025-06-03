package androidx.startup;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.tracing.Trace;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AppInitializer
{
  private static final String SECTION_NAME = "Startup";
  private static volatile AppInitializer sInstance;
  private static final Object sLock = new Object();
  @NonNull
  public final Context mContext;
  @NonNull
  public final Set<Class<? extends Initializer<?>>> mDiscovered;
  @NonNull
  public final Map<Class<?>, Object> mInitialized;
  
  public AppInitializer(@NonNull Context paramContext)
  {
    mContext = paramContext.getApplicationContext();
    mDiscovered = new HashSet();
    mInitialized = new HashMap();
  }
  
  @NonNull
  private <T> T doInitialize(@NonNull Class<? extends Initializer<?>> paramClass, @NonNull Set<Class<?>> paramSet)
  {
    if (Trace.isEnabled()) {}
    try
    {
      Trace.beginSection(paramClass.getSimpleName());
      if (!paramSet.contains(paramClass))
      {
        if (!mInitialized.containsKey(paramClass))
        {
          paramSet.add(paramClass);
          try
          {
            Object localObject1 = (Initializer)paramClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Object localObject2 = ((Initializer)localObject1).dependencies();
            if (!((List)localObject2).isEmpty())
            {
              localObject2 = ((List)localObject2).iterator();
              while (((Iterator)localObject2).hasNext())
              {
                Class localClass = (Class)((Iterator)localObject2).next();
                if (!mInitialized.containsKey(localClass)) {
                  doInitialize(localClass, paramSet);
                }
              }
            }
            localObject1 = ((Initializer)localObject1).create(mContext);
            paramSet.remove(paramClass);
            mInitialized.put(paramClass, localObject1);
            paramClass = (Class<? extends Initializer<?>>)localObject1;
          }
          finally
          {
            paramClass = new androidx/startup/StartupException;
            paramClass.<init>(paramSet);
          }
        }
        paramClass = mInitialized.get(paramClass);
        return paramClass;
      }
      paramSet = String.format("Cannot initialize %s. Cycle detected.", new Object[] { paramClass.getName() });
      paramClass = new java/lang/IllegalStateException;
      paramClass.<init>(paramSet);
      throw paramClass;
    }
    finally
    {
      Trace.endSection();
    }
  }
  
  @NonNull
  public static AppInitializer getInstance(@NonNull Context paramContext)
  {
    if (sInstance == null) {
      synchronized (sLock)
      {
        if (sInstance == null)
        {
          AppInitializer localAppInitializer = new androidx/startup/AppInitializer;
          localAppInitializer.<init>(paramContext);
          sInstance = localAppInitializer;
        }
      }
    }
    return sInstance;
  }
  
  public static void setDelegate(@NonNull AppInitializer paramAppInitializer)
  {
    synchronized (sLock)
    {
      sInstance = paramAppInitializer;
      return;
    }
  }
  
  /* Error */
  public void discoverAndInitialize()
  {
    // Byte code:
    //   0: ldc 8
    //   2: invokestatic 67	androidx/tracing/Trace:beginSection	(Ljava/lang/String;)V
    //   5: new 171	android/content/ComponentName
    //   8: astore_1
    //   9: aload_1
    //   10: aload_0
    //   11: getfield 38	androidx/startup/AppInitializer:mContext	Landroid/content/Context;
    //   14: invokevirtual 174	android/content/Context:getPackageName	()Ljava/lang/String;
    //   17: ldc -80
    //   19: invokevirtual 145	java/lang/Class:getName	()Ljava/lang/String;
    //   22: invokespecial 179	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload_0
    //   26: aload_0
    //   27: getfield 38	androidx/startup/AppInitializer:mContext	Landroid/content/Context;
    //   30: invokevirtual 183	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   33: aload_1
    //   34: sipush 128
    //   37: invokevirtual 189	android/content/pm/PackageManager:getProviderInfo	(Landroid/content/ComponentName;I)Landroid/content/pm/ProviderInfo;
    //   40: getfield 195	android/content/pm/ProviderInfo:metaData	Landroid/os/Bundle;
    //   43: invokevirtual 198	androidx/startup/AppInitializer:discoverAndInitialize	(Landroid/os/Bundle;)V
    //   46: invokestatic 140	androidx/tracing/Trace:endSection	()V
    //   49: return
    //   50: astore_1
    //   51: goto +15 -> 66
    //   54: astore_2
    //   55: new 130	androidx/startup/StartupException
    //   58: astore_1
    //   59: aload_1
    //   60: aload_2
    //   61: invokespecial 133	androidx/startup/StartupException:<init>	(Ljava/lang/Throwable;)V
    //   64: aload_1
    //   65: athrow
    //   66: invokestatic 140	androidx/tracing/Trace:endSection	()V
    //   69: aload_1
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	AppInitializer
    //   8	26	1	localComponentName	android.content.ComponentName
    //   50	1	1	localObject	Object
    //   58	12	1	localStartupException	StartupException
    //   54	7	2	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    // Exception table:
    //   from	to	target	type
    //   0	46	50	finally
    //   55	66	50	finally
    //   0	46	54	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public void discoverAndInitialize(@Nullable Bundle paramBundle)
  {
    String str = mContext.getString(R.string.androidx_startup);
    if (paramBundle != null) {
      try
      {
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        Iterator localIterator = paramBundle.keySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (String)localIterator.next();
          if (str.equals(paramBundle.getString((String)localObject, null)))
          {
            localObject = Class.forName((String)localObject);
            if (Initializer.class.isAssignableFrom((Class)localObject)) {
              mDiscovered.add(localObject);
            }
          }
        }
        paramBundle = mDiscovered.iterator();
        while (paramBundle.hasNext()) {
          doInitialize((Class)paramBundle.next(), localHashSet);
        }
        return;
      }
      catch (ClassNotFoundException paramBundle)
      {
        throw new StartupException(paramBundle);
      }
    }
  }
  
  @NonNull
  public <T> T doInitialize(@NonNull Class<? extends Initializer<?>> paramClass)
  {
    synchronized (sLock)
    {
      Object localObject2 = mInitialized.get(paramClass);
      Object localObject3 = localObject2;
      if (localObject2 == null)
      {
        localObject3 = new java/util/HashSet;
        ((HashSet)localObject3).<init>();
        localObject3 = doInitialize(paramClass, (Set)localObject3);
      }
      return (T)localObject3;
    }
  }
  
  @NonNull
  public <T> T initializeComponent(@NonNull Class<? extends Initializer<T>> paramClass)
  {
    return (T)doInitialize(paramClass);
  }
  
  public boolean isEagerlyInitialized(@NonNull Class<? extends Initializer<?>> paramClass)
  {
    return mDiscovered.contains(paramClass);
  }
}

/* Location:
 * Qualified Name:     androidx.startup.AppInitializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */