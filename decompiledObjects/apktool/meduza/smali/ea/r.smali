.class public final enum Lea/r;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La9/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lea/r;",
        ">;",
        "La9/g;"
    }
.end annotation


# static fields
.field public static final enum b:Lea/r;

.field public static final synthetic c:[Lea/r;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lea/r;

    const-string v1, "LOG_ENVIRONMENT_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lea/r;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lea/r;

    const-string v3, "LOG_ENVIRONMENT_AUTOPUSH"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lea/r;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lea/r;

    const-string v5, "LOG_ENVIRONMENT_STAGING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lea/r;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lea/r;

    const-string v7, "LOG_ENVIRONMENT_PROD"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lea/r;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lea/r;->b:Lea/r;

    const/4 v7, 0x4

    new-array v7, v7, [Lea/r;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lea/r;->c:[Lea/r;

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

    iput p3, p0, Lea/r;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lea/r;
    .locals 1

    const-class v0, Lea/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lea/r;

    return-object p0
.end method

.method public static values()[Lea/r;
    .locals 1

    sget-object v0, Lea/r;->c:[Lea/r;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lea/r;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lea/r;->a:I

    return v0
.end method
