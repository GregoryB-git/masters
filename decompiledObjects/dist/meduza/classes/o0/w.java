package o0;

import dc.a;
import ec.i;
import ec.j;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;

public final class w
  extends j
  implements a<File>
{
  public w(q<Object> paramq)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    Object localObject1 = (File)a.a.invoke();
    Object localObject3 = ((File)localObject1).getAbsolutePath();
    synchronized (q.l)
    {
      LinkedHashSet localLinkedHashSet = q.k;
      if ((localLinkedHashSet.contains(localObject3) ^ true))
      {
        i.d(localObject3, "it");
        localLinkedHashSet.add(localObject3);
        return localObject1;
      }
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("There are multiple DataStores active for the same file: ");
      ((StringBuilder)localObject3).append(localObject1);
      ((StringBuilder)localObject3).append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>(localObject3.toString());
      throw ((Throwable)localObject1);
    }
  }
}

/* Location:
 * Qualified Name:     o0.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */