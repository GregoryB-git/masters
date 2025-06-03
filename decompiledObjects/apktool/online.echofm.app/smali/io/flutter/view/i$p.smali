.class public final enum Lio/flutter/view/i$p;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "p"
.end annotation


# static fields
.field public static final enum o:Lio/flutter/view/i$p;

.field public static final enum p:Lio/flutter/view/i$p;

.field public static final enum q:Lio/flutter/view/i$p;

.field public static final synthetic r:[Lio/flutter/view/i$p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/flutter/view/i$p;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/view/i$p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/view/i$p;->o:Lio/flutter/view/i$p;

    new-instance v0, Lio/flutter/view/i$p;

    const-string v1, "LTR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/flutter/view/i$p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/view/i$p;->p:Lio/flutter/view/i$p;

    new-instance v0, Lio/flutter/view/i$p;

    const-string v1, "RTL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/flutter/view/i$p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/view/i$p;->q:Lio/flutter/view/i$p;

    invoke-static {}, Lio/flutter/view/i$p;->c()[Lio/flutter/view/i$p;

    move-result-object v0

    sput-object v0, Lio/flutter/view/i$p;->r:[Lio/flutter/view/i$p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic c()[Lio/flutter/view/i$p;
    .locals 3

    .line 1
    const/4 v0, 0x3

    new-array v0, v0, [Lio/flutter/view/i$p;

    sget-object v1, Lio/flutter/view/i$p;->o:Lio/flutter/view/i$p;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/view/i$p;->p:Lio/flutter/view/i$p;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/view/i$p;->q:Lio/flutter/view/i$p;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static e(I)Lio/flutter/view/i$p;
    .locals 1

    .line 1
    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    sget-object p0, Lio/flutter/view/i$p;->o:Lio/flutter/view/i$p;

    return-object p0

    :cond_0
    sget-object p0, Lio/flutter/view/i$p;->p:Lio/flutter/view/i$p;

    return-object p0

    :cond_1
    sget-object p0, Lio/flutter/view/i$p;->q:Lio/flutter/view/i$p;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/view/i$p;
    .locals 1

    const-class v0, Lio/flutter/view/i$p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/view/i$p;

    return-object p0
.end method

.method public static values()[Lio/flutter/view/i$p;
    .locals 1

    sget-object v0, Lio/flutter/view/i$p;->r:[Lio/flutter/view/i$p;

    invoke-virtual {v0}, [Lio/flutter/view/i$p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/view/i$p;

    return-object v0
.end method
