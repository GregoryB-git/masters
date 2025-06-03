package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public final class b
  extends Drawable
{
  public final ActionBarContainer a;
  
  public b(ActionBarContainer paramActionBarContainer)
  {
    a = paramActionBarContainer;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Object localObject = a;
    if (p)
    {
      localObject = o;
      if (localObject != null) {
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
    else
    {
      localObject = e;
      if (localObject != null) {
        ((Drawable)localObject).draw(paramCanvas);
      }
      localObject = a;
      Drawable localDrawable = f;
      if ((localDrawable != null) && (q)) {
        localDrawable.draw(paramCanvas);
      }
    }
  }
  
  public final int getOpacity()
  {
    return 0;
  }
  
  public final void getOutline(Outline paramOutline)
  {
    Object localObject = a;
    if (p)
    {
      if (o != null) {
        localObject = e;
      }
    }
    else {
      do
      {
        ((Drawable)localObject).getOutline(paramOutline);
        break;
        localObject = e;
      } while (localObject != null);
    }
  }
  
  public final void setAlpha(int paramInt) {}
  
  public final void setColorFilter(ColorFilter paramColorFilter) {}
}

/* Location:
 * Qualified Name:     l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */