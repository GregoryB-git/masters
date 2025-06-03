package e1;

import android.util.SparseArray;

public final class a$f
{
  public final int a;
  public final boolean b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final int h;
  public final int i;
  public final int j;
  public final SparseArray k;
  
  public a$f(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, SparseArray paramSparseArray)
  {
    a = paramInt1;
    b = paramBoolean;
    c = paramInt2;
    d = paramInt3;
    e = paramInt4;
    f = paramInt5;
    g = paramInt6;
    h = paramInt7;
    i = paramInt8;
    j = paramInt9;
    k = paramSparseArray;
  }
  
  public void a(f paramf)
  {
    paramf = k;
    for (int m = 0; m < paramf.size(); m++) {
      k.put(paramf.keyAt(m), (a.g)paramf.valueAt(m));
    }
  }
}

/* Location:
 * Qualified Name:     e1.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */