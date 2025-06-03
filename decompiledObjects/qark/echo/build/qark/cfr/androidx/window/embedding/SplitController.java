/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.locks.ReentrantLock
 */
package androidx.window.embedding;

import H.a;
import V5.t;
import W5.I;
import W5.m;
import android.app.Activity;
import android.content.Context;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingBackend;
import androidx.window.embedding.EmbeddingRule;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import androidx.window.embedding.SplitRuleParser;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class SplitController {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static volatile SplitController globalInstance;
    @NotNull
    private static final ReentrantLock globalLock;
    public static final boolean sDebug = false;
    @NotNull
    private final EmbeddingBackend embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
    @NotNull
    private Set<? extends EmbeddingRule> staticSplitRules = I.b();

    static {
        globalLock = new ReentrantLock();
    }

    private SplitController() {
    }

    public /* synthetic */ SplitController(g g8) {
        this();
    }

    public static final /* synthetic */ void access$setGlobalInstance$cp(SplitController splitController) {
        globalInstance = splitController;
    }

    @NotNull
    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(@NotNull Context context, int n8) {
        Companion.initialize(context, n8);
    }

    private final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(@NotNull Activity activity, @NotNull Executor executor, @NotNull a a8) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        Intrinsics.checkNotNullParameter((Object)executor, "executor");
        Intrinsics.checkNotNullParameter(a8, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, a8);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    @NotNull
    public final Set<EmbeddingRule> getSplitRules() {
        return m.J(this.embeddingBackend.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(@NotNull EmbeddingRule embeddingRule) {
        Intrinsics.checkNotNullParameter(embeddingRule, "rule");
        this.embeddingBackend.registerRule(embeddingRule);
    }

    public final void removeSplitListener(@NotNull a a8) {
        Intrinsics.checkNotNullParameter(a8, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(a8);
    }

    public final void unregisterRule(@NotNull EmbeddingRule embeddingRule) {
        Intrinsics.checkNotNullParameter(embeddingRule, "rule");
        this.embeddingBackend.unregisterRule(embeddingRule);
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @NotNull
        public final SplitController getInstance() {
            Object object;
            if (globalInstance == null) {
                object = globalLock;
                object.lock();
                if (globalInstance == null) {
                    SplitController.access$setGlobalInstance$cp(new SplitController(null));
                }
                t t8 = t.a;
                object.unlock();
            }
            object = globalInstance;
            Intrinsics.b(object);
            return object;
            catch (Throwable throwable) {}
            object.unlock();
            throw throwable;
        }

        public final void initialize(@NotNull Context set, int n8) {
            Intrinsics.checkNotNullParameter((Object)set, "context");
            Set set2 = new SplitRuleParser().parseSplitRules$window_release((Context)set, n8);
            SplitController splitController = this.getInstance();
            set = set2;
            if (set2 == null) {
                set = I.b();
            }
            splitController.setStaticSplitRules(set);
        }
    }

}

