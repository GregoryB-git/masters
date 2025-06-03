package R2;

import java.util.Map;

/* loaded from: classes.dex */
public final class F5 implements InterfaceC0500e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D5 f4674b;

    public F5(D5 d52, String str) {
        this.f4674b = d52;
        this.f4673a = str;
    }

    @Override // R2.InterfaceC0500e2
    public final void a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        this.f4674b.I(true, i7, th, bArr, this.f4673a);
    }
}
