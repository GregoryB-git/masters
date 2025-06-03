/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.SafeVarargs
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package com.mikepenz.fastadapter.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mikepenz.fastadapter.AbstractAdapter;
import com.mikepenz.fastadapter.IExpandable;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.IItemAdapter;
import com.mikepenz.fastadapter.ISubItem;
import com.mikepenz.fastadapter.adapters.ItemFilter;
import com.mikepenz.fastadapter.utils.IdDistributor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemAdapter<Item extends IItem>
extends AbstractAdapter<Item>
implements IItemAdapter<Item> {
    public Comparator<Item> mComparator;
    private ItemFilter<Item> mItemFilter;
    private List<Item> mItems = new ArrayList();
    private boolean mUseIdDistributor = true;

    public ItemAdapter() {
        this.mItemFilter = new ItemFilter(this);
    }

    @Override
    public ItemAdapter<Item> add(int n4, List<Item> list) {
        if (this.mUseIdDistributor) {
            IdDistributor.checkIds(list);
        }
        if (list != null && list.size() > 0) {
            this.mItems.addAll(n4 - this.getFastAdapter().getPreItemCountByOrder(this.getOrder()), list);
            this.mapPossibleTypes(list);
            this.getFastAdapter().notifyAdapterItemRangeInserted(n4, list.size());
        }
        return this;
    }

    @Override
    @SafeVarargs
    public final ItemAdapter<Item> add(int n4, Item ... ItemArray) {
        return this.add(n4, Arrays.asList((Object[])ItemArray));
    }

    @Override
    public ItemAdapter<Item> add(List<Item> list) {
        if (this.mUseIdDistributor) {
            IdDistributor.checkIds(list);
        }
        int n4 = this.mItems.size();
        this.mItems.addAll(list);
        this.mapPossibleTypes(list);
        Comparator<Item> comparator = this.mComparator;
        if (comparator == null) {
            this.getFastAdapter().notifyAdapterItemRangeInserted(this.getFastAdapter().getPreItemCountByOrder(this.getOrder()) + n4, list.size());
        } else {
            Collections.sort(this.mItems, comparator);
            this.getFastAdapter().notifyAdapterDataSetChanged();
        }
        return this;
    }

    @Override
    @SafeVarargs
    public final ItemAdapter<Item> add(Item ... ItemArray) {
        return this.add(Arrays.asList((Object[])ItemArray));
    }

    @Override
    public ItemAdapter<Item> clear() {
        int n4 = this.mItems.size();
        this.mItems.clear();
        this.getFastAdapter().notifyAdapterItemRangeRemoved(this.getFastAdapter().getPreItemCountByOrder(this.getOrder()), n4);
        return this;
    }

    public void filter(@Nullable CharSequence charSequence) {
        this.mItemFilter.filter(charSequence);
    }

    @Override
    public Item getAdapterItem(int n4) {
        return (Item)((IItem)this.mItems.get(n4));
    }

    @Override
    public int getAdapterItemCount() {
        return this.mItems.size();
    }

    @Override
    public List<Item> getAdapterItems() {
        return this.mItems;
    }

    @Override
    public int getAdapterPosition(long l4) {
        int n4 = this.mItems.size();
        for (int j = 0; j < n4; ++j) {
            if (((IItem)this.mItems.get(j)).getIdentifier() != l4) continue;
            return j;
        }
        return -1;
    }

    @Override
    public int getAdapterPosition(Item Item) {
        return this.getAdapterPosition(Item.getIdentifier());
    }

    public Comparator<Item> getComparator() {
        return this.mComparator;
    }

    @Override
    public int getGlobalPosition(int n4) {
        return this.getFastAdapter().getPreItemCountByOrder(this.getOrder()) + n4;
    }

    @NonNull
    public ItemFilter<Item> getItemFilter() {
        return this.mItemFilter;
    }

    @Override
    public int getOrder() {
        return 500;
    }

    public boolean isUseIdDistributor() {
        return this.mUseIdDistributor;
    }

    public ItemAdapter<Item> move(int n4, int n5) {
        int n6 = this.getFastAdapter().getPreItemCount(n4);
        Object object = this.mItems;
        int n7 = n4 - n6;
        object = (IItem)object.get(n7);
        this.mItems.remove(n7);
        this.mItems.add(n5 - n6, object);
        this.getFastAdapter().notifyAdapterItemMoved(n4, n5);
        return this;
    }

    public void remapMappedTypes() {
        this.clearMappedTypes();
        this.mapPossibleTypes(this.mItems);
    }

    @Override
    public ItemAdapter<Item> remove(int n4) {
        this.mItems.remove(n4 - this.getFastAdapter().getPreItemCount(n4));
        this.getFastAdapter().notifyAdapterItemRemoved(n4);
        return this;
    }

    @Override
    public ItemAdapter<Item> removeRange(int n4, int n5) {
        int n6 = this.mItems.size();
        int n7 = this.getFastAdapter().getPreItemCount(n4);
        n6 = Math.min((int)n5, (int)(n6 - n4 + n7));
        for (n5 = 0; n5 < n6; ++n5) {
            this.mItems.remove(n4 - n7);
        }
        this.getFastAdapter().notifyAdapterItemRangeRemoved(n4, n6);
        return this;
    }

    @Override
    public ItemAdapter<Item> set(int n4, Item Item) {
        if (this.mUseIdDistributor) {
            IdDistributor.checkId(Item);
        }
        this.mItems.set(n4 - this.getFastAdapter().getPreItemCount(n4), Item);
        this.mapPossibleType(Item);
        this.getFastAdapter().notifyAdapterItemChanged(n4);
        return this;
    }

    @Override
    public ItemAdapter<Item> set(List<Item> list) {
        return this.set(list, true);
    }

    public ItemAdapter<Item> set(List<Item> list, boolean bl) {
        if (this.mUseIdDistributor) {
            IdDistributor.checkIds(list);
        }
        if (bl && this.getItemFilter() != null && this.getItemFilter().getConstraint() != null) {
            this.getItemFilter().performFiltering(null);
        }
        this.getFastAdapter().collapse(false);
        int n4 = list.size();
        int n5 = this.mItems.size();
        int n6 = this.getFastAdapter().getPreItemCountByOrder(this.getOrder());
        List<Item> list2 = this.mItems;
        if (list != list2) {
            if (!list2.isEmpty()) {
                this.mItems.clear();
            }
            this.mItems.addAll(list);
        }
        this.mapPossibleTypes(list);
        list = this.mComparator;
        if (list != null) {
            Collections.sort(this.mItems, list);
        }
        if (n4 > n5) {
            if (n5 > 0) {
                this.getFastAdapter().notifyAdapterItemRangeChanged(n6, n5);
            }
            this.getFastAdapter().notifyAdapterItemRangeInserted(n6 + n5, n4 - n5);
        } else if (n4 > 0) {
            this.getFastAdapter().notifyAdapterItemRangeChanged(n6, n4);
            if (n4 < n5) {
                this.getFastAdapter().notifyAdapterItemRangeRemoved(n6 + n4, n5 - n4);
            }
        } else if (n4 == 0) {
            this.getFastAdapter().notifyAdapterItemRangeRemoved(n6, n5);
        } else {
            this.getFastAdapter().notifyAdapterDataSetChanged();
        }
        return this;
    }

    @Override
    public ItemAdapter<Item> setNewList(List<Item> list) {
        return this.setNewList(list, false);
    }

    public ItemAdapter<Item> setNewList(List<Item> comparator, boolean bl) {
        CharSequence charSequence;
        if (this.mUseIdDistributor) {
            IdDistributor.checkIds(comparator);
        }
        ItemFilter<Item> itemFilter = this.getItemFilter();
        CharSequence charSequence2 = charSequence = null;
        if (itemFilter != null) {
            charSequence2 = charSequence;
            if (this.getItemFilter().getConstraint() != null) {
                charSequence2 = this.getItemFilter().getConstraint();
                this.getItemFilter().performFiltering(null);
            }
        }
        this.mItems = comparator = new Comparator<Item>(comparator);
        this.mapPossibleTypes(comparator);
        comparator = this.mComparator;
        if (comparator != null) {
            Collections.sort(this.mItems, comparator);
        }
        if (charSequence2 != null && bl) {
            this.getItemFilter().filter(charSequence2);
        } else {
            this.getFastAdapter().notifyAdapterDataSetChanged();
        }
        return this;
    }

    @Override
    public <T extends IItem & IExpandable<T, S>, S extends IItem & ISubItem<Item, T>> T setSubItems(T t4, List<S> list) {
        if (this.mUseIdDistributor) {
            IdDistributor.checkIds(list);
        }
        return (T)((IItem)((IExpandable<T, S>)t4).withSubItems(list));
    }

    public ItemAdapter<Item> withComparator(Comparator<Item> comparator) {
        return this.withComparator(comparator, true);
    }

    public ItemAdapter<Item> withComparator(Comparator<Item> comparator, boolean bl) {
        this.mComparator = comparator;
        List<Item> list = this.mItems;
        if (list != null && comparator != null && bl) {
            Collections.sort(list, comparator);
            this.getFastAdapter().notifyAdapterDataSetChanged();
        }
        return this;
    }

    public ItemAdapter<Item> withItemFilter(@NonNull ItemFilter<Item> itemFilter) {
        this.mItemFilter = itemFilter;
        return this;
    }

    public ItemAdapter withUseIdDistributor(boolean bl) {
        this.mUseIdDistributor = bl;
        return this;
    }
}

