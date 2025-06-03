package c4;

import java.io.EOFException;
import p4.a;
import u4.g;
import u4.g.a;
import v5.u;

public final class q
{
  public final u a = new u(10);
  
  public final a a(i parami, g.a parama)
  {
    Object localObject = null;
    int i = 0;
    try
    {
      for (;;)
      {
        parami.m(a.a, 0, 10);
        a.G(0);
        if (a.x() != 4801587) {
          break;
        }
        a.H(3);
        int j = a.u();
        int k = j + 10;
        if (localObject == null)
        {
          localObject = new byte[k];
          System.arraycopy(a.a, 0, localObject, 0, 10);
          parami.m((byte[])localObject, 10, j);
          localObject = new g(parama).C((byte[])localObject, k);
        }
        else
        {
          parami.e(j);
        }
        i += k;
      }
    }
    catch (EOFException parama)
    {
      for (;;) {}
    }
    parami.i();
    parami.e(i);
    return (a)localObject;
  }
}

/* Location:
 * Qualified Name:     c4.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */