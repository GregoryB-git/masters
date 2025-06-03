.class public final Lxc/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Lxc/t;

.field public g:Lxc/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, Lxc/t;->a:[B

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxc/t;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lxc/t;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZZ)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxc/t;->a:[B

    iput p2, p0, Lxc/t;->b:I

    iput p3, p0, Lxc/t;->c:I

    iput-boolean p4, p0, Lxc/t;->d:Z

    iput-boolean p5, p0, Lxc/t;->e:Z

    return-void
.end method


# virtual methods
.method public final a()Lxc/t;
    .locals 4

    iget-object v0, p0, Lxc/t;->f:Lxc/t;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lxc/t;->g:Lxc/t;

    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Lxc/t;->f:Lxc/t;

    iput-object v3, v2, Lxc/t;->f:Lxc/t;

    iget-object v2, p0, Lxc/t;->f:Lxc/t;

    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Lxc/t;->g:Lxc/t;

    iput-object v3, v2, Lxc/t;->g:Lxc/t;

    iput-object v1, p0, Lxc/t;->f:Lxc/t;

    iput-object v1, p0, Lxc/t;->g:Lxc/t;

    return-object v0
.end method

.method public final b(Lxc/t;)V
    .locals 1

    iput-object p0, p1, Lxc/t;->g:Lxc/t;

    iget-object v0, p0, Lxc/t;->f:Lxc/t;

    iput-object v0, p1, Lxc/t;->f:Lxc/t;

    iget-object v0, p0, Lxc/t;->f:Lxc/t;

    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    iput-object p1, v0, Lxc/t;->g:Lxc/t;

    iput-object p1, p0, Lxc/t;->f:Lxc/t;

    return-void
.end method

.method public final c()Lxc/t;
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxc/t;->d:Z

    new-instance v0, Lxc/t;

    iget-object v2, p0, Lxc/t;->a:[B

    iget v3, p0, Lxc/t;->b:I

    iget v4, p0, Lxc/t;->c:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lxc/t;-><init>([BIIZZ)V

    return-object v0
.end method

.method public final d(Lxc/t;I)V
    .locals 5

    .line 1
    iget-boolean v0, p1, Lxc/t;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget v0, p1, Lxc/t;->c:I

    .line 6
    .line 7
    add-int v1, v0, p2

    .line 8
    .line 9
    const/16 v2, 0x2000

    .line 10
    .line 11
    if-le v1, v2, :cond_2

    .line 12
    .line 13
    iget-boolean v3, p1, Lxc/t;->d:Z

    .line 14
    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    iget v3, p1, Lxc/t;->b:I

    .line 18
    .line 19
    sub-int/2addr v1, v3

    .line 20
    if-gt v1, v2, :cond_0

    .line 21
    .line 22
    iget-object v1, p1, Lxc/t;->a:[B

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v1, v2, v1, v3, v0}, Lsb/j;->k([BI[BII)V

    .line 26
    .line 27
    .line 28
    iget v0, p1, Lxc/t;->c:I

    .line 29
    .line 30
    iget v1, p1, Lxc/t;->b:I

    .line 31
    .line 32
    sub-int/2addr v0, v1

    .line 33
    iput v0, p1, Lxc/t;->c:I

    .line 34
    .line 35
    iput v2, p1, Lxc/t;->b:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    :goto_0
    iget-object v0, p0, Lxc/t;->a:[B

    .line 51
    .line 52
    iget-object v1, p1, Lxc/t;->a:[B

    .line 53
    .line 54
    iget v2, p1, Lxc/t;->c:I

    .line 55
    .line 56
    iget v3, p0, Lxc/t;->b:I

    .line 57
    .line 58
    add-int v4, v3, p2

    .line 59
    .line 60
    invoke-static {v0, v2, v1, v3, v4}, Lsb/j;->k([BI[BII)V

    .line 61
    .line 62
    .line 63
    iget v0, p1, Lxc/t;->c:I

    .line 64
    .line 65
    add-int/2addr v0, p2

    .line 66
    iput v0, p1, Lxc/t;->c:I

    .line 67
    .line 68
    iget p1, p0, Lxc/t;->b:I

    .line 69
    .line 70
    add-int/2addr p1, p2

    .line 71
    iput p1, p0, Lxc/t;->b:I

    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string p2, "only owner can write"

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1
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
