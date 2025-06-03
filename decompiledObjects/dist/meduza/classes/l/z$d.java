package l;

import android.content.res.Resources.Theme;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;

public final class z$d
{
  public static void a(ThemedSpinnerAdapter paramThemedSpinnerAdapter, Resources.Theme paramTheme)
  {
    if (!Objects.equals(paramThemedSpinnerAdapter.getDropDownViewTheme(), paramTheme)) {
      paramThemedSpinnerAdapter.setDropDownViewTheme(paramTheme);
    }
  }
}

/* Location:
 * Qualified Name:     l.z.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */