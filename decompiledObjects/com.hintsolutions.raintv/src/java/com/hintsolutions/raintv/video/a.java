/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  rx.functions.Action1
 */
package com.hintsolutions.raintv.video;

import com.hintsolutions.raintv.video.ExoVideoView;
import rx.functions.Action1;

public final class a
implements Action1 {
    public final int a;
    public final ExoVideoView.Rewind b;

    public /* synthetic */ a(ExoVideoView.Rewind rewind, int n4) {
        this.a = n4;
        this.b = rewind;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                ExoVideoView.Rewind.a(this.b, (Long)object);
                return;
            }
        }
        ExoVideoView.Rewind.b(this.b, (Long)object);
    }
}

