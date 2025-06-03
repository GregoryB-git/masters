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
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView.a;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.a.b;
import b.a0;
import l.b1;
import l.d0;
import l.l0;

public class ActionMenuItemView
  extends d0
  implements k.a, View.OnClickListener, ActionMenuView.a
{
  public h p;
  public CharSequence q;
  public Drawable r;
  public f.b s;
  public a t;
  public b u;
  public boolean v;
  public boolean w;
  public int x;
  public int y;
  public int z;
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    Resources localResources = paramContext.getResources();
    v = m();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a0.p, 0, 0);
    x = paramContext.getDimensionPixelSize(0, 0);
    paramContext.recycle();
    z = ((int)(getDisplayMetricsdensity * 32.0F + 0.5F));
    setOnClickListener(this);
    y = -1;
    setSaveEnabled(false);
  }
  
  public final boolean a()
  {
    return l();
  }
  
  public final boolean b()
  {
    boolean bool;
    if ((l()) && (p.getIcon() == null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void c(h paramh)
  {
    p = paramh;
    setIcon(paramh.getIcon());
    setTitle(paramh.getTitleCondensed());
    setId(a);
    int i;
    if (paramh.isVisible()) {
      i = 0;
    } else {
      i = 8;
    }
    setVisibility(i);
    setEnabled(paramh.isEnabled());
    if ((paramh.hasSubMenu()) && (t == null)) {
      t = new a();
    }
  }
  
  public CharSequence getAccessibilityClassName()
  {
    return Button.class.getName();
  }
  
  public h getItemData()
  {
    return p;
  }
  
  public final boolean l()
  {
    return TextUtils.isEmpty(getText()) ^ true;
  }
  
  public final boolean m()
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
  
  public final void n()
  {
    boolean bool = TextUtils.isEmpty(q);
    int i = 1;
    int j = i;
    if (r != null)
    {
      if ((p.y & 0x4) == 4) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        j = i;
        if (v) {
          break label66;
        }
        if (w)
        {
          j = i;
          break label66;
        }
      }
      j = 0;
    }
    label66:
    j = (bool ^ true) & j;
    Object localObject1 = null;
    if (j != 0) {
      localObject2 = q;
    } else {
      localObject2 = null;
    }
    setText((CharSequence)localObject2);
    CharSequence localCharSequence = p.q;
    Object localObject2 = localCharSequence;
    if (TextUtils.isEmpty(localCharSequence)) {
      if (j != 0) {
        localObject2 = null;
      } else {
        localObject2 = p.e;
      }
    }
    setContentDescription((CharSequence)localObject2);
    localObject2 = p.r;
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      if (j != 0) {
        localObject2 = localObject1;
      } else {
        localObject2 = p.e;
      }
      b1.a(this, (CharSequence)localObject2);
    }
    else
    {
      b1.a(this, (CharSequence)localObject2);
    }
  }
  
  public final void onClick(View paramView)
  {
    paramView = s;
    if (paramView != null) {
      paramView.a(p);
    }
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    v = m();
    n();
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = l();
    if (bool)
    {
      i = y;
      if (i >= 0) {
        super.setPadding(i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = getMeasuredWidth();
    if (i == Integer.MIN_VALUE) {
      paramInt1 = Math.min(paramInt1, x);
    } else {
      paramInt1 = x;
    }
    if ((i != 1073741824) && (x > 0) && (j < paramInt1)) {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
    }
    if ((!bool) && (r != null)) {
      super.setPadding((getMeasuredWidth() - r.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    super.onRestoreInstanceState(null);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (p.hasSubMenu())
    {
      a locala = t;
      if ((locala != null) && (locala.onTouch(this, paramMotionEvent))) {
        return true;
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean)
  {
    if (w != paramBoolean)
    {
      w = paramBoolean;
      Object localObject = p;
      if (localObject != null)
      {
        localObject = n;
        k = true;
        ((f)localObject).p(true);
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    r = paramDrawable;
    if (paramDrawable != null)
    {
      int i = paramDrawable.getIntrinsicWidth();
      int j = paramDrawable.getIntrinsicHeight();
      int k = z;
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
    n();
  }
  
  public void setItemInvoker(f.b paramb)
  {
    s = paramb;
  }
  
  public final void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    y = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(b paramb)
  {
    u = paramb;
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    q = paramCharSequence;
    n();
  }
  
  public final class a
    extends l0
  {
    public a()
    {
      super();
    }
    
    public final k.f b()
    {
      Object localObject1 = u;
      Object localObject2 = null;
      Object localObject3 = localObject2;
      if (localObject1 != null)
      {
        localObject1 = a.B;
        localObject3 = localObject2;
        if (localObject1 != null) {
          localObject3 = ((i)localObject1).a();
        }
      }
      return (k.f)localObject3;
    }
    
    public final boolean c()
    {
      ActionMenuItemView localActionMenuItemView = ActionMenuItemView.this;
      Object localObject = s;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (localObject != null)
      {
        bool2 = bool1;
        if (((f.b)localObject).a(p))
        {
          localObject = b();
          bool2 = bool1;
          if (localObject != null)
          {
            bool2 = bool1;
            if (((k.f)localObject).a()) {
              bool2 = true;
            }
          }
        }
      }
      return bool2;
    }
  }
  
  public static abstract class b {}
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ActionMenuItemView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */