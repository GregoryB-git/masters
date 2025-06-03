package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* loaded from: classes.dex */
public class FindInteractionChannelDelegate extends ChannelDelegateImpl {
    private FindInteractionController findInteractionController;

    public FindInteractionChannelDelegate(FindInteractionController findInteractionController, MethodChannel methodChannel) {
        super(methodChannel);
        this.findInteractionController = findInteractionController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.findInteractionController = null;
    }

    public void onFindResultReceived(int i10, int i11, boolean z10) {
        FindInteractionController findInteractionController;
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        if (z10 && (findInteractionController = this.findInteractionController) != null && findInteractionController.webView != null) {
            findInteractionController.activeFindSession = new FindSession(i11, i10);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activeMatchOrdinal", Integer.valueOf(i10));
        hashMap.put("numberOfMatches", Integer.valueOf(i11));
        hashMap.put("isDoneCounting", Boolean.valueOf(z10));
        channel.invokeMethod("onFindResultReceived", hashMap);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object obj;
        FindSession findSession;
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "getSearchText":
                FindInteractionController findInteractionController = this.findInteractionController;
                if (findInteractionController != null) {
                    obj = findInteractionController.searchText;
                    result.success(obj);
                    break;
                }
                obj = Boolean.FALSE;
                result.success(obj);
            case "findAll":
                if (this.findInteractionController != null) {
                    this.findInteractionController.findAll((String) methodCall.argument("find"));
                }
                obj = Boolean.TRUE;
                result.success(obj);
                break;
            case "findNext":
                if (this.findInteractionController != null) {
                    this.findInteractionController.findNext(((Boolean) methodCall.argument("forward")).booleanValue());
                }
                obj = Boolean.TRUE;
                result.success(obj);
                break;
            case "setSearchText":
                FindInteractionController findInteractionController2 = this.findInteractionController;
                if (findInteractionController2 != null) {
                    findInteractionController2.searchText = (String) methodCall.argument("searchText");
                    obj = Boolean.TRUE;
                    result.success(obj);
                    break;
                }
                obj = Boolean.FALSE;
                result.success(obj);
            case "clearMatches":
                FindInteractionController findInteractionController3 = this.findInteractionController;
                if (findInteractionController3 != null) {
                    findInteractionController3.clearMatches();
                }
                obj = Boolean.TRUE;
                result.success(obj);
                break;
            case "getActiveFindSession":
                FindInteractionController findInteractionController4 = this.findInteractionController;
                obj = (findInteractionController4 == null || (findSession = findInteractionController4.activeFindSession) == null) ? null : findSession.toMap();
                result.success(obj);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
