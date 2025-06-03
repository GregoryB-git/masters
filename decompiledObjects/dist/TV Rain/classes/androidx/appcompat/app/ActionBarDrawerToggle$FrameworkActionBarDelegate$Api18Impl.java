package androidx.appcompat.app;

import android.app.ActionBar;
import android.graphics.drawable.Drawable;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class ActionBarDrawerToggle$FrameworkActionBarDelegate$Api18Impl
{
  @DoNotInline
  public static void setHomeActionContentDescription(ActionBar paramActionBar, int paramInt)
  {
    paramActionBar.setHomeActionContentDescription(paramInt);
  }
  
  @DoNotInline
  public static void setHomeAsUpIndicator(ActionBar paramActionBar, Drawable paramDrawable)
  {
    paramActionBar.setHomeAsUpIndicator(paramDrawable);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggle.FrameworkActionBarDelegate.Api18Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */