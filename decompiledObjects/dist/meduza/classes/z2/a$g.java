package z2;

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
  
  public final boolean c(a<?> parama, a.h paramh1, a.h paramh2)
  {
    try
    {
      if (c == paramh1)
      {
        c = paramh2;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public final void d(a.h paramh1, a.h paramh2)
  {
    b = paramh2;
  }
  
  public final void e(a.h paramh, Thread paramThread)
  {
    a = paramThread;
  }
}

/* Location:
 * Qualified Name:     z2.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */