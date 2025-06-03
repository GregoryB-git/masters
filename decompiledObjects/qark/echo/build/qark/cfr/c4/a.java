/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.String
 *  java.util.List
 */
package c4;

import android.util.Log;
import c4.b;
import c4.d;
import java.util.List;

public class a
extends b {
    public a(d.a a8, List list) {
        super(a8, list);
    }

    @Override
    public String c(d.a a8, String string2, String string3, long l8) {
        return string3;
    }

    @Override
    public void d(String string2, String string3) {
        Log.d((String)string2, (String)string3);
    }

    @Override
    public void e(String string2, String string3) {
        Log.e((String)string2, (String)string3);
    }

    @Override
    public void f(String string2, String string3) {
        Log.i((String)string2, (String)string3);
    }

    @Override
    public void h(String string2, String string3) {
        Log.w((String)string2, (String)string3);
    }
}

