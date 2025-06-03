/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaDrmException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package p0;

import android.media.MediaDrmException;
import j0.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l0.y1;
import p0.E;
import p0.F;

public final class C
implements F {
    @Override
    public void a(F.b b8) {
    }

    @Override
    public boolean b(byte[] arrby, String string2) {
        throw new IllegalStateException();
    }

    @Override
    public void c(byte[] arrby, byte[] arrby2) {
        throw new IllegalStateException();
    }

    @Override
    public Map d(byte[] arrby) {
        throw new IllegalStateException();
    }

    @Override
    public void e(byte[] arrby) {
    }

    @Override
    public /* synthetic */ void f(byte[] arrby, y1 y12) {
        E.a(this, arrby, y12);
    }

    @Override
    public byte[] g(byte[] arrby, byte[] arrby2) {
        throw new IllegalStateException();
    }

    @Override
    public F.d h() {
        throw new IllegalStateException();
    }

    @Override
    public void i(byte[] arrby) {
        throw new IllegalStateException();
    }

    @Override
    public F.a j(byte[] arrby, List list, int n8, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public int k() {
        return 1;
    }

    @Override
    public b l(byte[] arrby) {
        throw new IllegalStateException();
    }

    @Override
    public byte[] m() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public void release() {
    }
}

