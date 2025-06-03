package com.google.android.exoplayer2.ui;

import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import r5.f.e;

public final class TrackSelectionView$a
  implements View.OnClickListener
{
  public TrackSelectionView$a(TrackSelectionView paramTrackSelectionView) {}
  
  public final void onClick(View paramView)
  {
    TrackSelectionView localTrackSelectionView = a;
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ui.TrackSelectionView.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */