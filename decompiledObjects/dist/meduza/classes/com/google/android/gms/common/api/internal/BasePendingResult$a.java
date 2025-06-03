package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import f;
import k6.k;

public final class BasePendingResult$a<R extends k6.j>
  extends zau
{
  public BasePendingResult$a(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void a(k paramk, k6.j paramj)
  {
    ThreadLocal localThreadLocal = BasePendingResult.zaa;
    m6.j.i(paramk);
    sendMessage(obtainMessage(1, new Pair(paramk, paramj)));
  }
  
  public final void handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 1)
    {
      if (i != 2)
      {
        Log.wtf("BasePendingResult", f.h("Don't know how to handle message: ", i), new Exception());
        return;
      }
      ((BasePendingResult)obj).forceFailureUnlessReady(Status.p);
      return;
    }
    Object localObject = (Pair)obj;
    paramMessage = (k)first;
    localObject = (k6.j)second;
    try
    {
      paramMessage.a((k6.j)localObject);
      return;
    }
    catch (RuntimeException paramMessage)
    {
      BasePendingResult.zal((k6.j)localObject);
      throw paramMessage;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.BasePendingResult.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */