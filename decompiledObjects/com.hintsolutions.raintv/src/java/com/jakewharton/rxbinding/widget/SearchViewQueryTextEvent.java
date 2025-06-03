/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SearchView
 *  androidx.annotation.CheckResult
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.jakewharton.rxbinding.widget;

import android.widget.SearchView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class SearchViewQueryTextEvent
extends ViewEvent<SearchView> {
    private final CharSequence queryText;
    private final boolean submitted;

    private SearchViewQueryTextEvent(@NonNull SearchView searchView, @NonNull CharSequence charSequence, boolean bl) {
        super(searchView);
        this.queryText = charSequence;
        this.submitted = bl;
    }

    @CheckResult
    @NonNull
    public static SearchViewQueryTextEvent create(@NonNull SearchView searchView, @NonNull CharSequence charSequence, boolean bl) {
        return new SearchViewQueryTextEvent(searchView, charSequence, bl);
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (object == this) {
            return true;
        }
        if (!(object instanceof SearchViewQueryTextEvent)) {
            return false;
        }
        if (((ViewEvent)(object = (SearchViewQueryTextEvent)object)).view() != this.view() || !((SearchViewQueryTextEvent)object).queryText.equals((Object)this.queryText) || ((SearchViewQueryTextEvent)object).submitted != this.submitted) {
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n = ((SearchView)this.view()).hashCode();
        return (this.queryText.hashCode() + (n + 629) * 37) * 37 + this.submitted;
    }

    public boolean isSubmitted() {
        return this.submitted;
    }

    @NonNull
    public CharSequence queryText() {
        return this.queryText;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("SearchViewQueryTextEvent{view=");
        stringBuilder.append(this.view());
        stringBuilder.append(", queryText=");
        stringBuilder.append((Object)this.queryText);
        stringBuilder.append(", submitted=");
        stringBuilder.append(this.submitted);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

