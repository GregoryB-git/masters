package w;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;

public final class f$c
{
  public final ColorStateList a;
  public final Configuration b;
  public final int c;
  
  public f$c(ColorStateList paramColorStateList, Configuration paramConfiguration, Resources.Theme paramTheme)
  {
    a = paramColorStateList;
    b = paramConfiguration;
    int i;
    if (paramTheme == null) {
      i = 0;
    } else {
      i = paramTheme.hashCode();
    }
    c = i;
  }
}

/* Location:
 * Qualified Name:     w.f.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */