package C0;

import B0.n;
import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f865a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f866b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f867c = false;

    /* renamed from: d, reason: collision with root package name */
    public static long f868d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static String f869e = "time.android.com";

    public interface b {
        void a();

        void b(IOException iOException);
    }

    public static void g(byte b7, byte b8, int i7, long j7) {
        if (b7 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b8 != 4 && b8 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b8));
        }
        if (i7 != 0 && i7 <= 15) {
            if (j7 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i7);
        }
    }

    public static long h() {
        long j7;
        synchronized (f866b) {
            try {
                j7 = f867c ? f868d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j7;
    }

    public static String i() {
        String str;
        synchronized (f866b) {
            str = f869e;
        }
        return str;
    }

    public static void j(n nVar, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.a();
            }
        } else {
            if (nVar == null) {
                nVar = new n("SntpClient");
            }
            nVar.n(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z7;
        synchronized (f866b) {
            z7 = f867c;
        }
        return z7;
    }

    public static long l() {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j7 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b7 = bArr[0];
            int i7 = bArr[1] & 255;
            long n7 = n(bArr, 24);
            long n8 = n(bArr, 32);
            long n9 = n(bArr, 40);
            g((byte) ((b7 >> 6) & 3), (byte) (b7 & 7), i7, n9);
            long j8 = (j7 + (((n8 - n7) + (n9 - j7)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j8;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(byte[] bArr, int i7) {
        int i8 = bArr[i7];
        int i9 = bArr[i7 + 1];
        int i10 = bArr[i7 + 2];
        int i11 = bArr[i7 + 3];
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        if ((i9 & 128) == 128) {
            i9 = (i9 & 127) + 128;
        }
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        return (i8 << 24) + (i9 << 16) + (i10 << 8) + i11;
    }

    public static long n(byte[] bArr, int i7) {
        long m7 = m(bArr, i7);
        long m8 = m(bArr, i7 + 4);
        if (m7 == 0 && m8 == 0) {
            return 0L;
        }
        return ((m7 - 2208988800L) * 1000) + ((m8 * 1000) / 4294967296L);
    }

    public static void o(byte[] bArr, int i7, long j7) {
        if (j7 == 0) {
            Arrays.fill(bArr, i7, i7 + 8, (byte) 0);
            return;
        }
        long j8 = j7 / 1000;
        long j9 = j7 - (j8 * 1000);
        bArr[i7] = (byte) (r2 >> 24);
        bArr[i7 + 1] = (byte) (r2 >> 16);
        bArr[i7 + 2] = (byte) (r2 >> 8);
        bArr[i7 + 3] = (byte) (j8 + 2208988800L);
        long j10 = (j9 * 4294967296L) / 1000;
        bArr[i7 + 4] = (byte) (j10 >> 24);
        bArr[i7 + 5] = (byte) (j10 >> 16);
        bArr[i7 + 6] = (byte) (j10 >> 8);
        bArr[i7 + 7] = (byte) (Math.random() * 255.0d);
    }

    public static final class d implements n.e {
        public d() {
        }

        @Override // B0.n.e
        public void b() {
            synchronized (a.f865a) {
                synchronized (a.f866b) {
                    if (a.f867c) {
                        return;
                    }
                    long l7 = a.l();
                    synchronized (a.f866b) {
                        long unused = a.f868d = l7;
                        boolean unused2 = a.f867c = true;
                    }
                }
            }
        }

        @Override // B0.n.e
        public void c() {
        }
    }

    public static final class c implements n.b {

        /* renamed from: o, reason: collision with root package name */
        public final b f870o;

        public c(b bVar) {
            this.f870o = bVar;
        }

        @Override // B0.n.b
        public void o(n.e eVar, long j7, long j8) {
            if (this.f870o != null) {
                if (a.k()) {
                    this.f870o.a();
                } else {
                    this.f870o.b(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // B0.n.b
        public n.c r(n.e eVar, long j7, long j8, IOException iOException, int i7) {
            b bVar = this.f870o;
            if (bVar != null) {
                bVar.b(iOException);
            }
            return n.f633f;
        }

        @Override // B0.n.b
        public void t(n.e eVar, long j7, long j8, boolean z7) {
        }
    }
}
