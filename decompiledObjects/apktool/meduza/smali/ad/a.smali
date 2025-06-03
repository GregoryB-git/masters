.class public final enum Lad/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lad/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lad/a;

.field public static final enum b:Lad/a;

.field public static final enum c:Lad/a;

.field public static final enum d:Lad/a;

.field public static final enum e:Lad/a;

.field public static final enum f:Lad/a;

.field public static final synthetic o:[Lad/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, Lad/a;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lad/a;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lad/a;

    const-string v3, "ENQUEUED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lad/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lad/a;->a:Lad/a;

    new-instance v3, Lad/a;

    const-string v5, "RUNNING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lad/a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lad/a;->b:Lad/a;

    new-instance v5, Lad/a;

    const-string v7, "COMPLETE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lad/a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lad/a;->c:Lad/a;

    new-instance v7, Lad/a;

    const-string v9, "FAILED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lad/a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lad/a;->d:Lad/a;

    new-instance v9, Lad/a;

    const-string v11, "CANCELED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lad/a;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lad/a;->e:Lad/a;

    new-instance v11, Lad/a;

    const-string v13, "PAUSED"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lad/a;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lad/a;->f:Lad/a;

    const/4 v13, 0x7

    new-array v13, v13, [Lad/a;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lad/a;->o:[Lad/a;

    invoke-static {v13}, Lp2/m0;->D([Ljava/lang/Enum;)Lxb/b;

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

.method public static valueOf(Ljava/lang/String;)Lad/a;
    .locals 1

    const-class v0, Lad/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lad/a;

    return-object p0
.end method

.method public static values()[Lad/a;
    .locals 1

    sget-object v0, Lad/a;->o:[Lad/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lad/a;

    return-object v0
.end method
