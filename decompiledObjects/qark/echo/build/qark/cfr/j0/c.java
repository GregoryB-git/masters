/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaCodec$CryptoInfo$Pattern
 *  java.lang.Object
 */
package j0;

import android.media.MediaCodec;
import g0.M;
import g0.a;
import j0.d;
import j0.e;
import j0.f;

public final class c {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final b j;

    public c() {
        MediaCodec.CryptoInfo cryptoInfo;
        this.i = cryptoInfo = new MediaCodec.CryptoInfo();
        int n8 = M.a;
        b b8 = null;
        if (n8 >= 24) {
            b8 = new b(cryptoInfo, null);
        }
        this.j = b8;
    }

    public MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public void b(int n8) {
        int[] arrn;
        if (n8 == 0) {
            return;
        }
        if (this.d == null) {
            arrn = new int[1];
            this.d = arrn;
            this.i.numBytesOfClearData = arrn;
        }
        arrn = this.d;
        arrn[0] = arrn[0] + n8;
    }

    public void c(int n8, int[] arrn, int[] arrn2, byte[] arrby, byte[] arrby2, int n9, int n10, int n11) {
        this.f = n8;
        this.d = arrn;
        this.e = arrn2;
        this.b = arrby;
        this.a = arrby2;
        this.c = n9;
        this.g = n10;
        this.h = n11;
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = n8;
        cryptoInfo.numBytesOfClearData = arrn;
        cryptoInfo.numBytesOfEncryptedData = arrn2;
        cryptoInfo.key = arrby;
        cryptoInfo.iv = arrby2;
        cryptoInfo.mode = n9;
        if (M.a >= 24) {
            ((b)a.e(this.j)).b(n10, n11);
        }
    }

    public static final class b {
        public final MediaCodec.CryptoInfo a;
        public final MediaCodec.CryptoInfo.Pattern b;

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = d.a(0, 0);
        }

        public /* synthetic */ b(MediaCodec.CryptoInfo cryptoInfo,  a8) {
            this(cryptoInfo);
        }

        public final void b(int n8, int n9) {
            e.a(this.b, n8, n9);
            f.a(this.a, this.b);
        }
    }

}

