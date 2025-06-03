// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer;

public class AFVersionDeclaration
{
    private static String googleSdkIdentifier;
    
    private AFVersionDeclaration() {
    }
    
    public static void init() {
        AFVersionDeclaration.googleSdkIdentifier = "!SDK-VERSION-STRING!:com.appsflyer:af-android-sdk:6.12.2";
    }
}
