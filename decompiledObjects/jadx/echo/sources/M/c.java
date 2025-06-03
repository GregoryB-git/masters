package M;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: w, reason: collision with root package name */
    public int f3475w;

    /* renamed from: x, reason: collision with root package name */
    public int f3476x;

    /* renamed from: y, reason: collision with root package name */
    public LayoutInflater f3477y;

    public c(Context context, int i7, Cursor cursor, boolean z7) {
        super(context, cursor, z7);
        this.f3476x = i7;
        this.f3475w = i7;
        this.f3477y = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // M.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3477y.inflate(this.f3476x, viewGroup, false);
    }

    @Override // M.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3477y.inflate(this.f3475w, viewGroup, false);
    }
}
