package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import f.a;

public class Toolbar$e
  extends a
{
  public int b = 0;
  
  public Toolbar$e(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    a = 8388627;
  }
  
  public Toolbar$e(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public Toolbar$e(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public Toolbar$e(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    a(paramMarginLayoutParams);
  }
  
  public Toolbar$e(e parame)
  {
    super(parame);
    b = b;
  }
  
  public Toolbar$e(a parama)
  {
    super(parama);
  }
  
  public void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    leftMargin = leftMargin;
    topMargin = topMargin;
    rightMargin = rightMargin;
    bottomMargin = bottomMargin;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */