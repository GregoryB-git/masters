.class public abstract Ld5/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld5/j$a;,
        Ld5/j$b;
    }
.end annotation


# instance fields
.field public final a:Lv3/i0;

.field public final b:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Ld5/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:J

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld5/e;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld5/e;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld5/e;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ld5/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lv3/i0;Lo7/t;Ld5/k;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lx6/b;->q(Z)V

    iput-object p1, p0, Ld5/j;->a:Lv3/i0;

    invoke-static {p2}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    move-result-object p1

    iput-object p1, p0, Ld5/j;->b:Lo7/t;

    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ld5/j;->d:Ljava/util/List;

    iput-object p5, p0, Ld5/j;->e:Ljava/util/List;

    iput-object p6, p0, Ld5/j;->f:Ljava/util/List;

    invoke-virtual {p3, p0}, Ld5/k;->a(Ld5/j;)Ld5/i;

    move-result-object p1

    iput-object p1, p0, Ld5/j;->o:Ld5/i;

    .line 2
    iget-wide v0, p3, Ld5/k;->c:J

    iget-wide v4, p3, Ld5/k;->b:J

    const-wide/32 v2, 0xf4240

    invoke-static/range {v0 .. v5}, Lv5/e0;->O(JJJ)J

    move-result-wide p1

    .line 3
    iput-wide p1, p0, Ld5/j;->c:J

    return-void
.end method


# virtual methods
.method public abstract c()Ljava/lang/String;
.end method

.method public abstract l()Lc5/c;
.end method

.method public abstract m()Ld5/i;
.end method
