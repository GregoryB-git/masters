package defpackage;

import b.z;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import rb.g;

/* loaded from: classes.dex */
public interface h {

    /* renamed from: g, reason: collision with root package name */
    public static final a f7004g = a.f7005a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f7005a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final g f7006b = z.n(new dc.a() { // from class: c
            @Override // dc.a
            public final Object invoke() {
                return new j();
            }
        });

        public static void a(a aVar, BinaryMessenger binaryMessenger, h hVar) {
            aVar.getClass();
            int i10 = 0;
            String d10 = "".length() > 0 ? g.d(".", "") : "";
            String d11 = g.d("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle", d10);
            g gVar = f7006b;
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, d11, (MessageCodec) gVar.getValue());
            if (hVar != null) {
                basicMessageChannel.setMessageHandler(new d(hVar, i10));
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, g.d("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled", d10), (MessageCodec) gVar.getValue());
            if (hVar != null) {
                basicMessageChannel2.setMessageHandler(new e(hVar, i10));
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }
    }

    void a(b bVar);

    defpackage.a isEnabled();
}
