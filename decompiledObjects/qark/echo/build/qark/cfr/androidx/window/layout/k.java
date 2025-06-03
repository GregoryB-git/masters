/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo
 *  java.lang.Object
 */
package androidx.window.layout;

import H.a;
import androidx.window.layout.WindowInfoTrackerImpl;
import androidx.window.layout.WindowLayoutInfo;
import r6.d;

public final class k
implements a {
    public final /* synthetic */ d a;

    public /* synthetic */ k(d d8) {
        this.a = d8;
    }

    @Override
    public final void accept(Object object) {
        WindowInfoTrackerImpl.windowLayoutInfo.a(this.a, (WindowLayoutInfo)object);
    }
}

