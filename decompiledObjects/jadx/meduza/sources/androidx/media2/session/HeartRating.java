package androidx.media2.session;

import androidx.media2.common.Rating;
import defpackage.f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class HeartRating implements Rating {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1078a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1079b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        return this.f1079b == heartRating.f1079b && this.f1078a == heartRating.f1078a;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1078a), Boolean.valueOf(this.f1079b));
    }

    public final String toString() {
        String str;
        StringBuilder l10 = f.l("HeartRating: ");
        if (this.f1078a) {
            StringBuilder l11 = f.l("hasHeart=");
            l11.append(this.f1079b);
            str = l11.toString();
        } else {
            str = "unrated";
        }
        l10.append(str);
        return l10.toString();
    }
}
