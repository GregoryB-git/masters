package d0;

import android.util.SparseBooleanArray;
import g0.M;
import g0.a;

public final class p
{
  public final SparseBooleanArray a;
  
  public p(SparseBooleanArray paramSparseBooleanArray)
  {
    a = paramSparseBooleanArray;
  }
  
  public boolean a(int paramInt)
  {
    return a.get(paramInt);
  }
  
  public int b(int paramInt)
  {
    a.c(paramInt, 0, c());
    return a.keyAt(paramInt);
  }
  
  public int c()
  {
    return a.size();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof p)) {
      return false;
    }
    paramObject = (p)paramObject;
    if (M.a < 24)
    {
      if (c() != ((p)paramObject).c()) {
        return false;
      }
      for (int i = 0; i < c(); i++) {
        if (b(i) != ((p)paramObject).b(i)) {
          return false;
        }
      }
      return true;
    }
    return a.equals(a);
  }
  
  public int hashCode()
  {
    if (M.a < 24)
    {
      int i = c();
      for (int j = 0; j < c(); j++) {
        i = i * 31 + b(j);
      }
      return i;
    }
    return a.hashCode();
  }
  
  public static final class b
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
}

/* Location:
 * Qualified Name:     d0.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */