// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import java.util.concurrent.locks.Lock;
import V5.t;
import W5.m;
import kotlin.jvm.internal.Intrinsics;
import H.a;
import java.util.concurrent.Executor;
import android.app.Activity;
import android.content.Context;
import W5.I;
import kotlin.jvm.internal.g;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public final class SplitController
{
    @NotNull
    public static final Companion Companion;
    private static volatile SplitController globalInstance;
    @NotNull
    private static final ReentrantLock globalLock;
    public static final boolean sDebug = false;
    @NotNull
    private final EmbeddingBackend embeddingBackend;
    @NotNull
    private Set<? extends EmbeddingRule> staticSplitRules;
    
    static {
        Companion = new Companion(null);
        globalLock = new ReentrantLock();
    }
    
    private SplitController() {
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        this.staticSplitRules = (Set<? extends EmbeddingRule>)I.b();
    }
    
    public static final /* synthetic */ SplitController access$getGlobalInstance$cp() {
        return SplitController.globalInstance;
    }
    
    public static final /* synthetic */ ReentrantLock access$getGlobalLock$cp() {
        return SplitController.globalLock;
    }
    
    public static final /* synthetic */ void access$setGlobalInstance$cp(final SplitController globalInstance) {
        SplitController.globalInstance = globalInstance;
    }
    
    @NotNull
    public static final SplitController getInstance() {
        return SplitController.Companion.getInstance();
    }
    
    public static final void initialize(@NotNull final Context context, final int n) {
        SplitController.Companion.initialize(context, n);
    }
    
    private final void setStaticSplitRules(final Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }
    
    public final void addSplitListener(@NotNull final Activity activity, @NotNull final Executor executor, @NotNull final a a) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(a, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, a);
    }
    
    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }
    
    @NotNull
    public final Set<EmbeddingRule> getSplitRules() {
        return (Set<EmbeddingRule>)m.J(this.embeddingBackend.getSplitRules());
    }
    
    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }
    
    public final void registerRule(@NotNull final EmbeddingRule embeddingRule) {
        Intrinsics.checkNotNullParameter(embeddingRule, "rule");
        this.embeddingBackend.registerRule(embeddingRule);
    }
    
    public final void removeSplitListener(@NotNull final a a) {
        Intrinsics.checkNotNullParameter(a, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(a);
    }
    
    public final void unregisterRule(@NotNull final EmbeddingRule embeddingRule) {
        Intrinsics.checkNotNullParameter(embeddingRule, "rule");
        this.embeddingBackend.unregisterRule(embeddingRule);
    }
    
    @Metadata
    public static final class Companion
    {
        private Companion() {
        }
        
        @NotNull
        public final SplitController getInstance() {
            while (true) {
                if (SplitController.access$getGlobalInstance$cp() == null) {
                    Object o = SplitController.access$getGlobalLock$cp();
                    ((Lock)o).lock();
                    while (true) {
                        try {
                            if (SplitController.access$getGlobalInstance$cp() == null) {
                                SplitController.access$setGlobalInstance$cp(new SplitController(null));
                            }
                            final t a = t.a;
                            ((Lock)o).unlock();
                            o = SplitController.access$getGlobalInstance$cp();
                            Intrinsics.b(o);
                            return (SplitController)o;
                            ((Lock)o).unlock();
                        }
                        finally {}
                        continue;
                    }
                }
                continue;
            }
        }
        
        public final void initialize(@NotNull final Context context, final int n) {
            Intrinsics.checkNotNullParameter(context, "context");
            final Set<EmbeddingRule> splitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, n);
            final SplitController instance = this.getInstance();
            Set<EmbeddingRule> b = splitRules$window_release;
            if (splitRules$window_release == null) {
                b = (Set<EmbeddingRule>)I.b();
            }
            instance.setStaticSplitRules(b);
        }
    }
}
