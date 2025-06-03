/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.Notification$MediaStyle
 *  android.app.PendingIntent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.widget.RemoteViews
 *  java.lang.CharSequence
 */
package b0;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import b0.a;
import b0.b;
import w.g;
import w.h;

public class c
extends h.f {
    public int[] e = null;
    public MediaSessionCompat.Token f;
    public PendingIntent g;
    public CharSequence h;
    public int i;
    public PendingIntent j;
    public boolean k = false;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void b(g g8) {
        int n8 = Build.VERSION.SDK_INT;
        Notification.Builder builder = g8.a();
        g8 = n8 >= 34 ? a.b(b.a(a.a(), this.h, this.i, this.j, this.k), this.e, this.f) : a.b(a.a(), this.e, this.f);
        a.d(builder, (Notification.MediaStyle)g8);
    }

    @Override
    public RemoteViews d(g g8) {
        return null;
    }

    @Override
    public RemoteViews e(g g8) {
        return null;
    }

    public c h(PendingIntent pendingIntent) {
        this.g = pendingIntent;
        return this;
    }

    public c i(MediaSessionCompat.Token token) {
        this.f = token;
        return this;
    }

    public /* varargs */ c j(int ... arrn) {
        this.e = arrn;
        return this;
    }

    public c k(boolean bl) {
        return this;
    }
}

