/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.stfalcon.frescoimageviewer.adapter;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

public abstract class ViewHolder {
    private static final String STATE = "ViewHolder";
    public final View itemView;
    public boolean mIsAttached;
    public int mPosition;

    public ViewHolder(View view) {
        if (view != null) {
            this.itemView = view;
            return;
        }
        throw new IllegalArgumentException("itemView should not be null");
    }

    public void attach(ViewGroup viewGroup, int n) {
        this.mIsAttached = true;
        this.mPosition = n;
        viewGroup.addView(this.itemView);
    }

    public void detach(ViewGroup viewGroup) {
        viewGroup.removeView(this.itemView);
        this.mIsAttached = false;
    }

    public void onRestoreInstanceState(Parcelable object) {
        String string2;
        if (object instanceof Bundle && (object = (object = (Bundle)object).containsKey(string2 = STATE) ? object.getSparseParcelableArray(string2) : null) != null) {
            this.itemView.restoreHierarchyState((SparseArray)object);
        }
    }

    public Parcelable onSaveInstanceState() {
        SparseArray sparseArray = new SparseArray();
        this.itemView.saveHierarchyState(sparseArray);
        Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray(STATE, sparseArray);
        return bundle;
    }
}

