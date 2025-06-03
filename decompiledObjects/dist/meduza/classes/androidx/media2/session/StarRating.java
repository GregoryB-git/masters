package androidx.media2.session;

import androidx.media2.common.Rating;
import f;
import java.util.Objects;

public final class StarRating
  implements Rating
{
  public int a;
  public float b;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof StarRating;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (StarRating)paramObject;
    bool1 = bool2;
    if (a == a)
    {
      bool1 = bool2;
      if (b == b) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { Integer.valueOf(a), Float.valueOf(b) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("StarRating: maxStars=");
    localStringBuilder.append(a);
    int i;
    if (b >= 0.0F) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject;
    if (i != 0)
    {
      localObject = f.l(", starRating=");
      ((StringBuilder)localObject).append(b);
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = ", unrated";
    }
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.StarRating
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */