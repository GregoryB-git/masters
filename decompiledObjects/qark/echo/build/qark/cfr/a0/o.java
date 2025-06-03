/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.VolumeProvider
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 */
package a0;

import android.media.VolumeProvider;
import android.os.Build;

public abstract class o {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public d e;
    public VolumeProvider f;

    public o(int n8, int n9, int n10) {
        this(n8, n9, n10, null);
    }

    public o(int n8, int n9, int n10, String string2) {
        this.a = n8;
        this.b = n9;
        this.d = n10;
        this.c = string2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object c() {
        if (this.f != null) return this.f;
        VolumeProvider volumeProvider = Build.VERSION.SDK_INT >= 30 ? new VolumeProvider(this.a, this.b, this.d, this.c){

            public void onAdjustVolume(int n8) {
                o.this.d(n8);
            }

            public void onSetVolumeTo(int n8) {
                o.this.e(n8);
            }
        } : new VolumeProvider(this.a, this.b, this.d){

            public void onAdjustVolume(int n8) {
                o.this.d(n8);
            }

            public void onSetVolumeTo(int n8) {
                o.this.e(n8);
            }
        };
        this.f = volumeProvider;
        return this.f;
    }

    public abstract void d(int var1);

    public abstract void e(int var1);

    public final void f(int n8) {
        this.d = n8;
        c.a((VolumeProvider)this.c(), n8);
    }

    public static abstract class c {
        public static void a(VolumeProvider volumeProvider, int n8) {
            volumeProvider.setCurrentVolume(n8);
        }
    }

    public static abstract class d {
        public abstract void a(o var1);
    }

}

