/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.jakewharton.rxbinding.view;

import android.view.View;
import androidx.annotation.NonNull;

public abstract class ViewEvent<T extends View> {
    private final T view;

    public ViewEvent(@NonNull T t) {
        this.view = t;
    }

    @NonNull
    public T view() {
        return this.view;
    }
}

