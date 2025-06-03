package A0;

import android.content.Context;
import android.support.v4.media.a;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import d0.K;
import d0.K.c;
import g0.M;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import x0.Z;

public final class n$e
  extends K
{
  public static final e A0;
  public static final e B0;
  public static final String C0 = M.w0(1000);
  public static final String D0 = M.w0(1001);
  public static final String E0 = M.w0(1002);
  public static final String F0 = M.w0(1003);
  public static final String G0 = M.w0(1004);
  public static final String H0 = M.w0(1005);
  public static final String I0 = M.w0(1006);
  public static final String J0 = M.w0(1007);
  public static final String K0 = M.w0(1008);
  public static final String L0 = M.w0(1009);
  public static final String M0 = M.w0(1010);
  public static final String N0 = M.w0(1011);
  public static final String O0 = M.w0(1012);
  public static final String P0 = M.w0(1013);
  public static final String Q0 = M.w0(1014);
  public static final String R0 = M.w0(1015);
  public static final String S0 = M.w0(1016);
  public static final String T0 = M.w0(1017);
  public static final String U0 = M.w0(1018);
  public final boolean j0;
  public final boolean k0;
  public final boolean l0;
  public final boolean m0;
  public final boolean n0;
  public final boolean o0;
  public final boolean p0;
  public final boolean q0;
  public final boolean r0;
  public final boolean s0;
  public final boolean t0;
  public final boolean u0;
  public final boolean v0;
  public final boolean w0;
  public final boolean x0;
  public final SparseArray y0;
  public final SparseBooleanArray z0;
  
  static
  {
    e locale = new a().a0();
    A0 = locale;
    B0 = locale;
  }
  
  public n$e(a parama)
  {
    super(parama);
    j0 = a.J(parama);
    k0 = a.K(parama);
    l0 = a.L(parama);
    m0 = a.M(parama);
    n0 = a.N(parama);
    o0 = a.O(parama);
    p0 = a.P(parama);
    q0 = a.Q(parama);
    r0 = a.R(parama);
    s0 = a.S(parama);
    t0 = a.T(parama);
    u0 = a.U(parama);
    v0 = a.V(parama);
    w0 = a.W(parama);
    x0 = a.X(parama);
    y0 = a.Y(parama);
    z0 = a.Z(parama);
  }
  
  public static boolean d(SparseBooleanArray paramSparseBooleanArray1, SparseBooleanArray paramSparseBooleanArray2)
  {
    int i = paramSparseBooleanArray1.size();
    if (paramSparseBooleanArray2.size() != i) {
      return false;
    }
    for (int j = 0; j < i; j++) {
      if (paramSparseBooleanArray2.indexOfKey(paramSparseBooleanArray1.keyAt(j)) < 0) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean e(SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    int i = paramSparseArray1.size();
    if (paramSparseArray2.size() != i) {
      return false;
    }
    int j = 0;
    while (j < i)
    {
      int k = paramSparseArray2.indexOfKey(paramSparseArray1.keyAt(j));
      if ((k >= 0) && (f((Map)paramSparseArray1.valueAt(j), (Map)paramSparseArray2.valueAt(k)))) {
        j++;
      } else {
        return false;
      }
    }
    return true;
  }
  
  public static boolean f(Map paramMap1, Map paramMap2)
  {
    int i = paramMap1.size();
    if (paramMap2.size() != i) {
      return false;
    }
    Iterator localIterator = paramMap1.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap1 = (Map.Entry)localIterator.next();
      Z localZ = (Z)paramMap1.getKey();
      if ((!paramMap2.containsKey(localZ)) || (!M.c(paramMap1.getValue(), paramMap2.get(localZ)))) {
        return false;
      }
    }
    return true;
  }
  
  public static e h(Context paramContext)
  {
    return new a(paramContext).a0();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if ((!super.equals(paramObject)) || (j0 != j0) || (k0 != k0) || (l0 != l0) || (m0 != m0) || (n0 != n0) || (o0 != o0) || (p0 != p0) || (q0 != q0) || (r0 != r0) || (s0 != s0) || (t0 != t0) || (u0 != u0) || (v0 != v0) || (w0 != w0) || (x0 != x0) || (!d(z0, z0)) || (!e(y0, y0))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public a g()
  {
    return new a(this, null);
  }
  
  public int hashCode()
  {
    return (((((((((((((((super.hashCode() + 31) * 31 + j0) * 31 + k0) * 31 + l0) * 31 + m0) * 31 + n0) * 31 + o0) * 31 + p0) * 31 + q0) * 31 + r0) * 31 + s0) * 31 + t0) * 31 + u0) * 31 + v0) * 31 + w0) * 31 + x0;
  }
  
  public boolean i(int paramInt)
  {
    return z0.get(paramInt);
  }
  
  public n.f j(int paramInt, Z paramZ)
  {
    Map localMap = (Map)y0.get(paramInt);
    if (localMap != null) {
      a.a(localMap.get(paramZ));
    }
    return null;
  }
  
  public boolean k(int paramInt, Z paramZ)
  {
    Map localMap = (Map)y0.get(paramInt);
    boolean bool;
    if ((localMap != null) && (localMap.containsKey(paramZ))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final class a
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
    
    public a()
    {
      R = new SparseArray();
      S = new SparseBooleanArray();
      c0();
    }
    
    public a(n.e parame)
    {
      super();
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
    
    public a(Context paramContext)
    {
      super();
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
}

/* Location:
 * Qualified Name:     A0.n.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */