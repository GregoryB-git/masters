/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.HeaderViewListAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.Object
 */
package za.co.immedia.pinnedheaderlistview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import za.co.immedia.pinnedheaderlistview.SectionedBaseAdapter;

public class PinnedHeaderListView
extends ListView
implements AbsListView.OnScrollListener {
    private PinnedSectionedHeaderAdapter mAdapter;
    private View mCurrentHeader;
    private int mCurrentHeaderViewType = 0;
    private int mCurrentSection = 0;
    private float mHeaderOffset;
    private int mHeightMode;
    private AbsListView.OnScrollListener mOnScrollListener;
    private boolean mShouldPin = true;
    private int mWidthMode;

    public PinnedHeaderListView(Context context) {
        super(context);
        super.setOnScrollListener((AbsListView.OnScrollListener)this);
    }

    public PinnedHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnScrollListener((AbsListView.OnScrollListener)this);
    }

    public PinnedHeaderListView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        super.setOnScrollListener((AbsListView.OnScrollListener)this);
    }

    private void ensurePinnedHeaderLayout(View view) {
        if (view.isLayoutRequested()) {
            int n3;
            int n7 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)this.mWidthMode);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            n3 = layoutParams != null && (n3 = layoutParams.height) > 0 ? View.MeasureSpec.makeMeasureSpec((int)n3, (int)0x40000000) : View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            view.measure(n7, n3);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private View getSectionHeaderView(int n3, View view) {
        boolean bl = n3 != this.mCurrentSection || view == null;
        view = this.mAdapter.getSectionHeaderView(n3, view, (ViewGroup)this);
        if (bl) {
            this.ensurePinnedHeaderLayout(view);
            this.mCurrentSection = n3;
        }
        return view;
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.mAdapter != null && this.mShouldPin && this.mCurrentHeader != null) {
            int n3 = canvas.save();
            canvas.translate(0.0f, this.mHeaderOffset);
            canvas.clipRect(0, 0, this.getWidth(), this.mCurrentHeader.getMeasuredHeight());
            this.mCurrentHeader.draw(canvas);
            canvas.restoreToCount(n3);
        }
    }

    public void onMeasure(int n3, int n7) {
        super.onMeasure(n3, n7);
        this.mWidthMode = View.MeasureSpec.getMode((int)n3);
        this.mHeightMode = View.MeasureSpec.getMode((int)n7);
    }

    public void onScroll(AbsListView absListView, int n3, int n7, int n8) {
        Object object = this.mOnScrollListener;
        if (object != null) {
            object.onScroll(absListView, n3, n7, n8);
        }
        object = this.mAdapter;
        absListView = null;
        if (object != null && object.getCount() != 0 && this.mShouldPin && n3 >= this.getHeaderViewsCount()) {
            n8 = n3 - this.getHeaderViewsCount();
            int n9 = this.mAdapter.getSectionForPosition(n8);
            if (this.mCurrentHeaderViewType == (n3 = this.mAdapter.getSectionHeaderViewType(n9))) {
                absListView = this.mCurrentHeader;
            }
            absListView = this.getSectionHeaderView(n9, (View)absListView);
            this.mCurrentHeader = absListView;
            this.ensurePinnedHeaderLayout((View)absListView);
            this.mCurrentHeaderViewType = n3;
            this.mHeaderOffset = 0.0f;
            for (n3 = n8; n3 < n8 + n7; ++n3) {
                if (!this.mAdapter.isSectionHeader(n3)) continue;
                absListView = this.getChildAt(n3 - n8);
                float f7 = absListView.getTop();
                float f9 = this.mCurrentHeader.getMeasuredHeight();
                absListView.setVisibility(0);
                if (f9 >= f7 && f7 > 0.0f) {
                    this.mHeaderOffset = f7 - (float)absListView.getHeight();
                    continue;
                }
                if (!(f7 <= 0.0f)) continue;
                absListView.setVisibility(4);
            }
            this.invalidate();
            return;
        }
        this.mCurrentHeader = null;
        this.mHeaderOffset = 0.0f;
        for (n8 = n3; n8 < n3 + n7; ++n8) {
            absListView = this.getChildAt(n8);
            if (absListView == null) continue;
            absListView.setVisibility(0);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int n3) {
        AbsListView.OnScrollListener onScrollListener = this.mOnScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, n3);
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        this.mCurrentHeader = null;
        this.mAdapter = (PinnedSectionedHeaderAdapter)listAdapter;
        super.setAdapter(listAdapter);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        super.setOnItemClickListener((AdapterView.OnItemClickListener)onItemClickListener);
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.mOnScrollListener = onScrollListener;
    }

    public void setPinHeaders(boolean bl) {
        this.mShouldPin = bl;
    }

    public static abstract class OnItemClickListener
    implements AdapterView.OnItemClickListener {
        public abstract void onItemClick(AdapterView<?> var1, View var2, int var3, int var4, long var5);

        public void onItemClick(AdapterView<?> adapterView, View view, int n3, long l4) {
            SectionedBaseAdapter sectionedBaseAdapter = adapterView.getAdapter().getClass().equals(HeaderViewListAdapter.class) ? (SectionedBaseAdapter)((HeaderViewListAdapter)adapterView.getAdapter()).getWrappedAdapter() : (SectionedBaseAdapter)adapterView.getAdapter();
            int n7 = sectionedBaseAdapter.getSectionForPosition(n3);
            if ((n3 = sectionedBaseAdapter.getPositionInSectionForPosition(n3)) == -1) {
                this.onSectionClick(adapterView, view, n7, l4);
            } else {
                this.onItemClick(adapterView, view, n7, n3, l4);
            }
        }

        public abstract void onSectionClick(AdapterView<?> var1, View var2, int var3, long var4);
    }

    public static interface PinnedSectionedHeaderAdapter {
        public int getCount();

        public int getSectionForPosition(int var1);

        public View getSectionHeaderView(int var1, View var2, ViewGroup var3);

        public int getSectionHeaderViewType(int var1);

        public boolean isSectionHeader(int var1);
    }
}

