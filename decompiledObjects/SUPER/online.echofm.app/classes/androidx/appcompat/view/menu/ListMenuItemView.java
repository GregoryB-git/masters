package androidx.appcompat.view.menu;

import I.s;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import e.a;
import e.f;
import e.i;
import l.X;

public class ListMenuItemView
  extends LinearLayout
  implements h.a, AbsListView.SelectionBoundsAdjuster
{
  public boolean A;
  public Drawable B;
  public boolean C;
  public LayoutInflater D;
  public boolean E;
  public e o;
  public ImageView p;
  public RadioButton q;
  public TextView r;
  public CheckBox s;
  public TextView t;
  public ImageView u;
  public ImageView v;
  public LinearLayout w;
  public Drawable x;
  public int y;
  public Context z;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.o);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = X.s(getContext(), paramAttributeSet, i.r1, paramInt, 0);
    x = paramAttributeSet.f(i.t1);
    y = paramAttributeSet.l(i.s1, -1);
    A = paramAttributeSet.a(i.u1, false);
    z = paramContext;
    B = paramAttributeSet.f(i.v1);
    paramContext = paramContext.getTheme();
    paramInt = a.n;
    paramContext = paramContext.obtainStyledAttributes(null, new int[] { 16843049 }, paramInt, 0);
    C = paramContext.hasValue(0);
    paramAttributeSet.t();
    paramContext.recycle();
  }
  
  private LayoutInflater getInflater()
  {
    if (D == null) {
      D = LayoutInflater.from(getContext());
    }
    return D;
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView = u;
    if (localImageView != null)
    {
      int i;
      if (paramBoolean) {
        i = 0;
      } else {
        i = 8;
      }
      localImageView.setVisibility(i);
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public void adjustListItemSelectionBounds(Rect paramRect)
  {
    Object localObject = v;
    if ((localObject != null) && (((View)localObject).getVisibility() == 0))
    {
      localObject = (LinearLayout.LayoutParams)v.getLayoutParams();
      top += v.getHeight() + topMargin + bottomMargin;
    }
  }
  
  public final void b(View paramView)
  {
    c(paramView, -1);
  }
  
  public final void c(View paramView, int paramInt)
  {
    LinearLayout localLinearLayout = w;
    if (localLinearLayout != null) {
      localLinearLayout.addView(paramView, paramInt);
    } else {
      addView(paramView, paramInt);
    }
  }
  
  public void d(e parame, int paramInt)
  {
    o = parame;
    if (parame.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    }
    setVisibility(paramInt);
    setTitle(parame.h(this));
    setCheckable(parame.isCheckable());
    h(parame.z(), parame.e());
    setIcon(parame.getIcon());
    setEnabled(parame.isEnabled());
    setSubMenuArrowVisible(parame.hasSubMenu());
    setContentDescription(parame.getContentDescription());
  }
  
  public final void e()
  {
    CheckBox localCheckBox = (CheckBox)getInflater().inflate(f.f, this, false);
    s = localCheckBox;
    b(localCheckBox);
  }
  
  public final void f()
  {
    ImageView localImageView = (ImageView)getInflater().inflate(f.g, this, false);
    p = localImageView;
    c(localImageView, 0);
  }
  
  public final void g()
  {
    RadioButton localRadioButton = (RadioButton)getInflater().inflate(f.h, this, false);
    q = localRadioButton;
    b(localRadioButton);
  }
  
  public e getItemData()
  {
    return o;
  }
  
  public void h(boolean paramBoolean, char paramChar)
  {
    if ((paramBoolean) && (o.z())) {
      paramChar = '\000';
    } else {
      paramChar = '\b';
    }
    if (paramChar == 0) {
      t.setText(o.f());
    }
    if (t.getVisibility() != paramChar) {
      t.setVisibility(paramChar);
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    s.E(this, x);
    Object localObject = (TextView)findViewById(e.e.A);
    r = ((TextView)localObject);
    int i = y;
    if (i != -1) {
      ((TextView)localObject).setTextAppearance(z, i);
    }
    t = ((TextView)findViewById(e.e.v));
    localObject = (ImageView)findViewById(e.e.y);
    u = ((ImageView)localObject);
    if (localObject != null) {
      ((ImageView)localObject).setImageDrawable(B);
    }
    v = ((ImageView)findViewById(e.e.l));
    w = ((LinearLayout)findViewById(e.e.h));
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if ((p != null) && (A))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)p.getLayoutParams();
      int i = height;
      if ((i > 0) && (width <= 0)) {
        width = i;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (q == null) && (s == null)) {
      return;
    }
    Object localObject1;
    Object localObject2;
    if (o.l())
    {
      if (q == null) {
        g();
      }
      localObject1 = q;
      localObject2 = s;
    }
    else
    {
      if (s == null) {
        e();
      }
      localObject1 = s;
      localObject2 = q;
    }
    if (paramBoolean)
    {
      ((CompoundButton)localObject1).setChecked(o.isChecked());
      if (((View)localObject1).getVisibility() != 0) {
        ((View)localObject1).setVisibility(0);
      }
      if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8)) {
        ((View)localObject2).setVisibility(8);
      }
    }
    else
    {
      localObject1 = s;
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(8);
      }
      localObject1 = q;
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(8);
      }
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    Object localObject;
    if (o.l())
    {
      if (q == null) {
        g();
      }
      localObject = q;
    }
    else
    {
      if (s == null) {
        e();
      }
      localObject = s;
    }
    ((CompoundButton)localObject).setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    E = paramBoolean;
    A = paramBoolean;
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    ImageView localImageView = v;
    if (localImageView != null)
    {
      int i;
      if ((!C) && (paramBoolean)) {
        i = 0;
      } else {
        i = 8;
      }
      localImageView.setVisibility(i);
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    int i;
    if ((!o.y()) && (!E)) {
      i = 0;
    } else {
      i = 1;
    }
    if ((i == 0) && (!A)) {
      return;
    }
    ImageView localImageView = p;
    if ((localImageView == null) && (paramDrawable == null) && (!A)) {
      return;
    }
    if (localImageView == null) {
      f();
    }
    if ((paramDrawable == null) && (!A))
    {
      p.setVisibility(8);
    }
    else
    {
      localImageView = p;
      if (i == 0) {
        paramDrawable = null;
      }
      localImageView.setImageDrawable(paramDrawable);
      if (p.getVisibility() != 0) {
        p.setVisibility(0);
      }
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    int i;
    if (paramCharSequence != null)
    {
      r.setText(paramCharSequence);
      if (r.getVisibility() != 0)
      {
        paramCharSequence = r;
        i = 0;
      }
    }
    else
    {
      for (;;)
      {
        paramCharSequence.setVisibility(i);
        break;
        int j = r.getVisibility();
        i = 8;
        if (j == 8) {
          break;
        }
        paramCharSequence = r;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ListMenuItemView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */