package go;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;

class Seq$GoRefQueue$1
  implements Runnable
{
  public Seq$GoRefQueue$1(Seq.GoRefQueue paramGoRefQueue) {}
  
  public void run()
  {
    try
    {
      for (;;)
      {
        Seq.GoRef localGoRef = (Seq.GoRef)this$0.remove();
        Seq.GoRefQueue.access$200(this$0).remove(localGoRef);
        Seq.destroyRef(refnum);
        localGoRef.clear();
      }
    }
    catch (InterruptedException localInterruptedException) {}
  }
}

/* Location:
 * Qualified Name:     go.Seq.GoRefQueue.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */