package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView.a;
import e.i;
import k.c;
import l.E;
import l.Z;
import l.w;

public class ActionMenuItemView
  extends w
  implements h.a, View.OnClickListener, ActionMenuView.a
{
  public int A;
  public int B;
  public int C;
  public e s;
  public CharSequence t;
  public Drawable u;
  public d.b v;
  public E w;
  public b x;
  public boolean y;
  public boolean z;
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    y = g();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.t, paramInt, 0);
    A = paramContext.getDimensionPixelSize(i.u, 0);
    paramContext.recycle();
    C = ((int)(getDisplayMetricsdensity * 32.0F + 0.5F));
    setOnClickListener(this);
    B = -1;
    setSaveEnabled(false);
  }
  
  public boolean a()
  {
    return true;
  }
  
  public boolean b()
  {
    return f();
  }
  
  public boolean c()
  {
    boolean bool;
    if ((f()) && (s.getIcon() == null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void d(e parame, int paramInt)
  {
    s = parame;
    setIcon(parame.getIcon());
    setTitle(parame.h(this));
    setId(parame.getItemId());
    if (parame.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    }
    setVisibility(paramInt);
    setEnabled(parame.isEnabled());
    if ((parame.hasSubMenu()) && (w == null)) {
      w = new a();
    }
  }
  
  public boolean f()
  {
    return TextUtils.isEmpty(getText()) ^ true;
  }
  
  public final boolean g()
  {
    Configuration localConfiguration = getContext().getResources().getConfiguration();
    int i = screenWidthDp;
    int j = screenHeightDp;
    boolean bool;
    if ((i < 480) && ((i < 640) || (j < 480)) && (orientation != 2)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public e getItemData()
  {
    return s;
  }
  
  public final void h()
  {
    boolean bool = TextUtils.isEmpty(t);
    int i = 1;
    int j = i;
    if (u != null)
    {
      if (s.A())
      {
        j = i;
        if (y) {
          break label52;
        }
        if (z)
        {
          j = i;
          break label52;
        }
      }
      j = 0;
    }
    label52:
    j = (bool ^ true) & j;
    Object localObject1 = null;
    if (j != 0) {
      localObject2 = t;
    } else {
      localObject2 = null;
    }
    setText((CharSequence)localObject2);
    CharSequence localCharSequence = s.getContentDescription();
    Object localObject2 = localCharSequence;
    if (TextUtils.isEmpty(localCharSequence)) {
      if (j != 0) {
        localObject2 = null;
      } else {
        localObject2 = s.getTitle();
      }
    }
    setContentDescription((CharSequence)localObject2);
    localObject2 = s.getTooltipText();
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      if (j != 0) {
        localObject2 = localObject1;
      } else {
        localObject2 = s.getTitle();
      }
      Z.a(this, (CharSequence)localObject2);
    }
    else
    {
      Z.a(this, (CharSequence)localObject2);
    }
  }
  
  public void onClick(View paramView)
  {
    paramView = v;
    if (paramView != null) {
      paramView.a(s);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    y = g();
    h();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = f();
    if (bool)
    {
      i = B;
      if (i >= 0) {
        super.setPadding(i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = getMeasuredWidth();
    if (i == Integer.MIN_VALUE) {
      paramInt1 = Math.min(paramInt1, A);
    } else {
      paramInt1 = A;
    }
    if ((i != 1073741824) && (A > 0) && (j < paramInt1)) {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
    }
    if ((!bool) && (u != null)) {
      super.setPadding((getMeasuredWidth() - u.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    super.onRestoreInstanceState(null);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (s.hasSubMenu())
    {
      E localE = w;
      if ((localE != null) && (localE.onTouch(this, paramMotionEvent))) {
        return true;
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean)
  {
    if (z != paramBoolean)
    {
      z = paramBoolean;
      e locale = s;
      if (locale != null) {
        locale.a();
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    u = paramDrawable;
    if (paramDrawable != null)
    {
      int i = paramDrawable.getIntrinsicWidth();
      int j = paramDrawable.getIntrinsicHeight();
      int k = C;
      int m = i;
      int n = j;
      float f;
      if (i > k)
      {
        f = k / i;
        n = (int)(j * f);
        m = k;
      }
      if (n > k)
      {
        f = k / n;
        m = (int)(m * f);
      }
      else
      {
        k = n;
      }
      paramDrawable.setBounds(0, 0, m, k);
    }
    setCompoundDrawables(paramDrawable, null, null, null);
    h();
  }
  
  public void setItemInvoker(d.b paramb)
  {
    v = paramb;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    B = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(b paramb)
  {
    x = paramb;
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    t = paramCharSequence;
    h();
  }
  
  public class a
    extends E
  {
    public a()
    {
      super();
    }
    
    public c b()
    {
      ActionMenuItemView.b localb = x;
      if (localb != null) {
        return localb.a();
      }
      return null;
    }
    
    public boolean c()
    {
      ActionMenuItemView localActionMenuItemView = ActionMenuItemView.this;
      Object localObject = v;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (localObject != null)
      {
        bool2 = bool1;
        if (((d.b)localObject).a(s))
        {
          localObject = b();
          bool2 = bool1;
          if (localObject != null)
          {
            bool2 = bool1;
            if (((c)localObject).i()) {
              bool2 = true;
            }
          }
        }
      }
      return bool2;
    }
  }
  
  public static abstract class b
  {
    public abstract c a();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ActionMenuItemView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */