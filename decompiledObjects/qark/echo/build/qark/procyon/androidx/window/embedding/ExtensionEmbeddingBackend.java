// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import java.util.concurrent.locks.Lock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import V5.t;
import W5.m;
import android.util.Log;
import H.a;
import java.util.concurrent.Executor;
import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import java.util.Set;
import kotlin.jvm.internal.g;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public final class ExtensionEmbeddingBackend implements EmbeddingBackend
{
    @NotNull
    public static final Companion Companion;
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
        Companion = new Companion(null);
        globalLock = new ReentrantLock();
    }
    
    public ExtensionEmbeddingBackend(final EmbeddingInterfaceCompat embeddingExtension) {
        this.embeddingExtension = embeddingExtension;
        final EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl();
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        this.splitChangeCallbacks = new CopyOnWriteArrayList<SplitListenerWrapper>();
        final EmbeddingInterfaceCompat embeddingExtension2 = this.embeddingExtension;
        if (embeddingExtension2 != null) {
            embeddingExtension2.setEmbeddingCallback((EmbeddingInterfaceCompat.EmbeddingCallbackInterface)embeddingCallbackImpl);
        }
        this.splitRules = new CopyOnWriteArraySet<EmbeddingRule>();
    }
    
    public static final /* synthetic */ ExtensionEmbeddingBackend access$getGlobalInstance$cp() {
        return ExtensionEmbeddingBackend.globalInstance;
    }
    
    public static final /* synthetic */ ReentrantLock access$getGlobalLock$cp() {
        return ExtensionEmbeddingBackend.globalLock;
    }
    
    public static final /* synthetic */ void access$setGlobalInstance$cp(final ExtensionEmbeddingBackend globalInstance) {
        ExtensionEmbeddingBackend.globalInstance = globalInstance;
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
        return this.embeddingExtension != null;
    }
    
    @Override
    public void registerRule(@NotNull final EmbeddingRule embeddingRule) {
        Intrinsics.checkNotNullParameter(embeddingRule, "rule");
        if (!this.splitRules.contains(embeddingRule)) {
            this.splitRules.add(embeddingRule);
            final EmbeddingInterfaceCompat embeddingExtension = this.embeddingExtension;
            if (embeddingExtension == null) {
                return;
            }
            embeddingExtension.setSplitRules(this.splitRules);
        }
    }
    
    @Override
    public void registerSplitListenerForActivity(@NotNull final Activity activity, @NotNull final Executor executor, @NotNull final a a) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(a, "callback");
        final ReentrantLock globalLock = ExtensionEmbeddingBackend.globalLock;
        globalLock.lock();
        Label_0135: {
            try {
                if (this.getEmbeddingExtension() == null) {
                    Log.v("EmbeddingBackend", "Extension not loaded, skipping callback registration.");
                    a.accept(m.f());
                    globalLock.unlock();
                    return;
                }
            }
            finally {
                break Label_0135;
            }
            final Activity activity2;
            final SplitListenerWrapper e = new SplitListenerWrapper(activity2, executor, a);
            this.getSplitChangeCallbacks().add(e);
            List<SplitInfo> list;
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                list = this.splitInfoEmbeddingCallback.getLastInfo();
                Intrinsics.b(list);
            }
            else {
                list = (List<SplitInfo>)m.f();
            }
            e.accept(list);
            final t a2 = t.a;
            globalLock.unlock();
            return;
        }
        globalLock.unlock();
    }
    
    public final void setEmbeddingExtension(final EmbeddingInterfaceCompat embeddingExtension) {
        this.embeddingExtension = embeddingExtension;
    }
    
    @Override
    public void setSplitRules(@NotNull final Set<? extends EmbeddingRule> c) {
        Intrinsics.checkNotNullParameter(c, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(c);
        final EmbeddingInterfaceCompat embeddingExtension = this.embeddingExtension;
        if (embeddingExtension == null) {
            return;
        }
        embeddingExtension.setSplitRules(this.splitRules);
    }
    
    @Override
    public void unregisterRule(@NotNull final EmbeddingRule embeddingRule) {
        Intrinsics.checkNotNullParameter(embeddingRule, "rule");
        if (this.splitRules.contains(embeddingRule)) {
            this.splitRules.remove(embeddingRule);
            final EmbeddingInterfaceCompat embeddingExtension = this.embeddingExtension;
            if (embeddingExtension == null) {
                return;
            }
            embeddingExtension.setSplitRules(this.splitRules);
        }
    }
    
    @Override
    public void unregisterSplitListenerForActivity(@NotNull final a a) {
        Intrinsics.checkNotNullParameter(a, "consumer");
        final ReentrantLock globalLock = ExtensionEmbeddingBackend.globalLock;
        globalLock.lock();
        while (true) {
            try {
                for (final SplitListenerWrapper o : this.getSplitChangeCallbacks()) {
                    if (Intrinsics.a(o.getCallback(), a)) {
                        this.getSplitChangeCallbacks().remove(o);
                        break;
                    }
                }
                final t a2 = t.a;
                globalLock.unlock();
                return;
                globalLock.unlock();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Metadata
    public static final class Companion
    {
        private Companion() {
        }
        
        private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            final EmbeddingInterfaceCompat embeddingInterfaceCompat = null;
            EmbeddingInterfaceCompat embeddingInterfaceCompat2 = null;
            try {
                final EmbeddingCompat.Companion companion = EmbeddingCompat.Companion;
                if (this.isExtensionVersionSupported(companion.getExtensionApiLevel()) && companion.isEmbeddingAvailable()) {
                    final EmbeddingCompat embeddingCompat = new EmbeddingCompat();
                }
            }
            finally {
                final Throwable t;
                Log.d("EmbeddingBackend", Intrinsics.i("Failed to load embedding extension: ", t));
                embeddingInterfaceCompat2 = embeddingInterfaceCompat;
            }
            if (embeddingInterfaceCompat2 == null) {
                Log.d("EmbeddingBackend", "No supported embedding extension found");
            }
            return embeddingInterfaceCompat2;
        }
        
        @NotNull
        public final ExtensionEmbeddingBackend getInstance() {
            while (true) {
                if (ExtensionEmbeddingBackend.access$getGlobalInstance$cp() == null) {
                    Object o = ExtensionEmbeddingBackend.access$getGlobalLock$cp();
                    ((Lock)o).lock();
                    while (true) {
                        try {
                            if (ExtensionEmbeddingBackend.access$getGlobalInstance$cp() == null) {
                                ExtensionEmbeddingBackend.access$setGlobalInstance$cp(new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension()));
                            }
                            final t a = t.a;
                            ((Lock)o).unlock();
                            o = ExtensionEmbeddingBackend.access$getGlobalInstance$cp();
                            Intrinsics.b(o);
                            return (ExtensionEmbeddingBackend)o;
                            ((Lock)o).unlock();
                        }
                        finally {}
                        continue;
                    }
                }
                continue;
            }
        }
        
        public final boolean isExtensionVersionSupported(final Integer n) {
            boolean b = false;
            if (n == null) {
                return false;
            }
            if (n >= 1) {
                b = true;
            }
            return b;
        }
    }
    
    @Metadata
    public final class EmbeddingCallbackImpl implements EmbeddingCallbackInterface
    {
        private List<SplitInfo> lastInfo;
        
        public EmbeddingCallbackImpl() {
            Intrinsics.checkNotNullParameter(ExtensionEmbeddingBackend.this, "this$0");
        }
        
        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }
        
        @Override
        public void onSplitInfoChanged(@NotNull final List<SplitInfo> lastInfo) {
            Intrinsics.checkNotNullParameter(lastInfo, "splitInfo");
            this.lastInfo = lastInfo;
            final Iterator<SplitListenerWrapper> iterator = ExtensionEmbeddingBackend.this.getSplitChangeCallbacks().iterator();
            while (iterator.hasNext()) {
                ((SplitListenerWrapper)iterator.next()).accept(lastInfo);
            }
        }
        
        public final void setLastInfo(final List<SplitInfo> lastInfo) {
            this.lastInfo = lastInfo;
        }
    }
    
    @Metadata
    public static final class SplitListenerWrapper
    {
        @NotNull
        private final Activity activity;
        @NotNull
        private final a callback;
        @NotNull
        private final Executor executor;
        private List<SplitInfo> lastValue;
        
        public SplitListenerWrapper(@NotNull final Activity activity, @NotNull final Executor executor, @NotNull final a callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }
        
        private static final void accept$lambda-1(final SplitListenerWrapper splitListenerWrapper, final List list) {
            Intrinsics.checkNotNullParameter(splitListenerWrapper, "this$0");
            Intrinsics.checkNotNullParameter(list, "$splitsWithActivity");
            splitListenerWrapper.getCallback().accept(list);
        }
        
        public final void accept(@NotNull final List<SplitInfo> list) {
            Intrinsics.checkNotNullParameter(list, "splitInfoList");
            final List<SplitInfo> list2 = list;
            final ArrayList<SplitInfo> lastValue = new ArrayList<SplitInfo>();
            for (final SplitInfo next : list2) {
                if (next.contains(this.activity)) {
                    lastValue.add(next);
                }
            }
            if (Intrinsics.a(lastValue, this.lastValue)) {
                return;
            }
            this.lastValue = lastValue;
            this.executor.execute(new h(this, lastValue));
        }
        
        @NotNull
        public final a getCallback() {
            return this.callback;
        }
    }
}
