.class public final enum Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/renderer/FlutterRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field public static final enum p:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

.field public static final enum q:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

.field public static final enum r:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

.field public static final synthetic s:[Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;


# instance fields
.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->p:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    new-instance v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    const-string v1, "POSTURE_FLAT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->q:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    new-instance v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    const-string v1, "POSTURE_HALF_OPENED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->r:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    invoke-static {}, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->c()[Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    move-result-object v0

    sput-object v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->s:[Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->o:I

    return-void
.end method

.method public static synthetic c()[Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;
    .locals 3

    .line 1
    const/4 v0, 0x3

    new-array v0, v0, [Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    sget-object v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->p:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->q:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->r:Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;
    .locals 1

    const-class v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    return-object p0
.end method

.method public static values()[Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;
    .locals 1

    sget-object v0, Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->s:[Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    invoke-virtual {v0}, [Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/embedding/engine/renderer/FlutterRenderer$c;

    return-object v0
.end method
