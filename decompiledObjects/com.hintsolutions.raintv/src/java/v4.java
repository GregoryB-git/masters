/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.datatransport.runtime.TransportContext
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader
 *  com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
 *  com.hintsolutions.raintv.common.BaseActivity
 *  java.lang.Object
 *  java.lang.Override
 *  kotlin.jvm.internal.Ref$ObjectRef
 *  tvrain.utils.PushHelper
 */
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import kotlin.jvm.internal.Ref;
import tvrain.utils.PushHelper;

public final class v4
implements SynchronizationGuard.CriticalSection,
TaskCallback {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ v4(Object object, Object object2, int n) {
        this.b = object;
        this.c = object2;
        this.a = n;
    }

    public final Object execute() {
        return Uploader.h((Uploader)((Uploader)this.b), (TransportContext)((TransportContext)this.c), (int)this.a);
    }

    @Override
    public final void onActionCompleted() {
        PushHelper.b((Ref.ObjectRef)((Ref.ObjectRef)this.b), (BaseActivity)((BaseActivity)this.c), (int)this.a);
    }
}

