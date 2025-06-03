package wb;

import ub.e;
import ub.h;
import ub.i;

public abstract class g
  extends a
{
  public g(e<Object> parame)
  {
    super(parame);
    if (parame != null)
    {
      int i;
      if (parame.getContext() == i.a) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {
        throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
      }
    }
  }
  
  public final h getContext()
  {
    return i.a;
  }
}

/* Location:
 * Qualified Name:     wb.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */