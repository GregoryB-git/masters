// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.api;

import B2.c;
import android.os.Parcel;
import A2.n;
import y2.i;
import androidx.annotation.NonNull;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import B2.a;

public final class Scope extends a implements ReflectedParcelable
{
    @NonNull
    public static final Parcelable$Creator<Scope> CREATOR;
    public final int o;
    public final String p;
    
    static {
        CREATOR = (Parcelable$Creator)new i();
    }
    
    public Scope(final int o, final String p2) {
        n.f(p2, "scopeUri must not be null or empty");
        this.o = o;
        this.p = p2;
    }
    
    public Scope(final String s) {
        this(1, s);
    }
    
    public String a() {
        return this.p;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Scope && this.p.equals(((Scope)o).p));
    }
    
    @Override
    public int hashCode() {
        return this.p.hashCode();
    }
    
    @Override
    public String toString() {
        return this.p;
    }
    
    public void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.i(parcel, 1, this.o);
        c.n(parcel, 2, this.a(), false);
        c.b(parcel, a);
    }
}
