package t0;

import android.media.MediaCodec;
import android.os.Bundle;

/* renamed from: t0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1971L implements InterfaceC1985n {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f19423a;

    public C1971L(MediaCodec mediaCodec) {
        this.f19423a = mediaCodec;
    }

    @Override // t0.InterfaceC1985n
    public void a(int i7, int i8, j0.c cVar, long j7, int i9) {
        this.f19423a.queueSecureInputBuffer(i7, i8, cVar.a(), j7, i9);
    }

    @Override // t0.InterfaceC1985n
    public void b(int i7, int i8, int i9, long j7, int i10) {
        this.f19423a.queueInputBuffer(i7, i8, i9, j7, i10);
    }

    @Override // t0.InterfaceC1985n
    public void c(Bundle bundle) {
        this.f19423a.setParameters(bundle);
    }

    @Override // t0.InterfaceC1985n
    public void d() {
    }

    @Override // t0.InterfaceC1985n
    public void flush() {
    }

    @Override // t0.InterfaceC1985n
    public void shutdown() {
    }

    @Override // t0.InterfaceC1985n
    public void start() {
    }
}
