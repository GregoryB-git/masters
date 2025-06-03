package androidx.media2.session;

import androidx.media2.common.Rating;
import f;
import java.util.Objects;

public final class HeartRating
  implements Rating
{
  public boolean a = false;
  public boolean b;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof HeartRating;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (HeartRating)paramObject;
    bool1 = bool2;
    if (b == b)
    {
      bool1 = bool2;
      if (a == a) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { Boolean.valueOf(a), Boolean.valueOf(b) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("HeartRating: ");
    Object localObject;
    if (a)
    {
      localObject = f.l("hasHeart=");
      ((StringBuilder)localObject).append(b);
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "unrated";
    }
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.HeartRating
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */