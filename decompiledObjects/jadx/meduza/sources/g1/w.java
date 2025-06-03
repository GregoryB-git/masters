package g1;

import android.media.VolumeProvider;

/* loaded from: classes.dex */
public final class w extends VolumeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f5797a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, int i10, int i11, int i12, String str) {
        super(i10, i11, i12, str);
        this.f5797a = yVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i10) {
        this.f5797a.b(i10);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i10) {
        this.f5797a.c(i10);
    }
}
