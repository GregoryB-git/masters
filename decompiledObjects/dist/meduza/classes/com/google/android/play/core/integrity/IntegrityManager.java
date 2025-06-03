package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

public abstract interface IntegrityManager
{
  public abstract Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest paramIntegrityTokenRequest);
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.IntegrityManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */