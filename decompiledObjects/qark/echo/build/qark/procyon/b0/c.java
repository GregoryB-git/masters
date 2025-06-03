// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b0;

import android.widget.RemoteViews;
import android.app.Notification$MediaStyle;
import android.app.Notification$Builder;
import android.os.Build$VERSION;
import w.g;
import android.app.PendingIntent;
import android.support.v4.media.session.MediaSessionCompat;
import w.h;

public class c extends f
{
    public int[] e;
    public MediaSessionCompat.Token f;
    public PendingIntent g;
    public CharSequence h;
    public int i;
    public PendingIntent j;
    public boolean k;
    
    public c() {
        this.e = null;
        this.k = false;
    }
    
    @Override
    public void b(final g g) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Notification$Builder a = g.a();
        Notification$MediaStyle notification$MediaStyle;
        if (sdk_INT >= 34) {
            notification$MediaStyle = b0.a.b(b0.b.a(b0.a.a(), this.h, this.i, this.j, this.k), this.e, this.f);
        }
        else {
            notification$MediaStyle = b0.a.b(b0.a.a(), this.e, this.f);
        }
        b0.a.d(a, notification$MediaStyle);
    }
    
    @Override
    public RemoteViews d(final g g) {
        return null;
    }
    
    @Override
    public RemoteViews e(final g g) {
        return null;
    }
    
    public c h(final PendingIntent g) {
        this.g = g;
        return this;
    }
    
    public c i(final MediaSessionCompat.Token f) {
        this.f = f;
        return this;
    }
    
    public c j(final int... e) {
        this.e = e;
        return this;
    }
    
    public c k(final boolean b) {
        return this;
    }
}
