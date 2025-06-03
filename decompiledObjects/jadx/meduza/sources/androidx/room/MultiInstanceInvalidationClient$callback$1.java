package androidx.room;

import androidx.room.IMultiInstanceInvalidationCallback;
import ec.i;
import x0.q0;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationClient$callback$1 extends IMultiInstanceInvalidationCallback.Stub {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1386b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationClient f1387a;

    public MultiInstanceInvalidationClient$callback$1(MultiInstanceInvalidationClient multiInstanceInvalidationClient) {
        this.f1387a = multiInstanceInvalidationClient;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public final void j0(String[] strArr) {
        i.e(strArr, "tables");
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f1387a;
        multiInstanceInvalidationClient.f1377c.execute(new q0(2, multiInstanceInvalidationClient, strArr));
    }
}
