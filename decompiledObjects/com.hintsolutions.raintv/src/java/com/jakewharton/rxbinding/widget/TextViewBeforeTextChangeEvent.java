/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.widget;

import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;
import com.jakewharton.rxbinding.widget.TextViewAfterTextChangeEvent;

public final class TextViewBeforeTextChangeEvent
extends ViewEvent<TextView> {
    private final int after;
    private final int count;
    private final int start;
    private final CharSequence text;

    private TextViewBeforeTextChangeEvent(@NonNull TextView textView, @NonNull CharSequence charSequence, int n, int n2, int n3) {
        super(textView);
        this.text = charSequence;
        this.start = n;
        this.count = n2;
        this.after = n3;
    }

    @CheckResult
    @NonNull
    public static TextViewBeforeTextChangeEvent create(@NonNull TextView textView, @NonNull CharSequence charSequence, int n, int n2, int n3) {
        return new TextViewBeforeTextChangeEvent(textView, charSequence, n, n2, n3);
    }

    public int after() {
        return this.after;
    }

    public int count() {
        return this.count;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof TextViewAfterTextChangeEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (TextViewBeforeTextChangeEvent)object)).view() != this.view() || !this.text.equals((Object)((TextViewBeforeTextChangeEvent)object).text) || this.start != ((TextViewBeforeTextChangeEvent)object).start || this.count != ((TextViewBeforeTextChangeEvent)object).count || this.after != ((TextViewBeforeTextChangeEvent)object).after) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n = ((TextView)this.view()).hashCode();
        return (((this.text.hashCode() + (n + 629) * 37) * 37 + this.start) * 37 + this.count) * 37 + this.after;
    }

    public int start() {
        return this.start;
    }

    @NonNull
    public CharSequence text() {
        return this.text;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("TextViewBeforeTextChangeEvent{text=");
        stringBuilder.append((Object)this.text);
        stringBuilder.append(", start=");
        stringBuilder.append(this.start);
        stringBuilder.append(", count=");
        stringBuilder.append(this.count);
        stringBuilder.append(", after=");
        stringBuilder.append(this.after);
        stringBuilder.append(", view=");
        stringBuilder.append(this.view());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

