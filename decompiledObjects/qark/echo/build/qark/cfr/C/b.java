/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.view.MenuItem
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package C;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

public interface b
extends MenuItem {
    public MenuItem setAlphabeticShortcut(char var1, int var2);

    public b setContentDescription(CharSequence var1);

    public MenuItem setIconTintList(ColorStateList var1);

    public MenuItem setIconTintMode(PorterDuff.Mode var1);

    public MenuItem setNumericShortcut(char var1, int var2);

    public b setTooltipText(CharSequence var1);
}

