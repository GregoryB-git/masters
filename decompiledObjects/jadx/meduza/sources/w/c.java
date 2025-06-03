package w;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f16144a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f16145b;

    /* renamed from: c, reason: collision with root package name */
    public int f16146c;

    public c(Shader shader, ColorStateList colorStateList, int i10) {
        this.f16144a = shader;
        this.f16145b = colorStateList;
        this.f16146c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x017e, code lost:
    
        if (r8.size() <= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0180, code lost:
    
        r0 = new w.e(r8, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0187, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018c, code lost:
    
        if (r19 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018e, code lost:
    
        r0 = new w.e(r5, r6, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0192, code lost:
    
        r0 = new w.e(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0196, code lost:
    
        if (r11 == 1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0199, code lost:
    
        if (r11 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019b, code lost:
    
        r4 = r0.f16157a;
        r0 = r0.f16158b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a1, code lost:
    
        if (r7 == 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a3, code lost:
    
        if (r7 == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a5, code lost:
    
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ad, code lost:
    
        r3 = new android.graphics.LinearGradient(r12, r26, r25, r15, r4, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0201, code lost:
    
        return new w.c(r3, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a8, code lost:
    
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ab, code lost:
    
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01be, code lost:
    
        r3 = new android.graphics.SweepGradient(r7, r9, r0.f16157a, r0.f16158b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d3, code lost:
    
        if (r8 <= 0.0f) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d5, code lost:
    
        r1 = r0.f16157a;
        r0 = r0.f16158b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01dc, code lost:
    
        if (r7 == 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01df, code lost:
    
        if (r7 == 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e1, code lost:
    
        r5 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e9, code lost:
    
        r3 = new android.graphics.RadialGradient(r7, r9, r8, r1, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e4, code lost:
    
        r5 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e7, code lost:
    
        r5 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0209, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0186, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w.c a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.a(android.content.res.Resources, int, android.content.res.Resources$Theme):w.c");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f16144a == null && (colorStateList = this.f16145b) != null && colorStateList.isStateful();
    }
}
