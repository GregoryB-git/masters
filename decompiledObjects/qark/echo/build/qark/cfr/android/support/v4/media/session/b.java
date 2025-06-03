/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.net.Uri
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.KeyEvent
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import java.util.List;

public interface b
extends IInterface {
    public void A(android.support.v4.media.session.a var1);

    public void A0(String var1, Bundle var2);

    public void B(RatingCompat var1, Bundle var2);

    public ParcelableVolumeInfo C0();

    public void D(MediaDescriptionCompat var1, int var2);

    public void E0();

    public void G0(Uri var1, Bundle var2);

    public boolean H();

    public void H0(long var1);

    public void I(RatingCompat var1);

    public void J(int var1, int var2, String var3);

    public void M(Uri var1, Bundle var2);

    public String N0();

    public void Q(MediaDescriptionCompat var1);

    public boolean R();

    public void S(MediaDescriptionCompat var1);

    public PendingIntent T();

    public int U();

    public void V(int var1);

    public int X();

    public void Y(String var1, Bundle var2);

    public boolean Y0(KeyEvent var1);

    public boolean b0();

    public String e();

    public PlaybackStateCompat f();

    public void g();

    public void i(int var1);

    public void j();

    public void j0(String var1, Bundle var2, MediaSessionCompat.ResultReceiverWrapper var3);

    public void k(boolean var1);

    public List k0();

    public void next();

    public void o0();

    public void p();

    public CharSequence p0();

    public void previous();

    public int q();

    public Bundle r();

    public MediaMetadataCompat r0();

    public void s(int var1);

    public void s0(String var1, Bundle var2);

    public void stop();

    public Bundle t0();

    public void u(float var1);

    public void u0(android.support.v4.media.session.a var1);

    public void v0(String var1, Bundle var2);

    public long w0();

    public void y(String var1, Bundle var2);

    public void y0(long var1);

    public void z(int var1, int var2, String var3);

    public void z0(boolean var1);

    public static abstract class android.support.v4.media.session.b$a
    extends Binder
    implements b {
        public android.support.v4.media.session.b$a() {
            this.attachInterface((IInterface)this, "android.support.v4.media.session.IMediaSession");
        }

        public static b n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (iInterface != null && iInterface instanceof b) {
                return (b)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public static class a
        implements b {
            public IBinder b;

            public a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override
            public void A(android.support.v4.media.session.a a8) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel.writeStrongInterface((IInterface)a8);
                    this.b.transact(3, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public PendingIntent T() {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.b.transact(8, parcel, parcel2, 0);
                    parcel2.readException();
                    PendingIntent pendingIntent = (PendingIntent)b.d(parcel2, PendingIntent.CREATOR);
                    return pendingIntent;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public boolean Y0(KeyEvent keyEvent) {
                Parcel parcel;
                boolean bl;
                Parcel parcel2;
                block3 : {
                    parcel = Parcel.obtain();
                    parcel2 = Parcel.obtain();
                    try {
                        parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                        bl = false;
                    }
                    catch (Throwable throwable) {
                        parcel2.recycle();
                        parcel.recycle();
                        throw throwable;
                    }
                    b.f(parcel, (Parcelable)keyEvent, 0);
                    this.b.transact(2, parcel, parcel2, 0);
                    parcel2.readException();
                    int n8 = parcel2.readInt();
                    if (n8 == 0) break block3;
                    bl = true;
                }
                parcel2.recycle();
                parcel.recycle();
                return bl;
            }

            public IBinder asBinder() {
                return this.b;
            }

            @Override
            public void u0(android.support.v4.media.session.a a8) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcel.writeStrongInterface((IInterface)a8);
                    this.b.transact(4, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }
        }

    }

    public static abstract class b {
        public static /* synthetic */ void c(Parcel parcel, List list, int n8) {
            b.e(parcel, list, n8);
        }

        public static Object d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void e(Parcel parcel, List list, int n8) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int n9 = list.size();
            parcel.writeInt(n9);
            for (int i8 = 0; i8 < n9; ++i8) {
                b.f(parcel, (Parcelable)list.get(i8), n8);
            }
        }

        public static void f(Parcel parcel, Parcelable parcelable, int n8) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, n8);
                return;
            }
            parcel.writeInt(0);
        }
    }

}

