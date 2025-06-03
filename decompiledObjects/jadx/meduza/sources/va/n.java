package va;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16051a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodCall f16052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f16053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f16054d;

    public /* synthetic */ n(MethodCall methodCall, MethodChannel.Result result, d dVar) {
        this.f16052b = methodCall;
        this.f16054d = result;
        this.f16053c = dVar;
    }

    public /* synthetic */ n(MethodCall methodCall, d dVar, MethodChannel.Result result) {
        this.f16052b = methodCall;
        this.f16053c = dVar;
        this.f16054d = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16051a) {
            case 0:
                MethodCall methodCall = this.f16052b;
                MethodChannel.Result result = this.f16054d;
                d dVar = this.f16053c;
                HashMap hashMap = s.f16073c;
                wa.c cVar = new wa.c(methodCall, result);
                dVar.getClass();
                dVar.l(cVar, new b(dVar, cVar, 1));
                break;
            default:
                MethodCall methodCall2 = this.f16052b;
                d dVar2 = this.f16053c;
                MethodChannel.Result result2 = this.f16054d;
                HashMap hashMap2 = s.f16073c;
                try {
                    dVar2.f16021i.setLocale(Locale.forLanguageTag((String) methodCall2.argument("locale")));
                    result2.success(null);
                    break;
                } catch (Exception e10) {
                    StringBuilder l10 = defpackage.f.l("Error calling setLocale: ");
                    l10.append(e10.getMessage());
                    result2.error("sqlite_error", l10.toString(), null);
                    return;
                }
        }
    }
}
