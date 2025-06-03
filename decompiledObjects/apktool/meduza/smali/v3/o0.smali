.class public final Lv3/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/o0$h;,
        Lv3/o0$c;,
        Lv3/o0$b;,
        Lv3/o0$i;,
        Lv3/o0$j;,
        Lv3/o0$e;,
        Lv3/o0$g;,
        Lv3/o0$f;,
        Lv3/o0$d;,
        Lv3/o0$a;
    }
.end annotation


# static fields
.field public static final o:Lv3/o0;

.field public static final p:Ljava/lang/String;

.field public static final q:Ljava/lang/String;

.field public static final r:Ljava/lang/String;

.field public static final s:Ljava/lang/String;

.field public static final t:Ljava/lang/String;

.field public static final u:Le0/e;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lv3/o0$g;

.field public final c:Lv3/o0$e;

.field public final d:Lv3/p0;

.field public final e:Lv3/o0$c;

.field public final f:Lv3/o0$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv3/o0$a;

    invoke-direct {v0}, Lv3/o0$a;-><init>()V

    invoke-virtual {v0}, Lv3/o0$a;->a()Lv3/o0;

    move-result-object v0

    sput-object v0, Lv3/o0;->o:Lv3/o0;

    const/4 v0, 0x0

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/o0;->p:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/o0;->q:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv3/o0;->r:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lv3/o0;->s:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {v1}, Lv5/e0;->E(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lv3/o0;->t:Ljava/lang/String;

    new-instance v1, Le0/e;

    invoke-direct {v1, v0}, Le0/e;-><init>(I)V

    sput-object v1, Lv3/o0;->u:Le0/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lv3/o0$c;Lv3/o0$g;Lv3/o0$e;Lv3/p0;Lv3/o0$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/o0;->a:Ljava/lang/String;

    iput-object p3, p0, Lv3/o0;->b:Lv3/o0$g;

    iput-object p4, p0, Lv3/o0;->c:Lv3/o0$e;

    iput-object p5, p0, Lv3/o0;->d:Lv3/p0;

    iput-object p2, p0, Lv3/o0;->e:Lv3/o0$c;

    iput-object p6, p0, Lv3/o0;->f:Lv3/o0$h;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv3/o0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv3/o0;

    iget-object v1, p0, Lv3/o0;->a:Ljava/lang/String;

    iget-object v3, p1, Lv3/o0;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0;->e:Lv3/o0$c;

    iget-object v3, p1, Lv3/o0;->e:Lv3/o0$c;

    invoke-virtual {v1, v3}, Lv3/o0$b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0;->b:Lv3/o0$g;

    iget-object v3, p1, Lv3/o0;->b:Lv3/o0$g;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0;->c:Lv3/o0$e;

    iget-object v3, p1, Lv3/o0;->c:Lv3/o0$e;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0;->d:Lv3/p0;

    iget-object v3, p1, Lv3/o0;->d:Lv3/p0;

    invoke-static {v1, v3}, Lv5/e0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv3/o0;->f:Lv3/o0$h;

    iget-object p1, p1, Lv3/o0;->f:Lv3/o0$h;

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
    .locals 2

    iget-object v0, p0, Lv3/o0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0;->b:Lv3/o0$g;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lv3/o0$f;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0;->c:Lv3/o0$e;

    invoke-virtual {v1}, Lv3/o0$e;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lv3/o0;->e:Lv3/o0$c;

    invoke-virtual {v0}, Lv3/o0$b;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lv3/o0;->d:Lv3/p0;

    invoke-virtual {v1}, Lv3/p0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lv3/o0;->f:Lv3/o0$h;

    invoke-virtual {v0}, Lv3/o0$h;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
