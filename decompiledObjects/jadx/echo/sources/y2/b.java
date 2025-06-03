package y2;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class b extends Exception {

    /* renamed from: o, reason: collision with root package name */
    public final Status f21414o;

    public b(Status status) {
        super(status.d() + ": " + (status.f() != null ? status.f() : ""));
        this.f21414o = status;
    }

    public Status a() {
        return this.f21414o;
    }
}
