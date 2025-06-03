package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p2.m0;
import r5.f.e;
import s5.g;
import z4.j0;

public class TrackSelectionView
  extends LinearLayout
{
  public final CheckedTextView a;
  public final CheckedTextView b;
  public final SparseArray<f.e> c;
  public boolean d;
  public boolean e;
  public boolean f;
  
  public TrackSelectionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    setOrientation(1);
    c = new SparseArray();
    setSaveFromParentEnabled(false);
    paramAttributeSet = paramContext.getTheme().obtainStyledAttributes(new int[] { 16843534 });
    int i = paramAttributeSet.getResourceId(0, 0);
    paramAttributeSet.recycle();
    paramAttributeSet = LayoutInflater.from(paramContext);
    paramContext = new a();
    new m0(getResources());
    Object localObject = j0.d;
    localObject = (CheckedTextView)paramAttributeSet.inflate(17367055, this, false);
    a = ((CheckedTextView)localObject);
    ((View)localObject).setBackgroundResource(i);
    ((TextView)localObject).setText(2131886191);
    ((View)localObject).setEnabled(false);
    ((View)localObject).setFocusable(true);
    ((View)localObject).setOnClickListener(paramContext);
    ((CheckedTextView)localObject).setVisibility(8);
    addView((View)localObject);
    addView(paramAttributeSet.inflate(2131558433, this, false));
    paramAttributeSet = (CheckedTextView)paramAttributeSet.inflate(17367055, this, false);
    b = paramAttributeSet;
    paramAttributeSet.setBackgroundResource(i);
    paramAttributeSet.setText(2131886190);
    paramAttributeSet.setEnabled(false);
    paramAttributeSet.setFocusable(true);
    paramAttributeSet.setOnClickListener(paramContext);
    addView(paramAttributeSet);
  }
  
  public final void a()
  {
    for (int i = getChildCount() - 1; i >= 3; i--) {
      removeViewAt(i);
    }
    a.setEnabled(false);
    b.setEnabled(false);
  }
  
  public boolean getIsDisabled()
  {
    return f;
  }
  
  public List<f.e> getOverrides()
  {
    ArrayList localArrayList = new ArrayList(c.size());
    for (int i = 0; i < c.size(); i++) {
      localArrayList.add((f.e)c.valueAt(i));
    }
    return localArrayList;
  }
  
  public void setAllowAdaptiveSelections(boolean paramBoolean)
  {
    if (d != paramBoolean)
    {
      d = paramBoolean;
      a();
    }
  }
  
  public void setAllowMultipleOverrides(boolean paramBoolean)
  {
    if (e != paramBoolean)
    {
      e = paramBoolean;
      if ((!paramBoolean) && (c.size() > 1)) {
        for (int i = c.size() - 1; i > 0; i--) {
          c.remove(i);
        }
      }
      a();
    }
  }
  
  public void setShowDisableOption(boolean paramBoolean)
  {
    CheckedTextView localCheckedTextView = a;
    int i;
    if (paramBoolean) {
      i = 0;
    } else {
      i = 8;
    }
    localCheckedTextView.setVisibility(i);
  }
  
  public void setTrackNameProvider(g paramg)
  {
    paramg.getClass();
    a();
  }
  
  public final class a
    implements View.OnClickListener
  {
    public a() {}
    
    public final void onClick(View paramView)
    {
      TrackSelectionView localTrackSelectionView = TrackSelectionView.this;
      CheckedTextView localCheckedTextView = a;
      boolean bool = true;
      if (paramView == localCheckedTextView)
      {
        f = true;
        c.clear();
      }
      else
      {
        if (paramView != b) {
          break label100;
        }
        f = false;
        c.clear();
      }
      a.setChecked(f);
      paramView = b;
      if ((f) || (c.size() != 0)) {
        bool = false;
      }
      paramView.setChecked(bool);
      throw null;
      label100:
      f = false;
      paramView = paramView.getTag();
      paramView.getClass();
      paramView = (TrackSelectionView.b)paramView;
      paramView = (f.e)c.get(0);
      throw null;
    }
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ui.TrackSelectionView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */