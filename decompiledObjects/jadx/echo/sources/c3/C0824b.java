package c3;

import com.google.crypto.tink.shaded.protobuf.C1101p;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p3.C1794C;

/* renamed from: c3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824b implements InterfaceC0838p {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f10076a;

    public C0824b(InputStream inputStream) {
        this.f10076a = inputStream;
    }

    public static InterfaceC0838p b(byte[] bArr) {
        return new C0824b(new ByteArrayInputStream(bArr));
    }

    @Override // c3.InterfaceC0838p
    public p3.t a() {
        try {
            return p3.t.Z(this.f10076a, C1101p.b());
        } finally {
            this.f10076a.close();
        }
    }

    @Override // c3.InterfaceC0838p
    public C1794C read() {
        try {
            return C1794C.e0(this.f10076a, C1101p.b());
        } finally {
            this.f10076a.close();
        }
    }
}
