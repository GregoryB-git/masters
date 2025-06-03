package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s5.f;
import s5.h;
import v5.e0;

/* loaded from: classes.dex */
public final class c extends FrameLayout implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.a f2735a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2736b;

    /* renamed from: c, reason: collision with root package name */
    public List<h5.a> f2737c;

    /* renamed from: d, reason: collision with root package name */
    public s5.a f2738d;

    /* renamed from: e, reason: collision with root package name */
    public float f2739e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public float f2740o;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2741a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f2741a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2741a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2741a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(Context context) {
        super(context, null);
        this.f2737c = Collections.emptyList();
        this.f2738d = s5.a.f14166g;
        this.f2739e = 0.0533f;
        this.f = 0;
        this.f2740o = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context);
        this.f2735a = aVar;
        h hVar = new h(context);
        this.f2736b = hVar;
        hVar.setBackgroundColor(0);
        addView(aVar);
        addView(hVar);
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public final void a(List<h5.a> list, s5.a aVar, float f, int i10, float f10) {
        this.f2738d = aVar;
        this.f2739e = f;
        this.f = i10;
        this.f2740o = f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            h5.a aVar2 = list.get(i11);
            if (aVar2.f7098d != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (!this.f2737c.isEmpty() || !arrayList2.isEmpty()) {
            this.f2737c = arrayList2;
            c();
        }
        this.f2735a.a(arrayList, aVar, f, i10, f10);
        invalidate();
    }

    public final String b(float f, int i10) {
        float b10 = f.b(f, i10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return b10 == -3.4028235E38f ? "unset" : e0.m("%.2fpx", Float.valueOf(b10 / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x047a, code lost:
    
        if (((android.text.style.TypefaceSpan) r11).getFamily() != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01e5, code lost:
    
        if (r8 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01ed, code lost:
    
        r0 = 2;
        r30 = r29;
        r29 = "top";
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01eb, code lost:
    
        r29 = "right";
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01e8, code lost:
    
        if (r8 != 0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0513 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x064b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.c.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f2737c.isEmpty()) {
            return;
        }
        c();
    }
}
