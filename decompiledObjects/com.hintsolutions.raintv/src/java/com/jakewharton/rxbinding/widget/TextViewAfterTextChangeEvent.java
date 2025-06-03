/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.widget.TextView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.widget;

import android.text.Editable;
import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class TextViewAfterTextChangeEvent
extends ViewEvent<TextView> {
    private final Editable editable;

    private TextViewAfterTextChangeEvent(@NonNull TextView textView, @NonNull Editable editable) {
        super(textView);
        this.editable = editable;
    }

    @CheckResult
    @NonNull
    public static TextViewAfterTextChangeEvent create(@NonNull TextView textView, @NonNull Editable editable) {
        return new TextViewAfterTextChangeEvent(textView, editable);
    }

    @NonNull
    public Editable editable() {
        return this.editable;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof TextViewAfterTextChangeEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (TextViewAfterTextChangeEvent)object)).view() != this.view() || !this.editable.equals((Object)((TextViewAfterTextChangeEvent)object).editable)) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n = ((TextView)this.view()).hashCode();
        return this.editable.hashCode() + (n + 629) * 37;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("TextViewAfterTextChangeEvent{editable=");
        stringBuilder.append((Object)this.editable);
        stringBuilder.append(", view=");
        stringBuilder.append(this.view());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

