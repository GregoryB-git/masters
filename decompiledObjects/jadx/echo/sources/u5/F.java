package u5;

import D5.i;
import android.view.KeyEvent;
import u5.L;

/* loaded from: classes.dex */
public class F implements L.d {

    /* renamed from: a, reason: collision with root package name */
    public final D5.i f19830a;

    /* renamed from: b, reason: collision with root package name */
    public final L.b f19831b = new L.b();

    public F(D5.i iVar) {
        this.f19830a = iVar;
    }

    @Override // u5.L.d
    public void a(KeyEvent keyEvent, final L.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f19830a.e(new i.b(keyEvent, this.f19831b.a(keyEvent.getUnicodeChar())), action != 0, new i.a() { // from class: u5.E
                @Override // D5.i.a
                public final void a(boolean z7) {
                    L.d.a.this.a(z7);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}
