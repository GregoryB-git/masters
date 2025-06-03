package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import b.a0;
import v0.f;
import v0.f.b;

public final class m
{
  public final TextView a;
  public final f b;
  
  public m(TextView paramTextView)
  {
    a = paramTextView;
    b = new f(paramTextView);
  }
  
  public final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = a.getContext().obtainStyledAttributes(paramAttributeSet, a0.v, paramInt, 0);
    try
    {
      boolean bool1 = paramAttributeSet.hasValue(14);
      boolean bool2 = true;
      if (bool1) {
        bool2 = paramAttributeSet.getBoolean(14, true);
      }
      paramAttributeSet.recycle();
      c(bool2);
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    b.a.b(paramBoolean);
  }
  
  public final void c(boolean paramBoolean)
  {
    b.a.c(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     l.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */