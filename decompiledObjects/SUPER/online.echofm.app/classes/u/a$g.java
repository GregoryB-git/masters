package u;

public final class a$g
  extends a.b
{
  public a$g()
  {
    super(null);
  }
  
  public boolean a(a parama, a.e parame1, a.e parame2)
  {
    label27:
    try
    {
      if (p == parame1)
      {
        p = parame2;
        return true;
      }
    }
    finally
    {
      break label27;
      return false;
    }
  }
  
  public boolean b(a parama, Object paramObject1, Object paramObject2)
  {
    label27:
    try
    {
      if (o == paramObject1)
      {
        o = paramObject2;
        return true;
      }
    }
    finally
    {
      break label27;
      return false;
    }
  }
  
  public boolean c(a parama, a.h paramh1, a.h paramh2)
  {
    label27:
    try
    {
      if (q == paramh1)
      {
        q = paramh2;
        return true;
      }
    }
    finally
    {
      break label27;
      return false;
    }
  }
  
  public void d(a.h paramh1, a.h paramh2)
  {
    b = paramh2;
  }
  
  public void e(a.h paramh, Thread paramThread)
  {
    a = paramThread;
  }
}

/* Location:
 * Qualified Name:     u.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */