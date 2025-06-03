.class public Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;
.super Lb1/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb1/t<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb1/t;-><init>()V

    return-void
.end method

.method public static getInstance()Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;
    .locals 1

    sget-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;->instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;

    if-nez v0, :cond_0

    new-instance v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;-><init>()V

    sput-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;->instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;

    :cond_0
    sget-object v0, Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;->instance:Lio/flutter/plugins/firebase/messaging/FlutterFirebaseTokenLiveData;

    return-object v0
.end method


# virtual methods
.method public postToken(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lb1/t;->postValue(Ljava/lang/Object;)V

    return-void
.end method
