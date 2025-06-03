package k9;

public final class b
  extends k
{
  public final int a;
  public final f b;
  
  public b(int paramInt, f paramf)
  {
    a = paramInt;
    b = paramf;
  }
  
  public final int b()
  {
    return a;
  }
  
  public final f c()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof k))
    {
      paramObject = (k)paramObject;
      if ((a != ((k)paramObject).b()) || (!b.equals(((k)paramObject).c()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (a ^ 0xF4243) * 1000003 ^ b.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Overlay{largestBatchId=");
    localStringBuilder.append(a);
    localStringBuilder.append(", mutation=");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */