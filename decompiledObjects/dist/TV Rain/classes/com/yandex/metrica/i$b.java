package com.yandex.metrica;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class i$b
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
  
  public i$b(@NonNull String paramString)
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

/* Location:
 * Qualified Name:     com.yandex.metrica.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */