package m7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
  extends w
{
  public b(d paramd, IBinder paramIBinder) {}
  
  public final void b()
  {
    IInterface localIInterface = (IInterface)p.a.i.a(o);
    Object localObject = p.a;
    n = localIInterface;
    b.b("linkToDeath", new Object[0]);
    try
    {
      n.asBinder().linkToDeath(k, 0);
    }
    catch (RemoteException localRemoteException)
    {
      b.a("linkToDeath failed", localRemoteException, new Object[0]);
    }
    localObject = p.a;
    g = false;
    localObject = d.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Runnable)((Iterator)localObject).next()).run();
    }
    p.a.d.clear();
  }
}

/* Location:
 * Qualified Name:     m7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */