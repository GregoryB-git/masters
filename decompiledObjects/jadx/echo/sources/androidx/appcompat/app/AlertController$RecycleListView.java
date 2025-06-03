package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import e.AbstractC1238i;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: o, reason: collision with root package name */
    public final int f8356o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8357p;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1238i.f13467A1);
        this.f8357p = obtainStyledAttributes.getDimensionPixelOffset(AbstractC1238i.f13471B1, -1);
        this.f8356o = obtainStyledAttributes.getDimensionPixelOffset(AbstractC1238i.f13475C1, -1);
    }
}
