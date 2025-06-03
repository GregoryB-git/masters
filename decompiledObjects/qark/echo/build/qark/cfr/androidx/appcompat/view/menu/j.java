/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.CharSequence
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;

public class j
extends d
implements SubMenu {
    public d B;
    public e C;

    public j(Context context, d d8, e e8) {
        super(context);
        this.B = d8;
        this.C = e8;
    }

    @Override
    public boolean B() {
        return this.B.B();
    }

    @Override
    public boolean C() {
        return this.B.C();
    }

    @Override
    public boolean D() {
        return this.B.D();
    }

    @Override
    public void L(d.a a8) {
        this.B.L(a8);
    }

    public Menu W() {
        return this.B;
    }

    @Override
    public boolean e(e e8) {
        return this.B.e(e8);
    }

    @Override
    public boolean g(d d8, MenuItem menuItem) {
        if (!super.g(d8, menuItem) && !this.B.g(d8, menuItem)) {
            return false;
        }
        return true;
    }

    public MenuItem getItem() {
        return this.C;
    }

    @Override
    public boolean j(e e8) {
        return this.B.j(e8);
    }

    @Override
    public void setGroupDividerEnabled(boolean bl) {
        this.B.setGroupDividerEnabled(bl);
    }

    public SubMenu setHeaderIcon(int n8) {
        return (SubMenu)super.N(n8);
    }

    public SubMenu setHeaderIcon(Drawable drawable2) {
        return (SubMenu)super.O(drawable2);
    }

    public SubMenu setHeaderTitle(int n8) {
        return (SubMenu)super.Q(n8);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu)super.R(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu)super.S(view);
    }

    public SubMenu setIcon(int n8) {
        this.C.setIcon(n8);
        return this;
    }

    public SubMenu setIcon(Drawable drawable2) {
        this.C.setIcon(drawable2);
        return this;
    }

    @Override
    public void setQwertyMode(boolean bl) {
        this.B.setQwertyMode(bl);
    }

    @Override
    public d z() {
        return this.B.z();
    }
}

