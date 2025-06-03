package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import c2.b;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ProxySettings implements ISettings<b> {
    public List<String> bypassRules = new ArrayList();
    public List<String> directs = new ArrayList();
    public List<ProxyRuleExt> proxyRules = new ArrayList();
    public Boolean bypassSimpleHostnames = null;
    public Boolean removeImplicitRules = null;
    public Boolean reverseBypassEnabled = Boolean.FALSE;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> getRealSettings(b bVar) {
        Map<String, Object> map = toMap();
        ArrayList arrayList = new ArrayList();
        bVar.getClass();
        for (b.a aVar : Collections.unmodifiableList(null)) {
            HashMap hashMap = new HashMap();
            hashMap.put(WebViewActivity.URL_EXTRA, aVar.f2214b);
            hashMap.put("schemeFilter", aVar.f2213a);
            arrayList.add(hashMap);
        }
        bVar.getClass();
        map.put("bypassRules", Collections.unmodifiableList(null));
        map.put("proxyRules", arrayList);
        bVar.getClass();
        map.put("reverseBypassEnabled", false);
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public /* bridge */ /* synthetic */ ISettings<b> parse(Map map) {
        return parse2((Map<String, Object>) map);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    /* renamed from: parse, reason: avoid collision after fix types in other method */
    public ISettings<b> parse2(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.getClass();
                switch (key) {
                    case "bypassSimpleHostnames":
                        this.bypassSimpleHostnames = (Boolean) value;
                        break;
                    case "proxyRules":
                        this.proxyRules = new ArrayList();
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            ProxyRuleExt fromMap = ProxyRuleExt.fromMap((Map) it.next());
                            if (fromMap != null) {
                                this.proxyRules.add(fromMap);
                            }
                        }
                        break;
                    case "reverseBypassEnabled":
                        this.reverseBypassEnabled = (Boolean) value;
                        break;
                    case "removeImplicitRules":
                        this.removeImplicitRules = (Boolean) value;
                        break;
                    case "bypassRules":
                        this.bypassRules = (List) value;
                        break;
                    case "directs":
                        this.directs = (List) value;
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> toMap() {
        ArrayList arrayList = new ArrayList();
        Iterator<ProxyRuleExt> it = this.proxyRules.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toMap());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bypassRules", this.bypassRules);
        hashMap.put("directs", this.directs);
        hashMap.put("proxyRules", arrayList);
        hashMap.put("bypassSimpleHostnames", this.bypassSimpleHostnames);
        hashMap.put("removeImplicitRules", this.removeImplicitRules);
        hashMap.put("reverseBypassEnabled", this.reverseBypassEnabled);
        return hashMap;
    }
}
