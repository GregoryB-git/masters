// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import java.net.SocketTimeoutException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.io.IOException;
import g0.a;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.DatagramSocket;
import android.net.Uri;
import java.net.DatagramPacket;

public final class z extends b
{
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
    
    public z(final int n) {
        this(n, 8000);
    }
    
    public z(final int length, final int e) {
        super(true);
        this.e = e;
        final byte[] array = new byte[length];
        this.f = array;
        this.g = new DatagramPacket(array, 0, length);
    }
    
    @Override
    public void close() {
        this.h = null;
        final MulticastSocket j = this.j;
        Label_0033: {
            if (j == null) {
                break Label_0033;
            }
            while (true) {
                try {
                    j.leaveGroup((InetAddress)g0.a.e(this.k));
                    this.j = null;
                    final DatagramSocket i = this.i;
                    if (i != null) {
                        i.close();
                        this.i = null;
                    }
                    this.k = null;
                    this.m = 0;
                    if (this.l) {
                        this.l = false;
                        this.r();
                    }
                }
                catch (IOException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public long e(final k k) {
        final Uri a = k.a;
        this.h = a;
        final String host = (String)g0.a.e(a.getHost());
        final int port = this.h.getPort();
        this.s(k);
        while (true) {
            try {
                this.k = InetAddress.getByName(host);
                final InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
                if (this.k.isMulticastAddress()) {
                    (this.j = new MulticastSocket(inetSocketAddress)).joinGroup(this.k);
                    this.i = this.j;
                }
                else {
                    this.i = new DatagramSocket(inetSocketAddress);
                }
                this.i.setSoTimeout(this.e);
                this.l = true;
                this.t(k);
                return -1L;
                final SecurityException ex;
                throw new a(ex, 2006);
            }
            catch (IOException ex3) {}
            catch (SecurityException ex2) {}
            final SecurityException ex2;
            final SecurityException ex = ex2;
            continue;
        }
    }
    
    @Override
    public Uri k() {
        return this.h;
    }
    
    @Override
    public int read(final byte[] array, final int n, int min) {
        if (min == 0) {
            return 0;
        }
        Label_0086: {
            if (this.m == 0) {
                try {
                    ((DatagramSocket)g0.a.e(this.i)).receive(this.g);
                    this.q(this.m = this.g.getLength());
                    break Label_0086;
                }
                catch (IOException ex2) {}
                catch (SocketTimeoutException ex) {
                    throw new a(ex, 2002);
                }
                final IOException ex2;
                throw new a(ex2, 2001);
            }
        }
        final int length = this.g.getLength();
        final int m = this.m;
        min = Math.min(m, min);
        System.arraycopy(this.f, length - m, array, n, min);
        this.m -= min;
        return min;
    }
    
    public static final class a extends h
    {
        public a(final Throwable t, final int n) {
            super(t, n);
        }
    }
}
