/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.util.Log
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.CopyOnWriteArraySet
 *  java.util.concurrent.Executor
 *  java.util.concurrent.locks.ReentrantLock
 */
package androidx.window.embedding;

import H.a;
import V5.t;
import W5.m;
import android.app.Activity;
import android.util.Log;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingBackend;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.EmbeddingRule;
import androidx.window.embedding.SplitInfo;
import androidx.window.embedding.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class ExtensionEmbeddingBackend
implements EmbeddingBackend {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String TAG = "EmbeddingBackend";
    private static volatile ExtensionEmbeddingBackend globalInstance;
    @NotNull
    private static final ReentrantLock globalLock;
    private EmbeddingInterfaceCompat embeddingExtension;
    @NotNull
    private final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks;
    @NotNull
    private final EmbeddingCallbackImpl splitInfoEmbeddingCallback;
    @NotNull
    private final CopyOnWriteArraySet<EmbeddingRule> splitRules;

    static {
        globalLock = new ReentrantLock();
    }

    public ExtensionEmbeddingBackend(EmbeddingInterfaceCompat object) {
        this.embeddingExtension = object;
        this.splitInfoEmbeddingCallback = object = new EmbeddingCallbackImpl();
        this.splitChangeCallbacks = new CopyOnWriteArrayList();
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.setEmbeddingCallback((EmbeddingInterfaceCompat.EmbeddingCallbackInterface)object);
        }
        this.splitRules = new CopyOnWriteArraySet();
    }

    public static final /* synthetic */ void access$setGlobalInstance$cp(ExtensionEmbeddingBackend extensionEmbeddingBackend) {
        globalInstance = extensionEmbeddingBackend;
    }

    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    @NotNull
    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    @NotNull
    @Override
    public Set<EmbeddingRule> getSplitRules() {
        return this.splitRules;
    }

    @Override
    public boolean isSplitSupported() {
        if (this.embeddingExtension != null) {
            return true;
        }
        return false;
    }

    @Override
    public void registerRule(@NotNull EmbeddingRule object) {
        Intrinsics.checkNotNullParameter(object, "rule");
        if (!this.splitRules.contains(object)) {
            this.splitRules.add(object);
            object = this.embeddingExtension;
            if (object == null) {
                return;
            }
            object.setSplitRules((Set<? extends EmbeddingRule>)this.splitRules);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void registerSplitListenerForActivity(@NotNull Activity object, @NotNull Executor object2, @NotNull a a8) {
        ReentrantLock reentrantLock;
        Throwable throwable2;
        block6 : {
            block5 : {
                block4 : {
                    block3 : {
                        Intrinsics.checkNotNullParameter(object, "activity");
                        Intrinsics.checkNotNullParameter(object2, "executor");
                        Intrinsics.checkNotNullParameter(a8, "callback");
                        reentrantLock = globalLock;
                        reentrantLock.lock();
                        try {
                            if (this.getEmbeddingExtension() != null) break block3;
                            Log.v((String)"EmbeddingBackend", (String)"Extension not loaded, skipping callback registration.");
                            a8.accept((Object)m.f());
                        }
                        catch (Throwable throwable2) {}
                        reentrantLock.unlock();
                        return;
                    }
                    object2 = new SplitListenerWrapper((Activity)object, (Executor)object2, a8);
                    this.getSplitChangeCallbacks().add(object2);
                    if (this.splitInfoEmbeddingCallback.getLastInfo() == null) break block4;
                    object = this.splitInfoEmbeddingCallback.getLastInfo();
                    Intrinsics.b(object);
                    break block5;
                    break block6;
                }
                object = m.f();
            }
            object2.accept((List<SplitInfo>)object);
            object = t.a;
            reentrantLock.unlock();
            return;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    public final void setEmbeddingExtension(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    @Override
    public void setSplitRules(@NotNull Set<? extends EmbeddingRule> object) {
        Intrinsics.checkNotNullParameter(object, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(object);
        object = this.embeddingExtension;
        if (object == null) {
            return;
        }
        object.setSplitRules((Set<? extends EmbeddingRule>)this.splitRules);
    }

    @Override
    public void unregisterRule(@NotNull EmbeddingRule object) {
        Intrinsics.checkNotNullParameter(object, "rule");
        if (this.splitRules.contains(object)) {
            this.splitRules.remove(object);
            object = this.embeddingExtension;
            if (object == null) {
                return;
            }
            object.setSplitRules((Set<? extends EmbeddingRule>)this.splitRules);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void unregisterSplitListenerForActivity(@NotNull a object) {
        Intrinsics.checkNotNullParameter(object, "consumer");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            for (SplitListenerWrapper splitListenerWrapper : this.getSplitChangeCallbacks()) {
                if (!Intrinsics.a(splitListenerWrapper.getCallback(), object)) continue;
                this.getSplitChangeCallbacks().remove((Object)splitListenerWrapper);
                break;
            }
            object = t.a;
        }
        catch (Throwable throwable) {}
        reentrantLock.unlock();
        return;
        reentrantLock.unlock();
        throw throwable;
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            EmbeddingCompat embeddingCompat;
            EmbeddingCompat embeddingCompat2 = null;
            try {
                EmbeddingCompat.Companion companion = EmbeddingCompat.Companion;
                embeddingCompat = embeddingCompat2;
                if (this.isExtensionVersionSupported(companion.getExtensionApiLevel())) {
                    embeddingCompat = embeddingCompat2;
                    if (companion.isEmbeddingAvailable()) {
                        embeddingCompat = new EmbeddingCompat();
                    }
                }
            }
            catch (Throwable throwable) {
                Log.d((String)"EmbeddingBackend", (String)Intrinsics.i("Failed to load embedding extension: ", (Object)throwable));
                embeddingCompat = embeddingCompat2;
            }
            if (embeddingCompat == null) {
                Log.d((String)"EmbeddingBackend", (String)"No supported embedding extension found");
            }
            return embeddingCompat;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        @NotNull
        public final ExtensionEmbeddingBackend getInstance() {
            Object object;
            if (globalInstance == null) {
                object = globalLock;
                object.lock();
                if (globalInstance == null) {
                    ExtensionEmbeddingBackend.access$setGlobalInstance$cp(new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension()));
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

        public final boolean isExtensionVersionSupported(Integer n8) {
            boolean bl = false;
            if (n8 == null) {
                return false;
            }
            if (n8 >= 1) {
                bl = true;
            }
            return bl;
        }
    }

    @Metadata
    public final class EmbeddingCallbackImpl
    implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        private List<SplitInfo> lastInfo;

        public EmbeddingCallbackImpl() {
            Intrinsics.checkNotNullParameter(ExtensionEmbeddingBackend.this, "this$0");
        }

        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        @Override
        public void onSplitInfoChanged(@NotNull List<SplitInfo> list) {
            Intrinsics.checkNotNullParameter(list, "splitInfo");
            this.lastInfo = list;
            Iterator iterator = ExtensionEmbeddingBackend.this.getSplitChangeCallbacks().iterator();
            while (iterator.hasNext()) {
                ((SplitListenerWrapper)iterator.next()).accept(list);
            }
        }

        public final void setLastInfo(List<SplitInfo> list) {
            this.lastInfo = list;
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    @Metadata
    public static final class SplitListenerWrapper {
        @NotNull
        private final Activity activity;
        @NotNull
        private final a callback;
        @NotNull
        private final Executor executor;
        private List<SplitInfo> lastValue;

        public SplitListenerWrapper(@NotNull Activity activity, @NotNull Executor executor, @NotNull a a8) {
            Intrinsics.checkNotNullParameter((Object)activity, "activity");
            Intrinsics.checkNotNullParameter((Object)executor, "executor");
            Intrinsics.checkNotNullParameter(a8, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = a8;
        }

        public static /* synthetic */ void a(SplitListenerWrapper splitListenerWrapper, List list) {
            SplitListenerWrapper.accept$lambda-1(splitListenerWrapper, list);
        }

        private static final void accept$lambda-1(SplitListenerWrapper splitListenerWrapper, List list) {
            Intrinsics.checkNotNullParameter(splitListenerWrapper, "this$0");
            Intrinsics.checkNotNullParameter((Object)list, "$splitsWithActivity");
            splitListenerWrapper.getCallback().accept((Object)list);
        }

        public final void accept(@NotNull List<SplitInfo> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "splitInfoList");
            Iterable iterable = (Iterable)arrayList;
            arrayList = new ArrayList();
            for (Object object : iterable) {
                if (!((SplitInfo)object).contains(this.activity)) continue;
                arrayList.add(object);
            }
            if (Intrinsics.a((Object)arrayList, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList;
            this.executor.execute((Runnable)new h(this, (List)arrayList));
        }

        @NotNull
        public final a getCallback() {
            return this.callback;
        }
    }

}

