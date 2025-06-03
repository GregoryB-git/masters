/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 *  java.lang.String
 */
import android.view.View;
import com.hintsolutions.raintv.search.SearchSuggestionsAdapter;

public final class j4
implements View.OnClickListener {
    public final int a;
    public final SearchSuggestionsAdapter b;
    public final String c;

    public /* synthetic */ j4(SearchSuggestionsAdapter searchSuggestionsAdapter, String string2, int n) {
        this.a = n;
        this.b = searchSuggestionsAdapter;
        this.c = string2;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                SearchSuggestionsAdapter.b(this.b, this.c, view);
                return;
            }
        }
        SearchSuggestionsAdapter.a(this.b, this.c, view);
    }
}

