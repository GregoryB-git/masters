.class public final Lg9/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I


# direct methods
.method public constructor <init>(II)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, p1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    const-string v4, "Generator ID %d contains more than %d reserved bits"

    invoke-static {v4, v0, v3}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    and-int/lit8 v0, p2, 0x1

    if-ne v0, p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    new-array p1, v2, [Ljava/lang/Object;

    const-string v0, "Cannot supply target ID from different generator ID"

    invoke-static {v0, v1, p1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iput p2, p0, Lg9/l0;->a:I

    return-void
.end method
