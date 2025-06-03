/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.AssetManager
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Movie
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package l;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
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

public abstract class N
extends Resources {
    public final Resources a;

    public N(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = resources;
    }

    public XmlResourceParser getAnimation(int n8) {
        return this.a.getAnimation(n8);
    }

    public boolean getBoolean(int n8) {
        return this.a.getBoolean(n8);
    }

    public int getColor(int n8) {
        return this.a.getColor(n8);
    }

    public ColorStateList getColorStateList(int n8) {
        return this.a.getColorStateList(n8);
    }

    public Configuration getConfiguration() {
        return this.a.getConfiguration();
    }

    public float getDimension(int n8) {
        return this.a.getDimension(n8);
    }

    public int getDimensionPixelOffset(int n8) {
        return this.a.getDimensionPixelOffset(n8);
    }

    public int getDimensionPixelSize(int n8) {
        return this.a.getDimensionPixelSize(n8);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.a.getDisplayMetrics();
    }

    public Drawable getDrawable(int n8) {
        return this.a.getDrawable(n8);
    }

    public Drawable getDrawable(int n8, Resources.Theme theme) {
        return this.a.getDrawable(n8, theme);
    }

    public Drawable getDrawableForDensity(int n8, int n9) {
        return this.a.getDrawableForDensity(n8, n9);
    }

    public Drawable getDrawableForDensity(int n8, int n9, Resources.Theme theme) {
        return this.a.getDrawableForDensity(n8, n9, theme);
    }

    public float getFraction(int n8, int n9, int n10) {
        return this.a.getFraction(n8, n9, n10);
    }

    public int getIdentifier(String string2, String string3, String string4) {
        return this.a.getIdentifier(string2, string3, string4);
    }

    public int[] getIntArray(int n8) {
        return this.a.getIntArray(n8);
    }

    public int getInteger(int n8) {
        return this.a.getInteger(n8);
    }

    public XmlResourceParser getLayout(int n8) {
        return this.a.getLayout(n8);
    }

    public Movie getMovie(int n8) {
        return this.a.getMovie(n8);
    }

    public String getQuantityString(int n8, int n9) {
        return this.a.getQuantityString(n8, n9);
    }

    public /* varargs */ String getQuantityString(int n8, int n9, Object ... arrobject) {
        return this.a.getQuantityString(n8, n9, arrobject);
    }

    public CharSequence getQuantityText(int n8, int n9) {
        return this.a.getQuantityText(n8, n9);
    }

    public String getResourceEntryName(int n8) {
        return this.a.getResourceEntryName(n8);
    }

    public String getResourceName(int n8) {
        return this.a.getResourceName(n8);
    }

    public String getResourcePackageName(int n8) {
        return this.a.getResourcePackageName(n8);
    }

    public String getResourceTypeName(int n8) {
        return this.a.getResourceTypeName(n8);
    }

    public String getString(int n8) {
        return this.a.getString(n8);
    }

    public /* varargs */ String getString(int n8, Object ... arrobject) {
        return this.a.getString(n8, arrobject);
    }

    public String[] getStringArray(int n8) {
        return this.a.getStringArray(n8);
    }

    public CharSequence getText(int n8) {
        return this.a.getText(n8);
    }

    public CharSequence getText(int n8, CharSequence charSequence) {
        return this.a.getText(n8, charSequence);
    }

    public CharSequence[] getTextArray(int n8) {
        return this.a.getTextArray(n8);
    }

    public void getValue(int n8, TypedValue typedValue, boolean bl) {
        this.a.getValue(n8, typedValue, bl);
    }

    public void getValue(String string2, TypedValue typedValue, boolean bl) {
        this.a.getValue(string2, typedValue, bl);
    }

    public void getValueForDensity(int n8, int n9, TypedValue typedValue, boolean bl) {
        this.a.getValueForDensity(n8, n9, typedValue, bl);
    }

    public XmlResourceParser getXml(int n8) {
        return this.a.getXml(n8);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] arrn) {
        return this.a.obtainAttributes(attributeSet, arrn);
    }

    public TypedArray obtainTypedArray(int n8) {
        return this.a.obtainTypedArray(n8);
    }

    public InputStream openRawResource(int n8) {
        return this.a.openRawResource(n8);
    }

    public InputStream openRawResource(int n8, TypedValue typedValue) {
        return this.a.openRawResource(n8, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int n8) {
        return this.a.openRawResourceFd(n8);
    }

    public void parseBundleExtra(String string2, AttributeSet attributeSet, Bundle bundle) {
        this.a.parseBundleExtra(string2, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}

