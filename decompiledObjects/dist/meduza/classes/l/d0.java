package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c0.c;
import c0.c.a;
import j0.h;
import j0.h.a;
import j0.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import v0.f;
import v0.f.b;
import x.e;
import x.l;
import x6.b;

public class d0
  extends TextView
  implements j
{
  public final d a;
  public final b0 b;
  public final a0 c;
  public m d;
  public boolean e = false;
  public b f = null;
  public Future<c> o;
  
  public d0() {}
  
  public d0(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public d0(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    u0.a(this, getContext());
    paramContext = new d(this);
    a = paramContext;
    paramContext.d(paramAttributeSet, paramInt);
    paramContext = new b0(this);
    b = paramContext;
    paramContext.f(paramAttributeSet, paramInt);
    paramContext.b();
    c = new a0(this);
    getEmojiTextViewHelper().a(paramAttributeSet, paramInt);
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
    Object localObject = a;
    if (localObject != null) {
      ((d)localObject).a();
    }
    localObject = b;
    if (localObject != null) {
      ((b0)localObject).b();
    }
  }
  
  public int getAutoSizeMaxTextSize()
  {
    if (f1.b) {
      return getSuperCallera.getAutoSizeMaxTextSize();
    }
    b0 localb0 = b;
    if (localb0 != null) {
      return Math.round(i.e);
    }
    return -1;
  }
  
  public int getAutoSizeMinTextSize()
  {
    if (f1.b) {
      return getSuperCallera.getAutoSizeMinTextSize();
    }
    b0 localb0 = b;
    if (localb0 != null) {
      return Math.round(i.d);
    }
    return -1;
  }
  
  public int getAutoSizeStepGranularity()
  {
    if (f1.b) {
      return getSuperCallera.getAutoSizeStepGranularity();
    }
    b0 localb0 = b;
    if (localb0 != null) {
      return Math.round(i.c);
    }
    return -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes()
  {
    if (f1.b) {
      return f(getSuperCallera);
    }
    b0 localb0 = b;
    if (localb0 != null) {
      return i.f;
    }
    return new int[0];
  }
  
  public int getAutoSizeTextType()
  {
    boolean bool = f1.b;
    int i = 0;
    if (bool)
    {
      if (g(getSuperCallera) == 1) {
        i = 1;
      }
      return i;
    }
    b0 localb0 = b;
    if (localb0 != null) {
      return i.a;
    }
    return 0;
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return h.e(super.getCustomSelectionActionModeCallback());
  }
  
  public int getFirstBaselineToTopHeight()
  {
    return getPaddingTop() - getPaintgetFontMetricsInttop;
  }
  
  public int getLastBaselineToBottomHeight()
  {
    return getPaddingBottom() + getPaintgetFontMetricsIntbottom;
  }
  
  public a getSuperCaller()
  {
    if (f == null)
    {
      int i = Build.VERSION.SDK_INT;
      Object localObject;
      if (i >= 28)
      {
        localObject = new c();
      }
      else
      {
        if (i < 26) {
          break label49;
        }
        localObject = new b();
      }
      f = ((b)localObject);
    }
    label49:
    return f;
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
  
  public CharSequence getText()
  {
    Future localFuture = o;
    if (localFuture != null) {}
    try
    {
      o = null;
      h.d(this, (c)localFuture.get());
      return super.getText();
    }
    catch (InterruptedException|ExecutionException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public TextClassifier getTextClassifier()
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      a0 locala0 = c;
      if (locala0 != null)
      {
        TextClassifier localTextClassifier1 = b;
        TextClassifier localTextClassifier2 = localTextClassifier1;
        if (localTextClassifier1 == null) {
          localTextClassifier2 = a0.a.a(a);
        }
        return localTextClassifier2;
      }
    }
    return getSuperCallera.getTextClassifier();
  }
  
  public c.a getTextMetricsParamsCompat()
  {
    return h.a(this);
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    b.getClass();
    b0.h(this, localInputConnection, paramEditorInfo);
    b.a0.y(this, paramEditorInfo, localInputConnection);
    return localInputConnection;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    b0 localb0 = b;
    if ((localb0 != null) && (!f1.b)) {
      i.a();
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Future localFuture = o;
    if (localFuture != null) {}
    try
    {
      o = null;
      h.d(this, (c)localFuture.get());
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    catch (InterruptedException|ExecutionException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    paramCharSequence = b;
    paramInt2 = 1;
    if ((paramCharSequence != null) && (!f1.b))
    {
      paramCharSequence = i;
      if ((paramCharSequence.i()) && (a != 0)) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      if (paramInt1 != 0)
      {
        paramInt1 = paramInt2;
        break label63;
      }
    }
    paramInt1 = 0;
    label63:
    if (paramInt1 != 0) {
      b.i.a();
    }
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().b(paramBoolean);
  }
  
  public final void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (f1.b)
    {
      h(getSuperCallera, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    else
    {
      b0 localb0 = b;
      if (localb0 != null) {
        localb0.i(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
  
  public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    if (f1.b)
    {
      i(getSuperCallera, paramArrayOfInt, paramInt);
    }
    else
    {
      b0 localb0 = b;
      if (localb0 != null) {
        localb0.j(paramArrayOfInt, paramInt);
      }
    }
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    if (f1.b)
    {
      j(getSuperCallera, paramInt);
    }
    else
    {
      b0 localb0 = b;
      if (localb0 != null) {
        localb0.k(paramInt);
      }
    }
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
  
  public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Context localContext = getContext();
    Drawable localDrawable1 = null;
    if (paramInt1 != 0) {
      localObject = b.X(localContext, paramInt1);
    } else {
      localObject = null;
    }
    Drawable localDrawable2;
    if (paramInt2 != 0) {
      localDrawable2 = b.X(localContext, paramInt2);
    } else {
      localDrawable2 = null;
    }
    Drawable localDrawable3;
    if (paramInt3 != 0) {
      localDrawable3 = b.X(localContext, paramInt3);
    } else {
      localDrawable3 = null;
    }
    if (paramInt4 != 0) {
      localDrawable1 = b.X(localContext, paramInt4);
    }
    setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject, localDrawable2, localDrawable3, localDrawable1);
    Object localObject = b;
    if (localObject != null) {
      ((b0)localObject).b();
    }
  }
  
  public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = b;
    if (paramDrawable1 != null) {
      paramDrawable1.b();
    }
  }
  
  public final void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Context localContext = getContext();
    Drawable localDrawable1 = null;
    if (paramInt1 != 0) {
      localObject = b.X(localContext, paramInt1);
    } else {
      localObject = null;
    }
    Drawable localDrawable2;
    if (paramInt2 != 0) {
      localDrawable2 = b.X(localContext, paramInt2);
    } else {
      localDrawable2 = null;
    }
    Drawable localDrawable3;
    if (paramInt3 != 0) {
      localDrawable3 = b.X(localContext, paramInt3);
    } else {
      localDrawable3 = null;
    }
    if (paramInt4 != 0) {
      localDrawable1 = b.X(localContext, paramInt4);
    }
    setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject, localDrawable2, localDrawable3, localDrawable1);
    Object localObject = b;
    if (localObject != null) {
      ((b0)localObject).b();
    }
  }
  
  public final void setCompoundDrawablesWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = b;
    if (paramDrawable1 != null) {
      paramDrawable1.b();
    }
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(h.f(paramCallback, this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().c(paramBoolean);
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    super.setFilters(getEmojiTextViewHelperb.a.a(paramArrayOfInputFilter));
  }
  
  public void setFirstBaselineToTopHeight(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      getSuperCaller().b(paramInt);
    } else {
      h.b(this, paramInt);
    }
  }
  
  public void setLastBaselineToBottomHeight(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      getSuperCaller().a(paramInt);
    } else {
      h.c(this, paramInt);
    }
  }
  
  public void setLineHeight(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = getPaint().getFontMetricsInt(null);
      if (paramInt != i) {
        setLineSpacing(paramInt - i, 1.0F);
      }
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public void setPrecomputedText(c paramc)
  {
    h.d(this, paramc);
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
  
  public void setTextClassifier(TextClassifier paramTextClassifier)
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      a0 locala0 = c;
      if (locala0 != null)
      {
        b = paramTextClassifier;
        return;
      }
    }
    k(getSuperCallera, paramTextClassifier);
  }
  
  public void setTextFuture(Future<c> paramFuture)
  {
    o = paramFuture;
    if (paramFuture != null) {
      requestLayout();
    }
  }
  
  public void setTextMetricsParamsCompat(c.a parama)
  {
    TextDirectionHeuristic localTextDirectionHeuristic1 = b;
    TextDirectionHeuristic localTextDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
    int i = 1;
    if ((localTextDirectionHeuristic1 != localTextDirectionHeuristic2) && (localTextDirectionHeuristic1 != TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
      if (localTextDirectionHeuristic1 == TextDirectionHeuristics.ANYRTL_LTR) {
        i = 2;
      } else if (localTextDirectionHeuristic1 == TextDirectionHeuristics.LTR) {
        i = 3;
      } else if (localTextDirectionHeuristic1 == TextDirectionHeuristics.RTL) {
        i = 4;
      } else if (localTextDirectionHeuristic1 == TextDirectionHeuristics.LOCALE) {
        i = 5;
      } else if (localTextDirectionHeuristic1 == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
        i = 6;
      } else if (localTextDirectionHeuristic1 == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
        i = 7;
      }
    }
    setTextDirection(i);
    getPaint().set(a);
    h.a.e(this, c);
    h.a.h(this, d);
  }
  
  public final void setTextSize(int paramInt, float paramFloat)
  {
    boolean bool = f1.b;
    if (bool)
    {
      super.setTextSize(paramInt, paramFloat);
    }
    else
    {
      b0 localb0 = b;
      if ((localb0 != null) && (!bool))
      {
        e0 locale0 = i;
        int i;
        if ((locale0.i()) && (a != 0)) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0) {
          i.f(paramFloat, paramInt);
        }
      }
    }
  }
  
  public final void setTypeface(Typeface paramTypeface, int paramInt)
  {
    if (e) {
      return;
    }
    l locall = null;
    Object localObject = locall;
    if (paramTypeface != null)
    {
      localObject = locall;
      if (paramInt > 0)
      {
        localObject = getContext();
        locall = e.a;
        if (localObject != null) {
          localObject = Typeface.create(paramTypeface, paramInt);
        } else {
          throw new IllegalArgumentException("Context cannot be null");
        }
      }
    }
    e = true;
    if (localObject != null) {
      paramTypeface = (Typeface)localObject;
    }
    try
    {
      super.setTypeface(paramTypeface, paramInt);
      return;
    }
    finally
    {
      e = false;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
    
    public abstract void b(int paramInt);
  }
  
  public class b
    implements d0.a
  {
    public b() {}
    
    public void a(int paramInt) {}
    
    public void b(int paramInt) {}
  }
  
  public final class c
    extends d0.b
  {
    public c()
    {
      super();
    }
    
    public final void a(int paramInt)
    {
      d0.e(d0.this, paramInt);
    }
    
    public final void b(int paramInt)
    {
      d0.d(d0.this, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     l.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */