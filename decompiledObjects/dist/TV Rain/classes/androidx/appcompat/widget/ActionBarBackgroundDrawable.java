package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

class ActionBarBackgroundDrawable
  extends Drawable
{
  public final ActionBarContainer mContainer;
  
  public ActionBarBackgroundDrawable(ActionBarContainer paramActionBarContainer)
  {
    mContainer = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject = mContainer;
    if (mIsSplit)
    {
      localObject = mSplitBackground;
      if (localObject != null) {
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
    else
    {
      localObject = mBackground;
      if (localObject != null) {
        ((Drawable)localObject).draw(paramCanvas);
      }
      localObject = mContainer;
      Drawable localDrawable = mStackedBackground;
      if ((localDrawable != null) && (mIsStacked)) {
        localDrawable.draw(paramCanvas);
      }
    }
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  @RequiresApi(21)
  public void getOutline(@NonNull Outline paramOutline)
  {
    Object localObject = mContainer;
    if (mIsSplit)
    {
      if (mSplitBackground != null) {
        Api21Impl.getOutline(mBackground, paramOutline);
      }
    }
    else
    {
      localObject = mBackground;
      if (localObject != null) {
        Api21Impl.getOutline((Drawable)localObject, paramOutline);
      }
    }
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    public static void getOutline(Drawable paramDrawable, Outline paramOutline)
    {
      paramDrawable.getOutline(paramOutline);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarBackgroundDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */