package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;

public final class w
  extends SeekBar
{
  public final x a;
  
  public w(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968834);
    u0.a(this, getContext());
    paramContext = new x(this);
    a = paramContext;
    paramContext.a(paramAttributeSet, 2130968834);
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    x localx = a;
    Drawable localDrawable = e;
    if ((localDrawable != null) && (localDrawable.isStateful()) && (localDrawable.setState(d.getDrawableState()))) {
      d.invalidateDrawable(localDrawable);
    }
  }
  
  public final void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Drawable localDrawable = a.e;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      a.d(paramCanvas);
      return;
    }
    finally
    {
      paramCanvas = finally;
      throw paramCanvas;
    }
  }
}

/* Location:
 * Qualified Name:     l.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */