/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.jakewharton.rxbinding.view;

import android.view.MenuItem;
import androidx.annotation.NonNull;

public abstract class MenuItemEvent<T extends MenuItem> {
    private final T menuItem;

    public MenuItemEvent(@NonNull T t) {
        this.menuItem = t;
    }

    @NonNull
    public T menuItem() {
        return this.menuItem;
    }
}

