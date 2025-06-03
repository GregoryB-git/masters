.class public final Lb9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/g;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ly8/c;

.field public final d:Lb9/e;


# direct methods
.method public constructor <init>(Lb9/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb9/h;->a:Z

    iput-boolean v0, p0, Lb9/h;->b:Z

    iput-object p1, p0, Lb9/h;->d:Lb9/e;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/String;)Ly8/g;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lb9/h;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lb9/h;->a:Z

    .line 7
    .line 8
    iget-object v0, p0, Lb9/h;->d:Lb9/e;

    .line 9
    .line 10
    iget-object v1, p0, Lb9/h;->c:Ly8/c;

    .line 11
    .line 12
    iget-boolean v2, p0, Lb9/h;->b:Z

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1, v2}, Lb9/e;->f(Ly8/c;Ljava/lang/Object;Z)Lb9/e;

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance p1, Ly8/b;

    .line 19
    .line 20
    const-string v0, "Cannot encode a second value in the ValueEncoderContext"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ly8/b;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final g(Z)Ly8/g;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lb9/h;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lb9/h;->a:Z

    .line 7
    .line 8
    iget-object v0, p0, Lb9/h;->d:Lb9/e;

    .line 9
    .line 10
    iget-object v1, p0, Lb9/h;->c:Ly8/c;

    .line 11
    .line 12
    iget-boolean v2, p0, Lb9/h;->b:Z

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1, v2}, Lb9/e;->h(Ly8/c;IZ)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance p1, Ly8/b;

    .line 19
    .line 20
    const-string v0, "Cannot encode a second value in the ValueEncoderContext"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ly8/b;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
