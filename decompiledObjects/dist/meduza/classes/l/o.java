package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import b.a0;
import e0.d0;
import j0.e;
import x6.b;

public final class o
{
  public final ImageView a;
  public x0 b;
  public int c = 0;
  
  public o(ImageView paramImageView)
  {
    a = paramImageView;
  }
  
  public final void a()
  {
    Drawable localDrawable = a.getDrawable();
    if (localDrawable != null) {
      i0.a(localDrawable);
    }
    if (localDrawable != null)
    {
      x0 localx0 = b;
      if (localx0 != null) {
        j.d(localDrawable, localx0, a.getDrawableState());
      }
    }
  }
  
  public final void b(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = a.getContext();
    Object localObject2 = a0.s;
    localObject1 = z0.m((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt);
    ImageView localImageView = a;
    d0.g(localImageView, localImageView.getContext(), (int[])localObject2, paramAttributeSet, b, paramInt);
    try
    {
      localObject2 = a.getDrawable();
      paramAttributeSet = (AttributeSet)localObject2;
      if (localObject2 == null)
      {
        paramInt = ((z0)localObject1).i(1, -1);
        paramAttributeSet = (AttributeSet)localObject2;
        if (paramInt != -1)
        {
          localObject2 = b.X(a.getContext(), paramInt);
          paramAttributeSet = (AttributeSet)localObject2;
          if (localObject2 != null)
          {
            a.setImageDrawable((Drawable)localObject2);
            paramAttributeSet = (AttributeSet)localObject2;
          }
        }
      }
      if (paramAttributeSet != null) {
        i0.a(paramAttributeSet);
      }
      if (((z0)localObject1).l(2)) {
        e.c(a, ((z0)localObject1).b(2));
      }
      if (((z0)localObject1).l(3)) {
        e.d(a, i0.b(((z0)localObject1).h(3, -1), null));
      }
      return;
    }
    finally
    {
      ((z0)localObject1).n();
    }
  }
  
  public final void c(int paramInt)
  {
    if (paramInt != 0)
    {
      Drawable localDrawable = b.X(a.getContext(), paramInt);
      if (localDrawable != null) {
        i0.a(localDrawable);
      }
      a.setImageDrawable(localDrawable);
    }
    else
    {
      a.setImageDrawable(null);
    }
    a();
  }
}

/* Location:
 * Qualified Name:     l.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */