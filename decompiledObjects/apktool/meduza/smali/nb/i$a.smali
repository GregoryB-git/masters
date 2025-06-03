.class public final Lnb/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb/i$a$a;
    }
.end annotation


# instance fields
.field public a:Lnb/i$f;

.field public volatile b:Lnb/i$a$a;

.field public c:Lnb/i$a$a;

.field public d:Ljava/lang/Long;

.field public e:I

.field public final f:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Lnb/i$f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnb/i$a$a;

    invoke-direct {v0}, Lnb/i$a$a;-><init>()V

    iput-object v0, p0, Lnb/i$a;->b:Lnb/i$a$a;

    new-instance v0, Lnb/i$a$a;

    invoke-direct {v0}, Lnb/i$a$a;-><init>()V

    iput-object v0, p0, Lnb/i$a;->c:Lnb/i$a$a;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lnb/i$a;->f:Ljava/util/HashSet;

    iput-object p1, p0, Lnb/i$a;->a:Lnb/i$f;

    return-void
.end method


# virtual methods
.method public final a(Lnb/i$h;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lnb/i$a;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p1, Lnb/i$h;->c:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lnb/i$h;->k()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lnb/i$a;->d()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-boolean v0, p1, Lnb/i$h;->c:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p1, Lnb/i$h;->c:Z

    .line 27
    .line 28
    iget-object v1, p1, Lnb/i$h;->d:Leb/o;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v2, p1, Lnb/i$h;->e:Leb/k0$k;

    .line 33
    .line 34
    invoke-interface {v2, v1}, Leb/k0$k;->a(Leb/o;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p1, Lnb/i$h;->f:Leb/d;

    .line 38
    .line 39
    sget-object v2, Leb/d$a;->b:Leb/d$a;

    .line 40
    .line 41
    const/4 v3, 0x1

    .line 42
    new-array v3, v3, [Ljava/lang/Object;

    .line 43
    .line 44
    aput-object p1, v3, v0

    .line 45
    .line 46
    const-string v0, "Subchannel unejected: {0}"

    .line 47
    .line 48
    invoke-virtual {v1, v2, v0, v3}, Leb/d;->b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    iput-object p0, p1, Lnb/i$h;->b:Lnb/i$a;

    .line 52
    .line 53
    iget-object v0, p0, Lnb/i$a;->f:Ljava/util/HashSet;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    return-void
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

.method public final b(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lnb/i$a;->d:Ljava/lang/Long;

    iget p1, p0, Lnb/i$a;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lnb/i$a;->e:I

    iget-object p1, p0, Lnb/i$a;->f:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lnb/i$h;

    invoke-virtual {p2}, Lnb/i$h;->k()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c()J
    .locals 4

    iget-object v0, p0, Lnb/i$a;->c:Lnb/i$a$a;

    iget-object v0, v0, Lnb/i$a$a;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    iget-object v2, p0, Lnb/i$a;->c:Lnb/i$a$a;

    iget-object v2, v2, Lnb/i$a$a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lnb/i$a;->d:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e()V
    .locals 7

    .line 1
    iget-object v0, p0, Lnb/i$a;->d:Ljava/lang/Long;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    const-string v3, "not currently ejected"

    .line 11
    .line 12
    invoke-static {v0, v3}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lnb/i$a;->d:Ljava/lang/Long;

    .line 17
    .line 18
    iget-object v0, p0, Lnb/i$a;->f:Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lnb/i$h;

    .line 35
    .line 36
    iput-boolean v2, v3, Lnb/i$h;->c:Z

    .line 37
    .line 38
    iget-object v4, v3, Lnb/i$h;->d:Leb/o;

    .line 39
    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    iget-object v5, v3, Lnb/i$h;->e:Leb/k0$k;

    .line 43
    .line 44
    invoke-interface {v5, v4}, Leb/k0$k;->a(Leb/o;)V

    .line 45
    .line 46
    .line 47
    iget-object v4, v3, Lnb/i$h;->f:Leb/d;

    .line 48
    .line 49
    sget-object v5, Leb/d$a;->b:Leb/d$a;

    .line 50
    .line 51
    new-array v6, v1, [Ljava/lang/Object;

    .line 52
    .line 53
    aput-object v3, v6, v2

    .line 54
    .line 55
    const-string v3, "Subchannel unejected: {0}"

    .line 56
    .line 57
    invoke-virtual {v4, v5, v3, v6}, Leb/d;->b(Leb/d$a;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    return-void
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "AddressTracker{subchannels="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lnb/i$a;->f:Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x7d

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
