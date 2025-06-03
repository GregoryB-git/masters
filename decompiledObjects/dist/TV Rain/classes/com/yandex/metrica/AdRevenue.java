package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class AdRevenue
{
  @Nullable
  public final String adNetwork;
  @Nullable
  public final String adPlacementId;
  @Nullable
  public final String adPlacementName;
  @NonNull
  public final BigDecimal adRevenue;
  @Nullable
  public final AdType adType;
  @Nullable
  public final String adUnitId;
  @Nullable
  public final String adUnitName;
  @NonNull
  public final Currency currency;
  @Nullable
  public final Map<String, String> payload;
  @Nullable
  public final String precision;
  
  private AdRevenue(@NonNull BigDecimal paramBigDecimal, @NonNull Currency paramCurrency, @Nullable AdType paramAdType, @Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, @Nullable String paramString6, @Nullable Map<String, String> paramMap)
  {
    adRevenue = paramBigDecimal;
    currency = paramCurrency;
    adType = paramAdType;
    adNetwork = paramString1;
    adUnitId = paramString2;
    adUnitName = paramString3;
    adPlacementId = paramString4;
    adPlacementName = paramString5;
    precision = paramString6;
    if (paramMap == null) {
      paramBigDecimal = null;
    } else {
      paramBigDecimal = A2.d(paramMap);
    }
    payload = paramBigDecimal;
  }
  
  public static Builder newBuilder(double paramDouble, @NonNull Currency paramCurrency)
  {
    return new Builder(new BigDecimal(A2.a(paramDouble, 0.0D)), paramCurrency, null);
  }
  
  public static Builder newBuilder(long paramLong, @NonNull Currency paramCurrency)
  {
    return new Builder(A2.a(paramLong), paramCurrency, null);
  }
  
  public static Builder newBuilder(@NonNull BigDecimal paramBigDecimal, @NonNull Currency paramCurrency)
  {
    return new Builder(paramBigDecimal, paramCurrency, null);
  }
  
  public static class Builder
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
    
    private Builder(@NonNull BigDecimal paramBigDecimal, @NonNull Currency paramCurrency)
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
}

/* Location:
 * Qualified Name:     com.yandex.metrica.AdRevenue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */