.class public final enum Lo9/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo9/f$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lo9/f$a;

.field public static final enum b:Lo9/f$a;

.field public static final enum c:Lo9/f$a;

.field public static final enum d:Lo9/f$a;

.field public static final enum e:Lo9/f$a;

.field public static final enum f:Lo9/f$a;

.field public static final enum o:Lo9/f$a;

.field public static final enum p:Lo9/f$a;

.field public static final enum q:Lo9/f$a;

.field public static final enum r:Lo9/f$a;

.field public static final enum s:Lo9/f$a;

.field public static final enum t:Lo9/f$a;

.field public static final enum u:Lo9/f$a;

.field public static final synthetic v:[Lo9/f$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    new-instance v0, Lo9/f$a;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo9/f$a;->a:Lo9/f$a;

    new-instance v1, Lo9/f$a;

    const-string v3, "CANCELLED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo9/f$a;->b:Lo9/f$a;

    new-instance v3, Lo9/f$a;

    const-string v5, "UNKNOWN"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lo9/f$a;->c:Lo9/f$a;

    new-instance v5, Lo9/f$a;

    const-string v7, "INVALID_ARGUMENT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lo9/f$a;->d:Lo9/f$a;

    new-instance v7, Lo9/f$a;

    const-string v9, "DEADLINE_EXCEEDED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lo9/f$a;->e:Lo9/f$a;

    new-instance v9, Lo9/f$a;

    const-string v11, "NOT_FOUND"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lo9/f$a;->f:Lo9/f$a;

    new-instance v11, Lo9/f$a;

    const-string v13, "ALREADY_EXISTS"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    new-instance v13, Lo9/f$a;

    const-string v15, "PERMISSION_DENIED"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lo9/f$a;->o:Lo9/f$a;

    new-instance v15, Lo9/f$a;

    const-string v14, "RESOURCE_EXHAUSTED"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lo9/f$a;->p:Lo9/f$a;

    new-instance v14, Lo9/f$a;

    const-string v12, "FAILED_PRECONDITION"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    new-instance v12, Lo9/f$a;

    const-string v10, "ABORTED"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lo9/f$a;->q:Lo9/f$a;

    new-instance v10, Lo9/f$a;

    const-string v8, "OUT_OF_RANGE"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    new-instance v8, Lo9/f$a;

    const-string v6, "UNIMPLEMENTED"

    const/16 v4, 0xc

    invoke-direct {v8, v6, v4}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lo9/f$a;->r:Lo9/f$a;

    new-instance v6, Lo9/f$a;

    const-string v4, "INTERNAL"

    const/16 v2, 0xd

    invoke-direct {v6, v4, v2}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lo9/f$a;->s:Lo9/f$a;

    new-instance v4, Lo9/f$a;

    const-string v2, "UNAVAILABLE"

    move-object/from16 v17, v6

    const/16 v6, 0xe

    invoke-direct {v4, v2, v6}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lo9/f$a;->t:Lo9/f$a;

    new-instance v2, Lo9/f$a;

    const-string v6, "DATA_LOSS"

    move-object/from16 v18, v4

    const/16 v4, 0xf

    invoke-direct {v2, v6, v4}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    new-instance v6, Lo9/f$a;

    const-string v4, "UNAUTHENTICATED"

    move-object/from16 v19, v2

    const/16 v2, 0x10

    invoke-direct {v6, v4, v2}, Lo9/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lo9/f$a;->u:Lo9/f$a;

    const/16 v4, 0x11

    new-array v4, v4, [Lo9/f$a;

    const/16 v16, 0x0

    aput-object v0, v4, v16

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v1, 0x2

    aput-object v3, v4, v1

    const/4 v1, 0x3

    aput-object v5, v4, v1

    const/4 v1, 0x4

    aput-object v7, v4, v1

    const/4 v1, 0x5

    aput-object v9, v4, v1

    const/4 v1, 0x6

    aput-object v11, v4, v1

    const/4 v1, 0x7

    aput-object v13, v4, v1

    const/16 v1, 0x8

    aput-object v15, v4, v1

    const/16 v1, 0x9

    aput-object v14, v4, v1

    const/16 v1, 0xa

    aput-object v12, v4, v1

    const/16 v1, 0xb

    aput-object v10, v4, v1

    const/16 v1, 0xc

    aput-object v8, v4, v1

    const/16 v1, 0xd

    aput-object v17, v4, v1

    const/16 v1, 0xe

    aput-object v18, v4, v1

    const/16 v1, 0xf

    aput-object v19, v4, v1

    aput-object v6, v4, v2

    sput-object v4, Lo9/f$a;->v:[Lo9/f$a;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    invoke-static {}, Lo9/f$a;->values()[Lo9/f$a;

    move-result-object v2

    array-length v3, v2

    move/from16 v4, v16

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {v1, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo9/f$a;

    if-nez v6, :cond_0

    move v7, v0

    goto :goto_1

    :cond_0
    move/from16 v7, v16

    :goto_1
    if-eqz v7, :cond_1

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {v1, v6, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Code value duplication between "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo9/f$a;
    .locals 1

    const-class v0, Lo9/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo9/f$a;

    return-object p0
.end method

.method public static values()[Lo9/f$a;
    .locals 1

    sget-object v0, Lo9/f$a;->v:[Lo9/f$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo9/f$a;

    return-object v0
.end method
