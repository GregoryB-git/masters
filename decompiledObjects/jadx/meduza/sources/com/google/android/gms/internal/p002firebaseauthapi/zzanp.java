package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import defpackage.f;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class zzanp {
    private static final ThreadLocal<SimpleDateFormat> zza;

    static {
        zza = new zzano();
        zzc("now");
        zzc("getEpochSecond");
        zzc("getNano");
    }

    public static long zza(zzamt zzamtVar) {
        return zzb(zzamtVar).zzb();
    }

    public static zzamt zza(String str) {
        String str2;
        int i10;
        int indexOf = str.indexOf(84);
        if (indexOf == -1) {
            throw new ParseException(j.j("Failed to parse timestamp: invalid timestamp \"", str, "\""), 0);
        }
        int indexOf2 = str.indexOf(90, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(43, indexOf);
        }
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(45, indexOf);
        }
        if (indexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String substring = str.substring(0, indexOf2);
        int indexOf3 = substring.indexOf(46);
        if (indexOf3 != -1) {
            String substring2 = substring.substring(0, indexOf3);
            str2 = substring.substring(indexOf3 + 1);
            substring = substring2;
        } else {
            str2 = "";
        }
        long time = zza.get().parse(substring).getTime() / 1000;
        if (str2.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 0;
            for (int i11 = 0; i11 < 9; i11++) {
                i10 *= 10;
                if (i11 < str2.length()) {
                    if (str2.charAt(i11) < '0' || str2.charAt(i11) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    i10 = (str2.charAt(i11) - '0') + i10;
                }
            }
        }
        if (str.charAt(indexOf2) != 'Z') {
            long zzb = zzb(str.substring(indexOf2 + 1));
            time = str.charAt(indexOf2) == '+' ? time - zzb : time + zzb;
        } else if (str.length() != indexOf2 + 1) {
            throw new ParseException(j.j("Failed to parse timestamp: invalid trailing data \"", str.substring(indexOf2), "\""), 0);
        }
        try {
            if (!zza(time)) {
                throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(time)));
            }
            if (i10 <= -1000000000 || i10 >= 1000000000) {
                time = zzbc.zza(time, i10 / 1000000000);
                i10 %= 1000000000;
            }
            if (i10 < 0) {
                i10 += 1000000000;
                time = zzbc.zzb(time, 1L);
            }
            return zzb((zzamt) ((zzakg) zzamt.zzc().zza(time).zza(i10).zze()));
        } catch (IllegalArgumentException e10) {
            ParseException parseException = new ParseException(j.j("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
            parseException.initCause(e10);
            throw parseException;
        }
    }

    public static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }

    private static boolean zza(long j10) {
        return j10 >= -62135596800L && j10 <= 253402300799L;
    }

    private static long zzb(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            throw new ParseException(f.j("Invalid offset value: ", str), 0);
        }
        try {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        } catch (NumberFormatException e10) {
            ParseException parseException = new ParseException(f.j("Invalid offset value: ", str), 0);
            parseException.initCause(e10);
            throw parseException;
        }
    }

    private static zzamt zzb(zzamt zzamtVar) {
        long zzb = zzamtVar.zzb();
        int zza2 = zzamtVar.zza();
        if (zza(zzb) && zza2 >= 0 && zza2 < 1000000000) {
            return zzamtVar;
        }
        throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzb), Integer.valueOf(zza2)));
    }

    private static Method zzc(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
