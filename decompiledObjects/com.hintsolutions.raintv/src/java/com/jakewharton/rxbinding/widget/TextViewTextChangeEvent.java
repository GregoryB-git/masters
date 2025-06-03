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

public final class TextViewTextChangeEvent
extends ViewEvent<TextView> {
    private final int before;
    private final int count;
    private final int start;
    private final CharSequence text;

    private TextViewTextChangeEvent(@NonNull TextView textView, @NonNull CharSequence charSequence, int n, int n2, int n3) {
        super(textView);
        this.text = charSequence;
        this.start = n;
        this.before = n2;
        this.count = n3;
    }

    @CheckResult
    @NonNull
    public static TextViewTextChangeEvent create(@NonNull TextView textView, @NonNull CharSequence charSequence, int n, int n2, int n3) {
        return new TextViewTextChangeEvent(textView, charSequence, n, n2, n3);
    }

    public int before() {
        return this.before;
    }

    public int count() {
        return this.count;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof TextViewTextChangeEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (TextViewTextChangeEvent)object)).view() != this.view() || !this.text.equals((Object)((TextViewTextChangeEvent)object).text) || this.start != ((TextViewTextChangeEvent)object).start || this.before != ((TextViewTextChangeEvent)object).before || this.count != ((TextViewTextChangeEvent)object).count) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n = ((TextView)this.view()).hashCode();
        return (((this.text.hashCode() + (n + 629) * 37) * 37 + this.start) * 37 + this.before) * 37 + this.count;
    }

    public int start() {
        return this.start;
    }

    @NonNull
    public CharSequence text() {
        return this.text;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("TextViewTextChangeEvent{text=");
        stringBuilder.append((Object)this.text);
        stringBuilder.append(", start=");
        stringBuilder.append(this.start);
        stringBuilder.append(", before=");
        stringBuilder.append(this.before);
        stringBuilder.append(", count=");
        stringBuilder.append(this.count);
        stringBuilder.append(", view=");
        stringBuilder.append(this.view());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

