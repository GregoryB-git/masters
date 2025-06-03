package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s5.d;

/* loaded from: classes.dex */
public final class a extends View implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2720a;

    /* renamed from: b, reason: collision with root package name */
    public List<h5.a> f2721b;

    /* renamed from: c, reason: collision with root package name */
    public int f2722c;

    /* renamed from: d, reason: collision with root package name */
    public float f2723d;

    /* renamed from: e, reason: collision with root package name */
    public s5.a f2724e;
    public float f;

    public a(Context context) {
        super(context, null);
        this.f2720a = new ArrayList();
        this.f2721b = Collections.emptyList();
        this.f2722c = 0;
        this.f2723d = 0.0533f;
        this.f2724e = s5.a.f14166g;
        this.f = 0.08f;
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public final void a(List<h5.a> list, s5.a aVar, float f, int i10, float f10) {
        this.f2721b = list;
        this.f2724e = aVar;
        this.f2723d = f;
        this.f2722c = i10;
        this.f = f10;
        while (this.f2720a.size() < list.size()) {
            this.f2720a.add(new d(getContext()));
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x044c, code lost:
    
        if (r2 < r8) goto L182;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0504  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r45) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.a.dispatchDraw(android.graphics.Canvas):void");
    }
}
