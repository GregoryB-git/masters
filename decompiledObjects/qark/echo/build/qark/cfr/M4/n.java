/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URL
 *  java.net.URLConnection
 */
package M4;

import java.net.URL;
import java.net.URLConnection;

public class n {
    public final URL a;

    public n(URL uRL) {
        this.a = uRL;
    }

    public URLConnection a() {
        return this.a.openConnection();
    }

    public String toString() {
        return this.a.toString();
    }
}

