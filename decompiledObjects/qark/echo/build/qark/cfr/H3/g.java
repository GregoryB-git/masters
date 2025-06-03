/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.zip.GZIPOutputStream
 */
package H3;

import H3.F;
import J3.B;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class g
implements F {
    public final byte[] a;
    public final String b;
    public final String c;

    public g(String string2, String string3, byte[] arrby) {
        this.b = string2;
        this.c = string3;
        this.a = arrby;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final byte[] a() {
        Throwable throwable422;
        if (this.b()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        {
            catch (IOException iOException) {
                return null;
            }
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream((OutputStream)byteArrayOutputStream);
        gZIPOutputStream.write(this.a);
        gZIPOutputStream.finish();
        byte[] arrby = byteArrayOutputStream.toByteArray();
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        return arrby;
        catch (Throwable throwable2) {
            try {
                gZIPOutputStream.close();
                throw throwable2;
            }
            catch (Throwable throwable3) {
                try {
                    throwable2.addSuppressed(throwable3);
                    throw throwable2;
                }
                catch (Throwable throwable422) {}
            }
        }
        try {
            byteArrayOutputStream.close();
            throw throwable422;
        }
        catch (Throwable throwable5) {
            throwable422.addSuppressed(throwable5);
            throw throwable422;
        }
    }

    public final boolean b() {
        byte[] arrby = this.a;
        if (arrby != null && arrby.length != 0) {
            return false;
        }
        return true;
    }

    @Override
    public InputStream i() {
        if (this.b()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }

    @Override
    public String j() {
        return this.c;
    }

    @Override
    public B.d.b k() {
        byte[] arrby = this.a();
        if (arrby == null) {
            return null;
        }
        return B.d.b.a().b(arrby).c(this.b).a();
    }
}

