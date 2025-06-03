/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.util.Predicate
 *  java.lang.Object
 */
import androidx.core.util.Predicate;

public final class v3
implements Predicate {
    public final int a;
    public final Object b;

    public /* synthetic */ v3(Object object, int n) {
        this.a = n;
        this.b = object;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return Predicate.e((Object)this.b, (Object)object);
            }
        }
        return Predicate.d((Predicate)((Predicate)this.b), (Object)object);
    }
}

