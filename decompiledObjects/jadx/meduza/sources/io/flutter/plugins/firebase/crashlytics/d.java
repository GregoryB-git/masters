package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f8082b;

    public /* synthetic */ d(int i10, MethodChannel.Result result) {
        this.f8081a = i10;
        this.f8082b = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f8081a) {
            case 0:
                FlutterFirebaseCrashlyticsPlugin.lambda$onMethodCall$10(this.f8082b, task);
                break;
            default:
                FlutterFirebaseDynamicLinksPlugin.lambda$onMethodCall$2(this.f8082b, task);
                break;
        }
    }
}
