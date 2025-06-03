/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal.platform_extension;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class Plugin
extends Enum<Plugin> {
    public static final /* enum */ Plugin ADOBE_AIR;
    public static final /* enum */ Plugin ADOBE_MOBILE;
    private static final /* synthetic */ Plugin[] AFInAppEventParameterName;
    public static final /* enum */ Plugin CAPACITOR;
    public static final /* enum */ Plugin COCOS_2DX;
    public static final /* enum */ Plugin CORDOVA;
    public static final /* enum */ Plugin EXPO;
    public static final /* enum */ Plugin FLUTTER;
    public static final /* enum */ Plugin MPARTICLE;
    public static final /* enum */ Plugin NATIVE;
    public static final /* enum */ Plugin NATIVE_SCRIPT;
    public static final /* enum */ Plugin REACT_NATIVE;
    public static final /* enum */ Plugin SEGMENT;
    public static final /* enum */ Plugin UNITY;
    public static final /* enum */ Plugin UNREAL;
    public static final /* enum */ Plugin XAMARIN;
    @NotNull
    private final String AFKeystoreWrapper;

    static {
        Plugin plugin;
        Plugin plugin2;
        Plugin plugin3;
        Plugin plugin4;
        Plugin plugin5;
        Plugin plugin6;
        Plugin plugin7;
        Plugin plugin8;
        Plugin plugin9;
        Plugin plugin10;
        Plugin plugin11;
        Plugin plugin12;
        Plugin plugin13;
        Plugin plugin14;
        Plugin plugin15;
        NATIVE = plugin12 = new Plugin("android_native");
        UNITY = plugin9 = new Plugin("android_unity");
        FLUTTER = plugin = new Plugin("android_flutter");
        REACT_NATIVE = plugin13 = new Plugin("android_react_native");
        ADOBE_AIR = plugin6 = new Plugin("android_adobe_air");
        ADOBE_MOBILE = plugin4 = new Plugin("android_adobe_mobile");
        COCOS_2DX = plugin11 = new Plugin("android_cocos2dx");
        CORDOVA = plugin8 = new Plugin("android_cordova");
        MPARTICLE = plugin7 = new Plugin("android_mparticle");
        NATIVE_SCRIPT = plugin15 = new Plugin("android_native_script");
        EXPO = plugin5 = new Plugin("android_expo");
        UNREAL = plugin10 = new Plugin("android_unreal");
        XAMARIN = plugin14 = new Plugin("android_xamarin");
        CAPACITOR = plugin2 = new Plugin("android_capacitor");
        SEGMENT = plugin3 = new Plugin("android_segment");
        AFInAppEventParameterName = new Plugin[]{plugin12, plugin9, plugin, plugin13, plugin6, plugin4, plugin11, plugin8, plugin7, plugin15, plugin5, plugin10, plugin14, plugin2, plugin3};
    }

    private Plugin(String string3) {
        this.AFKeystoreWrapper = string3;
    }

    public static Plugin valueOf(String string2) {
        return (Plugin)Enum.valueOf(Plugin.class, (String)string2);
    }

    public static Plugin[] values() {
        return (Plugin[])AFInAppEventParameterName.clone();
    }

    @NotNull
    public final String getPluginName() {
        return this.AFKeystoreWrapper;
    }
}

