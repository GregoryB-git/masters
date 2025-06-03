package o7;

public final class v0<E>
  extends x<E>
{
  public final transient E d;
  
  public v0(E paramE)
  {
    paramE.getClass();
    d = paramE;
  }
  
  public final t<E> a()
  {
    return t.t(d);
  }
  
  public final boolean contains(Object paramObject)
  {
    return d.equals(paramObject);
  }
  
  public final int h(int paramInt, Object[] paramArrayOfObject)
  {
    paramArrayOfObject[paramInt] = d;
    return paramInt + 1;
  }
  
  public final int hashCode()
  {
    return d.hashCode();
  }
  
  public final boolean m()
  {
    return false;
  }
  
  public final x0<E> n()
  {
    return new a0(d);
  }
  
  public final int size()
  {
    return 1;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[');
    localStringBuilder.append(d.toString());
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     o7.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */