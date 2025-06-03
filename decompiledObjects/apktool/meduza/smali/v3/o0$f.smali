.class public Lv3/o0$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/lang/String;

.field public final c:Lv3/o0$d;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly4/c;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/String;

.field public final f:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Lv3/o0$j;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;Lv3/o0$d;Ljava/util/List;Ljava/lang/String;Lo7/t;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/o0$f;->a:Landroid/net/Uri;

    iput-object p2, p0, Lv3/o0$f;->b:Ljava/lang/String;

    iput-object p3, p0, Lv3/o0$f;->c:Lv3/o0$d;

    iput-object p4, p0, Lv3/o0$f;->d:Ljava/util/List;

    iput-object p5, p0, Lv3/o0$f;->e:Ljava/lang/String;

    iput-object p6, p0, Lv3/o0$f;->f:Lo7/t;

    sget-object p1, Lo7/t;->b:Lo7/t$b;

    .line 2
    new-instance p1, Lo7/t$a;

    invoke-direct {p1}, Lo7/t$a;-><init>()V

    const/4 p2, 0x0

    .line 3
    :goto_0
    invoke-virtual {p6}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_0

    invoke-interface {p6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lv3/o0$j;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    new-instance p4, Lv3/o0$j$a;

    invoke-direct {p4, p3}, Lv3/o0$j$a;-><init>(Lv3/o0$j;)V

    .line 5
    new-instance p3, Lv3/o0$i;

    invoke-direct {p3, p4}, Lv3/o0$i;-><init>(Lv3/o0$j$a;)V

    .line 6
    invoke-virtual {p1, p3}, Lo7/t$a;->c(Ljava/lang/Object;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo7/t$a;->e()Lo7/l0;

    iput-object p7, p0, Lv3/o0$f;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv3/o0$f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv3/o0$f;

    iget-object v1, p0, Lv3/o0$f;->a:Landroid/net/Uri;

    iget-object v3, p1, Lv3/o0$f;->a:Landroid/net/Uri;

    invoke-virtual {v1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$f;->b:Ljava/lang/String;

    iget-object v3, p1, Lv3/o0$f;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$f;->c:Lv3/o0$d;

    iget-object v3, p1, Lv3/o0$f;->c:Lv3/o0$d;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v1, v1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$f;->d:Ljava/util/List;

    iget-object v3, p1, Lv3/o0$f;->d:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$f;->e:Ljava/lang/String;

    iget-object v3, p1, Lv3/o0$f;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$f;->f:Lo7/t;

    iget-object v3, p1, Lv3/o0$f;->f:Lo7/t;

    invoke-virtual {v1, v3}, Lo7/t;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0$f;->g:Ljava/lang/Object;

    iget-object p1, p1, Lv3/o0$f;->g:Ljava/lang/Object;

    invoke-static {v1, p1}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lv3/o0$f;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$f;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$f;->c:Lv3/o0$d;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lv3/o0$d;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$f;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lv3/o0$f;->e:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lv3/o0$f;->f:Lo7/t;

    invoke-virtual {v0}, Lo7/t;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0$f;->g:Ljava/lang/Object;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method
