/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  org.json.JSONObject
 */
package K1;

import K1.j;
import org.json.JSONObject;

public final class h
implements Runnable {
    public final /* synthetic */ JSONObject o;
    public final /* synthetic */ String p;
    public final /* synthetic */ j q;
    public final /* synthetic */ String r;

    public /* synthetic */ h(JSONObject jSONObject, String string2, j j8, String string3) {
        this.o = jSONObject;
        this.p = string2;
        this.q = j8;
        this.r = string3;
    }

    public final void run() {
        j.a(this.o, this.p, this.q, this.r);
    }
}

