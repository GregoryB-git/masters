// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.net.Uri;
import t.h;

public final class F2 implements K2
{
    public final h a;
    
    public F2(final h a) {
        this.a = a;
    }
    
    @Override
    public final String a(final Uri uri, String s, final String str, final String str2) {
        h h = null;
        Label_0033: {
            if (uri != null) {
                s = uri.toString();
            }
            else if (s == null) {
                h = null;
                break Label_0033;
            }
            h = (h)this.a.get(s);
        }
        if (h == null) {
            return null;
        }
        s = str2;
        if (str != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            s = sb.toString();
        }
        return (String)h.get(s);
    }
}
