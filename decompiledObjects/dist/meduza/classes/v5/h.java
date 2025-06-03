package v5;

import android.util.SparseBooleanArray;
import x6.b;

public final class h
{
  public final SparseBooleanArray a;
  
  public h(SparseBooleanArray paramSparseBooleanArray)
  {
    a = paramSparseBooleanArray;
  }
  
  public final int a(int paramInt)
  {
    b.x(paramInt, b());
    return a.keyAt(paramInt);
  }
  
  public final int b()
  {
    return a.size();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    paramObject = (h)paramObject;
    if (e0.a < 24)
    {
      if (b() != ((h)paramObject).b()) {
        return false;
      }
      for (int i = 0; i < b(); i++) {
        if (a(i) != ((h)paramObject).a(i)) {
          return false;
        }
      }
      return true;
    }
    return a.equals(a);
  }
  
  public final int hashCode()
  {
    if (e0.a < 24)
    {
      int i = b();
      for (int j = 0; j < b(); j++) {
        i = i * 31 + a(j);
      }
      return i;
    }
    return a.hashCode();
  }
  
  public static final class a
  {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;
    
    public final void a(int paramInt)
    {
      b.H(b ^ true);
      a.append(paramInt, true);
    }
    
    public final h b()
    {
      b.H(b ^ true);
      b = true;
      return new h(a);
    }
  }
}

/* Location:
 * Qualified Name:     v5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */