.class public final enum Le7/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le7/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le7/k;

.field public static final enum c:Le7/k;

.field public static final enum d:Le7/k;

.field public static final enum e:Le7/k;

.field public static final enum f:Le7/k;

.field public static final enum o:Le7/k;

.field public static final enum p:Le7/k;

.field public static final enum q:Le7/k;

.field public static final enum r:Le7/k;

.field public static final synthetic s:[Le7/k;


# instance fields
.field public final a:C


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Le7/k;

    const-string v1, "UNSET"

    const/4 v2, 0x0

    const/16 v3, 0x30

    invoke-direct {v0, v1, v2, v3}, Le7/k;-><init>(Ljava/lang/String;IC)V

    sput-object v0, Le7/k;->b:Le7/k;

    new-instance v1, Le7/k;

    const-string v3, "REMOTE_DEFAULT"

    const/4 v4, 0x1

    const/16 v5, 0x31

    invoke-direct {v1, v3, v4, v5}, Le7/k;-><init>(Ljava/lang/String;IC)V

    sput-object v1, Le7/k;->c:Le7/k;

    new-instance v3, Le7/k;

    const-string v5, "REMOTE_DELEGATION"

    const/4 v6, 0x2

    const/16 v7, 0x32

    invoke-direct {v3, v5, v6, v7}, Le7/k;-><init>(Ljava/lang/String;IC)V

    sput-object v3, Le7/k;->d:Le7/k;

    new-instance v5, Le7/k;

    const-string v7, "MANIFEST"

    const/4 v8, 0x3

    const/16 v9, 0x33

    invoke-direct {v5, v7, v8, v9}, Le7/k;-><init>(Ljava/lang/String;IC)V

    sput-object v5, Le7/k;->e:Le7/k;

    new-instance v7, Le7/k;

    const-string v9, "INITIALIZATION"

    const/4 v10, 0x4

    const/16 v11, 0x34

    invoke-direct {v7, v9, v10, v11}, Le7/k;-><init>(Ljava/lang/String;IC)V

    sput-object v7, Le7/k;->f:Le7/k;

    new-instance v9, Le7/k;

    const-string v11, "API"

    const/4 v12, 0x5

    const/16 v13, 0x35

    invoke-direct {v9, v11, v12, v13}, Le7/k;-><init>(Ljava/lang/String;IC)V

    sput-object v9, Le7/k;->o:Le7/k;

    new-instance v11, Le7/k;

    const-string v13, "CHILD_ACCOUNT"

    const/4 v14, 0x6

    const/16 v15, 0x36

    invoke-direct {v11, v13, v14, v15}, Le7/k;-><init>(Ljava/lang/String;IC)V

    new-instance v13, Le7/k;

    const-string v15, "TCF"

    const/4 v14, 0x7

    const/16 v12, 0x37

    invoke-direct {v13, v15, v14, v12}, Le7/k;-><init>(Ljava/lang/String;IC)V

    sput-object v13, Le7/k;->p:Le7/k;

    new-instance v12, Le7/k;

    const-string v15, "REMOTE_ENFORCED_DEFAULT"

    const/16 v14, 0x8

    const/16 v10, 0x38

    invoke-direct {v12, v15, v14, v10}, Le7/k;-><init>(Ljava/lang/String;IC)V

    sput-object v12, Le7/k;->q:Le7/k;

    new-instance v10, Le7/k;

    const-string v15, "FAILSAFE"

    const/16 v14, 0x9

    const/16 v8, 0x39

    invoke-direct {v10, v15, v14, v8}, Le7/k;-><init>(Ljava/lang/String;IC)V

    sput-object v10, Le7/k;->r:Le7/k;

    const/16 v8, 0xa

    new-array v8, v8, [Le7/k;

    aput-object v0, v8, v2

    aput-object v1, v8, v4

    aput-object v3, v8, v6

    const/4 v0, 0x3

    aput-object v5, v8, v0

    const/4 v0, 0x4

    aput-object v7, v8, v0

    const/4 v0, 0x5

    aput-object v9, v8, v0

    const/4 v0, 0x6

    aput-object v11, v8, v0

    const/4 v0, 0x7

    aput-object v13, v8, v0

    const/16 v0, 0x8

    aput-object v12, v8, v0

    aput-object v10, v8, v14

    sput-object v8, Le7/k;->s:[Le7/k;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IC)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-char p3, p0, Le7/k;->a:C

    return-void
.end method

.method public static values()[Le7/k;
    .locals 1

    sget-object v0, Le7/k;->s:[Le7/k;

    invoke-virtual {v0}, [Le7/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le7/k;

    return-object v0
.end method
