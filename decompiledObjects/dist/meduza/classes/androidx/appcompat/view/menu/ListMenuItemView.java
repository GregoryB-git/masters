package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
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
import b.a0;
import e0.d0;
import l.z0;

public class ListMenuItemView
  extends LinearLayout
  implements k.a, AbsListView.SelectionBoundsAdjuster
{
  public h a;
  public ImageView b;
  public RadioButton c;
  public TextView d;
  public CheckBox e;
  public TextView f;
  public ImageView o;
  public ImageView p;
  public LinearLayout q;
  public Drawable r;
  public int s;
  public Context t;
  public boolean u;
  public Drawable v;
  public boolean w;
  public LayoutInflater x;
  public boolean y;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = z0.m(getContext(), paramAttributeSet, a0.E, 2130968773);
    r = paramAttributeSet.e(5);
    s = paramAttributeSet.i(1, -1);
    u = paramAttributeSet.a(7, false);
    t = paramContext;
    v = paramAttributeSet.e(8);
    paramContext = paramContext.getTheme().obtainStyledAttributes(null, new int[] { 16843049 }, 2130968713, 0);
    w = paramContext.hasValue(0);
    paramAttributeSet.n();
    paramContext.recycle();
  }
  
  private LayoutInflater getInflater()
  {
    if (x == null) {
      x = LayoutInflater.from(getContext());
    }
    return x;
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView = o;
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
  
  public final void adjustListItemSelectionBounds(Rect paramRect)
  {
    Object localObject = p;
    if ((localObject != null) && (((View)localObject).getVisibility() == 0))
    {
      localObject = (LinearLayout.LayoutParams)p.getLayoutParams();
      int i = top;
      top = (p.getHeight() + topMargin + bottomMargin + i);
    }
  }
  
  public final void c(h paramh)
  {
    a = paramh;
    boolean bool = paramh.isVisible();
    int i = 0;
    if (bool) {
      j = 0;
    } else {
      j = 8;
    }
    setVisibility(j);
    setTitle(e);
    setCheckable(paramh.isCheckable());
    if (n.o())
    {
      if (n.n()) {
        j = j;
      } else {
        j = h;
      }
      if (j != 0)
      {
        j = 1;
        break label97;
      }
    }
    int j = 0;
    label97:
    n.n();
    Object localObject;
    if (j != 0)
    {
      localObject = a;
      if (n.o())
      {
        if (n.n()) {
          j = j;
        } else {
          j = h;
        }
        if (j != 0)
        {
          j = 1;
          break label169;
        }
      }
      j = 0;
      label169:
      if (j != 0) {}
    }
    else
    {
      i = 8;
    }
    if (i == 0)
    {
      TextView localTextView = f;
      localObject = a;
      int k;
      if (n.n())
      {
        j = j;
        k = j;
      }
      else
      {
        j = h;
        k = j;
      }
      if (k == 0)
      {
        localObject = "";
      }
      else
      {
        Resources localResources = n.a.getResources();
        StringBuilder localStringBuilder = new StringBuilder();
        if (ViewConfiguration.get(n.a).hasPermanentMenuKey()) {
          localStringBuilder.append(localResources.getString(2131886097));
        }
        if (n.n()) {
          j = k;
        } else {
          j = i;
        }
        h.c(localStringBuilder, j, 65536, localResources.getString(2131886093));
        h.c(localStringBuilder, j, 4096, localResources.getString(2131886089));
        h.c(localStringBuilder, j, 2, localResources.getString(2131886088));
        h.c(localStringBuilder, j, 1, localResources.getString(2131886094));
        h.c(localStringBuilder, j, 4, localResources.getString(2131886096));
        h.c(localStringBuilder, j, 8, localResources.getString(2131886092));
        if (k != 8)
        {
          if (k != 10)
          {
            if (k != 32)
            {
              localStringBuilder.append(k);
              break label481;
            }
            j = 2131886095;
          }
          else
          {
            j = 2131886091;
          }
        }
        else {
          j = 2131886090;
        }
        localStringBuilder.append(localResources.getString(j));
        label481:
        localObject = localStringBuilder.toString();
      }
      localTextView.setText((CharSequence)localObject);
    }
    if (f.getVisibility() != i) {
      f.setVisibility(i);
    }
    setIcon(paramh.getIcon());
    setEnabled(paramh.isEnabled());
    setSubMenuArrowVisible(paramh.hasSubMenu());
    setContentDescription(q);
  }
  
  public h getItemData()
  {
    return a;
  }
  
  public final void onFinishInflate()
  {
    super.onFinishInflate();
    Drawable localDrawable = r;
    Object localObject = d0.a;
    setBackground(localDrawable);
    localObject = (TextView)findViewById(2131362051);
    d = ((TextView)localObject);
    int i = s;
    if (i != -1) {
      ((TextView)localObject).setTextAppearance(t, i);
    }
    f = ((TextView)findViewById(2131362015));
    localObject = (ImageView)findViewById(2131362028);
    o = ((ImageView)localObject);
    if (localObject != null) {
      ((ImageView)localObject).setImageDrawable(v);
    }
    p = ((ImageView)findViewById(2131361956));
    q = ((LinearLayout)findViewById(2131361886));
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    if ((b != null) && (u))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)b.getLayoutParams();
      int i = height;
      if ((i > 0) && (width <= 0)) {
        width = i;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (c == null) && (e == null)) {
      return;
    }
    int i;
    if ((a.x & 0x4) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject1;
    Object localObject2;
    if (i != 0)
    {
      if (c == null)
      {
        localObject1 = (RadioButton)getInflater().inflate(2131558417, this, false);
        c = ((RadioButton)localObject1);
        localObject2 = q;
        if (localObject2 != null) {
          ((ViewGroup)localObject2).addView((View)localObject1, -1);
        } else {
          addView((View)localObject1, -1);
        }
      }
      localObject1 = c;
      localObject2 = e;
    }
    else
    {
      if (e == null)
      {
        localObject2 = (CheckBox)getInflater().inflate(2131558414, this, false);
        e = ((CheckBox)localObject2);
        localObject1 = q;
        if (localObject1 != null) {
          ((ViewGroup)localObject1).addView((View)localObject2, -1);
        } else {
          addView((View)localObject2, -1);
        }
      }
      localObject1 = e;
      localObject2 = c;
    }
    if (paramBoolean)
    {
      ((CompoundButton)localObject1).setChecked(a.isChecked());
      if (((View)localObject1).getVisibility() != 0) {
        ((View)localObject1).setVisibility(0);
      }
      if ((localObject2 != null) && (((View)localObject2).getVisibility() != 8)) {
        ((View)localObject2).setVisibility(8);
      }
    }
    else
    {
      localObject2 = e;
      if (localObject2 != null) {
        ((View)localObject2).setVisibility(8);
      }
      localObject2 = c;
      if (localObject2 != null) {
        ((View)localObject2).setVisibility(8);
      }
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    int i;
    if ((a.x & 0x4) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject1;
    Object localObject2;
    if (i != 0)
    {
      if (c == null)
      {
        localObject1 = (RadioButton)getInflater().inflate(2131558417, this, false);
        c = ((RadioButton)localObject1);
        localObject2 = q;
        if (localObject2 != null) {
          ((ViewGroup)localObject2).addView((View)localObject1, -1);
        } else {
          addView((View)localObject1, -1);
        }
      }
      localObject2 = c;
    }
    else
    {
      if (e == null)
      {
        localObject2 = (CheckBox)getInflater().inflate(2131558414, this, false);
        e = ((CheckBox)localObject2);
        localObject1 = q;
        if (localObject1 != null) {
          ((ViewGroup)localObject1).addView((View)localObject2, -1);
        } else {
          addView((View)localObject2, -1);
        }
      }
      localObject2 = e;
    }
    ((CompoundButton)localObject2).setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    y = paramBoolean;
    u = paramBoolean;
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    ImageView localImageView = p;
    if (localImageView != null)
    {
      int i;
      if ((!w) && (paramBoolean)) {
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
    if ((!a.n.s) && (!y)) {
      i = 0;
    } else {
      i = 1;
    }
    if ((i == 0) && (!u)) {
      return;
    }
    Object localObject = b;
    if ((localObject == null) && (paramDrawable == null) && (!u)) {
      return;
    }
    if (localObject == null)
    {
      ImageView localImageView = (ImageView)getInflater().inflate(2131558415, this, false);
      b = localImageView;
      localObject = q;
      if (localObject != null) {
        ((ViewGroup)localObject).addView(localImageView, 0);
      } else {
        addView(localImageView, 0);
      }
    }
    if ((paramDrawable == null) && (!u))
    {
      b.setVisibility(8);
    }
    else
    {
      localObject = b;
      if (i == 0) {
        paramDrawable = null;
      }
      ((ImageView)localObject).setImageDrawable(paramDrawable);
      if (b.getVisibility() != 0) {
        b.setVisibility(0);
      }
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    int i;
    if (paramCharSequence != null)
    {
      d.setText(paramCharSequence);
      if (d.getVisibility() == 0) {
        return;
      }
      paramCharSequence = d;
      i = 0;
    }
    else
    {
      int j = d.getVisibility();
      i = 8;
      if (j == 8) {
        return;
      }
      paramCharSequence = d;
    }
    paramCharSequence.setVisibility(i);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ListMenuItemView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */