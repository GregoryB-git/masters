package i0;

import android.net.Uri;
import g0.AbstractC1297a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class z extends b {

    /* renamed from: e, reason: collision with root package name */
    public final int f14738e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f14739f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f14740g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f14741h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f14742i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f14743j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f14744k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14745l;

    /* renamed from: m, reason: collision with root package name */
    public int f14746m;

    public static final class a extends h {
        public a(Throwable th, int i7) {
            super(th, i7);
        }
    }

    public z() {
        this(2000);
    }

    @Override // i0.g
    public void close() {
        this.f14741h = null;
        MulticastSocket multicastSocket = this.f14743j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) AbstractC1297a.e(this.f14744k));
            } catch (IOException unused) {
            }
            this.f14743j = null;
        }
        DatagramSocket datagramSocket = this.f14742i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14742i = null;
        }
        this.f14744k = null;
        this.f14746m = 0;
        if (this.f14745l) {
            this.f14745l = false;
            r();
        }
    }

    @Override // i0.g
    public long e(k kVar) {
        Uri uri = kVar.f14652a;
        this.f14741h = uri;
        String str = (String) AbstractC1297a.e(uri.getHost());
        int port = this.f14741h.getPort();
        s(kVar);
        try {
            this.f14744k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f14744k, port);
            if (this.f14744k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f14743j = multicastSocket;
                multicastSocket.joinGroup(this.f14744k);
                this.f14742i = this.f14743j;
            } else {
                this.f14742i = new DatagramSocket(inetSocketAddress);
            }
            this.f14742i.setSoTimeout(this.f14738e);
            this.f14745l = true;
            t(kVar);
            return -1L;
        } catch (IOException e7) {
            throw new a(e7, 2001);
        } catch (SecurityException e8) {
            throw new a(e8, 2006);
        }
    }

    @Override // i0.g
    public Uri k() {
        return this.f14741h;
    }

    @Override // d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (this.f14746m == 0) {
            try {
                ((DatagramSocket) AbstractC1297a.e(this.f14742i)).receive(this.f14740g);
                int length = this.f14740g.getLength();
                this.f14746m = length;
                q(length);
            } catch (SocketTimeoutException e7) {
                throw new a(e7, 2002);
            } catch (IOException e8) {
                throw new a(e8, 2001);
            }
        }
        int length2 = this.f14740g.getLength();
        int i9 = this.f14746m;
        int min = Math.min(i9, i8);
        System.arraycopy(this.f14739f, length2 - i9, bArr, i7, min);
        this.f14746m -= min;
        return min;
    }

    public z(int i7) {
        this(i7, 8000);
    }

    public z(int i7, int i8) {
        super(true);
        this.f14738e = i8;
        byte[] bArr = new byte[i7];
        this.f14739f = bArr;
        this.f14740g = new DatagramPacket(bArr, 0, i7);
    }
}
