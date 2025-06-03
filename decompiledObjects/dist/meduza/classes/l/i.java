package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import b.a0;
import e0.d0;
import j0.c;
import y.a.a;

public final class i
{
  public final CompoundButton a;
  public ColorStateList b = null;
  public PorterDuff.Mode c = null;
  public boolean d = false;
  public boolean e = false;
  public boolean f;
  
  public i(CompoundButton paramCompoundButton)
  {
    a = paramCompoundButton;
  }
  
  public final void a()
  {
    Drawable localDrawable = c.a(a);
    if ((localDrawable != null) && ((d) || (e)))
    {
      localDrawable = localDrawable.mutate();
      if (d) {
        a.a.h(localDrawable, b);
      }
      if (e) {
        a.a.i(localDrawable, c);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(a.getDrawableState());
      }
      a.setButtonDrawable(localDrawable);
    }
  }
  
  public final void b(AttributeSet paramAttributeSet, int paramInt)
  {
    localObject = a.getContext();
    int[] arrayOfInt = a0.z;
    localObject = z0.m((Context)localObject, paramAttributeSet, arrayOfInt, paramInt);
    CompoundButton localCompoundButton = a;
    d0.g(localCompoundButton, localCompoundButton.getContext(), arrayOfInt, paramAttributeSet, b, paramInt);
    paramInt = 1;
    for (;;)
    {
      try
      {
        if (((z0)localObject).l(1))
        {
          i = ((z0)localObject).i(1, 0);
          if (i == 0) {}
        }
      }
      finally
      {
        int i;
        ((z0)localObject).n();
      }
      try
      {
        paramAttributeSet = a;
        paramAttributeSet.setButtonDrawable(x6.b.X(paramAttributeSet.getContext(), i));
      }
      catch (Resources.NotFoundException paramAttributeSet) {}
    }
    paramInt = 0;
    if ((paramInt == 0) && (((z0)localObject).l(0)))
    {
      paramInt = ((z0)localObject).i(0, 0);
      if (paramInt != 0)
      {
        paramAttributeSet = a;
        paramAttributeSet.setButtonDrawable(x6.b.X(paramAttributeSet.getContext(), paramInt));
      }
    }
    if (((z0)localObject).l(2)) {
      j0.b.c(a, ((z0)localObject).b(2));
    }
    if (((z0)localObject).l(3)) {
      j0.b.d(a, i0.b(((z0)localObject).h(3, -1), null));
    }
    ((z0)localObject).n();
  }
}

/* Location:
 * Qualified Name:     l.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */