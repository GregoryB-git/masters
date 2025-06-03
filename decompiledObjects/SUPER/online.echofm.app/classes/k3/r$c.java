package k3;

import java.util.Objects;
import r3.a;

public class r$c
{
  public final Class a;
  public final a b;
  
  public r$c(Class paramClass, a parama)
  {
    a = paramClass;
    b = parama;
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
    localStringBuilder.append(", object identifier: ");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     k3.r.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */