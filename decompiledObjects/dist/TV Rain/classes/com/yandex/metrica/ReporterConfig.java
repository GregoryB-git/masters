package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.un;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.impl.ob.yn;

public class ReporterConfig
{
  @NonNull
  public final String apiKey;
  @Nullable
  public final Boolean logs;
  @Nullable
  public final Integer maxReportsInDatabaseCount;
  @Nullable
  public final Integer sessionTimeout;
  @Nullable
  public final Boolean statisticsSending;
  @Nullable
  public final String userProfileID;
  
  public ReporterConfig(@NonNull Builder paramBuilder)
  {
    apiKey = Builder.a(paramBuilder);
    sessionTimeout = Builder.b(paramBuilder);
    logs = Builder.c(paramBuilder);
    statisticsSending = Builder.d(paramBuilder);
    maxReportsInDatabaseCount = Builder.e(paramBuilder);
    userProfileID = Builder.f(paramBuilder);
  }
  
  public ReporterConfig(@NonNull ReporterConfig paramReporterConfig)
  {
    apiKey = apiKey;
    sessionTimeout = sessionTimeout;
    logs = logs;
    statisticsSending = statisticsSending;
    maxReportsInDatabaseCount = maxReportsInDatabaseCount;
    userProfileID = userProfileID;
  }
  
  public static Builder createBuilderFromConfig(@NonNull ReporterConfig paramReporterConfig)
  {
    Builder localBuilder = newConfigBuilder(apiKey);
    if (A2.a(sessionTimeout)) {
      localBuilder.withSessionTimeout(sessionTimeout.intValue());
    }
    if ((A2.a(logs)) && (logs.booleanValue())) {
      localBuilder.withLogs();
    }
    if (A2.a(statisticsSending)) {
      localBuilder.withStatisticsSending(statisticsSending.booleanValue());
    }
    if (A2.a(maxReportsInDatabaseCount)) {
      localBuilder.withMaxReportsInDatabaseCount(maxReportsInDatabaseCount.intValue());
    }
    if (A2.a(userProfileID)) {
      localBuilder.withUserProfileID(userProfileID);
    }
    return localBuilder;
  }
  
  @NonNull
  public static Builder newConfigBuilder(@NonNull String paramString)
  {
    return new Builder(paramString);
  }
  
  public static class Builder
  {
    private static final xn<String> g = new un(new yn());
    private final String a;
    @Nullable
    private Integer b;
    @Nullable
    private Boolean c;
    @Nullable
    private Boolean d;
    @Nullable
    private Integer e;
    @Nullable
    private String f;
    
    public Builder(@NonNull String paramString)
    {
      ((un)g).a(paramString);
      a = paramString;
    }
    
    @NonNull
    public ReporterConfig build()
    {
      return new ReporterConfig(this);
    }
    
    @NonNull
    public Builder withLogs()
    {
      c = Boolean.TRUE;
      return this;
    }
    
    @NonNull
    public Builder withMaxReportsInDatabaseCount(int paramInt)
    {
      e = Integer.valueOf(paramInt);
      return this;
    }
    
    @NonNull
    public Builder withSessionTimeout(int paramInt)
    {
      b = Integer.valueOf(paramInt);
      return this;
    }
    
    @NonNull
    public Builder withStatisticsSending(boolean paramBoolean)
    {
      d = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    @NonNull
    public Builder withUserProfileID(@Nullable String paramString)
    {
      f = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.ReporterConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */