package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import e.i;

public class b$a
  extends ViewGroup.MarginLayoutParams
{
  public float a;
  public int b = -1;
  
  public b$a(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    a = 0.0F;
  }
  
  public b$a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.G0);
    a = paramContext.getFloat(i.I0, 0.0F);
    b = paramContext.getInt(i.H0, -1);
    paramContext.recycle();
  }
  
  public b$a(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */