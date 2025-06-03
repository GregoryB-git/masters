package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import k6.a.b;
import k6.a.c;
import k6.e;

public abstract class a<R extends k6.j, A extends a.b>
  extends BasePendingResult<R>
{
  private final k6.a<?> api = null;
  private final a.c<A> clientKey = new a.c();
  
  public a(BasePendingResult.a<R> parama)
  {
    super(parama);
  }
  
  @Deprecated
  public a(a.c<A> paramc, e parame) {}
  
  public a(k6.a<?> parama, e parame) {}
  
  private void setFailedResult(RemoteException paramRemoteException)
  {
    setFailedResult(new Status(8, paramRemoteException.getLocalizedMessage(), null, null));
  }
  
  public abstract void doExecute(A paramA);
  
  public final k6.a<?> getApi()
  {
    return api;
  }
  
  public final a.c<A> getClientKey()
  {
    return clientKey;
  }
  
  public void onSetFailedResult(R paramR) {}
  
  public final void run(A paramA)
  {
    try
    {
      doExecute(paramA);
      return;
    }
    catch (RemoteException paramA)
    {
      setFailedResult(paramA);
      return;
    }
    catch (DeadObjectException paramA)
    {
      setFailedResult(paramA);
      throw paramA;
    }
  }
  
  public final void setFailedResult(Status paramStatus)
  {
    m6.j.a("Failed result must not be success", paramStatus.D() ^ true);
    paramStatus = createFailedResult(paramStatus);
    setResult(paramStatus);
    onSetFailedResult(paramStatus);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */