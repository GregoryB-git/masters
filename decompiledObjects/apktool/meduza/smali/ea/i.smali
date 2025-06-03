.class public final enum Lea/i;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La9/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lea/i;",
        ">;",
        "La9/g;"
    }
.end annotation


# static fields
.field public static final enum b:Lea/i;

.field public static final enum c:Lea/i;

.field public static final enum d:Lea/i;

.field public static final synthetic e:[Lea/i;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, Lea/i;

    const-string v1, "COLLECTION_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lea/i;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lea/i;

    const-string v3, "COLLECTION_SDK_NOT_INSTALLED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lea/i;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lea/i;->b:Lea/i;

    new-instance v3, Lea/i;

    const-string v5, "COLLECTION_ENABLED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lea/i;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lea/i;->c:Lea/i;

    new-instance v5, Lea/i;

    const-string v7, "COLLECTION_DISABLED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lea/i;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lea/i;->d:Lea/i;

    new-instance v7, Lea/i;

    const-string v9, "COLLECTION_DISABLED_REMOTE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lea/i;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lea/i;

    const-string v11, "COLLECTION_SAMPLED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lea/i;-><init>(Ljava/lang/String;II)V

    const/4 v11, 0x6

    new-array v11, v11, [Lea/i;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lea/i;->e:[Lea/i;

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

    iput p3, p0, Lea/i;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lea/i;
    .locals 1

    const-class v0, Lea/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lea/i;

    return-object p0
.end method

.method public static values()[Lea/i;
    .locals 1

    sget-object v0, Lea/i;->e:[Lea/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lea/i;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lea/i;->a:I

    return v0
.end method
