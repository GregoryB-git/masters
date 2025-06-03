package go;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

class Seq$GoRefQueue
  extends ReferenceQueue<Seq.GoObject>
{
  private final Collection<Seq.GoRef> refs = Collections.synchronizedCollection(new HashSet());
  
  public Seq$GoRefQueue()
  {
    Thread localThread = new Thread(new Runnable()
    {
      public void run()
      {
        try
        {
          for (;;)
          {
            Seq.GoRef localGoRef = (Seq.GoRef)remove();
            Seq.GoRefQueue.access$200(Seq.GoRefQueue.this).remove(localGoRef);
            Seq.destroyRef(refnum);
            localGoRef.clear();
          }
        }
        catch (InterruptedException localInterruptedException) {}
      }
    });
    localThread.setDaemon(true);
    localThread.setName("GoRefQueue Finalizer Thread");
    localThread.start();
  }
  
  public void track(int paramInt, Seq.GoObject paramGoObject)
  {
    refs.add(new Seq.GoRef(paramInt, paramGoObject, this));
  }
}

/* Location:
 * Qualified Name:     go.Seq.GoRefQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */