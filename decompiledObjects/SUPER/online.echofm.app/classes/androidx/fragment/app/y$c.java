package androidx.fragment.app;

import I.s;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

public class y$c
  implements Runnable
{
  public y$c(y paramy, ArrayList paramArrayList, Map paramMap) {}
  
  public void run()
  {
    int i = o.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)o.get(j);
      String str = s.q(localView);
      s.I(localView, (String)p.get(str));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.y.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */