package v0;

import android.widget.EditText;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0246a f15182a;

    /* renamed from: v0.a$a, reason: collision with other inner class name */
    public static class C0246a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f15183a;

        /* renamed from: b, reason: collision with root package name */
        public final g f15184b;

        public C0246a(EditText editText) {
            this.f15183a = editText;
            g gVar = new g(editText);
            this.f15184b = gVar;
            editText.addTextChangedListener(gVar);
            if (v0.b.f15186b == null) {
                synchronized (v0.b.f15185a) {
                    if (v0.b.f15186b == null) {
                        v0.b.f15186b = new v0.b();
                    }
                }
            }
            editText.setEditableFactory(v0.b.f15186b);
        }
    }

    public static class b {
    }

    public a(EditText editText) {
        if (editText == null) {
            throw new NullPointerException("editText cannot be null");
        }
        this.f15182a = new C0246a(editText);
    }
}
