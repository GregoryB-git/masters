.class public final enum Lo2/o$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo2/o$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lo2/o$b;

.field public static final enum b:Lo2/o$b;

.field public static final enum c:Lo2/o$b;

.field public static final enum d:Lo2/o$b;

.field public static final enum e:Lo2/o$b;

.field public static final enum f:Lo2/o$b;

.field public static final synthetic o:[Lo2/o$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, Lo2/o$b;

    const-string v1, "ENQUEUED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo2/o$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo2/o$b;->a:Lo2/o$b;

    new-instance v1, Lo2/o$b;

    const-string v3, "RUNNING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lo2/o$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo2/o$b;->b:Lo2/o$b;

    new-instance v3, Lo2/o$b;

    const-string v5, "SUCCEEDED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lo2/o$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lo2/o$b;->c:Lo2/o$b;

    new-instance v5, Lo2/o$b;

    const-string v7, "FAILED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lo2/o$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lo2/o$b;->d:Lo2/o$b;

    new-instance v7, Lo2/o$b;

    const-string v9, "BLOCKED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lo2/o$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lo2/o$b;->e:Lo2/o$b;

    new-instance v9, Lo2/o$b;

    const-string v11, "CANCELLED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lo2/o$b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lo2/o$b;->f:Lo2/o$b;

    const/4 v11, 0x6

    new-array v11, v11, [Lo2/o$b;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lo2/o$b;->o:[Lo2/o$b;

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

.method public static valueOf(Ljava/lang/String;)Lo2/o$b;
    .locals 1

    const-class v0, Lo2/o$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo2/o$b;

    return-object p0
.end method

.method public static values()[Lo2/o$b;
    .locals 1

    sget-object v0, Lo2/o$b;->o:[Lo2/o$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo2/o$b;

    return-object v0
.end method


# virtual methods
.method public final f()Z
    .locals 1

    sget-object v0, Lo2/o$b;->c:Lo2/o$b;

    if-eq p0, v0, :cond_1

    sget-object v0, Lo2/o$b;->d:Lo2/o$b;

    if-eq p0, v0, :cond_1

    sget-object v0, Lo2/o$b;->f:Lo2/o$b;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
