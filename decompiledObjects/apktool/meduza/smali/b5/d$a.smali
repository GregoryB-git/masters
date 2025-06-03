.class public final Lb5/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:Lv3/i0;

.field public final c:Lc4/g;

.field public d:Lv3/i0;

.field public e:Lc4/v;

.field public f:J


# direct methods
.method public constructor <init>(IILv3/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lb5/d$a;->a:I

    iput-object p3, p0, Lb5/d$a;->b:Lv3/i0;

    new-instance p1, Lc4/g;

    invoke-direct {p1}, Lc4/g;-><init>()V

    iput-object p1, p0, Lb5/d$a;->c:Lc4/g;

    return-void
.end method


# virtual methods
.method public final a(ILv5/u;)V
    .locals 2

    iget-object v0, p0, Lb5/d$a;->e:Lc4/v;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0, p1, p2}, Lc4/v;->b(ILv5/u;)V

    return-void
.end method

.method public final b(ILv5/u;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb5/d$a;->a(ILv5/u;)V

    return-void
.end method

.method public final c(JIIILc4/v$a;)V
    .locals 8

    iget-wide v0, p0, Lb5/d$a;->f:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lb5/d$a;->c:Lc4/g;

    iput-object v0, p0, Lb5/d$a;->e:Lc4/v;

    :cond_0
    iget-object v1, p0, Lb5/d$a;->e:Lc4/v;

    sget v0, Lv5/e0;->a:I

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lc4/v;->c(JIIILc4/v$a;)V

    return-void
.end method

.method public final d(Lv3/i0;)V
    .locals 2

    iget-object v0, p0, Lb5/d$a;->b:Lv3/i0;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lv3/i0;->d(Lv3/i0;)Lv3/i0;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lb5/d$a;->d:Lv3/i0;

    iget-object v0, p0, Lb5/d$a;->e:Lc4/v;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0, p1}, Lc4/v;->d(Lv3/i0;)V

    return-void
.end method

.method public final e(Lt5/h;IZ)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lb5/d$a;->g(Lt5/h;IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lb5/f$a;J)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Lb5/d$a;->c:Lc4/g;

    iput-object p1, p0, Lb5/d$a;->e:Lc4/v;

    return-void

    :cond_0
    iput-wide p2, p0, Lb5/d$a;->f:J

    iget p2, p0, Lb5/d$a;->a:I

    check-cast p1, Lb5/c;

    invoke-virtual {p1, p2}, Lb5/c;->a(I)Lc4/v;

    move-result-object p1

    iput-object p1, p0, Lb5/d$a;->e:Lc4/v;

    iget-object p2, p0, Lb5/d$a;->d:Lv3/i0;

    if-eqz p2, :cond_1

    invoke-interface {p1, p2}, Lc4/v;->d(Lv3/i0;)V

    :cond_1
    return-void
.end method

.method public final g(Lt5/h;IZ)I
    .locals 2

    iget-object v0, p0, Lb5/d$a;->e:Lc4/v;

    sget v1, Lv5/e0;->a:I

    invoke-interface {v0, p1, p2, p3}, Lc4/v;->e(Lt5/h;IZ)I

    move-result p1

    return p1
.end method
