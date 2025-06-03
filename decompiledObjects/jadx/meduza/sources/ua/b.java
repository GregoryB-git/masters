package ua;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;

/* loaded from: classes.dex */
public final class b implements EventChannel.EventSink {

    /* renamed from: a, reason: collision with root package name */
    public EventChannel.EventSink f15149a;

    public class a implements EventChannel.StreamHandler {
        public a() {
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public final void onCancel(Object obj) {
            b.this.f15149a = null;
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public final void onListen(Object obj, EventChannel.EventSink eventSink) {
            b.this.f15149a = eventSink;
        }
    }

    public b(BinaryMessenger binaryMessenger, String str) {
        new EventChannel(binaryMessenger, str).setStreamHandler(new a());
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void endOfStream() {
        EventChannel.EventSink eventSink = this.f15149a;
        if (eventSink != null) {
            eventSink.endOfStream();
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void error(String str, String str2, Object obj) {
        EventChannel.EventSink eventSink = this.f15149a;
        if (eventSink != null) {
            eventSink.error(str, str2, obj);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void success(Object obj) {
        EventChannel.EventSink eventSink = this.f15149a;
        if (eventSink != null) {
            eventSink.success(obj);
        }
    }
}
