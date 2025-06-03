// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media.session;

import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;
import android.view.KeyEvent;
import android.app.PendingIntent;
import android.net.Uri;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.os.Bundle;
import android.os.IInterface;

public interface b extends IInterface
{
    void A(final android.support.v4.media.session.a p0);
    
    void A0(final String p0, final Bundle p1);
    
    void B(final RatingCompat p0, final Bundle p1);
    
    ParcelableVolumeInfo C0();
    
    void D(final MediaDescriptionCompat p0, final int p1);
    
    void E0();
    
    void G0(final Uri p0, final Bundle p1);
    
    boolean H();
    
    void H0(final long p0);
    
    void I(final RatingCompat p0);
    
    void J(final int p0, final int p1, final String p2);
    
    void M(final Uri p0, final Bundle p1);
    
    String N0();
    
    void Q(final MediaDescriptionCompat p0);
    
    boolean R();
    
    void S(final MediaDescriptionCompat p0);
    
    PendingIntent T();
    
    int U();
    
    void V(final int p0);
    
    int X();
    
    void Y(final String p0, final Bundle p1);
    
    boolean Y0(final KeyEvent p0);
    
    boolean b0();
    
    String e();
    
    PlaybackStateCompat f();
    
    void g();
    
    void i(final int p0);
    
    void j();
    
    void j0(final String p0, final Bundle p1, final MediaSessionCompat.ResultReceiverWrapper p2);
    
    void k(final boolean p0);
    
    List k0();
    
    void next();
    
    void o0();
    
    void p();
    
    CharSequence p0();
    
    void previous();
    
    int q();
    
    Bundle r();
    
    MediaMetadataCompat r0();
    
    void s(final int p0);
    
    void s0(final String p0, final Bundle p1);
    
    void stop();
    
    Bundle t0();
    
    void u(final float p0);
    
    void u0(final android.support.v4.media.session.a p0);
    
    void v0(final String p0, final Bundle p1);
    
    long w0();
    
    void y(final String p0, final Bundle p1);
    
    void y0(final long p0);
    
    void z(final int p0, final int p1, final String p2);
    
    void z0(final boolean p0);
    
    public abstract static class a extends Binder implements b
    {
        public a() {
            this.attachInterface((IInterface)this, "android.support.v4.media.session.IMediaSession");
        }
        
        public static b n(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && queryLocalInterface instanceof b) {
                return (b)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public static class a implements b
        {
            public IBinder b;
            
            public a(final IBinder b) {
                this.b = b;
            }
            
            @Override
            public void A(final android.support.v4.media.session.a a) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongInterface((IInterface)a);
                    this.b.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public PendingIntent T() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.b.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (PendingIntent)d(obtain2, PendingIntent.CREATOR);
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public boolean Y0(final KeyEvent keyEvent) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean b = false;
                    f(obtain, (Parcelable)keyEvent, 0);
                    this.b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        b = true;
                    }
                    return b;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            public IBinder asBinder() {
                return this.b;
            }
            
            @Override
            public void u0(final android.support.v4.media.session.a a) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongInterface((IInterface)a);
                    this.b.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
    
    public abstract static class b
    {
        public static Object d(final Parcel parcel, final Parcelable$Creator parcelable$Creator) {
            if (parcel.readInt() != 0) {
                return parcelable$Creator.createFromParcel(parcel);
            }
            return null;
        }
        
        public static void e(final Parcel parcel, final List list, final int n) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            final int size = list.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; ++i) {
                f(parcel, list.get(i), n);
            }
        }
        
        public static void f(final Parcel parcel, final Parcelable parcelable, final int n) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, n);
                return;
            }
            parcel.writeInt(0);
        }
    }
}
