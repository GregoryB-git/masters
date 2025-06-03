// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a0;

import android.os.Build$VERSION;
import android.media.VolumeProvider;

public abstract class o
{
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public d e;
    public VolumeProvider f;
    
    public o(final int n, final int n2, final int n3) {
        this(n, n2, n3, null);
    }
    
    public o(final int a, final int b, final int d, final String c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final int b() {
        return this.a;
    }
    
    public Object c() {
        if (this.f == null) {
            VolumeProvider f;
            if (Build$VERSION.SDK_INT >= 30) {
                f = new VolumeProvider(this.a, this.b, this.d, this.c) {
                    public void onAdjustVolume(final int n) {
                        o.this.d(n);
                    }
                    
                    public void onSetVolumeTo(final int n) {
                        o.this.e(n);
                    }
                };
            }
            else {
                f = new VolumeProvider(this.a, this.b, this.d) {
                    public void onAdjustVolume(final int n) {
                        o.this.d(n);
                    }
                    
                    public void onSetVolumeTo(final int n) {
                        o.this.e(n);
                    }
                };
            }
            this.f = f;
        }
        return this.f;
    }
    
    public abstract void d(final int p0);
    
    public abstract void e(final int p0);
    
    public final void f(final int d) {
        this.d = d;
        o.c.a((VolumeProvider)this.c(), d);
    }
    
    public abstract static class c
    {
        public static void a(final VolumeProvider volumeProvider, final int currentVolume) {
            volumeProvider.setCurrentVolume(currentVolume);
        }
    }
    
    public abstract static class d
    {
        public abstract void a(final o p0);
    }
}
