package x2;

import java.lang.ref.WeakReference;

/* renamed from: x2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2173C extends AbstractBinderC2171A {

    /* renamed from: d, reason: collision with root package name */
    public static final WeakReference f21136d = new WeakReference(null);

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f21137c;

    public AbstractBinderC2173C(byte[] bArr) {
        super(bArr);
        this.f21137c = f21136d;
    }

    @Override // x2.AbstractBinderC2171A
    public final byte[] Z0() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f21137c.get();
                if (bArr == null) {
                    bArr = a1();
                    this.f21137c = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public abstract byte[] a1();
}
