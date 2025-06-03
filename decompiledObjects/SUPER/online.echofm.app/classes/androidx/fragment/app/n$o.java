package androidx.fragment.app;

import java.util.ArrayList;

public class n$o
  implements n.n
{
  public final String a;
  public final int b;
  public final int c;
  
  public n$o(n paramn, String paramString, int paramInt1, int paramInt2)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
  }
  
  public boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    Fragment localFragment = d.u;
    if ((localFragment != null) && (b < 0) && (a == null) && (localFragment.s().S0())) {
      return false;
    }
    return d.U0(paramArrayList1, paramArrayList2, a, b, c);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.n.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */