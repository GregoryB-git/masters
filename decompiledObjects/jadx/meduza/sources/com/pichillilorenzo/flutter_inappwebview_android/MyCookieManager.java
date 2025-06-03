package com.pichillilorenzo.flutter_inappwebview_android;

import a0.j;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import d2.i0;
import d2.j0;
import defpackage.g;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import x6.b;
import zc.a;

/* loaded from: classes.dex */
public class MyCookieManager extends ChannelDelegateImpl {
    public static final String LOG_TAG = "MyCookieManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
    public static CookieManager cookieManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static String getCookieExpirationDate(Long l10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l10.longValue()));
    }

    private static CookieManager getCookieManager() {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e10) {
                if (e10.getMessage() == null || !e10.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    throw e10;
                }
                return null;
            }
        }
        return cookieManager;
    }

    public static void init() {
        if (cookieManager == null) {
            cookieManager = getCookieManager();
        }
    }

    public void deleteAllCookies(final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
        } else {
            cookieManager.removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    result.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void deleteCookie(String str, String str2, String str3, String str4, final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
            return;
        }
        String k10 = j.k(str2, "=; Path=", str4, "; Max-Age=-1");
        if (str3 != null) {
            k10 = g.e(k10, "; Domain=", str3);
        }
        cookieManager.setCookie(str, g.d(k10, ";"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
                result.success(bool);
            }
        });
        cookieManager.flush();
    }

    public void deleteCookies(String str, String str2, String str3, MethodChannel.Result result) {
        Boolean bool;
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            bool = Boolean.FALSE;
        } else {
            String cookie = cookieManager2.getCookie(str);
            if (cookie != null) {
                for (String str4 : cookie.split(";")) {
                    String k10 = j.k(str4.split("=", 2)[0].trim(), "=; Path=", str3, "; Max-Age=-1");
                    if (str2 != null) {
                        k10 = g.e(k10, "; Domain=", str2);
                    }
                    cookieManager.setCookie(str, g.d(k10, ";"), null);
                }
                cookieManager.flush();
            }
            bool = Boolean.TRUE;
        }
        result.success(bool);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public List<Map<String, Object>> getCookies(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return arrayList;
        }
        List<String> arrayList2 = new ArrayList<>();
        String str3 = "GET_COOKIE_INFO";
        String str4 = ";";
        if (b.c0("GET_COOKIE_INFO")) {
            CookieManager cookieManager3 = cookieManager;
            if (!i0.N.d()) {
                throw i0.a();
            }
            arrayList2 = ((WebViewCookieManagerBoundaryInterface) a.a(WebViewCookieManagerBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) j0.a.f3389a.f3363b).convertCookieManager(cookieManager3))).getCookieInfo(str);
        } else {
            String cookie = cookieManager.getCookie(str);
            if (cookie != null) {
                arrayList2 = Arrays.asList(cookie.split(";"));
            }
        }
        Iterator<String> it = arrayList2.iterator();
        while (it.hasNext()) {
            String[] split = it.next().split(str4);
            if (split.length != 0) {
                String[] split2 = split[0].split("=", 2);
                String trim = split2[0].trim();
                String trim2 = split2.length > 1 ? split2[1].trim() : "";
                HashMap hashMap = new HashMap();
                hashMap.put("name", trim);
                hashMap.put("value", trim2);
                hashMap.put("expiresDate", null);
                hashMap.put("isSessionOnly", null);
                hashMap.put("domain", null);
                hashMap.put("sameSite", null);
                hashMap.put("isSecure", null);
                hashMap.put("isHttpOnly", null);
                hashMap.put("path", null);
                if (b.c0(str3)) {
                    Boolean bool = Boolean.FALSE;
                    hashMap.put("isSecure", bool);
                    hashMap.put("isHttpOnly", bool);
                    int i10 = 1;
                    while (i10 < split.length) {
                        Iterator<String> it2 = it;
                        String[] split3 = split[i10].split("=", 2);
                        String trim3 = split3[0].trim();
                        String str5 = str3;
                        String[] strArr = split;
                        String trim4 = split3.length > 1 ? split3[1].trim() : "";
                        if (trim3.equalsIgnoreCase("Expires")) {
                            try {
                                str2 = str4;
                            } catch (ParseException e10) {
                                e = e10;
                                str2 = str4;
                            }
                            try {
                                Date parse = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US).parse(trim4);
                                if (parse != null) {
                                    hashMap.put("expiresDate", Long.valueOf(parse.getTime()));
                                }
                            } catch (ParseException e11) {
                                e = e11;
                                Log.e(LOG_TAG, "", e);
                                i10++;
                                str3 = str5;
                                it = it2;
                                split = strArr;
                                str4 = str2;
                            }
                        } else {
                            str2 = str4;
                            if (trim3.equalsIgnoreCase("Max-Age")) {
                                try {
                                    hashMap.put("expiresDate", Long.valueOf(System.currentTimeMillis() + Long.parseLong(trim4)));
                                } catch (NumberFormatException e12) {
                                    e = e12;
                                    Log.e(LOG_TAG, "", e);
                                    i10++;
                                    str3 = str5;
                                    it = it2;
                                    split = strArr;
                                    str4 = str2;
                                }
                            } else if (trim3.equalsIgnoreCase("Domain")) {
                                hashMap.put("domain", trim4);
                            } else if (trim3.equalsIgnoreCase("SameSite")) {
                                hashMap.put("sameSite", trim4);
                            } else if (trim3.equalsIgnoreCase("Secure")) {
                                hashMap.put("isSecure", Boolean.TRUE);
                            } else if (trim3.equalsIgnoreCase("HttpOnly")) {
                                hashMap.put("isHttpOnly", Boolean.TRUE);
                            } else if (trim3.equalsIgnoreCase("Path")) {
                                hashMap.put("path", trim4);
                            }
                        }
                        i10++;
                        str3 = str5;
                        it = it2;
                        split = strArr;
                        str4 = str2;
                    }
                }
                arrayList.add(hashMap);
                str3 = str3;
                it = it;
                str4 = str4;
            }
        }
        return arrayList;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        init();
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "deleteCookie":
                deleteCookie((String) methodCall.argument(WebViewActivity.URL_EXTRA), (String) methodCall.argument("name"), (String) methodCall.argument("domain"), (String) methodCall.argument("path"), result);
                break;
            case "removeSessionCookies":
                removeSessionCookies(result);
                break;
            case "setCookie":
                String str2 = (String) methodCall.argument(WebViewActivity.URL_EXTRA);
                String str3 = (String) methodCall.argument("name");
                String str4 = (String) methodCall.argument("value");
                String str5 = (String) methodCall.argument("domain");
                String str6 = (String) methodCall.argument("path");
                String str7 = (String) methodCall.argument("expiresDate");
                setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) methodCall.argument("maxAge"), (Boolean) methodCall.argument("isSecure"), (Boolean) methodCall.argument("isHttpOnly"), (String) methodCall.argument("sameSite"), result);
                break;
            case "deleteCookies":
                deleteCookies((String) methodCall.argument(WebViewActivity.URL_EXTRA), (String) methodCall.argument("domain"), (String) methodCall.argument("path"), result);
                break;
            case "deleteAllCookies":
                deleteAllCookies(result);
                break;
            case "getCookies":
                result.success(getCookies((String) methodCall.argument(WebViewActivity.URL_EXTRA)));
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    public void removeSessionCookies(final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
        } else {
            cookieManager.removeSessionCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.4
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    result.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l10, Integer num, Boolean bool, Boolean bool2, String str6, final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
            return;
        }
        String str7 = str2 + "=" + str3 + "; Path=" + str5;
        if (str4 != null) {
            str7 = g.e(str7, "; Domain=", str4);
        }
        if (l10 != null) {
            StringBuilder g10 = g.g(str7, "; Expires=");
            g10.append(getCookieExpirationDate(l10));
            str7 = g10.toString();
        }
        if (num != null) {
            StringBuilder g11 = g.g(str7, "; Max-Age=");
            g11.append(num.toString());
            str7 = g11.toString();
        }
        if (bool != null && bool.booleanValue()) {
            str7 = g.d(str7, "; Secure");
        }
        if (bool2 != null && bool2.booleanValue()) {
            str7 = g.d(str7, "; HttpOnly");
        }
        if (str6 != null) {
            str7 = g.e(str7, "; SameSite=", str6);
        }
        cookieManager.setCookie(str, g.d(str7, ";"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool3) {
                result.success(bool3);
            }
        });
        cookieManager.flush();
    }
}
