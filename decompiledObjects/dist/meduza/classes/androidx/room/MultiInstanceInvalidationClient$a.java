package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import ec.i;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p1.e.c;

public final class MultiInstanceInvalidationClient$a
  extends e.c
{
  public MultiInstanceInvalidationClient$a(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient, String[] paramArrayOfString)
  {
    super(paramArrayOfString);
  }
  
  public final void a(Set<String> paramSet)
  {
    i.e(paramSet, "tables");
    if (b.h.get()) {
      return;
    }
    try
    {
      MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = b;
      IMultiInstanceInvalidationService localIMultiInstanceInvalidationService = f;
      if (localIMultiInstanceInvalidationService != null)
      {
        int i = d;
        paramSet = paramSet.toArray(new String[0]);
        i.c(paramSet, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        localIMultiInstanceInvalidationService.K2(i, (String[])paramSet);
      }
    }
    catch (RemoteException paramSet)
    {
      Log.w("ROOM", "Cannot broadcast invalidation", paramSet);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */