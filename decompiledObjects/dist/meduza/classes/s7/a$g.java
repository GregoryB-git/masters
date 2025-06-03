package s7;

public final class a$g
  extends a.a
{
  public final boolean a(a<?> parama, a.d paramd1, a.d paramd2)
  {
    try
    {
      if (b == paramd1)
      {
        b = paramd2;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public final boolean b(a<?> parama, Object paramObject1, Object paramObject2)
  {
    try
    {
      if (a == paramObject1)
      {
        a = paramObject2;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public final boolean c(a<?> parama, a.k paramk1, a.k paramk2)
  {
    try
    {
      if (c == paramk1)
      {
        c = paramk2;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public final a.d d(a<?> parama, a.d paramd)
  {
    try
    {
      a.d locald = b;
      if (locald != paramd) {
        b = paramd;
      }
      return locald;
    }
    finally {}
  }
  
  public final a.k e(a parama)
  {
    a.k localk1 = a.k.c;
    try
    {
      a.k localk2 = c;
      if (localk2 != localk1) {
        c = localk1;
      }
      return localk2;
    }
    finally {}
  }
  
  public final void f(a.k paramk1, a.k paramk2)
  {
    b = paramk2;
  }
  
  public final void g(a.k paramk, Thread paramThread)
  {
    a = paramThread;
  }
}

/* Location:
 * Qualified Name:     s7.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */