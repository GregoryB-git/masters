/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;

public abstract class ViewGroupHierarchyChangeEvent
extends ViewEvent<ViewGroup> {
    private final View child;

    public ViewGroupHierarchyChangeEvent(@NonNull ViewGroup viewGroup, View view) {
        super(viewGroup);
        this.child = view;
    }

    @NonNull
    public final View child() {
        return this.child;
    }
}

