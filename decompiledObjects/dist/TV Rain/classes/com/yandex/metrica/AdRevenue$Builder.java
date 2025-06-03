package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class AdRevenue$Builder
{
  @NonNull
  private final BigDecimal a;
  @NonNull
  private final Currency b;
  @Nullable
  private AdType c;
  @Nullable
  private String d;
  @Nullable
  private String e;
  @Nullable
  private String f;
  @Nullable
  private String g;
  @Nullable
  private String h;
  @Nullable
  private String i;
  @Nullable
  private Map<String, String> j;
  
  private AdRevenue$Builder(@NonNull BigDecimal paramBigDecimal, @NonNull Currency paramCurrency)
  {
    a = paramBigDecimal;
    b = paramCurrency;
  }
  
  public AdRevenue build()
  {
    return new AdRevenue(a, b, c, d, e, f, g, h, i, j, null);
  }
  
  public Builder withAdNetwork(@Nullable String paramString)
  {
    d = paramString;
    return this;
  }
  
  public Builder withAdPlacementId(@Nullable String paramString)
  {
    g = paramString;
    return this;
  }
  
  public Builder withAdPlacementName(@Nullable String paramString)
  {
    h = paramString;
    return this;
  }
  
  public Builder withAdType(@Nullable AdType paramAdType)
  {
    c = paramAdType;
    return this;
  }
  
  public Builder withAdUnitId(@Nullable String paramString)
  {
    e = paramString;
    return this;
  }
  
  public Builder withAdUnitName(@Nullable String paramString)
  {
    f = paramString;
    return this;
  }
  
  public Builder withPayload(@Nullable Map<String, String> paramMap)
  {
    if ((paramMap == null) || (A2.b(paramMap))) {
      paramMap = null;
    } else {
      paramMap = new HashMap(paramMap);
    }
    j = paramMap;
    return this;
  }
  
  public Builder withPrecision(@Nullable String paramString)
  {
    i = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.AdRevenue.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */