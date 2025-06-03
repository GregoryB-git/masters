package io.flutter.plugin.editing;

import D5.w;
import O1.J;
import O1.K;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.editing.m;
import java.util.HashMap;
import t5.AbstractC1995b;
import u5.L;

/* loaded from: classes.dex */
public class C implements m.b {

    /* renamed from: a, reason: collision with root package name */
    public final View f14988a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f14989b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f14990c;

    /* renamed from: d, reason: collision with root package name */
    public final D5.w f14991d;

    /* renamed from: e, reason: collision with root package name */
    public c f14992e = new c(c.a.NO_TARGET, 0);

    /* renamed from: f, reason: collision with root package name */
    public w.b f14993f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f14994g;

    /* renamed from: h, reason: collision with root package name */
    public m f14995h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14996i;

    /* renamed from: j, reason: collision with root package name */
    public InputConnection f14997j;

    /* renamed from: k, reason: collision with root package name */
    public io.flutter.plugin.platform.r f14998k;

    /* renamed from: l, reason: collision with root package name */
    public Rect f14999l;

    /* renamed from: m, reason: collision with root package name */
    public ImeSyncDeferringInsetsCallback f15000m;

    /* renamed from: n, reason: collision with root package name */
    public w.e f15001n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15002o;

    public class a implements w.f {
        public a() {
        }

        @Override // D5.w.f
        public void a() {
            C c7 = C.this;
            c7.D(c7.f14988a);
        }

        @Override // D5.w.f
        public void b() {
            C.this.k();
        }

        @Override // D5.w.f
        public void c(String str, Bundle bundle) {
            C.this.z(str, bundle);
        }

        @Override // D5.w.f
        public void d(int i7, boolean z7) {
            C.this.A(i7, z7);
        }

        @Override // D5.w.f
        public void e(double d7, double d8, double[] dArr) {
            C.this.y(d7, d8, dArr);
        }

        @Override // D5.w.f
        public void f() {
            C.this.v();
        }

        @Override // D5.w.f
        public void g(int i7, w.b bVar) {
            C.this.B(i7, bVar);
        }

        @Override // D5.w.f
        public void h(w.e eVar) {
            C c7 = C.this;
            c7.C(c7.f14988a, eVar);
        }

        @Override // D5.w.f
        public void i(boolean z7) {
            if (Build.VERSION.SDK_INT < 26 || C.this.f14990c == null) {
                return;
            }
            if (z7) {
                C.this.f14990c.commit();
            } else {
                C.this.f14990c.cancel();
            }
        }

        @Override // D5.w.f
        public void j() {
            if (C.this.f14992e.f15008a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                C.this.w();
            } else {
                C c7 = C.this;
                c7.q(c7.f14988a);
            }
        }
    }

    public class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f15004a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double[] f15005b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ double[] f15006c;

        public b(boolean z7, double[] dArr, double[] dArr2) {
            this.f15004a = z7;
            this.f15005b = dArr;
            this.f15006c = dArr2;
        }

        @Override // io.flutter.plugin.editing.C.d
        public void a(double d7, double d8) {
            double d9 = 1.0d;
            if (!this.f15004a) {
                double[] dArr = this.f15005b;
                d9 = 1.0d / (((dArr[3] * d7) + (dArr[7] * d8)) + dArr[15]);
            }
            double[] dArr2 = this.f15005b;
            double d10 = ((dArr2[0] * d7) + (dArr2[4] * d8) + dArr2[12]) * d9;
            double d11 = ((dArr2[1] * d7) + (dArr2[5] * d8) + dArr2[13]) * d9;
            double[] dArr3 = this.f15006c;
            if (d10 < dArr3[0]) {
                dArr3[0] = d10;
            } else if (d10 > dArr3[1]) {
                dArr3[1] = d10;
            }
            if (d11 < dArr3[2]) {
                dArr3[2] = d11;
            } else if (d11 > dArr3[3]) {
                dArr3[3] = d11;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public a f15008a;

        /* renamed from: b, reason: collision with root package name */
        public int f15009b;

        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int i7) {
            this.f15008a = aVar;
            this.f15009b = i7;
        }
    }

    public interface d {
        void a(double d7, double d8);
    }

    public C(View view, D5.w wVar, io.flutter.plugin.platform.r rVar) {
        this.f14988a = view;
        this.f14995h = new m(null, view);
        this.f14989b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i7 = Build.VERSION.SDK_INT;
        this.f14990c = i7 >= 26 ? K.a(view.getContext().getSystemService(J.a())) : null;
        if (i7 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f15000m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f14991d = wVar;
        wVar.n(new a());
        wVar.k();
        this.f14998k = rVar;
        rVar.v(this);
    }

    public static boolean l(w.e eVar, w.e eVar2) {
        int i7 = eVar.f1475e - eVar.f1474d;
        if (i7 != eVar2.f1475e - eVar2.f1474d) {
            return true;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (eVar.f1471a.charAt(eVar.f1474d + i8) != eVar2.f1471a.charAt(eVar2.f1474d + i8)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int r(D5.w.c r1, boolean r2, boolean r3, boolean r4, boolean r5, D5.w.d r6) {
        /*
            D5.w$g r5 = r1.f1462a
            D5.w$g r0 = D5.w.g.DATETIME
            if (r5 != r0) goto L8
            r1 = 4
            return r1
        L8:
            D5.w$g r0 = D5.w.g.NUMBER
            if (r5 != r0) goto L1b
            boolean r2 = r1.f1463b
            if (r2 == 0) goto L13
            r2 = 4098(0x1002, float:5.743E-42)
            goto L14
        L13:
            r2 = 2
        L14:
            boolean r1 = r1.f1464c
            if (r1 == 0) goto L1a
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
        L1a:
            return r2
        L1b:
            D5.w$g r1 = D5.w.g.PHONE
            if (r5 != r1) goto L21
            r1 = 3
            return r1
        L21:
            D5.w$g r1 = D5.w.g.NONE
            if (r5 != r1) goto L27
            r1 = 0
            return r1
        L27:
            D5.w$g r1 = D5.w.g.MULTILINE
            if (r5 != r1) goto L2f
            r1 = 131073(0x20001, float:1.83672E-40)
            goto L53
        L2f:
            D5.w$g r1 = D5.w.g.EMAIL_ADDRESS
            if (r5 != r1) goto L36
            r1 = 33
            goto L53
        L36:
            D5.w$g r1 = D5.w.g.URL
            if (r5 != r1) goto L3d
            r1 = 17
            goto L53
        L3d:
            D5.w$g r1 = D5.w.g.VISIBLE_PASSWORD
            if (r5 != r1) goto L44
            r1 = 145(0x91, float:2.03E-43)
            goto L53
        L44:
            D5.w$g r1 = D5.w.g.NAME
            if (r5 != r1) goto L4b
            r1 = 97
            goto L53
        L4b:
            D5.w$g r1 = D5.w.g.POSTAL_ADDRESS
            if (r5 != r1) goto L52
            r1 = 113(0x71, float:1.58E-43)
            goto L53
        L52:
            r1 = 1
        L53:
            if (r2 == 0) goto L5a
            r2 = 524416(0x80080, float:7.34863E-40)
        L58:
            r1 = r1 | r2
            goto L66
        L5a:
            if (r3 == 0) goto L60
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
        L60:
            if (r4 != 0) goto L66
            r2 = 524432(0x80090, float:7.34886E-40)
            goto L58
        L66:
            D5.w$d r2 = D5.w.d.CHARACTERS
            if (r6 != r2) goto L6d
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            goto L7a
        L6d:
            D5.w$d r2 = D5.w.d.WORDS
            if (r6 != r2) goto L74
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            goto L7a
        L74:
            D5.w$d r2 = D5.w.d.SENTENCES
            if (r6 != r2) goto L7a
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.C.r(D5.w$c, boolean, boolean, boolean, boolean, D5.w$d):int");
    }

    public final void A(int i7, boolean z7) {
        if (!z7) {
            this.f14992e = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i7);
            this.f14997j = null;
        } else {
            this.f14988a.requestFocus();
            this.f14992e = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i7);
            this.f14989b.restartInput(this.f14988a);
            this.f14996i = false;
        }
    }

    public void B(int i7, w.b bVar) {
        w();
        this.f14993f = bVar;
        this.f14992e = new c(c.a.FRAMEWORK_CLIENT, i7);
        this.f14995h.l(this);
        w.b.a aVar = bVar.f1455j;
        this.f14995h = new m(aVar != null ? aVar.f1460c : null, this.f14988a);
        F(bVar);
        this.f14996i = true;
        E();
        this.f14999l = null;
        this.f14995h.a(this);
    }

    public void C(View view, w.e eVar) {
        w.e eVar2;
        if (!this.f14996i && (eVar2 = this.f15001n) != null && eVar2.b()) {
            boolean l7 = l(this.f15001n, eVar);
            this.f14996i = l7;
            if (l7) {
                AbstractC1995b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f15001n = eVar;
        this.f14995h.n(eVar);
        if (this.f14996i) {
            this.f14989b.restartInput(view);
            this.f14996i = false;
        }
    }

    public void D(View view) {
        w.c cVar;
        w.b bVar = this.f14993f;
        if (bVar != null && (cVar = bVar.f1452g) != null && cVar.f1462a == w.g.NONE) {
            q(view);
        } else {
            view.requestFocus();
            this.f14989b.showSoftInput(view, 0);
        }
    }

    public void E() {
        if (this.f14992e.f15008a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f15002o = false;
        }
    }

    public final void F(w.b bVar) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f1455j == null) {
            this.f14994g = null;
            return;
        }
        w.b[] bVarArr = bVar.f1457l;
        SparseArray sparseArray = new SparseArray();
        this.f14994g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f1455j.f1458a.hashCode(), bVar);
            return;
        }
        for (w.b bVar2 : bVarArr) {
            w.b.a aVar = bVar2.f1455j;
            if (aVar != null) {
                this.f14994g.put(aVar.f1458a.hashCode(), bVar2);
                AutofillManager autofillManager = this.f14990c;
                View view = this.f14988a;
                int hashCode = aVar.f1458a.hashCode();
                forText = AutofillValue.forText(aVar.f1460c.f1471a);
                autofillManager.notifyValueChanged(view, hashCode, forText);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r7 == r1.f1475e) goto L22;
     */
    @Override // io.flutter.plugin.editing.m.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.m r9 = r8.f14995h
            java.lang.String r9 = r9.toString()
            r8.u(r9)
        Lb:
            io.flutter.plugin.editing.m r9 = r8.f14995h
            int r9 = r9.i()
            io.flutter.plugin.editing.m r10 = r8.f14995h
            int r10 = r10.h()
            io.flutter.plugin.editing.m r11 = r8.f14995h
            int r11 = r11.g()
            io.flutter.plugin.editing.m r0 = r8.f14995h
            int r7 = r0.f()
            io.flutter.plugin.editing.m r0 = r8.f14995h
            java.util.ArrayList r0 = r0.e()
            D5.w$e r1 = r8.f15001n
            if (r1 == 0) goto La7
            io.flutter.plugin.editing.m r1 = r8.f14995h
            java.lang.String r1 = r1.toString()
            D5.w$e r2 = r8.f15001n
            java.lang.String r2 = r2.f1471a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            D5.w$e r1 = r8.f15001n
            int r2 = r1.f1472b
            if (r9 != r2) goto L50
            int r2 = r1.f1473c
            if (r10 != r2) goto L50
            int r2 = r1.f1474d
            if (r11 != r2) goto L50
            int r1 = r1.f1475e
            if (r7 != r1) goto L50
            goto La7
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.m r2 = r8.f14995h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            t5.AbstractC1995b.f(r2, r1)
            D5.w$b r1 = r8.f14993f
            boolean r1 = r1.f1450e
            if (r1 == 0) goto L81
            D5.w r1 = r8.f14991d
            io.flutter.plugin.editing.C$c r2 = r8.f14992e
            int r2 = r2.f15009b
            r1.q(r2, r0)
            io.flutter.plugin.editing.m r0 = r8.f14995h
            r0.c()
            goto L94
        L81:
            D5.w r0 = r8.f14991d
            io.flutter.plugin.editing.C$c r1 = r8.f14992e
            int r1 = r1.f15009b
            io.flutter.plugin.editing.m r2 = r8.f14995h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.p(r1, r2, r3, r4, r5, r6)
        L94:
            D5.w$e r6 = new D5.w$e
            io.flutter.plugin.editing.m r0 = r8.f14995h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f15001n = r6
            goto Lac
        La7:
            io.flutter.plugin.editing.m r9 = r8.f14995h
            r9.c()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.C.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray sparseArray) {
        w.b bVar;
        w.b.a aVar;
        w.b.a aVar2;
        CharSequence textValue;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f14993f) == null || this.f14994g == null || (aVar = bVar.f1455j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            w.b bVar2 = (w.b) this.f14994g.get(sparseArray.keyAt(i7));
            if (bVar2 != null && (aVar2 = bVar2.f1455j) != null) {
                textValue = x.a(sparseArray.valueAt(i7)).getTextValue();
                String charSequence = textValue.toString();
                w.e eVar = new w.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (aVar2.f1458a.equals(aVar.f1458a)) {
                    this.f14995h.n(eVar);
                } else {
                    hashMap.put(aVar2.f1458a, eVar);
                }
            }
        }
        this.f14991d.r(this.f14992e.f15009b, hashMap);
    }

    public void k() {
        if (this.f14992e.f15008a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f14995h.l(this);
        w();
        this.f14993f = null;
        F(null);
        this.f14992e = new c(c.a.NO_TARGET, 0);
        E();
        this.f14999l = null;
        this.f14989b.restartInput(this.f14988a);
    }

    public InputConnection m(View view, L l7, EditorInfo editorInfo) {
        c cVar = this.f14992e;
        c.a aVar = cVar.f15008a;
        if (aVar == c.a.NO_TARGET) {
            this.f14997j = null;
            return null;
        }
        if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f15002o) {
                return this.f14997j;
            }
            InputConnection onCreateInputConnection = this.f14998k.c(cVar.f15009b).onCreateInputConnection(editorInfo);
            this.f14997j = onCreateInputConnection;
            return onCreateInputConnection;
        }
        w.b bVar = this.f14993f;
        int r7 = r(bVar.f1452g, bVar.f1446a, bVar.f1447b, bVar.f1448c, bVar.f1449d, bVar.f1451f);
        editorInfo.inputType = r7;
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.f14993f.f1449d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f14993f.f1453h;
        int intValue = num == null ? (r7 & 131072) != 0 ? 1 : 6 : num.intValue();
        w.b bVar2 = this.f14993f;
        String str = bVar2.f1454i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        String[] strArr = bVar2.f1456k;
        if (strArr != null) {
            K.b.a(editorInfo, strArr);
        }
        l lVar = new l(view, this.f14992e.f15009b, this.f14991d, l7, this.f14995h, editorInfo);
        editorInfo.initialSelStart = this.f14995h.i();
        editorInfo.initialSelEnd = this.f14995h.h();
        this.f14997j = lVar;
        return lVar;
    }

    public void n() {
        this.f14998k.G();
        this.f14991d.n(null);
        w();
        this.f14995h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f15000m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager o() {
        return this.f14989b;
    }

    public boolean p(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!o().isAcceptingText() || (inputConnection = this.f14997j) == null) {
            return false;
        }
        return inputConnection instanceof l ? ((l) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public final void q(View view) {
        w();
        this.f14989b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    public void s() {
        if (this.f14992e.f15008a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f15002o = true;
        }
    }

    public final boolean t() {
        return this.f14994g != null;
    }

    public final void u(String str) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26 || this.f14990c == null || !t()) {
            return;
        }
        String str2 = this.f14993f.f1455j.f1458a;
        AutofillManager autofillManager = this.f14990c;
        View view = this.f14988a;
        int hashCode = str2.hashCode();
        forText = AutofillValue.forText(str);
        autofillManager.notifyValueChanged(view, hashCode, forText);
    }

    public final void v() {
        if (Build.VERSION.SDK_INT < 26 || this.f14990c == null || !t()) {
            return;
        }
        String str = this.f14993f.f1455j.f1458a;
        int[] iArr = new int[2];
        this.f14988a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f14999l);
        rect.offset(iArr[0], iArr[1]);
        this.f14990c.notifyViewEntered(this.f14988a, str.hashCode(), rect);
    }

    public final void w() {
        w.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f14990c == null || (bVar = this.f14993f) == null || bVar.f1455j == null || !t()) {
            return;
        }
        this.f14990c.notifyViewExited(this.f14988a, this.f14993f.f1455j.f1458a.hashCode());
    }

    public void x(ViewStructure viewStructure, int i7) {
        AutofillId autofillId;
        ViewStructure viewStructure2;
        CharSequence charSequence;
        AutofillValue forText;
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !t()) {
            return;
        }
        String str = this.f14993f.f1455j.f1458a;
        autofillId = viewStructure.getAutofillId();
        for (int i8 = 0; i8 < this.f14994g.size(); i8++) {
            int keyAt = this.f14994g.keyAt(i8);
            w.b.a aVar = ((w.b) this.f14994g.valueAt(i8)).f1455j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i8);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = aVar.f1459b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = aVar.f1461d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.f14999l) == null) {
                    viewStructure2 = newChild;
                    viewStructure2.setDimens(0, 0, 0, 0, 1, 1);
                    charSequence = aVar.f1460c.f1471a;
                } else {
                    viewStructure2 = newChild;
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f14999l.height());
                    charSequence = this.f14995h;
                }
                forText = AutofillValue.forText(charSequence);
                viewStructure2.setAutofillValue(forText);
            }
        }
    }

    public final void y(double d7, double d8, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z7 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d9 = dArr[12];
        double d10 = dArr[15];
        double d11 = d9 / d10;
        dArr2[1] = d11;
        dArr2[0] = d11;
        double d12 = dArr[13] / d10;
        dArr2[3] = d12;
        dArr2[2] = d12;
        b bVar = new b(z7, dArr, dArr2);
        bVar.a(d7, 0.0d);
        bVar.a(d7, d8);
        bVar.a(0.0d, d8);
        double d13 = this.f14988a.getContext().getResources().getDisplayMetrics().density;
        this.f14999l = new Rect((int) (dArr2[0] * d13), (int) (dArr2[2] * d13), (int) Math.ceil(dArr2[1] * d13), (int) Math.ceil(dArr2[3] * d13));
    }

    public void z(String str, Bundle bundle) {
        this.f14989b.sendAppPrivateCommand(this.f14988a, str, bundle);
    }
}
