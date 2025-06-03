.class public final enum Le7/g3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le7/g3;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le7/g3;

.field public static final enum c:Le7/g3;

.field public static final enum d:Le7/g3;

.field public static final enum e:Le7/g3;

.field public static final synthetic f:[Le7/g3;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Le7/g3;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    const-string v3, "uninitialized"

    invoke-direct {v0, v1, v2, v3}, Le7/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le7/g3;->b:Le7/g3;

    new-instance v1, Le7/g3;

    const-string v3, "POLICY"

    const/4 v4, 0x1

    const-string v5, "eu_consent_policy"

    invoke-direct {v1, v3, v4, v5}, Le7/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Le7/g3;->c:Le7/g3;

    new-instance v3, Le7/g3;

    const-string v5, "DENIED"

    const/4 v6, 0x2

    const-string v7, "denied"

    invoke-direct {v3, v5, v6, v7}, Le7/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Le7/g3;->d:Le7/g3;

    new-instance v5, Le7/g3;

    const-string v7, "GRANTED"

    const/4 v8, 0x3

    const-string v9, "granted"

    invoke-direct {v5, v7, v8, v9}, Le7/g3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Le7/g3;->e:Le7/g3;

    const/4 v7, 0x4

    new-array v7, v7, [Le7/g3;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Le7/g3;->f:[Le7/g3;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Le7/g3;->a:Ljava/lang/String;

    return-void
.end method

.method public static values()[Le7/g3;
    .locals 1

    sget-object v0, Le7/g3;->f:[Le7/g3;

    invoke-virtual {v0}, [Le7/g3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le7/g3;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le7/g3;->a:Ljava/lang/String;

    return-object v0
.end method
