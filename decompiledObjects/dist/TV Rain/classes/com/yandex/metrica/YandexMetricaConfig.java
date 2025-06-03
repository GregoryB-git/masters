package com.yandex.metrica;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.m1;
import com.yandex.metrica.impl.ob.un;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.impl.ob.yn;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class YandexMetricaConfig
{
  @NonNull
  public final String apiKey;
  @Nullable
  public final Boolean appOpenTrackingEnabled;
  @Nullable
  public final String appVersion;
  @Nullable
  public final Boolean crashReporting;
  @Nullable
  public final Map<String, String> errorEnvironment;
  @Nullable
  public final Boolean firstActivationAsUpdate;
  @Nullable
  public final Location location;
  @Nullable
  public final Boolean locationTracking;
  @Nullable
  public final Boolean logs;
  @Nullable
  public final Integer maxReportsInDatabaseCount;
  @Nullable
  public final Boolean nativeCrashReporting;
  @Nullable
  public final PreloadInfo preloadInfo;
  @Nullable
  public final Boolean revenueAutoTrackingEnabled;
  @Nullable
  public final Integer sessionTimeout;
  @Nullable
  public final Boolean sessionsAutoTrackingEnabled;
  @Nullable
  public final Boolean statisticsSending;
  @Nullable
  public final String userProfileID;
  
  public YandexMetricaConfig(@NonNull Builder paramBuilder)
  {
    apiKey = Builder.a(paramBuilder);
    appVersion = Builder.b(paramBuilder);
    sessionTimeout = Builder.j(paramBuilder);
    crashReporting = Builder.k(paramBuilder);
    nativeCrashReporting = Builder.l(paramBuilder);
    location = Builder.m(paramBuilder);
    locationTracking = Builder.n(paramBuilder);
    logs = Builder.o(paramBuilder);
    preloadInfo = Builder.p(paramBuilder);
    firstActivationAsUpdate = Builder.q(paramBuilder);
    statisticsSending = Builder.c(paramBuilder);
    maxReportsInDatabaseCount = Builder.d(paramBuilder);
    errorEnvironment = A2.e(Builder.e(paramBuilder));
    userProfileID = Builder.f(paramBuilder);
    revenueAutoTrackingEnabled = Builder.g(paramBuilder);
    sessionsAutoTrackingEnabled = Builder.h(paramBuilder);
    appOpenTrackingEnabled = Builder.i(paramBuilder);
  }
  
  public YandexMetricaConfig(@NonNull YandexMetricaConfig paramYandexMetricaConfig)
  {
    apiKey = apiKey;
    appVersion = appVersion;
    sessionTimeout = sessionTimeout;
    crashReporting = crashReporting;
    nativeCrashReporting = nativeCrashReporting;
    location = location;
    locationTracking = locationTracking;
    logs = logs;
    preloadInfo = preloadInfo;
    firstActivationAsUpdate = firstActivationAsUpdate;
    statisticsSending = statisticsSending;
    maxReportsInDatabaseCount = maxReportsInDatabaseCount;
    errorEnvironment = errorEnvironment;
    userProfileID = userProfileID;
    revenueAutoTrackingEnabled = revenueAutoTrackingEnabled;
    sessionsAutoTrackingEnabled = sessionsAutoTrackingEnabled;
    appOpenTrackingEnabled = appOpenTrackingEnabled;
  }
  
  @NonNull
  public static Builder createBuilderFromConfig(@NonNull YandexMetricaConfig paramYandexMetricaConfig)
  {
    Builder localBuilder = newConfigBuilder(apiKey);
    if (A2.a(appVersion)) {
      localBuilder.withAppVersion(appVersion);
    }
    if (A2.a(sessionTimeout)) {
      localBuilder.withSessionTimeout(sessionTimeout.intValue());
    }
    if (A2.a(crashReporting)) {
      localBuilder.withCrashReporting(crashReporting.booleanValue());
    }
    if (A2.a(nativeCrashReporting)) {
      localBuilder.withNativeCrashReporting(nativeCrashReporting.booleanValue());
    }
    if (A2.a(location)) {
      localBuilder.withLocation(location);
    }
    if (A2.a(locationTracking)) {
      localBuilder.withLocationTracking(locationTracking.booleanValue());
    }
    if ((A2.a(logs)) && (logs.booleanValue())) {
      localBuilder.withLogs();
    }
    if (A2.a(preloadInfo)) {
      localBuilder.withPreloadInfo(preloadInfo);
    }
    if (A2.a(firstActivationAsUpdate)) {
      localBuilder.handleFirstActivationAsUpdate(firstActivationAsUpdate.booleanValue());
    }
    if (A2.a(statisticsSending)) {
      localBuilder.withStatisticsSending(statisticsSending.booleanValue());
    }
    if (A2.a(maxReportsInDatabaseCount)) {
      localBuilder.withMaxReportsInDatabaseCount(maxReportsInDatabaseCount.intValue());
    }
    if (A2.a(errorEnvironment))
    {
      Iterator localIterator = errorEnvironment.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localBuilder.withErrorEnvironmentValue((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    if (A2.a(userProfileID)) {
      localBuilder.withUserProfileID(userProfileID);
    }
    if (A2.a(revenueAutoTrackingEnabled)) {
      localBuilder.withRevenueAutoTrackingEnabled(revenueAutoTrackingEnabled.booleanValue());
    }
    if (A2.a(sessionsAutoTrackingEnabled)) {
      localBuilder.withSessionsAutoTrackingEnabled(sessionsAutoTrackingEnabled.booleanValue());
    }
    if (A2.a(appOpenTrackingEnabled)) {
      localBuilder.withAppOpenTrackingEnabled(appOpenTrackingEnabled.booleanValue());
    }
    return localBuilder;
  }
  
  public static YandexMetricaConfig fromJson(String paramString)
  {
    return new m1().a(paramString);
  }
  
  @NonNull
  public static Builder newConfigBuilder(@NonNull String paramString)
  {
    return new Builder(paramString);
  }
  
  public String toJson()
  {
    return new m1().a(this);
  }
  
  public static class Builder
  {
    private static final xn<String> r = new un(new yn());
    @NonNull
    private final String a;
    @Nullable
    private String b;
    @Nullable
    private Integer c;
    @Nullable
    private Boolean d;
    @Nullable
    private Boolean e;
    @Nullable
    private Location f;
    @Nullable
    private Boolean g;
    @Nullable
    private Boolean h;
    @Nullable
    private PreloadInfo i;
    @Nullable
    private Boolean j;
    @Nullable
    private Boolean k;
    @Nullable
    private Integer l;
    @NonNull
    private LinkedHashMap<String, String> m = new LinkedHashMap();
    @Nullable
    private String n;
    @Nullable
    private Boolean o;
    @Nullable
    private Boolean p;
    @Nullable
    private Boolean q;
    
    public Builder(@NonNull String paramString)
    {
      ((un)r).a(paramString);
      a = paramString;
    }
    
    @NonNull
    public YandexMetricaConfig build()
    {
      return new YandexMetricaConfig(this);
    }
    
    @NonNull
    public Builder handleFirstActivationAsUpdate(boolean paramBoolean)
    {
      j = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder withAppOpenTrackingEnabled(boolean paramBoolean)
    {
      q = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder withAppVersion(@Nullable String paramString)
    {
      b = paramString;
      return this;
    }
    
    @NonNull
    public Builder withCrashReporting(boolean paramBoolean)
    {
      d = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder withErrorEnvironmentValue(@NonNull String paramString1, @Nullable String paramString2)
    {
      m.put(paramString1, paramString2);
      return this;
    }
    
    @NonNull
    public Builder withLocation(@Nullable Location paramLocation)
    {
      f = paramLocation;
      return this;
    }
    
    @NonNull
    public Builder withLocationTracking(boolean paramBoolean)
    {
      g = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder withLogs()
    {
      h = Boolean.TRUE;
      return this;
    }
    
    @NonNull
    public Builder withMaxReportsInDatabaseCount(int paramInt)
    {
      l = Integer.valueOf(paramInt);
      return this;
    }
    
    @NonNull
    public Builder withNativeCrashReporting(boolean paramBoolean)
    {
      e = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder withPreloadInfo(@Nullable PreloadInfo paramPreloadInfo)
    {
      i = paramPreloadInfo;
      return this;
    }
    
    @NonNull
    public Builder withRevenueAutoTrackingEnabled(boolean paramBoolean)
    {
      o = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder withSessionTimeout(int paramInt)
    {
      c = Integer.valueOf(paramInt);
      return this;
    }
    
    @NonNull
    public Builder withSessionsAutoTrackingEnabled(boolean paramBoolean)
    {
      p = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder withStatisticsSending(boolean paramBoolean)
    {
      k = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder withUserProfileID(@Nullable String paramString)
    {
      n = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.YandexMetricaConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */