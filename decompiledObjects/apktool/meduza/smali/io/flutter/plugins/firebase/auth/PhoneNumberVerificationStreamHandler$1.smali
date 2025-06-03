.class Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;
.super Lb8/f0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-direct {p0}, Lb8/f0;-><init>()V

    return-void
.end method


# virtual methods
.method public onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "verificationId"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "name"

    const-string v1, "Auth#phoneCodeAutoRetrievalTimeout"

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCodeSent(Ljava/lang/String;Lb8/e0;)V
    .locals 3

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$100()Ljava/util/HashMap;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v1, "verificationId"

    invoke-virtual {p2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "forceResendingToken"

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "name"

    const-string v0, "Auth#phoneCodeSent"

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onVerificationCompleted(Lb8/c0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    .line 6
    .line 7
    iget-object v1, v1, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->onCredentialsListener:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;->onCredentialsReceived(Lb8/c0;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v2, "token"

    .line 22
    .line 23
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, Lb8/c0;->b:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const-string v0, "smsCode"

    .line 31
    .line 32
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_0
    const-string p1, "name"

    .line 36
    .line 37
    const-string v0, "Auth#phoneVerificationCompleted"

    .line 38
    .line 39
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    .line 43
    .line 44
    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    .line 51
    .line 52
    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public onVerificationFailed(Lu7/h;)V
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPluginException;->parserExceptionToFlutter(Ljava/lang/Exception;)Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;

    move-result-object p1

    iget-object v2, p1, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;->code:Ljava/lang/String;

    const-string v3, "ERROR_"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "_"

    const-string v4, "-"

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "code"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "message"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;->details:Ljava/lang/Object;

    const-string v2, "details"

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "error"

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "name"

    const-string v1, "Auth#phoneVerificationFailed"

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;->this$0:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;

    invoke-static {p1}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;

    move-result-object p1

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
