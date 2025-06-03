package H;

public class d
{
  public final Object a;
  public final Object b;
  
  public d(Object paramObject1, Object paramObject2)
  {
    a = paramObject1;
    b = paramObject2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof d;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (d)paramObject;
    bool1 = bool2;
    if (c.a(a, a))
    {
      bool1 = bool2;
      if (c.a(b, b)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = b;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Pair{");
    localStringBuilder.append(a);
    localStringBuilder.append(" ");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     H.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */