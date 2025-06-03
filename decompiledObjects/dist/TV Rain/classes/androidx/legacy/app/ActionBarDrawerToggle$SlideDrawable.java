package androidx.legacy.app;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

class ActionBarDrawerToggle$SlideDrawable
  extends InsetDrawable
{
  private final boolean mHasMirroring = true;
  private float mOffset;
  private float mPosition;
  private final Rect mTmpRect = new Rect();
  
  public ActionBarDrawerToggle$SlideDrawable(ActionBarDrawerToggle paramActionBarDrawerToggle, Drawable paramDrawable)
  {
    super(paramDrawable, 0);
  }
  
  public void draw(@NonNull Canvas paramCanvas)
  {
    copyBounds(mTmpRect);
    paramCanvas.save();
    int i = ViewCompat.getLayoutDirection(this$0.mActivity.getWindow().getDecorView());
    int j = 1;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      j = -1;
    }
    int k = mTmpRect.width();
    float f1 = -mOffset;
    float f2 = k;
    paramCanvas.translate(f1 * f2 * mPosition * j, 0.0F);
    if ((i != 0) && (!mHasMirroring))
    {
      paramCanvas.translate(f2, 0.0F);
      paramCanvas.scale(-1.0F, 1.0F);
    }
    super.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public float getPosition()
  {
    return mPosition;
  }
  
  public void setOffset(float paramFloat)
  {
    mOffset = paramFloat;
    invalidateSelf();
  }
  
  public void setPosition(float paramFloat)
  {
    mPosition = paramFloat;
    invalidateSelf();
  }
}

/* Location:
 * Qualified Name:     androidx.legacy.app.ActionBarDrawerToggle.SlideDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */