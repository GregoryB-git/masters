package com.ryanheise.audioservice;

import android.os.Bundle;
import g1.c;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements MethodChannel.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.i f3302a;

    public e(g1.e eVar) {
        this.f3302a = eVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void error(String str, String str2, Object obj) {
        this.f3302a.e(new Bundle());
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void notImplemented() {
        this.f3302a.e(new Bundle());
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public final void success(Object obj) {
        List list = (List) ((Map) obj).get("mediaItems");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a((Map) it.next()));
        }
        this.f3302a.f(arrayList);
    }
}
