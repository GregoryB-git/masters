package com.google.android.play.core.integrity;

public abstract class StandardIntegrityManager$StandardIntegrityTokenRequest
{
  public static Builder builder()
  {
    return new f();
  }
  
  public abstract String a();
  
  public static abstract class Builder
  {
    public abstract StandardIntegrityManager.StandardIntegrityTokenRequest build();
    
    public abstract Builder setRequestHash(String paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */