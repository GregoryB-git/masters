.class public Lq0/m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/s$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq0/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic o:Lq0/m;


# direct methods
.method public constructor <init>(Lq0/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq0/m$b;->o:Lq0/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq0/m;Lq0/m$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lq0/m$b;-><init>(Lq0/m;)V

    return-void
.end method


# virtual methods
.method public a(Lq0/s;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lq0/m$b;->o:Lq0/m;

    .line 2
    .line 3
    invoke-static {p1}, Lq0/m;->r(Lq0/m;)Lx0/v$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lq0/m$b;->o:Lq0/m;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Lx0/S$a;->e(Lx0/S;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public bridge synthetic e(Lx0/S;)V
    .locals 0

    .line 1
    check-cast p1, Lq0/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lq0/m$b;->a(Lq0/s;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m(Landroid/net/Uri;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/m$b;->o:Lq0/m;

    .line 2
    .line 3
    invoke-static {v0}, Lq0/m;->t(Lq0/m;)Lr0/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Lr0/k;->i(Landroid/net/Uri;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public o()V
    .locals 11

    .line 1
    iget-object v0, p0, Lq0/m$b;->o:Lq0/m;

    .line 2
    .line 3
    invoke-static {v0}, Lq0/m;->k(Lq0/m;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lq0/m$b;->o:Lq0/m;

    .line 11
    .line 12
    invoke-static {v0}, Lq0/m;->m(Lq0/m;)[Lq0/s;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    array-length v1, v0

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    move v4, v3

    .line 20
    :goto_0
    if-ge v3, v1, :cond_1

    .line 21
    .line 22
    aget-object v5, v0, v3

    .line 23
    .line 24
    invoke-virtual {v5}, Lq0/s;->n()Lx0/Z;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    iget v5, v5, Lx0/Z;->a:I

    .line 29
    .line 30
    add-int/2addr v4, v5

    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-array v0, v4, [Ld0/J;

    .line 35
    .line 36
    iget-object v1, p0, Lq0/m$b;->o:Lq0/m;

    .line 37
    .line 38
    invoke-static {v1}, Lq0/m;->m(Lq0/m;)[Lq0/s;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    array-length v3, v1

    .line 43
    move v4, v2

    .line 44
    move v5, v4

    .line 45
    :goto_1
    if-ge v4, v3, :cond_3

    .line 46
    .line 47
    aget-object v6, v1, v4

    .line 48
    .line 49
    invoke-virtual {v6}, Lq0/s;->n()Lx0/Z;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    iget v7, v7, Lx0/Z;->a:I

    .line 54
    .line 55
    move v8, v2

    .line 56
    :goto_2
    if-ge v8, v7, :cond_2

    .line 57
    .line 58
    add-int/lit8 v9, v5, 0x1

    .line 59
    .line 60
    invoke-virtual {v6}, Lq0/s;->n()Lx0/Z;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    invoke-virtual {v10, v8}, Lx0/Z;->b(I)Ld0/J;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    aput-object v10, v0, v5

    .line 69
    .line 70
    add-int/lit8 v8, v8, 0x1

    .line 71
    .line 72
    move v5, v9

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    iget-object v1, p0, Lq0/m$b;->o:Lq0/m;

    .line 78
    .line 79
    new-instance v2, Lx0/Z;

    .line 80
    .line 81
    invoke-direct {v2, v0}, Lx0/Z;-><init>([Ld0/J;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v2}, Lq0/m;->o(Lq0/m;Lx0/Z;)Lx0/Z;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lq0/m$b;->o:Lq0/m;

    .line 88
    .line 89
    invoke-static {v0}, Lq0/m;->r(Lq0/m;)Lx0/v$a;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v1, p0, Lq0/m$b;->o:Lq0/m;

    .line 94
    .line 95
    invoke-interface {v0, v1}, Lx0/v$a;->k(Lx0/v;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method
