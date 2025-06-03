// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a0;

import android.media.session.MediaSessionManager$RemoteUserInfo;

public final class l extends m
{
    public final MediaSessionManager$RemoteUserInfo d;
    
    public l(final MediaSessionManager$RemoteUserInfo d) {
        super(i.a(d), j.a(d), k.a(d));
        this.d = d;
    }
    
    public l(final String s, final int n, final int n2) {
        super(s, n, n2);
        this.d = h.a(s, n, n2);
    }
    
    public static String a(final MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        return i.a(mediaSessionManager$RemoteUserInfo);
    }
}
