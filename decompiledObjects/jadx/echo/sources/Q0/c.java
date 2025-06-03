package Q0;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f4320a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f4321b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f4320a = byteArrayOutputStream;
        this.f4321b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f4320a.reset();
        try {
            b(this.f4321b, aVar.f4314o);
            String str = aVar.f4315p;
            if (str == null) {
                str = "";
            }
            b(this.f4321b, str);
            this.f4321b.writeLong(aVar.f4316q);
            this.f4321b.writeLong(aVar.f4317r);
            this.f4321b.write(aVar.f4318s);
            this.f4321b.flush();
            return this.f4320a.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }
}
