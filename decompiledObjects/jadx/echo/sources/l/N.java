package l;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class N extends Resources {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f16356a;

    public N(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f16356a = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i7) {
        return this.f16356a.getAnimation(i7);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i7) {
        return this.f16356a.getBoolean(i7);
    }

    @Override // android.content.res.Resources
    public int getColor(int i7) {
        return this.f16356a.getColor(i7);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i7) {
        return this.f16356a.getColorStateList(i7);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f16356a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i7) {
        return this.f16356a.getDimension(i7);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i7) {
        return this.f16356a.getDimensionPixelOffset(i7);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i7) {
        return this.f16356a.getDimensionPixelSize(i7);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f16356a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7) {
        return this.f16356a.getDrawable(i7);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i7, int i8) {
        return this.f16356a.getDrawableForDensity(i7, i8);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i7, int i8, int i9) {
        return this.f16356a.getFraction(i7, i8, i9);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f16356a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i7) {
        return this.f16356a.getIntArray(i7);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i7) {
        return this.f16356a.getInteger(i7);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i7) {
        return this.f16356a.getLayout(i7);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i7) {
        return this.f16356a.getMovie(i7);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i7, int i8) {
        return this.f16356a.getQuantityString(i7, i8);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i7, int i8) {
        return this.f16356a.getQuantityText(i7, i8);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i7) {
        return this.f16356a.getResourceEntryName(i7);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i7) {
        return this.f16356a.getResourceName(i7);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i7) {
        return this.f16356a.getResourcePackageName(i7);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i7) {
        return this.f16356a.getResourceTypeName(i7);
    }

    @Override // android.content.res.Resources
    public String getString(int i7) {
        return this.f16356a.getString(i7);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i7) {
        return this.f16356a.getStringArray(i7);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i7) {
        return this.f16356a.getText(i7);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i7) {
        return this.f16356a.getTextArray(i7);
    }

    @Override // android.content.res.Resources
    public void getValue(int i7, TypedValue typedValue, boolean z7) {
        this.f16356a.getValue(i7, typedValue, z7);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i7, int i8, TypedValue typedValue, boolean z7) {
        this.f16356a.getValueForDensity(i7, i8, typedValue, z7);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i7) {
        return this.f16356a.getXml(i7);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f16356a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i7) {
        return this.f16356a.obtainTypedArray(i7);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i7) {
        return this.f16356a.openRawResource(i7);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i7) {
        return this.f16356a.openRawResourceFd(i7);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f16356a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f16356a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f16356a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7, Resources.Theme theme) {
        return this.f16356a.getDrawable(i7, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i7, int i8, Resources.Theme theme) {
        return this.f16356a.getDrawableForDensity(i7, i8, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i7, int i8, Object... objArr) {
        return this.f16356a.getQuantityString(i7, i8, objArr);
    }

    @Override // android.content.res.Resources
    public String getString(int i7, Object... objArr) {
        return this.f16356a.getString(i7, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i7, CharSequence charSequence) {
        return this.f16356a.getText(i7, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z7) {
        this.f16356a.getValue(str, typedValue, z7);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i7, TypedValue typedValue) {
        return this.f16356a.openRawResource(i7, typedValue);
    }
}
