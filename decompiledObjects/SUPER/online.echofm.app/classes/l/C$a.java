package l;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import h.c;

public class C$a
  extends c
{
  public boolean p = true;
  
  public C$a(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  public void c(boolean paramBoolean)
  {
    p = paramBoolean;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (p) {
      super.draw(paramCanvas);
    }
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    if (p) {
      super.setHotspot(paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (p) {
      super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    if (p) {
      return super.setState(paramArrayOfInt);
    }
    return false;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (p) {
      return super.setVisible(paramBoolean1, paramBoolean2);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     l.C.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */