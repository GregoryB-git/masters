// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.net.URLConnection;
import java.net.URL;

public final class k0 extends h0
{
    @Override
    public final URLConnection b(final URL url, final String s) {
        return url.openConnection();
    }
}
