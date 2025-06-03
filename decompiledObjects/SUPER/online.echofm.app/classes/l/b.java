package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public class b
  extends Drawable
{
  public final ActionBarContainer a;
  
  public b(ActionBarContainer paramActionBarContainer)
  {
    a = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject = a;
    if (v)
    {
      localObject = u;
      if (localObject != null) {
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
    else
    {
      localObject = s;
      if (localObject != null) {
        ((Drawable)localObject).draw(paramCanvas);
      }
      localObject = a;
      Drawable localDrawable = t;
      if ((localDrawable != null) && (w)) {
        localDrawable.draw(paramCanvas);
      }
    }
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void getOutline(Outline paramOutline)
  {
    Object localObject = a;
    if (v)
    {
      localObject = u;
      if (localObject == null) {}
    }
    else
    {
      do
      {
        ((Drawable)localObject).getOutline(paramOutline);
        break;
        localObject = s;
      } while (localObject != null);
    }
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}

/* Location:
 * Qualified Name:     l.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */