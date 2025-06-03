package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.Button;
import android.widget.TextView;
import j0.h;
import j0.j;
import v0.f;
import v0.f.b;

public final class e
  extends Button
  implements j
{
  public final d a;
  public final b0 b;
  public m c;
  
  public e(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968655);
    u0.a(this, getContext());
    paramContext = new d(this);
    a = paramContext;
    paramContext.d(paramAttributeSet, 2130968655);
    paramContext = new b0(this);
    b = paramContext;
    paramContext.f(paramAttributeSet, 2130968655);
    paramContext.b();
    getEmojiTextViewHelper().a(paramAttributeSet, 2130968655);
  }
  
  private m getEmojiTextViewHelper()
  {
    if (c == null) {
      c = new m(this);
    }
    return c;
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
      return super.getAutoSizeMaxTextSize();
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
      return super.getAutoSizeMinTextSize();
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
      return super.getAutoSizeStepGranularity();
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
      return super.getAutoSizeTextAvailableSizes();
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
      if (super.getAutoSizeTextType() == 1) {
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
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(Button.class.getName());
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    b0 localb0 = b;
    if ((localb0 != null) && (!f1.b)) {
      i.a();
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
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
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
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
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
      super.setAutoSizeTextTypeWithDefaults(paramInt);
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
  
  public void setSupportAllCaps(boolean paramBoolean)
  {
    b0 localb0 = b;
    if (localb0 != null) {
      a.setAllCaps(paramBoolean);
    }
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
}

/* Location:
 * Qualified Name:     l.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */