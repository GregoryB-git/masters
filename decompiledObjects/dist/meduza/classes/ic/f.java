package ic;

public final class f
  extends d
{
  public static final f d = new f(1, 0);
  
  public f(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2, 1);
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof f)) {
      if ((!isEmpty()) || (!((f)paramObject).isEmpty()))
      {
        int i = a;
        paramObject = (f)paramObject;
        if ((i != a) || (b != b)) {}
      }
      else
      {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final int hashCode()
  {
    int i;
    if (isEmpty()) {
      i = -1;
    } else {
      i = a * 31 + b;
    }
    return i;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (a > b) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append("..");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ic.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */