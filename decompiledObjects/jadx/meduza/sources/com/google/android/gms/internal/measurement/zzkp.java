package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzkp extends IOException {
    public zzkp(String str) {
        super(str);
    }

    public static zzko zza() {
        return new zzko("Protocol message tag had invalid wire type.");
    }

    public static zzkp zzb() {
        return new zzkp("Protocol message end-group tag did not match expected tag.");
    }

    public static zzkp zzc() {
        return new zzkp("Protocol message contained an invalid tag (zero).");
    }

    public static zzkp zzd() {
        return new zzkp("Protocol message had invalid UTF-8.");
    }

    public static zzkp zze() {
        return new zzkp("CodedInputStream encountered a malformed varint.");
    }

    public static zzkp zzf() {
        return new zzkp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzkp zzg() {
        return new zzkp("Failed to parse the message.");
    }

    public static zzkp zzh() {
        return new zzkp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static zzkp zzi() {
        return new zzkp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
