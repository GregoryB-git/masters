package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f1401b;

    /* renamed from: d, reason: collision with root package name */
    public final l2.a f1403d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f1404e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1400a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f1402c = new WeakHashMap();

    public DistinctElementSidecarCallback(l2.a aVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f1403d = aVar;
        this.f1404e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f1400a) {
            l2.a aVar = this.f1403d;
            SidecarDeviceState sidecarDeviceState2 = this.f1401b;
            aVar.getClass();
            if (l2.a.a(sidecarDeviceState2, sidecarDeviceState)) {
                return;
            }
            this.f1401b = sidecarDeviceState;
            this.f1404e.onDeviceStateChanged(sidecarDeviceState);
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f1400a) {
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f1402c.get(iBinder);
            this.f1403d.getClass();
            if (l2.a.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                return;
            }
            this.f1402c.put(iBinder, sidecarWindowLayoutInfo);
            this.f1404e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
        }
    }
}
