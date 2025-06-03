/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.List
 */
package androidx.window.embedding;

import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.List;

public final class h
implements Runnable {
    public final /* synthetic */ ExtensionEmbeddingBackend.SplitListenerWrapper o;
    public final /* synthetic */ List p;

    public /* synthetic */ h(ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper, List list) {
        this.o = splitListenerWrapper;
        this.p = list;
    }

    public final void run() {
        ExtensionEmbeddingBackend.SplitListenerWrapper.a(this.o, this.p);
    }
}

