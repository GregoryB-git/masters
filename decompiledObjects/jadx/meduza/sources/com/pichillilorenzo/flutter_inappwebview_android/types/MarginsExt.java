package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.print.PrintAttributes;
import defpackage.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MarginsExt {
    private double bottom;
    private double left;
    private double right;
    private double top;

    public MarginsExt() {
    }

    public MarginsExt(double d10, double d11, double d12, double d13) {
        this.top = d10;
        this.right = d11;
        this.bottom = d12;
        this.left = d13;
    }

    public static MarginsExt fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new MarginsExt(((Double) map.get("top")).doubleValue(), ((Double) map.get("right")).doubleValue(), ((Double) map.get("bottom")).doubleValue(), ((Double) map.get("left")).doubleValue());
    }

    public static MarginsExt fromMargins(PrintAttributes.Margins margins) {
        if (margins == null) {
            return null;
        }
        MarginsExt marginsExt = new MarginsExt();
        marginsExt.top = milsToPixels(margins.getTopMils());
        marginsExt.right = milsToPixels(margins.getRightMils());
        marginsExt.bottom = milsToPixels(margins.getBottomMils());
        marginsExt.left = milsToPixels(margins.getLeftMils());
        return marginsExt;
    }

    private static double milsToPixels(int i10) {
        return i10 * 0.09600001209449d;
    }

    private static int pixelsToMils(double d10) {
        return (int) Math.round(d10 * 10.416665354331d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MarginsExt marginsExt = (MarginsExt) obj;
        return Double.compare(marginsExt.top, this.top) == 0 && Double.compare(marginsExt.right, this.right) == 0 && Double.compare(marginsExt.bottom, this.bottom) == 0 && Double.compare(marginsExt.left, this.left) == 0;
    }

    public double getBottom() {
        return this.bottom;
    }

    public double getLeft() {
        return this.left;
    }

    public double getRight() {
        return this.right;
    }

    public double getTop() {
        return this.top;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.top);
        long doubleToLongBits2 = Double.doubleToLongBits(this.right);
        int i10 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.bottom);
        int i11 = (i10 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.left);
        return (i11 * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public void setBottom(double d10) {
        this.bottom = d10;
    }

    public void setLeft(double d10) {
        this.left = d10;
    }

    public void setRight(double d10) {
        this.right = d10;
    }

    public void setTop(double d10) {
        this.top = d10;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("top", Double.valueOf(this.top));
        hashMap.put("right", Double.valueOf(this.right));
        hashMap.put("bottom", Double.valueOf(this.bottom));
        hashMap.put("left", Double.valueOf(this.left));
        return hashMap;
    }

    public PrintAttributes.Margins toMargins() {
        return new PrintAttributes.Margins(pixelsToMils(this.left), pixelsToMils(this.top), pixelsToMils(this.right), pixelsToMils(this.bottom));
    }

    public String toString() {
        StringBuilder l10 = f.l("MarginsExt{top=");
        l10.append(this.top);
        l10.append(", right=");
        l10.append(this.right);
        l10.append(", bottom=");
        l10.append(this.bottom);
        l10.append(", left=");
        l10.append(this.left);
        l10.append('}');
        return l10.toString();
    }
}
