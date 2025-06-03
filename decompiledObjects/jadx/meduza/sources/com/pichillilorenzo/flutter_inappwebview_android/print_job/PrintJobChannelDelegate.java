package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

/* loaded from: classes.dex */
public class PrintJobChannelDelegate extends ChannelDelegateImpl {
    private PrintJobController printJobController;

    public PrintJobChannelDelegate(PrintJobController printJobController, MethodChannel methodChannel) {
        super(methodChannel);
        this.printJobController = printJobController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.printJobController = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        PrintJobInfoExt info;
        Boolean bool;
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "cancel":
                PrintJobController printJobController = this.printJobController;
                if (printJobController != null) {
                    printJobController.cancel();
                    bool = Boolean.TRUE;
                    result.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                result.success(bool);
            case "getInfo":
                PrintJobController printJobController2 = this.printJobController;
                Map<String, Object> map = null;
                if (printJobController2 != null && (info = printJobController2.getInfo()) != null) {
                    map = info.toMap();
                }
                result.success(map);
                break;
            case "restart":
                PrintJobController printJobController3 = this.printJobController;
                if (printJobController3 != null) {
                    printJobController3.restart();
                    bool = Boolean.TRUE;
                    result.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                result.success(bool);
            case "dispose":
                PrintJobController printJobController4 = this.printJobController;
                if (printJobController4 != null) {
                    printJobController4.dispose();
                    bool = Boolean.TRUE;
                    result.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                result.success(bool);
            default:
                result.notImplemented();
                break;
        }
    }
}
