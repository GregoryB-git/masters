// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.appcompat.view.menu;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.Menu;
import android.content.Context;
import android.view.SubMenu;

public class j extends d implements SubMenu
{
    public d B;
    public e C;
    
    public j(final Context context, final d b, final e c) {
        super(context);
        this.B = b;
        this.C = c;
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
    public void L(final a a) {
        this.B.L(a);
    }
    
    public Menu W() {
        return (Menu)this.B;
    }
    
    @Override
    public boolean e(final e e) {
        return this.B.e(e);
    }
    
    @Override
    public boolean g(final d d, final MenuItem menuItem) {
        return super.g(d, menuItem) || this.B.g(d, menuItem);
    }
    
    public MenuItem getItem() {
        return (MenuItem)this.C;
    }
    
    @Override
    public boolean j(final e e) {
        return this.B.j(e);
    }
    
    @Override
    public void setGroupDividerEnabled(final boolean groupDividerEnabled) {
        this.B.setGroupDividerEnabled(groupDividerEnabled);
    }
    
    public SubMenu setHeaderIcon(final int n) {
        return (SubMenu)super.N(n);
    }
    
    public SubMenu setHeaderIcon(final Drawable drawable) {
        return (SubMenu)super.O(drawable);
    }
    
    public SubMenu setHeaderTitle(final int n) {
        return (SubMenu)super.Q(n);
    }
    
    public SubMenu setHeaderTitle(final CharSequence charSequence) {
        return (SubMenu)super.R(charSequence);
    }
    
    public SubMenu setHeaderView(final View view) {
        return (SubMenu)super.S(view);
    }
    
    public SubMenu setIcon(final int icon) {
        this.C.setIcon(icon);
        return (SubMenu)this;
    }
    
    public SubMenu setIcon(final Drawable icon) {
        this.C.setIcon(icon);
        return (SubMenu)this;
    }
    
    @Override
    public void setQwertyMode(final boolean qwertyMode) {
        this.B.setQwertyMode(qwertyMode);
    }
    
    @Override
    public d z() {
        return this.B.z();
    }
}
