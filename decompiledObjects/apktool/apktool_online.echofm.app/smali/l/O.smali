.class public Ll/O;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ll/O;->a:I

    .line 6
    .line 7
    iput v0, p0, Ll/O;->b:I

    .line 8
    .line 9
    const/high16 v1, -0x80000000

    .line 10
    .line 11
    iput v1, p0, Ll/O;->c:I

    .line 12
    .line 13
    iput v1, p0, Ll/O;->d:I

    .line 14
    .line 15
    iput v0, p0, Ll/O;->e:I

    .line 16
    .line 17
    iput v0, p0, Ll/O;->f:I

    .line 18
    .line 19
    iput-boolean v0, p0, Ll/O;->g:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Ll/O;->h:Z

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll/O;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ll/O;->a:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, p0, Ll/O;->b:I

    .line 9
    .line 10
    :goto_0
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Ll/O;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Ll/O;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll/O;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ll/O;->b:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, p0, Ll/O;->a:I

    .line 9
    .line 10
    :goto_0
    return v0
.end method

.method public e(II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ll/O;->h:Z

    .line 3
    .line 4
    const/high16 v0, -0x80000000

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    iput p1, p0, Ll/O;->e:I

    .line 9
    .line 10
    iput p1, p0, Ll/O;->a:I

    .line 11
    .line 12
    :cond_0
    if-eq p2, v0, :cond_1

    .line 13
    .line 14
    iput p2, p0, Ll/O;->f:I

    .line 15
    .line 16
    iput p2, p0, Ll/O;->b:I

    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public f(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll/O;->g:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Ll/O;->g:Z

    .line 7
    .line 8
    iget-boolean v0, p0, Ll/O;->h:Z

    .line 9
    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    const/high16 v0, -0x80000000

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iget p1, p0, Ll/O;->d:I

    .line 17
    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget p1, p0, Ll/O;->e:I

    .line 22
    .line 23
    :goto_0
    iput p1, p0, Ll/O;->a:I

    .line 24
    .line 25
    iget p1, p0, Ll/O;->c:I

    .line 26
    .line 27
    if-eq p1, v0, :cond_5

    .line 28
    .line 29
    :goto_1
    iput p1, p0, Ll/O;->b:I

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_2
    iget p1, p0, Ll/O;->c:I

    .line 33
    .line 34
    if-eq p1, v0, :cond_3

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    iget p1, p0, Ll/O;->e:I

    .line 38
    .line 39
    :goto_2
    iput p1, p0, Ll/O;->a:I

    .line 40
    .line 41
    iget p1, p0, Ll/O;->d:I

    .line 42
    .line 43
    if-eq p1, v0, :cond_5

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_4
    iget p1, p0, Ll/O;->e:I

    .line 47
    .line 48
    iput p1, p0, Ll/O;->a:I

    .line 49
    .line 50
    :cond_5
    iget p1, p0, Ll/O;->f:I

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :goto_3
    return-void
.end method

.method public g(II)V
    .locals 2

    .line 1
    iput p1, p0, Ll/O;->c:I

    .line 2
    .line 3
    iput p2, p0, Ll/O;->d:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ll/O;->h:Z

    .line 7
    .line 8
    iget-boolean v0, p0, Ll/O;->g:Z

    .line 9
    .line 10
    const/high16 v1, -0x80000000

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-eq p2, v1, :cond_0

    .line 15
    .line 16
    iput p2, p0, Ll/O;->a:I

    .line 17
    .line 18
    :cond_0
    if-eq p1, v1, :cond_3

    .line 19
    .line 20
    iput p1, p0, Ll/O;->b:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    if-eq p1, v1, :cond_2

    .line 24
    .line 25
    iput p1, p0, Ll/O;->a:I

    .line 26
    .line 27
    :cond_2
    if-eq p2, v1, :cond_3

    .line 28
    .line 29
    iput p2, p0, Ll/O;->b:I

    .line 30
    .line 31
    :cond_3
    :goto_0
    return-void
.end method
