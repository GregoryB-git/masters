package pa;

import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k implements EventChannel.EventSink {

    /* renamed from: a, reason: collision with root package name */
    public EventChannel.EventSink f13102a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<Object> f13103b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public boolean f13104c;

    public static final class a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f13105a;

        /* renamed from: b, reason: collision with root package name */
        public String f13106b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13107c;

        public b(String str, String str2, Object obj) {
            ec.i.e(str, "code");
            ec.i.e(str2, Constants.MESSAGE);
            ec.i.e(obj, "details");
            this.f13105a = str;
            this.f13106b = str2;
            this.f13107c = obj;
        }
    }

    public final void a() {
        if (this.f13102a == null) {
            return;
        }
        Iterator<Object> it = this.f13103b.iterator();
        ec.i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            ec.i.d(next, "next(...)");
            if (next instanceof a) {
                EventChannel.EventSink eventSink = this.f13102a;
                ec.i.b(eventSink);
                eventSink.endOfStream();
            } else if (next instanceof b) {
                EventChannel.EventSink eventSink2 = this.f13102a;
                ec.i.b(eventSink2);
                b bVar = (b) next;
                eventSink2.error(bVar.f13105a, bVar.f13106b, bVar.f13107c);
            } else {
                EventChannel.EventSink eventSink3 = this.f13102a;
                ec.i.b(eventSink3);
                eventSink3.success(next);
            }
        }
        this.f13103b.clear();
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void endOfStream() {
        a aVar = new a();
        if (!this.f13104c) {
            this.f13103b.add(aVar);
        }
        a();
        this.f13104c = true;
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void error(String str, String str2, Object obj) {
        ec.i.e(str, "code");
        ec.i.e(str2, Constants.MESSAGE);
        ec.i.e(obj, "details");
        b bVar = new b(str, str2, obj);
        if (!this.f13104c) {
            this.f13103b.add(bVar);
        }
        a();
    }

    @Override // io.flutter.plugin.common.EventChannel.EventSink
    public final void success(Object obj) {
        ec.i.e(obj, "event");
        if (!this.f13104c) {
            this.f13103b.add(obj);
        }
        a();
    }
}
