.class public final Ll4/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lc4/o;

.field public b:Lc4/o$a;

.field public c:J

.field public d:J


# direct methods
.method public constructor <init>(Lc4/o;Lc4/o$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/b$a;->a:Lc4/o;

    iput-object p2, p0, Ll4/b$a;->b:Lc4/o$a;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Ll4/b$a;->c:J

    iput-wide p1, p0, Ll4/b$a;->d:J

    return-void
.end method


# virtual methods
.method public final a()Lc4/t;
    .locals 4

    iget-wide v0, p0, Ll4/b$a;->c:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx6/b;->H(Z)V

    new-instance v0, Lc4/n;

    iget-object v1, p0, Ll4/b$a;->a:Lc4/o;

    iget-wide v2, p0, Ll4/b$a;->c:J

    invoke-direct {v0, v1, v2, v3}, Lc4/n;-><init>(Lc4/o;J)V

    return-object v0
.end method

.method public final b(Lc4/i;)J
    .locals 6

    iget-wide v0, p0, Ll4/b$a;->d:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    const-wide/16 v2, -0x1

    if-ltz p1, :cond_0

    const-wide/16 v4, 0x2

    add-long/2addr v0, v4

    neg-long v0, v0

    iput-wide v2, p0, Ll4/b$a;->d:J

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public final c(J)V
    .locals 2

    iget-object v0, p0, Ll4/b$a;->b:Lc4/o$a;

    iget-object v0, v0, Lc4/o$a;->a:[J

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Lv5/e0;->f([JJZ)I

    move-result p1

    aget-wide p1, v0, p1

    iput-wide p1, p0, Ll4/b$a;->d:J

    return-void
.end method
