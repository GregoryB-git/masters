.class public final Lj/g$a;
.super Le0/q0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public b:Z

.field public c:I

.field public final synthetic d:Lj/g;


# direct methods
.method public constructor <init>(Lj/g;)V
    .locals 0

    iput-object p1, p0, Lj/g$a;->d:Lj/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Le0/q0;-><init>(I)V

    iput-boolean p1, p0, Lj/g$a;->b:Z

    iput p1, p0, Lj/g$a;->c:I

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    iget-boolean v0, p0, Lj/g$a;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/g$a;->b:Z

    iget-object v0, p0, Lj/g$a;->d:Lj/g;

    iget-object v0, v0, Lj/g;->d:Le0/p0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Le0/p0;->b()V

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget v0, p0, Lj/g$a;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lj/g$a;->c:I

    .line 6
    .line 7
    iget-object v1, p0, Lj/g$a;->d:Lj/g;

    .line 8
    .line 9
    iget-object v1, v1, Lj/g;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lj/g$a;->d:Lj/g;

    .line 18
    .line 19
    iget-object v0, v0, Lj/g;->d:Le0/p0;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {v0}, Le0/p0;->c()V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    iput v0, p0, Lj/g$a;->c:I

    .line 28
    .line 29
    iput-boolean v0, p0, Lj/g$a;->b:Z

    .line 30
    .line 31
    iget-object v1, p0, Lj/g$a;->d:Lj/g;

    .line 32
    .line 33
    iput-boolean v0, v1, Lj/g;->e:Z

    .line 34
    .line 35
    :cond_1
    return-void
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
.end method
