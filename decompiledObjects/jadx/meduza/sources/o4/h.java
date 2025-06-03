package o4;

import android.media.MediaCodec;
import java.io.IOException;
import o4.b;
import o4.j;
import o4.r;
import p2.m0;
import v5.e0;

/* loaded from: classes.dex */
public final class h implements j.b {
    @Override // o4.j.b
    public final j a(j.a aVar) {
        int i10 = e0.f15881a;
        if (i10 >= 23 && i10 >= 31) {
            int i11 = v5.p.i(aVar.f11800c.t);
            StringBuilder l10 = defpackage.f.l("Creating an asynchronous MediaCodec adapter for track type ");
            l10.append(e0.A(i11));
            v5.m.e("DMCodecAdapterFactory", l10.toString());
            return new b.a(i11).a(aVar);
        }
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = r.a.b(aVar);
            m0.i("configureCodec");
            mediaCodec.configure(aVar.f11799b, aVar.f11801d, aVar.f11802e, 0);
            m0.B();
            m0.i("startCodec");
            mediaCodec.start();
            m0.B();
            return new r(mediaCodec);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }
}
