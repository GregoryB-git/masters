package F0;

import T0.h;
import T0.h.a;
import d0.x;
import g0.z;
import java.io.EOFException;

public final class G
{
  public final z a = new z(10);
  
  public x a(s params, h.a parama)
  {
    Object localObject = null;
    int i = 0;
    try
    {
      for (;;)
      {
        params.n(a.e(), 0, 10);
        a.T(0);
        if (a.J() != 4801587) {
          break;
        }
        a.U(3);
        int j = a.F();
        int k = j + 10;
        if (localObject == null)
        {
          localObject = new byte[k];
          System.arraycopy(a.e(), 0, localObject, 0, 10);
          params.n((byte[])localObject, 10, j);
          localObject = new h(parama).e((byte[])localObject, k);
        }
        else
        {
          params.o(j);
        }
        i += k;
      }
    }
    catch (EOFException parama)
    {
      for (;;) {}
    }
    params.h();
    params.o(i);
    return (x)localObject;
  }
}

/* Location:
 * Qualified Name:     F0.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */