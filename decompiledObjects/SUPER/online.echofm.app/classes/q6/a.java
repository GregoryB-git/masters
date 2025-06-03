package q6;

import android.os.Looper;
import java.util.List;
import p6.B0;
import u6.t;

public final class a
  implements t
{
  public String a()
  {
    return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
  }
  
  public B0 b(List paramList)
  {
    paramList = Looper.getMainLooper();
    if (paramList != null) {
      return new c(e.a(paramList, true), null, 2, null);
    }
    throw new IllegalStateException("The main looper is not available");
  }
  
  public int c()
  {
    return 1073741823;
  }
}

/* Location:
 * Qualified Name:     q6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */