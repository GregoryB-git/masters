package l;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class m0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f9404a;

    public m0(n0 n0Var) {
        this.f9404a = n0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        j0 j0Var;
        if (i10 == -1 || (j0Var = this.f9404a.f9410c) == null) {
            return;
        }
        j0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
