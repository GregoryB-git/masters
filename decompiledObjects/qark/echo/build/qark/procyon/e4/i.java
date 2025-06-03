// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e4;

import java.nio.channels.Channels;
import java.io.OutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class i
{
    public BlockingQueue a;
    public final Random b;
    public volatile boolean c;
    public boolean d;
    public c e;
    public WritableByteChannel f;
    public final Thread g;
    
    public i(final c e, final String str, final int i) {
        this.b = new Random();
        this.c = false;
        this.d = false;
        this.g = e4.c.j().newThread(new Runnable() {
            @Override
            public void run() {
                i.this.f();
            }
        });
        final b j = e4.c.i();
        final Thread d = this.d();
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Writer-");
        sb.append(i);
        j.a(d, sb.toString());
        this.e = e;
        this.a = new LinkedBlockingQueue();
    }
    
    public final ByteBuffer b(final byte b, final boolean b2, final byte[] array) {
        int n;
        if (b2) {
            n = 6;
        }
        else {
            n = 2;
        }
        final int length = array.length;
        final int n2 = 126;
        if (length >= 126) {
            if (length <= 65535) {
                n += 2;
            }
            else {
                n += 8;
            }
        }
        final ByteBuffer allocate = ByteBuffer.allocate(array.length + n);
        allocate.put((byte)(b | 0xFFFFFF80));
        final int n3 = 0;
        if (length < 126) {
            int n4 = length;
            if (b2) {
                n4 = (length | 0x80);
            }
            allocate.put((byte)n4);
        }
        else if (length <= 65535) {
            int n5 = n2;
            if (b2) {
                n5 = 254;
            }
            allocate.put((byte)n5);
            allocate.putShort((short)length);
        }
        else {
            int n6;
            if (b2) {
                n6 = 255;
            }
            else {
                n6 = 127;
            }
            allocate.put((byte)n6);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        if (b2) {
            final byte[] c = this.c();
            allocate.put(c);
            for (int i = n3; i < array.length; ++i) {
                allocate.put((byte)(array[i] ^ c[i % 4]));
            }
        }
        allocate.flip();
        return allocate;
    }
    
    public final byte[] c() {
        final byte[] bytes = new byte[4];
        this.b.nextBytes(bytes);
        return bytes;
    }
    
    public Thread d() {
        return this.g;
    }
    
    public final void e(final e e) {
        this.e.k(e);
    }
    
    public final void f() {
    Label_0020_Outer:
        while (true) {
        Label_0020:
            while (true) {
                Label_0065: {
                    while (true) {
                        try {
                            while (!this.c && !Thread.interrupted()) {
                                this.j();
                            }
                            break Label_0065;
                            final IOException ex;
                            this.e(new e("IO Exception", ex));
                            Label_0058: {
                                return;
                            }
                            // iftrue(Label_0058:, n >= this.a.size())
                            this.j();
                            final int n = n + 1;
                            continue Label_0020;
                        }
                        catch (InterruptedException ex3) {
                            return;
                        }
                        catch (IOException ex2) {}
                        final IOException ex2;
                        final IOException ex = ex2;
                        continue Label_0020_Outer;
                    }
                }
                final int n = 0;
                continue Label_0020;
            }
        }
    }
    
    public void g(final byte b, final boolean b2, final byte[] array) {
        // monitorenter(this)
        while (true) {
            try {
                final ByteBuffer b3 = this.b(b, b2, array);
                if (this.c && (this.d || b != 8)) {
                    throw new e("Shouldn't be sending");
                }
                if (b == 8) {
                    this.d = true;
                }
                this.a.add(b3);
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void h(final OutputStream out) {
        this.f = Channels.newChannel(out);
    }
    
    public void i() {
        this.c = true;
    }
    
    public final void j() {
        this.f.write(this.a.take());
    }
}
