/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  kotlin.jvm.functions.Function1
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.profile.AuthorizationActivity;
import com.hintsolutions.raintv.profile.SavedVideosFragment;
import kotlin.jvm.functions.Function1;
import rx.functions.Action1;

public final class s
implements Action1 {
    public final int a;
    public final Object b;

    public /* synthetic */ s(Object object, int n4) {
        this.a = n4;
        this.b = object;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                AuthorizationActivity.J(object, (Function1)this.b);
                return;
            }
            case 0: {
                AuthorizationActivity.E(object, (Function1)this.b);
                return;
            }
        }
        SavedVideosFragment.c((SavedVideosFragment)((Object)this.b), (Throwable)object);
    }
}

