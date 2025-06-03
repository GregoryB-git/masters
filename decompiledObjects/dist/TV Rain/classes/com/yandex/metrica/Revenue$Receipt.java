package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Revenue$Receipt
{
  @Nullable
  public final String data;
  @Nullable
  public final String signature;
  
  private Revenue$Receipt(@NonNull Builder paramBuilder)
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

/* Location:
 * Qualified Name:     com.yandex.metrica.Revenue.Receipt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */