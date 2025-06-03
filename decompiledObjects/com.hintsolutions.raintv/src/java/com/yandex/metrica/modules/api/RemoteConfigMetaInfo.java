/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.modules.api;

public final class RemoteConfigMetaInfo {
    private final long a;
    private final long b;

    public RemoteConfigMetaInfo(long l8, long l9) {
        this.a = l8;
        this.b = l9;
    }

    public static /* synthetic */ RemoteConfigMetaInfo copy$default(RemoteConfigMetaInfo remoteConfigMetaInfo, long l8, long l9, int n7, Object object) {
        if ((n7 & 1) != 0) {
            l8 = remoteConfigMetaInfo.a;
        }
        if ((n7 & 2) != 0) {
            l9 = remoteConfigMetaInfo.b;
        }
        return remoteConfigMetaInfo.copy(l8, l9);
    }

    public final long component1() {
        return this.a;
    }

    public final long component2() {
        return this.b;
    }

    public final RemoteConfigMetaInfo copy(long l8, long l9) {
        return new RemoteConfigMetaInfo(l8, l9);
    }

    public boolean equals(Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof RemoteConfigMetaInfo)) break block3;
                object = (RemoteConfigMetaInfo)object;
                if (this.a == ((RemoteConfigMetaInfo)object).a && this.b == ((RemoteConfigMetaInfo)object).b) break block2;
            }
            return false;
        }
        return true;
    }

    public final long getFirstSendTime() {
        return this.a;
    }

    public final long getLastUpdateTime() {
        return this.b;
    }

    public int hashCode() {
        long l8 = this.a;
        int n7 = (int)(l8 ^ l8 >>> 32);
        l8 = this.b;
        return n7 * 31 + (int)(l8 >>> 32 ^ l8);
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("RemoteConfigMetaInfo(firstSendTime=");
        stringBuilder.append(this.a);
        stringBuilder.append(", lastUpdateTime=");
        return z2.r(stringBuilder, this.b, ")");
    }
}

