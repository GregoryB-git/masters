/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.news.AllNewsFragment;
import java.util.ArrayList;
import rx.functions.Action1;

public final class k
implements Action1 {
    public final int a;
    public final AllNewsFragment b;

    public /* synthetic */ k(AllNewsFragment allNewsFragment, int n4) {
        this.a = n4;
        this.b = allNewsFragment;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                AllNewsFragment.b(this.b, (ArrayList)object);
                return;
            }
        }
        AllNewsFragment.c(this.b, (Throwable)object);
    }
}

