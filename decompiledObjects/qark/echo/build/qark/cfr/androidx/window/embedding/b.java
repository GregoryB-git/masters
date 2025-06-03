/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Object
 *  java.util.Set
 *  java.util.function.Predicate
 */
package androidx.window.embedding;

import android.content.Intent;
import androidx.window.embedding.EmbeddingAdapter;
import java.util.Set;
import java.util.function.Predicate;

public final class b
implements Predicate {
    public final /* synthetic */ Set a;

    public /* synthetic */ b(Set set) {
        this.a = set;
    }

    public final boolean test(Object object) {
        return EmbeddingAdapter.c(this.a, (Intent)object);
    }
}

