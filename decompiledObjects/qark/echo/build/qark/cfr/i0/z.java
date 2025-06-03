/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.IOException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.DatagramPacket
 *  java.net.DatagramSocket
 *  java.net.InetAddress
 *  java.net.InetSocketAddress
 *  java.net.MulticastSocket
 *  java.net.SocketAddress
 *  java.net.SocketTimeoutException
 */
package i0;

import android.net.Uri;
import i0.b;
import i0.h;
import i0.k;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

public final class z
extends b {
    public final int e;
    public final byte[] f;
    public final DatagramPacket g;
    public Uri h;
    public DatagramSocket i;
    public MulticastSocket j;
    public InetAddress k;
    public boolean l;
    public int m;

    public z() {
        this(2000);
    }

    public z(int n8) {
        this(n8, 8000);
    }

    public z(int n8, int n9) {
        super(true);
        this.e = n9;
        byte[] arrby = new byte[n8];
        this.f = arrby;
        this.g = new DatagramPacket(arrby, 0, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress)g0.a.e((Object)this.k));
            }
            catch (IOException iOException) {}
            this.j = null;
        }
        if ((multicastSocket = this.i) != null) {
            multicastSocket.close();
            this.i = null;
        }
        this.k = null;
        this.m = 0;
        if (this.l) {
            this.l = false;
            this.r();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long e(k k8) {
        Object object = k8.a;
        this.h = object;
        object = (String)g0.a.e(object.getHost());
        int n8 = this.h.getPort();
        this.s(k8);
        try {
            this.k = InetAddress.getByName((String)object);
            object = new InetSocketAddress(this.k, n8);
            if (this.k.isMulticastAddress()) {
                this.j = object = new MulticastSocket((SocketAddress)object);
                object.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket((SocketAddress)object);
            }
            this.i.setSoTimeout(this.e);
        }
        catch (IOException iOException) {
            throw new a((Throwable)iOException, 2001);
        }
        catch (SecurityException securityException) {
            throw new a((Throwable)securityException, 2006);
        }
        this.l = true;
        this.t(k8);
        return -1L;
    }

    @Override
    public Uri k() {
        return this.h;
    }

    @Override
    public int read(byte[] arrby, int n8, int n9) {
        int n10;
        block6 : {
            if (n9 == 0) {
                return 0;
            }
            if (this.m == 0) {
                SocketTimeoutException socketTimeoutException2;
                block5 : {
                    try {
                        ((DatagramSocket)g0.a.e((Object)this.i)).receive(this.g);
                    }
                    catch (IOException iOException) {
                    }
                    catch (SocketTimeoutException socketTimeoutException2) {
                        break block5;
                    }
                    this.m = n10 = this.g.getLength();
                    this.q(n10);
                    break block6;
                    throw new a((Throwable)iOException, 2001);
                }
                throw new a((Throwable)socketTimeoutException2, 2002);
            }
        }
        n10 = this.g.getLength();
        int n11 = this.m;
        n9 = Math.min((int)n11, (int)n9);
        System.arraycopy((Object)this.f, (int)(n10 - n11), (Object)arrby, (int)n8, (int)n9);
        this.m -= n9;
        return n9;
    }

    public static final class a
    extends h {
        public a(Throwable throwable, int n8) {
            super(throwable, n8);
        }
    }

}

