package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import j0.j;
import v0.f;
import v0.f.b;
import x6.b;

public final class t
  extends RadioButton
  implements j
{
  public final i a;
  public final d b;
  public final b0 c;
  public m d;
  
  public t(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968815);
    u0.a(this, getContext());
    paramContext = new i(this);
    a = paramContext;
    paramContext.b(paramAttributeSet, 2130968815);
    paramContext = new d(this);
    b = paramContext;
    paramContext.d(paramAttributeSet, 2130968815);
    paramContext = new b0(this);
    c = paramContext;
    paramContext.f(paramAttributeSet, 2130968815);
    getEmojiTextViewHelper().a(paramAttributeSet, 2130968815);
  }
  
  private m getEmojiTextViewHelper()
  {
    if (d == null) {
      d = new m(this);
    }
    return d;
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = b;
    if (localObject != null) {
      ((d)localObject).a();
    }
    localObject = c;
    if (localObject != null) {
      ((b0)localObject).b();
    }
  }
  
  public int getCompoundPaddingLeft()
  {
    int i = super.getCompoundPaddingLeft();
    i locali = a;
    if (locali != null) {
      locali.getClass();
    }
    return i;
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = ((d)localObject).b();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = b;
    if (localObject != null) {
      localObject = ((d)localObject).c();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public ColorStateList getSupportButtonTintList()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = c;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return c.d();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return c.e();
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().b(paramBoolean);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    paramDrawable = b;
    if (paramDrawable != null) {
      paramDrawable.e();
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    d locald = b;
    if (locald != null) {
      locald.f(paramInt);
    }
  }
  
  public void setButtonDrawable(int paramInt)
  {
    setButtonDrawable(b.X(getContext(), paramInt));
  }
  
  public void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    paramDrawable = a;
    if (paramDrawable != null) {
      if (f)
      {
        f = false;
      }
      else
      {
        f = true;
        paramDrawable.a();
      }
    }
  }
  
  public final void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = c;
    if (paramDrawable1 != null) {
      paramDrawable1.b();
    }
  }
  
  public final void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = c;
    if (paramDrawable1 != null) {
      paramDrawable1.b();
    }
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().c(paramBoolean);
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    super.setFilters(getEmojiTextViewHelperb.a.a(paramArrayOfInputFilter));
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    d locald = b;
    if (locald != null) {
      locald.h(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    d locald = b;
    if (locald != null) {
      locald.i(paramMode);
    }
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    i locali = a;
    if (locali != null)
    {
      b = paramColorStateList;
      d = true;
      locali.a();
    }
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    i locali = a;
    if (locali != null)
    {
      c = paramMode;
      e = true;
      locali.a();
    }
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList)
  {
    c.l(paramColorStateList);
    c.b();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    c.m(paramMode);
    c.b();
  }
}

/* Location:
 * Qualified Name:     l.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */