package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

import android.content.Context;
import androidx.webkit.ProcessGlobalConfig;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import d2.i0;
import defpackage.g;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import x6.b;

/* loaded from: classes.dex */
public class ProcessGlobalConfigSettings implements ISettings<ProcessGlobalConfig> {
    public static final String LOG_TAG = "ProcessGlobalConfigSettings";
    public String dataDirectorySuffix;
    public DirectoryBasePaths directoryBasePaths;

    public static class DirectoryBasePaths implements ISettings<Object> {
        public static final String LOG_TAG = "ProcessGlobalConfigSettings";
        public String cacheDirectoryBasePath;
        public String dataDirectoryBasePath;

        @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
        public Map<String, Object> getRealSettings(Object obj) {
            return toMap();
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
        public /* bridge */ /* synthetic */ ISettings<Object> parse(Map map) {
            return parse2((Map<String, Object>) map);
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
        /* renamed from: parse, reason: avoid collision after fix types in other method */
        public ISettings<Object> parse2(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    key.getClass();
                    if (key.equals("dataDirectoryBasePath")) {
                        this.dataDirectoryBasePath = (String) value;
                    } else if (key.equals("cacheDirectoryBasePath")) {
                        this.cacheDirectoryBasePath = (String) value;
                    }
                }
            }
            return this;
        }

        @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
        public Map<String, Object> toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("cacheDirectoryBasePath", this.cacheDirectoryBasePath);
            hashMap.put("dataDirectoryBasePath", this.dataDirectoryBasePath);
            return hashMap;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> getRealSettings(ProcessGlobalConfig processGlobalConfig) {
        return toMap();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public /* bridge */ /* synthetic */ ISettings<ProcessGlobalConfig> parse(Map map) {
        return parse2((Map<String, Object>) map);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigSettings$DirectoryBasePaths] */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    /* renamed from: parse, reason: avoid collision after fix types in other method */
    public ISettings<ProcessGlobalConfig> parse2(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.getClass();
                if (key.equals("dataDirectorySuffix")) {
                    this.dataDirectorySuffix = (String) value;
                } else if (key.equals("directoryBasePaths")) {
                    this.directoryBasePaths = new DirectoryBasePaths().parse2((Map<String, Object>) value);
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("dataDirectorySuffix", this.dataDirectorySuffix);
        return hashMap;
    }

    public ProcessGlobalConfig toProcessGlobalConfig(Context context) {
        ProcessGlobalConfig processGlobalConfig = new ProcessGlobalConfig();
        if (this.dataDirectorySuffix != null && b.e0(context, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX")) {
            String str = this.dataDirectorySuffix;
            if (!i0.A.a(context)) {
                throw i0.a();
            }
            if (str.equals("")) {
                throw new IllegalArgumentException("Suffix cannot be an empty string");
            }
            if (str.indexOf(File.separatorChar) >= 0) {
                throw new IllegalArgumentException(g.e("Suffix ", str, " contains a path separator"));
            }
            processGlobalConfig.f1397a = str;
        }
        if (this.directoryBasePaths != null && b.e0(context, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS")) {
            File file = new File(this.directoryBasePaths.dataDirectoryBasePath);
            File file2 = new File(this.directoryBasePaths.cacheDirectoryBasePath);
            if (!i0.B.a(context)) {
                throw i0.a();
            }
            if (!file.isAbsolute()) {
                throw new IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
            }
            if (!file2.isAbsolute()) {
                throw new IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
            }
            processGlobalConfig.f1398b = file.getAbsolutePath();
            processGlobalConfig.f1399c = file2.getAbsolutePath();
        }
        return processGlobalConfig;
    }
}
