package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import h.AbstractC1323b;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1325d extends AbstractC1323b {

    /* renamed from: A, reason: collision with root package name */
    public a f14512A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f14513B;

    /* renamed from: h.d$a */
    public static class a extends AbstractC1323b.c {

        /* renamed from: J, reason: collision with root package name */
        public int[][] f14514J;

        public a(a aVar, AbstractC1325d abstractC1325d, Resources resources) {
            super(aVar, abstractC1325d, resources);
            if (aVar != null) {
                this.f14514J = aVar.f14514J;
            } else {
                this.f14514J = new int[f()][];
            }
        }

        public int A(int[] iArr) {
            int[][] iArr2 = this.f14514J;
            int h7 = h();
            for (int i7 = 0; i7 < h7; i7++) {
                if (StateSet.stateSetMatches(iArr2[i7], iArr)) {
                    return i7;
                }
            }
            return -1;
        }

        @Override // h.AbstractC1323b.c
        public void o(int i7, int i8) {
            super.o(i7, i8);
            int[][] iArr = new int[i8][];
            System.arraycopy(this.f14514J, 0, iArr, 0, i7);
            this.f14514J = iArr;
        }

        @Override // h.AbstractC1323b.c
        public abstract void r();

        public int z(int[] iArr, Drawable drawable) {
            int a7 = a(drawable);
            this.f14514J[a7] = iArr;
            return a7;
        }
    }

    public AbstractC1325d(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // h.AbstractC1323b
    public void h(AbstractC1323b.c cVar) {
        super.h(cVar);
        if (cVar instanceof a) {
            this.f14512A = (a) cVar;
        }
    }

    public int[] j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i7 = 0;
        for (int i8 = 0; i8 < attributeCount; i8++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i8);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i9 = i7 + 1;
                if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i7] = attributeNameResource;
                i7 = i9;
            }
        }
        return StateSet.trimStateSet(iArr, i7);
    }

    @Override // h.AbstractC1323b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f14513B && super.mutate() == this) {
            this.f14512A.r();
            this.f14513B = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}
