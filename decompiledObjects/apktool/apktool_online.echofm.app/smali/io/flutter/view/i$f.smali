.class public final enum Lio/flutter/view/i$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation


# static fields
.field public static final enum p:Lio/flutter/view/i$f;

.field public static final enum q:Lio/flutter/view/i$f;

.field public static final enum r:Lio/flutter/view/i$f;

.field public static final enum s:Lio/flutter/view/i$f;

.field public static final enum t:Lio/flutter/view/i$f;

.field public static final enum u:Lio/flutter/view/i$f;

.field public static final enum v:Lio/flutter/view/i$f;

.field public static final synthetic w:[Lio/flutter/view/i$f;


# instance fields
.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/flutter/view/i$f;

    const-string v1, "ACCESSIBLE_NAVIGATION"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lio/flutter/view/i$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/i$f;->p:Lio/flutter/view/i$f;

    new-instance v0, Lio/flutter/view/i$f;

    const-string v1, "INVERT_COLORS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lio/flutter/view/i$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/i$f;->q:Lio/flutter/view/i$f;

    new-instance v0, Lio/flutter/view/i$f;

    const-string v1, "DISABLE_ANIMATIONS"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lio/flutter/view/i$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/i$f;->r:Lio/flutter/view/i$f;

    new-instance v0, Lio/flutter/view/i$f;

    const/4 v1, 0x3

    const/16 v2, 0x8

    const-string v4, "BOLD_TEXT"

    invoke-direct {v0, v4, v1, v2}, Lio/flutter/view/i$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/i$f;->s:Lio/flutter/view/i$f;

    new-instance v0, Lio/flutter/view/i$f;

    const-string v1, "REDUCE_MOTION"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v3, v2}, Lio/flutter/view/i$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/i$f;->t:Lio/flutter/view/i$f;

    new-instance v0, Lio/flutter/view/i$f;

    const/4 v1, 0x5

    const/16 v2, 0x20

    const-string v3, "HIGH_CONTRAST"

    invoke-direct {v0, v3, v1, v2}, Lio/flutter/view/i$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/i$f;->u:Lio/flutter/view/i$f;

    new-instance v0, Lio/flutter/view/i$f;

    const/4 v1, 0x6

    const/16 v2, 0x40

    const-string v3, "ON_OFF_SWITCH_LABELS"

    invoke-direct {v0, v3, v1, v2}, Lio/flutter/view/i$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/i$f;->v:Lio/flutter/view/i$f;

    invoke-static {}, Lio/flutter/view/i$f;->c()[Lio/flutter/view/i$f;

    move-result-object v0

    sput-object v0, Lio/flutter/view/i$f;->w:[Lio/flutter/view/i$f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/flutter/view/i$f;->o:I

    return-void
.end method

.method public static synthetic c()[Lio/flutter/view/i$f;
    .locals 3

    .line 1
    const/4 v0, 0x7

    new-array v0, v0, [Lio/flutter/view/i$f;

    sget-object v1, Lio/flutter/view/i$f;->p:Lio/flutter/view/i$f;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/view/i$f;->q:Lio/flutter/view/i$f;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/view/i$f;->r:Lio/flutter/view/i$f;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/view/i$f;->s:Lio/flutter/view/i$f;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/view/i$f;->t:Lio/flutter/view/i$f;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/view/i$f;->u:Lio/flutter/view/i$f;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/view/i$f;->v:Lio/flutter/view/i$f;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/view/i$f;
    .locals 1

    const-class v0, Lio/flutter/view/i$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/view/i$f;

    return-object p0
.end method

.method public static values()[Lio/flutter/view/i$f;
    .locals 1

    sget-object v0, Lio/flutter/view/i$f;->w:[Lio/flutter/view/i$f;

    invoke-virtual {v0}, [Lio/flutter/view/i$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/view/i$f;

    return-object v0
.end method
