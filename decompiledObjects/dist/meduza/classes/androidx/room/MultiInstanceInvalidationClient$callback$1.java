package androidx.room;

import ec.i;
import java.util.concurrent.Executor;
import x0.q0;

public final class MultiInstanceInvalidationClient$callback$1
  extends IMultiInstanceInvalidationCallback.Stub
{
  public MultiInstanceInvalidationClient$callback$1(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient) {}
  
  public final void j0(String[] paramArrayOfString)
  {
    i.e(paramArrayOfString, "tables");
    MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = a;
    c.execute(new q0(2, localMultiInstanceInvalidationClient, paramArrayOfString));
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient.callback.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */