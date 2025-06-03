package d0;

import f;
import java.util.Objects;

public final class b<F, S>
{
  public final F a;
  public final S b;
  
  public b(F paramF, S paramS)
  {
    a = paramF;
    b = paramS;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof b;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (b)paramObject;
    bool1 = bool2;
    if (Objects.equals(a, a))
    {
      bool1 = bool2;
      if (Objects.equals(b, b)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final int hashCode()
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
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Pair{");
    localStringBuilder.append(a);
    localStringBuilder.append(" ");
    localStringBuilder.append(b);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */