package com.ryanheise.audioservice;

import android.os.Bundle;
import g1.c;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements MethodChannel.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.i f3301a;

    public d(c.i iVar) {
        this.f3301a = iVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(String str, String str2, Object obj) {
        this.f3301a.e(new Bundle());
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
        this.f3301a.e(new Bundle());
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        Map map = (Map) ((Map) obj).get("mediaItem");
        if (map == null) {
            this.f3301a.f(null);
        } else {
            this.f3301a.f(b.a(map));
        }
    }
}
