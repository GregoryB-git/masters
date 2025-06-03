package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public io.flutter.view.i f15063a;

    public boolean a(MotionEvent motionEvent, boolean z7) {
        io.flutter.view.i iVar = this.f15063a;
        if (iVar == null) {
            return false;
        }
        return iVar.L(motionEvent, z7);
    }

    public void b(io.flutter.view.i iVar) {
        this.f15063a = iVar;
    }
}
