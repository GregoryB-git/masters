/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.session.MediaSessionManager
 *  android.media.session.MediaSessionManager$RemoteUserInfo
 *  java.lang.String
 */
package a0;

import a0.h;
import a0.i;
import a0.j;
import a0.k;
import a0.m;
import android.media.session.MediaSessionManager;

public final class l
extends m {
    public final MediaSessionManager.RemoteUserInfo d;

    public l(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(i.a(remoteUserInfo), j.a(remoteUserInfo), k.a(remoteUserInfo));
        this.d = remoteUserInfo;
    }

    public l(String string2, int n8, int n9) {
        super(string2, n8, n9);
        this.d = h.a(string2, n8, n9);
    }

    public static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return i.a(remoteUserInfo);
    }
}

