package androidx.appcompat.widget;

import android.content.res.Resources.Theme;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
final class AppCompatSpinner$Api23Impl
{
  @DoNotInline
  public static void setDropDownViewTheme(@NonNull ThemedSpinnerAdapter paramThemedSpinnerAdapter, @Nullable Resources.Theme paramTheme)
  {
    if (paramThemedSpinnerAdapter.getDropDownViewTheme() != paramTheme) {
      paramThemedSpinnerAdapter.setDropDownViewTheme(paramTheme);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */