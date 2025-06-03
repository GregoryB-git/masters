package m0;

import android.content.Context;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: p, reason: collision with root package name */
    public int f9867p;

    /* renamed from: q, reason: collision with root package name */
    public int f9868q;

    /* renamed from: r, reason: collision with root package name */
    public LayoutInflater f9869r;

    @Deprecated
    public c(Context context, int i10) {
        super(context);
        this.f9868q = i10;
        this.f9867p = i10;
        this.f9869r = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
