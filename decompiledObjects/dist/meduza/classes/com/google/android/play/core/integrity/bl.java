package com.google.android.play.core.integrity;

import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import k6.b;
import m7.v;

final class bl
  extends bi
{
  private final v d = new v("OnWarmUpIntegrityTokenCallback");
  
  public bl(bn parambn, TaskCompletionSource paramTaskCompletionSource)
  {
    super(parambn, paramTaskCompletionSource);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    d.b("onWarmUpExpressIntegrityToken", new Object[0]);
    b localb = bn.g(c).a(paramBundle);
    if (localb != null)
    {
      a.trySetException(localb);
      return;
    }
    a.trySetResult(Long.valueOf(paramBundle.getLong("warm.up.sid")));
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.bl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */