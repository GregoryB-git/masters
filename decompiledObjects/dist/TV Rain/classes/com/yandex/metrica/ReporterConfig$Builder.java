package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.un;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.impl.ob.yn;

public class ReporterConfig$Builder
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
  
  public ReporterConfig$Builder(@NonNull String paramString)
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

/* Location:
 * Qualified Name:     com.yandex.metrica.ReporterConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */