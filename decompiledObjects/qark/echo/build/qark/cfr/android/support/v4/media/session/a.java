/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public interface a
extends IInterface {
    public void C();

    public void E(MediaMetadataCompat var1);

    public void J0(boolean var1);

    public void Q0(PlaybackStateCompat var1);

    public void X0(ParcelableVolumeInfo var1);

    public void d0(int var1);

    public void f0();

    public void g0(Bundle var1);

    public void l0(List var1);

    public void m(int var1);

    public void t(String var1, Bundle var2);

    public void w(boolean var1);

    public void x(CharSequence var1);

    public static abstract class android.support.v4.media.session.a$a
    extends Binder
    implements android.support.v4.media.session.a {
        public android.support.v4.media.session.a$a() {
            this.attachInterface((IInterface)this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static android.support.v4.media.session.a n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (iInterface != null && iInterface instanceof android.support.v4.media.session.a) {
                return (android.support.v4.media.session.a)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n8, Parcel parcel, Parcel parcel2, int n9) {
            if (n8 >= 1 && n8 <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (n8 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            boolean bl = false;
            boolean bl2 = false;
            switch (n8) {
                default: {
                    return super.onTransact(n8, parcel, parcel2, n9);
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
                        bl2 = true;
                    }
                    this.J0(bl2);
                    return true;
                }
                case 10: {
                    bl2 = bl;
                    if (parcel.readInt() != 0) {
                        bl2 = true;
                    }
                    this.w(bl2);
                    return true;
                }
                case 9: {
                    this.m(parcel.readInt());
                    return true;
                }
                case 8: {
                    this.X0((ParcelableVolumeInfo)b.d(parcel, ParcelableVolumeInfo.CREATOR));
                    return true;
                }
                case 7: {
                    this.g0((Bundle)b.d(parcel, Bundle.CREATOR));
                    return true;
                }
                case 6: {
                    this.x((CharSequence)b.d(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                }
                case 5: {
                    this.l0((List)parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                }
                case 4: {
                    this.E((MediaMetadataCompat)b.d(parcel, MediaMetadataCompat.CREATOR));
                    return true;
                }
                case 3: {
                    this.Q0((PlaybackStateCompat)b.d(parcel, PlaybackStateCompat.CREATOR));
                    return true;
                }
                case 2: {
                    this.C();
                    return true;
                }
                case 1: 
            }
            this.t(parcel.readString(), (Bundle)b.d(parcel, Bundle.CREATOR));
            return true;
        }

        public static class a
        implements android.support.v4.media.session.a {
            public IBinder b;

            public a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override
            public void C() {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.b.transact(2, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void E(MediaMetadataCompat mediaMetadataCompat) {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.f(parcel, mediaMetadataCompat, 0);
                    this.b.transact(4, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void J0(boolean bl) {
                RuntimeException runtimeException;
                super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
                throw runtimeException;
            }

            @Override
            public void Q0(PlaybackStateCompat playbackStateCompat) {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.f(parcel, playbackStateCompat, 0);
                    this.b.transact(3, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void X0(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.f(parcel, parcelableVolumeInfo, 0);
                    this.b.transact(8, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            public IBinder asBinder() {
                return this.b;
            }

            @Override
            public void d0(int n8) {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.writeInt(n8);
                    this.b.transact(12, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void l0(List list) {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    b.e(parcel, list, 0);
                    this.b.transact(5, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }

            @Override
            public void m(int n8) {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.writeInt(n8);
                    this.b.transact(9, parcel, null, 1);
                    return;
                }
                finally {
                    parcel.recycle();
                }
            }
        }

    }

    public static abstract class b {
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

