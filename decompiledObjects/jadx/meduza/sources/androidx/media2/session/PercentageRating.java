package androidx.media2.session;

import androidx.media2.common.Rating;
import defpackage.f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PercentageRating implements Rating {

    /* renamed from: a, reason: collision with root package name */
    public float f1106a = -1.0f;

    public final boolean equals(Object obj) {
        return (obj instanceof PercentageRating) && this.f1106a == ((PercentageRating) obj).f1106a;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.f1106a));
    }

    public final String toString() {
        String str;
        StringBuilder l10 = f.l("PercentageRating: ");
        if (this.f1106a != -1.0f) {
            StringBuilder l11 = f.l("percentage=");
            l11.append(this.f1106a);
            str = l11.toString();
        } else {
            str = "unrated";
        }
        l10.append(str);
        return l10.toString();
    }
}
