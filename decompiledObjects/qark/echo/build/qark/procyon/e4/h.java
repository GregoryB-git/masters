// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e4;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.io.DataInputStream;

public class h
{
    public DataInputStream a;
    public c b;
    public d c;
    public byte[] d;
    public a.b e;
    public volatile boolean f;
    
    public h(final c b) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = new byte[112];
        this.f = false;
        this.b = b;
    }
    
    public final void a(final boolean b, final byte b2, final byte[] array) {
        if (b2 == 9) {
            if (b) {
                this.c(array);
                return;
            }
            throw new e("PING must not fragment across frames");
        }
        else {
            final a.b e = this.e;
            if (e != null && b2 != 0) {
                throw new e("Failed to continue outstanding frame");
            }
            if (e == null && b2 == 0) {
                throw new e("Received continuing frame, but there's nothing to continue");
            }
            if (e == null) {
                this.e = e4.a.a(b2);
            }
            if (!this.e.a(array)) {
                throw new e("Failed to decode frame");
            }
            if (!b) {
                return;
            }
            final g b3 = this.e.b();
            this.e = null;
            if (b3 != null) {
                this.c.f(b3);
                return;
            }
            throw new e("Failed to decode whole message");
        }
    }
    
    public final void b(final e e) {
        this.h();
        this.b.k(e);
    }
    
    public final void c(final byte[] array) {
        if (array.length <= 125) {
            this.b.m(array);
            return;
        }
        throw new e("PING frame too long");
    }
    
    public final long d(final byte[] array, final int n) {
        return ((long)array[n] << 56) + ((long)(array[n + 1] & 0xFF) << 48) + ((long)(array[n + 2] & 0xFF) << 40) + ((long)(array[n + 3] & 0xFF) << 32) + ((long)(array[n + 4] & 0xFF) << 24) + ((array[n + 5] & 0xFF) << 16) + ((array[n + 6] & 0xFF) << 8) + (array[n + 7] & 0xFF);
    }
    
    public final int e(final byte[] b, final int off, final int len) {
        this.a.readFully(b, off, len);
        return len;
    }
    
    public void f() {
        this.c = this.b.g();
        while (true) {
            if (this.f) {
                return;
            }
        Label_0256_Outer:
            while (true) {
            Label_0219_Outer:
                while (true) {
                    while (true) {
                        byte i = 0;
                    Label_0333:
                        while (true) {
                            Label_0327: {
                                while (true) {
                                    try {
                                        final int e = this.e(this.d, 0, 1);
                                        final byte[] d = this.d;
                                        final byte b = d[0];
                                        if ((b & 0x80) == 0x0) {
                                            goto Label_0311;
                                        }
                                        final boolean b2 = true;
                                        if ((b & 0x70) != 0x0) {
                                            throw new e("Invalid frame received");
                                        }
                                        i = (byte)(b & 0xF);
                                        final int n = e + this.e(d, e, 1);
                                        final byte[] d2 = this.d;
                                        final byte b3 = d2[1];
                                        long d3;
                                        if (b3 < 126) {
                                            d3 = b3;
                                        }
                                        else if (b3 == 126) {
                                            this.e(d2, n, 2);
                                            final byte[] d4 = this.d;
                                            d3 = ((long)(d4[2] & 0xFF) << 8 | (long)(d4[3] & 0xFF));
                                        }
                                        else {
                                            if (b3 != 127) {
                                                break Label_0327;
                                            }
                                            d3 = this.d(this.d, n + this.e(d2, n, 8) - 8);
                                        }
                                        final int n2 = (int)d3;
                                        final byte[] array = new byte[n2];
                                        this.e(array, 0, n2);
                                        if (i == 8) {
                                            this.b.l();
                                            break;
                                        }
                                        break Label_0333;
                                        this.a(b2, i, array);
                                        break;
                                        final IOException ex;
                                        this.b(new e("IO Error", ex));
                                        break;
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("Unsupported opcode: ");
                                        sb.append(i);
                                        throw new e(sb.toString());
                                    }
                                    catch (SocketTimeoutException ex3) {
                                        break;
                                    }
                                    catch (e e2) {}
                                    catch (IOException ex2) {}
                                    final IOException ex2;
                                    final IOException ex = ex2;
                                    continue Label_0219_Outer;
                                }
                            }
                            long d3 = 0L;
                            continue Label_0256_Outer;
                        }
                        if (i == 10) {
                            break;
                        }
                        if (i != 1 && i != 2 && i != 9 && i != 0) {
                            continue;
                        }
                        break;
                    }
                    continue Label_0219_Outer;
                }
            }
        }
    }
    
    public void g(final DataInputStream a) {
        this.a = a;
    }
    
    public void h() {
        this.f = true;
    }
}
