package o7;

import java.util.Arrays;
import p2.m0;

public abstract class r$a<E>
  extends r.b<E>
{
  public Object[] a;
  public int b;
  public boolean c;
  
  public r$a()
  {
    m0.o(4, "initialCapacity");
    a = new Object[4];
    b = 0;
  }
  
  public final void b(int paramInt)
  {
    Object[] arrayOfObject = a;
    if (arrayOfObject.length < paramInt) {}
    for (a = Arrays.copyOf(arrayOfObject, r.b.a(arrayOfObject.length, paramInt));; a = ((Object[])arrayOfObject.clone()))
    {
      c = false;
      break;
      if (!c) {
        break;
      }
    }
  }
}

/* Location:
 * Qualified Name:     o7.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */