/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.Map
 *  java.util.Set
 */
package s2;

import android.net.Uri;
import java.util.Map;
import java.util.Set;
import s2.a;
import s2.d;

public final class b
extends Thread {
    public final /* synthetic */ Map o;

    public b(a a8, Map map) {
        this.o = map;
    }

    public final void run() {
        Map map = this.o;
        Uri.Builder builder = Uri.parse((String)"https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String string2 : map.keySet()) {
            builder.appendQueryParameter(string2, (String)map.get((Object)string2));
        }
        d.a(builder.build().toString());
    }
}

