package androidx.core.util;

import androidx.annotation.NonNull;
import z2;

public class Pair<F, S>
{
  public final F first;
  public final S second;
  
  public Pair(F paramF, S paramS)
  {
    first = paramF;
    second = paramS;
  }
  
  @NonNull
  public static <A, B> Pair<A, B> create(A paramA, B paramB)
  {
    return new Pair(paramA, paramB);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Pair;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (Pair)paramObject;
    bool1 = bool2;
    if (ObjectsCompat.equals(first, first))
    {
      bool1 = bool2;
      if (ObjectsCompat.equals(second, second)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    Object localObject = first;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = second;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Pair{");
    localStringBuilder.append(first);
    localStringBuilder.append(" ");
    localStringBuilder.append(second);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.Pair
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */