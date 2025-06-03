/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter
 *  java.lang.Object
 */
import android.view.View;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;

public final class l
implements View.OnClickListener {
    public final int a;

    public /* synthetic */ l(int n) {
        this.a = n;
    }

    public final void onClick(View view) {
        AllNewsSectionedAdapter.g((int)this.a, (View)view);
    }
}

