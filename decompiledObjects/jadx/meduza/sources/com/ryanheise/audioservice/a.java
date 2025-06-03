package com.ryanheise.audioservice;

import com.ryanheise.audioservice.AudioService;
import com.ryanheise.audioservice.b;
import g1.y;

/* loaded from: classes.dex */
public final class a extends y {
    public a(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // g1.y
    public final void b(int i10) {
        AudioService.c cVar = AudioService.H;
        if (cVar == null) {
            return;
        }
        ((b.c) cVar).a("androidAdjustRemoteVolume", b.k("direction", Integer.valueOf(i10)), null);
    }

    @Override // g1.y
    public final void c(int i10) {
        AudioService.c cVar = AudioService.H;
        if (cVar == null) {
            return;
        }
        ((b.c) cVar).a("androidSetRemoteVolume", b.k("volumeIndex", Integer.valueOf(i10)), null);
    }
}
