package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import b.a0;
import e0.d0;
import e0.o0;
import e0.p0;

public abstract class a
  extends ViewGroup
{
  public final a a = new a();
  public final Context b;
  public ActionMenuView c;
  public androidx.appcompat.widget.a d;
  public int e;
  public o0 f;
  public boolean o;
  public boolean p;
  
  public a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(2130968578, paramAttributeSet, true)) && (resourceId != 0)) {
      b = new ContextThemeWrapper(paramContext, resourceId);
    } else {
      b = paramContext;
    }
  }
  
  public static int c(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, Integer.MIN_VALUE), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() - 0);
  }
  
  public static int d(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 = (paramInt3 - j) / 2 + paramInt2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    } else {
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    }
    paramInt1 = i;
    if (paramBoolean) {
      paramInt1 = -i;
    }
    return paramInt1;
  }
  
  public final o0 e(int paramInt, long paramLong)
  {
    Object localObject1 = f;
    if (localObject1 != null) {
      ((o0)localObject1).b();
    }
    if (paramInt == 0)
    {
      if (getVisibility() != 0) {
        setAlpha(0.0F);
      }
      localObject1 = d0.a(this);
      ((o0)localObject1).a(1.0F);
      ((o0)localObject1).c(paramLong);
      localObject2 = a;
      c.f = ((o0)localObject1);
      b = paramInt;
      ((o0)localObject1).d((p0)localObject2);
      return (o0)localObject1;
    }
    Object localObject2 = d0.a(this);
    ((o0)localObject2).a(0.0F);
    ((o0)localObject2).c(paramLong);
    localObject1 = a;
    c.f = ((o0)localObject2);
    b = paramInt;
    ((o0)localObject2).d((p0)localObject1);
    return (o0)localObject2;
  }
  
  public int getAnimatedVisibility()
  {
    if (f != null) {
      return a.b;
    }
    return getVisibility();
  }
  
  public int getContentHeight()
  {
    return e;
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = getContext().obtainStyledAttributes(null, a0.f, 2130968581, 0);
    setContentHeight(paramConfiguration.getLayoutDimension(13, 0));
    paramConfiguration.recycle();
    androidx.appcompat.widget.a locala = d;
    if (locala != null)
    {
      paramConfiguration = b.getResources().getConfiguration();
      int i = screenWidthDp;
      int j = screenHeightDp;
      if ((smallestScreenWidthDp <= 600) && (i <= 600) && ((i <= 960) || (j <= 720)) && ((i <= 720) || (j <= 960)))
      {
        if ((i < 500) && ((i <= 640) || (j <= 480)) && ((i <= 480) || (j <= 640)))
        {
          if (i >= 360) {
            i = 3;
          } else {
            i = 2;
          }
        }
        else {
          i = 4;
        }
      }
      else {
        i = 5;
      }
      x = i;
      paramConfiguration = c;
      if (paramConfiguration != null) {
        paramConfiguration.p(true);
      }
    }
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9) {
      p = false;
    }
    if (!p)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        p = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      p = false;
    }
    return true;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      o = false;
    }
    if (!o)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        o = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      o = false;
    }
    return true;
  }
  
  public void setContentHeight(int paramInt)
  {
    e = paramInt;
    requestLayout();
  }
  
  public void setVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
    {
      o0 localo0 = f;
      if (localo0 != null) {
        localo0.b();
      }
      super.setVisibility(paramInt);
    }
  }
  
  public final class a
    implements p0
  {
    public boolean a = false;
    public int b;
    
    public a() {}
    
    public final void a()
    {
      a = true;
    }
    
    public final void b()
    {
      a.a(a.this);
      a = false;
    }
    
    public final void c()
    {
      if (a) {
        return;
      }
      a locala = a.this;
      f = null;
      a.b(locala, b);
    }
  }
}

/* Location:
 * Qualified Name:     l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */