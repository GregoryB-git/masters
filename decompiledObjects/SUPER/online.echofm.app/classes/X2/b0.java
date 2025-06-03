package X2;

import W2.m;

public final class b0
  extends y
{
  public final transient Object q;
  
  public b0(Object paramObject)
  {
    q = m.j(paramObject);
  }
  
  public v a()
  {
    return v.Z(q);
  }
  
  public boolean contains(Object paramObject)
  {
    return q.equals(paramObject);
  }
  
  public int d(Object[] paramArrayOfObject, int paramInt)
  {
    paramArrayOfObject[paramInt] = q;
    return paramInt + 1;
  }
  
  public final int hashCode()
  {
    return q.hashCode();
  }
  
  public boolean k()
  {
    return false;
  }
  
  public g0 q()
  {
    return C.s(q);
  }
  
  public int size()
  {
    return 1;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[');
    localStringBuilder.append(q.toString());
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public Object writeReplace()
  {
    return super.writeReplace();
  }
}

/* Location:
 * Qualified Name:     X2.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */