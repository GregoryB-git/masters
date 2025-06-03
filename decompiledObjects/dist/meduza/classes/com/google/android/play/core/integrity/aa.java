package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

final class aa
  implements IntegrityManager
{
  private final aj a;
  
  public aa(aj paramaj)
  {
    a = paramaj;
  }
  
  public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest paramIntegrityTokenRequest)
  {
    return a.c(paramIntegrityTokenRequest);
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */