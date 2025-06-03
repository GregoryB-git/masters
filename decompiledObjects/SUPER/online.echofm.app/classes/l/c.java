package l;

import L.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import g.a;

public abstract class c
  extends AutoCompleteTextView
{
  public static final int[] q = { 16843126 };
  public final d o;
  public final v p;
  
  public c(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(U.b(paramContext), paramAttributeSet, paramInt);
    T.a(this, getContext());
    paramContext = X.s(getContext(), paramAttributeSet, q, paramInt, 0);
    if (paramContext.p(0)) {
      setDropDownBackgroundDrawable(paramContext.f(0));
    }
    paramContext.t();
    paramContext = new d(this);
    o = paramContext;
    paramContext.e(paramAttributeSet, paramInt);
    paramContext = new v(this);
    p = paramContext;
    paramContext.m(paramAttributeSet, paramInt);
    paramContext.b();
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = o;
    if (localObject != null) {
      ((d)localObject).b();
    }
    localObject = p;
    if (localObject != null) {
      ((v)localObject).b();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = o;
    if (localObject != null) {
      localObject = ((d)localObject).c();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = o;
    if (localObject != null) {
      localObject = ((d)localObject).d();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return f.a(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, this);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    d locald = o;
    if (locald != null) {
      locald.f(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    d locald = o;
    if (locald != null) {
      locald.g(paramInt);
    }
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(h.m(this, paramCallback));
  }
  
  public void setDropDownBackgroundResource(int paramInt)
  {
    setDropDownBackgroundDrawable(a.b(getContext(), paramInt));
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    d locald = o;
    if (locald != null) {
      locald.i(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    d locald = o;
    if (locald != null) {
      locald.j(paramMode);
    }
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    v localv = p;
    if (localv != null) {
      localv.q(paramContext, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     l.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */