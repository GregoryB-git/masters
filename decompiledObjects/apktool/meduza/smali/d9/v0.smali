.class public final enum Ld9/v0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld9/v0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ld9/v0;

.field public static final enum b:Ld9/v0;

.field public static final enum c:Ld9/v0;

.field public static final synthetic d:[Ld9/v0;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Ld9/v0;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld9/v0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld9/v0;->a:Ld9/v0;

    new-instance v1, Ld9/v0;

    const-string v3, "SERVER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ld9/v0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ld9/v0;->b:Ld9/v0;

    new-instance v3, Ld9/v0;

    const-string v5, "CACHE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ld9/v0;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ld9/v0;->c:Ld9/v0;

    const/4 v5, 0x3

    new-array v5, v5, [Ld9/v0;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ld9/v0;->d:[Ld9/v0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ld9/v0;
    .locals 1

    const-class v0, Ld9/v0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld9/v0;

    return-object p0
.end method

.method public static values()[Ld9/v0;
    .locals 1

    sget-object v0, Ld9/v0;->d:[Ld9/v0;

    invoke-virtual {v0}, [Ld9/v0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld9/v0;

    return-object v0
.end method
