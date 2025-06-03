package t5;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class m0 extends f {

    /* renamed from: e, reason: collision with root package name */
    public final int f14538e;
    public final byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f14539g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f14540h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f14541i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f14542j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f14543k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14544l;

    /* renamed from: m, reason: collision with root package name */
    public int f14545m;

    public static final class a extends l {
        public a(int i10, Exception exc) {
            super(i10, exc);
        }
    }

    public m0() {
        super(true);
        this.f14538e = 8000;
        byte[] bArr = new byte[2000];
        this.f = bArr;
        this.f14539g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // t5.k
    public final long a(n nVar) {
        Uri uri = nVar.f14547a;
        this.f14540h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f14540h.getPort();
        q(nVar);
        try {
            this.f14543k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f14543k, port);
            if (this.f14543k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f14542j = multicastSocket;
                multicastSocket.joinGroup(this.f14543k);
                this.f14541i = this.f14542j;
            } else {
                this.f14541i = new DatagramSocket(inetSocketAddress);
            }
            this.f14541i.setSoTimeout(this.f14538e);
            this.f14544l = true;
            r(nVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(2001, e10);
        } catch (SecurityException e11) {
            throw new a(2006, e11);
        }
    }

    @Override // t5.k
    public final void close() {
        this.f14540h = null;
        MulticastSocket multicastSocket = this.f14542j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f14543k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f14542j = null;
        }
        DatagramSocket datagramSocket = this.f14541i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14541i = null;
        }
        this.f14543k = null;
        this.f14545m = 0;
        if (this.f14544l) {
            this.f14544l = false;
            p();
        }
    }

    @Override // t5.k
    public final Uri l() {
        return this.f14540h;
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f14545m == 0) {
            try {
                DatagramSocket datagramSocket = this.f14541i;
                datagramSocket.getClass();
                datagramSocket.receive(this.f14539g);
                int length = this.f14539g.getLength();
                this.f14545m = length;
                o(length);
            } catch (SocketTimeoutException e10) {
                throw new a(2002, e10);
            } catch (IOException e11) {
                throw new a(2001, e11);
            }
        }
        int length2 = this.f14539g.getLength();
        int i12 = this.f14545m;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f, length2 - i12, bArr, i10, min);
        this.f14545m -= min;
        return min;
    }
}
