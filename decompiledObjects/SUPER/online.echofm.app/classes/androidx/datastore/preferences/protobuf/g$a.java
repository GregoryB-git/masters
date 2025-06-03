package androidx.datastore.preferences.protobuf;

import java.util.NoSuchElementException;

public class g$a
  extends g.c
{
  public int o = 0;
  public final int p;
  
  public g$a(g paramg)
  {
    p = paramg.size();
  }
  
  public byte c()
  {
    int i = o;
    if (i < p)
    {
      o = (i + 1);
      return q.D(i);
    }
    throw new NoSuchElementException();
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (o < p) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */