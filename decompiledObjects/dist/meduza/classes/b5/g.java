package b5;

public final class g
{
  public boolean a;
  public Object b;
  
  public g(int paramInt)
  {
    this();
  }
  
  public final boolean a()
  {
    try
    {
      boolean bool = a;
      if (bool) {
        return false;
      }
      a = true;
      notifyAll();
      return true;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     b5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */