package A0;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import d0.K;
import d0.K.c;
import java.util.HashMap;
import java.util.Map;

public final class n$e$a
  extends K.c
{
  public boolean C;
  public boolean D;
  public boolean E;
  public boolean F;
  public boolean G;
  public boolean H;
  public boolean I;
  public boolean J;
  public boolean K;
  public boolean L;
  public boolean M;
  public boolean N;
  public boolean O;
  public boolean P;
  public boolean Q;
  public final SparseArray R;
  public final SparseBooleanArray S;
  
  public n$e$a()
  {
    R = new SparseArray();
    S = new SparseBooleanArray();
    c0();
  }
  
  public n$e$a(n.e parame)
  {
    super(parame);
    C = j0;
    D = k0;
    E = l0;
    F = m0;
    G = n0;
    H = o0;
    I = p0;
    J = q0;
    K = r0;
    L = s0;
    M = t0;
    N = u0;
    O = v0;
    P = w0;
    Q = x0;
    R = b0(n.e.b(parame));
    S = n.e.c(parame).clone();
  }
  
  public n$e$a(Context paramContext)
  {
    super(paramContext);
    R = new SparseArray();
    S = new SparseBooleanArray();
    c0();
  }
  
  public static SparseArray b0(SparseArray paramSparseArray)
  {
    SparseArray localSparseArray = new SparseArray();
    for (int i = 0; i < paramSparseArray.size(); i++) {
      localSparseArray.put(paramSparseArray.keyAt(i), new HashMap((Map)paramSparseArray.valueAt(i)));
    }
    return localSparseArray;
  }
  
  public n.e a0()
  {
    return new n.e(this, null);
  }
  
  public final void c0()
  {
    C = true;
    D = false;
    E = true;
    F = false;
    G = true;
    H = false;
    I = false;
    J = false;
    K = false;
    L = true;
    M = true;
    N = true;
    O = false;
    P = true;
    Q = false;
  }
  
  public a d0(K paramK)
  {
    super.E(paramK);
    return this;
  }
  
  public a e0(Context paramContext)
  {
    super.G(paramContext);
    return this;
  }
  
  public a f0(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super.H(paramInt1, paramInt2, paramBoolean);
    return this;
  }
  
  public a g0(Context paramContext, boolean paramBoolean)
  {
    super.I(paramContext, paramBoolean);
    return this;
  }
}

/* Location:
 * Qualified Name:     A0.n.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */