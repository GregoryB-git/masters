.class public final enum Lib/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lib/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lib/k;

.field public static final enum c:Lib/k;

.field public static final enum d:Lib/k;

.field public static final enum e:Lib/k;

.field public static final enum f:Lib/k;

.field public static final synthetic o:[Lib/k;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    new-instance v0, Lib/k;

    const-string v1, "TLS_1_3"

    const/4 v2, 0x0

    const-string v3, "TLSv1.3"

    invoke-direct {v0, v1, v2, v3}, Lib/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lib/k;->b:Lib/k;

    new-instance v1, Lib/k;

    const-string v3, "TLS_1_2"

    const/4 v4, 0x1

    const-string v5, "TLSv1.2"

    invoke-direct {v1, v3, v4, v5}, Lib/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lib/k;->c:Lib/k;

    new-instance v3, Lib/k;

    const-string v5, "TLS_1_1"

    const/4 v6, 0x2

    const-string v7, "TLSv1.1"

    invoke-direct {v3, v5, v6, v7}, Lib/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lib/k;->d:Lib/k;

    new-instance v5, Lib/k;

    const-string v7, "TLS_1_0"

    const/4 v8, 0x3

    const-string v9, "TLSv1"

    invoke-direct {v5, v7, v8, v9}, Lib/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lib/k;->e:Lib/k;

    new-instance v7, Lib/k;

    const-string v9, "SSL_3_0"

    const/4 v10, 0x4

    const-string v11, "SSLv3"

    invoke-direct {v7, v9, v10, v11}, Lib/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lib/k;->f:Lib/k;

    const/4 v9, 0x5

    new-array v9, v9, [Lib/k;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lib/k;->o:[Lib/k;

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

    iput-object p3, p0, Lib/k;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lib/k;
    .locals 1

    const-class v0, Lib/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lib/k;

    return-object p0
.end method

.method public static values()[Lib/k;
    .locals 1

    sget-object v0, Lib/k;->o:[Lib/k;

    invoke-virtual {v0}, [Lib/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lib/k;

    return-object v0
.end method
