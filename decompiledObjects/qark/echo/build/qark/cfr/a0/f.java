/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.session.MediaSessionManager
 *  android.media.session.MediaSessionManager$RemoteUserInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package a0;

import a0.g;
import a0.l;
import a0.m;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

public final class f {
    public g a;

    public f(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String string2 = l.a(remoteUserInfo);
        if (string2 != null) {
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                this.a = new l(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    /*
     * Enabled aggressive block sorting
     */
    public f(String object, int n8, int n9) {
        if (object == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty((CharSequence)object)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        object = Build.VERSION.SDK_INT >= 28 ? new l((String)object, n8, n9) : new m((String)object, n8, n9);
        this.a = object;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        return this.a.equals((Object)((f)object).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

