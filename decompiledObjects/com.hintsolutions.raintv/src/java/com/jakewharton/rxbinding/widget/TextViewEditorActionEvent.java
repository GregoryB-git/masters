/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.widget.TextView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class TextViewEditorActionEvent
extends ViewEvent<TextView> {
    private final int actionId;
    private final KeyEvent keyEvent;

    private TextViewEditorActionEvent(@NonNull TextView textView, int n, @NonNull KeyEvent keyEvent) {
        super(textView);
        this.actionId = n;
        this.keyEvent = keyEvent;
    }

    @CheckResult
    @NonNull
    public static TextViewEditorActionEvent create(@NonNull TextView textView, int n, @NonNull KeyEvent keyEvent) {
        return new TextViewEditorActionEvent(textView, n, keyEvent);
    }

    public int actionId() {
        return this.actionId;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof TextViewEditorActionEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (TextViewEditorActionEvent)object)).view() != this.view() || ((TextViewEditorActionEvent)object).actionId != this.actionId || !((TextViewEditorActionEvent)object).keyEvent.equals((Object)this.keyEvent)) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n = ((TextView)this.view()).hashCode();
        int n2 = this.actionId;
        return this.keyEvent.hashCode() + ((n + 629) * 37 + n2) * 37;
    }

    @NonNull
    public KeyEvent keyEvent() {
        return this.keyEvent;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("TextViewEditorActionEvent{view=");
        stringBuilder.append(this.view());
        stringBuilder.append(", actionId=");
        stringBuilder.append(this.actionId);
        stringBuilder.append(", keyEvent=");
        stringBuilder.append((Object)this.keyEvent);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

