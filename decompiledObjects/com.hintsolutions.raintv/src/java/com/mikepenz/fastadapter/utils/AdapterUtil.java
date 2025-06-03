/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  androidx.collection.ArraySet
 *  com.mikepenz.fastadapter.FastAdapter
 *  com.mikepenz.fastadapter.IItem
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Set
 */
package com.mikepenz.fastadapter.utils;

import android.util.SparseIntArray;
import androidx.collection.ArraySet;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IExpandable;
import com.mikepenz.fastadapter.IItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AdapterUtil {
    public static <Item extends IItem> void addAllSubItems(Item object, List<Item> list) {
        if (object instanceof IExpandable && !(object = (IExpandable)object).isExpanded() && object.getSubItems() != null) {
            List list2 = object.getSubItems();
            int n = list2.size();
            for (int i = 0; i < n; ++i) {
                object = (IItem)list2.get(i);
                list.add(object);
                AdapterUtil.addAllSubItems(object, list);
            }
        }
    }

    public static SparseIntArray adjustPosition(SparseIntArray sparseIntArray, int n, int n2, int n3) {
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        int n4 = sparseIntArray.size();
        for (int i = 0; i < n4; ++i) {
            int n5 = sparseIntArray.keyAt(i);
            if (n5 >= n && n5 <= n2) {
                if (n3 > 0) {
                    sparseIntArray2.put(n5 + n3, sparseIntArray.valueAt(i));
                    continue;
                }
                if (n3 >= 0 || n5 > n + n3 && n5 <= n) continue;
                sparseIntArray2.put(n5 + n3, sparseIntArray.valueAt(i));
                continue;
            }
            sparseIntArray2.put(n5, sparseIntArray.valueAt(i));
        }
        return sparseIntArray2;
    }

    public static Set<Integer> adjustPosition(Set<Integer> iterator, int n, int n2, int n3) {
        ArraySet arraySet = new ArraySet();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            int n4 = (Integer)iterator.next();
            if (n4 >= n && n4 <= n2) {
                if (n3 > 0) {
                    arraySet.add((Object)(n4 + n3));
                    continue;
                }
                if (n3 >= 0 || n4 > n + n3 && n4 <= n) continue;
                arraySet.add((Object)(n4 + n3));
                continue;
            }
            arraySet.add((Object)n4);
        }
        return arraySet;
    }

    public static <Item extends IItem> void findSubItemSelections(Item object, List<String> list) {
        if (object instanceof IExpandable && !(object = (IExpandable)object).isExpanded() && object.getSubItems() != null) {
            List list2 = object.getSubItems();
            int n = list2.size();
            for (int i = 0; i < n; ++i) {
                object = (IItem)list2.get(i);
                long l = object.getIdentifier();
                if (object.isSelected()) {
                    list.add((Object)String.valueOf((long)l));
                }
                AdapterUtil.findSubItemSelections(object, list);
            }
        }
    }

    public static <Item extends IItem> List<Item> getAllItems(FastAdapter<Item> fastAdapter) {
        int n = fastAdapter.getItemCount();
        ArrayList arrayList = new ArrayList(n);
        for (int i = 0; i < n; ++i) {
            IItem iItem = fastAdapter.getItem(i);
            arrayList.add((Object)iItem);
            AdapterUtil.addAllSubItems(iItem, arrayList);
        }
        return arrayList;
    }

    public static <Item extends IItem> void handleStates(FastAdapter<Item> fastAdapter, int n, int n2) {
        while (n2 >= n) {
            IItem iItem = fastAdapter.getItem(n2);
            if (iItem != null) {
                if (iItem.isSelected()) {
                    fastAdapter.getSelections().add((Object)n2);
                } else if (fastAdapter.getSelections().contains((Object)n2)) {
                    fastAdapter.getSelections().remove((Object)n2);
                }
                if (iItem instanceof IExpandable && ((IExpandable)iItem).isExpanded() && fastAdapter.getExpanded().indexOfKey(n2) < 0) {
                    fastAdapter.expand(n2);
                }
            }
            --n2;
        }
    }

    public static <Item extends IItem> void restoreSubItemSelectionStatesForAlternativeStateManagement(Item object, List<String> list) {
        if (object instanceof IExpandable && !(object = (IExpandable)object).isExpanded() && object.getSubItems() != null) {
            List list2 = object.getSubItems();
            int n = list2.size();
            for (int i = 0; i < n; ++i) {
                object = (IItem)list2.get(i);
                long l = object.getIdentifier();
                if (list != null && list.contains((Object)String.valueOf((long)l))) {
                    object.withSetSelected(true);
                }
                AdapterUtil.restoreSubItemSelectionStatesForAlternativeStateManagement(object, list);
            }
        }
    }
}

