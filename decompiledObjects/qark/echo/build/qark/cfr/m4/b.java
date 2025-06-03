/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.OutputStream
 *  java.lang.IndexOutOfBoundsException
 */
package m4;

import java.io.OutputStream;

public final class b
extends OutputStream {
    public long o = 0L;

    public long a() {
        return this.o;
    }

    public void write(int n8) {
        ++this.o;
    }

    public void write(byte[] arrby) {
        this.o += (long)arrby.length;
    }

    public void write(byte[] arrby, int n8, int n9) {
        if (n8 >= 0 && n8 <= arrby.length && n9 >= 0 && (n8 += n9) <= arrby.length && n8 >= 0) {
            this.o += (long)n9;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

