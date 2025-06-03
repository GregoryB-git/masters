/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.hintsolutions.raintv.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListViewHelper {
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ViewGroup.LayoutParams layoutParams;
        int n;
        if (listView == null) {
            return;
        }
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }
        int n2 = View.MeasureSpec.makeMeasureSpec((int)listView.getWidth(), (int)Integer.MIN_VALUE);
        int n3 = 0;
        for (n = 0; n < listAdapter.getCount(); ++n) {
            layoutParams = listAdapter.getView(n, null, (ViewGroup)listView);
            layoutParams.measure(n2, 0);
            n3 += layoutParams.getMeasuredHeight();
        }
        layoutParams = listView.getLayoutParams();
        n = listView.getDividerHeight();
        layoutParams.height = (listAdapter.getCount() - 1) * n + n3;
        listView.setLayoutParams(layoutParams);
        listView.requestLayout();
    }
}

