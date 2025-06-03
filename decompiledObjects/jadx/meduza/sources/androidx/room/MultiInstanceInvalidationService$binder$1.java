package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import ec.i;
import rb.h;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService$binder$1 extends IMultiInstanceInvalidationService.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f1393a;

    public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1393a = multiInstanceInvalidationService;
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final int B0(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
        i.e(iMultiInstanceInvalidationCallback, "callback");
        int i10 = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1393a;
        synchronized (multiInstanceInvalidationService.f1390c) {
            int i11 = multiInstanceInvalidationService.f1388a + 1;
            multiInstanceInvalidationService.f1388a = i11;
            if (multiInstanceInvalidationService.f1390c.register(iMultiInstanceInvalidationCallback, Integer.valueOf(i11))) {
                multiInstanceInvalidationService.f1389b.put(Integer.valueOf(i11), str);
                i10 = i11;
            } else {
                multiInstanceInvalidationService.f1388a--;
            }
        }
        return i10;
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void K2(int i10, String[] strArr) {
        i.e(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1393a;
        synchronized (multiInstanceInvalidationService.f1390c) {
            String str = (String) multiInstanceInvalidationService.f1389b.get(Integer.valueOf(i10));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f1390c.beginBroadcast();
            for (int i11 = 0; i11 < beginBroadcast; i11++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f1390c.getBroadcastCookie(i11);
                    i.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) broadcastCookie).intValue();
                    String str2 = (String) multiInstanceInvalidationService.f1389b.get(Integer.valueOf(intValue));
                    if (i10 != intValue && i.a(str, str2)) {
                        try {
                            multiInstanceInvalidationService.f1390c.getBroadcastItem(i11).j0(strArr);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                } catch (Throwable th) {
                    multiInstanceInvalidationService.f1390c.finishBroadcast();
                    throw th;
                }
            }
            multiInstanceInvalidationService.f1390c.finishBroadcast();
            h hVar = h.f13851a;
        }
    }
}
