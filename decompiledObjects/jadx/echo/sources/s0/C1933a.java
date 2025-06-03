package s0;

import android.graphics.Bitmap;
import d0.AbstractC1203z;
import d0.C1162A;
import d0.C1194q;
import g0.AbstractC1297a;
import g0.M;
import j0.i;
import j0.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import k0.Z0;
import s0.InterfaceC1935c;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1933a extends k implements InterfaceC1935c {

    /* renamed from: o, reason: collision with root package name */
    public final b f19147o;

    /* renamed from: s0.a$a, reason: collision with other inner class name */
    public class C0262a extends f {
        public C0262a() {
        }

        @Override // j0.j
        public void x() {
            C1933a.this.t(this);
        }
    }

    /* renamed from: s0.a$b */
    public interface b {
        Bitmap a(byte[] bArr, int i7);
    }

    /* renamed from: s0.a$c */
    public static final class c implements InterfaceC1935c.a {

        /* renamed from: b, reason: collision with root package name */
        public final b f19149b = new b() { // from class: s0.b
            @Override // s0.C1933a.b
            public final Bitmap a(byte[] bArr, int i7) {
                Bitmap x7;
                x7 = C1933a.x(bArr, i7);
                return x7;
            }
        };

        @Override // s0.InterfaceC1935c.a
        public int a(C1194q c1194q) {
            String str = c1194q.f12726n;
            if (str == null || !AbstractC1203z.p(str)) {
                return Z0.a(0);
            }
            return Z0.a(M.y0(c1194q.f12726n) ? 4 : 1);
        }

        @Override // s0.InterfaceC1935c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1933a b() {
            return new C1933a(this.f19149b, null);
        }
    }

    public C1933a(b bVar) {
        super(new i[1], new f[1]);
        this.f19147o = bVar;
    }

    public static Bitmap B(byte[] bArr, int i7) {
        try {
            return i0.c.a(bArr, i7, null);
        } catch (C1162A e7) {
            throw new d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i7 + ")", e7);
        } catch (IOException e8) {
            throw new d(e8);
        }
    }

    public static /* synthetic */ Bitmap x(byte[] bArr, int i7) {
        return B(bArr, i7);
    }

    @Override // j0.k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public d k(Throwable th) {
        return new d("Unexpected decode error", th);
    }

    @Override // j0.k
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public d l(i iVar, f fVar, boolean z7) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1297a.e(iVar.f15400r);
            AbstractC1297a.f(byteBuffer.hasArray());
            AbstractC1297a.a(byteBuffer.arrayOffset() == 0);
            fVar.f19152s = this.f19147o.a(byteBuffer.array(), byteBuffer.remaining());
            fVar.f15408p = iVar.f15402t;
            return null;
        } catch (d e7) {
            return e7;
        }
    }

    @Override // j0.k, j0.g
    public /* bridge */ /* synthetic */ f a() {
        return (f) super.a();
    }

    @Override // j0.k
    public i i() {
        return new i(1);
    }

    @Override // j0.k
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public f j() {
        return new C0262a();
    }

    public /* synthetic */ C1933a(b bVar, C0262a c0262a) {
        this(bVar);
    }
}
