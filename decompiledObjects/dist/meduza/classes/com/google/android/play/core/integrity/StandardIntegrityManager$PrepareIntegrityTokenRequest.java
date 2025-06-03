package com.google.android.play.core.integrity;

public abstract class StandardIntegrityManager$PrepareIntegrityTokenRequest
{
  public static Builder builder()
  {
    c localc = new c();
    localc.a(0);
    return localc;
  }
  
  public abstract int a();
  
  public abstract long b();
  
  public static abstract class Builder
  {
    public abstract StandardIntegrityManager.PrepareIntegrityTokenRequest build();
    
    public abstract Builder setCloudProjectNumber(long paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */