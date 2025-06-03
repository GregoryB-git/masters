package com.yandex.metrica;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.un;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.impl.ob.yn;
import java.util.AbstractMap;
import java.util.LinkedHashMap;

public class YandexMetricaConfig$Builder
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
  
  public YandexMetricaConfig$Builder(@NonNull String paramString)
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

/* Location:
 * Qualified Name:     com.yandex.metrica.YandexMetricaConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */