package com.yandex.metrica;

import androidx.annotation.Nullable;

public class FeaturesResult
{
  @Nullable
  private final Boolean libSslEnabled;
  
  public FeaturesResult(@Nullable Boolean paramBoolean)
  {
    libSslEnabled = paramBoolean;
  }
  
  @Nullable
  public Boolean getLibSslEnabled()
  {
    return libSslEnabled;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.FeaturesResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */