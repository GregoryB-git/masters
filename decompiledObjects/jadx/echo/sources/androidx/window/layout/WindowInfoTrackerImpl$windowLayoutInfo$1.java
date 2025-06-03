package androidx.window.layout;

import V5.t;
import android.app.Activity;
import g6.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Z5.f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
@Metadata
/* loaded from: classes.dex */
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends Z5.k implements p {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, X5.d dVar) {
        super(2, dVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0, reason: not valid java name */
    public static final void m7invokeSuspend$lambda0(r6.d dVar, WindowLayoutInfo info) {
        Intrinsics.checkNotNullExpressionValue(info, "info");
        dVar.d(info);
    }

    @Override // Z5.a
    @NotNull
    public final X5.d create(Object obj, @NotNull X5.d dVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, dVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #0 {all -> 0x001f, blocks: (B:7:0x001a, B:9:0x0064, B:14:0x0076, B:16:0x007e, B:25:0x0036, B:27:0x0060), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0090 -> B:8:0x001d). Please report as a decompilation issue!!! */
    @Override // Z5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = Y5.b.c()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L2a
            if (r1 != r2) goto L22
            java.lang.Object r1 = r9.L$2
            r6.e r1 = (r6.e) r1
            java.lang.Object r4 = r9.L$1
            H.a r4 = (H.a) r4
            java.lang.Object r5 = r9.L$0
            s6.c r5 = (s6.c) r5
            V5.o.b(r10)     // Catch: java.lang.Throwable -> L1f
        L1d:
            r10 = r5
            goto L64
        L1f:
            r10 = move-exception
            goto L9f
        L22:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2a:
            java.lang.Object r1 = r9.L$2
            r6.e r1 = (r6.e) r1
            java.lang.Object r4 = r9.L$1
            H.a r4 = (H.a) r4
            java.lang.Object r5 = r9.L$0
            s6.c r5 = (s6.c) r5
            V5.o.b(r10)     // Catch: java.lang.Throwable -> L1f
            goto L76
        L3a:
            V5.o.b(r10)
            java.lang.Object r10 = r9.L$0
            s6.c r10 = (s6.c) r10
            r6.a r1 = r6.a.DROP_OLDEST
            r4 = 4
            r5 = 10
            r6 = 0
            r6.d r1 = r6.f.b(r5, r1, r6, r4, r6)
            androidx.window.layout.k r4 = new androidx.window.layout.k
            r4.<init>()
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.this$0
            androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
            android.app.Activity r6 = r9.$activity
            r1.m r7 = new r1.m
            r7.<init>()
            r5.registerLayoutChangeCallback(r6, r7, r4)
            r6.e r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
        L64:
            r9.L$0 = r10     // Catch: java.lang.Throwable -> L1f
            r9.L$1 = r4     // Catch: java.lang.Throwable -> L1f
            r9.L$2 = r1     // Catch: java.lang.Throwable -> L1f
            r9.label = r3     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r5 = r1.b(r9)     // Catch: java.lang.Throwable -> L1f
            if (r5 != r0) goto L73
            return r0
        L73:
            r8 = r5
            r5 = r10
            r10 = r8
        L76:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1f
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1f
            if (r10 == 0) goto L93
            java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L1f
            androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> L1f
            r9.L$0 = r5     // Catch: java.lang.Throwable -> L1f
            r9.L$1 = r4     // Catch: java.lang.Throwable -> L1f
            r9.L$2 = r1     // Catch: java.lang.Throwable -> L1f
            r9.label = r2     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r10 = r5.emit(r10, r9)     // Catch: java.lang.Throwable -> L1f
            if (r10 != r0) goto L1d
            return r0
        L93:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r9.this$0
            androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
            r10.unregisterLayoutChangeCallback(r4)
            V5.t r10 = V5.t.f6803a
            return r10
        L9f:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r9.this$0
            androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
            r0.unregisterLayoutChangeCallback(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g6.p
    public final Object invoke(@NotNull s6.c cVar, X5.d dVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(cVar, dVar)).invokeSuspend(t.f6803a);
    }
}
