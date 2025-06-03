package e0;

import android.view.DisplayCutout;
import f;
import java.util.Objects;

public final class h
{
  public final DisplayCutout a;
  
  public h(DisplayCutout paramDisplayCutout)
  {
    a = paramDisplayCutout;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (h.class == paramObject.getClass()))
    {
      paramObject = (h)paramObject;
      return Objects.equals(a, a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    DisplayCutout localDisplayCutout = a;
    int i;
    if (localDisplayCutout == null) {
      i = 0;
    } else {
      i = localDisplayCutout.hashCode();
    }
    return i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DisplayCutoutCompat{");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     e0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */