package io.flutter.embedding.android;

import android.app.Activity;
import dc.p;
import i2.k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import nc.e0;
import nc.j1;
import qc.e;
import rb.h;

public class WindowInfoRepositoryCallbackAdapterWrapper
{
  public final h2.a adapter;
  
  public WindowInfoRepositoryCallbackAdapterWrapper(h2.a parama)
  {
    adapter = parama;
  }
  
  public void addWindowLayoutInfoListener(Activity paramActivity, Executor paramExecutor, d0.a<k> parama)
  {
    Object localObject1 = adapter;
    localObject1.getClass();
    ec.i.e(paramActivity, "activity");
    ec.i.e(paramExecutor, "executor");
    ec.i.e(parama, "consumer");
    Object localObject2 = c;
    localObject1 = b.a(paramActivity);
    localObject2.getClass();
    ec.i.e(localObject1, "flow");
    paramActivity = a;
    paramActivity.lock();
    try
    {
      if (b.get(parama) == null)
      {
        paramExecutor = e0.a(x6.b.W(paramExecutor));
        LinkedHashMap localLinkedHashMap = b;
        localObject2 = new g2/a;
        ((g2.a)localObject2).<init>((e)localObject1, parama, null);
        localLinkedHashMap.put(parama, x6.b.g0(paramExecutor, null, (p)localObject2, 3));
      }
      paramExecutor = h.a;
      return;
    }
    finally
    {
      paramActivity.unlock();
    }
  }
  
  public void removeWindowLayoutInfoListener(d0.a<k> parama)
  {
    Object localObject = adapter;
    localObject.getClass();
    ec.i.e(parama, "consumer");
    g2.b localb = c;
    localb.getClass();
    localObject = a;
    ((ReentrantLock)localObject).lock();
    try
    {
      j1 localj1 = (j1)b.get(parama);
      if (localj1 != null) {
        localj1.cancel(null);
      }
      parama = (j1)b.remove(parama);
      return;
    }
    finally
    {
      ((ReentrantLock)localObject).unlock();
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.WindowInfoRepositoryCallbackAdapterWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */