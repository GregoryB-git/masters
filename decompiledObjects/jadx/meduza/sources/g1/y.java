package g1;

import android.media.VolumeProvider;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f5799a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5800b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5801c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f5802d;

    /* renamed from: e, reason: collision with root package name */
    public VolumeProvider f5803e;

    public static class a {
        public static void a(VolumeProvider volumeProvider, int i10) {
            volumeProvider.setCurrentVolume(i10);
        }
    }

    public y(int i10, int i11, int i12) {
        this.f5799a = i10;
        this.f5800b = i11;
        this.f5802d = i12;
    }

    public final VolumeProvider a() {
        if (this.f5803e == null) {
            this.f5803e = Build.VERSION.SDK_INT >= 30 ? new w(this, this.f5799a, this.f5800b, this.f5802d, this.f5801c) : new x(this, this.f5799a, this.f5800b, this.f5802d);
        }
        return this.f5803e;
    }

    public abstract void b(int i10);

    public abstract void c(int i10);
}
