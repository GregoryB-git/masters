.class public final enum Lmc/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmc/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lmc/c;

.field public static final enum c:Lmc/c;

.field public static final enum d:Lmc/c;

.field public static final enum e:Lmc/c;

.field public static final enum f:Lmc/c;

.field public static final enum o:Lmc/c;

.field public static final synthetic p:[Lmc/c;


# instance fields
.field public final a:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lmc/c;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v2, "NANOSECONDS"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lmc/c;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lmc/c;->b:Lmc/c;

    new-instance v1, Lmc/c;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v4, "MICROSECONDS"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lmc/c;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    new-instance v2, Lmc/c;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v6, "MILLISECONDS"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lmc/c;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v2, Lmc/c;->c:Lmc/c;

    new-instance v4, Lmc/c;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v8, "SECONDS"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lmc/c;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v4, Lmc/c;->d:Lmc/c;

    new-instance v6, Lmc/c;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v10, "MINUTES"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lmc/c;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v6, Lmc/c;->e:Lmc/c;

    new-instance v8, Lmc/c;

    sget-object v10, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-string v12, "HOURS"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, Lmc/c;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v8, Lmc/c;->f:Lmc/c;

    new-instance v10, Lmc/c;

    sget-object v12, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-string v14, "DAYS"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, Lmc/c;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v10, Lmc/c;->o:Lmc/c;

    const/4 v12, 0x7

    new-array v12, v12, [Lmc/c;

    aput-object v0, v12, v3

    aput-object v1, v12, v5

    aput-object v2, v12, v7

    aput-object v4, v12, v9

    aput-object v6, v12, v11

    aput-object v8, v12, v13

    aput-object v10, v12, v15

    sput-object v12, Lmc/c;->p:[Lmc/c;

    invoke-static {v12}, Lp2/m0;->D([Ljava/lang/Enum;)Lxb/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/TimeUnit;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lmc/c;->a:Ljava/util/concurrent/TimeUnit;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lmc/c;
    .locals 1

    const-class v0, Lmc/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmc/c;

    return-object p0
.end method

.method public static values()[Lmc/c;
    .locals 1

    sget-object v0, Lmc/c;->p:[Lmc/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmc/c;

    return-object v0
.end method
