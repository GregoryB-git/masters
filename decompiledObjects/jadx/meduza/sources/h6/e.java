package h6;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class e extends e1.a {

    /* renamed from: j, reason: collision with root package name */
    public final Semaphore f7157j;

    /* renamed from: k, reason: collision with root package name */
    public final Set f7158k;

    public e(Context context, Set set) {
        super(context);
        this.f7157j = new Semaphore(0);
        this.f7158k = set;
    }
}
