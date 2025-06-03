package o4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f11776b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f11777c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f11781h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f11782i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f11783j;

    /* renamed from: k, reason: collision with root package name */
    public long f11784k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11785l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f11786m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f11775a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final i f11778d = new i();

    /* renamed from: e, reason: collision with root package name */
    public final i f11779e = new i();
    public final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f11780g = new ArrayDeque<>();

    public e(HandlerThread handlerThread) {
        this.f11776b = handlerThread;
    }

    public final void a() {
        if (!this.f11780g.isEmpty()) {
            this.f11782i = this.f11780g.getLast();
        }
        i iVar = this.f11778d;
        iVar.f11793a = 0;
        iVar.f11794b = -1;
        iVar.f11795c = 0;
        i iVar2 = this.f11779e;
        iVar2.f11793a = 0;
        iVar2.f11794b = -1;
        iVar2.f11795c = 0;
        this.f.clear();
        this.f11780g.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f11775a) {
            this.f11783j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f11775a) {
            this.f11778d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f11775a) {
            MediaFormat mediaFormat = this.f11782i;
            if (mediaFormat != null) {
                this.f11779e.a(-2);
                this.f11780g.add(mediaFormat);
                this.f11782i = null;
            }
            this.f11779e.a(i10);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f11775a) {
            this.f11779e.a(-2);
            this.f11780g.add(mediaFormat);
            this.f11782i = null;
        }
    }
}
