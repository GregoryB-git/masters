package androidx.media2.session;

import androidx.media2.common.Rating;
import f;
import java.util.Objects;

public final class PercentageRating
  implements Rating
{
  public float a = -1.0F;
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof PercentageRating;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if (a == a) {
      bool2 = true;
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { Float.valueOf(a) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("PercentageRating: ");
    int i;
    if (a != -1.0F) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject;
    if (i != 0)
    {
      localObject = f.l("percentage=");
      ((StringBuilder)localObject).append(a);
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
 * Qualified Name:     androidx.media2.session.PercentageRating
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */