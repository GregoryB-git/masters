package eb;

public final class g1
  extends RuntimeException
{
  public final e1 a;
  public final boolean b;
  
  public g1(e1 parame1)
  {
    super(e1.b(parame1), c);
    a = parame1;
    b = true;
    fillInStackTrace();
  }
  
  public final Throwable fillInStackTrace()
  {
    try
    {
      Object localObject1;
      if (b) {
        localObject1 = super.fillInStackTrace();
      } else {
        localObject1 = this;
      }
      return (Throwable)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     eb.g1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */