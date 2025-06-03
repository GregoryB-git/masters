package g1;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public String f5794a;

    /* renamed from: b, reason: collision with root package name */
    public int f5795b;

    /* renamed from: c, reason: collision with root package name */
    public int f5796c;

    public v(String str, int i10, int i11) {
        this.f5794a = str;
        this.f5795b = i10;
        this.f5796c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return (this.f5795b < 0 || vVar.f5795b < 0) ? TextUtils.equals(this.f5794a, vVar.f5794a) && this.f5796c == vVar.f5796c : TextUtils.equals(this.f5794a, vVar.f5794a) && this.f5795b == vVar.f5795b && this.f5796c == vVar.f5796c;
    }

    public final int hashCode() {
        return Objects.hash(this.f5794a, Integer.valueOf(this.f5796c));
    }
}
