package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController f588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f589b;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f589b = bVar;
        this.f588a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f589b.f583n.onClick(this.f588a.f545b, i10);
        if (this.f589b.f585p) {
            return;
        }
        this.f588a.f545b.dismiss();
    }
}
