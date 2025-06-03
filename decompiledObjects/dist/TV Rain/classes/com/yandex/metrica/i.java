package com.yandex.metrica;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class i
  extends YandexMetricaConfig
{
  @Nullable
  public final String a;
  @Nullable
  public final Map<String, String> b;
  @Nullable
  public final String c;
  @Nullable
  public final List<String> d;
  @Nullable
  public final Integer e;
  @Nullable
  public final Integer f;
  @Nullable
  public final Integer g;
  @Nullable
  public final Map<String, String> h;
  @Nullable
  public final Boolean i;
  @Nullable
  public final Boolean j;
  @Nullable
  public final Boolean k;
  @Nullable
  public final c l;
  
  public i(@NonNull YandexMetricaConfig paramYandexMetricaConfig)
  {
    super(paramYandexMetricaConfig);
    a = null;
    b = null;
    e = null;
    f = null;
    g = null;
    c = null;
    h = null;
    i = null;
    j = null;
    d = null;
    k = null;
    l = null;
  }
  
  private i(@NonNull b paramb)
  {
    super(b.a(paramb));
    e = b.g(paramb);
    Object localObject1 = b.h(paramb);
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = A2.c((Collection)localObject1);
    }
    d = ((List)localObject1);
    a = b.i(paramb);
    localObject1 = b.j(paramb);
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = A2.e((Map)localObject1);
    }
    b = ((Map)localObject1);
    g = b.k(paramb);
    f = b.l(paramb);
    c = f;
    h = A2.e(b.m(paramb));
    i = b.n(paramb);
    j = b.b(paramb);
    b.c(paramb);
    k = b.d(paramb);
    l = b.e(paramb);
    b.f(paramb);
  }
  
  @NonNull
  public static b a(@NonNull YandexMetricaConfig paramYandexMetricaConfig)
  {
    b localb = new b(apiKey);
    if (A2.a(appVersion)) {
      localb.a(appVersion);
    }
    if (A2.a(sessionTimeout)) {
      localb.e(sessionTimeout.intValue());
    }
    if (A2.a(crashReporting)) {
      localb.d(crashReporting.booleanValue());
    }
    if (A2.a(nativeCrashReporting)) {
      localb.f(nativeCrashReporting.booleanValue());
    }
    if (A2.a(location)) {
      localb.a(location);
    }
    if (A2.a(locationTracking)) {
      localb.e(locationTracking.booleanValue());
    }
    if ((A2.a(logs)) && (logs.booleanValue())) {
      localb.b();
    }
    if (A2.a(preloadInfo)) {
      localb.a(preloadInfo);
    }
    if (A2.a(firstActivationAsUpdate)) {
      localb.a(firstActivationAsUpdate.booleanValue());
    }
    if (A2.a(statisticsSending)) {
      localb.j(statisticsSending.booleanValue());
    }
    if (A2.a(maxReportsInDatabaseCount)) {
      localb.d(maxReportsInDatabaseCount.intValue());
    }
    if (A2.a(errorEnvironment))
    {
      Iterator localIterator = errorEnvironment.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localb.b((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    if (A2.a(userProfileID)) {
      localb.c(userProfileID);
    }
    if (A2.a(revenueAutoTrackingEnabled)) {
      localb.h(revenueAutoTrackingEnabled.booleanValue());
    }
    if (A2.a(sessionsAutoTrackingEnabled)) {
      localb.i(sessionsAutoTrackingEnabled.booleanValue());
    }
    if (A2.a(appOpenTrackingEnabled)) {
      localb.c(appOpenTrackingEnabled.booleanValue());
    }
    if ((paramYandexMetricaConfig instanceof i))
    {
      paramYandexMetricaConfig = (i)paramYandexMetricaConfig;
      if (A2.a(d)) {
        localb.a(d);
      }
      if (A2.a(l)) {
        localb.a(l);
      }
      A2.a(null);
    }
    return localb;
  }
  
  @NonNull
  public static b a(@NonNull String paramString)
  {
    return new b(paramString);
  }
  
  public static final class b
  {
    @NonNull
    private YandexMetricaConfig.Builder a;
    @Nullable
    private String b;
    @Nullable
    private List<String> c;
    @Nullable
    private Integer d;
    @Nullable
    private Map<String, String> e;
    @Nullable
    public String f;
    @Nullable
    private Integer g;
    @Nullable
    private Integer h;
    @NonNull
    private LinkedHashMap<String, String> i = new LinkedHashMap();
    @Nullable
    private Boolean j;
    @Nullable
    private Boolean k;
    @Nullable
    private Boolean l;
    @Nullable
    private c m;
    
    public b(@NonNull String paramString)
    {
      a = YandexMetricaConfig.newConfigBuilder(paramString);
    }
    
    @NonNull
    public b a(int paramInt)
    {
      if (paramInt >= 0)
      {
        d = Integer.valueOf(paramInt);
        return this;
      }
      throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", new Object[] { "App Build Number" }));
    }
    
    @NonNull
    public b a(@Nullable Location paramLocation)
    {
      a.withLocation(paramLocation);
      return this;
    }
    
    @NonNull
    public b a(@Nullable PreloadInfo paramPreloadInfo)
    {
      a.withPreloadInfo(paramPreloadInfo);
      return this;
    }
    
    @NonNull
    public b a(@Nullable c paramc)
    {
      m = paramc;
      return this;
    }
    
    @NonNull
    public b a(@NonNull String paramString)
    {
      a.withAppVersion(paramString);
      return this;
    }
    
    @NonNull
    public b a(@NonNull String paramString1, @Nullable String paramString2)
    {
      i.put(paramString1, paramString2);
      return this;
    }
    
    @NonNull
    public b a(@Nullable List<String> paramList)
    {
      c = paramList;
      return this;
    }
    
    @NonNull
    public b a(@Nullable Map<String, String> paramMap, @Nullable Boolean paramBoolean)
    {
      j = paramBoolean;
      e = paramMap;
      return this;
    }
    
    @NonNull
    public b a(boolean paramBoolean)
    {
      a.handleFirstActivationAsUpdate(paramBoolean);
      return this;
    }
    
    @NonNull
    public i a()
    {
      return new i(this, null);
    }
    
    @NonNull
    public b b()
    {
      a.withLogs();
      return this;
    }
    
    @NonNull
    public b b(int paramInt)
    {
      g = Integer.valueOf(paramInt);
      return this;
    }
    
    @NonNull
    public b b(@Nullable String paramString)
    {
      b = paramString;
      return this;
    }
    
    @NonNull
    public b b(@NonNull String paramString1, @Nullable String paramString2)
    {
      a.withErrorEnvironmentValue(paramString1, paramString2);
      return this;
    }
    
    @NonNull
    public b b(boolean paramBoolean)
    {
      l = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public b c(int paramInt)
    {
      h = Integer.valueOf(paramInt);
      return this;
    }
    
    @NonNull
    public b c(@Nullable String paramString)
    {
      a.withUserProfileID(paramString);
      return this;
    }
    
    @NonNull
    public b c(boolean paramBoolean)
    {
      a.withAppOpenTrackingEnabled(paramBoolean);
      return this;
    }
    
    @NonNull
    public b d(int paramInt)
    {
      a.withMaxReportsInDatabaseCount(paramInt);
      return this;
    }
    
    @NonNull
    public b d(boolean paramBoolean)
    {
      a.withCrashReporting(paramBoolean);
      return this;
    }
    
    @NonNull
    public b e(int paramInt)
    {
      a.withSessionTimeout(paramInt);
      return this;
    }
    
    @NonNull
    public b e(boolean paramBoolean)
    {
      a.withLocationTracking(paramBoolean);
      return this;
    }
    
    @NonNull
    public b f(boolean paramBoolean)
    {
      a.withNativeCrashReporting(paramBoolean);
      return this;
    }
    
    @NonNull
    public b g(boolean paramBoolean)
    {
      k = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public b h(boolean paramBoolean)
    {
      a.withRevenueAutoTrackingEnabled(paramBoolean);
      return this;
    }
    
    @NonNull
    public b i(boolean paramBoolean)
    {
      a.withSessionsAutoTrackingEnabled(paramBoolean);
      return this;
    }
    
    @NonNull
    public b j(boolean paramBoolean)
    {
      a.withStatisticsSending(paramBoolean);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */