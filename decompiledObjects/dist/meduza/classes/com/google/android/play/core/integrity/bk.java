package com.google.android.play.core.integrity;

import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import m7.v;

final class bk
  extends bi
{
  private final v d = new v("OnRequestIntegrityTokenCallback");
  private final long e;
  
  public bk(bn parambn, TaskCompletionSource paramTaskCompletionSource, long paramLong)
  {
    super(parambn, paramTaskCompletionSource);
    e = paramLong;
  }
  
  public final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    d.b("onRequestExpressIntegrityToken", new Object[0]);
    Object localObject = bn.g(c).a(paramBundle);
    if (localObject != null)
    {
      a.trySetException((Exception)localObject);
      return;
    }
    long l = paramBundle.getLong("request.token.sid");
    localObject = new bj(this, bn.j(c), l);
    TaskCompletionSource localTaskCompletionSource = a;
    b localb = new b();
    localb.b(paramBundle.getString("token"));
    localb.a((y)localObject);
    localTaskCompletionSource.trySetResult(localb.c());
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.bk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */