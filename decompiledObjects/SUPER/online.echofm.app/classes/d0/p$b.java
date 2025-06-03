package d0;

import android.util.SparseBooleanArray;
import g0.a;

public final class p$b
{
  public final SparseBooleanArray a = new SparseBooleanArray();
  public boolean b;
  
  public b a(int paramInt)
  {
    a.f(b ^ true);
    a.append(paramInt, true);
    return this;
  }
  
  public b b(p paramp)
  {
    for (int i = 0; i < paramp.c(); i++) {
      a(paramp.b(i));
    }
    return this;
  }
  
  public b c(int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      a(paramVarArgs[j]);
    }
    return this;
  }
  
  public b d(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      return a(paramInt);
    }
    return this;
  }
  
  public p e()
  {
    a.f(b ^ true);
    b = true;
    return new p(a, null);
  }
}

/* Location:
 * Qualified Name:     d0.p.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */