/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.collection.ArraySet
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.mikepenz.fastadapter.FastAdapter$1
 *  com.mikepenz.fastadapter.FastAdapter$2
 *  com.mikepenz.fastadapter.FastAdapter$3
 *  java.lang.AbstractMethodError
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Set
 */
package com.mikepenz.fastadapter;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.AbstractAdapter;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IAdapter;
import com.mikepenz.fastadapter.IExpandable;
import com.mikepenz.fastadapter.IHookable;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.IItemAdapter;
import com.mikepenz.fastadapter.ISelectionListener;
import com.mikepenz.fastadapter.R;
import com.mikepenz.fastadapter.listeners.ClickEventHook;
import com.mikepenz.fastadapter.listeners.EventHook;
import com.mikepenz.fastadapter.listeners.LongClickEventHook;
import com.mikepenz.fastadapter.listeners.TouchEventHook;
import com.mikepenz.fastadapter.utils.AdapterUtil;
import com.mikepenz.fastadapter.utils.EventHookUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FastAdapter<Item extends IItem>
extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final String BUNDLE_EXPANDED = "bundle_expanded";
    public static final String BUNDLE_SELECTIONS = "bundle_selections";
    private static final String TAG = "FastAdapter";
    private List<EventHook<Item>> eventHooks;
    private ClickEventHook<Item> fastAdapterViewClickListener;
    private LongClickEventHook<Item> fastAdapterViewLongClickListener;
    private TouchEventHook<Item> fastAdapterViewTouchListener;
    private final SparseArray<IAdapter<Item>> mAdapterSizes;
    private final SparseArray<IAdapter<Item>> mAdapters = new SparseArray();
    private boolean mAllowDeselection = true;
    private SparseIntArray mExpanded;
    private int mGlobalSize = 0;
    private boolean mLegacyBindViewMode = false;
    private boolean mMultiSelect = false;
    private OnBindViewHolderListener mOnBindViewHolderListener;
    private OnClickListener<Item> mOnClickListener;
    private OnCreateViewHolderListener mOnCreateViewHolderListener;
    private OnLongClickListener<Item> mOnLongClickListener;
    private OnClickListener<Item> mOnPreClickListener;
    private OnLongClickListener<Item> mOnPreLongClickListener;
    private OnTouchListener<Item> mOnTouchListener;
    private boolean mOnlyOneExpandedItem = false;
    private boolean mPositionBasedStateManagement = true;
    private boolean mSelectOnLongClick = false;
    private boolean mSelectWithItemUpdate = false;
    private boolean mSelectable = false;
    private ISelectionListener<Item> mSelectionListener;
    private Set<Integer> mSelections;
    private final SparseArray<Item> mTypeInstances = new SparseArray();
    private boolean mVerbose = false;

    public FastAdapter() {
        this.mAdapterSizes = new SparseArray();
        this.mSelections = new ArraySet();
        this.mExpanded = new SparseIntArray();
        this.mOnCreateViewHolderListener = new OnCreateViewHolderListenerImpl(this);
        this.mOnBindViewHolderListener = new OnBindViewHolderListenerImpl(this);
        this.fastAdapterViewClickListener = new 1(this);
        this.fastAdapterViewLongClickListener = new 2(this);
        this.fastAdapterViewTouchListener = new 3(this);
        this.setHasStableIds(true);
    }

    public static /* synthetic */ OnClickListener access$000(FastAdapter fastAdapter) {
        return fastAdapter.mOnPreClickListener;
    }

    public static /* synthetic */ boolean access$100(FastAdapter fastAdapter) {
        return fastAdapter.mSelectOnLongClick;
    }

    public static /* synthetic */ boolean access$200(FastAdapter fastAdapter) {
        return fastAdapter.mSelectable;
    }

    public static /* synthetic */ void access$300(FastAdapter fastAdapter, View view, IItem iItem, int n) {
        fastAdapter.handleSelection(view, iItem, n);
    }

    public static /* synthetic */ boolean access$400(FastAdapter fastAdapter) {
        return fastAdapter.mOnlyOneExpandedItem;
    }

    public static /* synthetic */ OnClickListener access$500(FastAdapter fastAdapter) {
        return fastAdapter.mOnClickListener;
    }

    public static /* synthetic */ OnLongClickListener access$600(FastAdapter fastAdapter) {
        return fastAdapter.mOnPreLongClickListener;
    }

    public static /* synthetic */ OnLongClickListener access$700(FastAdapter fastAdapter) {
        return fastAdapter.mOnLongClickListener;
    }

    public static /* synthetic */ OnTouchListener access$800(FastAdapter fastAdapter) {
        return fastAdapter.mOnTouchListener;
    }

    private void cacheSizes() {
        this.mAdapterSizes.clear();
        int n = this.mAdapters.size();
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            IAdapter iAdapter = (IAdapter)this.mAdapters.valueAt(i);
            int n3 = n2;
            if (iAdapter.getAdapterItemCount() > 0) {
                this.mAdapterSizes.append(n2, (Object)iAdapter);
                n3 = n2 + iAdapter.getAdapterItemCount();
            }
            n2 = n3;
        }
        if (n2 == 0 && this.mAdapters.size() > 0) {
            this.mAdapterSizes.append(0, this.mAdapters.valueAt(0));
        }
        this.mGlobalSize = n2;
    }

    private void deselect(int n, Iterator<Integer> object) {
        Item Item = this.getItem(n);
        if (Item != null) {
            Item.withSetSelected(false);
        }
        if (object == null) {
            if (this.mPositionBasedStateManagement) {
                this.mSelections.remove((Object)n);
            }
        } else {
            object.remove();
        }
        this.notifyItemChanged(n);
        object = this.mSelectionListener;
        if (object != null) {
            object.onSelectionChanged(Item, false);
        }
    }

    private static int floorIndex(SparseArray<?> sparseArray, int n) {
        int n2;
        n = n2 = sparseArray.indexOfKey(n);
        if (n2 < 0) {
            n = ~n2 - 1;
        }
        return n;
    }

    private void handleSelection(View object, Item Item, int n) {
        if (!Item.isSelectable()) {
            return;
        }
        if (Item.isSelected() && !this.mAllowDeselection) {
            return;
        }
        boolean bl = this.mPositionBasedStateManagement ? this.mSelections.contains((Object)n) : Item.isSelected();
        if (!this.mSelectWithItemUpdate && object != null) {
            if (!this.mMultiSelect) {
                if (this.mPositionBasedStateManagement) {
                    Iterator iterator = this.mSelections.iterator();
                    while (iterator.hasNext()) {
                        Integer n2 = (Integer)iterator.next();
                        if (n2 == n) continue;
                        this.deselect(n2, (Iterator<Integer>)iterator);
                    }
                } else {
                    Iterator iterator = this.getSelections().iterator();
                    while (iterator.hasNext()) {
                        int n3 = (Integer)iterator.next();
                        if (n3 == n) continue;
                        this.deselect(n3);
                    }
                }
            }
            Item.withSetSelected(bl ^ true);
            object.setSelected(bl ^ true);
            if (this.mPositionBasedStateManagement) {
                if (bl) {
                    if (this.mSelections.contains((Object)n)) {
                        this.mSelections.remove((Object)n);
                    }
                } else {
                    this.mSelections.add((Object)n);
                }
            }
            if ((object = this.mSelectionListener) != null) {
                object.onSelectionChanged(Item, bl ^ true);
            }
        } else {
            if (!this.mMultiSelect) {
                this.deselect();
            }
            if (bl) {
                this.deselect(n);
            } else {
                this.select(n);
            }
        }
    }

    private void internalCollapse(int n, boolean bl) {
        Object object = this.getItem(n);
        if (object != null && object instanceof IExpandable && (object = (IExpandable)object).isExpanded() && object.getSubItems() != null && object.getSubItems().size() > 0) {
            this.internalCollapse((IExpandable)object, n, bl);
        }
    }

    private void internalCollapse(IExpandable iExpandable, int n, boolean bl) {
        int n2;
        IAdapter<Item> iAdapter = this.getAdapter(n);
        if (iAdapter != null && iAdapter instanceof IItemAdapter) {
            ((IItemAdapter)iAdapter).removeRange(n + 1, iExpandable.getSubItems().size());
        }
        iExpandable.withIsExpanded(false);
        if (this.mPositionBasedStateManagement && (n2 = this.mExpanded.indexOfKey(n)) >= 0) {
            this.mExpanded.removeAt(n2);
        }
        if (bl) {
            this.notifyItemChanged(n);
        }
    }

    public void clearTypeInstance() {
        this.mTypeInstances.clear();
    }

    public void collapse() {
        this.collapse(true);
    }

    public void collapse(int n) {
        this.collapse(n, false);
    }

    public void collapse(int n, boolean bl) {
        Object object = this.getItem(n);
        if (object != null && object instanceof IExpandable && (object = (IExpandable)object).isExpanded() && object.getSubItems() != null && object.getSubItems().size() > 0) {
            if (this.mPositionBasedStateManagement) {
                Iterator iterator;
                int n2;
                int n3;
                int n4 = object.getSubItems().size();
                int n5 = this.mExpanded.size();
                for (n3 = 0; n3 < n5; ++n3) {
                    n2 = n4;
                    if (this.mExpanded.keyAt(n3) > n) {
                        n2 = n4;
                        if (this.mExpanded.keyAt(n3) <= n + n4) {
                            iterator = this.mExpanded;
                            n2 = iterator.get(iterator.keyAt(n3)) + n4;
                        }
                    }
                    n4 = n2;
                }
                iterator = this.mSelections.iterator();
                while (iterator.hasNext()) {
                    Integer n6 = (Integer)iterator.next();
                    if (n6 <= n || n6 > n + n4) continue;
                    this.deselect(n6, (Iterator<Integer>)iterator);
                }
                for (n3 = n5 - 1; n3 >= 0; --n3) {
                    n2 = n4;
                    if (this.mExpanded.keyAt(n3) > n) {
                        n2 = n4;
                        if (this.mExpanded.keyAt(n3) <= n + n4) {
                            iterator = this.mExpanded;
                            n2 = n4 - iterator.get(iterator.keyAt(n3));
                            this.internalCollapse(this.mExpanded.keyAt(n3), bl);
                        }
                    }
                    n4 = n2;
                }
                this.internalCollapse((IExpandable)object, n, bl);
            } else {
                Object object2;
                int n7;
                int n8;
                int n9 = object.getSubItems().size();
                for (n8 = n + 1; n8 < (n7 = n + n9) + 1; ++n8) {
                    object2 = this.getItem(n8);
                    n7 = n9;
                    if (object2 instanceof IExpandable) {
                        object2 = (IExpandable)object2;
                        n7 = n9;
                        if (object2.getSubItems() != null) {
                            n7 = n9;
                            if (object2.isExpanded()) {
                                n7 = object2.getSubItems().size() + n9;
                            }
                        }
                    }
                    n9 = n7;
                }
                n8 = n7 - 1;
                while (n8 > n) {
                    object2 = this.getItem(n8);
                    n9 = n8;
                    if (object2 instanceof IExpandable) {
                        object2 = (IExpandable)object2;
                        n9 = n8;
                        if (object2.isExpanded()) {
                            this.collapse(n8);
                            n9 = n8;
                            if (object2.getSubItems() != null) {
                                n9 = n8 - object2.getSubItems().size();
                            }
                        }
                    }
                    n8 = n9 - 1;
                }
                this.internalCollapse((IExpandable)object, n, bl);
            }
        }
    }

    public void collapse(boolean bl) {
        int[] nArray = this.getExpandedItems();
        for (int i = nArray.length - 1; i >= 0; --i) {
            this.collapse(nArray[i], bl);
        }
    }

    public List<Item> deleteAllSelectedItems() {
        ArrayList arrayList = new ArrayList();
        if (this.mPositionBasedStateManagement) {
            Set<Integer> set = this.getSelections();
            while (set.size() > 0) {
                int n = (Integer)(set = set.iterator()).next();
                IAdapter<Item> iAdapter = this.getAdapter(n);
                if (iAdapter != null && iAdapter instanceof IItemAdapter) {
                    arrayList.add(this.getItem(n));
                    ((IItemAdapter)iAdapter).remove(n);
                } else {
                    set.remove();
                }
                set = this.getSelections();
            }
        } else {
            for (int i = this.getItemCount() - 1; i >= 0; --i) {
                Object object = this.getRelativeInfo(i);
                if (!object.item.isSelected() || (object = object.adapter) == null || !(object instanceof IItemAdapter)) continue;
                ((IItemAdapter)object).remove(i);
            }
        }
        return arrayList;
    }

    public void deselect() {
        if (this.mPositionBasedStateManagement) {
            this.deselect((Iterable<Integer>)this.mSelections);
        } else {
            for (IItem iItem : AdapterUtil.getAllItems(this)) {
                if (!iItem.isSelected()) continue;
                iItem.withSetSelected(false);
                ISelectionListener<IItem> iSelectionListener = this.mSelectionListener;
                if (iSelectionListener == null) continue;
                iSelectionListener.onSelectionChanged(iItem, false);
            }
            this.notifyDataSetChanged();
        }
    }

    public void deselect(int n) {
        this.deselect(n, null);
    }

    public void deselect(Iterable<Integer> iterator) {
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            this.deselect((Integer)iterator.next(), (Iterator<Integer>)iterator);
        }
    }

    public FastAdapter<Item> enableVerboseLog() {
        this.mVerbose = true;
        return this;
    }

    public void expand() {
        this.expand(false);
    }

    public void expand(int n) {
        this.expand(n, false);
    }

    public void expand(int n, boolean bl) {
        Object object = this.getItem(n);
        if (object != null && object instanceof IExpandable) {
            object = (IExpandable)object;
            if (this.mPositionBasedStateManagement) {
                if (this.mExpanded.indexOfKey(n) < 0 && object.getSubItems() != null && object.getSubItems().size() > 0) {
                    SparseIntArray sparseIntArray = this.getAdapter(n);
                    if (sparseIntArray != null && sparseIntArray instanceof IItemAdapter) {
                        ((IItemAdapter)sparseIntArray).add(n + 1, object.getSubItems());
                    }
                    object.withIsExpanded(true);
                    if (bl) {
                        this.notifyItemChanged(n);
                    }
                    sparseIntArray = this.mExpanded;
                    int n2 = object.getSubItems() != null ? object.getSubItems().size() : 0;
                    sparseIntArray.put(n, n2);
                }
            } else if (!object.isExpanded() && object.getSubItems() != null && object.getSubItems().size() > 0) {
                IAdapter<Item> iAdapter = this.getAdapter(n);
                if (iAdapter != null && iAdapter instanceof IItemAdapter) {
                    ((IItemAdapter)iAdapter).add(n + 1, object.getSubItems());
                }
                object.withIsExpanded(true);
                if (bl) {
                    this.notifyItemChanged(n);
                }
            }
        }
    }

    public void expand(boolean bl) {
        for (int i = this.getItemCount() - 1; i >= 0; --i) {
            this.expand(i);
        }
    }

    @Nullable
    public IAdapter<Item> getAdapter(int n) {
        if (n >= 0 && n < this.mGlobalSize) {
            if (this.mVerbose) {
                Log.v((String)TAG, (String)"getAdapter");
            }
            SparseArray<IAdapter<Item>> sparseArray = this.mAdapterSizes;
            return (IAdapter)sparseArray.valueAt(FastAdapter.floorIndex(sparseArray, n));
        }
        return null;
    }

    public SparseIntArray getExpanded() {
        if (this.mPositionBasedStateManagement) {
            return this.mExpanded;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int n = this.getItemCount();
        for (int i = 0; i < n; ++i) {
            Object object = this.getItem(i);
            if (!(object instanceof IExpandable) || !(object = (IExpandable)object).isExpanded()) continue;
            sparseIntArray.put(i, object.getSubItems().size());
        }
        return sparseIntArray;
    }

    public int[] getExpandedItems() {
        Object object;
        boolean bl = this.mPositionBasedStateManagement;
        int n = 0;
        int n2 = 0;
        if (bl) {
            n = this.mExpanded.size();
            int[] nArray = new int[n];
            while (true) {
                object = nArray;
                if (n2 < n) {
                    nArray[n2] = this.mExpanded.keyAt(n2);
                    ++n2;
                    continue;
                }
                break;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            int n3 = this.getItemCount();
            for (n2 = 0; n2 < n3; ++n2) {
                object = this.getItem(n2);
                if (!(object instanceof IExpandable) || !((IExpandable)object).isExpanded()) continue;
                arrayList.add((Object)n2);
            }
            n3 = arrayList.size();
            object = new int[n3];
            for (n2 = n; n2 < n3; ++n2) {
                object[n2] = (Integer)arrayList.get(n2);
            }
        }
        return object;
    }

    public int getExpandedItemsCount(int n, int n2) {
        int n3;
        block9: {
            int n4;
            boolean bl = this.mPositionBasedStateManagement;
            int n5 = 0;
            n3 = 0;
            if (bl) {
                int n6 = this.mExpanded.size();
                n5 = 0;
                n4 = n3;
                while (true) {
                    n3 = n5;
                    if (n4 >= n6) break block9;
                    if (this.mExpanded.keyAt(n4) >= n && this.mExpanded.keyAt(n4) < n2) {
                        SparseIntArray sparseIntArray = this.mExpanded;
                        n3 = sparseIntArray.get(sparseIntArray.keyAt(n4)) + n5;
                    } else {
                        n3 = n5;
                        if (this.mExpanded.keyAt(n4) >= n2) {
                            n3 = n5;
                            break block9;
                        }
                    }
                    ++n4;
                    n5 = n3;
                }
            }
            for (n4 = n; n4 < n2; ++n4) {
                Object object = this.getItem(n4);
                n = n5;
                if (object instanceof IExpandable) {
                    object = (IExpandable)object;
                    n = n5;
                    if (object.getSubItems() != null) {
                        n = n5;
                        if (object.isExpanded()) {
                            n = object.getSubItems().size() + n5;
                        }
                    }
                }
                n5 = n;
            }
            n3 = n5;
        }
        return n3;
    }

    public int getHolderAdapterPosition(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.getAdapterPosition();
    }

    public Item getItem(int n) {
        if (n >= 0 && n < this.mGlobalSize) {
            int n2 = FastAdapter.floorIndex(this.mAdapterSizes, n);
            return ((IAdapter)this.mAdapterSizes.valueAt(n2)).getAdapterItem(n - this.mAdapterSizes.keyAt(n2));
        }
        return null;
    }

    public int getItemCount() {
        return this.mGlobalSize;
    }

    public long getItemId(int n) {
        return this.getItem(n).getIdentifier();
    }

    public int getItemViewType(int n) {
        return this.getItem(n).getType();
    }

    public int getPosition(long l) {
        int n = this.mAdapters.size();
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            IAdapter iAdapter = (IAdapter)this.mAdapters.valueAt(i);
            if (iAdapter.getOrder() < 0) continue;
            int n3 = iAdapter.getAdapterPosition(l);
            if (n3 != -1) {
                return n2 + n3;
            }
            n2 = iAdapter.getAdapterItemCount();
        }
        return -1;
    }

    public int getPosition(Item Item) {
        if (Item.getIdentifier() == -1L) {
            Log.e((String)TAG, (String)"You have to define an identifier for your item to retrieve the position via this method");
            return -1;
        }
        return this.getPosition(Item.getIdentifier());
    }

    public int getPreItemCount(int n) {
        if (this.mGlobalSize == 0) {
            return 0;
        }
        SparseArray<IAdapter<Item>> sparseArray = this.mAdapterSizes;
        return sparseArray.keyAt(FastAdapter.floorIndex(sparseArray, n));
    }

    public int getPreItemCountByOrder(int n) {
        int n2 = this.mGlobalSize;
        if (n2 == 0) {
            return 0;
        }
        int n3 = this.mAdapters.size();
        n2 = 0;
        for (int i = 0; i < n3; ++i) {
            IAdapter iAdapter = (IAdapter)this.mAdapters.valueAt(i);
            if (iAdapter.getOrder() == n) {
                return n2;
            }
            n2 += iAdapter.getAdapterItemCount();
        }
        return n2;
    }

    public RelativeInfo<Item> getRelativeInfo(int n) {
        if (n < 0) {
            return new Object(){
                public IAdapter<Item> adapter = null;
                public Item item = null;
                public int position = -1;
            };
        }
        Object object = new /* invalid duplicate definition of identical inner class */;
        int n2 = FastAdapter.floorIndex(this.mAdapterSizes, n);
        if (n2 != -1) {
            object.item = ((IAdapter)this.mAdapterSizes.valueAt(n2)).getAdapterItem(n - this.mAdapterSizes.keyAt(n2));
            object.adapter = (IAdapter)this.mAdapterSizes.valueAt(n2);
            object.position = n;
        }
        return object;
    }

    public Set<Item> getSelectedItems() {
        Iterator iterator = this.getSelections();
        ArraySet arraySet = new ArraySet(iterator.size());
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            arraySet.add(this.getItem((Integer)iterator.next()));
        }
        return arraySet;
    }

    public Set<Integer> getSelections() {
        if (this.mPositionBasedStateManagement) {
            return this.mSelections;
        }
        ArraySet arraySet = new ArraySet();
        int n = this.getItemCount();
        for (int i = 0; i < n; ++i) {
            if (!this.getItem(i).isSelected()) continue;
            arraySet.add((Object)i);
        }
        return arraySet;
    }

    public Item getTypeInstance(int n) {
        return (Item)((IItem)this.mTypeInstances.get(n));
    }

    public boolean isOnlyOneExpandedItem() {
        return this.mOnlyOneExpandedItem;
    }

    public boolean isPositionBasedStateManagement() {
        return this.mPositionBasedStateManagement;
    }

    public boolean isSelectable() {
        return this.mSelectable;
    }

    public void notifyAdapterDataSetChanged() {
        if (this.mPositionBasedStateManagement) {
            this.mSelections.clear();
            this.mExpanded.clear();
        }
        this.cacheSizes();
        this.notifyDataSetChanged();
        if (this.mPositionBasedStateManagement) {
            AdapterUtil.handleStates(this, 0, this.getItemCount() - 1);
        }
    }

    public void notifyAdapterItemChanged(int n) {
        this.notifyAdapterItemChanged(n, null);
    }

    public void notifyAdapterItemChanged(int n, Object object) {
        this.notifyAdapterItemRangeChanged(n, 1, object);
    }

    public void notifyAdapterItemInserted(int n) {
        this.notifyAdapterItemRangeInserted(n, 1);
    }

    public void notifyAdapterItemMoved(int n, int n2) {
        this.collapse(n);
        this.collapse(n2);
        if (this.mPositionBasedStateManagement) {
            if (!this.mSelections.contains((Object)n) && this.mSelections.contains((Object)n2)) {
                this.mSelections.remove((Object)n2);
                this.mSelections.add((Object)n);
            } else if (this.mSelections.contains((Object)n) && !this.mSelections.contains((Object)n2)) {
                this.mSelections.remove((Object)n);
                this.mSelections.add((Object)n2);
            }
        }
        this.notifyItemMoved(n, n2);
    }

    public void notifyAdapterItemRangeChanged(int n, int n2) {
        this.notifyAdapterItemRangeChanged(n, n2, null);
    }

    public void notifyAdapterItemRangeChanged(int n, int n2, Object object) {
        int n3;
        for (int i = n; i < (n3 = n + n2); ++i) {
            if (this.mPositionBasedStateManagement) {
                if (this.mExpanded.indexOfKey(i) < 0) continue;
                this.collapse(i);
                continue;
            }
            Item Item = this.getItem(n);
            if (!(Item instanceof IExpandable) || !((IExpandable)Item).isExpanded()) continue;
            this.collapse(n);
        }
        if (object == null) {
            this.notifyItemRangeChanged(n, n2);
        } else {
            this.notifyItemRangeChanged(n, n2, object);
        }
        if (this.mPositionBasedStateManagement) {
            AdapterUtil.handleStates(this, n, n3 - 1);
        }
    }

    public void notifyAdapterItemRangeInserted(int n, int n2) {
        if (this.mPositionBasedStateManagement) {
            this.mSelections = AdapterUtil.adjustPosition(this.mSelections, n, Integer.MAX_VALUE, n2);
            this.mExpanded = AdapterUtil.adjustPosition(this.mExpanded, n, Integer.MAX_VALUE, n2);
        }
        this.cacheSizes();
        this.notifyItemRangeInserted(n, n2);
        if (this.mPositionBasedStateManagement) {
            AdapterUtil.handleStates(this, n, n2 + n - 1);
        }
    }

    public void notifyAdapterItemRangeRemoved(int n, int n2) {
        if (this.mPositionBasedStateManagement) {
            Set<Integer> set = this.mSelections;
            int n3 = n2 * -1;
            this.mSelections = AdapterUtil.adjustPosition(set, n, Integer.MAX_VALUE, n3);
            this.mExpanded = AdapterUtil.adjustPosition(this.mExpanded, n, Integer.MAX_VALUE, n3);
        }
        this.cacheSizes();
        this.notifyItemRangeRemoved(n, n2);
    }

    public void notifyAdapterItemRemoved(int n) {
        this.notifyAdapterItemRangeRemoved(n, 1);
    }

    public int notifyAdapterSubItemsChanged(int n, int n2) {
        Object object = this.getItem(n);
        if (object != null && object instanceof IExpandable) {
            object = (IExpandable)object;
            IItemAdapter iItemAdapter = this.getAdapter(n);
            if (iItemAdapter != null && iItemAdapter instanceof IItemAdapter) {
                iItemAdapter = iItemAdapter;
                iItemAdapter.removeRange(++n, n2);
                iItemAdapter.add(n, object.getSubItems());
            }
            return object.getSubItems().size();
        }
        return 0;
    }

    public void notifyAdapterSubItemsChanged(int n) {
        if (this.mPositionBasedStateManagement) {
            if (this.mExpanded.indexOfKey(n) > -1) {
                int n2 = this.notifyAdapterSubItemsChanged(n, this.mExpanded.get(n));
                if (n2 == 0) {
                    this.mExpanded.delete(n);
                } else {
                    this.mExpanded.put(n, n2);
                }
            }
        } else {
            Log.e((String)TAG, (String)"please use the notifyAdapterSubItemsChanged(int position, int previousCount) method instead in the PositionBasedStateManagement mode, as we are not able to calculate the previous count ");
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.mVerbose) {
            Log.v((String)TAG, (String)"onAttachedToRecyclerView");
        }
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int n) {
        if (this.mLegacyBindViewMode) {
            if (this.mVerbose) {
                StringBuilder stringBuilder = a.r("onBindViewHolderLegacy: ", n, "/");
                stringBuilder.append(viewHolder.getItemViewType());
                Log.v((String)TAG, (String)stringBuilder.toString());
            }
            viewHolder.itemView.setTag(R.id.fastadapter_item_adapter, (Object)this);
            this.mOnBindViewHolderListener.onBindViewHolder(viewHolder, n, (List<Object>)Collections.EMPTY_LIST);
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int n, List<Object> list) {
        if (this.mVerbose) {
            StringBuilder stringBuilder = a.r("onBindViewHolder: ", n, "/");
            stringBuilder.append(viewHolder.getItemViewType());
            Log.v((String)TAG, (String)stringBuilder.toString());
        }
        super.onBindViewHolder(viewHolder, n, list);
        viewHolder.itemView.setTag(R.id.fastadapter_item_adapter, (Object)this);
        this.mOnBindViewHolderListener.onBindViewHolder(viewHolder, n, list);
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        if (this.mVerbose) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onCreateViewHolder: ");
            stringBuilder.append(n);
            Log.v((String)TAG, (String)stringBuilder.toString());
        }
        viewGroup = this.mOnCreateViewHolderListener.onPreCreateViewHolder(viewGroup, n);
        viewGroup.itemView.setTag(R.id.fastadapter_item_adapter, (Object)this);
        EventHookUtil.attachToView(this.fastAdapterViewClickListener, (RecyclerView.ViewHolder)viewGroup, viewGroup.itemView);
        EventHookUtil.attachToView(this.fastAdapterViewLongClickListener, (RecyclerView.ViewHolder)viewGroup, viewGroup.itemView);
        EventHookUtil.attachToView(this.fastAdapterViewTouchListener, (RecyclerView.ViewHolder)viewGroup, viewGroup.itemView);
        return this.mOnCreateViewHolderListener.onPostCreateViewHolder((RecyclerView.ViewHolder)viewGroup);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (this.mVerbose) {
            Log.v((String)TAG, (String)"onDetachedFromRecyclerView");
        }
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        if (this.mVerbose) {
            StringBuilder stringBuilder = z2.t("onFailedToRecycleView: ");
            stringBuilder.append(viewHolder.getItemViewType());
            Log.v((String)TAG, (String)stringBuilder.toString());
        }
        boolean bl = this.mOnBindViewHolderListener.onFailedToRecycleView(viewHolder, viewHolder.getAdapterPosition()) || super.onFailedToRecycleView(viewHolder);
        return bl;
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (this.mVerbose) {
            StringBuilder stringBuilder = z2.t("onViewAttachedToWindow: ");
            stringBuilder.append(viewHolder.getItemViewType());
            Log.v((String)TAG, (String)stringBuilder.toString());
        }
        super.onViewAttachedToWindow(viewHolder);
        this.mOnBindViewHolderListener.onViewAttachedToWindow(viewHolder, viewHolder.getAdapterPosition());
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (this.mVerbose) {
            StringBuilder stringBuilder = z2.t("onViewDetachedFromWindow: ");
            stringBuilder.append(viewHolder.getItemViewType());
            Log.v((String)TAG, (String)stringBuilder.toString());
        }
        super.onViewDetachedFromWindow(viewHolder);
        this.mOnBindViewHolderListener.onViewDetachedFromWindow(viewHolder, viewHolder.getAdapterPosition());
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (this.mVerbose) {
            StringBuilder stringBuilder = z2.t("onViewRecycled: ");
            stringBuilder.append(viewHolder.getItemViewType());
            Log.v((String)TAG, (String)stringBuilder.toString());
        }
        super.onViewRecycled(viewHolder);
        this.mOnBindViewHolderListener.unBindViewHolder(viewHolder, viewHolder.getAdapterPosition());
    }

    public <A extends AbstractAdapter<Item>> void registerAdapter(A a2) {
        if (this.mAdapters.indexOfKey(a2.getOrder()) < 0) {
            this.mAdapters.put(a2.getOrder(), a2);
            this.cacheSizes();
        }
    }

    public void registerTypeInstance(Item Item) {
        if (this.mTypeInstances.indexOfKey(Item.getType()) < 0) {
            this.mTypeInstances.put(Item.getType(), Item);
            if (Item instanceof IHookable) {
                this.withEventHooks((Collection<? extends EventHook<Item>>)((IHookable)Item).getEventHooks());
            }
        }
    }

    public Bundle saveInstanceState(Bundle bundle) {
        return this.saveInstanceState(bundle, "");
    }

    public Bundle saveInstanceState(Bundle bundle, String string) {
        if (bundle != null) {
            int n;
            boolean bl = this.mPositionBasedStateManagement;
            int n2 = 0;
            if (bl) {
                Object object = new int[this.mSelections.size()];
                Iterator iterator = this.mSelections.iterator();
                n = n2;
                while (iterator.hasNext()) {
                    object[n] = (Integer)iterator.next();
                    ++n;
                }
                iterator = new StringBuilder();
                iterator.append(BUNDLE_SELECTIONS);
                iterator.append(string);
                bundle.putIntArray(iterator.toString(), object);
                object = new StringBuilder();
                object.append(BUNDLE_EXPANDED);
                object.append(string);
                bundle.putIntArray(object.toString(), this.getExpandedItems());
            } else {
                Object object;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                n2 = this.getItemCount();
                for (n = 0; n < n2; ++n) {
                    object = this.getItem(n);
                    if (object instanceof IExpandable && ((IExpandable)object).isExpanded()) {
                        arrayList2.add((Object)String.valueOf((long)object.getIdentifier()));
                    }
                    if (object.isSelected()) {
                        arrayList.add((Object)String.valueOf((long)object.getIdentifier()));
                    }
                    AdapterUtil.findSubItemSelections(object, (List<String>)arrayList);
                }
                object = new StringBuilder();
                object.append(BUNDLE_SELECTIONS);
                object.append(string);
                bundle.putStringArrayList(object.toString(), arrayList);
                arrayList = new StringBuilder();
                arrayList.append(BUNDLE_EXPANDED);
                arrayList.append(string);
                bundle.putStringArrayList(arrayList.toString(), arrayList2);
            }
        }
        return bundle;
    }

    public void select() {
        this.select(false);
    }

    public void select(int n) {
        this.select(n, false);
    }

    public void select(int n, boolean bl) {
        this.select(n, bl, false);
    }

    public void select(int n, boolean bl, boolean bl2) {
        Item Item = this.getItem(n);
        if (Item == null) {
            return;
        }
        if (bl2 && !Item.isSelectable()) {
            return;
        }
        Item.withSetSelected(true);
        if (this.mPositionBasedStateManagement) {
            this.mSelections.add((Object)n);
        }
        this.notifyItemChanged(n);
        Object object = this.mSelectionListener;
        if (object != null) {
            object.onSelectionChanged(Item, true);
        }
        if ((object = this.mOnClickListener) != null && bl) {
            object.onClick(null, this.getAdapter(n), Item, n);
        }
    }

    public void select(Iterable<Integer> iterator) {
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            this.select((Integer)iterator.next());
        }
    }

    public void select(boolean bl) {
        if (this.mPositionBasedStateManagement) {
            int n = this.getItemCount();
            for (int i = 0; i < n; ++i) {
                this.select(i, false, bl);
            }
        } else {
            for (IItem iItem : AdapterUtil.getAllItems(this)) {
                if (bl && !iItem.isSelectable()) continue;
                iItem.withSetSelected(true);
                ISelectionListener<IItem> iSelectionListener = this.mSelectionListener;
                if (iSelectionListener == null) continue;
                iSelectionListener.onSelectionChanged(iItem, true);
            }
            this.notifyDataSetChanged();
        }
    }

    public void toggleExpandable(int n) {
        if (this.mPositionBasedStateManagement) {
            if (this.mExpanded.indexOfKey(n) >= 0) {
                this.collapse(n);
            } else {
                this.expand(n);
            }
        } else {
            Item Item = this.getItem(n);
            if (Item instanceof IExpandable && ((IExpandable)Item).isExpanded()) {
                this.collapse(n);
            } else {
                this.expand(n);
            }
        }
    }

    public void toggleSelection(int n) {
        if (this.mPositionBasedStateManagement) {
            if (this.mSelections.contains((Object)n)) {
                this.deselect(n);
            } else {
                this.select(n);
            }
        } else if (this.getItem(n).isSelected()) {
            this.deselect(n);
        } else {
            this.select(n);
        }
    }

    public FastAdapter<Item> withAllowDeselection(boolean bl) {
        this.mAllowDeselection = bl;
        return this;
    }

    public FastAdapter<Item> withEventHook(EventHook<Item> eventHook) {
        if (this.eventHooks == null) {
            this.eventHooks = new LinkedList();
        }
        this.eventHooks.add(eventHook);
        return this;
    }

    public FastAdapter<Item> withEventHooks(@Nullable Collection<? extends EventHook<Item>> collection) {
        if (collection == null) {
            return this;
        }
        if (this.eventHooks == null) {
            this.eventHooks = new LinkedList();
        }
        this.eventHooks.addAll(collection);
        return this;
    }

    @Deprecated
    public FastAdapter<Item> withItemEvent(EventHook<Item> eventHook) {
        return this.withEventHook(eventHook);
    }

    public FastAdapter<Item> withLegacyBindViewMode(boolean bl) {
        this.mLegacyBindViewMode = bl;
        return this;
    }

    public FastAdapter<Item> withMultiSelect(boolean bl) {
        this.mMultiSelect = bl;
        return this;
    }

    public FastAdapter<Item> withOnBindViewHolderListener(OnBindViewHolderListener onBindViewHolderListener) {
        this.mOnBindViewHolderListener = onBindViewHolderListener;
        return this;
    }

    public FastAdapter<Item> withOnClickListener(OnClickListener<Item> onClickListener) {
        this.mOnClickListener = onClickListener;
        return this;
    }

    public FastAdapter<Item> withOnCreateViewHolderListener(OnCreateViewHolderListener onCreateViewHolderListener) {
        this.mOnCreateViewHolderListener = onCreateViewHolderListener;
        return this;
    }

    public FastAdapter<Item> withOnLongClickListener(OnLongClickListener<Item> onLongClickListener) {
        this.mOnLongClickListener = onLongClickListener;
        return this;
    }

    public FastAdapter<Item> withOnPreClickListener(OnClickListener<Item> onClickListener) {
        this.mOnPreClickListener = onClickListener;
        return this;
    }

    public FastAdapter<Item> withOnPreLongClickListener(OnLongClickListener<Item> onLongClickListener) {
        this.mOnPreLongClickListener = onLongClickListener;
        return this;
    }

    public FastAdapter<Item> withOnTouchListener(OnTouchListener<Item> onTouchListener) {
        this.mOnTouchListener = onTouchListener;
        return this;
    }

    public FastAdapter<Item> withOnlyOneExpandedItem(boolean bl) {
        this.mOnlyOneExpandedItem = bl;
        return this;
    }

    public FastAdapter<Item> withPositionBasedStateManagement(boolean bl) {
        this.mPositionBasedStateManagement = bl;
        return this;
    }

    public FastAdapter<Item> withSavedInstanceState(Bundle bundle) {
        return this.withSavedInstanceState(bundle, "");
    }

    public FastAdapter<Item> withSavedInstanceState(Bundle object, String string) {
        block7: {
            int n;
            int n2;
            block8: {
                int n3;
                if (object == null) break block7;
                this.deselect();
                boolean bl = this.mPositionBasedStateManagement;
                n2 = 0;
                n = 0;
                if (!bl) break block8;
                Object object2 = new StringBuilder();
                object2.append(BUNDLE_EXPANDED);
                object2.append(string);
                object2 = object.getIntArray(object2.toString());
                if (object2 != null) {
                    n3 = ((StringBuilder)object2).length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        this.expand((int)object2[n2]);
                    }
                }
                object2 = new StringBuilder();
                object2.append(BUNDLE_SELECTIONS);
                object2.append(string);
                object = object.getIntArray(object2.toString());
                if (object == null) break block7;
                n3 = ((Bundle)object).length;
                for (n2 = n; n2 < n3; ++n2) {
                    this.select((int)object[n2]);
                }
                break block7;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(BUNDLE_EXPANDED);
            stringBuilder.append(string);
            stringBuilder = object.getStringArrayList(stringBuilder.toString());
            Object object3 = new StringBuilder();
            object3.append(BUNDLE_SELECTIONS);
            object3.append(string);
            object = object.getStringArrayList(object3.toString());
            int n4 = this.getItemCount();
            for (n = n2; n < n4; ++n) {
                object3 = this.getItem(n);
                string = String.valueOf((long)object3.getIdentifier());
                n2 = n4;
                if (stringBuilder != null) {
                    n2 = n4;
                    if (stringBuilder.contains((Object)string)) {
                        this.expand(n);
                        n2 = this.getItemCount();
                    }
                }
                if (object != null && object.contains((Object)string)) {
                    this.select(n);
                }
                AdapterUtil.restoreSubItemSelectionStatesForAlternativeStateManagement(object3, (List<String>)object);
                n4 = n2;
            }
        }
        return this;
    }

    public FastAdapter<Item> withSelectOnLongClick(boolean bl) {
        this.mSelectOnLongClick = bl;
        return this;
    }

    public FastAdapter<Item> withSelectWithItemUpdate(boolean bl) {
        this.mSelectWithItemUpdate = bl;
        return this;
    }

    public FastAdapter<Item> withSelectable(boolean bl) {
        this.mSelectable = bl;
        return this;
    }

    public FastAdapter<Item> withSelectionListener(ISelectionListener<Item> iSelectionListener) {
        this.mSelectionListener = iSelectionListener;
        return this;
    }

    public class OnBindViewHolderListenerImpl
    implements OnBindViewHolderListener {
        public final FastAdapter this$0;

        public OnBindViewHolderListenerImpl(FastAdapter fastAdapter) {
            this.this$0 = fastAdapter;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int n, List<Object> list) {
            Object Item = this.this$0.getItem(n);
            if (Item != null) {
                viewHolder.itemView.setTag(R.id.fastadapter_item, Item);
                Item.bindView((RecyclerView.ViewHolder)viewHolder, list);
            }
        }

        @Override
        public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder, int n) {
            IItem iItem = (IItem)viewHolder.itemView.getTag(R.id.fastadapter_item);
            boolean bl = iItem != null && iItem.failedToRecycle(viewHolder);
            return bl;
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder, int n) {
            IItem iItem = (IItem)viewHolder.itemView.getTag(R.id.fastadapter_item);
            if (iItem != null) {
                try {
                    iItem.attachToWindow(viewHolder);
                }
                catch (AbstractMethodError abstractMethodError) {
                    Log.e((String)"WTF", (String)abstractMethodError.toString());
                }
            }
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder, int n) {
            IItem iItem = (IItem)viewHolder.itemView.getTag(R.id.fastadapter_item);
            if (iItem != null) {
                iItem.detachFromWindow(viewHolder);
            }
        }

        @Override
        public void unBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int n) {
            Object object = viewHolder.itemView;
            n = R.id.fastadapter_item;
            if ((object = (IItem)object.getTag(n)) != null) {
                object.unbindView(viewHolder);
                viewHolder.itemView.setTag(n, null);
                viewHolder.itemView.setTag(R.id.fastadapter_item_adapter, null);
            } else {
                Log.e((String)FastAdapter.TAG, (String)"The bindView method of this item should set the `Tag` on its itemView (https://github.com/mikepenz/FastAdapter/blob/develop/library-core/src/main/java/com/mikepenz/fastadapter/items/AbstractItem.java#L189)");
            }
        }
    }

    public class OnCreateViewHolderListenerImpl
    implements OnCreateViewHolderListener {
        public final FastAdapter this$0;

        public OnCreateViewHolderListenerImpl(FastAdapter fastAdapter) {
            this.this$0 = fastAdapter;
        }

        @Override
        public RecyclerView.ViewHolder onPostCreateViewHolder(RecyclerView.ViewHolder viewHolder) {
            EventHookUtil.bind(viewHolder, this.this$0.eventHooks);
            return viewHolder;
        }

        @Override
        public RecyclerView.ViewHolder onPreCreateViewHolder(ViewGroup viewGroup, int n) {
            return this.this$0.getTypeInstance(n).getViewHolder(viewGroup);
        }
    }
}

