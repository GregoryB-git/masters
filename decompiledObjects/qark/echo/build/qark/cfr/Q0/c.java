/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.DataOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package Q0;

import Q0.a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class c {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream;
        this.a = byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.b = new DataOutputStream((OutputStream)byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String string2) {
        dataOutputStream.writeBytes(string2);
        dataOutputStream.writeByte(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] a(a arrby) {
        String string2;
        block3 : {
            block2 : {
                this.a.reset();
                try {
                    c.b(this.b, arrby.o);
                    string2 = arrby.p;
                    if (string2 == null) break block2;
                    break block3;
                }
                catch (IOException iOException) {
                    throw new RuntimeException((Throwable)iOException);
                }
            }
            string2 = "";
        }
        c.b(this.b, string2);
        this.b.writeLong(arrby.q);
        this.b.writeLong(arrby.r);
        this.b.write(arrby.s);
        this.b.flush();
        return this.a.toByteArray();
    }
}

