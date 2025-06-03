package v5;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import t5.d0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15984a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15985b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f15986c;

    /* renamed from: d, reason: collision with root package name */
    public static long f15987d;

    public interface a {
    }

    public static final class b implements d0.a<d0.d> {

        /* renamed from: a, reason: collision with root package name */
        public final a f15988a;

        public b(DashMediaSource.a aVar) {
            this.f15988a = aVar;
        }

        @Override // t5.d0.a
        public final void k(d0.d dVar, long j10, long j11, boolean z10) {
        }

        @Override // t5.d0.a
        public final void p(d0.d dVar, long j10, long j11) {
            boolean z10;
            long j12;
            if (this.f15988a != null) {
                Object obj = x.f15985b;
                synchronized (obj) {
                    z10 = x.f15986c;
                }
                if (z10) {
                    DashMediaSource dashMediaSource = DashMediaSource.this;
                    synchronized (obj) {
                        j12 = x.f15986c ? x.f15987d : -9223372036854775807L;
                    }
                    dashMediaSource.T = j12;
                    dashMediaSource.A(true);
                    return;
                }
                a aVar = this.f15988a;
                IOException iOException = new IOException(new ConcurrentModificationException());
                DashMediaSource dashMediaSource2 = DashMediaSource.this;
                dashMediaSource2.getClass();
                m.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                dashMediaSource2.A(true);
            }
        }

        @Override // t5.d0.a
        public final d0.b u(d0.d dVar, long j10, long j11, IOException iOException, int i10) {
            a aVar = this.f15988a;
            if (aVar != null) {
                DashMediaSource dashMediaSource = DashMediaSource.this;
                dashMediaSource.getClass();
                m.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                dashMediaSource.A(true);
            }
            return t5.d0.f14468e;
        }
    }

    public static final class c implements d0.d {
        @Override // t5.d0.d
        public final void a() {
            synchronized (x.f15984a) {
                Object obj = x.f15985b;
                synchronized (obj) {
                    try {
                        if (x.f15986c) {
                            return;
                        }
                        long a10 = x.a();
                        synchronized (obj) {
                            x.f15987d = a10;
                            x.f15986c = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // t5.d0.d
        public final void b() {
        }
    }

    public static long a() {
        synchronized (f15985b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, R.styleable.AppCompatTheme_windowFixedWidthMinor);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
            } else {
                long j10 = currentTimeMillis / 1000;
                Long.signum(j10);
                long j11 = currentTimeMillis - (j10 * 1000);
                long j12 = j10 + 2208988800L;
                bArr[40] = (byte) (j12 >> 24);
                bArr[41] = (byte) (j12 >> 16);
                bArr[42] = (byte) (j12 >> 8);
                bArr[43] = (byte) (j12 >> 0);
                long j13 = (j11 * 4294967296L) / 1000;
                bArr[44] = (byte) (j13 >> 24);
                bArr[45] = (byte) (j13 >> 16);
                bArr[46] = (byte) (j13 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j14 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
            byte b10 = bArr[0];
            int i10 = bArr[1] & 255;
            long d10 = d(bArr, 24);
            long d11 = d(bArr, 32);
            long d12 = d(bArr, 40);
            b((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i10, d12);
            long j15 = (j14 + (((d12 - j14) + (d11 - d10)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j15;
        } finally {
        }
    }

    public static void b(byte b10, byte b11, int i10, long j10) {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(defpackage.f.h("SNTP: Untrusted mode: ", b11));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(defpackage.f.h("SNTP: Untrusted stratum: ", i10));
        }
        if (j10 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
    }

    public static long d(byte[] bArr, int i10) {
        long c10 = c(bArr, i10);
        long c11 = c(bArr, i10 + 4);
        if (c10 == 0 && c11 == 0) {
            return 0L;
        }
        return ((c11 * 1000) / 4294967296L) + ((c10 - 2208988800L) * 1000);
    }
}
