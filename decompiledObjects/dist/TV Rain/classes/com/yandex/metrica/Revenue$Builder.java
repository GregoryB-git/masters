package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.tn;
import com.yandex.metrica.impl.ob.un;
import com.yandex.metrica.impl.ob.xn;
import java.util.Currency;

public class Revenue$Builder
{
  private static final xn<Currency> h = new un(new tn("revenue currency"));
  @Nullable
  public Double a;
  @Nullable
  public Long b;
  @NonNull
  public Currency c;
  @Nullable
  public Integer d;
  @Nullable
  public String e;
  @Nullable
  public String f;
  @Nullable
  public Revenue.Receipt g;
  
  public Revenue$Builder(double paramDouble, @NonNull Currency paramCurrency)
  {
    ((un)h).a(paramCurrency);
    a = Double.valueOf(paramDouble);
    c = paramCurrency;
  }
  
  public Revenue$Builder(long paramLong, @NonNull Currency paramCurrency)
  {
    ((un)h).a(paramCurrency);
    b = Long.valueOf(paramLong);
    c = paramCurrency;
  }
  
  @NonNull
  public Revenue build()
  {
    return new Revenue(this, null);
  }
  
  @NonNull
  public Builder withPayload(@Nullable String paramString)
  {
    f = paramString;
    return this;
  }
  
  @NonNull
  public Builder withProductID(@Nullable String paramString)
  {
    e = paramString;
    return this;
  }
  
  @NonNull
  public Builder withQuantity(@Nullable Integer paramInteger)
  {
    d = paramInteger;
    return this;
  }
  
  @NonNull
  public Builder withReceipt(@Nullable Revenue.Receipt paramReceipt)
  {
    g = paramReceipt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.Revenue.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */