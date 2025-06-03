package bb;

import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApiCodec;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements dc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2193a;

    public /* synthetic */ c(int i10) {
        this.f2193a = i10;
    }

    @Override // dc.a
    public final Object invoke() {
        SharedPreferencesAsyncApiCodec sharedPreferencesAsyncApiCodec;
        switch (this.f2193a) {
            case 0:
                return 33554432;
            default:
                sharedPreferencesAsyncApiCodec = SharedPreferencesAsyncApiCodec.INSTANCE;
                return sharedPreferencesAsyncApiCodec;
        }
    }
}
