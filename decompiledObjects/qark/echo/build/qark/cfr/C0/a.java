/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.io.IOException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.DatagramPacket
 *  java.net.DatagramSocket
 *  java.net.InetAddress
 *  java.util.Arrays
 *  java.util.ConcurrentModificationException
 */
package C0;

import B0.n;
import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

public abstract class a {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c = false;
    public static long d = 0L;
    public static String e = "time.android.com";

    public static void g(byte by, byte by2, int n8, long l8) {
        if (by != 3) {
            if (by2 != 4 && by2 != 5) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SNTP: Untrusted mode: ");
                stringBuilder.append((int)by2);
                throw new IOException(stringBuilder.toString());
            }
            if (n8 != 0 && n8 <= 15) {
                if (l8 != 0L) {
                    return;
                }
                throw new IOException("SNTP: Zero transmitTime");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SNTP: Untrusted stratum: ");
            stringBuilder.append(n8);
            throw new IOException(stringBuilder.toString());
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long h() {
        Object object = b;
        synchronized (object) {
            try {
                if (!c) return -9223372036854775807L;
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String i() {
        Object object = b;
        synchronized (object) {
            return e;
        }
    }

    public static void j(n n8, b b8) {
        if (a.k()) {
            if (b8 != null) {
                b8.a();
            }
            return;
        }
        n n9 = n8;
        if (n8 == null) {
            n9 = new n("SntpClient");
        }
        n9.n(new d(null), new c(b8), 1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean k() {
        Object object = b;
        synchronized (object) {
            return c;
        }
    }

    public static long l() {
        byte[] arrby;
        InetAddress inetAddress = InetAddress.getByName((String)a.i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            arrby = new byte[48];
            inetAddress = new DatagramPacket(arrby, 48, inetAddress, 123);
        }
        catch (Throwable throwable) {
            try {
                datagramSocket.close();
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
        arrby[0] = 27;
        long l8 = System.currentTimeMillis();
        long l9 = SystemClock.elapsedRealtime();
        a.o(arrby, 40, l8);
        datagramSocket.send((DatagramPacket)inetAddress);
        datagramSocket.receive(new DatagramPacket(arrby, 48));
        long l10 = SystemClock.elapsedRealtime();
        l8 += l10 - l9;
        byte by = arrby[0];
        byte by2 = (byte)(by >> 6 & 3);
        byte by3 = (byte)(by & 7);
        by = arrby[1];
        l9 = a.n(arrby, 24);
        long l11 = a.n(arrby, 32);
        long l12 = a.n(arrby, 40);
        a.g(by2, by3, by & 255, l12);
        l9 = (l11 - l9 + (l12 - l8)) / 2L;
        datagramSocket.close();
        return l8 + l9 - l10;
    }

    public static long m(byte[] arrby, int n8) {
        int n9 = arrby[n8];
        int n10 = arrby[n8 + 1];
        int n11 = arrby[n8 + 2];
        int n12 = arrby[n8 + 3];
        n8 = n9;
        if ((n9 & 128) == 128) {
            n8 = (n9 & 127) + 128;
        }
        n9 = n10;
        if ((n10 & 128) == 128) {
            n9 = (n10 & 127) + 128;
        }
        n10 = n11;
        if ((n11 & 128) == 128) {
            n10 = (n11 & 127) + 128;
        }
        n11 = n12;
        if ((n12 & 128) == 128) {
            n11 = (n12 & 127) + 128;
        }
        return ((long)n8 << 24) + ((long)n9 << 16) + ((long)n10 << 8) + (long)n11;
    }

    public static long n(byte[] arrby, int n8) {
        long l8 = a.m(arrby, n8);
        long l9 = a.m(arrby, n8 + 4);
        if (l8 == 0L && l9 == 0L) {
            return 0L;
        }
        return (l8 - 2208988800L) * 1000L + l9 * 1000L / 0x100000000L;
    }

    public static void o(byte[] arrby, int n8, long l8) {
        if (l8 == 0L) {
            Arrays.fill((byte[])arrby, (int)n8, (int)(n8 + 8), (byte)0);
            return;
        }
        long l9 = l8 / 1000L;
        long l10 = l9 + 2208988800L;
        arrby[n8] = (byte)(l10 >> 24);
        arrby[n8 + 1] = (byte)(l10 >> 16);
        arrby[n8 + 2] = (byte)(l10 >> 8);
        arrby[n8 + 3] = (byte)l10;
        l8 = (l8 - l9 * 1000L) * 0x100000000L / 1000L;
        arrby[n8 + 4] = (byte)(l8 >> 24);
        arrby[n8 + 5] = (byte)(l8 >> 16);
        arrby[n8 + 6] = (byte)(l8 >> 8);
        arrby[n8 + 7] = (byte)(Math.random() * 255.0);
    }

    public static interface b {
        public void a();

        public void b(IOException var1);
    }

    public static final class c
    implements n.b {
        public final b o;

        public c(b b8) {
            this.o = b8;
        }

        @Override
        public void o(n.e e8, long l8, long l9) {
            if (this.o != null) {
                if (!a.k()) {
                    this.o.b(new IOException((Throwable)new ConcurrentModificationException()));
                    return;
                }
                this.o.a();
            }
        }

        @Override
        public n.c r(n.e object, long l8, long l9, IOException iOException, int n8) {
            object = this.o;
            if (object != null) {
                object.b(iOException);
            }
            return n.f;
        }

        @Override
        public void t(n.e e8, long l8, long l9, boolean bl) {
        }
    }

    public static final class d
    implements n.e {
        public d() {
        }

        public /* synthetic */ d( a8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void b() {
            Object object = a;
            // MONITORENTER : object
            Object object2 = b;
            // MONITORENTER : object2
            if (c) {
                // MONITOREXIT : object2
                // MONITOREXIT : object
                return;
            }
            long l8 = a.l();
            object2 = b;
            // MONITORENTER : object2
            d = l8;
            c = true;
            // MONITOREXIT : object2
            // MONITOREXIT : object
        }

        @Override
        public void c() {
        }
    }

}

