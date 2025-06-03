package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import b.a0;

public class a$a
  extends ViewGroup.MarginLayoutParams
{
  public int a;
  
  public a$a()
  {
    super(-2, -2);
    a = 8388627;
  }
  
  public a$a(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a = 0;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a0.o);
    a = paramContext.getInt(0, 0);
    paramContext.recycle();
  }
  
  public a$a(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    a = 0;
  }
  
  public a$a(a parama)
  {
    super(parama);
    a = 0;
    a = a;
  }
}

/* Location:
 * Qualified Name:     g.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */