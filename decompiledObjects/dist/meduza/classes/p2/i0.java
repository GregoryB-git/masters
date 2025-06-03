package p2;

import a3.b;
import ec.i;
import y2.s;
import y2.t;

public final class i0
  implements h0
{
  public final r a;
  public final b b;
  
  public i0(r paramr, b paramb)
  {
    a = paramr;
    b = paramb;
  }
  
  public final void a(x paramx)
  {
    i.e(paramx, "workSpecId");
    c(paramx, 65024);
  }
  
  public final void b(x paramx)
  {
    paramx = new s(a, paramx, null);
    b.d(paramx);
  }
  
  public final void c(x paramx, int paramInt)
  {
    i.e(paramx, "workSpecId");
    b.d(new t(a, paramx, false, paramInt));
  }
  
  public final void d(x paramx, int paramInt)
  {
    c(paramx, paramInt);
  }
}

/* Location:
 * Qualified Name:     p2.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */