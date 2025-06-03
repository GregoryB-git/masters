package a0;

import android.media.VolumeProvider;
import android.os.Build;

/* renamed from: a0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0732o {

    /* renamed from: a, reason: collision with root package name */
    public final int f7995a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7996b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7997c;

    /* renamed from: d, reason: collision with root package name */
    public int f7998d;

    /* renamed from: e, reason: collision with root package name */
    public d f7999e;

    /* renamed from: f, reason: collision with root package name */
    public VolumeProvider f8000f;

    /* renamed from: a0.o$a */
    public class a extends VolumeProvider {
        public a(int i7, int i8, int i9, String str) {
            super(i7, i8, i9, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i7) {
            AbstractC0732o.this.d(i7);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i7) {
            AbstractC0732o.this.e(i7);
        }
    }

    /* renamed from: a0.o$b */
    public class b extends VolumeProvider {
        public b(int i7, int i8, int i9) {
            super(i7, i8, i9);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i7) {
            AbstractC0732o.this.d(i7);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i7) {
            AbstractC0732o.this.e(i7);
        }
    }

    /* renamed from: a0.o$c */
    public static class c {
        public static void a(VolumeProvider volumeProvider, int i7) {
            volumeProvider.setCurrentVolume(i7);
        }
    }

    /* renamed from: a0.o$d */
    public static abstract class d {
        public abstract void a(AbstractC0732o abstractC0732o);
    }

    public AbstractC0732o(int i7, int i8, int i9) {
        this(i7, i8, i9, null);
    }

    public final int a() {
        return this.f7996b;
    }

    public final int b() {
        return this.f7995a;
    }

    public Object c() {
        if (this.f8000f == null) {
            this.f8000f = Build.VERSION.SDK_INT >= 30 ? new a(this.f7995a, this.f7996b, this.f7998d, this.f7997c) : new b(this.f7995a, this.f7996b, this.f7998d);
        }
        return this.f8000f;
    }

    public abstract void d(int i7);

    public abstract void e(int i7);

    public final void f(int i7) {
        this.f7998d = i7;
        c.a((VolumeProvider) c(), i7);
    }

    public AbstractC0732o(int i7, int i8, int i9, String str) {
        this.f7995a = i7;
        this.f7996b = i8;
        this.f7998d = i9;
        this.f7997c = str;
    }
}
