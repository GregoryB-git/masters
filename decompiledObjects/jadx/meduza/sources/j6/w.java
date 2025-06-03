package j6;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class w extends u {

    /* renamed from: c, reason: collision with root package name */
    public static final WeakReference f8517c = new WeakReference(null);

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f8518b;

    public w(byte[] bArr) {
        super(bArr);
        this.f8518b = f8517c;
    }

    public abstract byte[] d3();

    @Override // j6.u
    public final byte[] r() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f8518b.get();
            if (bArr == null) {
                bArr = d3();
                this.f8518b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
