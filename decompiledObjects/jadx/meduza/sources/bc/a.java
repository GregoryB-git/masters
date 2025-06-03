package bc;

import ec.i;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class a extends ByteArrayOutputStream {
    public a() {
        super(8193);
    }

    public final byte[] f() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        i.d(bArr, "buf");
        return bArr;
    }
}
