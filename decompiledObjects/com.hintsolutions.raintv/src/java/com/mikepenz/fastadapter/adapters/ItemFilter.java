/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.Filter
 *  android.widget.Filter$FilterResults
 *  com.mikepenz.fastadapter.IItem
 *  com.mikepenz.fastadapter.adapters.ItemAdapter
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.SafeVarargs
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package com.mikepenz.fastadapter.adapters;

import android.widget.Filter;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.IItemAdapter;
import com.mikepenz.fastadapter.adapters.ItemAdapter;
import com.mikepenz.fastadapter.listeners.ItemFilterListener;
import com.mikepenz.fastadapter.utils.IdDistributor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ItemFilter<Item extends IItem>
extends Filter {
    private CharSequence mConstraint;
    private IItemAdapter.Predicate<Item> mFilterPredicate;
    private ItemAdapter<Item> mItemAdapter;
    public ItemFilterListener<Item> mItemFilterListener;
    private List<Item> mOriginalItems;

    public ItemFilter(ItemAdapter<Item> itemAdapter) {
        this.mItemAdapter = itemAdapter;
    }

    public ItemAdapter<Item> add(int n, List<Item> charSequence) {
        if (this.mOriginalItems != null && charSequence.size() > 0) {
            if (this.mItemAdapter.isUseIdDistributor()) {
                IdDistributor.checkIds(charSequence);
            }
            this.mOriginalItems.addAll(this.getAdapterPosition((IItem)this.mItemAdapter.getAdapterItems().get(n)) - this.mItemAdapter.getFastAdapter().getPreItemCount(n), charSequence);
            charSequence = this.mConstraint;
            this.publishResults(charSequence, this.performFiltering(charSequence));
            return this.mItemAdapter;
        }
        return this.mItemAdapter.add(n, charSequence);
    }

    @SafeVarargs
    public final ItemAdapter<Item> add(int n, Item ... ItemArray) {
        return this.add(n, Arrays.asList((Object[])ItemArray));
    }

    public ItemAdapter<Item> add(List<Item> charSequence) {
        if (this.mOriginalItems != null && charSequence.size() > 0) {
            if (this.mItemAdapter.isUseIdDistributor()) {
                IdDistributor.checkIds(charSequence);
            }
            this.mOriginalItems.addAll(charSequence);
            charSequence = this.mConstraint;
            this.publishResults(charSequence, this.performFiltering(charSequence));
            return this.mItemAdapter;
        }
        return this.mItemAdapter.add(charSequence);
    }

    @SafeVarargs
    public final ItemAdapter<Item> add(Item ... ItemArray) {
        return this.add(Arrays.asList((Object[])ItemArray));
    }

    public ItemAdapter<Item> clear() {
        CharSequence charSequence = this.mOriginalItems;
        if (charSequence != null) {
            charSequence.clear();
            charSequence = this.mConstraint;
            this.publishResults(charSequence, this.performFiltering(charSequence));
            return this.mItemAdapter;
        }
        return this.mItemAdapter.clear();
    }

    public int getAdapterPosition(long l) {
        int n = this.mOriginalItems.size();
        for (int i = 0; i < n; ++i) {
            if (((IItem)this.mOriginalItems.get(i)).getIdentifier() != l) continue;
            return i;
        }
        return -1;
    }

    public int getAdapterPosition(Item Item) {
        return this.getAdapterPosition(Item.getIdentifier());
    }

    public CharSequence getConstraint() {
        return this.mConstraint;
    }

    public Set<Item> getSelectedItems() {
        if (this.mOriginalItems != null) {
            HashSet hashSet = new HashSet();
            int n = this.mOriginalItems.size();
            for (int i = 0; i < n; ++i) {
                IItem iItem = (IItem)this.mOriginalItems.get(i);
                if (!iItem.isSelected()) continue;
                hashSet.add((Object)iItem);
            }
            return hashSet;
        }
        return this.mItemAdapter.getFastAdapter().getSelectedItems();
    }

    public Set<Integer> getSelections() {
        if (this.mOriginalItems != null) {
            HashSet hashSet = new HashSet();
            int n = this.mItemAdapter.getFastAdapter().getPreItemCountByOrder(this.mItemAdapter.getOrder());
            int n2 = this.mOriginalItems.size();
            for (int i = 0; i < n2; ++i) {
                if (!((IItem)this.mOriginalItems.get(i)).isSelected()) continue;
                hashSet.add((Object)(i + n));
            }
            return hashSet;
        }
        return this.mItemAdapter.getFastAdapter().getSelections();
    }

    public ItemAdapter<Item> move(int n, int n2) {
        if (this.mOriginalItems != null) {
            int n3 = this.mItemAdapter.getFastAdapter().getPreItemCount(n);
            int n4 = this.getAdapterPosition((IItem)this.mItemAdapter.getAdapterItems().get(n));
            n = this.getAdapterPosition((IItem)this.mItemAdapter.getAdapterItems().get(n2));
            IItem iItem = this.mOriginalItems;
            n2 = n4 - n3;
            iItem = (IItem)iItem.get(n2);
            this.mOriginalItems.remove(n2);
            this.mOriginalItems.add(n - n3, (Object)iItem);
            this.performFiltering(this.mConstraint);
            return this.mItemAdapter;
        }
        return this.mItemAdapter.move(n, n2);
    }

    public Filter.FilterResults performFiltering(CharSequence object) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (this.mOriginalItems == null && (object == null || object.length() == 0)) {
            return filterResults;
        }
        if (this.mItemAdapter.getFastAdapter().isPositionBasedStateManagement()) {
            this.mItemAdapter.getFastAdapter().deselect();
        }
        this.mItemAdapter.getFastAdapter().collapse(false);
        this.mConstraint = object;
        if (this.mOriginalItems == null) {
            this.mOriginalItems = new ArrayList((Collection)this.mItemAdapter.getAdapterItems());
        }
        if (object != null && object.length() != 0) {
            List list;
            ArrayList arrayList = new ArrayList();
            if (this.mFilterPredicate != null) {
                Iterator iterator = this.mOriginalItems.iterator();
                while (true) {
                    list = arrayList;
                    if (iterator.hasNext()) {
                        list = (IItem)iterator.next();
                        if (this.mFilterPredicate.filter(list, (CharSequence)object)) continue;
                        arrayList.add((Object)list);
                        continue;
                    }
                    break;
                }
            } else {
                list = this.mItemAdapter.getAdapterItems();
            }
            filterResults.values = list;
            filterResults.count = list.size();
        } else {
            object = this.mOriginalItems;
            filterResults.values = object;
            filterResults.count = object.size();
            this.mOriginalItems = null;
            object = this.mItemFilterListener;
            if (object != null) {
                object.onReset();
            }
        }
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        ItemFilterListener<Item> itemFilterListener = filterResults.values;
        if (itemFilterListener != null) {
            this.mItemAdapter.set((List)itemFilterListener, false);
        }
        if ((itemFilterListener = this.mItemFilterListener) != null) {
            itemFilterListener.itemsFiltered(charSequence, (List)filterResults.values);
        }
    }

    public ItemAdapter<Item> remove(int n) {
        CharSequence charSequence = this.mOriginalItems;
        if (charSequence != null) {
            charSequence.remove(this.getAdapterPosition((IItem)this.mItemAdapter.getAdapterItems().get(n)) - this.mItemAdapter.getFastAdapter().getPreItemCount(n));
            charSequence = this.mConstraint;
            this.publishResults(charSequence, this.performFiltering(charSequence));
            return this.mItemAdapter;
        }
        return this.mItemAdapter.remove(n);
    }

    public ItemAdapter<Item> removeRange(int n, int n2) {
        CharSequence charSequence = this.mOriginalItems;
        if (charSequence != null) {
            int n3 = charSequence.size();
            int n4 = this.mItemAdapter.getFastAdapter().getPreItemCount(n);
            n3 = Math.min((int)n2, (int)(n3 - n + n4));
            for (n2 = 0; n2 < n3; ++n2) {
                this.mOriginalItems.remove(n - n4);
            }
            charSequence = this.mConstraint;
            this.publishResults(charSequence, this.performFiltering(charSequence));
            return this.mItemAdapter;
        }
        return this.mItemAdapter.removeRange(n, n2);
    }

    public ItemAdapter<Item> set(int n, Item object) {
        if (this.mOriginalItems != null) {
            if (this.mItemAdapter.isUseIdDistributor()) {
                IdDistributor.checkId(object);
            }
            this.mOriginalItems.set(this.getAdapterPosition((IItem)this.mItemAdapter.getAdapterItems().get(n)) - this.mItemAdapter.getFastAdapter().getPreItemCount(n), object);
            object = this.mConstraint;
            this.publishResults((CharSequence)object, this.performFiltering((CharSequence)object));
            return this.mItemAdapter;
        }
        return this.mItemAdapter.set(n, object);
    }

    public ItemFilter<Item> withFilterPredicate(IItemAdapter.Predicate<Item> predicate) {
        this.mFilterPredicate = predicate;
        return this;
    }

    public ItemFilter<Item> withItemFilterListener(ItemFilterListener<Item> itemFilterListener) {
        this.mItemFilterListener = itemFilterListener;
        return this;
    }
}

