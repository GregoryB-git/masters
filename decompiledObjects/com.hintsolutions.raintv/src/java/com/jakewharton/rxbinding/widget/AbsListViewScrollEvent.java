/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AbsListView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.widget;

import android.widget.AbsListView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class AbsListViewScrollEvent
extends ViewEvent<AbsListView> {
    private final int firstVisibleItem;
    private final int scrollState;
    private final int totalItemCount;
    private final int visibleItemCount;

    private AbsListViewScrollEvent(@NonNull AbsListView absListView, int n, int n2, int n3, int n4) {
        super(absListView);
        this.scrollState = n;
        this.firstVisibleItem = n2;
        this.visibleItemCount = n3;
        this.totalItemCount = n4;
    }

    @CheckResult
    @NonNull
    public static AbsListViewScrollEvent create(AbsListView absListView, int n, int n2, int n3, int n4) {
        return new AbsListViewScrollEvent(absListView, n, n2, n3, n4);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && AbsListViewScrollEvent.class == object.getClass()) {
            object = (AbsListViewScrollEvent)object;
            if (this.scrollState != ((AbsListViewScrollEvent)object).scrollState) {
                return false;
            }
            if (this.firstVisibleItem != ((AbsListViewScrollEvent)object).firstVisibleItem) {
                return false;
            }
            if (this.visibleItemCount != ((AbsListViewScrollEvent)object).visibleItemCount) {
                return false;
            }
            if (this.totalItemCount != ((AbsListViewScrollEvent)object).totalItemCount) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int firstVisibleItem() {
        return this.firstVisibleItem;
    }

    public int hashCode() {
        return ((this.scrollState * 31 + this.firstVisibleItem) * 31 + this.visibleItemCount) * 31 + this.totalItemCount;
    }

    public int scrollState() {
        return this.scrollState;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("AbsListViewScrollEvent{scrollState=");
        stringBuilder.append(this.scrollState);
        stringBuilder.append(", firstVisibleItem=");
        stringBuilder.append(this.firstVisibleItem);
        stringBuilder.append(", visibleItemCount=");
        stringBuilder.append(this.visibleItemCount);
        stringBuilder.append(", totalItemCount=");
        return a.n(stringBuilder, this.totalItemCount, '}');
    }

    public int totalItemCount() {
        return this.totalItemCount;
    }

    public int visibleItemCount() {
        return this.visibleItemCount;
    }
}

