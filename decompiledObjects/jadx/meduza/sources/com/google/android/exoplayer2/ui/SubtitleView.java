package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import h5.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s5.f;
import v3.e1;
import v3.f1;
import v3.m;
import v3.n;
import v3.o0;
import v3.p0;
import v3.r1;
import v3.s1;
import v5.e0;
import w5.o;
import x3.d;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements f1.c {

    /* renamed from: a, reason: collision with root package name */
    public List<h5.a> f2705a;

    /* renamed from: b, reason: collision with root package name */
    public s5.a f2706b;

    /* renamed from: c, reason: collision with root package name */
    public int f2707c;

    /* renamed from: d, reason: collision with root package name */
    public float f2708d;

    /* renamed from: e, reason: collision with root package name */
    public float f2709e;
    public boolean f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2710o;

    /* renamed from: p, reason: collision with root package name */
    public int f2711p;

    /* renamed from: q, reason: collision with root package name */
    public a f2712q;

    /* renamed from: r, reason: collision with root package name */
    public View f2713r;

    public interface a {
        void a(List<h5.a> list, s5.a aVar, float f, int i10, float f10);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2705a = Collections.emptyList();
        this.f2706b = s5.a.f14166g;
        this.f2707c = 0;
        this.f2708d = 0.0533f;
        this.f2709e = 0.08f;
        this.f = true;
        this.f2710o = true;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.f2712q = aVar;
        this.f2713r = aVar;
        addView(aVar);
        this.f2711p = 1;
    }

    private List<h5.a> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.f2710o) {
            return this.f2705a;
        }
        ArrayList arrayList = new ArrayList(this.f2705a.size());
        for (int i10 = 0; i10 < this.f2705a.size(); i10++) {
            h5.a aVar = this.f2705a.get(i10);
            aVar.getClass();
            a.C0105a c0105a = new a.C0105a(aVar);
            if (!this.f) {
                c0105a.f7122n = false;
                CharSequence charSequence = c0105a.f7110a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c0105a.f7110a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c0105a.f7110a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof l5.b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                f.a(c0105a);
            } else if (!this.f2710o) {
                f.a(c0105a);
            }
            arrayList.add(c0105a.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (e0.f15881a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private s5.a getUserCaptionStyle() {
        int i10 = e0.f15881a;
        if (i10 < 19 || isInEditMode()) {
            return s5.a.f14166g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return s5.a.f14166g;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i10 >= 21) {
            return new s5.a(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new s5.a(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.f2713r);
        View view = this.f2713r;
        if (view instanceof c) {
            ((c) view).f2736b.destroy();
        }
        this.f2713r = t;
        this.f2712q = t;
        addView(t);
    }

    public final void B() {
        this.f2712q.a(getCuesWithStylingPreferencesApplied(), this.f2706b, this.f2708d, this.f2707c, this.f2709e);
    }

    @Override // v3.f1.c
    public final /* synthetic */ void D(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void F(f1.a aVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void G(int i10, f1.d dVar, f1.d dVar2) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void I(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void K(int i10, boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void L(float f) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void N(int i10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void R(p0 p0Var) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void T(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void W(int i10, boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void X(n nVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void Y(r1 r1Var, int i10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void Z(s1 s1Var) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void a0(n nVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void b(o oVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void b0(int i10, boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void c0(e1 e1Var) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void d(int i10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void d0(d dVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void e0(f1 f1Var, f1.b bVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void f() {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void j(h5.c cVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void k0(o0 o0Var, int i10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void l0(m mVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void m() {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void m0(int i10, int i11) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void o(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void p0(boolean z10) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void q(int i10) {
    }

    @Override // v3.f1.c
    public final void r(List<h5.a> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f2710o = z10;
        B();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f = z10;
        B();
    }

    public void setBottomPaddingFraction(float f) {
        this.f2709e = f;
        B();
    }

    public void setCues(List<h5.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f2705a = list;
        B();
    }

    public void setFractionalTextSize(float f) {
        this.f2707c = 0;
        this.f2708d = f;
        B();
    }

    public void setStyle(s5.a aVar) {
        this.f2706b = aVar;
        B();
    }

    public void setViewType(int i10) {
        KeyEvent.Callback aVar;
        if (this.f2711p == i10) {
            return;
        }
        if (i10 == 1) {
            aVar = new com.google.android.exoplayer2.ui.a(getContext());
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            aVar = new c(getContext());
        }
        setView(aVar);
        this.f2711p = i10;
    }

    @Override // v3.f1.c
    public final /* synthetic */ void w(p4.a aVar) {
    }

    @Override // v3.f1.c
    public final /* synthetic */ void x(int i10) {
    }
}
