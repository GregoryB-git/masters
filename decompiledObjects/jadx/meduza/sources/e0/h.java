package e0;

import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3795a;

    public h(DisplayCutout displayCutout) {
        this.f3795a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3795a, ((h) obj).f3795a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f3795a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DisplayCutoutCompat{");
        l10.append(this.f3795a);
        l10.append("}");
        return l10.toString();
    }
}
