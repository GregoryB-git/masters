.class public final enum Lma/a1;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lma/a0$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lma/a1;",
        ">;",
        "Lma/a0$a;"
    }
.end annotation


# static fields
.field public static final enum b:Lma/a1;

.field public static final enum c:Lma/a1;

.field public static final synthetic d:[Lma/a1;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lma/a1;

    const-string v1, "NULL_VALUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lma/a1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lma/a1;->b:Lma/a1;

    new-instance v1, Lma/a1;

    const-string v3, "UNRECOGNIZED"

    const/4 v4, 0x1

    const/4 v5, -0x1

    invoke-direct {v1, v3, v4, v5}, Lma/a1;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lma/a1;->c:Lma/a1;

    const/4 v3, 0x2

    new-array v3, v3, [Lma/a1;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lma/a1;->d:[Lma/a1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lma/a1;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lma/a1;
    .locals 1

    const-class v0, Lma/a1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lma/a1;

    return-object p0
.end method

.method public static values()[Lma/a1;
    .locals 1

    sget-object v0, Lma/a1;->d:[Lma/a1;

    invoke-virtual {v0}, [Lma/a1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lma/a1;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lma/a1;->c:Lma/a1;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lma/a1;->a:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
