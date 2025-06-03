.class public Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;
.super Lb1/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb1/t<",
        "Laa/z;",
        ">;"
    }
.end annotation


# static fields
.field private static instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb1/t;-><init>()V

    return-void
.end method

.method public static getInstance()Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;
    .locals 1

    sget-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;->instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;

    if-nez v0, :cond_0

    new-instance v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;-><init>()V

    sput-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;->instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;

    :cond_0
    sget-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;->instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseRemoteMessageLiveData;

    return-object v0
.end method


# virtual methods
.method public postRemoteMessage(Laa/z;)V
    .locals 0

    invoke-virtual {p0, p1}, Lb1/t;->postValue(Ljava/lang/Object;)V

    return-void
.end method
