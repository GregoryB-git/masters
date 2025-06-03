/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.content.IntentSanitizer$Builder
 *  androidx.core.util.Predicate
 *  java.lang.Class
 *  java.lang.Object
 */
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;

public final class u3
implements Predicate {
    public final int a;
    public final Predicate b;
    public final Object c;

    public /* synthetic */ u3(Predicate predicate, Predicate predicate2, int n) {
        this.a = n;
        this.b = predicate;
        this.c = predicate2;
    }

    public /* synthetic */ u3(Class clazz, Predicate predicate) {
        this.a = 2;
        this.c = clazz;
        this.b = predicate;
    }

    public final boolean test(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                return Predicate.b((Predicate)this.b, (Predicate)((Predicate)this.c), (Object)object);
            }
            case 0: {
                return Predicate.a((Predicate)this.b, (Predicate)((Predicate)this.c), (Object)object);
            }
        }
        return IntentSanitizer.Builder.p((Class)((Class)this.c), (Predicate)this.b, (Object)object);
    }
}

