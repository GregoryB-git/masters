package w;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import java.util.Objects;

public final class f$d
{
  public final Resources a;
  public final Resources.Theme b;
  
  public f$d(Resources paramResources, Resources.Theme paramTheme)
  {
    a = paramResources;
    b = paramTheme;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      if ((!a.equals(a)) || (!Objects.equals(b, b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { a, b });
  }
}

/* Location:
 * Qualified Name:     w.f.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */