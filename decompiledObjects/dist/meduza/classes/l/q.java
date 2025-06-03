package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import b.a0;
import j0.j;
import x6.b;

public final class q
  extends MultiAutoCompleteTextView
  implements j
{
  public static final int[] d = { 16843126 };
  public final d a;
  public final b0 b;
  public final l c;
  
  public q(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968628);
    u0.a(this, getContext());
    paramContext = z0.m(getContext(), paramAttributeSet, d, 2130968628);
    if (paramContext.l(0)) {
      setDropDownBackgroundDrawable(paramContext.e(0));
    }
    paramContext.n();
    paramContext = new d(this);
    a = paramContext;
    paramContext.d(paramAttributeSet, 2130968628);
    paramContext = new b0(this);
    b = paramContext;
    paramContext.f(paramAttributeSet, 2130968628);
    paramContext.b();
    paramContext = new l(this);
    c = paramContext;
    paramContext.c(paramAttributeSet, 2130968628);
    paramAttributeSet = getKeyListener();
    if ((paramAttributeSet instanceof NumberKeyListener ^ true))
    {
      boolean bool1 = isFocusable();
      boolean bool2 = isClickable();
      boolean bool3 = isLongClickable();
      int i = getInputType();
      paramContext = paramContext.b(paramAttributeSet);
      if (paramContext != paramAttributeSet)
      {
        super.setKeyListener(paramContext);
        setRawInputType(i);
        setFocusable(bool1);
        setClickable(bool2);
        setLongClickable(bool3);
      }
    }
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = a;
    if (localObject != null) {
      ((d)localObject).a();
    }
    localObject = b;
    if (localObject != null) {
      ((b0)localObject).b();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = ((d)localObject).b();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = ((d)localObject).c();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return b.d();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return b.e();
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    a0.y(this, paramEditorInfo, localInputConnection);
    return c.d(localInputConnection, paramEditorInfo);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    paramDrawable = a;
    if (paramDrawable != null) {
      paramDrawable.e();
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    d locald = a;
    if (locald != null) {
      locald.f(paramInt);
    }
  }
  
  public final void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = b;
    if (paramDrawable1 != null) {
      paramDrawable1.b();
    }
  }
  
  public final void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = b;
    if (paramDrawable1 != null) {
      paramDrawable1.b();
    }
  }
  
  public void setDropDownBackgroundResource(int paramInt)
  {
    setDropDownBackgroundDrawable(b.X(getContext(), paramInt));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    c.g(paramBoolean);
  }
  
  public void setKeyListener(KeyListener paramKeyListener)
  {
    super.setKeyListener(c.b(paramKeyListener));
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    d locald = a;
    if (locald != null) {
      locald.h(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    d locald = a;
    if (locald != null) {
      locald.i(paramMode);
    }
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList)
  {
    b.l(paramColorStateList);
    b.b();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    b.m(paramMode);
    b.b();
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    b0 localb0 = b;
    if (localb0 != null) {
      localb0.g(paramContext, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     l.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */