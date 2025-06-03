// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a0;

import android.os.Build$VERSION;
import android.text.TextUtils;
import android.media.session.MediaSessionManager$RemoteUserInfo;

public final class f
{
    public g a;
    
    public f(final MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
        final String a = l.a(mediaSessionManager$RemoteUserInfo);
        if (a == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (!TextUtils.isEmpty((CharSequence)a)) {
            this.a = new l(mediaSessionManager$RemoteUserInfo);
            return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
    
    public f(final String s, final int n, final int n2) {
        if (s == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            m a;
            if (Build$VERSION.SDK_INT >= 28) {
                a = new l(s, n, n2);
            }
            else {
                a = new m(s, n, n2);
            }
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof f && this.a.equals(((f)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
