package x0;

import android.view.View;
import e0.d0;
import e0.d0.d;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class m0
  implements Runnable
{
  public m0(int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4) {}
  
  public final void run()
  {
    for (int i = 0; i < a; i++)
    {
      View localView = (View)b.get(i);
      String str = (String)c.get(i);
      WeakHashMap localWeakHashMap = d0.a;
      d0.d.v(localView, str);
      d0.d.v((View)d.get(i), (String)e.get(i));
    }
  }
}

/* Location:
 * Qualified Name:     x0.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */