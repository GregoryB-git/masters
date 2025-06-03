/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.widget.AutoCompleteTextView
 *  com.hintsolutions.raintv.search.SearchActivity
 *  java.lang.Object
 */
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.hintsolutions.raintv.search.SearchActivity;

public final class i4
implements View.OnLayoutChangeListener {
    public final SearchActivity a;
    public final View b;
    public final AutoCompleteTextView c;

    public /* synthetic */ i4(SearchActivity searchActivity, View view, AutoCompleteTextView autoCompleteTextView) {
        this.a = searchActivity;
        this.b = view;
        this.c = autoCompleteTextView;
    }

    public final void onLayoutChange(View view, int n, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        SearchActivity.H((SearchActivity)this.a, (View)this.b, (AutoCompleteTextView)this.c, (View)view, (int)n, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9);
    }
}

