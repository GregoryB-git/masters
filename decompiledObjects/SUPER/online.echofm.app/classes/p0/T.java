package p0;

public final class T
  extends Exception
{
  public final int o;
  
  public T(int paramInt)
  {
    o = paramInt;
  }
  
  public T(int paramInt, Exception paramException)
  {
    super(paramException);
    o = paramInt;
  }
}

/* Location:
 * Qualified Name:     p0.T
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */