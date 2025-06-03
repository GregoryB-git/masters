package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public final class u
  extends RatingBar
{
  public final s a;
  
  public u(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968816);
    u0.a(this, getContext());
    paramContext = new s(this);
    a = paramContext;
    paramContext.a(paramAttributeSet, 2130968816);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      Bitmap localBitmap = a.b;
      if (localBitmap != null) {
        setMeasuredDimension(View.resolveSizeAndState(localBitmap.getWidth() * getNumStars(), paramInt1, 0), getMeasuredHeight());
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     l.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */