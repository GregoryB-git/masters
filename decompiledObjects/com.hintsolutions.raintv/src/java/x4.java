/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.datatransport.runtime.TransportContext
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader
 *  com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
 *  com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy
 *  com.google.firebase.crashlytics.internal.model.StaticSessionData
 *  com.google.firebase.inject.Deferred$DeferredHandler
 *  com.google.firebase.inject.Provider
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 */
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

public final class x4
implements SynchronizationGuard.CriticalSection,
Deferred.DeferredHandler {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ x4(Uploader uploader, Iterable iterable, TransportContext transportContext, long l) {
        this.b = uploader;
        this.c = iterable;
        this.d = transportContext;
        this.a = l;
    }

    public /* synthetic */ x4(String string2, String string3, long l, StaticSessionData staticSessionData) {
        this.b = string2;
        this.c = string3;
        this.a = l;
        this.d = staticSessionData;
    }

    public final Object execute() {
        return Uploader.e((Uploader)((Uploader)this.b), (Iterable)((Iterable)this.c), (TransportContext)((TransportContext)this.d), (long)this.a);
    }

    public final void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.b((String)((String)this.b), (String)((String)this.c), (long)this.a, (StaticSessionData)((StaticSessionData)this.d), (Provider)provider);
    }
}

