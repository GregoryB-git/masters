.class public final Ly0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/T;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ld0/q;

.field public final d:LF0/n;

.field public e:Ld0/q;

.field public f:LF0/T;

.field public g:J


# direct methods
.method public constructor <init>(IILd0/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ly0/d$a;->a:I

    .line 5
    .line 6
    iput p2, p0, Ly0/d$a;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Ly0/d$a;->c:Ld0/q;

    .line 9
    .line 10
    new-instance p1, LF0/n;

    .line 11
    .line 12
    invoke-direct {p1}, LF0/n;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ly0/d$a;->d:LF0/n;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public a(Lg0/z;II)V
    .locals 0

    .line 1
    iget-object p3, p0, Ly0/d$a;->f:LF0/T;

    .line 2
    .line 3
    invoke-static {p3}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    check-cast p3, LF0/T;

    .line 8
    .line 9
    invoke-interface {p3, p1, p2}, LF0/T;->e(Lg0/z;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b(JIIILF0/T$a;)V
    .locals 8

    .line 1
    iget-wide v0, p0, Ly0/d$a;->g:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-ltz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Ly0/d$a;->d:LF0/n;

    .line 17
    .line 18
    iput-object v0, p0, Ly0/d$a;->f:LF0/T;

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Ly0/d$a;->f:LF0/T;

    .line 21
    .line 22
    invoke-static {v0}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v1, v0

    .line 27
    check-cast v1, LF0/T;

    .line 28
    .line 29
    move-wide v2, p1

    .line 30
    move v4, p3

    .line 31
    move v5, p4

    .line 32
    move v6, p5

    .line 33
    move-object v7, p6

    .line 34
    invoke-interface/range {v1 .. v7}, LF0/T;->b(JIIILF0/T$a;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public c(Ld0/i;IZI)I
    .locals 0

    .line 1
    iget-object p4, p0, Ly0/d$a;->f:LF0/T;

    .line 2
    .line 3
    invoke-static {p4}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p4

    .line 7
    check-cast p4, LF0/T;

    .line 8
    .line 9
    invoke-interface {p4, p1, p2, p3}, LF0/T;->f(Ld0/i;IZ)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public d(Ld0/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly0/d$a;->c:Ld0/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ld0/q;->h(Ld0/q;)Ld0/q;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    iput-object p1, p0, Ly0/d$a;->e:Ld0/q;

    .line 10
    .line 11
    iget-object p1, p0, Ly0/d$a;->f:LF0/T;

    .line 12
    .line 13
    invoke-static {p1}, Lg0/M;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, LF0/T;

    .line 18
    .line 19
    iget-object v0, p0, Ly0/d$a;->e:Ld0/q;

    .line 20
    .line 21
    invoke-interface {p1, v0}, LF0/T;->d(Ld0/q;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public synthetic e(Lg0/z;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LF0/S;->b(LF0/T;Lg0/z;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic f(Ld0/i;IZ)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LF0/S;->a(LF0/T;Ld0/i;IZ)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public g(Ly0/f$b;J)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Ly0/d$a;->d:LF0/n;

    .line 4
    .line 5
    iput-object p1, p0, Ly0/d$a;->f:LF0/T;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput-wide p2, p0, Ly0/d$a;->g:J

    .line 9
    .line 10
    iget p2, p0, Ly0/d$a;->a:I

    .line 11
    .line 12
    iget p3, p0, Ly0/d$a;->b:I

    .line 13
    .line 14
    invoke-interface {p1, p2, p3}, Ly0/f$b;->a(II)LF0/T;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Ly0/d$a;->f:LF0/T;

    .line 19
    .line 20
    iget-object p2, p0, Ly0/d$a;->e:Ld0/q;

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    invoke-interface {p1, p2}, LF0/T;->d(Ld0/q;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method
