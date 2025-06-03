package k3;

import java.util.Objects;

public final class n$c
{
  public final Class a;
  public final Class b;
  
  public n$c(Class paramClass1, Class paramClass2)
  {
    a = paramClass1;
    b = paramClass2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof c;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (c)paramObject;
    bool1 = bool2;
    if (a.equals(a))
    {
      bool1 = bool2;
      if (b.equals(b)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { a, b });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.getSimpleName());
    localStringBuilder.append(" with primitive type: ");
    localStringBuilder.append(b.getSimpleName());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k3.n.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */