/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobWorkItem
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.PackageManager
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorSpace
 *  android.graphics.ColorSpace$Model
 *  android.graphics.RectF
 *  android.graphics.drawable.Icon
 *  android.location.GnssStatus
 *  android.location.Location
 *  android.os.Handler
 *  android.os.StrictMode$ThreadPolicy$Builder
 *  java.lang.Object
 *  java.lang.String
 *  java.time.Instant
 *  java.util.Date
 *  java.util.regex.Matcher
 */
import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.location.GnssStatus;
import android.location.Location;
import android.os.Handler;
import android.os.StrictMode;
import java.time.Instant;
import java.util.Date;
import java.util.regex.Matcher;

public final class f0 {
    public static /* bridge */ /* synthetic */ float A(Location location) {
        return location.getBearingAccuracyDegrees();
    }

    public static /* bridge */ /* synthetic */ int B(Matcher matcher, String string2) {
        return matcher.end(string2);
    }

    public static /* bridge */ /* synthetic */ void C(Location location, float f2) {
        location.setVerticalAccuracyMeters(f2);
    }

    public static /* bridge */ /* synthetic */ boolean D(Location location) {
        return location.hasBearingAccuracy();
    }

    public static /* bridge */ /* synthetic */ float a(long l) {
        return Color.alpha((long)l);
    }

    public static /* bridge */ /* synthetic */ float b(Color color2) {
        return color2.alpha();
    }

    public static /* bridge */ /* synthetic */ float c(GnssStatus gnssStatus, int n) {
        return gnssStatus.getCarrierFrequencyHz(n);
    }

    public static /* bridge */ /* synthetic */ float d(Location location) {
        return location.getSpeedAccuracyMetersPerSecond();
    }

    public static /* bridge */ /* synthetic */ int e(Color color2) {
        return color2.getComponentCount();
    }

    public static /* bridge */ /* synthetic */ int f(Matcher matcher, String string2) {
        return matcher.start(string2);
    }

    public static /* bridge */ /* synthetic */ long g(int n) {
        return Color.pack((int)n);
    }

    public static /* bridge */ /* synthetic */ long h(long l, ColorSpace colorSpace) {
        return Color.convert((long)l, (ColorSpace)colorSpace);
    }

    public static /* bridge */ /* synthetic */ ComponentName i(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }

    public static /* bridge */ /* synthetic */ Intent j(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String string2, Handler handler, int n) {
        return context.registerReceiver(broadcastReceiver, intentFilter, string2, handler, n);
    }

    public static /* bridge */ /* synthetic */ Color k(long l) {
        return Color.valueOf((long)l);
    }

    public static /* bridge */ /* synthetic */ Color l(float[] fArray, ColorSpace colorSpace) {
        return Color.valueOf((float[])fArray, (ColorSpace)colorSpace);
    }

    public static /* bridge */ /* synthetic */ ColorSpace.Model m(Color color2) {
        return color2.getModel();
    }

    public static /* bridge */ /* synthetic */ ColorSpace n(Color color2) {
        return color2.getColorSpace();
    }

    public static /* bridge */ /* synthetic */ Icon o(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap((Bitmap)bitmap);
    }

    public static /* bridge */ /* synthetic */ String p(Matcher matcher, String string2) {
        return matcher.group(string2);
    }

    public static /* bridge */ /* synthetic */ Instant q(Date date) {
        return date.toInstant();
    }

    public static /* bridge */ /* synthetic */ void r(JobParameters jobParameters, JobWorkItem jobWorkItem) {
        jobParameters.completeWork(jobWorkItem);
    }

    public static /* bridge */ /* synthetic */ void s(Canvas canvas, RectF rectF) {
        canvas.clipOutRect(rectF);
    }

    public static /* bridge */ /* synthetic */ void t(Location location, float f2) {
        location.setSpeedAccuracyMetersPerSecond(f2);
    }

    public static /* bridge */ /* synthetic */ void u(StrictMode.ThreadPolicy.Builder builder) {
        builder.detectUnbufferedIo();
    }

    public static /* bridge */ /* synthetic */ boolean v(long l) {
        return Color.isSrgb((long)l);
    }

    public static /* bridge */ /* synthetic */ boolean w(PackageManager packageManager) {
        return packageManager.isInstantApp();
    }

    public static /* bridge */ /* synthetic */ boolean x(GnssStatus gnssStatus, int n) {
        return gnssStatus.hasCarrierFrequencyHz(n);
    }

    public static /* bridge */ /* synthetic */ boolean y(Location location) {
        return location.hasVerticalAccuracy();
    }

    public static /* bridge */ /* synthetic */ float[] z(Color color2) {
        return color2.getComponents();
    }
}

