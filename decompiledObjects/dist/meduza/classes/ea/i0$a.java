package ea;

import android.os.Message;
import java.util.Comparator;
import p2.m0;

public final class i0$a<T>
  implements Comparator
{
  public final int compare(T paramT1, T paramT2)
  {
    return m0.s(Long.valueOf(((Message)paramT1).getWhen()), Long.valueOf(((Message)paramT2).getWhen()));
  }
}

/* Location:
 * Qualified Name:     ea.i0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */