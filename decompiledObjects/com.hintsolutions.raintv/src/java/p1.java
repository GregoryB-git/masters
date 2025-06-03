/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  kotlin.jvm.functions.Function1
 *  rx.functions.Action1
 *  tvrain.analytics.AnalyticsManager
 */
import com.hintsolutions.raintv.news.FavoritesFragment;
import kotlin.jvm.functions.Function1;
import rx.functions.Action1;
import tvrain.analytics.AnalyticsManager;

public final class p1
implements Action1 {
    public final int a;
    public final Function1 b;

    public /* synthetic */ p1(int n4, Function1 function1) {
        this.a = n4;
        this.b = function1;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                FavoritesFragment.e(object, this.b);
                return;
            }
        }
        AnalyticsManager.b((Object)object, (Function1)this.b);
    }
}

