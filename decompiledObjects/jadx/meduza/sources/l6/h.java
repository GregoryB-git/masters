package l6;

import android.os.Looper;
import com.google.android.gms.internal.common.zzh;

/* loaded from: classes.dex */
public final class h<L> {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f9686a;

    public static final class a<L> {
        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            System.identityHashCode(null);
            throw null;
        }
    }

    public h(Looper looper, L l10, String str) {
        new zzh(looper);
        if (l10 == null) {
            throw new NullPointerException("Listener must not be null");
        }
        this.f9686a = l10;
        m6.j.e(str);
    }
}
