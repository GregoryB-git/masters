package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.tn;
import com.yandex.metrica.impl.ob.un;
import com.yandex.metrica.impl.ob.xn;
import java.util.Currency;

public class Revenue
{
  @NonNull
  public final Currency currency;
  @Nullable
  public final String payload;
  @Deprecated
  @Nullable
  public final Double price;
  @Nullable
  public final Long priceMicros;
  @Nullable
  public final String productID;
  @Nullable
  public final Integer quantity;
  @Nullable
  public final Receipt receipt;
  
  private Revenue(@NonNull Builder paramBuilder)
  {
    price = a;
    priceMicros = b;
    currency = c;
    quantity = d;
    productID = e;
    payload = f;
    receipt = g;
  }
  
  @Deprecated
  @NonNull
  public static Builder newBuilder(double paramDouble, @NonNull Currency paramCurrency)
  {
    return new Builder(paramDouble, paramCurrency);
  }
  
  @NonNull
  public static Builder newBuilderWithMicros(long paramLong, @NonNull Currency paramCurrency)
  {
    return new Builder(paramLong, paramCurrency);
  }
  
  public static class Builder
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
    
    public Builder(double paramDouble, @NonNull Currency paramCurrency)
    {
      ((un)h).a(paramCurrency);
      a = Double.valueOf(paramDouble);
      c = paramCurrency;
    }
    
    public Builder(long paramLong, @NonNull Currency paramCurrency)
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
  
  public static class Receipt
  {
    @Nullable
    public final String data;
    @Nullable
    public final String signature;
    
    private Receipt(@NonNull Builder paramBuilder)
    {
      data = Builder.a(paramBuilder);
      signature = Builder.b(paramBuilder);
    }
    
    @NonNull
    public static Builder newBuilder()
    {
      return new Builder();
    }
    
    public static class Builder
    {
      @Nullable
      private String a;
      @Nullable
      private String b;
      
      @NonNull
      public Revenue.Receipt build()
      {
        return new Revenue.Receipt(this, null);
      }
      
      @NonNull
      public Builder withData(@Nullable String paramString)
      {
        a = paramString;
        return this;
      }
      
      @NonNull
      public Builder withSignature(@Nullable String paramString)
      {
        b = paramString;
        return this;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.Revenue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */