package oc;

import android.os.Looper;
import java.util.List;
import nc.s1;
import sc.m;

public final class a
  implements m
{
  public String a()
  {
    return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
  }
  
  public s1 b(List<? extends m> paramList)
  {
    paramList = Looper.getMainLooper();
    if (paramList != null) {
      return new f(h.a(paramList));
    }
    throw new IllegalStateException("The main looper is not available");
  }
  
  public int c()
  {
    return 1073741823;
  }
}

/* Location:
 * Qualified Name:     oc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */