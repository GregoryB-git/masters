package e7;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f4308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4309b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f4310c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4311d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4312e;
    public final Map<String, List<String>> f;

    public i1(String str, f1 f1Var, int i10, IOException iOException, byte[] bArr, Map map) {
        m6.j.i(f1Var);
        this.f4308a = f1Var;
        this.f4309b = i10;
        this.f4310c = iOException;
        this.f4311d = bArr;
        this.f4312e = str;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4308a.c(this.f4312e, this.f4309b, this.f4310c, this.f4311d, this.f);
    }
}
