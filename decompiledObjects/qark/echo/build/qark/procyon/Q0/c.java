// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q0;

import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;

public final class c
{
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;
    
    public c() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }
    
    public static void b(final DataOutputStream dataOutputStream, final String s) {
        dataOutputStream.writeBytes(s);
        dataOutputStream.writeByte(0);
    }
    
    public byte[] a(final a a) {
        while (true) {
            this.a.reset();
            while (true) {
                try {
                    b(this.b, a.o);
                    final String p = a.p;
                    if (p != null) {
                        b(this.b, p);
                        this.b.writeLong(a.q);
                        this.b.writeLong(a.r);
                        this.b.write(a.s);
                        this.b.flush();
                        return this.a.toByteArray();
                    }
                }
                catch (IOException cause) {
                    throw new RuntimeException(cause);
                }
                final String p = "";
                continue;
            }
        }
    }
}
