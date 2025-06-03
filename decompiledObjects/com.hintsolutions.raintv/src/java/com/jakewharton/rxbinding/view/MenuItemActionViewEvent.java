/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.view;

import android.view.MenuItem;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.MenuItemEvent;

public final class MenuItemActionViewEvent
extends MenuItemEvent<MenuItem> {
    private final Kind kind;

    private MenuItemActionViewEvent(@NonNull MenuItem menuItem, @NonNull Kind kind) {
        super(menuItem);
        this.kind = kind;
    }

    @CheckResult
    @NonNull
    public static MenuItemActionViewEvent create(@NonNull MenuItem menuItem, @NonNull Kind kind) {
        return new MenuItemActionViewEvent(menuItem, kind);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && MenuItemActionViewEvent.class == object.getClass()) {
            object = (MenuItemActionViewEvent)object;
            if (!this.menuItem().equals(((MenuItemEvent)object).menuItem())) {
                return false;
            }
            if (this.kind != ((MenuItemActionViewEvent)object).kind) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        int n = this.menuItem().hashCode();
        return this.kind.hashCode() + n * 31;
    }

    @NonNull
    public Kind kind() {
        return this.kind;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("MenuItemActionViewEvent{menuItem=");
        stringBuilder.append(this.menuItem());
        stringBuilder.append(", kind=");
        stringBuilder.append((Object)this.kind);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

