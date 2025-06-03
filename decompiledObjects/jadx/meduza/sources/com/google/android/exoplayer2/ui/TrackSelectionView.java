package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import p2.m0;
import r5.f;
import s5.g;
import z4.j0;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final CheckedTextView f2714a;

    /* renamed from: b, reason: collision with root package name */
    public final CheckedTextView f2715b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray<f.e> f2716c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2717d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2718e;
    public boolean f;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            if (view == trackSelectionView.f2714a) {
                trackSelectionView.f = true;
                trackSelectionView.f2716c.clear();
            } else {
                if (view != trackSelectionView.f2715b) {
                    trackSelectionView.f = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    trackSelectionView.f2716c.get(0);
                    throw null;
                }
                trackSelectionView.f = false;
                trackSelectionView.f2716c.clear();
            }
            trackSelectionView.f2714a.setChecked(trackSelectionView.f);
            trackSelectionView.f2715b.setChecked(!trackSelectionView.f && trackSelectionView.f2716c.size() == 0);
            throw null;
        }
    }

    public static final class b {
        public b() {
            throw null;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        this.f2716c = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        a aVar = new a();
        new m0(getResources());
        j0 j0Var = j0.f17689d;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f2714a = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(io.meduza.meduza.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(io.meduza.meduza.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f2715b = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(io.meduza.meduza.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }

    public final void a() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 3) {
                this.f2714a.setEnabled(false);
                this.f2715b.setEnabled(false);
                return;
            }
            removeViewAt(childCount);
        }
    }

    public boolean getIsDisabled() {
        return this.f;
    }

    public List<f.e> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f2716c.size());
        for (int i10 = 0; i10 < this.f2716c.size(); i10++) {
            arrayList.add(this.f2716c.valueAt(i10));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f2717d != z10) {
            this.f2717d = z10;
            a();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f2718e != z10) {
            this.f2718e = z10;
            if (!z10 && this.f2716c.size() > 1) {
                for (int size = this.f2716c.size() - 1; size > 0; size--) {
                    this.f2716c.remove(size);
                }
            }
            a();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f2714a.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(g gVar) {
        gVar.getClass();
        a();
    }
}
