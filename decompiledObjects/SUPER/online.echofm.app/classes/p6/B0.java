package p6;

public abstract class B0
  extends F
{
  public abstract B0 H();
  
  public final String I()
  {
    B0 localB0 = W.c();
    if (this == localB0) {
      return "Dispatchers.Main";
    }
    Object localObject;
    try
    {
      localB0 = localB0.H();
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      localObject = null;
    }
    if (this == localObject) {
      return "Dispatchers.Main.immediate";
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     p6.B0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */