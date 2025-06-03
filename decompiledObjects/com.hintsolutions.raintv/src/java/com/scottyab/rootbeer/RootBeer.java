/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  java.io.BufferedReader
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Process
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsatisfiedLinkError
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.List
 *  java.util.NoSuchElementException
 *  java.util.Scanner
 */
package com.scottyab.rootbeer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.scottyab.rootbeer.Const;
import com.scottyab.rootbeer.RootBeerNative;
import com.scottyab.rootbeer.util.QLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class RootBeer {
    private boolean loggingEnabled = true;
    private final Context mContext;

    public RootBeer(Context context) {
        this.mContext = context;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isAnyPackageFromListInstalled(List<String> iterator) {
        PackageManager packageManager = this.mContext.getPackageManager();
        iterator = iterator.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            try {
                packageManager.getPackageInfo(string2, 0);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(" ROOT management app detected!");
                QLog.e(stringBuilder.toString());
                bl = true;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private String[] mountReader() {
        void var1_4;
        String[] stringArray;
        block4: {
            stringArray = Runtime.getRuntime().exec("mount").getInputStream();
            if (stringArray != null) break block4;
            return null;
        }
        try {
            Scanner scanner = new Scanner((InputStream)stringArray);
            stringArray = scanner.useDelimiter("\\A").next().split("\n");
            return stringArray;
        }
        catch (NoSuchElementException noSuchElementException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        QLog.e((Exception)var1_4);
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private String[] propsReader() {
        void var1_5;
        InputStream inputStream;
        block4: {
            inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputStream != null) break block4;
            return null;
        }
        try {
            String[] stringArray = new Scanner(inputStream);
            stringArray = stringArray.useDelimiter("\\A").next().split("\n");
            return stringArray;
        }
        catch (NoSuchElementException noSuchElementException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        QLog.e((Exception)var1_5);
        return null;
    }

    public boolean canLoadNativeLibrary() {
        return new RootBeerNative().wasNativeLibraryLoaded();
    }

    public boolean checkForBinary(String string2) {
        String[] stringArray = Const.getPaths();
        int n = stringArray.length;
        boolean bl = false;
        for (int i = 0; i < n; ++i) {
            String string3 = stringArray[i];
            String string4 = z2.o(string3, string2);
            if (!new File(string3, string2).exists()) continue;
            string3 = new StringBuilder();
            string3.append(string4);
            string3.append(" binary detected!");
            QLog.v(string3.toString());
            bl = true;
        }
        return bl;
    }

    public boolean checkForBusyBoxBinary() {
        return this.checkForBinary("busybox");
    }

    public boolean checkForDangerousProps() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"ro.debuggable", (Object)"1");
        hashMap.put((Object)"ro.secure", (Object)"0");
        String[] stringArray = this.propsReader();
        if (stringArray == null) {
            return false;
        }
        int n = stringArray.length;
        boolean bl = false;
        for (int i = 0; i < n; ++i) {
            String string2 = stringArray[i];
            for (String string3 : hashMap.keySet()) {
                String string4;
                if (!string2.contains((CharSequence)string3) || !string2.contains((CharSequence)(string4 = z2.p("[", (String)hashMap.get((Object)string3), "]")))) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(" = ");
                stringBuilder.append(string4);
                stringBuilder.append(" detected!");
                QLog.v(stringBuilder.toString());
                bl = true;
            }
        }
        return bl;
    }

    public boolean checkForMagiskBinary() {
        return this.checkForBinary("magisk");
    }

    public boolean checkForNativeLibraryReadAccess() {
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.loggingEnabled);
            return true;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            return false;
        }
    }

    public boolean checkForRWPaths() {
        String[] stringArray = this.mountReader();
        if (stringArray == null) {
            return false;
        }
        int n = stringArray.length;
        boolean bl = false;
        for (int i = 0; i < n; ++i) {
            boolean bl2;
            String string2 = stringArray[i];
            StringBuilder stringBuilder = string2.split(" ");
            if (((String[])stringBuilder).length < 6) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error formatting mount line: ");
                stringBuilder.append(string2);
                QLog.e(stringBuilder.toString());
                bl2 = bl;
            } else {
                String string3 = stringBuilder[2];
                Object object = stringBuilder[5];
                String[] stringArray2 = Const.pathsThatShouldNotBeWritable;
                int n2 = stringArray2.length;
                int n3 = 0;
                while (true) {
                    bl2 = bl;
                    if (n3 >= n2) break;
                    String string4 = stringArray2[n3];
                    bl2 = bl;
                    stringBuilder = object;
                    if (string3.equalsIgnoreCase(string4)) {
                        object = object.replace((CharSequence)"(", (CharSequence)"").replace((CharSequence)")", (CharSequence)"");
                        String[] stringArray3 = object.split(",");
                        int n4 = stringArray3.length;
                        int n5 = 0;
                        while (true) {
                            bl2 = bl;
                            stringBuilder = object;
                            if (n5 >= n4) break;
                            if (stringArray3[n5].equalsIgnoreCase("rw")) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(string4);
                                stringBuilder.append(" path is mounted with rw permissions! ");
                                stringBuilder.append(string2);
                                QLog.v(stringBuilder.toString());
                                bl2 = true;
                                stringBuilder = object;
                                break;
                            }
                            ++n5;
                        }
                    }
                    ++n3;
                    bl = bl2;
                    object = stringBuilder;
                }
            }
            bl = bl2;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean checkForRootNative() {
        int n;
        boolean bl = this.canLoadNativeLibrary();
        boolean bl2 = false;
        if (!bl) {
            QLog.e("We could not load the native library to test for root");
            return false;
        }
        Object object = Const.getPaths();
        int n2 = ((String[])object).length;
        Object[] objectArray = new String[n2];
        for (n = 0; n < n2; ++n) {
            objectArray[n] = z2.s(new StringBuilder(), object[n], "su");
        }
        object = new RootBeerNative();
        try {
            ((RootBeerNative)object).setLogDebugMessages(this.loggingEnabled);
            n = ((RootBeerNative)object).checkForRoot(objectArray);
            if (n <= 0) return bl2;
            return true;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            return bl2;
        }
    }

    public boolean checkForSuBinary() {
        return this.checkForBinary("su");
    }

    public boolean checkSuExists() {
        Process process;
        boolean bl;
        block8: {
            bl = false;
            Process process2 = null;
            try {
                process2 = process = Runtime.getRuntime().exec(new String[]{"which", "su"});
                process2 = process;
                process2 = process;
            }
            catch (Throwable throwable) {
                if (process2 != null) {
                    process2.destroy();
                }
                return false;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
            process2 = process;
            Object object = new BufferedReader((Reader)inputStreamReader);
            process2 = process;
            object = object.readLine();
            if (object == null) break block8;
            bl = true;
        }
        process.destroy();
        return bl;
    }

    public boolean detectPotentiallyDangerousApps() {
        return this.detectPotentiallyDangerousApps(null);
    }

    public boolean detectPotentiallyDangerousApps(String[] stringArray) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((Collection)Arrays.asList((Object[])Const.knownDangerousAppsPackages));
        if (stringArray != null && stringArray.length > 0) {
            arrayList.addAll((Collection)Arrays.asList((Object[])stringArray));
        }
        return this.isAnyPackageFromListInstalled((List<String>)arrayList);
    }

    public boolean detectRootCloakingApps() {
        boolean bl = this.detectRootCloakingApps(null) || this.canLoadNativeLibrary() && !this.checkForNativeLibraryReadAccess();
        return bl;
    }

    public boolean detectRootCloakingApps(String[] stringArray) {
        ArrayList arrayList = new ArrayList((Collection)Arrays.asList((Object[])Const.knownRootCloakingPackages));
        if (stringArray != null && stringArray.length > 0) {
            arrayList.addAll((Collection)Arrays.asList((Object[])stringArray));
        }
        return this.isAnyPackageFromListInstalled((List<String>)arrayList);
    }

    public boolean detectRootManagementApps() {
        return this.detectRootManagementApps(null);
    }

    public boolean detectRootManagementApps(String[] stringArray) {
        ArrayList arrayList = new ArrayList((Collection)Arrays.asList((Object[])Const.knownRootAppsPackages));
        if (stringArray != null && stringArray.length > 0) {
            arrayList.addAll((Collection)Arrays.asList((Object[])stringArray));
        }
        return this.isAnyPackageFromListInstalled((List<String>)arrayList);
    }

    public boolean detectTestKeys() {
        String string2 = Build.TAGS;
        boolean bl = string2 != null && string2.contains((CharSequence)"test-keys");
        return bl;
    }

    public boolean isRooted() {
        boolean bl = this.detectRootManagementApps() || this.detectPotentiallyDangerousApps() || this.checkForBinary("su") || this.checkForDangerousProps() || this.checkForRWPaths() || this.detectTestKeys() || this.checkSuExists() || this.checkForRootNative() || this.checkForMagiskBinary();
        return bl;
    }

    public boolean isRootedWithBusyBoxCheck() {
        boolean bl = this.detectRootManagementApps() || this.detectPotentiallyDangerousApps() || this.checkForBinary("su") || this.checkForBinary("busybox") || this.checkForDangerousProps() || this.checkForRWPaths() || this.detectTestKeys() || this.checkSuExists() || this.checkForRootNative() || this.checkForMagiskBinary();
        return bl;
    }

    @Deprecated
    public boolean isRootedWithoutBusyBoxCheck() {
        return this.isRooted();
    }

    public void setLogging(boolean bl) {
        this.loggingEnabled = bl;
        int n = bl ? 5 : 0;
        QLog.LOGGING_LEVEL = n;
    }
}

