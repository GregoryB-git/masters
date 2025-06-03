.class public final enum Lio/flutter/plugin/editing/C$c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugin/editing/C$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum o:Lio/flutter/plugin/editing/C$c$a;

.field public static final enum p:Lio/flutter/plugin/editing/C$c$a;

.field public static final enum q:Lio/flutter/plugin/editing/C$c$a;

.field public static final enum r:Lio/flutter/plugin/editing/C$c$a;

.field public static final synthetic s:[Lio/flutter/plugin/editing/C$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/flutter/plugin/editing/C$c$a;

    const-string v1, "NO_TARGET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/editing/C$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugin/editing/C$c$a;->o:Lio/flutter/plugin/editing/C$c$a;

    new-instance v0, Lio/flutter/plugin/editing/C$c$a;

    const-string v1, "FRAMEWORK_CLIENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/editing/C$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugin/editing/C$c$a;->p:Lio/flutter/plugin/editing/C$c$a;

    new-instance v0, Lio/flutter/plugin/editing/C$c$a;

    const-string v1, "VIRTUAL_DISPLAY_PLATFORM_VIEW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/editing/C$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugin/editing/C$c$a;->q:Lio/flutter/plugin/editing/C$c$a;

    new-instance v0, Lio/flutter/plugin/editing/C$c$a;

    const-string v1, "PHYSICAL_DISPLAY_PLATFORM_VIEW"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/editing/C$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugin/editing/C$c$a;->r:Lio/flutter/plugin/editing/C$c$a;

    invoke-static {}, Lio/flutter/plugin/editing/C$c$a;->c()[Lio/flutter/plugin/editing/C$c$a;

    move-result-object v0

    sput-object v0, Lio/flutter/plugin/editing/C$c$a;->s:[Lio/flutter/plugin/editing/C$c$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic c()[Lio/flutter/plugin/editing/C$c$a;
    .locals 3

    .line 1
    const/4 v0, 0x4

    new-array v0, v0, [Lio/flutter/plugin/editing/C$c$a;

    sget-object v1, Lio/flutter/plugin/editing/C$c$a;->o:Lio/flutter/plugin/editing/C$c$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/plugin/editing/C$c$a;->p:Lio/flutter/plugin/editing/C$c$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/plugin/editing/C$c$a;->q:Lio/flutter/plugin/editing/C$c$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/plugin/editing/C$c$a;->r:Lio/flutter/plugin/editing/C$c$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugin/editing/C$c$a;
    .locals 1

    const-class v0, Lio/flutter/plugin/editing/C$c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugin/editing/C$c$a;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugin/editing/C$c$a;
    .locals 1

    sget-object v0, Lio/flutter/plugin/editing/C$c$a;->s:[Lio/flutter/plugin/editing/C$c$a;

    invoke-virtual {v0}, [Lio/flutter/plugin/editing/C$c$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugin/editing/C$c$a;

    return-object v0
.end method
