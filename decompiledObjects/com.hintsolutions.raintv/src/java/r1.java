/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.hintsolutions.raintv.news.FavoritesFragment
 *  java.lang.Object
 */
import android.view.View;
import com.hintsolutions.raintv.news.FavoritesFragment;

public final class r1
implements View.OnClickListener {
    public final int a;
    public final FavoritesFragment b;

    public /* synthetic */ r1(FavoritesFragment favoritesFragment, int n) {
        this.a = n;
        this.b = favoritesFragment;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                FavoritesFragment.g((FavoritesFragment)this.b, (View)view);
                return;
            }
            case 0: {
                FavoritesFragment.c((FavoritesFragment)this.b, (View)view);
                return;
            }
        }
        FavoritesFragment.d((FavoritesFragment)this.b, (View)view);
    }
}

