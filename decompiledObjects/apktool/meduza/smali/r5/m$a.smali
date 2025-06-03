.class public Lr5/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr5/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:Z

.field public l:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public m:I

.field public n:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public o:I

.field public p:I

.field public q:I

.field public r:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public t:I

.field public u:I

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lz4/i0;",
            "Lr5/l;",
            ">;"
        }
    .end annotation
.end field

.field public z:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lr5/m$a;->a:I

    iput v0, p0, Lr5/m$a;->b:I

    iput v0, p0, Lr5/m$a;->c:I

    iput v0, p0, Lr5/m$a;->d:I

    iput v0, p0, Lr5/m$a;->i:I

    iput v0, p0, Lr5/m$a;->j:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lr5/m$a;->k:Z

    sget-object v1, Lo7/t;->b:Lo7/t$b;

    .line 1
    sget-object v1, Lo7/l0;->e:Lo7/l0;

    .line 2
    iput-object v1, p0, Lr5/m$a;->l:Lo7/t;

    const/4 v2, 0x0

    iput v2, p0, Lr5/m$a;->m:I

    iput-object v1, p0, Lr5/m$a;->n:Lo7/t;

    iput v2, p0, Lr5/m$a;->o:I

    iput v0, p0, Lr5/m$a;->p:I

    iput v0, p0, Lr5/m$a;->q:I

    iput-object v1, p0, Lr5/m$a;->r:Lo7/t;

    iput-object v1, p0, Lr5/m$a;->s:Lo7/t;

    iput v2, p0, Lr5/m$a;->t:I

    iput v2, p0, Lr5/m$a;->u:I

    iput-boolean v2, p0, Lr5/m$a;->v:Z

    iput-boolean v2, p0, Lr5/m$a;->w:Z

    iput-boolean v2, p0, Lr5/m$a;->x:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lr5/m$a;->y:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lr5/m$a;->z:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lr5/m;->O:Ljava/lang/String;

    .line 4
    sget-object v1, Lr5/m;->I:Lr5/m;

    iget v2, v1, Lr5/m;->a:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->a:I

    .line 5
    sget-object v0, Lr5/m;->P:Ljava/lang/String;

    .line 6
    iget v2, v1, Lr5/m;->b:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->b:I

    .line 7
    sget-object v0, Lr5/m;->Q:Ljava/lang/String;

    .line 8
    iget v2, v1, Lr5/m;->c:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->c:I

    .line 9
    sget-object v0, Lr5/m;->R:Ljava/lang/String;

    .line 10
    iget v2, v1, Lr5/m;->d:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->d:I

    .line 11
    sget-object v0, Lr5/m;->S:Ljava/lang/String;

    .line 12
    iget v2, v1, Lr5/m;->e:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->e:I

    .line 13
    sget-object v0, Lr5/m;->T:Ljava/lang/String;

    .line 14
    iget v2, v1, Lr5/m;->f:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->f:I

    .line 15
    sget-object v0, Lr5/m;->U:Ljava/lang/String;

    .line 16
    iget v2, v1, Lr5/m;->o:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->g:I

    .line 17
    sget-object v0, Lr5/m;->V:Ljava/lang/String;

    .line 18
    iget v2, v1, Lr5/m;->p:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->h:I

    .line 19
    sget-object v0, Lr5/m;->W:Ljava/lang/String;

    .line 20
    iget v2, v1, Lr5/m;->q:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->i:I

    .line 21
    sget-object v0, Lr5/m;->X:Ljava/lang/String;

    .line 22
    iget v2, v1, Lr5/m;->r:I

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->j:I

    .line 23
    sget-object v0, Lr5/m;->Y:Ljava/lang/String;

    .line 24
    iget-boolean v2, v1, Lr5/m;->s:Z

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lr5/m$a;->k:Z

    .line 25
    sget-object v0, Lr5/m;->Z:Ljava/lang/String;

    .line 26
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    invoke-static {v0}, Lo7/t;->q([Ljava/lang/Object;)Lo7/l0;

    move-result-object v0

    iput-object v0, p0, Lr5/m$a;->l:Lo7/t;

    .line 27
    sget-object v0, Lr5/m;->h0:Ljava/lang/String;

    .line 28
    iget v3, v1, Lr5/m;->u:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->m:I

    .line 29
    sget-object v0, Lr5/m;->J:Ljava/lang/String;

    .line 30
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v3

    :goto_1
    invoke-static {v0}, Lr5/m$a;->a([Ljava/lang/String;)Lo7/l0;

    move-result-object v0

    iput-object v0, p0, Lr5/m$a;->n:Lo7/t;

    .line 31
    sget-object v0, Lr5/m;->K:Ljava/lang/String;

    .line 32
    iget v3, v1, Lr5/m;->w:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->o:I

    .line 33
    sget-object v0, Lr5/m;->a0:Ljava/lang/String;

    .line 34
    iget v3, v1, Lr5/m;->x:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->p:I

    .line 35
    sget-object v0, Lr5/m;->b0:Ljava/lang/String;

    .line 36
    iget v3, v1, Lr5/m;->y:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->q:I

    .line 37
    sget-object v0, Lr5/m;->c0:Ljava/lang/String;

    .line 38
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v3

    :goto_2
    invoke-static {v0}, Lo7/t;->q([Ljava/lang/Object;)Lo7/l0;

    move-result-object v0

    iput-object v0, p0, Lr5/m$a;->r:Lo7/t;

    .line 39
    sget-object v0, Lr5/m;->L:Ljava/lang/String;

    .line 40
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/String;

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, v3

    :goto_3
    invoke-static {v0}, Lr5/m$a;->a([Ljava/lang/String;)Lo7/l0;

    move-result-object v0

    iput-object v0, p0, Lr5/m$a;->s:Lo7/t;

    .line 41
    sget-object v0, Lr5/m;->M:Ljava/lang/String;

    .line 42
    iget v3, v1, Lr5/m;->B:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->t:I

    .line 43
    sget-object v0, Lr5/m;->i0:Ljava/lang/String;

    .line 44
    iget v3, v1, Lr5/m;->C:I

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lr5/m$a;->u:I

    .line 45
    sget-object v0, Lr5/m;->N:Ljava/lang/String;

    .line 46
    iget-boolean v3, v1, Lr5/m;->D:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lr5/m$a;->v:Z

    .line 47
    sget-object v0, Lr5/m;->d0:Ljava/lang/String;

    .line 48
    iget-boolean v3, v1, Lr5/m;->E:Z

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lr5/m$a;->w:Z

    .line 49
    sget-object v0, Lr5/m;->e0:Ljava/lang/String;

    .line 50
    iget-boolean v1, v1, Lr5/m;->F:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lr5/m$a;->x:Z

    .line 51
    sget-object v0, Lr5/m;->f0:Ljava/lang/String;

    .line 52
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_4

    .line 53
    sget-object v0, Lo7/l0;->e:Lo7/l0;

    goto :goto_4

    .line 54
    :cond_4
    sget-object v1, Lr5/l;->e:Le0/d;

    invoke-static {v1, v0}, Lv5/b;->a(Lv3/g$a;Ljava/util/ArrayList;)Lo7/l0;

    move-result-object v0

    :goto_4
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lr5/m$a;->y:Ljava/util/HashMap;

    move v1, v2

    .line 55
    :goto_5
    iget v3, v0, Lo7/l0;->d:I

    if-ge v1, v3, :cond_5

    .line 56
    invoke-virtual {v0, v1}, Lo7/l0;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr5/l;

    iget-object v4, p0, Lr5/m$a;->y:Ljava/util/HashMap;

    iget-object v5, v3, Lr5/l;->a:Lz4/i0;

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 57
    :cond_5
    sget-object v0, Lr5/m;->g0:Ljava/lang/String;

    .line 58
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    new-array v0, v2, [I

    if-eqz p1, :cond_6

    goto :goto_6

    :cond_6
    move-object p1, v0

    :goto_6
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lr5/m$a;->z:Ljava/util/HashSet;

    array-length v0, p1

    :goto_7
    if-ge v2, v0, :cond_7

    aget v1, p1, v2

    iget-object v3, p0, Lr5/m$a;->z:Ljava/util/HashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_7
    return-void
.end method

.method public static a([Ljava/lang/String;)Lo7/l0;
    .locals 4

    .line 1
    sget-object v0, Lo7/t;->b:Lo7/t$b;

    .line 2
    .line 3
    new-instance v0, Lo7/t$a;

    .line 4
    .line 5
    invoke-direct {v0}, Lo7/t$a;-><init>()V

    .line 6
    .line 7
    .line 8
    array-length v1, p0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-object v3, p0, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v3}, Lv5/e0;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v0, v3}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Lo7/t$a;->e()Lo7/l0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
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


# virtual methods
.method public b(II)Lr5/m$a;
    .locals 0

    iput p1, p0, Lr5/m$a;->i:I

    iput p2, p0, Lr5/m$a;->j:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr5/m$a;->k:Z

    return-object p0
.end method
