/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.channels.Channels
 *  java.nio.channels.WritableByteChannel
 *  java.util.Random
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.LinkedBlockingQueue
 */
package e4;

import e4.b;
import e4.c;
import e4.e;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class i {
    public BlockingQueue a;
    public final Random b = new Random();
    public volatile boolean c = false;
    public boolean d = false;
    public c e;
    public WritableByteChannel f;
    public final Thread g;

    public i(c c8, String string2, int n8) {
        this.g = c.j().newThread(new Runnable(){

            public void run() {
                i.this.f();
            }
        });
        b b8 = c.i();
        Thread thread = this.d();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("Writer-");
        stringBuilder.append(n8);
        b8.a(thread, stringBuilder.toString());
        this.e = c8;
        this.a = new LinkedBlockingQueue();
    }

    public final ByteBuffer b(byte by, boolean bl, byte[] arrby) {
        int n8 = bl ? 6 : 2;
        int n9 = arrby.length;
        int n10 = 126;
        if (n9 >= 126) {
            n8 = n9 <= 65535 ? (n8 += 2) : (n8 += 8);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)(arrby.length + n8));
        byteBuffer.put((byte)(by | -128));
        n8 = 0;
        if (n9 < 126) {
            by = (byte)n9;
            if (bl) {
                by = (byte)(n9 | 128);
            }
            byteBuffer.put(by);
        } else if (n9 <= 65535) {
            by = (byte)n10;
            if (bl) {
                by = (byte)254;
            }
            byteBuffer.put(by);
            byteBuffer.putShort((short)n9);
        } else {
            by = bl ? (byte)255 : (byte)127;
            byteBuffer.put(by);
            byteBuffer.putInt(0);
            byteBuffer.putInt(n9);
        }
        if (bl) {
            byte[] arrby2 = this.c();
            byteBuffer.put(arrby2);
            for (by = (byte)n8; by < arrby.length; by = (byte)(by + 1)) {
                byteBuffer.put((byte)(arrby[by] ^ arrby2[by % 4]));
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    public final byte[] c() {
        byte[] arrby = new byte[4];
        this.b.nextBytes(arrby);
        return arrby;
    }

    public Thread d() {
        return this.g;
    }

    public final void e(e e8) {
        this.e.k(e8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        block5 : {
            try {
                while (!this.c && !Thread.interrupted()) {
                    this.j();
                }
                break block5;
            }
            catch (InterruptedException interruptedException) {
                return;
            }
            catch (IOException iOException) {}
            this.e(new e("IO Exception", (Throwable)iOException));
            return;
        }
        int n8 = 0;
        while (n8 < this.a.size()) {
            this.j();
            ++n8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(byte by, boolean bl, byte[] byteBuffer) {
        synchronized (this) {
            try {
                byteBuffer = this.b(by, bl, (byte[])byteBuffer);
                if (this.c && (this.d || by != 8)) {
                    throw new e("Shouldn't be sending");
                }
                if (by == 8) {
                    this.d = true;
                }
                this.a.add((Object)byteBuffer);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void h(OutputStream outputStream) {
        this.f = Channels.newChannel((OutputStream)outputStream);
    }

    public void i() {
        this.c = true;
    }

    public final void j() {
        ByteBuffer byteBuffer = (ByteBuffer)this.a.take();
        this.f.write(byteBuffer);
    }

}

