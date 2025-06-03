package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

public abstract interface StandardIntegrityManager
{
  public abstract Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest paramPrepareIntegrityTokenRequest);
  
  public static abstract class PrepareIntegrityTokenRequest
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
  
  public static abstract class StandardIntegrityToken
  {
    public abstract Task<Integer> showDialog(Activity paramActivity, int paramInt);
    
    public abstract String token();
  }
  
  public static abstract interface StandardIntegrityTokenProvider
  {
    public abstract Task<StandardIntegrityManager.StandardIntegrityToken> request(StandardIntegrityManager.StandardIntegrityTokenRequest paramStandardIntegrityTokenRequest);
  }
  
  public static abstract class StandardIntegrityTokenRequest
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
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.StandardIntegrityManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */