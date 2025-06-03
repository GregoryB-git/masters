package ta;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f14694b;

    public /* synthetic */ d(int i10, MethodChannel.Result result) {
        this.f14693a = i10;
        this.f14694b = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14693a) {
            case 0:
                this.f14694b.success(null);
                break;
            default:
                MethodChannel.Result result = this.f14694b;
                Random random = ua.a.O;
                result.success(new HashMap());
                break;
        }
    }
}
