package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class DrawableContainer$Api21Impl
{
  public static boolean canApplyTheme(Drawable.ConstantState paramConstantState)
  {
    return paramConstantState.canApplyTheme();
  }
  
  public static void getOutline(Drawable paramDrawable, Outline paramOutline)
  {
    paramDrawable.getOutline(paramOutline);
  }
  
  public static Resources getResources(Resources.Theme paramTheme)
  {
    return paramTheme.getResources();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.DrawableContainer.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */