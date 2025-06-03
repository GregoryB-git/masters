/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.WindowMetrics
 *  java.lang.Object
 *  java.util.function.Predicate
 */
package androidx.window.embedding;

import android.view.WindowMetrics;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.SplitRule;
import java.util.function.Predicate;

public final class c
implements Predicate {
    public final /* synthetic */ SplitRule a;

    public /* synthetic */ c(SplitRule splitRule) {
        this.a = splitRule;
    }

    public final boolean test(Object object) {
        return EmbeddingAdapter.e(this.a, (WindowMetrics)object);
    }
}

