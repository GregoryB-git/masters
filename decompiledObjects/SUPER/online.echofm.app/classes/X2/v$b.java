package X2;

import java.util.AbstractCollection;
import java.util.List;

public class v$b
  extends a
{
  public final v q;
  
  public v$b(v paramv, int paramInt)
  {
    super(paramv.size(), paramInt);
    q = paramv;
  }
  
  public Object b(int paramInt)
  {
    return q.get(paramInt);
  }
}

/* Location:
 * Qualified Name:     X2.v.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */