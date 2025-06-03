.class public final Lz4/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/w;
.implements La4/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public b:Lz4/w$a;

.field public c:La4/g$a;

.field public final synthetic d:Lz4/f;


# direct methods
.method public constructor <init>(Lz4/f;Lz4/h$d;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lz4/f$a;->d:Lz4/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Lz4/a;->q(Lz4/t$b;)Lz4/w$a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, Lz4/f$a;->b:Lz4/w$a;

    .line 12
    .line 13
    iget-object p1, p1, Lz4/a;->d:La4/g$a;

    .line 14
    .line 15
    new-instance v1, La4/g$a;

    .line 16
    .line 17
    iget-object p1, p1, La4/g$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, p1, v2, v0}, La4/g$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz4/t$b;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lz4/f$a;->c:La4/g$a;

    .line 24
    .line 25
    iput-object p2, p0, Lz4/f$a;->a:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method


# virtual methods
.method public final synthetic B()V
    .locals 0

    return-void
.end method

.method public final E(ILz4/t$b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->c:La4/g$a;

    invoke-virtual {p1}, La4/g$a;->c()V

    :cond_0
    return-void
.end method

.method public final H(ILz4/t$b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->c:La4/g$a;

    invoke-virtual {p1}, La4/g$a;->f()V

    :cond_0
    return-void
.end method

.method public final M(ILz4/t$b;Lz4/n;Lz4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->b:Lz4/w$a;

    invoke-virtual {p0, p4}, Lz4/f$a;->d(Lz4/q;)Lz4/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lz4/w$a;->f(Lz4/n;Lz4/q;)V

    :cond_0
    return-void
.end method

.method public final O(ILz4/t$b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->c:La4/g$a;

    invoke-virtual {p1}, La4/g$a;->b()V

    :cond_0
    return-void
.end method

.method public final P(ILz4/t$b;Ljava/lang/Exception;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->c:La4/g$a;

    invoke-virtual {p1, p3}, La4/g$a;->e(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public final U(ILz4/t$b;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->c:La4/g$a;

    invoke-virtual {p1, p3}, La4/g$a;->d(I)V

    :cond_0
    return-void
.end method

.method public final V(ILz4/t$b;Lz4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->b:Lz4/w$a;

    invoke-virtual {p0, p3}, Lz4/f$a;->d(Lz4/q;)Lz4/q;

    move-result-object p2

    invoke-virtual {p1, p2}, Lz4/w$a;->c(Lz4/q;)V

    :cond_0
    return-void
.end method

.method public final b(ILz4/t$b;)Z
    .locals 7

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lz4/f$a;->d:Lz4/f;

    .line 4
    .line 5
    iget-object v1, p0, Lz4/f$a;->a:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p2}, Lz4/f;->x(Ljava/lang/Object;Lz4/t$b;)Lz4/t$b;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    :cond_1
    iget-object v0, p0, Lz4/f$a;->d:Lz4/f;

    .line 17
    .line 18
    iget-object v1, p0, Lz4/f$a;->a:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Lz4/f;->z(ILjava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v0, p0, Lz4/f$a;->b:Lz4/w$a;

    .line 25
    .line 26
    iget v1, v0, Lz4/w$a;->a:I

    .line 27
    .line 28
    if-ne v1, p1, :cond_2

    .line 29
    .line 30
    iget-object v0, v0, Lz4/w$a;->b:Lz4/t$b;

    .line 31
    .line 32
    invoke-static {v0, p2}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, Lz4/f$a;->d:Lz4/f;

    .line 39
    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    iget-object v0, v0, Lz4/a;->c:Lz4/w$a;

    .line 43
    .line 44
    new-instance v6, Lz4/w$a;

    .line 45
    .line 46
    iget-object v1, v0, Lz4/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    move-object v0, v6

    .line 49
    move v2, p1

    .line 50
    move-object v3, p2

    .line 51
    invoke-direct/range {v0 .. v5}, Lz4/w$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz4/t$b;J)V

    .line 52
    .line 53
    .line 54
    iput-object v6, p0, Lz4/f$a;->b:Lz4/w$a;

    .line 55
    .line 56
    :cond_3
    iget-object v0, p0, Lz4/f$a;->c:La4/g$a;

    .line 57
    .line 58
    iget v1, v0, La4/g$a;->a:I

    .line 59
    .line 60
    if-ne v1, p1, :cond_4

    .line 61
    .line 62
    iget-object v0, v0, La4/g$a;->b:Lz4/t$b;

    .line 63
    .line 64
    invoke-static {v0, p2}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_5

    .line 69
    .line 70
    :cond_4
    iget-object v0, p0, Lz4/f$a;->d:Lz4/f;

    .line 71
    .line 72
    iget-object v0, v0, Lz4/a;->d:La4/g$a;

    .line 73
    .line 74
    new-instance v1, La4/g$a;

    .line 75
    .line 76
    iget-object v0, v0, La4/g$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 77
    .line 78
    invoke-direct {v1, v0, p1, p2}, La4/g$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz4/t$b;)V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, Lz4/f$a;->c:La4/g$a;

    .line 82
    .line 83
    :cond_5
    const/4 p1, 0x1

    .line 84
    return p1
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final d(Lz4/q;)Lz4/q;
    .locals 14

    iget-object v0, p0, Lz4/f$a;->d:Lz4/f;

    iget-object v1, p0, Lz4/f$a;->a:Ljava/lang/Object;

    iget-wide v2, p1, Lz4/q;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lz4/f;->y(Ljava/lang/Object;J)J

    move-result-wide v10

    iget-object v0, p0, Lz4/f$a;->d:Lz4/f;

    iget-object v1, p0, Lz4/f$a;->a:Ljava/lang/Object;

    iget-wide v2, p1, Lz4/q;->g:J

    invoke-virtual {v0, v1, v2, v3}, Lz4/f;->y(Ljava/lang/Object;J)J

    move-result-wide v12

    iget-wide v0, p1, Lz4/q;->f:J

    cmp-long v0, v10, v0

    if-nez v0, :cond_0

    iget-wide v0, p1, Lz4/q;->g:J

    cmp-long v0, v12, v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lz4/q;

    iget v5, p1, Lz4/q;->a:I

    iget v6, p1, Lz4/q;->b:I

    iget-object v7, p1, Lz4/q;->c:Lv3/i0;

    iget v8, p1, Lz4/q;->d:I

    iget-object v9, p1, Lz4/q;->e:Ljava/lang/Object;

    move-object v4, v0

    invoke-direct/range {v4 .. v13}, Lz4/q;-><init>(IILv3/i0;ILjava/lang/Object;JJ)V

    return-object v0
.end method

.method public final f0(ILz4/t$b;Lz4/n;Lz4/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->b:Lz4/w$a;

    invoke-virtual {p0, p4}, Lz4/f$a;->d(Lz4/q;)Lz4/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2, p5, p6}, Lz4/w$a;->l(Lz4/n;Lz4/q;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method

.method public final h0(ILz4/t$b;Lz4/n;Lz4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->b:Lz4/w$a;

    invoke-virtual {p0, p4}, Lz4/f$a;->d(Lz4/q;)Lz4/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lz4/w$a;->o(Lz4/n;Lz4/q;)V

    :cond_0
    return-void
.end method

.method public final j0(ILz4/t$b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->c:La4/g$a;

    invoke-virtual {p1}, La4/g$a;->a()V

    :cond_0
    return-void
.end method

.method public final n0(ILz4/t$b;Lz4/n;Lz4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->b:Lz4/w$a;

    invoke-virtual {p0, p4}, Lz4/f$a;->d(Lz4/q;)Lz4/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lz4/w$a;->i(Lz4/n;Lz4/q;)V

    :cond_0
    return-void
.end method

.method public final o0(ILz4/t$b;Lz4/q;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz4/f$a;->b(ILz4/t$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz4/f$a;->b:Lz4/w$a;

    invoke-virtual {p0, p3}, Lz4/f$a;->d(Lz4/q;)Lz4/q;

    move-result-object p2

    invoke-virtual {p1, p2}, Lz4/w$a;->p(Lz4/q;)V

    :cond_0
    return-void
.end method
