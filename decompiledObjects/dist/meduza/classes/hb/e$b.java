package hb;

import gb.e2.a;

public final class e$b
  implements e2.a
{
  public e$b(e parame) {}
  
  public final int a()
  {
    e locale = a;
    int i = q0.g.c(g);
    if (i != 0)
    {
      if (i == 1)
      {
        i = 80;
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(g.p(g));
        localStringBuilder.append(" not handled");
        throw new AssertionError(localStringBuilder.toString());
      }
    }
    else {
      i = 443;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     hb.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */