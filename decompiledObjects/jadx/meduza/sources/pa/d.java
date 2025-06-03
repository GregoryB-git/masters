package pa;

import io.flutter.plugin.common.EventChannel;

/* loaded from: classes.dex */
public final class d implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f13076a;

    public d(b bVar) {
        this.f13076a = bVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        k kVar = this.f13076a.f13053d;
        kVar.f13102a = null;
        kVar.a();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        ec.i.e(eventSink, "sink");
        k kVar = this.f13076a.f13053d;
        kVar.f13102a = eventSink;
        kVar.a();
    }
}
