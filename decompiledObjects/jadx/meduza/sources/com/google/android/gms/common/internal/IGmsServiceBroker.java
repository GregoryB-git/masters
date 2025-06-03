package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public interface IGmsServiceBroker extends IInterface {

    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
        
            if (r5.readInt() != 0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e3, code lost:
        
            r4 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
        
            if (r5.readInt() != 0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ca, code lost:
        
            if (r5.readInt() != 0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
        
            if (r5.readInt() != 0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00e1, code lost:
        
            if (r5.readInt() != 0) goto L69;
         */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                Method dump skipped, instructions count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.IGmsServiceBroker.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void D(m6.e eVar, b bVar);
}
