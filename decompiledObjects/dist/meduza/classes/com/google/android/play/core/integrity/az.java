package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

final class az
  implements StandardIntegrityManager
{
  private final bn a;
  private final bt b;
  
  public az(bn parambn, bt parambt)
  {
    a = parambn;
    b = parambt;
  }
  
  public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest paramPrepareIntegrityTokenRequest)
  {
    long l = paramPrepareIntegrityTokenRequest.b();
    paramPrepareIntegrityTokenRequest.a();
    return a.e(l, 0).onSuccessTask(new ay(this, paramPrepareIntegrityTokenRequest));
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.az
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */