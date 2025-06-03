package f;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import e.i;

public abstract class a
  extends ViewGroup.MarginLayoutParams
{
  public int a;
  
  public a(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    a = 8388627;
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a = 0;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.r);
    a = paramContext.getInt(i.s, 0);
    paramContext.recycle();
  }
  
  public a(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    a = 0;
  }
  
  public a(a parama)
  {
    super(parama);
    a = 0;
    a = a;
  }
}

/* Location:
 * Qualified Name:     f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */