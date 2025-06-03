/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData$Item
 *  androidx.core.util.Predicate
 *  java.lang.Object
 *  java.util.function.Predicate
 */
import android.content.ClipData;
import java.util.function.Predicate;

public final class p0
implements androidx.core.util.Predicate {
    public final Predicate a;

    public /* synthetic */ p0(Predicate predicate) {
        this.a = predicate;
    }

    public final boolean test(Object object) {
        return this.a.test((Object)((ClipData.Item)object));
    }
}

