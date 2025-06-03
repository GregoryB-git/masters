/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 *  java.util.Set
 *  java.util.function.Predicate
 */
package androidx.window.embedding;

import android.app.Activity;
import androidx.window.embedding.EmbeddingAdapter;
import java.util.Set;
import java.util.function.Predicate;

public final class f
implements Predicate {
    public final /* synthetic */ Set a;

    public /* synthetic */ f(Set set) {
        this.a = set;
    }

    public final boolean test(Object object) {
        return EmbeddingAdapter.b(this.a, (Activity)object);
    }
}

