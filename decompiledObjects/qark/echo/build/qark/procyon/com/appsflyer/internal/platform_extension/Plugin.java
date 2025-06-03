// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal.platform_extension;

import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public enum Plugin
{
    ADOBE_AIR("android_adobe_air"), 
    ADOBE_MOBILE("android_adobe_mobile"), 
    CAPACITOR("android_capacitor"), 
    COCOS_2DX("android_cocos2dx"), 
    CORDOVA("android_cordova"), 
    EXPO("android_expo"), 
    FLUTTER("android_flutter"), 
    MPARTICLE("android_mparticle"), 
    NATIVE("android_native"), 
    NATIVE_SCRIPT("android_native_script"), 
    REACT_NATIVE("android_react_native"), 
    SEGMENT("android_segment"), 
    UNITY("android_unity"), 
    UNREAL("android_unreal"), 
    XAMARIN("android_xamarin");
    
    @NotNull
    private final String AFKeystoreWrapper;
    
    private Plugin(final String afKeystoreWrapper) {
        this.AFKeystoreWrapper = afKeystoreWrapper;
    }
    
    @NotNull
    public final String getPluginName() {
        return this.AFKeystoreWrapper;
    }
}
