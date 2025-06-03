.class public abstract Lmobileproxy/Mobileproxy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmobileproxy/Mobileproxy$proxyLogWriter;
    }
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lgo/Seq;->touch()V

    invoke-static {}, Lmobileproxy/Mobileproxy;->_init()V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native _init()V
.end method

.method public static native newListFromLines(Ljava/lang/String;)Lmobileproxy/StringList;
.end method

.method public static native newSmartStreamDialer(Lmobileproxy/StringList;Ljava/lang/String;Lmobileproxy/LogWriter;)Lmobileproxy/StreamDialer;
.end method

.method public static native newStderrLogWriter()Lmobileproxy/LogWriter;
.end method

.method public static native newStreamDialerFromConfig(Ljava/lang/String;)Lmobileproxy/StreamDialer;
.end method

.method public static native runProxy(Ljava/lang/String;Lmobileproxy/StreamDialer;)Lmobileproxy/Proxy;
.end method

.method public static touch()V
    .locals 0

    return-void
.end method
