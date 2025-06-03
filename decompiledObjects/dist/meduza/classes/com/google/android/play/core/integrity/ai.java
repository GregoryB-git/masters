package com.google.android.play.core.integrity;

import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.o;
import m7.e;
import m7.v;

final class ai
  extends o
{
  private final v b = new v("OnRequestIntegrityTokenCallback");
  private final TaskCompletionSource c;
  
  public ai(aj paramaj, TaskCompletionSource paramTaskCompletionSource)
  {
    c = paramTaskCompletionSource;
  }
  
  public final void b(Bundle paramBundle)
  {
    a.a.d(c);
    b.b("onRequestIntegrityToken", new Object[0]);
    Object localObject = aj.d(a).a(paramBundle);
    if (localObject != null)
    {
      c.trySetException((Exception)localObject);
      return;
    }
    localObject = paramBundle.getString("token");
    if (localObject == null)
    {
      c.trySetException(new IntegrityServiceException(-100, null));
      return;
    }
    long l = paramBundle.getLong("request.token.sid");
    paramBundle = new ah(this, aj.g(a), l);
    TaskCompletionSource localTaskCompletionSource = c;
    a locala = new a();
    locala.b((String)localObject);
    locala.a(paramBundle);
    localTaskCompletionSource.trySetResult(locala.c());
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.ai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */