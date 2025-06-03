package go;

import a0.j;
import f;

public final class Seq$Ref
{
  public final Object obj;
  private int refcnt;
  public final int refnum;
  
  public Seq$Ref(int paramInt, Object paramObject)
  {
    if (paramInt >= 0)
    {
      refnum = paramInt;
      refcnt = 0;
      obj = paramObject;
      return;
    }
    throw new RuntimeException(f.h("Ref instantiated with a Go refnum ", paramInt));
  }
  
  public void inc()
  {
    int i = refcnt;
    if (i != Integer.MAX_VALUE)
    {
      refcnt = (i + 1);
      return;
    }
    throw new RuntimeException(j.m(f.l("refnum "), refnum, " overflow"));
  }
}

/* Location:
 * Qualified Name:     go.Seq.Ref
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */