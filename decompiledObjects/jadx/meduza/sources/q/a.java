package q;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: q.a$a, reason: collision with other inner class name */
    public static class C0198a implements a {
        @Override // q.a
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
            return bundle;
        }
    }

    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13174a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13175b;

        public b(int i10, boolean z10) {
            this.f13174a = z10;
            this.f13175b = i10;
        }

        @Override // q.a
        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
            bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f13174a);
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f13175b);
            return bundle;
        }
    }

    Bundle a();
}
