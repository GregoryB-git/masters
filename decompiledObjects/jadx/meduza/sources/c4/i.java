package c4;

/* loaded from: classes.dex */
public interface i extends t5.h {
    boolean b(byte[] bArr, int i10, int i11, boolean z10);

    boolean c(byte[] bArr, int i10, int i11, boolean z10);

    long d();

    void e(int i10);

    int g(byte[] bArr, int i10, int i11);

    long getLength();

    long getPosition();

    void i();

    void j(int i10);

    boolean k(int i10, boolean z10);

    void m(byte[] bArr, int i10, int i11);

    int n();

    @Override // t5.h
    int read(byte[] bArr, int i10, int i11);

    void readFully(byte[] bArr, int i10, int i11);
}
