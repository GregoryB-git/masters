/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.DataInputStream
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.SocketTimeoutException
 */
package e4;

import e4.a;
import e4.c;
import e4.d;
import e4.e;
import e4.g;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;

public class h {
    public DataInputStream a = null;
    public c b = null;
    public d c = null;
    public byte[] d = new byte[112];
    public a.b e;
    public volatile boolean f = false;

    public h(c c8) {
        this.b = c8;
    }

    public final void a(boolean bl, byte by, byte[] object) {
        if (by == 9) {
            if (bl) {
                this.c((byte[])object);
                return;
            }
            throw new e("PING must not fragment across frames");
        }
        a.b b8 = this.e;
        if (b8 != null && by != 0) {
            throw new e("Failed to continue outstanding frame");
        }
        if (b8 == null && by == 0) {
            throw new e("Received continuing frame, but there's nothing to continue");
        }
        if (b8 == null) {
            this.e = a.a(by);
        }
        if (this.e.a((byte[])object)) {
            if (bl) {
                object = this.e.b();
                this.e = null;
                if (object != null) {
                    this.c.f((g)object);
                    return;
                }
                throw new e("Failed to decode whole message");
            }
            return;
        }
        throw new e("Failed to decode frame");
    }

    public final void b(e e8) {
        this.h();
        this.b.k(e8);
    }

    public final void c(byte[] arrby) {
        if (arrby.length <= 125) {
            this.b.m(arrby);
            return;
        }
        throw new e("PING frame too long");
    }

    public final long d(byte[] arrby, int n8) {
        return ((long)arrby[n8] << 56) + ((long)(arrby[n8 + 1] & 255) << 48) + ((long)(arrby[n8 + 2] & 255) << 40) + ((long)(arrby[n8 + 3] & 255) << 32) + ((long)(arrby[n8 + 4] & 255) << 24) + (long)((arrby[n8 + 5] & 255) << 16) + (long)((arrby[n8 + 6] & 255) << 8) + (long)(arrby[n8 + 7] & 255);
    }

    public final int e(byte[] arrby, int n8, int n9) {
        this.a.readFully(arrby, n8, n9);
        return n9;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void f() {
        this.c = this.b.g();
        while (this.f == false) {
            block11 : {
                block13 : {
                    block12 : {
                        var2_2 = this.e(this.d, 0, 1);
                        var7_6 = this.d;
                        var3_3 = var7_6[0];
                        var4_4 = (var3_3 & 128) != 0;
                        if ((var3_3 & 112) != 0) throw new e("Invalid frame received");
                        var1_1 = (byte)(var3_3 & 15);
                        var2_2 += this.e((byte[])var7_6, var2_2, 1);
                        var7_6 = this.d;
                        var3_3 = var7_6[1];
                        if (var3_3 >= 126) break block12;
                        var5_5 = var3_3;
                        ** GOTO lbl31
                    }
                    if (var3_3 != 126) break block13;
                    this.e((byte[])var7_6, var2_2, 2);
                    var7_6 = this.d;
                    var5_5 = (long)(var7_6[2] & 255) << 8 | (long)(var7_6[3] & 255);
                    ** GOTO lbl31
                }
                if (var3_3 != 127) ** GOTO lbl30
                try {
                    block14 : {
                        var3_3 = this.e((byte[])var7_6, var2_2, 8);
                        var5_5 = this.d(this.d, var2_2 + var3_3 - 8);
                        break block14;
lbl30: // 1 sources:
                        var5_5 = 0L;
                    }
                    var2_2 = (int)var5_5;
                    var7_6 = new byte[var2_2];
                    this.e((byte[])var7_6, 0, var2_2);
                    ** if (var1_1 != 8) goto lbl-1000
                }
                catch (SocketTimeoutException var7_9) {
                    continue;
                }
                catch (e var7_7) {}
lbl-1000: // 1 sources:
                {
                    this.b.l();
                    continue;
                }
lbl-1000: // 1 sources:
                {
                    break block11;
                }
                this.b(var7_7);
                continue;
                catch (IOException var7_8) {}
                this.b(new e("IO Error", (Throwable)var7_8));
                continue;
            }
            if (var1_1 == 10) continue;
            if (var1_1 != 1 && var1_1 != 2 && var1_1 != 9 && var1_1 != 0) {
                var7_6 = new StringBuilder();
                var7_6.append("Unsupported opcode: ");
                var7_6.append((int)var1_1);
                throw new e(var7_6.toString());
            }
            this.a(var4_4, var1_1, (byte[])var7_6);
        }
    }

    public void g(DataInputStream dataInputStream) {
        this.a = dataInputStream;
    }

    public void h() {
        this.f = true;
    }
}

