package l;

import G.l;
import G.l.a;
import L.b;
import L.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class w
  extends TextView
  implements i, b
{
  public final d o;
  public final v p;
  public final n q;
  public Future r;
  
  public w(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public w(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public w(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(U.b(paramContext), paramAttributeSet, paramInt);
    T.a(this, getContext());
    paramContext = new d(this);
    o = paramContext;
    paramContext.e(paramAttributeSet, paramInt);
    paramContext = new v(this);
    p = paramContext;
    paramContext.m(paramAttributeSet, paramInt);
    paramContext.b();
    q = new n(this);
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
  
  public final void e()
  {
    Future localFuture = r;
    if (localFuture != null) {}
    try
    {
      r = null;
      android.support.v4.media.a.a(localFuture.get());
      L.h.k(this, null);
      return;
    }
    catch (InterruptedException|ExecutionException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public int getAutoSizeMaxTextSize()
  {
    if (b.b) {
      return super.getAutoSizeMaxTextSize();
    }
    v localv = p;
    if (localv != null) {
      return localv.e();
    }
    return -1;
  }
  
  public int getAutoSizeMinTextSize()
  {
    if (b.b) {
      return super.getAutoSizeMinTextSize();
    }
    v localv = p;
    if (localv != null) {
      return localv.f();
    }
    return -1;
  }
  
  public int getAutoSizeStepGranularity()
  {
    if (b.b) {
      return super.getAutoSizeStepGranularity();
    }
    v localv = p;
    if (localv != null) {
      return localv.g();
    }
    return -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes()
  {
    if (b.b) {
      return super.getAutoSizeTextAvailableSizes();
    }
    v localv = p;
    if (localv != null) {
      return localv.h();
    }
    return new int[0];
  }
  
  @SuppressLint({"WrongConstant"})
  public int getAutoSizeTextType()
  {
    boolean bool = b.b;
    int i = 0;
    if (bool)
    {
      if (super.getAutoSizeTextType() == 1) {
        i = 1;
      }
      return i;
    }
    v localv = p;
    if (localv != null) {
      return localv.i();
    }
    return 0;
  }
  
  public int getFirstBaselineToTopHeight()
  {
    return L.h.a(this);
  }
  
  public int getLastBaselineToBottomHeight()
  {
    return L.h.b(this);
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
  
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return p.j();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return p.k();
  }
  
  public CharSequence getText()
  {
    e();
    return super.getText();
  }
  
  @NonNull
  public TextClassifier getTextClassifier()
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      n localn = q;
      if (localn != null) {
        return localn.a();
      }
    }
    return super.getTextClassifier();
  }
  
  @NonNull
  public l.a getTextMetricsParamsCompat()
  {
    return L.h.e(this);
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return f.a(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, this);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    v localv = p;
    if (localv != null) {
      localv.o(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    e();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    paramCharSequence = p;
    if ((paramCharSequence != null) && (!b.b) && (paramCharSequence.l())) {
      p.c();
    }
  }
  
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (b.b)
    {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    else
    {
      v localv = p;
      if (localv != null) {
        localv.s(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
  
  public void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    if (b.b)
    {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
    }
    else
    {
      v localv = p;
      if (localv != null) {
        localv.t(paramArrayOfInt, paramInt);
      }
    }
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    if (b.b)
    {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
    }
    else
    {
      v localv = p;
      if (localv != null) {
        localv.u(paramInt);
      }
    }
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
  
  public void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = p;
    if (paramDrawable1 != null) {
      paramDrawable1.p();
    }
  }
  
  public void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = p;
    if (paramDrawable1 != null) {
      paramDrawable1.p();
    }
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Context localContext = getContext();
    Drawable localDrawable1 = null;
    if (paramInt1 != 0) {
      localObject = g.a.b(localContext, paramInt1);
    } else {
      localObject = null;
    }
    Drawable localDrawable2;
    if (paramInt2 != 0) {
      localDrawable2 = g.a.b(localContext, paramInt2);
    } else {
      localDrawable2 = null;
    }
    Drawable localDrawable3;
    if (paramInt3 != 0) {
      localDrawable3 = g.a.b(localContext, paramInt3);
    } else {
      localDrawable3 = null;
    }
    if (paramInt4 != 0) {
      localDrawable1 = g.a.b(localContext, paramInt4);
    }
    setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject, localDrawable2, localDrawable3, localDrawable1);
    Object localObject = p;
    if (localObject != null) {
      ((v)localObject).p();
    }
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = p;
    if (paramDrawable1 != null) {
      paramDrawable1.p();
    }
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Context localContext = getContext();
    Drawable localDrawable1 = null;
    if (paramInt1 != 0) {
      localObject = g.a.b(localContext, paramInt1);
    } else {
      localObject = null;
    }
    Drawable localDrawable2;
    if (paramInt2 != 0) {
      localDrawable2 = g.a.b(localContext, paramInt2);
    } else {
      localDrawable2 = null;
    }
    Drawable localDrawable3;
    if (paramInt3 != 0) {
      localDrawable3 = g.a.b(localContext, paramInt3);
    } else {
      localDrawable3 = null;
    }
    if (paramInt4 != 0) {
      localDrawable1 = g.a.b(localContext, paramInt4);
    }
    setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject, localDrawable2, localDrawable3, localDrawable1);
    Object localObject = p;
    if (localObject != null) {
      ((v)localObject).p();
    }
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = p;
    if (paramDrawable1 != null) {
      paramDrawable1.p();
    }
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(L.h.m(this, paramCallback));
  }
  
  public void setFirstBaselineToTopHeight(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      super.setFirstBaselineToTopHeight(paramInt);
    } else {
      L.h.h(this, paramInt);
    }
  }
  
  public void setLastBaselineToBottomHeight(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      super.setLastBaselineToBottomHeight(paramInt);
    } else {
      L.h.i(this, paramInt);
    }
  }
  
  public void setLineHeight(int paramInt)
  {
    L.h.j(this, paramInt);
  }
  
  public void setPrecomputedText(@NonNull l paraml)
  {
    L.h.k(this, paraml);
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
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList)
  {
    p.v(paramColorStateList);
    p.b();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    p.w(paramMode);
    p.b();
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    v localv = p;
    if (localv != null) {
      localv.q(paramContext, paramInt);
    }
  }
  
  public void setTextClassifier(TextClassifier paramTextClassifier)
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      n localn = q;
      if (localn != null)
      {
        localn.b(paramTextClassifier);
        return;
      }
    }
    super.setTextClassifier(paramTextClassifier);
  }
  
  public void setTextFuture(Future<l> paramFuture)
  {
    r = paramFuture;
    if (paramFuture != null) {
      requestLayout();
    }
  }
  
  public void setTextMetricsParamsCompat(@NonNull l.a parama)
  {
    L.h.l(this, parama);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    if (b.b)
    {
      super.setTextSize(paramInt, paramFloat);
    }
    else
    {
      v localv = p;
      if (localv != null) {
        localv.z(paramInt, paramFloat);
      }
    }
  }
  
  public void setTypeface(Typeface paramTypeface, int paramInt)
  {
    Typeface localTypeface;
    if ((paramTypeface != null) && (paramInt > 0)) {
      localTypeface = A.h.a(getContext(), paramTypeface, paramInt);
    } else {
      localTypeface = null;
    }
    if (localTypeface != null) {
      paramTypeface = localTypeface;
    }
    super.setTypeface(paramTypeface, paramInt);
  }
}

/* Location:
 * Qualified Name:     l.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */