/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$OnScrollListener
 *  androidx.recyclerview.widget.StaggeredGridLayoutManager
 *  com.hintsolutions.raintv.utils.RecyclerViewPageUtils$1
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 */
package com.hintsolutions.raintv.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.hintsolutions.raintv.utils.RecyclerViewPageUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RecyclerViewPageUtils {
    public static /* synthetic */ int access$000(RecyclerView recyclerView) {
        return RecyclerViewPageUtils.getLastVisibleItemPosition(recyclerView);
    }

    private static int getLastVisibleItemPosition(RecyclerView recyclerView) {
        Object object = recyclerView.getLayoutManager().getClass();
        if (object != LinearLayoutManager.class && !LinearLayoutManager.class.isAssignableFrom(object)) {
            if (object != StaggeredGridLayoutManager.class && !StaggeredGridLayoutManager.class.isAssignableFrom(object)) {
                recyclerView = z2.t("Unknown LayoutManager class: ");
                recyclerView.append(object.toString());
                throw new IllegalArgumentException(recyclerView.toString());
            }
            object = ((StaggeredGridLayoutManager)recyclerView.getLayoutManager()).findLastVisibleItemPositions(null);
            recyclerView = new ArrayList();
            int n = ((Class)object).length;
            for (int i = 0; i < n; ++i) {
                recyclerView.add((Object)((int)object[i]));
            }
            return (Integer)Collections.max((Collection)recyclerView);
        }
        return ((LinearLayoutManager)recyclerView.getLayoutManager()).findLastVisibleItemPosition();
    }

    public static void setPaging(RecyclerView recyclerView, int n, GetNextPageListener getNextPageListener) {
        recyclerView.addOnScrollListener((RecyclerView.OnScrollListener)new 1(n, getNextPageListener));
    }

    public static interface GetNextPageListener {
        public void onNext();
    }
}

