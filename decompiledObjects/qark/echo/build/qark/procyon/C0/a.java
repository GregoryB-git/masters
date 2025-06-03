// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C0;

import java.util.ConcurrentModificationException;
import java.util.Arrays;
import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import B0.n;
import java.io.IOException;

public abstract class a
{
    public static final Object a;
    public static final Object b;
    public static boolean c = false;
    public static long d = 0L;
    public static String e = "time.android.com";
    
    static {
        a = new Object();
        b = new Object();
    }
    
    public static /* synthetic */ Object a() {
        return C0.a.a;
    }
    
    public static /* synthetic */ Object b() {
        return C0.a.b;
    }
    
    public static /* synthetic */ boolean c() {
        return C0.a.c;
    }
    
    public static /* synthetic */ boolean d(final boolean c) {
        return C0.a.c = c;
    }
    
    public static /* synthetic */ long f(final long d) {
        return C0.a.d = d;
    }
    
    public static void g(final byte b, final byte i, final int j, final long n) {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (i != 4 && i != 5) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SNTP: Untrusted mode: ");
            sb.append(i);
            throw new IOException(sb.toString());
        }
        if (j == 0 || j > 15) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("SNTP: Untrusted stratum: ");
            sb2.append(j);
            throw new IOException(sb2.toString());
        }
        if (n != 0L) {
            return;
        }
        throw new IOException("SNTP: Zero transmitTime");
    }
    
    public static long h() {
        while (true) {
            final Object b = C0.a.b;
            // monitorenter(b)
            while (true) {
                Label_0031: {
                    while (true) {
                        try {
                            if (C0.a.c) {
                                // monitorexit(b)
                                return C0.a.d;
                            }
                            break Label_0031;
                            // monitorexit(b)
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                final long d = -9223372036854775807L;
                continue;
            }
        }
    }
    
    public static String i() {
        synchronized (C0.a.b) {
            return C0.a.e;
        }
    }
    
    public static void j(final n n, final b b) {
        if (k()) {
            if (b != null) {
                b.a();
            }
            return;
        }
        n n2;
        if ((n2 = n) == null) {
            n2 = new n("SntpClient");
        }
        n2.n((n.e)new d(null), (n.b)new c(b), 1);
    }
    
    public static boolean k() {
        synchronized (C0.a.b) {
            return C0.a.c;
        }
    }
    
    public static long l() {
        final InetAddress byName = InetAddress.getByName(i());
        final DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            final byte[] array = new byte[48];
            final DatagramPacket p = new DatagramPacket(array, 48, byName, 123);
            array[0] = 27;
            final long currentTimeMillis = System.currentTimeMillis();
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            o(array, 40, currentTimeMillis);
            datagramSocket.send(p);
            datagramSocket.receive(new DatagramPacket(array, 48));
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            final long n = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            final byte b = array[0];
            final byte b2 = (byte)(b >> 6 & 0x3);
            final byte b3 = (byte)(b & 0x7);
            final byte b4 = array[1];
            final long n2 = n(array, 24);
            final long n3 = n(array, 32);
            final long n4 = n(array, 40);
            g(b2, b3, b4 & 0xFF, n4);
            final long n5 = (n3 - n2 + (n4 - n)) / 2L;
            datagramSocket.close();
            return n + n5 - elapsedRealtime2;
        }
        finally {
            try {
                datagramSocket.close();
            }
            finally {
                final Throwable t;
                final Throwable exception;
                t.addSuppressed(exception);
            }
        }
    }
    
    public static long m(final byte[] array, int n) {
        final int n2 = array[n];
        final byte b = array[n + 1];
        final byte b2 = array[n + 2];
        final byte b3 = array[n + 3];
        n = n2;
        if ((n2 & 0x80) == 0x80) {
            n = (n2 & 0x7F) + 128;
        }
        int n3 = b;
        if ((b & 0x80) == 0x80) {
            n3 = (b & 0x7F) + 128;
        }
        int n4 = b2;
        if ((b2 & 0x80) == 0x80) {
            n4 = (b2 & 0x7F) + 128;
        }
        int n5 = b3;
        if ((b3 & 0x80) == 0x80) {
            n5 = (b3 & 0x7F) + 128;
        }
        return ((long)n << 24) + ((long)n3 << 16) + ((long)n4 << 8) + n5;
    }
    
    public static long n(final byte[] array, final int n) {
        final long m = m(array, n);
        final long i = m(array, n + 4);
        if (m == 0L && i == 0L) {
            return 0L;
        }
        return (m - 2208988800L) * 1000L + i * 1000L / 4294967296L;
    }
    
    public static void o(final byte[] a, final int fromIndex, long n) {
        if (n == 0L) {
            Arrays.fill(a, fromIndex, fromIndex + 8, (byte)0);
            return;
        }
        final long n2 = n / 1000L;
        final long n3 = n2 + 2208988800L;
        a[fromIndex] = (byte)(n3 >> 24);
        a[fromIndex + 1] = (byte)(n3 >> 16);
        a[fromIndex + 2] = (byte)(n3 >> 8);
        a[fromIndex + 3] = (byte)n3;
        n = (n - n2 * 1000L) * 4294967296L / 1000L;
        a[fromIndex + 4] = (byte)(n >> 24);
        a[fromIndex + 5] = (byte)(n >> 16);
        a[fromIndex + 6] = (byte)(n >> 8);
        a[fromIndex + 7] = (byte)(Math.random() * 255.0);
    }
    
    public interface b
    {
        void a();
        
        void b(final IOException p0);
    }
    
    public static final class c implements n.b
    {
        public final b o;
        
        public c(final b o) {
            this.o = o;
        }
        
        @Override
        public void o(final e e, final long n, final long n2) {
            if (this.o != null) {
                if (!a.k()) {
                    this.o.b(new IOException(new ConcurrentModificationException()));
                    return;
                }
                this.o.a();
            }
        }
        
        @Override
        public n.c r(final e e, final long n, final long n2, final IOException ex, final int n3) {
            final b o = this.o;
            if (o != null) {
                o.b(ex);
            }
            return n.f;
        }
        
        @Override
        public void t(final e e, final long n, final long n2, final boolean b) {
        }
    }
    
    public static final class d implements e
    {
        @Override
        public void b() {
            final Object a = C0.a.a();
            // monitorenter(a)
            while (true) {
                Object b;
                try {
                    b = C0.a.b();
                    // monitorenter(b)
                    final boolean b2 = C0.a.c();
                    if (b2) {
                        final Object o = b;
                        // monitorexit(o)
                        final Object o2 = a;
                        // monitorexit(o2)
                        return;
                    }
                    break Label_0036;
                }
                finally {
                    final Object o3;
                    b = o3;
                    // monitorexit(a)
                    // monitorexit(b)
                    final long e = l();
                    synchronized (C0.a.b()) {
                        C0.a.f(e);
                        C0.a.d(true);
                        // monitorexit(a.b())
                        return;
                    }
                }
                // monitorexit(b)
                try {
                    final boolean b2 = C0.a.c();
                    if (b2) {
                        final Object o = b;
                        // monitorexit(o)
                        final Object o2 = a;
                        // monitorexit(o2)
                        return;
                    }
                    continue;
                }
                finally {}
                break;
            }
        }
        
        @Override
        public void c() {
        }
    }
}
