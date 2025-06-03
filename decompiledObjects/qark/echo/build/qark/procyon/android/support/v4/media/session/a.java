// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media.session;

import android.os.Parcelable;
import android.text.TextUtils;
import android.os.Parcelable$Creator;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import java.util.List;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.os.IInterface;

public interface a extends IInterface
{
    void C();
    
    void E(final MediaMetadataCompat p0);
    
    void J0(final boolean p0);
    
    void Q0(final PlaybackStateCompat p0);
    
    void X0(final ParcelableVolumeInfo p0);
    
    void d0(final int p0);
    
    void f0();
    
    void g0(final Bundle p0);
    
    void l0(final List p0);
    
    void m(final int p0);
    
    void t(final String p0, final Bundle p1);
    
    void w(final boolean p0);
    
    void x(final CharSequence p0);
    
    public abstract static class a extends Binder implements a
    {
        public a() {
            this.attachInterface((IInterface)this, "android.support.v4.media.session.IMediaControllerCallback");
        }
        
        public static a n(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface != null && queryLocalInterface instanceof a) {
                return (a)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public IBinder asBinder() {
            return (IBinder)this;
        }
        
        public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            if (n >= 1 && n <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (n == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            final boolean b = false;
            boolean b2 = false;
            switch (n) {
                default: {
                    return super.onTransact(n, parcel, parcel2, n2);
                }
                case 13: {
                    this.f0();
                    return true;
                }
                case 12: {
                    this.d0(parcel.readInt());
                    return true;
                }
                case 11: {
                    if (parcel.readInt() != 0) {
                        b2 = true;
                    }
                    this.J0(b2);
                    return true;
                }
                case 10: {
                    boolean b3 = b;
                    if (parcel.readInt() != 0) {
                        b3 = true;
                    }
                    this.w(b3);
                    return true;
                }
                case 9: {
                    this.m(parcel.readInt());
                    return true;
                }
                case 8: {
                    this.X0((ParcelableVolumeInfo)d(parcel, ParcelableVolumeInfo.CREATOR));
                    return true;
                }
                case 7: {
                    this.g0((Bundle)d(parcel, Bundle.CREATOR));
                    return true;
                }
                case 6: {
                    this.x((CharSequence)d(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                }
                case 5: {
                    this.l0(parcel.createTypedArrayList((Parcelable$Creator)MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                }
                case 4: {
                    this.E((MediaMetadataCompat)d(parcel, MediaMetadataCompat.CREATOR));
                    return true;
                }
                case 3: {
                    this.Q0((PlaybackStateCompat)d(parcel, PlaybackStateCompat.CREATOR));
                    return true;
                }
                case 2: {
                    this.C();
                    return true;
                }
                case 1: {
                    this.t(parcel.readString(), (Bundle)d(parcel, Bundle.CREATOR));
                    return true;
                }
            }
        }
        
        public static class a implements android.support.v4.media.session.a
        {
            public IBinder b;
            
            public a(final IBinder b) {
                this.b = b;
            }
            
            @Override
            public void C() {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.b.transact(2, obtain, (Parcel)null, 1);
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void E(final MediaMetadataCompat mediaMetadataCompat) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    f(obtain, (Parcelable)mediaMetadataCompat, 0);
                    this.b.transact(4, obtain, (Parcel)null, 1);
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void J0(final boolean b) {
                throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            }
            
            @Override
            public void Q0(final PlaybackStateCompat playbackStateCompat) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    f(obtain, (Parcelable)playbackStateCompat, 0);
                    this.b.transact(3, obtain, (Parcel)null, 1);
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void X0(final ParcelableVolumeInfo parcelableVolumeInfo) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    f(obtain, (Parcelable)parcelableVolumeInfo, 0);
                    this.b.transact(8, obtain, (Parcel)null, 1);
                }
                finally {
                    obtain.recycle();
                }
            }
            
            public IBinder asBinder() {
                return this.b;
            }
            
            @Override
            public void d0(final int n) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(n);
                    this.b.transact(12, obtain, (Parcel)null, 1);
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void l0(final List list) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    e(obtain, list, 0);
                    this.b.transact(5, obtain, (Parcel)null, 1);
                }
                finally {
                    obtain.recycle();
                }
            }
            
            @Override
            public void m(final int n) {
                final Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(n);
                    this.b.transact(9, obtain, (Parcel)null, 1);
                }
                finally {
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
