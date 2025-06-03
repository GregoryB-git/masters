package g9;

import android.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;

public final class a$b
  extends Fragment
{
  public a.a a = new a.a();
  
  public final void onStop()
  {
    super.onStop();
    synchronized (a)
    {
      a.a locala = a;
      Object localObject2 = new g9/a$a;
      ((a.a)localObject2).<init>();
      a = ((a.a)localObject2);
      ??? = a.iterator();
      while (((Iterator)???).hasNext())
      {
        localObject2 = (Runnable)((Iterator)???).next();
        if (localObject2 != null) {
          ((Runnable)localObject2).run();
        }
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     g9.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */