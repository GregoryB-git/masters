.class public LV3/F$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/F;->d(LV3/k;Ld4/n;Ljava/util/List;Z)Ld4/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:LV3/k;

.field public final synthetic e:LV3/F;


# direct methods
.method public constructor <init>(LV3/F;ZLjava/util/List;LV3/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/F$a;->e:LV3/F;

    .line 2
    .line 3
    iput-boolean p2, p0, LV3/F$a;->b:Z

    .line 4
    .line 5
    iput-object p3, p0, LV3/F$a;->c:Ljava/util/List;

    .line 6
    .line 7
    iput-object p4, p0, LV3/F$a;->d:LV3/k;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LV3/B;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LV3/F$a;->b(LV3/B;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(LV3/B;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, LV3/B;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, LV3/F$a;->b:Z

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LV3/F$a;->c:Ljava/util/List;

    .line 12
    .line 13
    invoke-virtual {p1}, LV3/B;->d()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, LV3/B;->c()LV3/k;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, LV3/F$a;->d:LV3/k;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, LV3/k;->W(LV3/k;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, LV3/F$a;->d:LV3/k;

    .line 40
    .line 41
    invoke-virtual {p1}, LV3/B;->c()LV3/k;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, LV3/k;->W(LV3/k;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    :cond_1
    const/4 p1, 0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 p1, 0x0

    .line 54
    :goto_0
    return p1
.end method
