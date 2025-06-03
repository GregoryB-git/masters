/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class B
implements F {
    public final File a;
    public final String b;
    public final String c;

    public B(String string2, String string3, File file) {
        this.b = string2;
        this.c = string3;
        this.a = file;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private byte[] a() {
        GZIPOutputStream gZIPOutputStream;
        InputStream inputStream;
        Throwable throwable622;
        int n8;
        Throwable throwable2222;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] arrby;
        block23 : {
            arrby = new byte[8192];
            inputStream = this.i();
            byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream((OutputStream)byteArrayOutputStream);
            if (inputStream != null) break block23;
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            if (inputStream == null) return null;
            inputStream.close();
            return null;
        }
        while ((n8 = inputStream.read(arrby)) > 0) {
            gZIPOutputStream.write(arrby, 0, n8);
        }
        gZIPOutputStream.finish();
        arrby = byteArrayOutputStream.toByteArray();
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        inputStream.close();
        return arrby;
        {
            catch (IOException iOException) {
                return null;
            }
        }
        catch (Throwable throwable3) {}
        try {
            gZIPOutputStream.close();
            throw throwable3;
        }
        catch (Throwable throwable4) {
            try {
                throwable3.addSuppressed(throwable4);
                throw throwable3;
            }
            catch (Throwable throwable2222) {}
        }
        try {
            byteArrayOutputStream.close();
            throw throwable2222;
        }
        catch (Throwable throwable5) {
            try {
                throwable2222.addSuppressed(throwable5);
                throw throwable2222;
            }
            catch (Throwable throwable622) {}
        }
        if (inputStream == null) throw throwable622;
        try {
            inputStream.close();
            throw throwable622;
        }
        catch (Throwable throwable7) {
            throwable622.addSuppressed(throwable7);
            throw throwable622;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public InputStream i() {
        if (!this.a.exists()) return null;
        if (!this.a.isFile()) {
            return null;
        }
        try {
            return new FileInputStream(this.a);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    @Override
    public String j() {
        return this.c;
    }

    @Override
    public B.d.b k() {
        byte[] arrby = this.a();
        if (arrby != null) {
            return B.d.b.a().b(arrby).c(this.b).a();
        }
        return null;
    }
}

