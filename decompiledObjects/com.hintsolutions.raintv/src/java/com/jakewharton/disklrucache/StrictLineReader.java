/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.Closeable
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.UnsupportedEncodingException
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
package com.jakewharton.disklrucache;

import com.jakewharton.disklrucache.Util;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class StrictLineReader
implements Closeable {
    private static final byte CR = 13;
    private static final byte LF = 10;
    private byte[] buf;
    private final Charset charset;
    private int end;
    private final InputStream in;
    private int pos;

    public StrictLineReader(InputStream inputStream, int n, Charset charset) {
        if (inputStream != null && charset != null) {
            if (n >= 0) {
                if (charset.equals((Object)Util.US_ASCII)) {
                    this.in = inputStream;
                    this.charset = charset;
                    this.buf = new byte[n];
                    return;
                }
                throw new IllegalArgumentException("Unsupported encoding");
            }
            throw new IllegalArgumentException("capacity <= 0");
        }
        throw null;
    }

    public StrictLineReader(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void fillBuf() throws IOException {
        InputStream inputStream = this.in;
        byte[] byArray = this.buf;
        int n = inputStream.read(byArray, 0, byArray.length);
        if (n != -1) {
            this.pos = 0;
            this.end = n;
            return;
        }
        throw new EOFException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void close() throws IOException {
        InputStream inputStream;
        InputStream inputStream2 = inputStream = this.in;
        synchronized (inputStream2) {
            if (this.buf != null) {
                this.buf = null;
                this.in.close();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String readLine() throws IOException {
        InputStream inputStream;
        InputStream inputStream2 = inputStream = this.in;
        synchronized (inputStream2) {
            byte[] byArray;
            int n;
            if (this.buf == null) {
                IOException iOException = new IOException("LineReader is closed");
                throw iOException;
            }
            if (this.pos >= this.end) {
                this.fillBuf();
            }
            for (n = this.pos; n != this.end; ++n) {
                int n2;
                byArray = this.buf;
                if (byArray[n] != 10) continue;
                int n3 = this.pos;
                if (n == n3 || byArray[n2 = n - 1] != 13) {
                    n2 = n;
                }
                String string2 = new String(byArray, n3, n2 - n3, this.charset.name());
                this.pos = n + 1;
                return string2;
            }
            Object object = new ByteArrayOutputStream(this, this.end - this.pos + 80){
                public final StrictLineReader this$0;
                {
                    this.this$0 = strictLineReader;
                    super(n);
                }

                public String toString() {
                    int n;
                    int n2 = n = this.count;
                    if (n > 0) {
                        n2 = n;
                        if (this.buf[n - 1] == 13) {
                            n2 = n - 1;
                        }
                    }
                    try {
                        String string2 = new String(this.buf, 0, n2, this.this$0.charset.name());
                        return string2;
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                        throw new AssertionError((Object)unsupportedEncodingException);
                    }
                }
            };
            block8: while (true) {
                byArray = this.buf;
                n = this.pos;
                object.write(byArray, n, this.end - n);
                this.end = -1;
                this.fillBuf();
                n = this.pos;
                while (true) {
                    if (n == this.end) continue block8;
                    byArray = this.buf;
                    if (byArray[n] == 10) {
                        int n4 = this.pos;
                        if (n != n4) {
                            object.write(byArray, n4, n - n4);
                        }
                        this.pos = n + 1;
                        return object.toString();
                    }
                    ++n;
                }
                break;
            }
        }
    }
}

