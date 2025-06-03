package R2;

import A2.AbstractC0328n;
import java.util.Map;

/* renamed from: R2.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0528i2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0500e2 f5329o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5330p;

    /* renamed from: q, reason: collision with root package name */
    public final Throwable f5331q;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f5332r;

    /* renamed from: s, reason: collision with root package name */
    public final String f5333s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f5334t;

    public RunnableC0528i2(String str, InterfaceC0500e2 interfaceC0500e2, int i7, Throwable th, byte[] bArr, Map map) {
        AbstractC0328n.i(interfaceC0500e2);
        this.f5329o = interfaceC0500e2;
        this.f5330p = i7;
        this.f5331q = th;
        this.f5332r = bArr;
        this.f5333s = str;
        this.f5334t = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5329o.a(this.f5333s, this.f5330p, this.f5331q, this.f5332r, this.f5334t);
    }
}
