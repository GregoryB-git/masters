.class public Lc4/t$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc4/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:J

.field public final b:Lc4/t$a;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lc4/t$b;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lc4/t$b;->a:J

    new-instance p1, Lc4/t$a;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_0

    sget-object p2, Lc4/u;->c:Lc4/u;

    goto :goto_0

    :cond_0
    new-instance p2, Lc4/u;

    invoke-direct {p2, v0, v1, p3, p4}, Lc4/u;-><init>(JJ)V

    .line 1
    :goto_0
    invoke-direct {p1, p2, p2}, Lc4/t$a;-><init>(Lc4/u;Lc4/u;)V

    .line 2
    iput-object p1, p0, Lc4/t$b;->b:Lc4/t$a;

    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g(J)Lc4/t$a;
    .locals 0

    iget-object p1, p0, Lc4/t$b;->b:Lc4/t$a;

    return-object p1
.end method

.method public final h()J
    .locals 2

    iget-wide v0, p0, Lc4/t$b;->a:J

    return-wide v0
.end method
