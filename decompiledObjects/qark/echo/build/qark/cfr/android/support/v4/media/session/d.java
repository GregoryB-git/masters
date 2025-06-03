/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.session.MediaSession
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;

public abstract class d {
    public static /* synthetic */ MediaSession a(Context context, String string2, Bundle bundle) {
        return new MediaSession(context, string2, bundle);
    }
}

