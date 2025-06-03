package com.google.firebase.perf.config;

import C4.d;
import C4.y;
import C4.z;
import F4.a;
import M4.g;
import P4.m;
import P4.q;
import P4.t;
import V2.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r4.b;
import s3.e;
import s3.n;

@Keep
public class RemoteConfigManager
{
  private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0L;
  private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
  private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000L;
  private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
  private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12L);
  private static final RemoteConfigManager instance;
  private static final a logger = ;
  private final ConcurrentHashMap<String, t> allRcConfigMap;
  private final long appStartConfigFetchDelayInMs;
  private final long appStartTimeInMs;
  private final C4.x cache;
  private final Executor executor;
  private m firebaseRemoteConfig;
  private long firebaseRemoteConfigLastFetchTimestampMs = 0L;
  private b firebaseRemoteConfigProvider;
  
  static
  {
    instance = new RemoteConfigManager();
  }
  
  @SuppressLint({"ThreadPoolCreation"})
  private RemoteConfigManager()
  {
    this(C4.x.f(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, 5000L + new Random().nextInt(25000), getInitialStartupMillis());
  }
  
  public RemoteConfigManager(C4.x paramx, Executor paramExecutor, m paramm, long paramLong1, long paramLong2)
  {
    cache = paramx;
    executor = paramExecutor;
    firebaseRemoteConfig = paramm;
    paramx = new java/util/concurrent/ConcurrentHashMap;
    if (paramm == null) {
      paramx.<init>();
    } else {
      paramx.<init>(paramm.m());
    }
    allRcConfigMap = paramx;
    appStartTimeInMs = paramLong2;
    appStartConfigFetchDelayInMs = paramLong1;
  }
  
  public static long getInitialStartupMillis()
  {
    n localn = (n)e.o().k(n.class);
    if (localn != null) {
      return localn.c();
    }
    return System.currentTimeMillis();
  }
  
  public static RemoteConfigManager getInstance()
  {
    return instance;
  }
  
  private t getRemoteConfigValue(String paramString)
  {
    triggerRemoteConfigFetchIfNecessary();
    if ((isFirebaseRemoteConfigAvailable()) && (allRcConfigMap.containsKey(paramString)))
    {
      t localt = (t)allRcConfigMap.get(paramString);
      if (localt.f() == 2)
      {
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", new Object[] { localt.b(), paramString });
        return localt;
      }
    }
    return null;
  }
  
  public static int getVersionCode(Context paramContext)
  {
    try
    {
      int i = getPackageManagergetPackageInfogetPackageName0versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return 0;
  }
  
  private boolean hasAppStartConfigFetchDelayElapsed(long paramLong)
  {
    boolean bool;
    if (paramLong - appStartTimeInMs >= appStartConfigFetchDelayInMs) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean hasLastFetchBecomeStale(long paramLong)
  {
    boolean bool;
    if (paramLong - firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean shouldFetchAndActivateRemoteConfigValues()
  {
    long l = getCurrentSystemTimeMillis();
    boolean bool;
    if ((hasAppStartConfigFetchDelayElapsed(l)) && (hasLastFetchBecomeStale(l))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch()
  {
    firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
    firebaseRemoteConfig.l().e(executor, new y(this)).d(executor, new z(this));
  }
  
  private void triggerRemoteConfigFetchIfNecessary()
  {
    if (!isFirebaseRemoteConfigAvailable()) {
      return;
    }
    if (allRcConfigMap.isEmpty()) {
      allRcConfigMap.putAll(firebaseRemoteConfig.m());
    }
    if (shouldFetchAndActivateRemoteConfigValues()) {
      triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
    }
  }
  
  public g getBoolean(String paramString)
  {
    if (paramString == null)
    {
      logger.a("The key to get Remote Config boolean value is null.");
      return g.a();
    }
    t localt = getRemoteConfigValue(paramString);
    if (localt != null) {
      try
      {
        g localg = g.e(Boolean.valueOf(localt.d()));
        return localg;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        if (!localt.b().isEmpty()) {
          logger.b("Could not parse value: '%s' for key: '%s'.", new Object[] { localt.b(), paramString });
        }
      }
    }
    return g.a();
  }
  
  public long getCurrentSystemTimeMillis()
  {
    return System.currentTimeMillis();
  }
  
  public g getDouble(String paramString)
  {
    if (paramString == null)
    {
      logger.a("The key to get Remote Config double value is null.");
      return g.a();
    }
    t localt = getRemoteConfigValue(paramString);
    if (localt != null) {
      try
      {
        g localg = g.e(Double.valueOf(localt.a()));
        return localg;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        if (!localt.b().isEmpty()) {
          logger.b("Could not parse value: '%s' for key: '%s'.", new Object[] { localt.b(), paramString });
        }
      }
    }
    return g.a();
  }
  
  public g getLong(String paramString)
  {
    if (paramString == null)
    {
      logger.a("The key to get Remote Config long value is null.");
      return g.a();
    }
    t localt = getRemoteConfigValue(paramString);
    if (localt != null) {
      try
      {
        g localg = g.e(Long.valueOf(localt.c()));
        return localg;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        if (!localt.b().isEmpty()) {
          logger.b("Could not parse value: '%s' for key: '%s'.", new Object[] { localt.b(), paramString });
        }
      }
    }
    return g.a();
  }
  
  public <T> T getRemoteConfigValueOrDefault(String paramString, T paramT)
  {
    t localt = getRemoteConfigValue(paramString);
    Object localObject = paramT;
    if (localt != null) {}
    try
    {
      if ((paramT instanceof Boolean))
      {
        localObject = Boolean.valueOf(localt.d());
        paramString = (String)localObject;
      }
      for (;;)
      {
        localObject = paramString;
        break label198;
        if ((paramT instanceof Double))
        {
          localObject = Double.valueOf(localt.a());
          paramString = (String)localObject;
        }
        else if ((!(paramT instanceof Long)) && (!(paramT instanceof Integer)))
        {
          if ((paramT instanceof String))
          {
            localObject = localt.b();
            paramString = (String)localObject;
          }
          else
          {
            localObject = localt.b();
            try
            {
              logger.b("No matching type found for the defaultValue: '%s', using String.", new Object[] { paramT });
            }
            catch (IllegalArgumentException paramT)
            {
              paramT = (T)localObject;
              break;
            }
          }
        }
        else
        {
          localObject = Long.valueOf(localt.c());
          paramString = (String)localObject;
        }
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      label198:
      for (;;) {}
    }
    localObject = paramT;
    if (!localt.b().isEmpty())
    {
      logger.b("Could not parse value: '%s' for key: '%s'.", new Object[] { localt.b(), paramString });
      localObject = paramT;
    }
    return (T)localObject;
  }
  
  public g getString(String paramString)
  {
    if (paramString == null)
    {
      logger.a("The key to get Remote Config String value is null.");
      return g.a();
    }
    paramString = getRemoteConfigValue(paramString);
    if (paramString != null) {
      return g.e(paramString.b());
    }
    return g.a();
  }
  
  public boolean isFirebaseRemoteConfigAvailable()
  {
    if (firebaseRemoteConfig == null)
    {
      Object localObject = firebaseRemoteConfigProvider;
      if (localObject != null)
      {
        localObject = (P4.x)((b)localObject).get();
        if (localObject != null) {
          firebaseRemoteConfig = ((P4.x)localObject).c("fireperf");
        }
      }
    }
    boolean bool;
    if (firebaseRemoteConfig != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isLastFetchFailed()
  {
    m localm = firebaseRemoteConfig;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (localm != null)
    {
      bool2 = bool1;
      if (localm.n().c() != 1) {
        if (firebaseRemoteConfig.n().c() == 2) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
    }
    return bool2;
  }
  
  public void setFirebaseRemoteConfigProvider(b paramb)
  {
    firebaseRemoteConfigProvider = paramb;
  }
  
  public void syncConfigValues(Map<String, t> paramMap)
  {
    allRcConfigMap.putAll(paramMap);
    Iterator localIterator = allRcConfigMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      if (!paramMap.containsKey(localObject)) {
        allRcConfigMap.remove(localObject);
      }
    }
    Object localObject = d.e();
    paramMap = (t)allRcConfigMap.get(((d)localObject).c());
    if (paramMap != null) {
      try
      {
        cache.n(((d)localObject).a(), paramMap.d());
      }
      catch (Exception paramMap)
      {
        localObject = logger;
        paramMap = "ExperimentTTID remote config flag has invalid value, expected boolean.";
      }
    } else {
      for (;;)
      {
        ((a)localObject).a(paramMap);
        break;
        localObject = logger;
        paramMap = "ExperimentTTID remote config flag does not exist.";
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.config.RemoteConfigManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */