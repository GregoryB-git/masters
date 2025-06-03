/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.hardware.Camera
 *  android.hardware.Camera$CameraInfo
 *  android.hardware.Camera$Size
 *  android.os.Environment
 *  android.util.Log
 *  java.io.File
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 */
package com.hintsolutions.raintv.utils;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CameraHelper {
    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;

    public static Camera getDefaultBackFacingCameraInstance() {
        return CameraHelper.getDefaultCamera(0);
    }

    @TargetApi(value=9)
    private static Camera getDefaultCamera(int n) {
        int n2 = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int j = 0; j < n2; ++j) {
            Camera.getCameraInfo((int)j, (Camera.CameraInfo)cameraInfo);
            if (cameraInfo.facing != n) continue;
            return Camera.open((int)j);
        }
        return null;
    }

    public static Camera getDefaultCameraInstance() {
        return Camera.open();
    }

    public static Camera getDefaultFrontFacingCameraInstance() {
        return CameraHelper.getDefaultCamera(1);
    }

    public static Camera.Size getOptimalVideoSize(List<Camera.Size> size, List<Camera.Size> list, int n, int n2) {
        Camera.Size size2;
        double d2 = (double)n / (double)n2;
        Object object = size != null ? size : list;
        size = null;
        Iterator iterator = object.iterator();
        double d6 = Double.MAX_VALUE;
        double d7 = Double.MAX_VALUE;
        while (iterator.hasNext()) {
            size2 = (Camera.Size)iterator.next();
            if (Math.abs((double)((double)size2.width / (double)size2.height - d2)) > 0.1 || !((double)Math.abs((int)(size2.height - n2)) < d7) || !list.contains((Object)size2)) continue;
            d7 = Math.abs((int)(size2.height - n2));
            size = size2;
        }
        size2 = size;
        if (size == null) {
            iterator = object.iterator();
            d7 = d6;
            while (true) {
                size2 = size;
                if (!iterator.hasNext()) break;
                object = (Camera.Size)iterator.next();
                if (!((double)Math.abs((int)(object.height - n2)) < d7) || !list.contains(object)) continue;
                d7 = Math.abs((int)(object.height - n2));
                size = object;
            }
        }
        return size2;
    }

    public static File getOutputMediaFile(int n) {
        block7: {
            String string2;
            block6: {
                File file;
                block5: {
                    if (!Environment.getExternalStorageState().equalsIgnoreCase("mounted")) {
                        return null;
                    }
                    file = new File(Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_PICTURES), "tvrain");
                    if (!file.exists() && !file.mkdirs()) {
                        Log.d((String)"tvrain", (String)"failed to create directory");
                        return null;
                    }
                    string2 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                    if (n != 1) break block5;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(file.getPath());
                    stringBuilder.append(File.separator);
                    stringBuilder.append("IMG_");
                    stringBuilder.append(string2);
                    stringBuilder.append(".jpg");
                    string2 = new File(stringBuilder.toString());
                    break block6;
                }
                if (n != 2) break block7;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(file.getPath());
                stringBuilder.append(File.separator);
                stringBuilder.append("VID_");
                stringBuilder.append(string2);
                stringBuilder.append(".mp4");
                string2 = new File(stringBuilder.toString());
            }
            return string2;
        }
        return null;
    }
}

