package nc;

public final class y0$b
  extends y0.c
{
  public final Runnable c;
  
  public y0$b(e2 parame2, long paramLong)
  {
    super(paramLong);
    c = parame2;
  }
  
  public final void run()
  {
    c.run();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append(c);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.y0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */