package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.d;
import androidx.emoji2.text.h;
import x.c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d.i f996a;

    /* renamed from: b, reason: collision with root package name */
    public final h f997b;

    /* renamed from: c, reason: collision with root package name */
    public d.InterfaceC0015d f998c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f999a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final h.a f1000b;

        /* renamed from: c, reason: collision with root package name */
        public h.a f1001c;

        /* renamed from: d, reason: collision with root package name */
        public h.a f1002d;

        /* renamed from: e, reason: collision with root package name */
        public int f1003e;
        public int f;

        public a(h.a aVar) {
            this.f1000b = aVar;
            this.f1001c = aVar;
        }

        public final int a(int i10) {
            SparseArray<h.a> sparseArray = this.f1001c.f1016a;
            h.a aVar = sparseArray == null ? null : sparseArray.get(i10);
            int i11 = 3;
            if (this.f999a != 2) {
                if (aVar != null) {
                    this.f999a = 2;
                    this.f1001c = aVar;
                    this.f = 1;
                    i11 = 2;
                }
                b();
                i11 = 1;
            } else {
                if (aVar != null) {
                    this.f1001c = aVar;
                    this.f++;
                } else {
                    if (!(i10 == 65038)) {
                        if (!(i10 == 65039)) {
                            h.a aVar2 = this.f1001c;
                            if (aVar2.f1017b != null) {
                                if (this.f == 1) {
                                    if (c()) {
                                        aVar2 = this.f1001c;
                                    }
                                }
                                this.f1002d = aVar2;
                                b();
                            }
                        }
                    }
                    b();
                    i11 = 1;
                }
                i11 = 2;
            }
            this.f1003e = i10;
            return i11;
        }

        public final void b() {
            this.f999a = 1;
            this.f1001c = this.f1000b;
            this.f = 0;
        }

        public final boolean c() {
            u0.a c10 = this.f1001c.f1017b.c();
            int a10 = c10.a(6);
            if ((a10 == 0 || c10.f14883b.get(a10 + c10.f14882a) == 0) ? false : true) {
                return true;
            }
            return this.f1003e == 65039;
        }
    }

    public f(h hVar, d.i iVar, b bVar) {
        this.f996a = iVar;
        this.f997b = hVar;
        this.f998c = bVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        t0.f[] fVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (fVarArr = (t0.f[]) editable.getSpans(selectionStart, selectionEnd, t0.f.class)) != null && fVarArr.length > 0) {
            for (t0.f fVar : fVarArr) {
                int spanStart = editable.getSpanStart(fVar);
                int spanEnd = editable.getSpanEnd(fVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, t0.e eVar) {
        if (eVar.f14394c == 0) {
            d.InterfaceC0015d interfaceC0015d = this.f998c;
            u0.a c10 = eVar.c();
            int a10 = c10.a(8);
            if (a10 != 0) {
                c10.f14883b.getShort(a10 + c10.f14882a);
            }
            b bVar = (b) interfaceC0015d;
            bVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = b.f974b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = bVar.f975a;
            String sb3 = sb2.toString();
            int i12 = x.c.f16495a;
            eVar.f14394c = c.a.a(textPaint, sb3) ? 2 : 1;
        }
        return eVar.f14394c == 2;
    }
}
