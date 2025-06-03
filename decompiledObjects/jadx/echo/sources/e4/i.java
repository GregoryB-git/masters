package e4;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public BlockingQueue f13993a;

    /* renamed from: e, reason: collision with root package name */
    public C1267c f13997e;

    /* renamed from: f, reason: collision with root package name */
    public WritableByteChannel f13998f;

    /* renamed from: b, reason: collision with root package name */
    public final Random f13994b = new Random();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f13995c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13996d = false;

    /* renamed from: g, reason: collision with root package name */
    public final Thread f13999g = C1267c.j().newThread(new a());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f();
        }
    }

    public i(C1267c c1267c, String str, int i7) {
        C1267c.i().a(d(), str + "Writer-" + i7);
        this.f13997e = c1267c;
        this.f13993a = new LinkedBlockingQueue();
    }

    public final ByteBuffer b(byte b7, boolean z7, byte[] bArr) {
        int i7 = z7 ? 6 : 2;
        int length = bArr.length;
        if (length >= 126) {
            i7 = length <= 65535 ? i7 + 2 : i7 + 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + i7);
        allocate.put((byte) (b7 | Byte.MIN_VALUE));
        if (length < 126) {
            if (z7) {
                length |= 128;
            }
            allocate.put((byte) length);
        } else if (length <= 65535) {
            allocate.put((byte) (z7 ? 254 : 126));
            allocate.putShort((short) length);
        } else {
            allocate.put((byte) (z7 ? 255 : 127));
            allocate.putInt(0);
            allocate.putInt(length);
        }
        if (z7) {
            byte[] c7 = c();
            allocate.put(c7);
            for (int i8 = 0; i8 < bArr.length; i8++) {
                allocate.put((byte) (bArr[i8] ^ c7[i8 % 4]));
            }
        }
        allocate.flip();
        return allocate;
    }

    public final byte[] c() {
        byte[] bArr = new byte[4];
        this.f13994b.nextBytes(bArr);
        return bArr;
    }

    public Thread d() {
        return this.f13999g;
    }

    public final void e(C1269e c1269e) {
        this.f13997e.k(c1269e);
    }

    public final void f() {
        while (!this.f13995c && !Thread.interrupted()) {
            try {
                j();
            } catch (IOException e7) {
                e(new C1269e("IO Exception", e7));
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        for (int i7 = 0; i7 < this.f13993a.size(); i7++) {
            j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        r1.f13996d = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void g(byte r2, boolean r3, byte[] r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r3 = r1.b(r2, r3, r4)     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r1.f13995c     // Catch: java.lang.Throwable -> L1a
            r0 = 8
            if (r4 == 0) goto L1c
            boolean r4 = r1.f13996d     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L12
            if (r2 != r0) goto L12
            goto L1c
        L12:
            e4.e r2 = new e4.e     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "Shouldn't be sending"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L28
        L1c:
            if (r2 != r0) goto L21
            r2 = 1
            r1.f13996d = r2     // Catch: java.lang.Throwable -> L1a
        L21:
            java.util.concurrent.BlockingQueue r2 = r1.f13993a     // Catch: java.lang.Throwable -> L1a
            r2.add(r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            return
        L28:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.i.g(byte, boolean, byte[]):void");
    }

    public void h(OutputStream outputStream) {
        this.f13998f = Channels.newChannel(outputStream);
    }

    public void i() {
        this.f13995c = true;
    }

    public final void j() {
        this.f13998f.write((ByteBuffer) this.f13993a.take());
    }
}
