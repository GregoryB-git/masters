.class public final enum Ls7/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls7/c;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum a:Ls7/c;

.field public static final synthetic b:[Ls7/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls7/c;

    invoke-direct {v0}, Ls7/c;-><init>()V

    sput-object v0, Ls7/c;->a:Ls7/c;

    const/4 v1, 0x1

    new-array v1, v1, [Ls7/c;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Ls7/c;->b:[Ls7/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "INSTANCE"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ls7/c;
    .locals 1

    const-class v0, Ls7/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls7/c;

    return-object p0
.end method

.method public static values()[Ls7/c;
    .locals 1

    sget-object v0, Ls7/c;->b:[Ls7/c;

    invoke-virtual {v0}, [Ls7/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls7/c;

    return-object v0
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MoreExecutors.directExecutor()"

    return-object v0
.end method
