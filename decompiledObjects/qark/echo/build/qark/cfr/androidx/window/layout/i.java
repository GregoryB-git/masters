/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package androidx.window.layout;

import androidx.window.layout.SidecarWindowBackend;
import androidx.window.layout.WindowLayoutInfo;

public final class i
implements Runnable {
    public final /* synthetic */ SidecarWindowBackend.WindowLayoutChangeCallbackWrapper o;
    public final /* synthetic */ WindowLayoutInfo p;

    public /* synthetic */ i(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo2) {
        this.o = windowLayoutChangeCallbackWrapper;
        this.p = windowLayoutInfo2;
    }

    public final void run() {
        SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.a(this.o, this.p);
    }
}

