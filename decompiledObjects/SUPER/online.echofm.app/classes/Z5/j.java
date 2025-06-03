package Z5;

import X5.d;
import X5.g;
import X5.h;

public abstract class j
  extends a
{
  public j(d paramd)
  {
    super(paramd);
    if ((paramd != null) && (paramd.getContext() != h.o)) {
      throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
    }
  }
  
  public g getContext()
  {
    return h.o;
  }
}

/* Location:
 * Qualified Name:     Z5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */