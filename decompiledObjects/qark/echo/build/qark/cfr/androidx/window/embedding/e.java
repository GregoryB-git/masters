/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Object
 *  java.util.Set
 *  java.util.function.Predicate
 */
package androidx.window.embedding;

import android.util.Pair;
import androidx.window.embedding.EmbeddingAdapter;
import java.util.Set;
import java.util.function.Predicate;

public final class e
implements Predicate {
    public final /* synthetic */ EmbeddingAdapter a;
    public final /* synthetic */ Set b;

    public /* synthetic */ e(EmbeddingAdapter embeddingAdapter, Set set) {
        this.a = embeddingAdapter;
        this.b = set;
    }

    public final boolean test(Object object) {
        return EmbeddingAdapter.d(this.a, this.b, (Pair)object);
    }
}

