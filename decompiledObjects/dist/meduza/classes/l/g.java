package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import b.a0;
import e0.d0;
import j0.j;
import x6.b;

public final class g
  extends CheckedTextView
  implements j
{
  public final h a;
  public final d b;
  public final b0 c;
  public m d;
  
  public g(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968663);
    u0.a(this, getContext());
    paramContext = new b0(this);
    c = paramContext;
    paramContext.f(paramAttributeSet, 2130968663);
    paramContext.b();
    paramContext = new d(this);
    b = paramContext;
    paramContext.d(paramAttributeSet, 2130968663);
    paramContext = new h(this);
    a = paramContext;
    localObject1 = getContext();
    Object localObject2 = a0.y;
    localObject1 = z0.m((Context)localObject1, paramAttributeSet, (int[])localObject2, 2130968663);
    d0.g(this, getContext(), (int[])localObject2, paramAttributeSet, b, 2130968663);
    int i = 1;
    for (;;)
    {
      try
      {
        if (((z0)localObject1).l(1))
        {
          j = ((z0)localObject1).i(1, 0);
          if (j == 0) {}
        }
      }
      finally
      {
        int j;
        ((z0)localObject1).n();
      }
      try
      {
        setCheckMarkDrawable(b.X(getContext(), j));
      }
      catch (Resources.NotFoundException localNotFoundException) {}
    }
    i = 0;
    if ((i == 0) && (((z0)localObject1).l(0)))
    {
      i = ((z0)localObject1).i(0, 0);
      if (i != 0)
      {
        localObject2 = a;
        ((CheckedTextView)localObject2).setCheckMarkDrawable(b.X(((View)localObject2).getContext(), i));
      }
    }
    if (((z0)localObject1).l(2)) {
      a.setCheckMarkTintList(((z0)localObject1).b(2));
    }
    if (((z0)localObject1).l(3)) {
      a.setCheckMarkTintMode(i0.b(((z0)localObject1).h(3, -1), null));
    }
    ((z0)localObject1).n();
    getEmojiTextViewHelper().a(paramAttributeSet, 2130968663);
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
    Object localObject = c;
    if (localObject != null) {
      ((b0)localObject).b();
    }
    localObject = b;
    if (localObject != null) {
      ((d)localObject).a();
    }
    localObject = a;
    if (localObject != null) {
      ((h)localObject).a();
    }
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return j0.h.e(super.getCustomSelectionActionModeCallback());
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
  
  public ColorStateList getSupportCheckMarkTintList()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = b;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportCheckMarkTintMode()
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
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    a0.y(this, paramEditorInfo, localInputConnection);
    return localInputConnection;
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
  
  public void setCheckMarkDrawable(int paramInt)
  {
    setCheckMarkDrawable(b.X(getContext(), paramInt));
  }
  
  public void setCheckMarkDrawable(Drawable paramDrawable)
  {
    super.setCheckMarkDrawable(paramDrawable);
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
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(j0.h.f(paramCallback, this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().c(paramBoolean);
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
  
  public void setSupportCheckMarkTintList(ColorStateList paramColorStateList)
  {
    h localh = a;
    if (localh != null)
    {
      b = paramColorStateList;
      d = true;
      localh.a();
    }
  }
  
  public void setSupportCheckMarkTintMode(PorterDuff.Mode paramMode)
  {
    h localh = a;
    if (localh != null)
    {
      c = paramMode;
      e = true;
      localh.a();
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
  
  public final void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    b0 localb0 = c;
    if (localb0 != null) {
      localb0.g(paramContext, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     l.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */