.class public final Le7/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J

.field public final f:Le7/a0;


# direct methods
.method public constructor <init>(Le7/j2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p4}, Lm6/j;->e(Ljava/lang/String;)V

    iput-object p3, p0, Le7/y;->a:Ljava/lang/String;

    iput-object p4, p0, Le7/y;->b:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, Le7/y;->c:Ljava/lang/String;

    iput-wide p5, p0, Le7/y;->d:J

    iput-wide p7, p0, Le7/y;->e:J

    const-wide/16 v0, 0x0

    cmp-long p2, p7, v0

    if-eqz p2, :cond_1

    cmp-long p2, p7, p5

    if-lez p2, :cond_1

    invoke-virtual {p1}, Le7/j2;->zzj()Le7/a1;

    move-result-object p2

    .line 1
    iget-object p2, p2, Le7/a1;->r:Le7/b1;

    .line 2
    invoke-static {p3}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    move-result-object p3

    const-string p4, "Event created with reverse previous/current timestamps. appId"

    invoke-virtual {p2, p4, p3}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    if-eqz p9, :cond_5

    invoke-virtual {p9}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2, p9}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {p2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    if-nez p4, :cond_2

    invoke-virtual {p1}, Le7/j2;->zzj()Le7/a1;

    move-result-object p4

    .line 3
    iget-object p4, p4, Le7/a1;->o:Le7/b1;

    const-string p5, "Param name can\'t be null"

    .line 4
    invoke-virtual {p4, p5}, Le7/b1;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Le7/j2;->m()Le7/r6;

    move-result-object p5

    invoke-virtual {p2, p4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p6

    invoke-virtual {p5, p6, p4}, Le7/r6;->f0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p5

    if-nez p5, :cond_3

    invoke-virtual {p1}, Le7/j2;->zzj()Le7/a1;

    move-result-object p5

    .line 5
    iget-object p5, p5, Le7/a1;->r:Le7/b1;

    .line 6
    iget-object p6, p1, Le7/j2;->u:Le7/x0;

    .line 7
    invoke-virtual {p6, p4}, Le7/x0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-string p6, "Param value can\'t be null"

    invoke-virtual {p5, p6, p4}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Le7/j2;->m()Le7/r6;

    move-result-object p6

    invoke-virtual {p6, p2, p4, p5}, Le7/r6;->E(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    new-instance p1, Le7/a0;

    invoke-direct {p1, p2}, Le7/a0;-><init>(Landroid/os/Bundle;)V

    goto :goto_2

    :cond_5
    new-instance p1, Le7/a0;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p1, p2}, Le7/a0;-><init>(Landroid/os/Bundle;)V

    :goto_2
    iput-object p1, p0, Le7/y;->f:Le7/a0;

    return-void
.end method

.method public constructor <init>(Le7/j2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLe7/a0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p4}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static {p9}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p3, p0, Le7/y;->a:Ljava/lang/String;

    iput-object p4, p0, Le7/y;->b:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, Le7/y;->c:Ljava/lang/String;

    iput-wide p5, p0, Le7/y;->d:J

    iput-wide p7, p0, Le7/y;->e:J

    const-wide/16 v0, 0x0

    cmp-long p2, p7, v0

    if-eqz p2, :cond_1

    cmp-long p2, p7, p5

    if-lez p2, :cond_1

    invoke-virtual {p1}, Le7/j2;->zzj()Le7/a1;

    move-result-object p1

    .line 8
    iget-object p1, p1, Le7/a1;->r:Le7/b1;

    .line 9
    invoke-static {p3}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    move-result-object p2

    invoke-static {p4}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    move-result-object p3

    const-string p4, "Event created with reverse previous/current timestamps. appId, name"

    invoke-virtual {p1, p4, p2, p3}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    iput-object p9, p0, Le7/y;->f:Le7/a0;

    return-void
.end method


# virtual methods
.method public final a(Le7/j2;J)Le7/y;
    .locals 11

    new-instance v10, Le7/y;

    iget-object v2, p0, Le7/y;->c:Ljava/lang/String;

    iget-object v3, p0, Le7/y;->a:Ljava/lang/String;

    iget-object v4, p0, Le7/y;->b:Ljava/lang/String;

    iget-wide v5, p0, Le7/y;->d:J

    iget-object v9, p0, Le7/y;->f:Le7/a0;

    move-object v0, v10

    move-object v1, p1

    move-wide v7, p2

    invoke-direct/range {v0 .. v9}, Le7/y;-><init>(Le7/j2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLe7/a0;)V

    return-object v10
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Le7/y;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Le7/y;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Le7/y;->f:Le7/a0;

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v4, "Event{appId=\'"

    .line 14
    .line 15
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, "\', name=\'"

    .line 22
    .line 23
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, "\', params="

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, "}"

    .line 35
    .line 36
    invoke-static {v3, v2, v0}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
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
