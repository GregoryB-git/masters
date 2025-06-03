.class public final enum Le7/f3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le7/f3;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le7/f3;

.field public static final enum c:Le7/f3;

.field public static final synthetic d:[Le7/f3;


# instance fields
.field public final a:[Le7/e3$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Le7/f3;

    const/4 v1, 0x2

    new-array v2, v1, [Le7/e3$a;

    sget-object v3, Le7/e3$a;->b:Le7/e3$a;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Le7/e3$a;->c:Le7/e3$a;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "STORAGE"

    invoke-direct {v0, v3, v4, v2}, Le7/f3;-><init>(Ljava/lang/String;I[Le7/e3$a;)V

    sput-object v0, Le7/f3;->b:Le7/f3;

    new-instance v2, Le7/f3;

    new-array v3, v5, [Le7/e3$a;

    sget-object v6, Le7/e3$a;->d:Le7/e3$a;

    aput-object v6, v3, v4

    const-string v6, "DMA"

    invoke-direct {v2, v6, v5, v3}, Le7/f3;-><init>(Ljava/lang/String;I[Le7/e3$a;)V

    sput-object v2, Le7/f3;->c:Le7/f3;

    new-array v1, v1, [Le7/f3;

    aput-object v0, v1, v4

    aput-object v2, v1, v5

    sput-object v1, Le7/f3;->d:[Le7/f3;

    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;I[Le7/e3$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Le7/e3$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Le7/f3;->a:[Le7/e3$a;

    return-void
.end method

.method public static values()[Le7/f3;
    .locals 1

    sget-object v0, Le7/f3;->d:[Le7/f3;

    invoke-virtual {v0}, [Le7/f3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le7/f3;

    return-object v0
.end method
