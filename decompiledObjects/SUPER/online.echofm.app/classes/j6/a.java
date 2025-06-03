package j6;

import java.util.Random;

public abstract class a
  extends c
{
  public int b(int paramInt)
  {
    return d.a(d().nextInt(), paramInt);
  }
  
  public int c()
  {
    return d().nextInt();
  }
  
  public abstract Random d();
}

/* Location:
 * Qualified Name:     j6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */