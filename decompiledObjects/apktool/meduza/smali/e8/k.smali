.class public final enum Le8/k;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le8/k;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum a:Le8/k;

.field public static final b:Landroid/os/Handler;

.field public static final synthetic c:[Le8/k;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Le8/k;

    invoke-direct {v0}, Le8/k;-><init>()V

    sput-object v0, Le8/k;->a:Le8/k;

    const/4 v1, 0x1

    new-array v1, v1, [Le8/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Le8/k;->c:[Le8/k;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Le8/k;->b:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "INSTANCE"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le8/k;
    .locals 1

    const-class v0, Le8/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le8/k;

    return-object p0
.end method

.method public static values()[Le8/k;
    .locals 1

    sget-object v0, Le8/k;->c:[Le8/k;

    invoke-virtual {v0}, [Le8/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le8/k;

    return-object v0
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Le8/k;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
