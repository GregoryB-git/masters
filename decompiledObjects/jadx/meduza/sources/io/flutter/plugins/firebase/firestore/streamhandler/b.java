package io.flutter.plugins.firebase.firestore.streamhandler;

import android.content.Intent;
import ec.s;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.meduza.meduza.MainActivity;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8110c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f8108a = i10;
        this.f8109b = obj;
        this.f8110c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8108a) {
            case 0:
                ((EventChannel.EventSink) this.f8109b).success((Map) this.f8110c);
                break;
            case 1:
                FlutterFirebaseMessagingBackgroundService.lambda$onHandleWork$0((Intent) this.f8109b, (CountDownLatch) this.f8110c);
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.f8109b;
                s sVar = (s) this.f8110c;
                MethodChannel methodChannel = mainActivity.f8181b;
                if (methodChannel != null) {
                    methodChannel.invokeMethod("wakeUp", sVar.f5272a);
                    break;
                }
                break;
        }
    }
}
