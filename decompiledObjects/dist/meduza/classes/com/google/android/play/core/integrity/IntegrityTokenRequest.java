package com.google.android.play.core.integrity;

public abstract class IntegrityTokenRequest
{
  public static Builder builder()
  {
    return new am();
  }
  
  public abstract Long cloudProjectNumber();
  
  public abstract String nonce();
  
  public static abstract class Builder
  {
    public abstract IntegrityTokenRequest build();
    
    public abstract Builder setCloudProjectNumber(long paramLong);
    
    public abstract Builder setNonce(String paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.IntegrityTokenRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */