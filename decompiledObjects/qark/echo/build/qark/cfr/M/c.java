/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Object
 *  java.lang.String
 */
package M;

import M.a;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c
extends a {
    public int w;
    public int x;
    public LayoutInflater y;

    public c(Context context, int n8, Cursor cursor, boolean bl) {
        super(context, cursor, bl);
        this.x = n8;
        this.w = n8;
        this.y = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    @Override
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.y.inflate(this.x, viewGroup, false);
    }

    @Override
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.y.inflate(this.w, viewGroup, false);
    }
}

