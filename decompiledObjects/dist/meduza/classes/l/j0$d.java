package l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import h.c;

public final class j0$d
  extends c
{
  public boolean b = true;
  
  public j0$d(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (b) {
      super.draw(paramCanvas);
    }
  }
  
  public final void setHotspot(float paramFloat1, float paramFloat2)
  {
    if (b) {
      super.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (b) {
      super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final boolean setState(int[] paramArrayOfInt)
  {
    if (b) {
      return super.setState(paramArrayOfInt);
    }
    return false;
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (b) {
      return super.setVisible(paramBoolean1, paramBoolean2);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     l.j0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */