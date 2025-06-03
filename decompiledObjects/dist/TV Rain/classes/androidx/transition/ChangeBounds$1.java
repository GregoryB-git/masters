package androidx.transition;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

final class ChangeBounds$1
  extends Property<Drawable, PointF>
{
  private Rect mBounds = new Rect();
  
  public ChangeBounds$1(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF get(Drawable paramDrawable)
  {
    paramDrawable.copyBounds(mBounds);
    paramDrawable = mBounds;
    return new PointF(left, top);
  }
  
  public void set(Drawable paramDrawable, PointF paramPointF)
  {
    paramDrawable.copyBounds(mBounds);
    mBounds.offsetTo(Math.round(x), Math.round(y));
    paramDrawable.setBounds(mBounds);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeBounds.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */