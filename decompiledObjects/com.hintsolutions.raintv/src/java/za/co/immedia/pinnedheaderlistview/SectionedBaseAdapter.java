/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  java.lang.Integer
 *  java.lang.Object
 *  za.co.immedia.pinnedheaderlistview.PinnedHeaderListView$PinnedSectionedHeaderAdapter
 */
package za.co.immedia.pinnedheaderlistview;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import za.co.immedia.pinnedheaderlistview.PinnedHeaderListView;

public abstract class SectionedBaseAdapter
extends BaseAdapter
implements PinnedHeaderListView.PinnedSectionedHeaderAdapter {
    private static int HEADER_VIEW_TYPE;
    private static int ITEM_VIEW_TYPE;
    private int mCount = -1;
    private SparseArray<Integer> mSectionCache = new SparseArray();
    private int mSectionCount = -1;
    private SparseArray<Integer> mSectionCountCache;
    private SparseArray<Integer> mSectionPositionCache = new SparseArray();

    public SectionedBaseAdapter() {
        this.mSectionCountCache = new SparseArray();
    }

    private int internalGetCountForSection(int n2) {
        Integer n3 = (Integer)this.mSectionCountCache.get(n2);
        if (n3 != null) {
            return n3;
        }
        int n4 = this.getCountForSection(n2);
        this.mSectionCountCache.put(n2, (Object)n4);
        return n4;
    }

    private int internalGetSectionCount() {
        int n2 = this.mSectionCount;
        if (n2 >= 0) {
            return n2;
        }
        this.mSectionCount = n2 = this.getSectionCount();
        return n2;
    }

    public final int getCount() {
        int n2 = this.mCount;
        if (n2 >= 0) {
            return n2;
        }
        int n3 = 0;
        for (n2 = 0; n2 < this.internalGetSectionCount(); ++n2) {
            n3 = n3 + this.internalGetCountForSection(n2) + 1;
        }
        this.mCount = n3;
        return n3;
    }

    public abstract int getCountForSection(int var1);

    public final Object getItem(int n2) {
        return this.getItem(this.getSectionForPosition(n2), this.getPositionInSectionForPosition(n2));
    }

    public abstract Object getItem(int var1, int var2);

    public final long getItemId(int n2) {
        return this.getItemId(this.getSectionForPosition(n2), this.getPositionInSectionForPosition(n2));
    }

    public abstract long getItemId(int var1, int var2);

    public abstract View getItemView(int var1, int var2, View var3, ViewGroup var4);

    public final int getItemViewType(int n2) {
        if (this.isSectionHeader(n2)) {
            int n3 = this.getItemViewTypeCount();
            return this.getSectionHeaderViewType(this.getSectionForPosition(n2)) + n3;
        }
        return this.getItemViewType(this.getSectionForPosition(n2), this.getPositionInSectionForPosition(n2));
    }

    public int getItemViewType(int n2, int n3) {
        return ITEM_VIEW_TYPE;
    }

    public int getItemViewTypeCount() {
        return 1;
    }

    public int getPositionInSectionForPosition(int n2) {
        Integer n3 = (Integer)this.mSectionPositionCache.get(n2);
        if (n3 != null) {
            return n3;
        }
        int n4 = 0;
        for (int i2 = 0; i2 < this.internalGetSectionCount(); ++i2) {
            int n7 = this.internalGetCountForSection(i2) + n4 + 1;
            if (n2 >= n4 && n2 < n7) {
                n4 = n2 - n4 - 1;
                this.mSectionPositionCache.put(n2, (Object)n4);
                return n4;
            }
            n4 = n7;
        }
        return 0;
    }

    public abstract int getSectionCount();

    public final int getSectionForPosition(int n2) {
        Integer n3 = (Integer)this.mSectionCache.get(n2);
        if (n3 != null) {
            return n3;
        }
        int n4 = 0;
        for (int i2 = 0; i2 < this.internalGetSectionCount(); ++i2) {
            int n7 = this.internalGetCountForSection(i2) + n4 + 1;
            if (n2 >= n4 && n2 < n7) {
                this.mSectionCache.put(n2, (Object)i2);
                return i2;
            }
            n4 = n7;
        }
        return 0;
    }

    public abstract View getSectionHeaderView(int var1, View var2, ViewGroup var3);

    public int getSectionHeaderViewType(int n2) {
        return HEADER_VIEW_TYPE;
    }

    public int getSectionHeaderViewTypeCount() {
        return 1;
    }

    public final View getView(int n2, View view, ViewGroup viewGroup) {
        if (this.isSectionHeader(n2)) {
            return this.getSectionHeaderView(this.getSectionForPosition(n2), view, viewGroup);
        }
        return this.getItemView(this.getSectionForPosition(n2), this.getPositionInSectionForPosition(n2), view, viewGroup);
    }

    public final int getViewTypeCount() {
        int n2 = this.getItemViewTypeCount();
        return this.getSectionHeaderViewTypeCount() + n2;
    }

    public final boolean isSectionHeader(int n2) {
        int n3 = 0;
        for (int i2 = 0; i2 < this.internalGetSectionCount(); ++i2) {
            if (n2 == n3) {
                return true;
            }
            if (n2 < n3) {
                return false;
            }
            n3 += this.internalGetCountForSection(i2) + 1;
        }
        return false;
    }

    public void notifyDataSetChanged() {
        this.mSectionCache.clear();
        this.mSectionPositionCache.clear();
        this.mSectionCountCache.clear();
        this.mCount = -1;
        this.mSectionCount = -1;
        super.notifyDataSetChanged();
    }

    public void notifyDataSetInvalidated() {
        this.mSectionCache.clear();
        this.mSectionPositionCache.clear();
        this.mSectionCountCache.clear();
        this.mCount = -1;
        this.mSectionCount = -1;
        super.notifyDataSetInvalidated();
    }
}

